package io.grpc.internal;

import java.nio.ByteBuffer;

public class dn {
    public dm a(int i) {
        return new dm(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
