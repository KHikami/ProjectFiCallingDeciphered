package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;

public interface t extends Closeable {
    bg a(SocketAddress socketAddress, String str);
}
