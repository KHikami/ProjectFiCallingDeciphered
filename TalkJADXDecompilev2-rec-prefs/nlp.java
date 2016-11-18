package p000;

public final class nlp extends nyx<nlp> {
    public Integer f30149a;
    public nmc f30150b;
    public noh f30151c;
    public neh f30152d;
    public nla[] f30153e;

    public /* synthetic */ nzf m35531a(nyt nyt) {
        return m35529b(nyt);
    }

    public nlp() {
        m35530d();
    }

    private nlp m35530d() {
        this.f30150b = null;
        this.f30151c = null;
        this.f30152d = null;
        this.f30153e = nla.m35453d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35532a(nyu nyu) {
        if (this.f30149a != null) {
            nyu.m37168a(1, this.f30149a.intValue());
        }
        if (this.f30150b != null) {
            nyu.m37182b(2, this.f30150b);
        }
        if (this.f30151c != null) {
            nyu.m37182b(3, this.f30151c);
        }
        if (this.f30152d != null) {
            nyu.m37182b(4, this.f30152d);
        }
        if (this.f30153e != null && this.f30153e.length > 0) {
            for (nzf nzf : this.f30153e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35533b() {
        int b = super.b();
        if (this.f30149a != null) {
            b += nyu.m37147f(1, this.f30149a.intValue());
        }
        if (this.f30150b != null) {
            b += nyu.m37145d(2, this.f30150b);
        }
        if (this.f30151c != null) {
            b += nyu.m37145d(3, this.f30151c);
        }
        if (this.f30152d != null) {
            b += nyu.m37145d(4, this.f30152d);
        }
        if (this.f30153e == null || this.f30153e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30153e) {
            if (nzf != null) {
                i += nyu.m37145d(5, nzf);
            }
        }
        return i;
    }

    private nlp m35529b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30149a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30150b == null) {
                        this.f30150b = new nmc();
                    }
                    nyt.m37101a(this.f30150b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30151c == null) {
                        this.f30151c = new noh();
                    }
                    nyt.m37101a(this.f30151c);
                    continue;
                case 34:
                    if (this.f30152d == null) {
                        this.f30152d = new neh();
                    }
                    nyt.m37101a(this.f30152d);
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f30153e == null) {
                        a = 0;
                    } else {
                        a = this.f30153e.length;
                    }
                    Object obj = new nla[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30153e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nla();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nla();
                    nyt.m37101a(obj[a]);
                    this.f30153e = obj;
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
