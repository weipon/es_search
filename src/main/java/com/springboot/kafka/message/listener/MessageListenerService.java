package com.springboot.kafka.message.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

/**
* @author WeiPeng Li
*/
@Service
@SuppressWarnings("unchecked")
public class MessageListenerService {
	private static final Logger log = LoggerFactory.getLogger(MessageListenerService.class);
	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;
	public <T> List<T> parseJson(StringBuffer msgId, String message, Class<T> clazz) throws RuntimeException {
        try {
			Map<String, Object> messageMap = JSONObject.parseObject(message, HashMap.class);

            String uuid = (String) messageMap.get("uuid");
            if (uuid == null || uuid.isEmpty()) {
                log.error("Massage uuid is empty!");
            }
            msgId.append(uuid);

            Object list = messageMap.get("list");
            String dataStr = list == null ? "" : list.toString();
            return JSONObject.parseArray(dataStr, clazz);
        } catch (JSONException e) {
            log.error("消息UUID {}, JSON 转换异常 {}", msgId.toString(), e.getMessage());
            return new ArrayList<>();
        }
    }
	
    @KafkaListener(id = "os-order", topicPartitions = {@TopicPartition(topic = "templateTopic", partitions = "0")}, containerFactory = "kafkaListenerContainerFactory")
    public void orderMessageHandler(String message) {
        log.debug("order:{}", message);
        StringBuffer uuid = new StringBuffer();
     /*   List<OrderRecord> recordList = this.parseJson(uuid, message, OrderRecord.class);

        if (recordList.size() > 0) {
            for (OrderRecord orderRecord:recordList) {
            }
            try {
            } catch (Exception e) {
            }
        }*/
    }
	
    
	@Scheduled(cron = "0/5 * * * * ?")
	public void updateEesourcesMessage(){
		log.info("开始处理资源位数据 ");
		
		try {
			
			
			 kafkaTemplate.send("templateTopic",0, "wahaha11").addCallback(new ListenableFutureCallback<Object>() {
					@Override
					public void onFailure(Throwable e) {
						log.info("发送失败.");
						e.printStackTrace();
					
					}

					@Override 
					public void onSuccess(Object result) {
						log.info("发送成功.");
					}
				});
		} catch (Exception e1) {
			log.info("发送异常");
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		try {
			
			
			 kafkaTemplate.send("templateTopic",0, "wahaha12").addCallback(new ListenableFutureCallback<Object>() {
					@Override
					public void onFailure(Throwable e) {
						log.info("发送失败.");
						e.printStackTrace();
					
					}

					@Override 
					public void onSuccess(Object result) {
						log.info("发送成功.");
					}
				});
		} catch (Exception e1) {
			System.out.println("发送异常");
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
	}
}
