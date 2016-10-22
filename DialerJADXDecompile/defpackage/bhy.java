package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.dialer.settings.GoogleDialerSettingsActivity;

/* compiled from: PG */
/* renamed from: bhy */
final class bhy implements OnClickListener {
    private /* synthetic */ bhw a;

    bhy(bhw bhw) {
        this.a = bhw;
    }

    public final void onClick(View view) {
        Intent intent = new Intent(this.a.s, GoogleDialerSettingsActivity.class);
        intent.putExtra(":android:show_fragment", bka.class.getName());
        intent.putExtra(":android:no_headers", true);
        intent.putExtra("extra_enable_personalization", true);
        this.a.s.startActivity(intent);
        bhw bhw = this.a;
        bhw.r.edit().putBoolean("show_personalization_promo_card", false).apply();
        bhw.t = false;
        bhw.c(0);
    }
}
