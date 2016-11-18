package p000;

public final class nkz extends nyx<nkz> {
    public ntz[] f30087a;

    public /* synthetic */ nzf m35440a(nyt nyt) {
        return m35438b(nyt);
    }

    public nkz() {
        m35439d();
    }

    private nkz m35439d() {
        this.f30087a = ntz.m36545d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35441a(nyu nyu) {
        if (this.f30087a != null && this.f30087a.length > 0) {
            for (nzf nzf : this.f30087a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35442b() {
        int b = super.b();
        if (this.f30087a != null && this.f30087a.length > 0) {
            for (nzf nzf : this.f30087a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nkz m35438b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f30087a == null) {
                        a = 0;
                    } else {
                        a = this.f30087a.length;
                    }
                    Object obj = new ntz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30087a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ntz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ntz();
                    nyt.m37101a(obj[a]);
                    this.f30087a = obj;
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
