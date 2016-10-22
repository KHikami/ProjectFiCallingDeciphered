import android.content.ContentValues;
import android.content.Context;
import android.support.design.widget.Snackbar;

/* compiled from: PG */
final class atw implements auz {
    final /* synthetic */ Context a;
    final /* synthetic */ auw b;
    final /* synthetic */ atq c;
    private /* synthetic */ CharSequence d;
    private /* synthetic */ int e;
    private /* synthetic */ aty f;

    atw(atq atq, Context context, auw auw, CharSequence charSequence, int i, aty aty) {
        this.c = atq;
        this.a = context;
        this.b = auw;
        this.d = charSequence;
        this.e = i;
        this.f = aty;
    }

    public final void a(ContentValues contentValues) {
        Snackbar.a(this.c.d, this.d, 0).a(buf.ij, new atx(this, contentValues)).a(this.e).a();
        if (this.f != null) {
            this.f.b();
        }
    }
}
