package p000;

public final class orr extends nyx<orr> {
    public orq[] f34064a;
    public Boolean f34065b;

    public /* synthetic */ nzf m39473a(nyt nyt) {
        return m39471b(nyt);
    }

    public orr() {
        m39472d();
    }

    private orr m39472d() {
        this.f34064a = orq.m39466d();
        this.f34065b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39474a(nyu nyu) {
        if (this.f34064a != null && this.f34064a.length > 0) {
            for (nzf nzf : this.f34064a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34065b != null) {
            nyu.m37172a(2, this.f34065b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39475b() {
        int b = super.b();
        if (this.f34064a != null && this.f34064a.length > 0) {
            for (nzf nzf : this.f34064a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f34065b == null) {
            return b;
        }
        this.f34065b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private orr m39471b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f34064a == null) {
                        a = 0;
                    } else {
                        a = this.f34064a.length;
                    }
                    Object obj = new orq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34064a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orq();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new orq();
                    nyt.m37101a(obj[a]);
                    this.f34064a = obj;
                    continue;
                case 16:
                    this.f34065b = Boolean.valueOf(nyt.m37116i());
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
