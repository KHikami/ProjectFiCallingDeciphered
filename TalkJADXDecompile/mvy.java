import java.util.Arrays;

public final class mvy extends nyx<mvy> {
    public double a;
    public int b;
    public long c;
    public boolean d;
    public String e;
    public byte[] f;
    public mvz g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvy() {
        d();
    }

    private mvy d() {
        this.a = 0.0d;
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = "";
        this.f = nzl.h;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(0.0d)) {
            nyu.a(1, this.a);
        }
        if (this.b != 0) {
            nyu.a(2, this.b);
        }
        if (this.c != 0) {
            nyu.b(3, this.c);
        }
        if (this.d) {
            nyu.a(4, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(5, this.e);
        }
        if (!Arrays.equals(this.f, nzl.h)) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(0.0d)) {
            double d = this.a;
            b += nyu.h(1) + 8;
        }
        if (this.b != 0) {
            b += nyu.f(2, this.b);
        }
        if (this.c != 0) {
            b += nyu.f(3, this.c);
        }
        if (this.d) {
            boolean z = this.d;
            b += nyu.h(4) + 1;
        }
        if (!(this.e == null || this.e.equals(""))) {
            b += nyu.b(5, this.e);
        }
        if (!Arrays.equals(this.f, nzl.h)) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private mvy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.n /*9*/:
                    this.a = nyt.b();
                    continue;
                case wi.dI /*16*/:
                    this.b = nyt.f();
                    continue;
                case wi.dA /*24*/:
                    this.c = nyt.e();
                    continue;
                case 32:
                    this.d = nyt.i();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.k();
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new mvz();
                    }
                    nyt.a(this.g);
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
