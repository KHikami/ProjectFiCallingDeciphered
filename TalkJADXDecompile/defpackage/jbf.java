package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: jbf */
public final class jbf extends nzf {
    private static volatile jbf[] g;
    public String a;
    public String b;
    public String[] c;
    public String d;
    public boolean e;
    public String f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static jbf[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new jbf[0];
                }
            }
        }
        return g;
    }

    public jbf() {
        e();
    }

    private jbf e() {
        this.a = "";
        this.b = "";
        this.c = nzl.f;
        this.d = "";
        this.e = false;
        this.f = "";
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (!this.d.equals("")) {
            nyu.a(4, this.d);
        }
        if (!this.f.equals("")) {
            nyu.a(5, this.f);
        }
        if (this.e) {
            nyu.a(6, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        if (this.c == null || this.c.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.c.length) {
                String str = this.c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (!this.d.equals("")) {
            i += nyu.b(4, this.d);
        }
        if (!this.f.equals("")) {
            i += nyu.b(5, this.f);
        }
        if (this.e) {
            return i + nyu.b(6, this.e);
        }
        return i;
    }

    private jbf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 48:
                    this.e = nyt.i();
                    continue;
                default:
                    if (!nzl.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
