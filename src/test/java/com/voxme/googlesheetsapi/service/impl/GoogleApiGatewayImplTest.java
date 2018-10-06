package com.voxme.googlesheetsapi.service.impl;

import com.voxme.googlesheetsapi.service.GoogleApiGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class GoogleApiGatewayImplTest {

//    @Autowired
//    private GoogleApiGateway gateway;

    @Test
    public void test() throws GeneralSecurityException, IOException {
        GoogleApiGateway gateway = new GoogleApiGatewayImpl();
        gateway.copyTemplate();
    }
}