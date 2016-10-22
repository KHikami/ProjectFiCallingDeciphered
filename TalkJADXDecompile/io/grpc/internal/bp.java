package io.grpc.internal;

import java.util.HashSet;

abstract class bp<T> {
    private final HashSet<T> a;

    abstract Object b();

    abstract void c();

    abstract void d();

    bp() {
        this.a = new HashSet();
    }

    final void a(T t, boolean z) {
        synchronized (b()) {
            int size = this.a.size();
            if (z) {
                this.a.add(t);
                if (size == 0) {
                    c();
                }
            } else if (this.a.remove(t) && size == 1) {
                d();
            }
        }
    }

    final boolean a() {
        boolean z;
        synchronized (b()) {
            z = !this.a.isEmpty();
        }
        return z;
    }
}
