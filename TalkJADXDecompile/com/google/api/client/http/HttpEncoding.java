package com.google.api.client.http;

import java.io.OutputStream;
import kgm;

public interface HttpEncoding {
    void encode(kgm kgm, OutputStream outputStream);

    String getName();
}
