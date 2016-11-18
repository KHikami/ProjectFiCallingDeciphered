package p000;

public final class myg extends nyx<myg> {
    public myf f29138a;
    public myc[] f29139b;

    public /* synthetic */ nzf m33797a(nyt nyt) {
        return m33795b(nyt);
    }

    public myg() {
        m33796d();
    }

    private myg m33796d() {
        this.f29138a = null;
        this.f29139b = myc.m33775d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33798a(nyu nyu) {
        if (this.f29138a != null) {
            nyu.m37182b(2, this.f29138a);
        }
        if (this.f29139b != null && this.f29139b.length > 0) {
            for (nzf nzf : this.f29139b) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m33799b() {
        int b = super.b();
        if (this.f29138a != null) {
            b += nyu.m37145d(2, this.f29138a);
        }
        if (this.f29139b == null || this.f29139b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29139b) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private myg m33795b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f29138a == null) {
                        this.f29138a = new myf();
                    }
                    nyt.m37101a(this.f29138a);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29139b == null) {
                        a = 0;
                    } else {
                        a = this.f29139b.length;
                    }
                    Object obj = new myc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29139b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myc();
                    nyt.m37101a(obj[a]);
                    this.f29139b = obj;
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
