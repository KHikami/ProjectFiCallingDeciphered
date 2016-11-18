package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import java.util.concurrent.TimeUnit;

final class bdq implements bdn {
    static final long f3103a = TimeUnit.DAYS.toMillis(42);
    static final long f3104b = TimeUnit.DAYS.toMillis(42);
    static final long f3105c = TimeUnit.DAYS.toMillis(14);
    static final long f3106d = TimeUnit.DAYS.toMillis(7);
    Context f3107e;
    bdm f3108f;
    private long f3109g;
    private long f3110h;
    private long f3111i;
    private long f3112j;
    private jca f3113k;
    private jcf f3114l;
    private iid f3115m;

    bdq() {
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f3107e = context;
        this.f3113k = (jca) jyn.m25443a(jca.class);
        this.f3114l = (jcf) jyn.m25443a(jcf.class);
        this.f3108f = (bdm) jyn.m25443a(bdm.class);
        this.f3115m = ((iih) jyn.m25443a(iih.class)).mo1979a(this.f3113k.mo2317a());
        this.f3109g = gwb.m1519a(context, "babel_app_upgrade_period1_length", f3103a);
        this.f3110h = gwb.m1519a(context, "babel_app_upgrade_period2_length", f3104b);
        this.f3111i = gwb.m1519a(context, "babel_app_upgrade_period1_frequency", f3105c);
        this.f3112j = gwb.m1519a(context, "babel_app_upgrade_period2_frequency", f3106d);
    }

    public boolean mo480a() {
        int a = this.f3113k.mo2317a();
        if (a == -1 || !this.f3114l.mo3467c(a)) {
            glk.m17981d("Babel_AppUpgradeBanner", "No valid account", new Object[0]);
            return false;
        }
        try {
            int a2 = this.f3108f.mo501a(a, this.f3107e.getPackageManager().getPackageInfo(this.f3107e.getPackageName(), 0).versionCode);
            CharSequence b = this.f3108f.mo503b(a);
            glk.m17979c("Babel_AppUpgradeBanner", new StringBuilder(String.valueOf(b).length() + 39).append("Upgrade type: ").append(a2).append(" upgrade URL: ").append(b).toString(), new Object[0]);
            if (a2 == 1 && !TextUtils.isEmpty(b)) {
                long j;
                long a3 = glj.m17956a();
                long a4 = m4972a(a, a3);
                switch (bdt.f3122a[m4973b(a4) - 1]) {
                    case 1:
                        j = this.f3111i;
                        break;
                    case 2:
                        j = this.f3112j;
                        break;
                    default:
                        j = 0;
                        break;
                }
                long j2 = PreferenceManager.getDefaultSharedPreferences(this.f3107e).getLong("app_upgrade_last_dismisssed", 0);
                a3 -= j2;
                glk.m17979c("Babel_AppUpgradeBanner", "elapsedSinceUpgradeNotification: " + a4 + " frequency: " + j + " lastDismissed: " + j2 + " elapsedSinceDismissal " + a3, new Object[0]);
                if (a3 < j) {
                    a = 1;
                } else {
                    a = 0;
                }
                if (a == 0) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    private int m4973b(long j) {
        if (j < this.f3109g) {
            glk.m17979c("Babel_AppUpgradeBanner", "Period 1", new Object[0]);
            return bdu.f3123a;
        } else if (j < this.f3109g + this.f3110h) {
            glk.m17979c("Babel_AppUpgradeBanner", "Period 2", new Object[0]);
            return bdu.f3124b;
        } else {
            glk.m17979c("Babel_AppUpgradeBanner", "Period 3", new Object[0]);
            return bdu.f3125c;
        }
    }

    private long m4972a(int i, long j) {
        long a = this.f3108f.mo502a(i);
        glk.m17979c("Babel_AppUpgradeBanner", "upgradeNotificationTime: " + a, new Object[0]);
        return j - a;
    }

    public void mo478a(int i, View view) {
        ViewStub viewStub = (ViewStub) view.getRootView().findViewById(i);
        viewStub.setLayoutResource(gwb.iN);
        View inflate = viewStub.inflate();
        int a = this.f3113k.mo2317a();
        long a2 = m4972a(a, glj.m17956a());
        Button button = (Button) inflate.findViewById(gwb.iL);
        if (a2 >= this.f3109g + this.f3110h) {
            button.setVisibility(8);
        } else {
            button.setOnClickListener(new bdr(this, a2, inflate));
        }
        ((Button) inflate.findViewById(gwb.iM)).setOnClickListener(new bds(this, a2, a));
        PreferenceManager.getDefaultSharedPreferences(this.f3107e).edit().remove("app_upgrade_last_dismisssed").apply();
        m4974a(a2).mo1714c(3125);
    }

    iie m4974a(long j) {
        int i;
        mdb mdb = new mdb();
        mdb.f27436b = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(this.f3107e).getInt("app_upgrade_decline_count", 0));
        switch (bdt.f3122a[m4973b(j) - 1]) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        mdb.f27435a = Integer.valueOf(i);
        mdb.f27437c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(j));
        return this.f3115m.mo1693b().mo1708a(mdb);
    }
}
