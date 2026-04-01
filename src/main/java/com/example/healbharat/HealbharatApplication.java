package com.example.healbharat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealbharatApplication {
	public static void main(String[] args) {
		SpringApplication.run(HealbharatApplication.class, args);
	}
}
// 1st task
// mvn spring-boot:run on vs terminal
// http://localhost:8081/hello

// 2nd task
// mvn spring-boot:run on vs terminal
// on cms->mongosh
// use healbharat
/*
 * db.students.insertOne({
 * ... name: "devyani",
 * ... email: "devyani@gmail.com"
 * ... })
 */
// db.students.find()