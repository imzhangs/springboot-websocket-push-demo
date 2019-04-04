package com.example.websocket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.websocket.server.WebSocketServer;


@RestController
public class TestSendController {

	Logger log =LoggerFactory.getLogger(this.getClass());
	
    @RequestMapping("/sendMessage")
    public String greeting(String token,String message) throws Exception {
    	String result=WebSocketServer.sendMessageToUser(token, message);
        return result;
    }
}
