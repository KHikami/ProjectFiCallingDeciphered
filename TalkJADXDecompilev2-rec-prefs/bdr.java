package p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

final class bdr implements OnClickListener {
    final /* synthetic */ long f3116a;
    final /* synthetic */ View f3117b;
    final /* synthetic */ bdq f3118c;

    bdr(bdq bdq, long j, View view) {
        this.f3118c = bdq;
        this.f3116a = j;
        this.f3117b = view;
    }

    public void onClick(View view) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3118c.f3107e);
        defaultSharedPreferences.edit().putInt("app_upgrade_decline_count", defaultSharedPreferences.getInt("app_upgrade_decline_count", 0) + 1).apply();
        this.f3118c.m4974a(this.f3116a).mo1714c(3127);
        bdq bdq = this.f3118c;
        this.f3117b.setVisibility(8);
        PreferenceManager.getDefaultSharedPreferences(bdq.f3107e).edit().putLong("app_upgrade_last_dismisssed", glj.m17956a()).apply();
    }
}
