package p000;

public final class lni extends nyx<lni> {
    private static volatile lni[] f25767c;
    public String f25768a;
    public ota[] f25769b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29607b(nyt);
    }

    public static lni[] m29608d() {
        if (f25767c == null) {
            synchronized (nzc.c) {
                if (f25767c == null) {
                    f25767c = new lni[0];
                }
            }
        }
        return f25767c;
    }

    public lni() {
        m29609g();
    }

    private lni m29609g() {
        this.f25768a = "";
        this.f25769b = ota.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f25768a == null || this.f25768a.equals(""))) {
            nyu.a(1, this.f25768a);
        }
        if (this.f25769b != null && this.f25769b.length > 0) {
            for (nzf nzf : this.f25769b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f25768a == null || this.f25768a.equals(""))) {
            b += nyu.b(1, this.f25768a);
        }
        if (this.f25769b == null || this.f25769b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f25769b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lni m29607b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25768a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f25769b == null) {
                        a = 0;
                    } else {
                        a = this.f25769b.length;
                    }
                    Object obj = new ota[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25769b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ota();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ota();
                    nyt.a(obj[a]);
                    this.f25769b = obj;
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
