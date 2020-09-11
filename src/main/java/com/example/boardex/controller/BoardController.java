package com.example.boardex.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
public class BoardController {
    @RequestMapping(value = "/board/register")
    public void registerForm() {
        log.info("registerForm");
        //반환형 String & return "board/register"; 와 같은 결과를 얻는다.
    }

    @RequestMapping("/board/modify")
    public void modifyForm() {
        log.info("modifyForm");
    }

    @RequestMapping("/board/list")
    public void list() {
        log.info("list");
    }


}
