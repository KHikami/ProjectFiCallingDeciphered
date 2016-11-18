package p000;

public final class ofc extends nyx<ofc> {
    private static volatile ofc[] f32613d;
    public String f32614a;
    public String[] f32615b;
    public ofb[] f32616c;

    public /* synthetic */ nzf m38043a(nyt nyt) {
        return m38040b(nyt);
    }

    public static ofc[] m38041d() {
        if (f32613d == null) {
            synchronized (nzc.f31309c) {
                if (f32613d == null) {
                    f32613d = new ofc[0];
                }
            }
        }
        return f32613d;
    }

    public ofc() {
        m38042g();
    }

    private ofc m38042g() {
        this.f32614a = null;
        this.f32615b = nzl.f31332f;
        this.f32616c = ofb.m38035d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38044a(nyu nyu) {
        int i = 0;
        nyu.m37170a(1, this.f32614a);
        if (this.f32615b != null && this.f32615b.length > 0) {
            for (String str : this.f32615b) {
                if (str != null) {
                    nyu.m37170a(2, str);
                }
            }
        }
        if (this.f32616c != null && this.f32616c.length > 0) {
            while (i < this.f32616c.length) {
                nzf nzf = this.f32616c[i];
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m38045b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.m37137b(1, this.f32614a);
        if (this.f32615b == null || this.f32615b.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f32615b) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f32616c != null && this.f32616c.length > 0) {
            while (i2 < this.f32616c.length) {
                nzf nzf = this.f32616c[i2];
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private ofc m38040b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32614a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    a = this.f32615b == null ? 0 : this.f32615b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32615b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32615b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f32616c == null) {
                        a = 0;
                    } else {
                        a = this.f32616c.length;
                    }
                    obj = new ofb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32616c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ofb();
                    nyt.m37101a(obj[a]);
                    this.f32616c = obj;
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
