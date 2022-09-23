package com.example.crud_board.controller;

import com.example.crud_board.domain.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
public class PostController {
    @PostMapping("/posts")
//    public String post(@RequestParam String title, @RequestParam String content) {
    public String post(@RequestBody @Valid PostCreate params) {
//        log.info("title={}, content={}", title, content);
        log.info("params={}", params.toString());
        return "hello, world";
    }
}
