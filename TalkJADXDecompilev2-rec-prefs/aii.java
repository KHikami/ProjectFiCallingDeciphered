package p000;

import java.io.ByteArrayOutputStream;

final class aii {
    int f926a = 0;
    final /* synthetic */ aih f927b;
    private aij f928c = null;
    private aij f929d = null;

    aii(aih aih) {
        this.f927b = aih;
    }

    void m2490a() {
        if (this.f929d != null) {
            throw new RuntimeException("BUG: Invalid newbuf() before copy()");
        }
        aij aij = new aij();
        aij.f930a = this.f927b.f920a;
        aij.f931b = this.f927b.f921b;
        aij.f932c = this.f928c;
        this.f928c = aij;
        this.f926a++;
        this.f927b.f920a = new ByteArrayOutputStream();
        this.f927b.f921b = 0;
    }

    void m2491b() {
        ByteArrayOutputStream byteArrayOutputStream = this.f927b.f920a;
        int i = this.f927b.f921b;
        this.f927b.f920a = this.f928c.f930a;
        this.f927b.f921b = this.f928c.f931b;
        this.f929d = this.f928c;
        this.f928c = this.f928c.f932c;
        this.f926a--;
        this.f929d.f930a = byteArrayOutputStream;
        this.f929d.f931b = i;
    }

    void m2492c() {
        this.f927b.m2480a(this.f929d.f930a.toByteArray(), 0, this.f929d.f931b);
        this.f929d = null;
    }

    aik m2493d() {
        aik aik = new aik(this.f927b);
        aik.f933a = this.f927b.f921b;
        aik.f934b = this.f926a;
        return aik;
    }
}
