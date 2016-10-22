package io.grpc.internal;

import a;
import java.util.concurrent.Executor;

final class ak {
    private final a a;
    private final Executor b;

    public ak(a aVar, Executor executor) {
        this.a = aVar;
        this.b = executor;
    }

    public void a(y yVar) {
        try {
            yVar.a(this.a, this.b);
        } catch (UnsupportedOperationException e) {
            this.b.execute(new al(this, e));
        }
    }
}
