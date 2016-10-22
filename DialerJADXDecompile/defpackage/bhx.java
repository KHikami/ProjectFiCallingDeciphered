package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: bhx */
final class bhx implements OnClickListener {
    private /* synthetic */ bhw a;

    bhx(bhw bhw) {
        this.a = bhw;
    }

    public final void onClick(View view) {
        bhw bhw = this.a;
        bhw.r.edit().putBoolean("show_personalization_promo_card", false).apply();
        bhw.t = false;
        bhw.c(0);
    }
}
