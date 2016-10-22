package defpackage;

import mzw;
import nyt;
import nyu;
import nzl;
import odm;

/* renamed from: ktb */
public final class ktb extends nyx<ktb> {
    public String a;
    public odm b;
    public Boolean c;
    public mzw d;
    public String[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ktb() {
        this.a = null;
        this.c = null;
        this.e = nzl.f;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.a != null) {
            nyu.a(4, this.a);
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.a != null) {
            b += nyu.b(4, this.a);
        }
        if (this.e == null || this.e.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.e.length) {
            String str = this.e[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private ktb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.b == null) {
                        this.b = new odm();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dI /*16*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new mzw();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    this.a = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.e == null ? 0 : this.e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
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
