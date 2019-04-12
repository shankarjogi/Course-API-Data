package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class CourseApiDataApllication {
 
    public static void main(String[] args)  {
        SpringApplication.run(CourseApiDataApllication.class, args);
    }
}
