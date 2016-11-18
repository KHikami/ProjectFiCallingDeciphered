package defpackage;

public final class myg extends nyx<myg> {
    public myf a;
    public myc[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public myg() {
        d();
    }

    private myg d() {
        this.a = null;
        this.b = myc.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.b) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private myg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new myf();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new myc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new myc();
                    nyt.a(obj[a]);
                    this.b = obj;
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
