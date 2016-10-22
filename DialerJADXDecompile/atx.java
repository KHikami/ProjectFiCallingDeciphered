import android.content.ContentValues;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class atx implements OnClickListener {
    private /* synthetic */ ContentValues a;
    private /* synthetic */ atw b;

    atx(atw atw, ContentValues contentValues) {
        this.b = atw;
        this.a = contentValues;
    }

    public final void onClick(View view) {
        buf.H(this.b.a).b(24);
        this.b.c.c.a(this.b.b, this.a);
    }
}
