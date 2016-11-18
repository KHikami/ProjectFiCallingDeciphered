package p000;

public final class orf extends nyx<orf> {
    public String f33875a;
    public org[] f33876b;

    public /* synthetic */ nzf m39305a(nyt nyt) {
        return m39303b(nyt);
    }

    public orf() {
        m39304d();
    }

    private orf m39304d() {
        this.f33875a = null;
        this.f33876b = org.m39411d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39306a(nyu nyu) {
        if (this.f33875a != null) {
            nyu.m37170a(1, this.f33875a);
        }
        if (this.f33876b != null && this.f33876b.length > 0) {
            for (nzf nzf : this.f33876b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39307b() {
        int b = super.b();
        if (this.f33875a != null) {
            b += nyu.m37137b(1, this.f33875a);
        }
        if (this.f33876b == null || this.f33876b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f33876b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private orf m39303b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33875a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f33876b == null) {
                        a = 0;
                    } else {
                        a = this.f33876b.length;
                    }
                    Object obj = new org[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33876b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new org();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new org();
                    nyt.m37101a(obj[a]);
                    this.f33876b = obj;
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
