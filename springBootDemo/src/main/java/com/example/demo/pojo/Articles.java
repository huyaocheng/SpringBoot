package com.example.demo.pojo;

/**
 * Created by Administrator on 2017/7/16.
 */

import lombok.ToString;

@ToString
public class Articles {
    private Long id;
    private String title;
    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
