package defpackage;

/* compiled from: PG */
/* renamed from: asq */
public final class asq implements asw {
    private /* synthetic */ boolean a;
    private /* synthetic */ asp b;

    public asq(asp asp, boolean z) {
        this.b = asp;
        this.a = z;
    }

    public final void a(boolean z) {
        if (z) {
            this.b.d();
            return;
        }
        if (this.a) {
            this.b.a(0);
        }
        if (this.b.i != null) {
            this.b.i.k();
            this.b.i.a(0, this.b.c.get());
        }
    }
}
