package io.grpc.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

public final class u extends d {
    int a;
    private final Queue b;

    public u() {
        this.b = new ArrayDeque();
    }

    public final /* synthetic */ bs c(int i) {
        return b(i);
    }

    public final void a(bs bsVar) {
        if (bsVar instanceof u) {
            u uVar = (u) bsVar;
            while (!uVar.b.isEmpty()) {
                this.b.add((bs) uVar.b.remove());
            }
            this.a += uVar.a;
            uVar.a = 0;
            uVar.close();
            return;
        }
        this.b.add(bsVar);
        this.a += bsVar.a();
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        x vVar = new v(this);
        a(vVar, 1);
        return vVar.a;
    }

    public final void a(byte[] bArr, int i, int i2) {
        a(new w(this, i, bArr), i2);
    }

    public final u b(int i) {
        a(i);
        this.a -= i;
        u uVar = new u();
        while (i > 0) {
            bs bsVar = (bs) this.b.peek();
            if (bsVar.a() > i) {
                uVar.a(bsVar.c(i));
                i = 0;
            } else {
                uVar.a((bs) this.b.poll());
                i -= bsVar.a();
            }
        }
        return uVar;
    }

    public final void close() {
        while (!this.b.isEmpty()) {
            ((bs) this.b.remove()).close();
        }
    }

    private final void a(x xVar, int i) {
        a(i);
        while (i > 0 && !this.b.isEmpty()) {
            Object obj;
            bs bsVar = (bs) this.b.peek();
            int min = Math.min(i, bsVar.a());
            try {
                xVar.a = xVar.a(bsVar, min);
            } catch (IOException e) {
                xVar.b = e;
            }
            if (xVar.b != null) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                i -= min;
                this.a -= min;
                if (((bs) this.b.peek()).a() == 0) {
                    ((bs) this.b.remove()).close();
                }
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }
}
