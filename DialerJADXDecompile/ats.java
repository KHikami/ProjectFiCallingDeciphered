import android.content.ContentValues;
import android.support.design.widget.Snackbar;

/* compiled from: PG */
final class ats implements auz {
    private /* synthetic */ CharSequence a;
    private /* synthetic */ aty b;
    private /* synthetic */ atq c;

    ats(atq atq, CharSequence charSequence, aty aty) {
        this.c = atq;
        this.a = charSequence;
        this.b = aty;
    }

    public final void a(ContentValues contentValues) {
        Snackbar.a(this.c.d, this.a, 0).a();
        if (this.b != null) {
            this.b.c();
        }
    }
}
