package defpackage;

import java.util.Collection;

/* renamed from: cuh */
final class cuh implements Runnable {
    private final Collection<lym> a;
    private final cug b;

    public cuh(cug cug, Collection<lym> collection) {
        this.b = cug;
        this.a = collection;
    }

    public void run() {
        this.b.a(this.a);
    }
}
