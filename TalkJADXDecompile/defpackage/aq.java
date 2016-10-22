package defpackage;

import android.support.design.widget.Snackbar;
import android.view.View;
import pz;

/* renamed from: aq */
public final class aq extends pz {
    final /* synthetic */ int a;
    final /* synthetic */ Snackbar b;

    aq(Snackbar snackbar, int i) {
        this.b = snackbar;
        this.a = i;
    }

    public void a(View view) {
        this.b.c.b(0, 180);
    }

    public void b(View view) {
        this.b.a(this.a);
    }
}
