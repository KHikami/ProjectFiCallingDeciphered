package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: kpn */
public final class kpn extends nyx<kpn> {
    public kqd a;
    public kqd b;
    public kpm[] c;
    public Boolean d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kpn() {
        d();
    }

    private kpn d() {
        this.a = null;
        this.b = null;
        this.c = kpm.d();
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.d == null) {
            return b;
        }
        this.d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private kpn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new kqd();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new kpm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpm();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new kqd();
                    }
                    nyt.a(this.b);
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
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
