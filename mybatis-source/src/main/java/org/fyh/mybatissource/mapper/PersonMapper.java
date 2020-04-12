package org.fyh.mybatissource.mapper;

import org.fyh.mybatissource.entity.Person;

public interface PersonMapper {
    Person selectOne(Integer id);

    void insert(Person person);
}
