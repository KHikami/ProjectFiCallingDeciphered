package p000;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

final class gad implements OnClickListener {
    final /* synthetic */ View f14534a;
    final /* synthetic */ int f14535b;
    final /* synthetic */ gab f14536c;

    gad(gab gab, View view, int i) {
        this.f14536c = gab;
        this.f14534a = view;
        this.f14535b = i;
    }

    public void onClick(View view) {
        glk.m17979c("Babel_SmsPromoBanner", "Banner yes clicked", new Object[0]);
        gab gab = this.f14536c;
        View view2 = this.f14534a;
        int i = this.f14535b;
        view2.setVisibility(8);
        PreferenceManager.getDefaultSharedPreferences(gab.f14524b).edit().putInt("messenger_banner_old_promo_number", gab.m16804b()).apply();
        gab.f14525c.mo1979a(i).mo1693b().mo1714c(2809);
        Intent launchIntentForPackage = this.f14536c.f14524b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.messaging");
        if (launchIntentForPackage != null) {
            this.f14536c.f14524b.startActivity(launchIntentForPackage);
        } else {
            this.f14536c.f14524b.startActivity(new Intent("android.intent.action.VIEW", gab.f14523a));
        }
    }
}
