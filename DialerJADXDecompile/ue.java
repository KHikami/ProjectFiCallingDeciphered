import android.content.Context;
import android.view.View;

/* compiled from: PG */
public final class ue extends th {
    private /* synthetic */ ud d;

    public ue(ud udVar, Context context, tr trVar, View view) {
        this.d = udVar;
        super(context, trVar, view, false, buf.A);
        if (!((sy) trVar.getItem()).f()) {
            View view2;
            if (udVar.f == null) {
                view2 = (View) udVar.e;
            } else {
                view2 = udVar.f;
            }
            this.a = view2;
        }
        a(udVar.l);
    }

    protected final void d() {
        this.d.j = null;
        super.d();
    }
}
