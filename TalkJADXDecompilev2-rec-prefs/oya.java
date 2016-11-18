package p000;

public final class oya extends nyx<oya> {
    private static volatile oya[] f34569f;
    public float[] f34570a;
    public float[] f34571b;
    public float[] f34572c;
    public Integer f34573d;
    public Integer f34574e;

    public /* synthetic */ nzf m39863a(nyt nyt) {
        return m39860b(nyt);
    }

    public static oya[] m39861d() {
        if (f34569f == null) {
            synchronized (nzc.f31309c) {
                if (f34569f == null) {
                    f34569f = new oya[0];
                }
            }
        }
        return f34569f;
    }

    public oya() {
        m39862g();
    }

    private oya m39862g() {
        this.f34570a = nzl.f31329c;
        this.f34571b = nzl.f31329c;
        this.f34572c = nzl.f31329c;
        this.f34573d = null;
        this.f34574e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39864a(nyu nyu) {
        int i = 0;
        if (this.f34570a != null && this.f34570a.length > 0) {
            for (float a : this.f34570a) {
                nyu.m37167a(1, a);
            }
        }
        if (this.f34571b != null && this.f34571b.length > 0) {
            for (float a2 : this.f34571b) {
                nyu.m37167a(2, a2);
            }
        }
        if (this.f34572c != null && this.f34572c.length > 0) {
            while (i < this.f34572c.length) {
                nyu.m37167a(3, this.f34572c[i]);
                i++;
            }
        }
        if (this.f34573d != null) {
            nyu.m37168a(4, this.f34573d.intValue());
        }
        if (this.f34574e != null) {
            nyu.m37168a(5, this.f34574e.intValue());
        }
        super.a(nyu);
    }

    protected int m39865b() {
        int b = super.b();
        if (this.f34570a != null && this.f34570a.length > 0) {
            b = (b + (this.f34570a.length * 4)) + (this.f34570a.length * 1);
        }
        if (this.f34571b != null && this.f34571b.length > 0) {
            b = (b + (this.f34571b.length * 4)) + (this.f34571b.length * 1);
        }
        if (this.f34572c != null && this.f34572c.length > 0) {
            b = (b + (this.f34572c.length * 4)) + (this.f34572c.length * 1);
        }
        if (this.f34573d != null) {
            b += nyu.m37147f(4, this.f34573d.intValue());
        }
        if (this.f34574e != null) {
            return b + nyu.m37147f(5, this.f34574e.intValue());
        }
        return b;
    }

    private oya m39860b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f34570a == null ? 0 : this.f34570a.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34570a, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f34570a = obj;
                    nyt.m37111e(d);
                    continue;
                case 13:
                    d = nzl.m37265b(nyt, 13);
                    a = this.f34570a == null ? 0 : this.f34570a.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34570a, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f34570a = obj2;
                    continue;
                case wi.dH /*18*/:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f34571b == null ? 0 : this.f34571b.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34571b, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f34571b = obj;
                    nyt.m37111e(d);
                    continue;
                case 21:
                    d = nzl.m37265b(nyt, 21);
                    a = this.f34571b == null ? 0 : this.f34571b.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34571b, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f34571b = obj2;
                    continue;
                case wi.dx /*26*/:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f34572c == null ? 0 : this.f34572c.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34572c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f34572c = obj;
                    nyt.m37111e(d);
                    continue;
                case 29:
                    d = nzl.m37265b(nyt, 29);
                    a = this.f34572c == null ? 0 : this.f34572c.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34572c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f34572c = obj2;
                    continue;
                case 32:
                    this.f34573d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f34574e = Integer.valueOf(nyt.m37112f());
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
