package p000;

import java.util.Arrays;

public final class mvy extends nyx<mvy> {
    public double f28529a;
    public int f28530b;
    public long f28531c;
    public boolean f28532d;
    public String f28533e;
    public byte[] f28534f;
    public mvz f28535g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33156b(nyt);
    }

    public mvy() {
        m33157d();
    }

    private mvy m33157d() {
        this.f28529a = 0.0d;
        this.f28530b = 0;
        this.f28531c = 0;
        this.f28532d = false;
        this.f28533e = "";
        this.f28534f = nzl.h;
        this.f28535g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (Double.doubleToLongBits(this.f28529a) != Double.doubleToLongBits(0.0d)) {
            nyu.a(1, this.f28529a);
        }
        if (this.f28530b != 0) {
            nyu.a(2, this.f28530b);
        }
        if (this.f28531c != 0) {
            nyu.b(3, this.f28531c);
        }
        if (this.f28532d) {
            nyu.a(4, this.f28532d);
        }
        if (!(this.f28533e == null || this.f28533e.equals(""))) {
            nyu.a(5, this.f28533e);
        }
        if (!Arrays.equals(this.f28534f, nzl.h)) {
            nyu.a(6, this.f28534f);
        }
        if (this.f28535g != null) {
            nyu.b(7, this.f28535g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (Double.doubleToLongBits(this.f28529a) != Double.doubleToLongBits(0.0d)) {
            double d = this.f28529a;
            b += nyu.h(1) + 8;
        }
        if (this.f28530b != 0) {
            b += nyu.f(2, this.f28530b);
        }
        if (this.f28531c != 0) {
            b += nyu.f(3, this.f28531c);
        }
        if (this.f28532d) {
            boolean z = this.f28532d;
            b += nyu.h(4) + 1;
        }
        if (!(this.f28533e == null || this.f28533e.equals(""))) {
            b += nyu.b(5, this.f28533e);
        }
        if (!Arrays.equals(this.f28534f, nzl.h)) {
            b += nyu.b(6, this.f28534f);
        }
        if (this.f28535g != null) {
            return b + nyu.d(7, this.f28535g);
        }
        return b;
    }

    private mvy m33156b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28529a = nyt.b();
                    continue;
                case 16:
                    this.f28530b = nyt.f();
                    continue;
                case wi.dA /*24*/:
                    this.f28531c = nyt.e();
                    continue;
                case 32:
                    this.f28532d = nyt.i();
                    continue;
                case 42:
                    this.f28533e = nyt.j();
                    continue;
                case 50:
                    this.f28534f = nyt.k();
                    continue;
                case 58:
                    if (this.f28535g == null) {
                        this.f28535g = new mvz();
                    }
                    nyt.a(this.f28535g);
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
