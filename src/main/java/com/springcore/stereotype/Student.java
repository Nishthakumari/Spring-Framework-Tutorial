package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {

    @Value("Nishtha Kumari")
    private String studentName;

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    @Value("Delhi")
    private String city;

    @Value("#{temp}")
    private List<String> addresses;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
