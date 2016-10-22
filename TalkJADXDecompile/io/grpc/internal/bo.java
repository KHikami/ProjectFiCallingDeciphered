package io.grpc.internal;

import olc;

final class bo implements olc<Integer> {
    bo() {
    }

    public /* synthetic */ String a(Object obj) {
        return ((Integer) obj).toString();
    }

    public /* synthetic */ Object a(String str) {
        return Integer.valueOf(Integer.parseInt(str.split(" ", 2)[0]));
    }
}
