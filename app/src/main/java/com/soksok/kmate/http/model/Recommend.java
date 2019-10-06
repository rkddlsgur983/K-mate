package com.soksok.kmate.http.model;

public class Recommend {
    private String classname;
    private int num;
    private String name;
    private String addr;
    private String tag;
    private String image;
    private String url;

    public Recommend(String classname, int num, String name, String addr, String tag, String image , String url) {
        this.classname = classname;
        this.num = num;
        this.name = name;
        this.addr = addr;
        this.tag = tag;
        this.image = image;
        this.url = url;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Recommend{" +
                "classname='" + classname + '\'' +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", tag='" + tag + '\'' +
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}