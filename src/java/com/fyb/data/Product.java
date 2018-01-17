package com.fyb.data;

/**
 * \Date: 2018/1/17
 * \
 * \Description:
 * \
 */
public class Product {

    public Product(Long id, String tag, String name, String desc, String level, int price) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.desc = desc;
        this.level = level;
        this.price = price;
    }

    private Long id;

    /**
     * 标签
     */
    private String tag;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String desc;

    /**
     * 级别
     */
    private String level;

    /**
     * 价格：元
     */
    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
