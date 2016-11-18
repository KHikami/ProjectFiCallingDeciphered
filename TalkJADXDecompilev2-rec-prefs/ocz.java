package p000;

public final class ocz extends nyx<ocz> {
    public int f32341a;
    public Integer f32342b;
    public float[] f32343c;
    public float[] f32344d;
    public oda f32345e;

    public /* synthetic */ nzf m37813a(nyt nyt) {
        return m37812b(nyt);
    }

    public ocz() {
        this.f32341a = nzf.UNSET_ENUM_VALUE;
        this.f32342b = null;
        this.f32343c = nzl.f31329c;
        this.f32344d = nzl.f31329c;
        this.cachedSize = -1;
    }

    public void m37814a(nyu nyu) {
        int i = 0;
        if (this.f32341a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32341a);
        }
        if (this.f32342b != null) {
            nyu.m37168a(2, this.f32342b.intValue());
        }
        if (this.f32343c != null && this.f32343c.length > 0) {
            for (float a : this.f32343c) {
                nyu.m37167a(3, a);
            }
        }
        if (this.f32344d != null && this.f32344d.length > 0) {
            while (i < this.f32344d.length) {
                nyu.m37167a(4, this.f32344d[i]);
                i++;
            }
        }
        if (this.f32345e != null) {
            nyu.m37182b(5, this.f32345e);
        }
        super.a(nyu);
    }

    protected int m37815b() {
        int b = super.b();
        if (this.f32341a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32341a);
        }
        if (this.f32342b != null) {
            b += nyu.m37147f(2, this.f32342b.intValue());
        }
        if (this.f32343c != null && this.f32343c.length > 0) {
            b = (b + (this.f32343c.length * 4)) + (this.f32343c.length * 1);
        }
        if (this.f32344d != null && this.f32344d.length > 0) {
            b = (b + (this.f32344d.length * 4)) + (this.f32344d.length * 1);
        }
        if (this.f32345e != null) {
            return b + nyu.m37145d(5, this.f32345e);
        }
        return b;
    }

    private ocz m37812b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f32341a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f32342b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32343c == null ? 0 : this.f32343c.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32343c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32343c = obj;
                    nyt.m37111e(d);
                    continue;
                case 29:
                    d = nzl.m37265b(nyt, 29);
                    a = this.f32343c == null ? 0 : this.f32343c.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32343c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f32343c = obj2;
                    continue;
                case 34:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32344d == null ? 0 : this.f32344d.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32344d, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32344d = obj;
                    nyt.m37111e(d);
                    continue;
                case 37:
                    d = nzl.m37265b(nyt, 37);
                    a = this.f32344d == null ? 0 : this.f32344d.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32344d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f32344d = obj2;
                    continue;
                case 42:
                    if (this.f32345e == null) {
                        this.f32345e = new oda();
                    }
                    nyt.m37101a(this.f32345e);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
