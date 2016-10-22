package defpackage;

import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.View;

/* compiled from: PG */
/* renamed from: z */
public final class z extends mh {
    private /* synthetic */ Snackbar a;

    public z(Snackbar snackbar) {
        this.a = snackbar;
    }

    public final void a(View view) {
        SnackbarLayout snackbarLayout = this.a.c;
        kn.c(snackbarLayout.a, 0.0f);
        kn.l(snackbarLayout.a).a(1.0f).a(180).b(70).b();
        if (snackbarLayout.b.getVisibility() == 0) {
            kn.c(snackbarLayout.b, 0.0f);
            kn.l(snackbarLayout.b).a(1.0f).a(180).b(70).b();
        }
    }

    public final void b(View view) {
        this.a.c();
    }
}
