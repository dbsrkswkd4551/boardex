package com.example.boardex.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

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


    //경로패턴 매핑
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

    //Http 메서드 매핑
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        log.info("registerForm");

        return "success";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register() {
        log.info("register");

        return "success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String modifyForm() {
        log.info("modifyForm");

        return "success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify() {
        log.info("register");

        return "success";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        log.info("list");

        return "success";
    }

    @RequestMapping(value = "/formHome", method = RequestMethod.POST)
    public String formHome() {

        return "formHome";
    }

     */


    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "register")
    public String registerForm() {
        log.info("registerForm");

        return "board/register";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, params = "register")
    public String register(){
        log.info("register");

        return "board/list";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "modify")
    public String modifyForm(){
        log.info("modifyForm");

        return "board/modify";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, params = "modify")
    public String modify(){
        log.info("modify");

        return "board/list";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "remove")
    public String removeForm(){
        log.info("removeForm");

        return "board/remove";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, params = "remove")
    public String remove(){
        log.info("remove");

        return "board/list";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, params = "read")
    public String read(){
        log.info("read");

        return "board/read";
    }
}
