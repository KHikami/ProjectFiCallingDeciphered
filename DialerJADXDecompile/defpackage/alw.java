package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: alw */
final class alw implements OnClickListener {
    private /* synthetic */ alt a;

    alw(alt alt) {
        this.a = alt;
    }

    public final void onClick(View view) {
        this.a.c.startActivity(new Intent("android.telephony.action.CONFIGURE_VOICEMAIL"));
        alt alt = this.a;
        alt.o.edit().putBoolean("show_voicemail_promo_card", false).apply();
        alt.j = false;
        alt.c(0);
    }
}
