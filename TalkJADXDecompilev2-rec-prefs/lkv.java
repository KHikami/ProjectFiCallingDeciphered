package p000;

public final class lkv extends nyx<lkv> {
    private static volatile lkv[] f25271e;
    public String f25272a;
    public String f25273b;
    public int[] f25274c;
    public int[] f25275d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29277b(nyt);
    }

    public static lkv[] m29278d() {
        if (f25271e == null) {
            synchronized (nzc.c) {
                if (f25271e == null) {
                    f25271e = new lkv[0];
                }
            }
        }
        return f25271e;
    }

    public lkv() {
        m29279g();
    }

    private lkv m29279g() {
        this.f25272a = null;
        this.f25273b = null;
        this.f25274c = nzl.a;
        this.f25275d = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25272a != null) {
            nyu.a(1, this.f25272a);
        }
        if (this.f25273b != null) {
            nyu.a(2, this.f25273b);
        }
        if (this.f25274c != null && this.f25274c.length > 0) {
            for (int b : this.f25274c) {
                nyu.b(3, b);
            }
        }
        if (this.f25275d != null && this.f25275d.length > 0) {
            while (i < this.f25275d.length) {
                nyu.b(4, this.f25275d[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25272a != null) {
            b += nyu.b(1, this.f25272a);
        }
        if (this.f25273b != null) {
            b += nyu.b(2, this.f25273b);
        }
        if (this.f25274c != null && this.f25274c.length > 0) {
            b = (b + (this.f25274c.length * 4)) + (this.f25274c.length * 1);
        }
        if (this.f25275d == null || this.f25275d.length <= 0) {
            return b;
        }
        return (b + (this.f25275d.length * 4)) + (this.f25275d.length * 1);
    }

    private lkv m29277b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25272a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25273b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.f25274c == null ? 0 : this.f25274c.length;
                    obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25274c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.f25274c = obj;
                    nyt.e(d);
                    continue;
                case 29:
                    d = nzl.b(nyt, 29);
                    a = this.f25274c == null ? 0 : this.f25274c.length;
                    obj2 = new int[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25274c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.f25274c = obj2;
                    continue;
                case 34:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.f25275d == null ? 0 : this.f25275d.length;
                    obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25275d, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.f25275d = obj;
                    nyt.e(d);
                    continue;
                case 37:
                    d = nzl.b(nyt, 37);
                    a = this.f25275d == null ? 0 : this.f25275d.length;
                    obj2 = new int[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25275d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.f25275d = obj2;
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
