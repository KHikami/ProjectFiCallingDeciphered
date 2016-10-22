import android.net.Uri;
import android.support.design.widget.Snackbar;

/* compiled from: PG */
final class atv implements auw {
    private /* synthetic */ CharSequence a;
    private /* synthetic */ aty b;
    private /* synthetic */ atq c;

    atv(atq atq, CharSequence charSequence, aty aty) {
        this.c = atq;
        this.a = charSequence;
        this.b = aty;
    }

    public final void a(Uri uri) {
        Snackbar.a(this.c.d, this.a, 0).a();
        if (this.b != null) {
            this.b.c();
        }
    }
}
