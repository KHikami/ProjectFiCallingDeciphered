package defpackage;

public class moc<T> {
    final Object[] a;
    final mon b;
    final StringBuilder c;
    int d;
    int e;
    int f;
    private mpf g;

    public void a(mpf mpf) {
        this.g = mpf;
    }

    public String a() {
        return this.g.a();
    }

    public moa b() {
        return this.g.b();
    }

    public void a(int i, int i2, mpz mpz) {
        Object obj;
        a(i);
        StringBuilder stringBuilder = this.c;
        Object[] objArr = this.a;
        mon mon = this.b;
        if (mpz.b < objArr.length) {
            obj = objArr[mpz.b];
            if (obj != null) {
                obj = mpz.a(obj, mon);
            } else {
                obj = null;
            }
        } else {
            obj = mon.a(mpz);
        }
        stringBuilder.append(obj);
        int i3 = mpz.b;
        this.e = Math.max(this.e, i3);
        if (i3 < 32) {
            this.f = (1 << i3) | this.f;
        }
        this.d = i2;
    }

    public /* synthetic */ T c() {
        return d();
    }

    public moc(Object[] objArr, mon mon, StringBuilder stringBuilder) {
        this();
        this.d = 0;
        this.e = -1;
        this.f = 0;
        this.a = objArr;
        this.b = mon;
        this.c = stringBuilder;
    }

    public StringBuilder d() {
        if (e()) {
            throw new mod(moe.e, null, null);
        }
        a(a().length());
        return this.c;
    }

    boolean e() {
        if (this.a.length > this.e + 1) {
            return true;
        }
        int length = this.a.length < 32 ? (1 << this.a.length) - 1 : -1;
        return (this.f & length) != length;
    }

    void a(int i) {
        switch (moq.a[b().ordinal()]) {
            case 1:
                mos.b(this.c, a(), this.d, i);
                return;
            case 2:
                mos.a(this.c, a(), this.d, i);
                return;
            default:
                throw new AssertionError();
        }
    }
}
