package com.voxme.googlesheetsapi.service;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface GoogleApiGateway {
    void copyTemplate() throws GeneralSecurityException, IOException;
}
