package defpackage;

import android.support.design.widget.Snackbar;

/* compiled from: PG */
/* renamed from: ah */
public class ah {
    final /* synthetic */ Snackbar a;

    public void a() {
        Snackbar.a.sendMessage(Snackbar.a.obtainMessage(0, this.a));
    }

    public void a(int i) {
        Snackbar.a.sendMessage(Snackbar.a.obtainMessage(1, i, 0, this.a));
    }

    public ah(Snackbar snackbar) {
        this.a = snackbar;
    }
}
