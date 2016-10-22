package io.grpc.internal;

import dcv;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
final class as implements cd {
    as() {
    }

    public final /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }

    public final /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(new dcv().a(true).a("grpc-default-executor-%d").a());
    }
}
