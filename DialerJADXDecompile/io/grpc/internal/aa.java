package io.grpc.internal;

import dhn;
import i;

/* compiled from: PG */
final class aa implements Runnable {
    private /* synthetic */ i a;

    aa(z zVar, i iVar) {
        this.a = iVar;
    }

    public final void run() {
        dhn.j.a("transport shutdown").c();
    }
}
