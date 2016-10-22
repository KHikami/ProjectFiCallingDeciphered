package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bdr */
final class bdr implements OnClickListener {
    final /* synthetic */ long a;
    final /* synthetic */ View b;
    final /* synthetic */ bdq c;

    bdr(bdq bdq, long j, View view) {
        this.c = bdq;
        this.a = j;
        this.b = view;
    }

    public void onClick(View view) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c.e);
        defaultSharedPreferences.edit().putInt("app_upgrade_decline_count", defaultSharedPreferences.getInt("app_upgrade_decline_count", 0) + 1).apply();
        this.c.a(this.a).c(3127);
        bdq bdq = this.c;
        this.b.setVisibility(8);
        PreferenceManager.getDefaultSharedPreferences(bdq.e).edit().putLong("app_upgrade_last_dismisssed", glj.a()).apply();
    }
}
