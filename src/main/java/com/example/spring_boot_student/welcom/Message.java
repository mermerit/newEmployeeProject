package com.example.spring_boot_student.welcom;

import org.springframework.stereotype.Component;

@Component
public interface Message {

    public String text (String meesage);
    public String text();

}
