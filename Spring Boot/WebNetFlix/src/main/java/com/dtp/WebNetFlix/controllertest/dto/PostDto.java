package com.dtp.WebNetFlix.controllertest.dto;
// user PostDto to get data from Client.
public class PostDto {
    Integer id;
    String title;
    String content;
    String username;

    public PostDto(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }
}
