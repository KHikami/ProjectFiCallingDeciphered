package p000;

public final class ohd extends nyx<ohd> {
    private static volatile ohd[] f32824s;
    public Long f32825a;
    public Long f32826b;
    public Boolean f32827c;
    public String f32828d;
    public String f32829e;
    public ohf f32830f;
    public Integer f32831g;
    public String f32832h;
    public String f32833i;
    public String f32834j;
    public String f32835k;
    public ohm[] f32836l;
    public String f32837m;
    public byte[] f32838n;
    public ogn f32839o;
    public String f32840p;
    public ohe f32841q;
    public ogs f32842r;

    public /* synthetic */ nzf m38323a(nyt nyt) {
        return m38321b(nyt);
    }

    public static ohd[] m38322d() {
        if (f32824s == null) {
            synchronized (nzc.f31309c) {
                if (f32824s == null) {
                    f32824s = new ohd[0];
                }
            }
        }
        return f32824s;
    }

    public ohd() {
        this.f32825a = null;
        this.f32826b = null;
        this.f32827c = null;
        this.f32828d = null;
        this.f32829e = null;
        this.f32831g = null;
        this.f32832h = null;
        this.f32833i = null;
        this.f32834j = null;
        this.f32835k = null;
        this.f32836l = ohm.m38362d();
        this.f32837m = null;
        this.f32838n = null;
        this.f32840p = null;
        this.cachedSize = -1;
    }

    public void m38324a(nyu nyu) {
        if (this.f32825a != null) {
            nyu.m37181b(1, this.f32825a.longValue());
        }
        if (this.f32826b != null) {
            nyu.m37181b(2, this.f32826b.longValue());
        }
        if (this.f32828d != null) {
            nyu.m37170a(3, this.f32828d);
        }
        if (this.f32829e != null) {
            nyu.m37170a(4, this.f32829e);
        }
        if (this.f32830f != null) {
            nyu.m37182b(5, this.f32830f);
        }
        if (this.f32832h != null) {
            nyu.m37170a(6, this.f32832h);
        }
        if (this.f32838n != null) {
            nyu.m37173a(7, this.f32838n);
        }
        if (this.f32839o != null) {
            nyu.m37182b(8, this.f32839o);
        }
        if (this.f32840p != null) {
            nyu.m37170a(9, this.f32840p);
        }
        if (this.f32836l != null && this.f32836l.length > 0) {
            for (nzf nzf : this.f32836l) {
                if (nzf != null) {
                    nyu.m37182b(10, nzf);
                }
            }
        }
        if (this.f32841q != null) {
            nyu.m37182b(11, this.f32841q);
        }
        if (this.f32837m != null) {
            nyu.m37170a(12, this.f32837m);
        }
        if (this.f32831g != null) {
            nyu.m37180b(13, this.f32831g.intValue());
        }
        if (this.f32827c != null) {
            nyu.m37172a(15, this.f32827c.booleanValue());
        }
        if (this.f32842r != null) {
            nyu.m37182b(16, this.f32842r);
        }
        if (this.f32833i != null) {
            nyu.m37170a(17, this.f32833i);
        }
        if (this.f32834j != null) {
            nyu.m37170a(19, this.f32834j);
        }
        if (this.f32835k != null) {
            nyu.m37170a(20, this.f32835k);
        }
        super.a(nyu);
    }

    protected int m38325b() {
        int b = super.b();
        if (this.f32825a != null) {
            b += nyu.m37148f(1, this.f32825a.longValue());
        }
        if (this.f32826b != null) {
            b += nyu.m37148f(2, this.f32826b.longValue());
        }
        if (this.f32828d != null) {
            b += nyu.m37137b(3, this.f32828d);
        }
        if (this.f32829e != null) {
            b += nyu.m37137b(4, this.f32829e);
        }
        if (this.f32830f != null) {
            b += nyu.m37145d(5, this.f32830f);
        }
        if (this.f32832h != null) {
            b += nyu.m37137b(6, this.f32832h);
        }
        if (this.f32838n != null) {
            b += nyu.m37139b(7, this.f32838n);
        }
        if (this.f32839o != null) {
            b += nyu.m37145d(8, this.f32839o);
        }
        if (this.f32840p != null) {
            b += nyu.m37137b(9, this.f32840p);
        }
        if (this.f32836l != null && this.f32836l.length > 0) {
            int i = b;
            for (nzf nzf : this.f32836l) {
                if (nzf != null) {
                    i += nyu.m37145d(10, nzf);
                }
            }
            b = i;
        }
        if (this.f32841q != null) {
            b += nyu.m37145d(11, this.f32841q);
        }
        if (this.f32837m != null) {
            b += nyu.m37137b(12, this.f32837m);
        }
        if (this.f32831g != null) {
            this.f32831g.intValue();
            b += nyu.m37154h(13) + 4;
        }
        if (this.f32827c != null) {
            this.f32827c.booleanValue();
            b += nyu.m37154h(15) + 1;
        }
        if (this.f32842r != null) {
            b += nyu.m37145d(16, this.f32842r);
        }
        if (this.f32833i != null) {
            b += nyu.m37137b(17, this.f32833i);
        }
        if (this.f32834j != null) {
            b += nyu.m37137b(19, this.f32834j);
        }
        if (this.f32835k != null) {
            return b + nyu.m37137b(20, this.f32835k);
        }
        return b;
    }

    private ohd m38321b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32825a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f32826b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    this.f32828d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32829e = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f32830f == null) {
                        this.f32830f = new ohf();
                    }
                    nyt.m37101a(this.f32830f);
                    continue;
                case 50:
                    this.f32832h = nyt.m37117j();
                    continue;
                case 58:
                    this.f32838n = nyt.m37118k();
                    continue;
                case 66:
                    if (this.f32839o == null) {
                        this.f32839o = new ogn();
                    }
                    nyt.m37101a(this.f32839o);
                    continue;
                case 74:
                    this.f32840p = nyt.m37117j();
                    continue;
                case 82:
                    int b = nzl.m37265b(nyt, 82);
                    if (this.f32836l == null) {
                        a = 0;
                    } else {
                        a = this.f32836l.length;
                    }
                    Object obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32836l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.m37101a(obj[a]);
                    this.f32836l = obj;
                    continue;
                case 90:
                    if (this.f32841q == null) {
                        this.f32841q = new ohe();
                    }
                    nyt.m37101a(this.f32841q);
                    continue;
                case 98:
                    this.f32837m = nyt.m37117j();
                    continue;
                case 109:
                    this.f32831g = Integer.valueOf(nyt.m37115h());
                    continue;
                case 120:
                    this.f32827c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 130:
                    if (this.f32842r == null) {
                        this.f32842r = new ogs();
                    }
                    nyt.m37101a(this.f32842r);
                    continue;
                case 138:
                    this.f32833i = nyt.m37117j();
                    continue;
                case 154:
                    this.f32834j = nyt.m37117j();
                    continue;
                case 162:
                    this.f32835k = nyt.m37117j();
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
