import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;

final class bds implements OnClickListener {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ bdq c;

    bds(bdq bdq, long j, int i) {
        this.c = bdq;
        this.a = j;
        this.b = i;
    }

    public void onClick(View view) {
        PreferenceManager.getDefaultSharedPreferences(this.c.e).edit().putInt("app_upgrade_decline_count", 0).apply();
        this.c.a(this.a).c(3126);
        this.c.e.startActivity(gwb.z(this.c.f.b(this.b)));
    }
}
