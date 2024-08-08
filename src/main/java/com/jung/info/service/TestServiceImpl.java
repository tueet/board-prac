package com.jung.info.service;

import com.jung.info.mapper.TestMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {
    private TestMapper testMapper;

    @Override
    public Date now() {
        return testMapper.now();
    }

    @Override
    public String stringTest() {
        return testMapper.stringTest();
    }
}
