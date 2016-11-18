package p000;

public final class ors extends nyx<ors> {
    public oqz[] f34066a;
    public oqu f34067b;
    public oqu f34068c;
    public Integer f34069d;
    public Integer f34070e;
    public Integer f34071f;
    public osd f34072g;
    public orc f34073h;

    public /* synthetic */ nzf m39478a(nyt nyt) {
        return m39476b(nyt);
    }

    public ors() {
        m39477d();
    }

    private ors m39477d() {
        this.f34066a = oqz.m39269d();
        this.f34067b = null;
        this.f34068c = null;
        this.f34069d = null;
        this.f34070e = null;
        this.f34072g = null;
        this.f34073h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39479a(nyu nyu) {
        if (this.f34066a != null && this.f34066a.length > 0) {
            for (nzf nzf : this.f34066a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34067b != null) {
            nyu.m37182b(3, this.f34067b);
        }
        if (this.f34068c != null) {
            nyu.m37182b(4, this.f34068c);
        }
        if (this.f34069d != null) {
            nyu.m37168a(6, this.f34069d.intValue());
        }
        if (this.f34070e != null) {
            nyu.m37168a(7, this.f34070e.intValue());
        }
        if (this.f34071f != null) {
            nyu.m37168a(8, this.f34071f.intValue());
        }
        if (this.f34072g != null) {
            nyu.m37182b(9, this.f34072g);
        }
        if (this.f34073h != null) {
            nyu.m37182b(10, this.f34073h);
        }
        super.a(nyu);
    }

    protected int m39480b() {
        int b = super.b();
        if (this.f34066a != null && this.f34066a.length > 0) {
            for (nzf nzf : this.f34066a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f34067b != null) {
            b += nyu.m37145d(3, this.f34067b);
        }
        if (this.f34068c != null) {
            b += nyu.m37145d(4, this.f34068c);
        }
        if (this.f34069d != null) {
            b += nyu.m37147f(6, this.f34069d.intValue());
        }
        if (this.f34070e != null) {
            b += nyu.m37147f(7, this.f34070e.intValue());
        }
        if (this.f34071f != null) {
            b += nyu.m37147f(8, this.f34071f.intValue());
        }
        if (this.f34072g != null) {
            b += nyu.m37145d(9, this.f34072g);
        }
        if (this.f34073h != null) {
            return b + nyu.m37145d(10, this.f34073h);
        }
        return b;
    }

    private ors m39476b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f34066a == null) {
                        a = 0;
                    } else {
                        a = this.f34066a.length;
                    }
                    Object obj = new oqz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34066a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqz();
                    nyt.m37101a(obj[a]);
                    this.f34066a = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f34067b == null) {
                        this.f34067b = new oqu();
                    }
                    nyt.m37101a(this.f34067b);
                    continue;
                case 34:
                    if (this.f34068c == null) {
                        this.f34068c = new oqu();
                    }
                    nyt.m37101a(this.f34068c);
                    continue;
                case 48:
                    this.f34069d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 56:
                    this.f34070e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 64:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f34071f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 74:
                    if (this.f34072g == null) {
                        this.f34072g = new osd();
                    }
                    nyt.m37101a(this.f34072g);
                    continue;
                case 82:
                    if (this.f34073h == null) {
                        this.f34073h = new orc();
                    }
                    nyt.m37101a(this.f34073h);
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
