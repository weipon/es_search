package com.cassandra.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weipon on 17/5/9.
 */
public class TreeBuilder {
    @SuppressWarnings("unchecked")
    private List buildListToTree(List dirs) {
        List<TNode> roots = findRoots(dirs);
        List<TNode> notRoots = findNotRoots(dirs);
        for (TNode root : roots) {
            List<TNode> children= findChildren(root, notRoots);
            root.setChildren(children);
            if(children!=null&&children.size()>0){
                root.setLeaf(false);
            }else {
                root.setLeaf(true);
            }
        }
        return roots;
    }

    public List findRoots(List<TNode> allNodes) {
        List results = new ArrayList();
        for (TNode node : allNodes) {
            if (node.getLevel() == 1) {
                results.add(node);
            }
        }
        return results;
    }

    public List findNotRoots(List<TNode> allNodes) {
        List results = new ArrayList();
        for (TNode node : allNodes) {
            if (node.getLevel() == 1) {

            } else {
                results.add(node);
            }
        }
        return results;
    }

    @SuppressWarnings("unchecked")
    private List findChildren(TNode root, List<TNode> allNodes) {
        List<TNode> children = new ArrayList();
        for (TNode comparedOne : allNodes) {
            if (comparedOne.getParentId() == root.getId()) {
                children.add(comparedOne);
            }
        }
        for (TNode child : children) {
            List tmpChildren = findChildren(child, allNodes);
            if (tmpChildren == null || tmpChildren.size() < 1) {
                child.setLeaf(true);
            } else {
                child.setLeaf(false);
            }
            child.setChildren(tmpChildren);
        }
        return children;
    }

    public static void main(String[] args) {
        TreeBuilder tb = new TreeBuilder();
        List<TNode> allNodes = new ArrayList();
        allNodes.add(new TNode(1, 0, "节点1", 1));
        allNodes.add(new TNode(2, 0, "节点2", 1));
        allNodes.add(new TNode(3, 0, "节点3", 1));
        allNodes.add(new TNode(4, 1, "节点4", 2));
        allNodes.add(new TNode(5, 1, "节点5", 2));
        allNodes.add(new TNode(6, 1, "节点6", 2));
        allNodes.add(new TNode(7, 4, "节点7", 3));
        allNodes.add(new TNode(8, 4, "节点8", 3));
        allNodes.add(new TNode(9, 5, "节点9", 3));
        allNodes.add(new TNode(10, 9, "节点10", 4));
        List<TNode> roots = tb.buildListToTree(allNodes);
        for (TNode n : roots) {
            System.out.println(n);
        }

        System.out.print(JSON.toJSONString(roots));

    }
}
