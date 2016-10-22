package com.google.api.client.http;

import java.io.OutputStream;
import kgm;

public interface HttpContent extends kgm {
    long getLength();

    String getType();

    boolean retrySupported();

    void writeTo(OutputStream outputStream);
}
