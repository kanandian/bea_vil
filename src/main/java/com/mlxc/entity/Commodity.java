package com.mlxc.entity;

import javax.persistence.*;

@Entity
@Table(name="commodity")
public class Commodity {

    private long commodityId;
    private String commodityName;
    private double price;
    private long userid;
    private String imageURL;
    private String des;

    public Commodity() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
