package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: alv */
final class alv implements OnClickListener {
    private /* synthetic */ alt a;

    alv(alt alt) {
        this.a = alt;
    }

    public final void onClick(View view) {
        alt alt = this.a;
        alt.o.edit().putBoolean("show_voicemail_promo_card", false).apply();
        alt.j = false;
        alt.c(0);
    }
}
