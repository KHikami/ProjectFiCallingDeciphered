package io.grpc.internal;

import java.net.SocketAddress;
import java.net.URI;
import ojh;
import olk;
import oll;

final class e extends oll {
    final SocketAddress b;
    final String c;

    e(SocketAddress socketAddress, String str) {
        this.b = socketAddress;
        this.c = str;
    }

    public olk a(URI uri, ojh ojh) {
        return new f(this);
    }

    public String a() {
        return "directaddress";
    }
}
