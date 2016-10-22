package defpackage;

import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: qr */
final class qr implements tk {
    private /* synthetic */ ql a;

    qr(ql qlVar) {
        this.a = qlVar;
    }

    public final boolean a(su suVar) {
        Callback callback = this.a.c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, suVar);
        }
        return true;
    }

    public final void a(su suVar, boolean z) {
        this.a.b(suVar);
    }
}
