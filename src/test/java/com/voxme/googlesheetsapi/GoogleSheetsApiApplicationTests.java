package com.voxme.googlesheetsapi;

import com.voxme.googlesheetsapi.service.GoogleApiGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleSheetsApiApplicationTests {

    @Autowired
    private GoogleApiGateway gateway;

    @Test
    public void test() throws GeneralSecurityException, IOException {
        gateway.copyTemplate();
    }
}
