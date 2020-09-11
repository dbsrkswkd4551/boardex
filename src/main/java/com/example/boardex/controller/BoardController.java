package com.example.boardex.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
    //요청 경로 매핑
    /*
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
     */

    @RequestMapping("/register")
    public void registerForm() {
        log.info("registerForm");
    }

    @RequestMapping("/modify")
    public void modifyForm() {
        log.info("modifyForm");
    }

    @RequestMapping("/list")
    public void list() {
        log.info("list");
    }


    @RequestMapping("/read/{boardNo}")
    public String read(@PathVariable("boardNo")int boardNo){
        log.info("read boardNo:" + boardNo);

        return "board/read";
    }

    @RequestMapping("/read2/{no}")
    public String read2(@PathVariable("no")int boardNo) {
        log.info("read2 boardNo:" + boardNo);

        return "board/read";
    }



}
