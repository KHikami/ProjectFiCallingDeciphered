package defpackage;

public final class oou extends nyx<oou> {
    public mun a;
    public String b;
    public muj c;
    public Float d;
    public oqu e;
    public String f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oou() {
        d();
    }

    private oou d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
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
        if (this.d != null) {
            nyu.a(4, this.d.floatValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
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
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            return b + nyu.b(6, this.f);
        }
        return b;
    }

    private oou b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new mun();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new muj();
                    }
                    nyt.a(this.c);
                    continue;
                case 37:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new oqu();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    this.f = nyt.j();
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
