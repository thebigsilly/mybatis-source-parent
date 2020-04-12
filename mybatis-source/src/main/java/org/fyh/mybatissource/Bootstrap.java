package org.fyh.mybatissource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.fyh.mybatissource.entity.Person;
import org.fyh.mybatissource.mapper.PersonMapper;

import java.io.IOException;
import java.io.InputStream;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            PersonMapper personMapper = session.getMapper(PersonMapper.class);
            Person person = personMapper.selectOne(3);
            System.out.println(person);
        }
    }
}
