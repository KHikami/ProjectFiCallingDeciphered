package p000;

public final class onb extends nyx<onb> {
    public String f33263a;
    public String f33264b;
    public String[] f33265c;
    public float[] f33266d;
    public float[] f33267e;
    public Boolean f33268f;
    public Boolean f33269g;

    public /* synthetic */ nzf m38782a(nyt nyt) {
        return m38780b(nyt);
    }

    public onb() {
        m38781d();
    }

    private onb m38781d() {
        this.f33263a = null;
        this.f33264b = null;
        this.f33265c = nzl.f31332f;
        this.f33266d = nzl.f31329c;
        this.f33267e = nzl.f31329c;
        this.f33268f = null;
        this.f33269g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38783a(nyu nyu) {
        int i = 0;
        if (this.f33263a != null) {
            nyu.m37170a(1, this.f33263a);
        }
        if (this.f33264b != null) {
            nyu.m37170a(2, this.f33264b);
        }
        if (this.f33265c != null && this.f33265c.length > 0) {
            for (String str : this.f33265c) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f33266d != null && this.f33266d.length > 0) {
            for (float a : this.f33266d) {
                nyu.m37167a(4, a);
            }
        }
        if (this.f33267e != null && this.f33267e.length > 0) {
            while (i < this.f33267e.length) {
                nyu.m37167a(5, this.f33267e[i]);
                i++;
            }
        }
        if (this.f33268f != null) {
            nyu.m37172a(6, this.f33268f.booleanValue());
        }
        if (this.f33269g != null) {
            nyu.m37172a(7, this.f33269g.booleanValue());
        }
        super.a(nyu);
    }

    protected int m38784b() {
        int i = 0;
        int b = super.b();
        if (this.f33263a != null) {
            b += nyu.m37137b(1, this.f33263a);
        }
        if (this.f33264b != null) {
            b += nyu.m37137b(2, this.f33264b);
        }
        if (this.f33265c != null && this.f33265c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f33265c.length) {
                String str = this.f33265c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f33266d != null && this.f33266d.length > 0) {
            b = (b + (this.f33266d.length * 4)) + (this.f33266d.length * 1);
        }
        if (this.f33267e != null && this.f33267e.length > 0) {
            b = (b + (this.f33267e.length * 4)) + (this.f33267e.length * 1);
        }
        if (this.f33268f != null) {
            this.f33268f.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f33269g == null) {
            return b;
        }
        this.f33269g.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private onb m38780b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            int i;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33263a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33264b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    a = this.f33265c == null ? 0 : this.f33265c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33265c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33265c = obj;
                    continue;
                case 34:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f33266d == null ? 0 : this.f33266d.length;
                    obj2 = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33266d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = nyt.m37106c();
                        a++;
                    }
                    this.f33266d = obj2;
                    nyt.m37111e(b);
                    continue;
                case 37:
                    b = nzl.m37265b(nyt, 37);
                    a = this.f33266d == null ? 0 : this.f33266d.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33266d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37106c();
                    this.f33266d = obj;
                    continue;
                case 42:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f33267e == null ? 0 : this.f33267e.length;
                    obj2 = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33267e, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = nyt.m37106c();
                        a++;
                    }
                    this.f33267e = obj2;
                    nyt.m37111e(b);
                    continue;
                case 45:
                    b = nzl.m37265b(nyt, 45);
                    a = this.f33267e == null ? 0 : this.f33267e.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33267e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37106c();
                    this.f33267e = obj;
                    continue;
                case 48:
                    this.f33268f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f33269g = Boolean.valueOf(nyt.m37116i());
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
