package p000;

public final class lxh extends nyx<lxh> {
    private static volatile lxh[] f26757o;
    public String f26758a;
    public String f26759b;
    public String f26760c;
    public Integer f26761d;
    public String f26762e;
    public String f26763f;
    public lxq f26764g;
    public Integer f26765h;
    public lxm f26766i;
    public lxk f26767j;
    public lxl f26768k;
    public lxn f26769l;
    public Integer f26770m;
    public String[] f26771n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30992b(nyt);
    }

    public static lxh[] m30993d() {
        if (f26757o == null) {
            synchronized (nzc.c) {
                if (f26757o == null) {
                    f26757o = new lxh[0];
                }
            }
        }
        return f26757o;
    }

    public lxh() {
        m30994g();
    }

    private lxh m30994g() {
        this.f26758a = null;
        this.f26759b = null;
        this.f26760c = null;
        this.f26762e = null;
        this.f26763f = null;
        this.f26764g = null;
        this.f26766i = null;
        this.f26767j = null;
        this.f26768k = null;
        this.f26769l = null;
        this.f26771n = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26758a != null) {
            nyu.a(1, this.f26758a);
        }
        if (this.f26759b != null) {
            nyu.a(2, this.f26759b);
        }
        if (this.f26760c != null) {
            nyu.a(3, this.f26760c);
        }
        if (this.f26761d != null) {
            nyu.a(4, this.f26761d.intValue());
        }
        if (this.f26763f != null) {
            nyu.a(5, this.f26763f);
        }
        if (this.f26764g != null) {
            nyu.b(6, this.f26764g);
        }
        if (this.f26765h != null) {
            nyu.a(7, this.f26765h.intValue());
        }
        if (this.f26766i != null) {
            nyu.b(8, this.f26766i);
        }
        if (this.f26767j != null) {
            nyu.b(9, this.f26767j);
        }
        if (this.f26762e != null) {
            nyu.a(10, this.f26762e);
        }
        if (this.f26768k != null) {
            nyu.b(11, this.f26768k);
        }
        if (this.f26769l != null) {
            nyu.b(12, this.f26769l);
        }
        if (this.f26770m != null) {
            nyu.a(13, this.f26770m.intValue());
        }
        if (this.f26771n != null && this.f26771n.length > 0) {
            for (String str : this.f26771n) {
                if (str != null) {
                    nyu.a(14, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26758a != null) {
            b += nyu.b(1, this.f26758a);
        }
        if (this.f26759b != null) {
            b += nyu.b(2, this.f26759b);
        }
        if (this.f26760c != null) {
            b += nyu.b(3, this.f26760c);
        }
        if (this.f26761d != null) {
            b += nyu.f(4, this.f26761d.intValue());
        }
        if (this.f26763f != null) {
            b += nyu.b(5, this.f26763f);
        }
        if (this.f26764g != null) {
            b += nyu.d(6, this.f26764g);
        }
        if (this.f26765h != null) {
            b += nyu.f(7, this.f26765h.intValue());
        }
        if (this.f26766i != null) {
            b += nyu.d(8, this.f26766i);
        }
        if (this.f26767j != null) {
            b += nyu.d(9, this.f26767j);
        }
        if (this.f26762e != null) {
            b += nyu.b(10, this.f26762e);
        }
        if (this.f26768k != null) {
            b += nyu.d(11, this.f26768k);
        }
        if (this.f26769l != null) {
            b += nyu.d(12, this.f26769l);
        }
        if (this.f26770m != null) {
            b += nyu.f(13, this.f26770m.intValue());
        }
        if (this.f26771n == null || this.f26771n.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26771n.length) {
            String str = this.f26771n[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lxh m30992b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26758a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26759b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26760c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26761d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f26763f = nyt.j();
                    continue;
                case 50:
                    if (this.f26764g == null) {
                        this.f26764g = new lxq();
                    }
                    nyt.a(this.f26764g);
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26765h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    if (this.f26766i == null) {
                        this.f26766i = new lxm();
                    }
                    nyt.a(this.f26766i);
                    continue;
                case 74:
                    if (this.f26767j == null) {
                        this.f26767j = new lxk();
                    }
                    nyt.a(this.f26767j);
                    continue;
                case 82:
                    this.f26762e = nyt.j();
                    continue;
                case 90:
                    if (this.f26768k == null) {
                        this.f26768k = new lxl();
                    }
                    nyt.a(this.f26768k);
                    continue;
                case 98:
                    if (this.f26769l == null) {
                        this.f26769l = new lxn();
                    }
                    nyt.a(this.f26769l);
                    continue;
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 8:
                            this.f26770m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 114:
                    int b = nzl.b(nyt, 114);
                    a = this.f26771n == null ? 0 : this.f26771n.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26771n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26771n = obj;
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
