package defpackage;

import nyt;
import nyu;

/* renamed from: lyv */
public final class lyv extends nyx<lyv> {
    public String a;
    public lzj b;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lyv() {
        d();
    }

    private lyv d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(3, this.b);
        }
        return b;
    }

    private lyv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new lzj();
                    }
                    nyt.a(this.b);
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
