package p000;

public final class ojc extends nyx<ojc> {
    private static volatile ojc[] f33062h;
    public String f33063a;
    public String f33064b;
    public String[] f33065c;
    public Integer f33066d;
    public String f33067e;
    public String f33068f;
    public String f33069g;

    public /* synthetic */ nzf m38537a(nyt nyt) {
        return m38534b(nyt);
    }

    public static ojc[] m38535d() {
        if (f33062h == null) {
            synchronized (nzc.f31309c) {
                if (f33062h == null) {
                    f33062h = new ojc[0];
                }
            }
        }
        return f33062h;
    }

    public ojc() {
        m38536g();
    }

    private ojc m38536g() {
        this.f33063a = null;
        this.f33064b = null;
        this.f33065c = nzl.f31332f;
        this.f33067e = null;
        this.f33068f = null;
        this.f33069g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38538a(nyu nyu) {
        if (this.f33063a != null) {
            nyu.m37170a(1, this.f33063a);
        }
        if (this.f33064b != null) {
            nyu.m37170a(2, this.f33064b);
        }
        if (this.f33065c != null && this.f33065c.length > 0) {
            for (String str : this.f33065c) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f33066d != null) {
            nyu.m37168a(4, this.f33066d.intValue());
        }
        if (this.f33067e != null) {
            nyu.m37170a(5, this.f33067e);
        }
        if (this.f33068f != null) {
            nyu.m37170a(6, this.f33068f);
        }
        if (this.f33069g != null) {
            nyu.m37170a(7, this.f33069g);
        }
        super.a(nyu);
    }

    protected int m38539b() {
        int i = 0;
        int b = super.b();
        if (this.f33063a != null) {
            b += nyu.m37137b(1, this.f33063a);
        }
        if (this.f33064b != null) {
            b += nyu.m37137b(2, this.f33064b);
        }
        if (this.f33065c != null && this.f33065c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f33065c.length) {
                String str = this.f33065c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f33066d != null) {
            b += nyu.m37147f(4, this.f33066d.intValue());
        }
        if (this.f33067e != null) {
            b += nyu.m37137b(5, this.f33067e);
        }
        if (this.f33068f != null) {
            b += nyu.m37137b(6, this.f33068f);
        }
        if (this.f33069g != null) {
            return b + nyu.m37137b(7, this.f33069g);
        }
        return b;
    }

    private ojc m38534b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33063a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33064b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    a = this.f33065c == null ? 0 : this.f33065c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33065c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33065c = obj;
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 3:
                            this.f33066d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f33067e = nyt.m37117j();
                    continue;
                case 50:
                    this.f33068f = nyt.m37117j();
                    continue;
                case 58:
                    this.f33069g = nyt.m37117j();
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
