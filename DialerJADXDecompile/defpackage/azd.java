package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: azd */
final class azd implements OnClickListener {
    private /* synthetic */ ayv a;

    azd(ayv ayv) {
        this.a = ayv;
    }

    public final void onClick(View view) {
        azo azo = (azo) this.a.e;
        if (azo.d == null) {
            bdf.e(azo, "Secondary info clicked but no secondary call.");
        } else {
            String valueOf = String.valueOf(azo.d);
            bdf.d(azo, new StringBuilder(String.valueOf(valueOf).length() + 29).append("Swapping call to foreground: ").append(valueOf).toString());
            bdp.a().c(azo.d.d);
        }
        this.a.j();
    }
}
