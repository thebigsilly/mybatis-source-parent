package org.fyh.mybatisspringsource.mapper;

import org.apache.ibatis.annotations.Delete;
import org.fyh.mybatisspringsource.entity.Person;

public interface PersonMapper {
    Person selectOne(Integer id);

    void insert(Person person);

    @Delete("delete from person where id=#{id}")
    void delete(Person person);
}
