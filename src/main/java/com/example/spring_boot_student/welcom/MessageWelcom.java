package com.example.spring_boot_student.welcom;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MessageWelcom")
public class MessageWelcom implements Message {


    @Override
    public String text(String meesage) {
        return meesage +"welcom ...!";
    }
    @Override
    public String text() {
        return "welcom ...!";
    }
}
