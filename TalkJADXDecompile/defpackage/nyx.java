package defpackage;

import nyt;
import nyu;
import nyy;
import nza;
import nzb;
import nzc;
import nzj;

/* renamed from: nyx */
public abstract class nyx<M extends nyx<M>> extends nzf {
    public nza unknownFieldData;

    public /* synthetic */ Object clone() {
        return e();
    }

    public /* synthetic */ nzf f() {
        return e();
    }

    public int b() {
        int i = 0;
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.unknownFieldData.a()) {
            i2 += this.unknownFieldData.c(i).a();
            i++;
        }
        return i2;
    }

    public void a(nyu nyu) {
        if (this.unknownFieldData != null) {
            for (int i = 0; i < this.unknownFieldData.a(); i++) {
                this.unknownFieldData.c(i).a(nyu);
            }
        }
    }

    public final <T> T a(nyy<M, T> nyy_M__T) {
        if (this.unknownFieldData == null) {
            return null;
        }
        nzb a = this.unknownFieldData.a(nyy_M__T.c >>> 3);
        if (a != null) {
            return a.a(nyy_M__T);
        }
        return null;
    }

    public final <T> M a(nyy<M, T> nyy_M__T, T t) {
        nzb nzb = null;
        int i = nyy_M__T.c >>> 3;
        if (t != null) {
            if (this.unknownFieldData == null) {
                this.unknownFieldData = new nza();
            } else {
                nzb = this.unknownFieldData.a(i);
            }
            if (nzb == null) {
                this.unknownFieldData.a(i, new nzb(nyy_M__T, t));
            } else {
                nzb.a(nyy_M__T, t);
            }
        } else if (this.unknownFieldData != null) {
            this.unknownFieldData.b(i);
            if (this.unknownFieldData.b()) {
                this.unknownFieldData = null;
            }
        }
        return this;
    }

    public final boolean a(nyt nyt, int i) {
        int u = nyt.u();
        if (!nyt.b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        nzj nzj = new nzj(i, nyt.a(u, nyt.u() - u));
        nzb nzb = null;
        if (this.unknownFieldData == null) {
            this.unknownFieldData = new nza();
        } else {
            nzb = this.unknownFieldData.a(i2);
        }
        if (nzb == null) {
            nzb = new nzb();
            this.unknownFieldData.a(i2, nzb);
        }
        nzb.a(nzj);
        return true;
    }

    public M e() {
        nyx nyx = (nyx) super.f();
        nzc.a(this, nyx);
        return nyx;
    }
}
