package p000;

public final class lfb extends nyx<lfb> {
    public led[] f24891a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28960b(nyt);
    }

    public lfb() {
        m28961d();
    }

    private lfb m28961d() {
        this.f24891a = led.m28839d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24891a != null && this.f24891a.length > 0) {
            for (nzf nzf : this.f24891a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24891a != null && this.f24891a.length > 0) {
            for (nzf nzf : this.f24891a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lfb m28960b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24891a == null) {
                        a = 0;
                    } else {
                        a = this.f24891a.length;
                    }
                    Object obj = new led[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24891a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new led();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new led();
                    nyt.a(obj[a]);
                    this.f24891a = obj;
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
