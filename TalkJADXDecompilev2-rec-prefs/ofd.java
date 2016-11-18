package p000;

public final class ofd extends nyx<ofd> {
    private static volatile ofd[] f32617c;
    public ofd f32618a;
    public ofe f32619b;
    private int f32620d;
    private String f32621e;
    private String f32622f;

    public /* synthetic */ nzf m38048a(nyt nyt) {
        return m38046b(nyt);
    }

    public static ofd[] m38047d() {
        if (f32617c == null) {
            synchronized (nzc.f31309c) {
                if (f32617c == null) {
                    f32617c = new ofd[0];
                }
            }
        }
        return f32617c;
    }

    public String m38052g() {
        return this.f32622f;
    }

    public ofd m38049a(String str) {
        this.f32622f = str;
        this.f32620d |= 2;
        return this;
    }

    public ofd() {
        this.f32620d = 0;
        this.f32621e = "";
        this.f32622f = "";
        this.cachedSize = -1;
    }

    public void m38050a(nyu nyu) {
        if ((this.f32620d & 1) != 0) {
            nyu.m37170a(1, this.f32621e);
        }
        if ((this.f32620d & 2) != 0) {
            nyu.m37170a(2, this.f32622f);
        }
        if (this.f32618a != null) {
            nyu.m37182b(4, this.f32618a);
        }
        if (this.f32619b != null) {
            nyu.m37182b(6, this.f32619b);
        }
        super.a(nyu);
    }

    protected int m38051b() {
        int b = super.b();
        if ((this.f32620d & 1) != 0) {
            b += nyu.m37137b(1, this.f32621e);
        }
        if ((this.f32620d & 2) != 0) {
            b += nyu.m37137b(2, this.f32622f);
        }
        if (this.f32618a != null) {
            b += nyu.m37145d(4, this.f32618a);
        }
        if (this.f32619b != null) {
            return b + nyu.m37145d(6, this.f32619b);
        }
        return b;
    }

    private ofd m38046b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32621e = nyt.m37117j();
                    this.f32620d |= 1;
                    continue;
                case wi.dH /*18*/:
                    this.f32622f = nyt.m37117j();
                    this.f32620d |= 2;
                    continue;
                case 34:
                    if (this.f32618a == null) {
                        this.f32618a = new ofd();
                    }
                    nyt.m37101a(this.f32618a);
                    continue;
                case 50:
                    if (this.f32619b == null) {
                        this.f32619b = new ofe();
                    }
                    nyt.m37101a(this.f32619b);
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
