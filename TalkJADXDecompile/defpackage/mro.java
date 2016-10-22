package defpackage;

import nyt;
import nyu;
import nyy;
import ozn;

/* renamed from: mro */
public final class mro extends nyx<mro> {
    public static final nyy<ozn, mro> a;
    private static final mro[] e;
    public long b;
    public int c;
    public int d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    static {
        a = nyy.a(11, mro.class, 33251034);
        e = new mro[0];
    }

    public mro() {
        d();
    }

    private mro d() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mro)) {
            return false;
        }
        mro mro = (mro) obj;
        if (this.b != mro.b) {
            return false;
        }
        if (this.c != mro.c) {
            return false;
        }
        if (this.d != mro.d) {
            return false;
        }
        if (this.unknownFieldData != null && !this.unknownFieldData.b()) {
            return this.unknownFieldData.equals(mro.unknownFieldData);
        }
        if (mro.unknownFieldData == null || mro.unknownFieldData.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + this.c) * 31) + this.d) * 31;
        if (this.unknownFieldData == null || this.unknownFieldData.b()) {
            i = 0;
        } else {
            i = this.unknownFieldData.hashCode();
        }
        return i + hashCode;
    }

    public void a(nyu nyu) {
        nyu.b(1, this.b);
        nyu.b(2, this.c);
        nyu.b(3, this.d);
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.f(1, this.b);
        int i = this.c;
        b += nyu.h(2) + 4;
        i = this.d;
        return b + (nyu.h(3) + 4);
    }

    private mro b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.b = nyt.e();
                    continue;
                case wi.f /*21*/:
                    this.c = nyt.h();
                    continue;
                case 29:
                    this.d = nyt.h();
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
