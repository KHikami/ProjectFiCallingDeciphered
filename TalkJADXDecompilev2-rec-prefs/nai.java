package p000;

public final class nai extends nyx<nai> {
    private static volatile nai[] f29357d;
    public int f29358a;
    public Integer f29359b;
    public naj[] f29360c;

    public /* synthetic */ nzf m34045a(nyt nyt) {
        return m34043b(nyt);
    }

    public static nai[] m34044d() {
        if (f29357d == null) {
            synchronized (nzc.f31309c) {
                if (f29357d == null) {
                    f29357d = new nai[0];
                }
            }
        }
        return f29357d;
    }

    public nai() {
        this.f29358a = nzf.UNSET_ENUM_VALUE;
        this.f29359b = null;
        this.f29360c = naj.m34049d();
        this.cachedSize = -1;
    }

    public void m34046a(nyu nyu) {
        if (this.f29358a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29358a);
        }
        if (this.f29359b != null) {
            nyu.m37168a(2, this.f29359b.intValue());
        }
        if (this.f29360c != null && this.f29360c.length > 0) {
            for (nzf nzf : this.f29360c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34047b() {
        int b = super.b();
        if (this.f29358a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29358a);
        }
        if (this.f29359b != null) {
            b += nyu.m37147f(2, this.f29359b.intValue());
        }
        if (this.f29360c == null || this.f29360c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29360c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private nai m34043b(nyt nyt) {
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
                            this.f29358a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29359b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29360c == null) {
                        a = 0;
                    } else {
                        a = this.f29360c.length;
                    }
                    Object obj = new naj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29360c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new naj();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new naj();
                    nyt.m37101a(obj[a]);
                    this.f29360c = obj;
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
