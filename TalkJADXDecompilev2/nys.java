package defpackage;

public final class nys extends nyx<nys> {
    private int a;
    private String b;
    private byte[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nys() {
        d();
    }

    private nys d() {
        this.a = 0;
        this.b = "";
        this.c = nzl.h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if ((this.a & 1) != 0) {
            nyu.a(1, this.b);
        }
        if ((this.a & 2) != 0) {
            nyu.a(2, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if ((this.a & 1) != 0) {
            b += nyu.b(1, this.b);
        }
        if ((this.a & 2) != 0) {
            return b + nyu.b(2, this.c);
        }
        return b;
    }

    private nys b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    this.a |= 1;
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.k();
                    this.a |= 2;
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
