package p000;

import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

final class bds implements OnClickListener {
    final /* synthetic */ long f3119a;
    final /* synthetic */ int f3120b;
    final /* synthetic */ bdq f3121c;

    bds(bdq bdq, long j, int i) {
        this.f3121c = bdq;
        this.f3119a = j;
        this.f3120b = i;
    }

    public void onClick(View view) {
        PreferenceManager.getDefaultSharedPreferences(this.f3121c.f3107e).edit().putInt("app_upgrade_decline_count", 0).apply();
        this.f3121c.m4974a(this.f3119a).mo1714c(3126);
        this.f3121c.f3107e.startActivity(gwb.m2397z(this.f3121c.f3108f.mo503b(this.f3120b)));
    }
}
