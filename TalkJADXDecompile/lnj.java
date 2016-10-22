import java.util.Arrays;

public final class lnj extends nyx<lnj> {
    public lnf a;
    public lnk b;
    public lnl c;
    public lnm d;
    public lng e;
    public mwb f;
    public byte[] g;
    public String h;
    public int i;
    public lnh j;
    public oev k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public void a(nyu nyu) {
        if (this.f != null) {
            nyu.b(1, this.f);
        }
        if (!(this.h == null || this.h.equals(""))) {
            nyu.a(3, this.h);
        }
        if (!Arrays.equals(this.g, nzl.h)) {
            nyu.a(4, this.g);
        }
        if (this.i != 0) {
            nyu.a(5, this.i);
        }
        if (this.j != null) {
            nyu.b(6, this.j);
        }
        if (this.k != null) {
            nyu.b(7, this.k);
        }
        if (this.d != null) {
            nyu.b(8, this.d);
        }
        if (this.e != null) {
            nyu.b(9, this.e);
        }
        if (this.a != null) {
            nyu.b(10, this.a);
        }
        if (this.b != null) {
            nyu.b(11, this.b);
        }
        if (this.c != null) {
            nyu.b(12, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.f != null) {
            b += nyu.d(1, this.f);
        }
        if (!(this.h == null || this.h.equals(""))) {
            b += nyu.b(3, this.h);
        }
        if (!Arrays.equals(this.g, nzl.h)) {
            b += nyu.b(4, this.g);
        }
        if (this.i != 0) {
            b += nyu.f(5, this.i);
        }
        if (this.j != null) {
            b += nyu.d(6, this.j);
        }
        if (this.k != null) {
            b += nyu.d(7, this.k);
        }
        if (this.d != null) {
            b += nyu.d(8, this.d);
        }
        if (this.e != null) {
            b += nyu.d(9, this.e);
        }
        if (this.a != null) {
            b += nyu.d(10, this.a);
        }
        if (this.b != null) {
            b += nyu.d(11, this.b);
        }
        if (this.c != null) {
            return b + nyu.d(12, this.c);
        }
        return b;
    }

    private lnj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.f == null) {
                        this.f = new mwb();
                    }
                    nyt.a(this.f);
                    continue;
                case wi.dx /*26*/:
                    this.h = nyt.j();
                    continue;
                case 34:
                    this.g = nyt.k();
                    continue;
                case 40:
                    this.i = nyt.f();
                    continue;
                case 50:
                    if (this.j == null) {
                        this.j = new lnh();
                    }
                    nyt.a(this.j);
                    continue;
                case 58:
                    if (this.k == null) {
                        this.k = new oev();
                    }
                    nyt.a(this.k);
                    continue;
                case 66:
                    if (this.d == null) {
                        this.d = new lnm();
                    }
                    nyt.a(this.d);
                    continue;
                case 74:
                    if (this.e == null) {
                        this.e = new lng();
                    }
                    nyt.a(this.e);
                    continue;
                case 82:
                    if (this.a == null) {
                        this.a = new lnf();
                    }
                    nyt.a(this.a);
                    continue;
                case 90:
                    if (this.b == null) {
                        this.b = new lnk();
                    }
                    nyt.a(this.b);
                    continue;
                case 98:
                    if (this.c == null) {
                        this.c = new lnl();
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
