package p000;

public final class mwb extends nyx<mwb> {
    public ofd f28543a;
    public mwa[] f28544b;
    public mwc f28545c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33172b(nyt);
    }

    public mwb() {
        m33173d();
    }

    private mwb m33173d() {
        this.f28543a = null;
        this.f28544b = mwa.m33167d();
        this.f28545c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28543a != null) {
            nyu.b(1, this.f28543a);
        }
        if (this.f28544b != null && this.f28544b.length > 0) {
            for (nzf nzf : this.f28544b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f28545c != null) {
            nyu.b(3, this.f28545c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28543a != null) {
            b += nyu.d(1, this.f28543a);
        }
        if (this.f28544b != null && this.f28544b.length > 0) {
            int i = b;
            for (nzf nzf : this.f28544b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f28545c != null) {
            return b + nyu.d(3, this.f28545c);
        }
        return b;
    }

    private mwb m33172b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28543a == null) {
                        this.f28543a = new ofd();
                    }
                    nyt.a(this.f28543a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f28544b == null) {
                        a = 0;
                    } else {
                        a = this.f28544b.length;
                    }
                    Object obj = new mwa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28544b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwa();
                    nyt.a(obj[a]);
                    this.f28544b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f28545c == null) {
                        this.f28545c = new mwc();
                    }
                    nyt.a(this.f28545c);
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
