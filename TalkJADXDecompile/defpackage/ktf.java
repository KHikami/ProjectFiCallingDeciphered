package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: ktf */
public final class ktf extends nyx<ktf> {
    private static volatile ktf[] b;
    public int a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ktf[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new ktf[0];
                }
            }
        }
        return b;
    }

    public ktf() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.a);
        }
        return b;
    }

    private ktf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
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
