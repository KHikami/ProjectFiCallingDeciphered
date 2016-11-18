package p000;

public final class oqc extends nyx<oqc> {
    public oso f33704a;
    public oqa[] f33705b;
    public osi f33706c;
    public oqu f33707d;
    public oos f33708e;
    public osd f33709f;
    public orc f33710g;
    public String f33711h;

    public /* synthetic */ nzf m39145a(nyt nyt) {
        return m39143b(nyt);
    }

    public oqc() {
        m39144d();
    }

    private oqc m39144d() {
        this.f33704a = null;
        this.f33705b = oqa.m39133d();
        this.f33706c = null;
        this.f33707d = null;
        this.f33708e = null;
        this.f33709f = null;
        this.f33710g = null;
        this.f33711h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39146a(nyu nyu) {
        if (this.f33705b != null && this.f33705b.length > 0) {
            for (nzf nzf : this.f33705b) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33706c != null) {
            nyu.m37182b(2, this.f33706c);
        }
        if (this.f33704a != null) {
            nyu.m37182b(3, this.f33704a);
        }
        if (this.f33707d != null) {
            nyu.m37182b(4, this.f33707d);
        }
        if (this.f33708e != null) {
            nyu.m37182b(5, this.f33708e);
        }
        if (this.f33709f != null) {
            nyu.m37182b(6, this.f33709f);
        }
        if (this.f33710g != null) {
            nyu.m37182b(7, this.f33710g);
        }
        if (this.f33711h != null) {
            nyu.m37170a(8, this.f33711h);
        }
        super.a(nyu);
    }

    protected int m39147b() {
        int b = super.b();
        if (this.f33705b != null && this.f33705b.length > 0) {
            for (nzf nzf : this.f33705b) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f33706c != null) {
            b += nyu.m37145d(2, this.f33706c);
        }
        if (this.f33704a != null) {
            b += nyu.m37145d(3, this.f33704a);
        }
        if (this.f33707d != null) {
            b += nyu.m37145d(4, this.f33707d);
        }
        if (this.f33708e != null) {
            b += nyu.m37145d(5, this.f33708e);
        }
        if (this.f33709f != null) {
            b += nyu.m37145d(6, this.f33709f);
        }
        if (this.f33710g != null) {
            b += nyu.m37145d(7, this.f33710g);
        }
        if (this.f33711h != null) {
            return b + nyu.m37137b(8, this.f33711h);
        }
        return b;
    }

    private oqc m39143b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33705b == null) {
                        a = 0;
                    } else {
                        a = this.f33705b.length;
                    }
                    Object obj = new oqa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33705b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqa();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqa();
                    nyt.m37101a(obj[a]);
                    this.f33705b = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f33706c == null) {
                        this.f33706c = new osi();
                    }
                    nyt.m37101a(this.f33706c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f33704a == null) {
                        this.f33704a = new oso();
                    }
                    nyt.m37101a(this.f33704a);
                    continue;
                case 34:
                    if (this.f33707d == null) {
                        this.f33707d = new oqu();
                    }
                    nyt.m37101a(this.f33707d);
                    continue;
                case 42:
                    if (this.f33708e == null) {
                        this.f33708e = new oos();
                    }
                    nyt.m37101a(this.f33708e);
                    continue;
                case 50:
                    if (this.f33709f == null) {
                        this.f33709f = new osd();
                    }
                    nyt.m37101a(this.f33709f);
                    continue;
                case 58:
                    if (this.f33710g == null) {
                        this.f33710g = new orc();
                    }
                    nyt.m37101a(this.f33710g);
                    continue;
                case 66:
                    this.f33711h = nyt.m37117j();
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
