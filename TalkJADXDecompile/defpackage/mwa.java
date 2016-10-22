package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: mwa */
public final class mwa extends nyx<mwa> {
    private static volatile mwa[] a;
    private int b;
    private String c;
    private byte[] d;
    private boolean e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mwa[] d() {
        if (a == null) {
            synchronized (nzc.c) {
                if (a == null) {
                    a = new mwa[0];
                }
            }
        }
        return a;
    }

    public mwa() {
        g();
    }

    private mwa g() {
        this.b = 0;
        this.c = "";
        this.d = nzl.h;
        this.e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if ((this.b & 1) != 0) {
            nyu.a(1, this.c);
        }
        if ((this.b & 2) != 0) {
            nyu.a(2, this.d);
        }
        if ((this.b & 4) != 0) {
            nyu.a(3, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if ((this.b & 1) != 0) {
            b += nyu.b(1, this.c);
        }
        if ((this.b & 2) != 0) {
            b += nyu.b(2, this.d);
        }
        if ((this.b & 4) == 0) {
            return b;
        }
        boolean z = this.e;
        return b + (nyu.h(3) + 1);
    }

    private mwa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.c = nyt.j();
                    this.b |= 1;
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.k();
                    this.b |= 2;
                    continue;
                case wi.dA /*24*/:
                    this.e = nyt.i();
                    this.b |= 4;
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
