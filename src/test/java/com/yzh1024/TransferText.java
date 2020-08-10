package com.yzh1024;

import com.yzh1024.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TransferText {

    @Autowired
    private IAccountService as;

    @Test
    public void textTransfer(){
        as.transfer("aaa","bbb",100F);
    }
}
