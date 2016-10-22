import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.View;

/* compiled from: PG */
public final class ab extends mh {
    private /* synthetic */ int a;
    private /* synthetic */ Snackbar b;

    ab(Snackbar snackbar, int i) {
        this.b = snackbar;
        this.a = i;
    }

    public final void a(View view) {
        SnackbarLayout snackbarLayout = this.b.c;
        kn.c(snackbarLayout.a, 1.0f);
        kn.l(snackbarLayout.a).a(0.0f).a(180).b(0).b();
        if (snackbarLayout.b.getVisibility() == 0) {
            kn.c(snackbarLayout.b, 1.0f);
            kn.l(snackbarLayout.b).a(0.0f).a(180).b(0).b();
        }
    }

    public final void b(View view) {
        this.b.c(this.a);
    }
}
