package defpackage;

import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gac */
final class gac implements OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ gab c;

    gac(gab gab, View view, int i) {
        this.c = gab;
        this.a = view;
        this.b = i;
    }

    public void onClick(View view) {
        glk.c("Babel_SmsPromoBanner", "Banner no clicked", new Object[0]);
        gab gab = this.c;
        View view2 = this.a;
        int i = this.b;
        view2.setVisibility(8);
        PreferenceManager.getDefaultSharedPreferences(gab.b).edit().putInt("messenger_banner_old_promo_number", gab.b()).apply();
        gab.c.a(i).b().c(2808);
    }
}
