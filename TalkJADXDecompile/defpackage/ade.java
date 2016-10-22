package defpackage;

import android.view.View;

/* renamed from: ade */
final class ade implements Runnable {
    final /* synthetic */ add a;

    ade(add add) {
        this.a = add;
    }

    public void run() {
        View i = this.a.i();
        if (i != null && i.getWindowToken() != null) {
            this.a.a();
        }
    }
}
