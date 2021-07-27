package com.learning.kafka.api.controller;

import com.learning.kafka.api.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {


    @Autowired
    KafkaProducer kafkaProducer;


    @GetMapping(path = "/publishMesg")
    public String sendMessage(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return "Message Sent";
    }

}
