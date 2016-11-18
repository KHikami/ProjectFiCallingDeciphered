package p000;

public final class lmk extends nyx<lmk> {
    private static volatile lmk[] f25559g;
    public Integer f25560a;
    public Integer f25561b;
    public Integer f25562c;
    public String f25563d;
    public byte[] f25564e;
    public Integer f25565f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29493b(nyt);
    }

    public static lmk[] m29494d() {
        if (f25559g == null) {
            synchronized (nzc.c) {
                if (f25559g == null) {
                    f25559g = new lmk[0];
                }
            }
        }
        return f25559g;
    }

    public lmk() {
        m29495g();
    }

    private lmk m29495g() {
        this.f25560a = null;
        this.f25561b = null;
        this.f25562c = null;
        this.f25563d = null;
        this.f25564e = null;
        this.f25565f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25560a != null) {
            nyu.c(1, this.f25560a.intValue());
        }
        if (this.f25561b != null) {
            nyu.c(2, this.f25561b.intValue());
        }
        if (this.f25562c != null) {
            nyu.c(3, this.f25562c.intValue());
        }
        if (this.f25563d != null) {
            nyu.a(4, this.f25563d);
        }
        if (this.f25564e != null) {
            nyu.a(5, this.f25564e);
        }
        if (this.f25565f != null) {
            nyu.c(6, this.f25565f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25560a != null) {
            b += nyu.g(1, this.f25560a.intValue());
        }
        if (this.f25561b != null) {
            b += nyu.g(2, this.f25561b.intValue());
        }
        if (this.f25562c != null) {
            b += nyu.g(3, this.f25562c.intValue());
        }
        if (this.f25563d != null) {
            b += nyu.b(4, this.f25563d);
        }
        if (this.f25564e != null) {
            b += nyu.b(5, this.f25564e);
        }
        if (this.f25565f != null) {
            return b + nyu.g(6, this.f25565f.intValue());
        }
        return b;
    }

    private lmk m29493b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25560a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.f25561b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.f25562c = Integer.valueOf(nyt.l());
                    continue;
                case 34:
                    this.f25563d = nyt.j();
                    continue;
                case 42:
                    this.f25564e = nyt.k();
                    continue;
                case 48:
                    this.f25565f = Integer.valueOf(nyt.l());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
