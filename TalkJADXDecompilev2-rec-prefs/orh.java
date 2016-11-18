package p000;

public final class orh extends nyx<orh> {
    private static volatile orh[] f33990r;
    public String f33991a;
    public String f33992b;
    public oqu f33993c;
    public String[] f33994d;
    public opg f33995e;
    public opg f33996f;
    public opg f33997g;
    public int[] f33998h;
    public Integer f33999i;
    public String f34000j;
    public String f34001k;
    public String f34002l;
    public Boolean f34003m;
    public String f34004n;
    public String f34005o;
    public String f34006p;
    public Boolean f34007q;

    public /* synthetic */ nzf m39419a(nyt nyt) {
        return m39416b(nyt);
    }

    public static orh[] m39417d() {
        if (f33990r == null) {
            synchronized (nzc.f31309c) {
                if (f33990r == null) {
                    f33990r = new orh[0];
                }
            }
        }
        return f33990r;
    }

    public orh() {
        m39418g();
    }

    private orh m39418g() {
        this.f33991a = null;
        this.f33992b = null;
        this.f33993c = null;
        this.f33994d = nzl.f31332f;
        this.f33995e = null;
        this.f33996f = null;
        this.f33997g = null;
        this.f33998h = nzl.f31327a;
        this.f33999i = null;
        this.f34000j = null;
        this.f34001k = null;
        this.f34002l = null;
        this.f34003m = null;
        this.f34004n = null;
        this.f34005o = null;
        this.f34006p = null;
        this.f34007q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39420a(nyu nyu) {
        int i = 0;
        if (this.f33991a != null) {
            nyu.m37170a(1, this.f33991a);
        }
        if (this.f33992b != null) {
            nyu.m37170a(2, this.f33992b);
        }
        if (this.f33993c != null) {
            nyu.m37182b(3, this.f33993c);
        }
        if (this.f33994d != null && this.f33994d.length > 0) {
            for (String str : this.f33994d) {
                if (str != null) {
                    nyu.m37170a(4, str);
                }
            }
        }
        if (this.f33995e != null) {
            nyu.m37182b(5, this.f33995e);
        }
        if (this.f33996f != null) {
            nyu.m37182b(6, this.f33996f);
        }
        if (this.f33997g != null) {
            nyu.m37182b(7, this.f33997g);
        }
        if (this.f33998h != null && this.f33998h.length > 0) {
            while (i < this.f33998h.length) {
                nyu.m37168a(8, this.f33998h[i]);
                i++;
            }
        }
        if (this.f33999i != null) {
            nyu.m37168a(9, this.f33999i.intValue());
        }
        if (this.f34000j != null) {
            nyu.m37170a(10, this.f34000j);
        }
        if (this.f34001k != null) {
            nyu.m37170a(11, this.f34001k);
        }
        if (this.f34002l != null) {
            nyu.m37170a(12, this.f34002l);
        }
        if (this.f34003m != null) {
            nyu.m37172a(13, this.f34003m.booleanValue());
        }
        if (this.f34004n != null) {
            nyu.m37170a(14, this.f34004n);
        }
        if (this.f34005o != null) {
            nyu.m37170a(15, this.f34005o);
        }
        if (this.f34006p != null) {
            nyu.m37170a(16, this.f34006p);
        }
        if (this.f34007q != null) {
            nyu.m37172a(17, this.f34007q.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39421b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f33991a != null) {
            b += nyu.m37137b(1, this.f33991a);
        }
        if (this.f33992b != null) {
            b += nyu.m37137b(2, this.f33992b);
        }
        if (this.f33993c != null) {
            b += nyu.m37145d(3, this.f33993c);
        }
        if (this.f33994d != null && this.f33994d.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f33994d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f33995e != null) {
            b += nyu.m37145d(5, this.f33995e);
        }
        if (this.f33996f != null) {
            b += nyu.m37145d(6, this.f33996f);
        }
        if (this.f33997g != null) {
            b += nyu.m37145d(7, this.f33997g);
        }
        if (this.f33998h != null && this.f33998h.length > 0) {
            i = 0;
            while (i2 < this.f33998h.length) {
                i += nyu.m37150g(this.f33998h[i2]);
                i2++;
            }
            b = (b + i) + (this.f33998h.length * 1);
        }
        if (this.f33999i != null) {
            b += nyu.m37147f(9, this.f33999i.intValue());
        }
        if (this.f34000j != null) {
            b += nyu.m37137b(10, this.f34000j);
        }
        if (this.f34001k != null) {
            b += nyu.m37137b(11, this.f34001k);
        }
        if (this.f34002l != null) {
            b += nyu.m37137b(12, this.f34002l);
        }
        if (this.f34003m != null) {
            this.f34003m.booleanValue();
            b += nyu.m37154h(13) + 1;
        }
        if (this.f34004n != null) {
            b += nyu.m37137b(14, this.f34004n);
        }
        if (this.f34005o != null) {
            b += nyu.m37137b(15, this.f34005o);
        }
        if (this.f34006p != null) {
            b += nyu.m37137b(16, this.f34006p);
        }
        if (this.f34007q == null) {
            return b;
        }
        this.f34007q.booleanValue();
        return b + (nyu.m37154h(17) + 1);
    }

    private orh m39416b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33991a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33992b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f33993c == null) {
                        this.f33993c = new oqu();
                    }
                    nyt.m37101a(this.f33993c);
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    a = this.f33994d == null ? 0 : this.f33994d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33994d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33994d = obj;
                    continue;
                case 42:
                    if (this.f33995e == null) {
                        this.f33995e = new opg();
                    }
                    nyt.m37101a(this.f33995e);
                    continue;
                case 50:
                    if (this.f33996f == null) {
                        this.f33996f = new opg();
                    }
                    nyt.m37101a(this.f33996f);
                    continue;
                case 58:
                    if (this.f33997g == null) {
                        this.f33997g = new opg();
                    }
                    nyt.m37101a(this.f33997g);
                    continue;
                case 64:
                    int b2 = nzl.m37265b(nyt, 64);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.m37099a();
                        }
                        int f = nyt.m37112f();
                        switch (f) {
                            case 0:
                            case 1:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f33998h == null ? 0 : this.f33998h.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f33998h, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f33998h = obj3;
                            break;
                        }
                        this.f33998h = obj2;
                        break;
                    }
                    continue;
                    break;
                case 66:
                    i = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
                            case 0:
                            case 1:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.m37113f(b);
                        if (this.f33998h == null) {
                            b = 0;
                        } else {
                            b = this.f33998h.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f33998h, 0, obj4, 0, b);
                        }
                        while (nyt.m37126s() > 0) {
                            int f2 = nyt.m37112f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f33998h = obj4;
                    }
                    nyt.m37111e(i);
                    continue;
                case 72:
                    this.f33999i = Integer.valueOf(nyt.m37112f());
                    continue;
                case 82:
                    this.f34000j = nyt.m37117j();
                    continue;
                case 90:
                    this.f34001k = nyt.m37117j();
                    continue;
                case 98:
                    this.f34002l = nyt.m37117j();
                    continue;
                case 104:
                    this.f34003m = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 114:
                    this.f34004n = nyt.m37117j();
                    continue;
                case 122:
                    this.f34005o = nyt.m37117j();
                    continue;
                case 130:
                    this.f34006p = nyt.m37117j();
                    continue;
                case 136:
                    this.f34007q = Boolean.valueOf(nyt.m37116i());
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
