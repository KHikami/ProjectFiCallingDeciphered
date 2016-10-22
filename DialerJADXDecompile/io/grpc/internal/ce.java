package io.grpc.internal;

import dcv;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
class ce {
    public ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor(new dcv().a(true).a("grpc-shared-destroyer-%d").a());
    }

    ce() {
    }
}
