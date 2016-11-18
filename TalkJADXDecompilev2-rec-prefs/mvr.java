package p000;

import java.util.Arrays;

public final class mvr extends nyx<mvr> {
    public String f28509a;
    public byte[] f28510b;
    public nys f28511c;
    public long[] f28512d;
    public String f28513e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33119b(nyt);
    }

    public mvr() {
        m33120d();
    }

    private mvr m33120d() {
        this.f28509a = "";
        this.f28510b = nzl.h;
        this.f28511c = null;
        this.f28512d = nzl.b;
        this.f28513e = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28509a == null || this.f28509a.equals(""))) {
            nyu.a(1, this.f28509a);
        }
        if (!Arrays.equals(this.f28510b, nzl.h)) {
            nyu.a(2, this.f28510b);
        }
        if (this.f28511c != null) {
            nyu.b(3, this.f28511c);
        }
        if (this.f28512d != null && this.f28512d.length > 0) {
            for (long b : this.f28512d) {
                nyu.b(4, b);
            }
        }
        if (!(this.f28513e == null || this.f28513e.equals(""))) {
            nyu.a(5, this.f28513e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (!(this.f28509a == null || this.f28509a.equals(""))) {
            b += nyu.b(1, this.f28509a);
        }
        if (!Arrays.equals(this.f28510b, nzl.h)) {
            b += nyu.b(2, this.f28510b);
        }
        if (this.f28511c != null) {
            b += nyu.d(3, this.f28511c);
        }
        if (this.f28512d != null && this.f28512d.length > 0) {
            int i2 = 0;
            while (i < this.f28512d.length) {
                i2 += nyu.f(this.f28512d[i]);
                i++;
            }
            b = (b + i2) + (this.f28512d.length * 1);
        }
        if (this.f28513e == null || this.f28513e.equals("")) {
            return b;
        }
        return b + nyu.b(5, this.f28513e);
    }

    private mvr m33119b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28509a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28510b = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    if (this.f28511c == null) {
                        this.f28511c = new nys();
                    }
                    nyt.a(this.f28511c);
                    continue;
                case 32:
                    b = nzl.b(nyt, 32);
                    a = this.f28512d == null ? 0 : this.f28512d.length;
                    Object obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28512d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f28512d = obj;
                    continue;
                case 34:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f28512d == null ? 0 : this.f28512d.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28512d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f28512d = obj2;
                    nyt.e(d);
                    continue;
                case 42:
                    this.f28513e = nyt.j();
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
