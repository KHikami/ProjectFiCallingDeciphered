package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class mrp extends nyx<mrp> {
    public Integer f28190a;
    public Integer f28191b;
    public int[] f28192c;
    public Integer f28193d;
    public mrr f28194e;
    public mrr f28195f;
    public mrr f28196g;
    public String[] f28197h;
    public Boolean f28198i;
    public Long f28199j;
    public Integer f28200k;
    public Integer f28201l;
    public Integer f28202m;
    public long[] f28203n;
    public String f28204o;
    public mrs[] f28205p;
    public Boolean f28206q;
    public int[] f28207r;
    public Integer f28208s;
    public mrq f28209t;
    public String f28210u;
    public Integer f28211v;
    public Integer f28212w;
    public Integer f28213x;
    public Integer f28214y;
    public mrt[] f28215z;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32782b(nyt);
    }

    public mrp() {
        m32783d();
    }

    private mrp m32783d() {
        this.f28190a = null;
        this.f28191b = null;
        this.f28192c = nzl.a;
        this.f28193d = null;
        this.f28194e = null;
        this.f28195f = null;
        this.f28196g = null;
        this.f28197h = nzl.f;
        this.f28198i = null;
        this.f28199j = null;
        this.f28200k = null;
        this.f28201l = null;
        this.f28203n = nzl.b;
        this.f28204o = null;
        this.f28205p = mrs.m32798d();
        this.f28206q = null;
        this.f28207r = nzl.a;
        this.f28208s = null;
        this.f28209t = null;
        this.f28210u = null;
        this.f28211v = null;
        this.f28212w = null;
        this.f28213x = null;
        this.f28214y = null;
        this.f28215z = mrt.m32804d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f28190a != null) {
            nyu.b(1, this.f28190a.intValue());
        }
        if (this.f28191b != null) {
            nyu.a(2, this.f28191b.intValue());
        }
        if (this.f28192c != null && this.f28192c.length > 0) {
            for (int a : this.f28192c) {
                nyu.a(3, a);
            }
        }
        if (this.f28193d != null) {
            nyu.a(4, this.f28193d.intValue());
        }
        if (this.f28194e != null) {
            nyu.b(5, this.f28194e);
        }
        if (this.f28195f != null) {
            nyu.b(6, this.f28195f);
        }
        if (this.f28196g != null) {
            nyu.b(7, this.f28196g);
        }
        if (this.f28197h != null && this.f28197h.length > 0) {
            for (String str : this.f28197h) {
                if (str != null) {
                    nyu.a(8, str);
                }
            }
        }
        if (this.f28198i != null) {
            nyu.a(9, this.f28198i.booleanValue());
        }
        if (this.f28199j != null) {
            nyu.b(10, this.f28199j.longValue());
        }
        if (this.f28200k != null) {
            nyu.a(11, this.f28200k.intValue());
        }
        if (this.f28201l != null) {
            nyu.a(12, this.f28201l.intValue());
        }
        if (this.f28202m != null) {
            nyu.a(13, this.f28202m.intValue());
        }
        if (this.f28203n != null && this.f28203n.length > 0) {
            for (long b : this.f28203n) {
                nyu.b(14, b);
            }
        }
        if (this.f28204o != null) {
            nyu.a(15, this.f28204o);
        }
        if (this.f28205p != null && this.f28205p.length > 0) {
            for (nzf nzf : this.f28205p) {
                if (nzf != null) {
                    nyu.b(16, nzf);
                }
            }
        }
        if (this.f28206q != null) {
            nyu.a(17, this.f28206q.booleanValue());
        }
        if (this.f28207r != null && this.f28207r.length > 0) {
            for (int a2 : this.f28207r) {
                nyu.a(18, a2);
            }
        }
        if (this.f28208s != null) {
            nyu.a(19, this.f28208s.intValue());
        }
        if (this.f28209t != null) {
            nyu.b(20, this.f28209t);
        }
        if (this.f28210u != null) {
            nyu.a(21, this.f28210u);
        }
        if (this.f28211v != null) {
            nyu.a(22, this.f28211v.intValue());
        }
        if (this.f28212w != null) {
            nyu.a(23, this.f28212w.intValue());
        }
        if (this.f28213x != null) {
            nyu.a(24, this.f28213x.intValue());
        }
        if (this.f28214y != null) {
            nyu.a(25, this.f28214y.intValue());
        }
        if (this.f28215z != null && this.f28215z.length > 0) {
            while (i < this.f28215z.length) {
                nzf nzf2 = this.f28215z[i];
                if (nzf2 != null) {
                    nyu.b(26, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo147b();
        if (this.f28190a != null) {
            this.f28190a.intValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28191b != null) {
            b += nyu.f(2, this.f28191b.intValue());
        }
        if (this.f28192c != null && this.f28192c.length > 0) {
            i = 0;
            for (int g : this.f28192c) {
                int g2;
                i += nyu.g(g2);
            }
            b = (b + i) + (this.f28192c.length * 1);
        }
        if (this.f28193d != null) {
            b += nyu.f(4, this.f28193d.intValue());
        }
        if (this.f28194e != null) {
            b += nyu.d(5, this.f28194e);
        }
        if (this.f28195f != null) {
            b += nyu.d(6, this.f28195f);
        }
        if (this.f28196g != null) {
            b += nyu.d(7, this.f28196g);
        }
        if (this.f28197h != null && this.f28197h.length > 0) {
            i = 0;
            g2 = 0;
            for (String str : this.f28197h) {
                if (str != null) {
                    g2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (g2 * 1);
        }
        if (this.f28198i != null) {
            this.f28198i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f28199j != null) {
            b += nyu.f(10, this.f28199j.longValue());
        }
        if (this.f28200k != null) {
            b += nyu.f(11, this.f28200k.intValue());
        }
        if (this.f28201l != null) {
            b += nyu.f(12, this.f28201l.intValue());
        }
        if (this.f28202m != null) {
            b += nyu.f(13, this.f28202m.intValue());
        }
        if (this.f28203n != null && this.f28203n.length > 0) {
            i = 0;
            for (long f : this.f28203n) {
                i += nyu.f(f);
            }
            b = (b + i) + (this.f28203n.length * 1);
        }
        if (this.f28204o != null) {
            b += nyu.b(15, this.f28204o);
        }
        if (this.f28205p != null && this.f28205p.length > 0) {
            i2 = b;
            for (nzf nzf : this.f28205p) {
                if (nzf != null) {
                    i2 += nyu.d(16, nzf);
                }
            }
            b = i2;
        }
        if (this.f28206q != null) {
            this.f28206q.booleanValue();
            b += nyu.h(17) + 1;
        }
        if (this.f28207r != null && this.f28207r.length > 0) {
            i = 0;
            for (int g22 : this.f28207r) {
                i += nyu.g(g22);
            }
            b = (b + i) + (this.f28207r.length * 2);
        }
        if (this.f28208s != null) {
            b += nyu.f(19, this.f28208s.intValue());
        }
        if (this.f28209t != null) {
            b += nyu.d(20, this.f28209t);
        }
        if (this.f28210u != null) {
            b += nyu.b(21, this.f28210u);
        }
        if (this.f28211v != null) {
            b += nyu.f(22, this.f28211v.intValue());
        }
        if (this.f28212w != null) {
            b += nyu.f(23, this.f28212w.intValue());
        }
        if (this.f28213x != null) {
            b += nyu.f(24, this.f28213x.intValue());
        }
        if (this.f28214y != null) {
            b += nyu.f(25, this.f28214y.intValue());
        }
        if (this.f28215z != null && this.f28215z.length > 0) {
            while (i3 < this.f28215z.length) {
                nzf nzf2 = this.f28215z[i3];
                if (nzf2 != null) {
                    b += nyu.d(26, nzf2);
                }
                i3++;
            }
        }
        return b;
    }

    private mrp m32782b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28190a = Integer.valueOf(nyt.h());
                    continue;
                case 16:
                    this.f28191b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f28192c == null ? 0 : this.f28192c.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28192c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f28192c = obj;
                    continue;
                case wi.dx /*26*/:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f28192c == null ? 0 : this.f28192c.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28192c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f28192c = obj2;
                    nyt.e(d);
                    continue;
                case 32:
                    this.f28193d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    if (this.f28194e == null) {
                        this.f28194e = new mrr();
                    }
                    nyt.a(this.f28194e);
                    continue;
                case 50:
                    if (this.f28195f == null) {
                        this.f28195f = new mrr();
                    }
                    nyt.a(this.f28195f);
                    continue;
                case 58:
                    if (this.f28196g == null) {
                        this.f28196g = new mrr();
                    }
                    nyt.a(this.f28196g);
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    a = this.f28197h == null ? 0 : this.f28197h.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28197h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f28197h = obj;
                    continue;
                case 72:
                    this.f28198i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f28199j = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.f28200k = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.f28201l = Integer.valueOf(nyt.f());
                    continue;
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f28202m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 112:
                    b = nzl.b(nyt, 112);
                    a = this.f28203n == null ? 0 : this.f28203n.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28203n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f28203n = obj;
                    continue;
                case 114:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f28203n == null ? 0 : this.f28203n.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28203n, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f28203n = obj2;
                    nyt.e(d);
                    continue;
                case 122:
                    this.f28204o = nyt.j();
                    continue;
                case 130:
                    b = nzl.b(nyt, 130);
                    if (this.f28205p == null) {
                        a = 0;
                    } else {
                        a = this.f28205p.length;
                    }
                    obj = new mrs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28205p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mrs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mrs();
                    nyt.a(obj[a]);
                    this.f28205p = obj;
                    continue;
                case 136:
                    this.f28206q = Boolean.valueOf(nyt.i());
                    continue;
                case 144:
                    b = nzl.b(nyt, 144);
                    a = this.f28207r == null ? 0 : this.f28207r.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28207r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f28207r = obj;
                    continue;
                case 146:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f28207r == null ? 0 : this.f28207r.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28207r, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f28207r = obj2;
                    nyt.e(d);
                    continue;
                case 152:
                    this.f28208s = Integer.valueOf(nyt.f());
                    continue;
                case 162:
                    if (this.f28209t == null) {
                        this.f28209t = new mrq();
                    }
                    nyt.a(this.f28209t);
                    continue;
                case 170:
                    this.f28210u = nyt.j();
                    continue;
                case 176:
                    this.f28211v = Integer.valueOf(nyt.f());
                    continue;
                case 184:
                    this.f28212w = Integer.valueOf(nyt.f());
                    continue;
                case 192:
                    this.f28213x = Integer.valueOf(nyt.f());
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.f28214y = Integer.valueOf(nyt.f());
                    continue;
                case 210:
                    b = nzl.b(nyt, 210);
                    if (this.f28215z == null) {
                        a = 0;
                    } else {
                        a = this.f28215z.length;
                    }
                    obj = new mrt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28215z, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mrt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mrt();
                    nyt.a(obj[a]);
                    this.f28215z = obj;
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
