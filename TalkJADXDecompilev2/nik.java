package defpackage;

public final class nik extends nyx<nik> {
    private static volatile nik[] d;
    public String a;
    public Float b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nik[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new nik[0];
                }
            }
        }
        return d;
    }

    public nik() {
        g();
    }

    private nik g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            this.b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.c != null) {
            return b + nyu.b(3, this.c);
        }
        return b;
    }

    private nik b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
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