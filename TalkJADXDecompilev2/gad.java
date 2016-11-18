package defpackage;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

final class gad implements OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ gab c;

    gad(gab gab, View view, int i) {
        this.c = gab;
        this.a = view;
        this.b = i;
    }

    public void onClick(View view) {
        glk.c("Babel_SmsPromoBanner", "Banner yes clicked", new Object[0]);
        gab gab = this.c;
        View view2 = this.a;
        int i = this.b;
        view2.setVisibility(8);
        PreferenceManager.getDefaultSharedPreferences(gab.b).edit().putInt("messenger_banner_old_promo_number", gab.b()).apply();
        gab.c.a(i).b().c(2809);
        Intent launchIntentForPackage = this.c.b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.messaging");
        if (launchIntentForPackage != null) {
            this.c.b.startActivity(launchIntentForPackage);
        } else {
            this.c.b.startActivity(new Intent("android.intent.action.VIEW", gab.a));
        }
    }
}
