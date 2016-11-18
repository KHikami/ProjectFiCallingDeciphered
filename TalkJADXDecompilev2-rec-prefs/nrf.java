package p000;

public final class nrf extends nyx<nrf> {
    public nss[] f30583a;

    public /* synthetic */ nzf m36243a(nyt nyt) {
        return m36242b(nyt);
    }

    public nrf() {
        this.f30583a = nss.m36403d();
        this.cachedSize = -1;
    }

    public void m36244a(nyu nyu) {
        if (this.f30583a != null && this.f30583a.length > 0) {
            for (nzf nzf : this.f30583a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36245b() {
        int b = super.b();
        if (this.f30583a != null && this.f30583a.length > 0) {
            for (nzf nzf : this.f30583a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nrf m36242b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f30583a == null) {
                        a = 0;
                    } else {
                        a = this.f30583a.length;
                    }
                    Object obj = new nss[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30583a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nss();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nss();
                    nyt.m37101a(obj[a]);
                    this.f30583a = obj;
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
