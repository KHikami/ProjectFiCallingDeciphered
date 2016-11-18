package defpackage;

public final class lsq extends nyx<lsq> {
    public oaq a;
    public byte[] b;
    public lod c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lsq() {
        d();
    }

    private lsq d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private lsq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oaq();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lod();
                    }
                    nyt.a(this.c);
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
