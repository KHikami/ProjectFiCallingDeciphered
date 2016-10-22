package io.grpc.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class bj implements cy<ExecutorService> {
    bj() {
    }

    public /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public String toString() {
        return "grpc-default-executor";
    }

    public /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(bi.a("grpc-default-executor-%d", true));
    }
}
