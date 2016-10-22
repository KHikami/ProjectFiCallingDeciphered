package defpackage;

import android.content.Context;

/* renamed from: dpc */
public final class dpc {
    private final cxd a;

    public dpc() {
        this.a = new cxe().a("volumeCircle").b("Show volume circle animation when volume level changes in call").a(true).a();
    }

    public cxd[] a() {
        return new cxd[]{this.a};
    }

    public dpb a(Context context) {
        return (dpb) this.a.a(context, (dpb) jyn.a(context, dpg.class));
    }
}
