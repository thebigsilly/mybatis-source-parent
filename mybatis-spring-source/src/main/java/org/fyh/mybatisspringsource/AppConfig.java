package org.fyh.mybatisspringsource;

import org.fyh.mybatisspringsource.entity.Person;
import org.fyh.mybatisspringsource.mapper.PersonMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;


@Configuration
@ComponentScan(value = "org.fyh.mybatisspringsource", includeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Configuration.class, Service.class})})
public class AppConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonMapper personMapper = (PersonMapper) applicationContext.getBean("personMapper");
        Person person = personMapper.selectOne(3);
        System.out.println(person);
    }
}
