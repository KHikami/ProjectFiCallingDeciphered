package io.grpc.internal;

import dgx;

/* compiled from: PG */
final class ax implements dgx {
    ax() {
    }

    public final /* synthetic */ String a(Object obj) {
        return ((Integer) obj).toString();
    }

    public final /* synthetic */ Object a(String str) {
        return Integer.valueOf(Integer.parseInt(str.split(" ", 2)[0]));
    }
}
