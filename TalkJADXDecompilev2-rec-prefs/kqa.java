package p000;

public final class kqa extends nyx<kqa> {
    public kpy f22725a;
    public kqk f22726b;
    public kpa f22727c;
    public String f22728d;
    public Integer f22729e;
    public opy f22730f;
    public Integer f22731g;
    public kny f22732h;
    public kqb f22733i;
    public Boolean f22734j;
    public kyx f22735k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27008b(nyt);
    }

    public kqa() {
        m27009d();
    }

    private kqa m27009d() {
        this.f22725a = null;
        this.f22726b = null;
        this.f22727c = null;
        this.f22728d = null;
        this.f22730f = null;
        this.f22732h = null;
        this.f22733i = null;
        this.f22734j = null;
        this.f22735k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22725a != null) {
            nyu.b(1, this.f22725a);
        }
        if (this.f22726b != null) {
            nyu.b(3, this.f22726b);
        }
        if (this.f22727c != null) {
            nyu.b(4, this.f22727c);
        }
        if (this.f22728d != null) {
            nyu.a(5, this.f22728d);
        }
        if (this.f22729e != null) {
            nyu.a(6, this.f22729e.intValue());
        }
        if (this.f22730f != null) {
            nyu.b(8, this.f22730f);
        }
        if (this.f22731g != null) {
            nyu.a(9, this.f22731g.intValue());
        }
        if (this.f22732h != null) {
            nyu.b(10, this.f22732h);
        }
        if (this.f22733i != null) {
            nyu.b(11, this.f22733i);
        }
        if (this.f22734j != null) {
            nyu.a(12, this.f22734j.booleanValue());
        }
        if (this.f22735k != null) {
            nyu.b(13, this.f22735k);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22725a != null) {
            b += nyu.d(1, this.f22725a);
        }
        if (this.f22726b != null) {
            b += nyu.d(3, this.f22726b);
        }
        if (this.f22727c != null) {
            b += nyu.d(4, this.f22727c);
        }
        if (this.f22728d != null) {
            b += nyu.b(5, this.f22728d);
        }
        if (this.f22729e != null) {
            b += nyu.f(6, this.f22729e.intValue());
        }
        if (this.f22730f != null) {
            b += nyu.d(8, this.f22730f);
        }
        if (this.f22731g != null) {
            b += nyu.f(9, this.f22731g.intValue());
        }
        if (this.f22732h != null) {
            b += nyu.d(10, this.f22732h);
        }
        if (this.f22733i != null) {
            b += nyu.d(11, this.f22733i);
        }
        if (this.f22734j != null) {
            this.f22734j.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f22735k != null) {
            return b + nyu.d(13, this.f22735k);
        }
        return b;
    }

    private kqa m27008b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22725a == null) {
                        this.f22725a = new kpy();
                    }
                    nyt.a(this.f22725a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22726b == null) {
                        this.f22726b = new kqk();
                    }
                    nyt.a(this.f22726b);
                    continue;
                case 34:
                    if (this.f22727c == null) {
                        this.f22727c = new kpa();
                    }
                    nyt.a(this.f22727c);
                    continue;
                case 42:
                    this.f22728d = nyt.j();
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22729e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    if (this.f22730f == null) {
                        this.f22730f = new opy();
                    }
                    nyt.a(this.f22730f);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22731g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.f22732h == null) {
                        this.f22732h = new kny();
                    }
                    nyt.a(this.f22732h);
                    continue;
                case 90:
                    if (this.f22733i == null) {
                        this.f22733i = new kqb();
                    }
                    nyt.a(this.f22733i);
                    continue;
                case 96:
                    this.f22734j = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    if (this.f22735k == null) {
                        this.f22735k = new kyx();
                    }
                    nyt.a(this.f22735k);
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
