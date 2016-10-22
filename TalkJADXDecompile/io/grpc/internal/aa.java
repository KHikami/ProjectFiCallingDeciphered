package io.grpc.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

public final class aa extends g {
    private int a;
    private final Queue<cm> b;

    public aa() {
        this.b = new ArrayDeque();
    }

    public /* synthetic */ cm c(int i) {
        return b(i);
    }

    public void a(cm cmVar) {
        if (cmVar instanceof aa) {
            aa aaVar = (aa) cmVar;
            while (!aaVar.b.isEmpty()) {
                this.b.add((cm) aaVar.b.remove());
            }
            this.a += aaVar.a;
            aaVar.a = 0;
            aaVar.close();
            return;
        }
        this.b.add(cmVar);
        this.a += cmVar.a();
    }

    public int a() {
        return this.a;
    }

    public int b() {
        ad abVar = new ab(this);
        a(abVar, 1);
        return abVar.e;
    }

    public void a(byte[] bArr, int i, int i2) {
        a(new ac(this, i, bArr), i2);
    }

    public aa b(int i) {
        a(i);
        this.a -= i;
        aa aaVar = new aa();
        while (i > 0) {
            cm cmVar = (cm) this.b.peek();
            if (cmVar.a() > i) {
                aaVar.a(cmVar.c(i));
                i = 0;
            } else {
                aaVar.a((cm) this.b.poll());
                i -= cmVar.a();
            }
        }
        return aaVar;
    }

    public void close() {
        while (!this.b.isEmpty()) {
            ((cm) this.b.remove()).close();
        }
    }

    private void a(ad adVar, int i) {
        a(i);
        while (i > 0 && !this.b.isEmpty()) {
            Object obj;
            cm cmVar = (cm) this.b.peek();
            int min = Math.min(i, cmVar.a());
            try {
                adVar.e = adVar.a(cmVar, min);
            } catch (IOException e) {
                adVar.f = e;
            }
            if (adVar.f != null) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                i -= min;
                this.a -= min;
                if (((cm) this.b.peek()).a() == 0) {
                    ((cm) this.b.remove()).close();
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
