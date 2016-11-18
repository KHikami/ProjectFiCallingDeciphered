package p000;

public final class onz extends nyx<onz> {
    public ony[] f33350a;
    public ong f33351b;

    public /* synthetic */ nzf m38865a(nyt nyt) {
        return m38864b(nyt);
    }

    public onz() {
        this.f33350a = ony.m38860d();
        this.cachedSize = -1;
    }

    public void m38866a(nyu nyu) {
        if (this.f33350a != null && this.f33350a.length > 0) {
            for (nzf nzf : this.f33350a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33351b != null) {
            nyu.m37182b(2, this.f33351b);
        }
        super.a(nyu);
    }

    protected int m38867b() {
        int b = super.b();
        if (this.f33350a != null && this.f33350a.length > 0) {
            for (nzf nzf : this.f33350a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f33351b != null) {
            return b + nyu.m37145d(2, this.f33351b);
        }
        return b;
    }

    private onz m38864b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33350a == null) {
                        a = 0;
                    } else {
                        a = this.f33350a.length;
                    }
                    Object obj = new ony[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33350a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ony();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ony();
                    nyt.m37101a(obj[a]);
                    this.f33350a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f33351b == null) {
                        this.f33351b = new ong();
                    }
                    nyt.m37101a(this.f33351b);
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
