package com.cassandra.test;

public class RestaurantEntity {
    private Integer id;
    private String mobile;
    private String phone;
    private String contact_number;
    private String address_text;
    private String image_hash;
    private int city_id;
    private int saturn_province_id;
    private int saturn_city_id;
    private int saturn_district_id;
    private int busy_level;
    private int order_mode;
    private int is_valid;
    private int is_premium;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress_text() {
        return address_text;
    }

    public void setAddress_text(String address_text) {
        this.address_text = address_text;
    }

    public String getImage_hash() {
        return image_hash;
    }

    public void setImage_hash(String image_hash) {
        this.image_hash = image_hash;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getSaturn_province_id() {
        return saturn_province_id;
    }

    public void setSaturn_province_id(int saturn_province_id) {
        this.saturn_province_id = saturn_province_id;
    }

    public int getSaturn_city_id() {
        return saturn_city_id;
    }

    public void setSaturn_city_id(int saturn_city_id) {
        this.saturn_city_id = saturn_city_id;
    }

    public int getSaturn_district_id() {
        return saturn_district_id;
    }

    public void setSaturn_district_id(int saturn_district_id) {
        this.saturn_district_id = saturn_district_id;
    }

    public int getBusy_level() {
        return busy_level;
    }

    public void setBusy_level(int busy_level) {
        this.busy_level = busy_level;
    }

    public int getOrder_mode() {
        return order_mode;
    }

    public void setOrder_mode(int order_mode) {
        this.order_mode = order_mode;
    }

    public int getIs_valid() {
        return is_valid;
    }

    public void setIs_valid(int is_valid) {
        this.is_valid = is_valid;
    }

    public int getIs_premium() {
        return is_premium;
    }

    public void setIs_premium(int is_premium) {
        this.is_premium = is_premium;
    }
}