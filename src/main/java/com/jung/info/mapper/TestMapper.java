package com.jung.info.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface TestMapper {
    Date now();
    String stringTest();
}
