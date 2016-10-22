package io.grpc.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

class cz {
    public ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor(bi.a("grpc-shared-destroyer-%d", true));
    }

    cz() {
    }
}
