package p000;

public final class lku extends nyx<lku> {
    private static volatile lku[] f25268c;
    public String f25269a;
    public int[] f25270b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29271b(nyt);
    }

    public static lku[] m29272d() {
        if (f25268c == null) {
            synchronized (nzc.c) {
                if (f25268c == null) {
                    f25268c = new lku[0];
                }
            }
        }
        return f25268c;
    }

    public lku() {
        m29273g();
    }

    private lku m29273g() {
        this.f25269a = null;
        this.f25270b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25269a != null) {
            nyu.a(62, this.f25269a);
        }
        if (this.f25270b != null && this.f25270b.length > 0) {
            for (int b : this.f25270b) {
                nyu.b(63, b);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25269a != null) {
            b += nyu.b(62, this.f25269a);
        }
        if (this.f25270b == null || this.f25270b.length <= 0) {
            return b;
        }
        return (b + (this.f25270b.length * 4)) + (this.f25270b.length * 2);
    }

    private lku m29271b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int d;
            switch (a) {
                case 0:
                    break;
                case 498:
                    this.f25269a = nyt.j();
                    continue;
                case 506:
                    a = nyt.r();
                    d = nyt.d(a);
                    int i = a / 4;
                    a = this.f25270b == null ? 0 : this.f25270b.length;
                    Object obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25270b, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.f25270b = obj;
                    nyt.e(d);
                    continue;
                case 509:
                    d = nzl.b(nyt, 509);
                    a = this.f25270b == null ? 0 : this.f25270b.length;
                    Object obj2 = new int[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25270b, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.f25270b = obj2;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
