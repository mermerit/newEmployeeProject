package com.example.spring_boot_student.welcom;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Upusercase")
public class Upercase implements Message{
    @Override
    public String text(String meesage) {
        return meesage.toUpperCase() ;
    }

    @Override
    public String text() {
        return null;
    }
}
