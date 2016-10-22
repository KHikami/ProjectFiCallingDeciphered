package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: arp */
public class arp {
    public final Object a;
    final int b;
    final AtomicInteger c;

    public Object a() {
        return this.a;
    }

    public boolean b() {
        return this.b != this.c.get();
    }

    public arp(Object obj, AtomicInteger atomicInteger) {
        this.a = obj;
        this.c = atomicInteger;
        this.b = this.c.get();
    }
}
