package p000;

public class moc<T> {
    final Object[] f27965a;
    final mon f27966b;
    final StringBuilder f27967c;
    int f27968d;
    int f27969e;
    int f27970f;
    private mpf f27971g;

    public void m32603a(mpf mpf) {
        this.f27971g = mpf;
    }

    public String m32600a() {
        return this.f27971g.m32651a();
    }

    public moa m32604b() {
        return this.f27971g.m32652b();
    }

    public void m32602a(int i, int i2, mpz mpz) {
        Object obj;
        m32601a(i);
        StringBuilder stringBuilder = this.f27967c;
        Object[] objArr = this.f27965a;
        mon mon = this.f27966b;
        if (mpz.f28058b < objArr.length) {
            obj = objArr[mpz.f28058b];
            if (obj != null) {
                obj = mpz.mo3910a(obj, mon);
            } else {
                obj = null;
            }
        } else {
            obj = mon.m32631a(mpz);
        }
        stringBuilder.append(obj);
        int i3 = mpz.f28058b;
        this.f27969e = Math.max(this.f27969e, i3);
        if (i3 < 32) {
            this.f27970f = (1 << i3) | this.f27970f;
        }
        this.f27968d = i2;
    }

    public /* synthetic */ T m32605c() {
        return m32606d();
    }

    public moc(Object[] objArr, mon mon, StringBuilder stringBuilder) {
        this();
        this.f27968d = 0;
        this.f27969e = -1;
        this.f27970f = 0;
        this.f27965a = objArr;
        this.f27966b = mon;
        this.f27967c = stringBuilder;
    }

    public StringBuilder m32606d() {
        if (m32607e()) {
            throw new mod(moe.f27979e, null, null);
        }
        m32601a(m32600a().length());
        return this.f27967c;
    }

    boolean m32607e() {
        if (this.f27965a.length > this.f27969e + 1) {
            return true;
        }
        int length = this.f27965a.length < 32 ? (1 << this.f27965a.length) - 1 : -1;
        return (this.f27970f & length) != length;
    }

    void m32601a(int i) {
        switch (moq.f28025a[m32604b().ordinal()]) {
            case 1:
                mos.m32639b(this.f27967c, m32600a(), this.f27968d, i);
                return;
            case 2:
                mos.m32638a(this.f27967c, m32600a(), this.f27968d, i);
                return;
            default:
                throw new AssertionError();
        }
    }
}
