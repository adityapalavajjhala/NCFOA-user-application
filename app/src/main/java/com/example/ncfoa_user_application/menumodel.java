package com.example.ncfoa_user_application;

public class menumodel {
    String dname,desc,price,purl;
    menumodel()
    {

    }

    public menumodel(String dname, String desc, String price, String purl) {
        this.dname = dname;
        this.desc = desc;
        this.price = price;
        this.purl = purl;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
