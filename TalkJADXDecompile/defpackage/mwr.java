package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: mwr */
public final class mwr extends nyx<mwr> {
    private static volatile mwr[] b;
    public Integer a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mwr[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new mwr[0];
                }
            }
        }
        return b;
    }

    public mwr() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.f(1, this.a.intValue());
        }
        return b;
    }

    private mwr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Integer.valueOf(nyt.f());
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
