package p000;

public final class nta extends nyx<nta> {
    private static volatile nta[] f30735c;
    public String f30736a;
    public ntc[] f30737b;

    public /* synthetic */ nzf m36437a(nyt nyt) {
        return m36435b(nyt);
    }

    public static nta[] m36436d() {
        if (f30735c == null) {
            synchronized (nzc.f31309c) {
                if (f30735c == null) {
                    f30735c = new nta[0];
                }
            }
        }
        return f30735c;
    }

    public nta() {
        this.f30736a = null;
        this.f30737b = ntc.m36445d();
        this.cachedSize = -1;
    }

    public void m36438a(nyu nyu) {
        if (this.f30736a != null) {
            nyu.m37170a(1, this.f30736a);
        }
        if (this.f30737b != null && this.f30737b.length > 0) {
            for (nzf nzf : this.f30737b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36439b() {
        int b = super.b();
        if (this.f30736a != null) {
            b += nyu.m37137b(1, this.f30736a);
        }
        if (this.f30737b == null || this.f30737b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30737b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nta m36435b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30736a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f30737b == null) {
                        a = 0;
                    } else {
                        a = this.f30737b.length;
                    }
                    Object obj = new ntc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30737b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ntc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ntc();
                    nyt.m37101a(obj[a]);
                    this.f30737b = obj;
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
