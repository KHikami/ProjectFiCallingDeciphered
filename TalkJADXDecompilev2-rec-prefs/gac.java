package p000;

import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

final class gac implements OnClickListener {
    final /* synthetic */ View f14531a;
    final /* synthetic */ int f14532b;
    final /* synthetic */ gab f14533c;

    gac(gab gab, View view, int i) {
        this.f14533c = gab;
        this.f14531a = view;
        this.f14532b = i;
    }

    public void onClick(View view) {
        glk.m17979c("Babel_SmsPromoBanner", "Banner no clicked", new Object[0]);
        gab gab = this.f14533c;
        View view2 = this.f14531a;
        int i = this.f14532b;
        view2.setVisibility(8);
        PreferenceManager.getDefaultSharedPreferences(gab.f14524b).edit().putInt("messenger_banner_old_promo_number", gab.m16804b()).apply();
        gab.f14525c.mo1979a(i).mo1693b().mo1714c(2808);
    }
}
