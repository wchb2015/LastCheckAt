package com.lastcheckat.mapper;

import com.lastcheckat.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class LastCheckAtMapperTest {

    @Autowired
    private LastCheckAtMapper lastCheckAtMapper;

    @Test
    public void listLCA()
    {
        System.out.println(lastCheckAtMapper.listLCA());
    }

    @Test
    public void updateLastCheckAt()
    {
        lastCheckAtMapper.updateLastCheckAt(1L);
    }
}

