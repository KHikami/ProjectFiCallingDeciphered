package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lsb */
public final class lsb extends nyx<lsb> {
    public Integer a;
    public Long b;
    public lpf[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lsb() {
        d();
    }

    private lsb d() {
        this.a = null;
        this.b = null;
        this.c = lpf.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.c(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.longValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.g(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.e(2, this.b.longValue());
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private lsb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Integer.valueOf(nyt.l());
                    continue;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new lpf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lpf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lpf();
                    nyt.a(obj[a]);
                    this.c = obj;
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
