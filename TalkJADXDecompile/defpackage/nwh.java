package defpackage;

import nwk;
import nwx;
import nxj;
import nxl;
import nyi;
import nyn;

/* renamed from: nwh */
public class nwh<T extends nwh<T>> implements Comparable<T> {
    final nwx<?> a;
    final int b;
    final nyi c;
    final boolean d;
    final boolean e;

    public int a() {
        return this.b;
    }

    public nyi b() {
        return this.c;
    }

    public nyn c() {
        return this.c.a();
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public nxj a(nxj nxj, nxi nxi) {
        return ((nwk) nxj).b((nwi) nxi);
    }

    public nxl f() {
        throw new UnsupportedOperationException();
    }

    public nwh(nwx<?> nwx_, int i, nyi nyi, boolean z, boolean z2) {
        this.a = nwx_;
        this.b = i;
        this.c = nyi;
        this.d = false;
        this.e = false;
    }

    public nwx<?> g() {
        return this.a;
    }

    public int a(nwh nwh) {
        return this.b - nwh.b;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((nwh) obj);
    }
}
