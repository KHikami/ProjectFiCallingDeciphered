package io.grpc.internal;

import a;
import java.util.concurrent.Executor;
import ojh;
import ojm;
import okw;
import olh;

abstract class bh implements ae {
    protected abstract ae d();

    bh() {
    }

    public Runnable a(cb cbVar) {
        return d().a(cbVar);
    }

    public void a() {
        d().a();
    }

    public x a(olh<?, ?> olh___, okw okw, ojm ojm) {
        return d().a(olh___, okw, ojm);
    }

    public void a(a aVar, Executor executor) {
        d().a(aVar, executor);
    }

    public String c() {
        return d().c();
    }

    public ojh b() {
        return d().b();
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(d().toString());
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append("[").append(valueOf2).append("]").toString();
    }
}
