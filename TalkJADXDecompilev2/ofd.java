package defpackage;

public final class ofd extends nyx<ofd> {
    private static volatile ofd[] c;
    public ofd a;
    public ofe b;
    private int d;
    private String e;
    private String f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ofd[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ofd[0];
                }
            }
        }
        return c;
    }

    public String g() {
        return this.f;
    }

    public ofd a(String str) {
        this.f = str;
        this.d |= 2;
        return this;
    }

    public ofd() {
        this.d = 0;
        this.e = "";
        this.f = "";
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if ((this.d & 1) != 0) {
            nyu.a(1, this.e);
        }
        if ((this.d & 2) != 0) {
            nyu.a(2, this.f);
        }
        if (this.a != null) {
            nyu.b(4, this.a);
        }
        if (this.b != null) {
            nyu.b(6, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if ((this.d & 1) != 0) {
            b += nyu.b(1, this.e);
        }
        if ((this.d & 2) != 0) {
            b += nyu.b(2, this.f);
        }
        if (this.a != null) {
            b += nyu.d(4, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(6, this.b);
        }
        return b;
    }

    private ofd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.e = nyt.j();
                    this.d |= 1;
                    continue;
                case wi.dH /*18*/:
                    this.f = nyt.j();
                    this.d |= 2;
                    continue;
                case 34:
                    if (this.a == null) {
                        this.a = new ofd();
                    }
                    nyt.a(this.a);
                    continue;
                case 50:
                    if (this.b == null) {
                        this.b = new ofe();
                    }
                    nyt.a(this.b);
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
