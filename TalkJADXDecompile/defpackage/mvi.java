package defpackage;

import nyt;
import nyu;

/* renamed from: mvi */
public final class mvi extends nyx<mvi> {
    public String a;
    public String b;
    public mvl c;
    public boolean d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvi() {
        d();
    }

    private mvi d() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d) {
            nyu.a(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (!this.d) {
            return b;
        }
        boolean z = this.d;
        return b + (nyu.h(4) + 1);
    }

    private mvi b(nyt nyt) {
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
                    if (this.c == null) {
                        this.c = new mvl();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.d = nyt.i();
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
