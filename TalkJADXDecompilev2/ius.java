package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

public final class ius {
    final CopyOnWriteArrayList<iuq> a;
    final lo<iuq, Boolean> b;
    int c;
    long d;
    boolean e;
    private final iui f = iui.a();
    private boolean g;
    private final iur h = new iut(this);
    private final iuk i = new iuu(this);

    public ius(iuq... iuqArr) {
        this.a = new CopyOnWriteArrayList(iuqArr);
        this.b = new lo(iuqArr.length);
        this.c = iuqArr.length;
        for (int i = 0; i < iuqArr.length; i++) {
            iuqArr[i].a(this.h);
            this.b.put(iuqArr[i], Boolean.valueOf(true));
        }
    }

    public void a() {
        if (!this.g) {
            this.g = true;
            this.d = -1;
            c();
        }
    }

    public void b() {
        if (this.g) {
            if (this.e) {
                this.e = false;
                this.f.b(this.i);
            }
            this.g = false;
        }
    }

    void c() {
        if (!this.e && this.g && this.c != 0) {
            this.e = true;
            this.f.a(this.i);
        }
    }
}