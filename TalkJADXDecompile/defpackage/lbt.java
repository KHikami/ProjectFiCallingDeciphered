package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lbt */
public final class lbt extends nyx<lbt> {
    public laa a;
    public laa[] b;
    public lbp c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbt() {
        this.b = laa.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(4, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(6, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(4, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            return b + nyu.d(6, this.c);
        }
        return b;
    }

    private lbt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case 34:
                    if (this.a == null) {
                        this.a = new laa();
                    }
                    nyt.a(this.a);
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new laa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new laa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new laa();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 50:
                    if (this.c == null) {
                        this.c = new lbp();
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
