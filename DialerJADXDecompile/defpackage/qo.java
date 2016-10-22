package defpackage;

/* compiled from: PG */
/* renamed from: qo */
final class qo implements Runnable {
    final /* synthetic */ ql a;

    qo(ql qlVar) {
        this.a = qlVar;
    }

    public final void run() {
        this.a.r.showAtLocation(this.a.q, 55, 0, 0);
        this.a.l();
        kn.c(this.a.q, 0.0f);
        this.a.t = kn.l(this.a.q).a(1.0f);
        this.a.t.a(new qp(this));
    }
}
