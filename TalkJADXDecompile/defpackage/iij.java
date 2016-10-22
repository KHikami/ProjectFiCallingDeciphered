package defpackage;

import pbq;
import pbr;
import pbs;
import pbt;
import pbu;

/* renamed from: iij */
public class iij {
    public final pbq a;
    public pbr b;
    public pbs c;
    public final /* synthetic */ dvp d;

    public iij a(int i) {
        if (this.c == null) {
            this.c = new pbs();
        }
        pbt pbt = new pbt();
        pbt.a = Integer.valueOf(i);
        pbt.b = Integer.valueOf(0);
        this.c.a = pbt;
        return this;
    }

    public iij a(String str) {
        if (this.c == null) {
            this.c = new pbs();
        }
        pbu pbu = new pbu();
        pbu.a = str;
        this.c.c = pbu;
        return this;
    }

    public iij b(String str) {
        this.a.a = str;
        return this;
    }

    public iij c(String str) {
        if (this.b == null) {
            this.b = new pbr();
        }
        this.b.a = str;
        return this;
    }

    public iij d(String str) {
        if (this.b == null) {
            this.b = new pbr();
        }
        this.b.b = str;
        return this;
    }

    public iij e(String str) {
        if (this.b == null) {
            this.b = new pbr();
        }
        this.b.c = str;
        return this;
    }

    public iii a() {
        if (this.a.a == null || this.b == null) {
            this.a.b = this.b;
            this.a.c = this.c;
            this.d.a.add(this.a);
            return this.d;
        }
        throw new IllegalStateException("Cannot provide both a logging ID and entity ID for new SocialAffinityLog entity. Only one is acceptable.");
    }

    public iij(dvp dvp) {
        this.d = dvp;
        this.a = new pbq();
    }
}
