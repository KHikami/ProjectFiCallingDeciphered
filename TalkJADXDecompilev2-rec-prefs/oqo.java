package p000;

public final class oqo extends nyx<oqo> {
    private static volatile oqo[] f33774d;
    public Integer f33775a;
    public oql f33776b;
    public oql[] f33777c;

    public /* synthetic */ nzf m39211a(nyt nyt) {
        return m39208b(nyt);
    }

    public static oqo[] m39209d() {
        if (f33774d == null) {
            synchronized (nzc.f31309c) {
                if (f33774d == null) {
                    f33774d = new oqo[0];
                }
            }
        }
        return f33774d;
    }

    public oqo() {
        m39210g();
    }

    private oqo m39210g() {
        this.f33776b = null;
        this.f33777c = oql.m39192d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39212a(nyu nyu) {
        if (this.f33775a != null) {
            nyu.m37168a(1, this.f33775a.intValue());
        }
        if (this.f33776b != null) {
            nyu.m37182b(2, this.f33776b);
        }
        if (this.f33777c != null && this.f33777c.length > 0) {
            for (nzf nzf : this.f33777c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39213b() {
        int b = super.b();
        if (this.f33775a != null) {
            b += nyu.m37147f(1, this.f33775a.intValue());
        }
        if (this.f33776b != null) {
            b += nyu.m37145d(2, this.f33776b);
        }
        if (this.f33777c == null || this.f33777c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f33777c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private oqo m39208b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.f33775a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f33776b == null) {
                        this.f33776b = new oql();
                    }
                    nyt.m37101a(this.f33776b);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f33777c == null) {
                        a = 0;
                    } else {
                        a = this.f33777c.length;
                    }
                    Object obj = new oql[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33777c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oql();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oql();
                    nyt.m37101a(obj[a]);
                    this.f33777c = obj;
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
