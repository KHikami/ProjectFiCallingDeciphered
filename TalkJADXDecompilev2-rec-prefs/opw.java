package p000;

public final class opw extends nyx<opw> {
    public oox f33609a;
    public oqz[] f33610b;

    public /* synthetic */ nzf m39113a(nyt nyt) {
        return m39111b(nyt);
    }

    public opw() {
        m39112d();
    }

    private opw m39112d() {
        this.f33609a = null;
        this.f33610b = oqz.m39269d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39114a(nyu nyu) {
        if (this.f33609a != null) {
            nyu.m37182b(1, this.f33609a);
        }
        if (this.f33610b != null && this.f33610b.length > 0) {
            for (nzf nzf : this.f33610b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39115b() {
        int b = super.b();
        if (this.f33609a != null) {
            b += nyu.m37145d(1, this.f33609a);
        }
        if (this.f33610b == null || this.f33610b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f33610b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private opw m39111b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33609a == null) {
                        this.f33609a = new oox();
                    }
                    nyt.m37101a(this.f33609a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f33610b == null) {
                        a = 0;
                    } else {
                        a = this.f33610b.length;
                    }
                    Object obj = new oqz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33610b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqz();
                    nyt.m37101a(obj[a]);
                    this.f33610b = obj;
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
