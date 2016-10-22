package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: jbi */
public final class jbi extends nzf {
    public String a;
    public String b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public jbi() {
        d();
    }

    private jbi d() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!this.a.equals("")) {
            nyu.a(2, this.a);
        }
        if (!this.b.equals("")) {
            nyu.a(3, this.b);
        }
        if (!this.c.equals("")) {
            nyu.a(6, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!this.a.equals("")) {
            b += nyu.b(2, this.a);
        }
        if (!this.b.equals("")) {
            b += nyu.b(3, this.b);
        }
        if (this.c.equals("")) {
            return b;
        }
        return b + nyu.b(6, this.c);
    }

    private jbi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 50:
                    this.c = nyt.j();
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
