package defpackage;

import java.io.ByteArrayOutputStream;

final class aii {
    int a = 0;
    final /* synthetic */ aih b;
    private aij c = null;
    private aij d = null;

    aii(aih aih) {
        this.b = aih;
    }

    void a() {
        if (this.d != null) {
            throw new RuntimeException("BUG: Invalid newbuf() before copy()");
        }
        aij aij = new aij();
        aij.a = this.b.a;
        aij.b = this.b.b;
        aij.c = this.c;
        this.c = aij;
        this.a++;
        this.b.a = new ByteArrayOutputStream();
        this.b.b = 0;
    }

    void b() {
        ByteArrayOutputStream byteArrayOutputStream = this.b.a;
        int i = this.b.b;
        this.b.a = this.c.a;
        this.b.b = this.c.b;
        this.d = this.c;
        this.c = this.c.c;
        this.a--;
        this.d.a = byteArrayOutputStream;
        this.d.b = i;
    }

    void c() {
        this.b.a(this.d.a.toByteArray(), 0, this.d.b);
        this.d = null;
    }

    aik d() {
        aik aik = new aik(this.b);
        aik.a = this.b.b;
        aik.b = this.a;
        return aik;
    }
}
