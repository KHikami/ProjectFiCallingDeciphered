package defpackage;

import java.util.Arrays;
import nys;
import nyt;
import nyu;
import nzl;

/* renamed from: mvr */
public final class mvr extends nyx<mvr> {
    public String a;
    public byte[] b;
    public nys c;
    public long[] d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvr() {
        d();
    }

    private mvr d() {
        this.a = "";
        this.b = nzl.h;
        this.c = null;
        this.d = nzl.b;
        this.e = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!Arrays.equals(this.b, nzl.h)) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (long b : this.d) {
                nyu.b(4, b);
            }
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!Arrays.equals(this.b, nzl.h)) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = 0;
            while (i < this.d.length) {
                i2 += nyu.f(this.d[i]);
                i++;
            }
            b = (b + i2) + (this.d.length * 1);
        }
        if (this.e == null || this.e.equals("")) {
            return b;
        }
        return b + nyu.b(5, this.e);
    }

    private mvr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nys();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    b = nzl.b(nyt, 32);
                    a = this.d == null ? 0 : this.d.length;
                    Object obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.d = obj;
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
                    b = this.d == null ? 0 : this.d.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.d = obj2;
                    nyt.e(d);
                    continue;
                case 42:
                    this.e = nyt.j();
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
