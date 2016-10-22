package io.grpc.internal;

import java.io.Closeable;

public interface cm extends Closeable {
    int a();

    void a(byte[] bArr, int i, int i2);

    int b();

    cm c(int i);

    void close();
}
