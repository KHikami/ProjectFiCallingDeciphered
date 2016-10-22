import android.content.Context;
import android.net.Uri;
import android.support.design.widget.Snackbar;

/* compiled from: PG */
final class att implements auw {
    final /* synthetic */ Context a;
    final /* synthetic */ auz b;
    final /* synthetic */ atq c;
    private /* synthetic */ CharSequence d;
    private /* synthetic */ int e;
    private /* synthetic */ aty f;

    att(atq atq, Context context, auz auz, CharSequence charSequence, int i, aty aty) {
        this.c = atq;
        this.a = context;
        this.b = auz;
        this.d = charSequence;
        this.e = i;
        this.f = aty;
    }

    public final void a(Uri uri) {
        Snackbar.a(this.c.d, this.d, 0).a(buf.ij, new atu(this, uri)).a(this.e).a();
        if (this.f != null) {
            this.f.d_();
        }
        if (buf.C(this.a)) {
            buf.E(this.a);
        }
    }
}
