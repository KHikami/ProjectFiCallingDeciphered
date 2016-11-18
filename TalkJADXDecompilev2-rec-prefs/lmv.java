package p000;

public final class lmv extends nyx<lmv> {
    public lmw[] f25694a;
    public Integer f25695b;
    public String f25696c;
    public String[] f25697d;
    public String f25698e;
    public Integer f25699f;
    public Integer f25700g;
    public Integer f25701h;
    public Integer f25702i;
    public Integer f25703j;
    public Integer f25704k;
    public Integer f25705l;
    public Integer f25706m;
    public String f25707n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29543b(nyt);
    }

    public lmv() {
        m29544d();
    }

    private lmv m29544d() {
        this.f25694a = lmw.m29549d();
        this.f25695b = null;
        this.f25696c = null;
        this.f25697d = nzl.f;
        this.f25698e = null;
        this.f25699f = null;
        this.f25700g = null;
        this.f25701h = null;
        this.f25702i = null;
        this.f25703j = null;
        this.f25704k = null;
        this.f25705l = null;
        this.f25706m = null;
        this.f25707n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25694a != null && this.f25694a.length > 0) {
            for (nzf nzf : this.f25694a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25696c != null) {
            nyu.a(2, this.f25696c);
        }
        if (this.f25697d != null && this.f25697d.length > 0) {
            while (i < this.f25697d.length) {
                String str = this.f25697d[i];
                if (str != null) {
                    nyu.a(3, str);
                }
                i++;
            }
        }
        if (this.f25698e != null) {
            nyu.a(4, this.f25698e);
        }
        if (this.f25699f != null) {
            nyu.a(5, this.f25699f.intValue());
        }
        if (this.f25700g != null) {
            nyu.a(6, this.f25700g.intValue());
        }
        if (this.f25701h != null) {
            nyu.a(7, this.f25701h.intValue());
        }
        if (this.f25702i != null) {
            nyu.a(8, this.f25702i.intValue());
        }
        if (this.f25703j != null) {
            nyu.a(9, this.f25703j.intValue());
        }
        if (this.f25704k != null) {
            nyu.a(10, this.f25704k.intValue());
        }
        if (this.f25705l != null) {
            nyu.a(11, this.f25705l.intValue());
        }
        if (this.f25706m != null) {
            nyu.a(12, this.f25706m.intValue());
        }
        if (this.f25707n != null) {
            nyu.a(13, this.f25707n);
        }
        if (this.f25695b != null) {
            nyu.a(14, this.f25695b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f25694a != null && this.f25694a.length > 0) {
            i = b;
            for (nzf nzf : this.f25694a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f25696c != null) {
            b += nyu.b(2, this.f25696c);
        }
        if (this.f25697d != null && this.f25697d.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f25697d.length) {
                String str = this.f25697d[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f25698e != null) {
            b += nyu.b(4, this.f25698e);
        }
        if (this.f25699f != null) {
            b += nyu.f(5, this.f25699f.intValue());
        }
        if (this.f25700g != null) {
            b += nyu.f(6, this.f25700g.intValue());
        }
        if (this.f25701h != null) {
            b += nyu.f(7, this.f25701h.intValue());
        }
        if (this.f25702i != null) {
            b += nyu.f(8, this.f25702i.intValue());
        }
        if (this.f25703j != null) {
            b += nyu.f(9, this.f25703j.intValue());
        }
        if (this.f25704k != null) {
            b += nyu.f(10, this.f25704k.intValue());
        }
        if (this.f25705l != null) {
            b += nyu.f(11, this.f25705l.intValue());
        }
        if (this.f25706m != null) {
            b += nyu.f(12, this.f25706m.intValue());
        }
        if (this.f25707n != null) {
            b += nyu.b(13, this.f25707n);
        }
        if (this.f25695b != null) {
            return b + nyu.f(14, this.f25695b.intValue());
        }
        return b;
    }

    private lmv m29543b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f25694a == null) {
                        a = 0;
                    } else {
                        a = this.f25694a.length;
                    }
                    obj = new lmw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25694a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmw();
                    nyt.a(obj[a]);
                    this.f25694a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f25696c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f25697d == null ? 0 : this.f25697d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25697d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25697d = obj;
                    continue;
                case 34:
                    this.f25698e = nyt.j();
                    continue;
                case 40:
                    this.f25699f = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f25700g = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.f25701h = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    this.f25702i = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    this.f25703j = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    this.f25704k = Integer.valueOf(nyt.f());
                    continue;
                case 88:
                    this.f25705l = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.f25706m = Integer.valueOf(nyt.f());
                    continue;
                case 106:
                    this.f25707n = nyt.j();
                    continue;
                case 112:
                    this.f25695b = Integer.valueOf(nyt.f());
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
