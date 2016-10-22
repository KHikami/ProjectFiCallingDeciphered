package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: muu */
public final class muu extends nyx<muu> {
    private static volatile muu[] c;
    public String a;
    public muv b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static muu[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new muu[0];
                }
            }
        }
        return c;
    }

    public muu() {
        g();
    }

    private muu g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private muu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new muv();
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
