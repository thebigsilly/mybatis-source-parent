package org.fyh.mybatissource.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.fyh.mybatissource.entity.Person;

public interface PersonMapper {
    Person selectOne(Integer id);
}
