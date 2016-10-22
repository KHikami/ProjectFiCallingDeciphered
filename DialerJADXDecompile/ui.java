import android.content.Context;
import android.view.View;

/* compiled from: PG */
final class ui extends th {
    private /* synthetic */ ud d;

    public ui(ud udVar, Context context, su suVar, View view, boolean z) {
        this.d = udVar;
        super(context, suVar, view, true, buf.A);
        this.b = 8388613;
        a(udVar.l);
    }

    protected final void d() {
        if (this.d.c != null) {
            this.d.c.close();
        }
        this.d.i = null;
        super.d();
    }
}
