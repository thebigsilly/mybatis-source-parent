package org.fyh.mybatisspringsource.service;

import org.fyh.mybatisspringsource.entity.Person;
import org.fyh.mybatisspringsource.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonTransaction {
    private final PersonMapper personMapper;

    @Autowired
    public PersonTransaction(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Transactional
    public void queryDelete() {
        Person person = personMapper.selectOne(3);
        personMapper.delete(person);
    }
}
