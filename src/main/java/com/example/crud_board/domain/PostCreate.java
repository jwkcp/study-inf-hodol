package com.example.crud_board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class PostCreate {
    @NotBlank
    public String title;

    @NotBlank
    public String content;

//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }

//    @Override
//    public String toString() {
//        return "PostCreate{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
