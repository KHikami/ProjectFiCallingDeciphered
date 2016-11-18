package p000;

public final class oda extends nyx<oda> {
    public String f32346a;
    public String f32347b;
    public String[] f32348c;
    public float[] f32349d;
    public float[] f32350e;
    public Boolean f32351f;
    public Boolean f32352g;

    public /* synthetic */ nzf m37817a(nyt nyt) {
        return m37816b(nyt);
    }

    public oda() {
        this.f32346a = null;
        this.f32347b = null;
        this.f32348c = nzl.f31332f;
        this.f32349d = nzl.f31329c;
        this.f32350e = nzl.f31329c;
        this.f32351f = null;
        this.f32352g = null;
        this.cachedSize = -1;
    }

    public void m37818a(nyu nyu) {
        int i = 0;
        if (this.f32346a != null) {
            nyu.m37170a(1, this.f32346a);
        }
        if (this.f32347b != null) {
            nyu.m37170a(2, this.f32347b);
        }
        if (this.f32348c != null && this.f32348c.length > 0) {
            for (String str : this.f32348c) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f32349d != null && this.f32349d.length > 0) {
            for (float a : this.f32349d) {
                nyu.m37167a(4, a);
            }
        }
        if (this.f32350e != null && this.f32350e.length > 0) {
            while (i < this.f32350e.length) {
                nyu.m37167a(5, this.f32350e[i]);
                i++;
            }
        }
        if (this.f32351f != null) {
            nyu.m37172a(6, this.f32351f.booleanValue());
        }
        if (this.f32352g != null) {
            nyu.m37172a(7, this.f32352g.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37819b() {
        int i = 0;
        int b = super.b();
        if (this.f32346a != null) {
            b += nyu.m37137b(1, this.f32346a);
        }
        if (this.f32347b != null) {
            b += nyu.m37137b(2, this.f32347b);
        }
        if (this.f32348c != null && this.f32348c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f32348c.length) {
                String str = this.f32348c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f32349d != null && this.f32349d.length > 0) {
            b = (b + (this.f32349d.length * 4)) + (this.f32349d.length * 1);
        }
        if (this.f32350e != null && this.f32350e.length > 0) {
            b = (b + (this.f32350e.length * 4)) + (this.f32350e.length * 1);
        }
        if (this.f32351f != null) {
            this.f32351f.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f32352g == null) {
            return b;
        }
        this.f32352g.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private oda m37816b(nyt nyt) {
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
                    this.f32346a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32347b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    a = this.f32348c == null ? 0 : this.f32348c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32348c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32348c = obj;
                    continue;
                case 34:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32349d == null ? 0 : this.f32349d.length;
                    obj2 = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32349d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32349d = obj2;
                    nyt.m37111e(b);
                    continue;
                case 37:
                    b = nzl.m37265b(nyt, 37);
                    a = this.f32349d == null ? 0 : this.f32349d.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32349d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37106c();
                    this.f32349d = obj;
                    continue;
                case 42:
                    a = nyt.m37125r();
                    b = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32350e == null ? 0 : this.f32350e.length;
                    obj2 = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32350e, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32350e = obj2;
                    nyt.m37111e(b);
                    continue;
                case 45:
                    b = nzl.m37265b(nyt, 45);
                    a = this.f32350e == null ? 0 : this.f32350e.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32350e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37106c();
                    this.f32350e = obj;
                    continue;
                case 48:
                    this.f32351f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f32352g = Boolean.valueOf(nyt.m37116i());
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
