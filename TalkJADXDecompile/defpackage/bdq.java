package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import java.util.concurrent.TimeUnit;

/* renamed from: bdq */
final class bdq implements bdn {
    static final long a;
    static final long b;
    static final long c;
    static final long d;
    Context e;
    bdm f;
    private long g;
    private long h;
    private long i;
    private long j;
    private jca k;
    private jcf l;
    private iid m;

    bdq() {
    }

    static {
        a = TimeUnit.DAYS.toMillis(42);
        b = TimeUnit.DAYS.toMillis(42);
        c = TimeUnit.DAYS.toMillis(14);
        d = TimeUnit.DAYS.toMillis(7);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.e = context;
        this.k = (jca) jyn.a(jca.class);
        this.l = (jcf) jyn.a(jcf.class);
        this.f = (bdm) jyn.a(bdm.class);
        this.m = ((iih) jyn.a(iih.class)).a(this.k.a());
        this.g = gwb.a(context, "babel_app_upgrade_period1_length", a);
        this.h = gwb.a(context, "babel_app_upgrade_period2_length", b);
        this.i = gwb.a(context, "babel_app_upgrade_period1_frequency", c);
        this.j = gwb.a(context, "babel_app_upgrade_period2_frequency", d);
    }

    public boolean a() {
        int a = this.k.a();
        if (a == -1 || !this.l.c(a)) {
            glk.d("Babel_AppUpgradeBanner", "No valid account", new Object[0]);
            return false;
        }
        try {
            int a2 = this.f.a(a, this.e.getPackageManager().getPackageInfo(this.e.getPackageName(), 0).versionCode);
            CharSequence b = this.f.b(a);
            glk.c("Babel_AppUpgradeBanner", new StringBuilder(String.valueOf(b).length() + 39).append("Upgrade type: ").append(a2).append(" upgrade URL: ").append(b).toString(), new Object[0]);
            if (a2 == 1 && !TextUtils.isEmpty(b)) {
                long j;
                long a3 = glj.a();
                long a4 = a(a, a3);
                switch (bdt.a[b(a4) - 1]) {
                    case wi.j /*1*/:
                        j = this.i;
                        break;
                    case wi.l /*2*/:
                        j = this.j;
                        break;
                    default:
                        j = 0;
                        break;
                }
                long j2 = PreferenceManager.getDefaultSharedPreferences(this.e).getLong("app_upgrade_last_dismisssed", 0);
                a3 -= j2;
                glk.c("Babel_AppUpgradeBanner", "elapsedSinceUpgradeNotification: " + a4 + " frequency: " + j + " lastDismissed: " + j2 + " elapsedSinceDismissal " + a3, new Object[0]);
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

    private int b(long j) {
        if (j < this.g) {
            glk.c("Babel_AppUpgradeBanner", "Period 1", new Object[0]);
            return bdu.a;
        } else if (j < this.g + this.h) {
            glk.c("Babel_AppUpgradeBanner", "Period 2", new Object[0]);
            return bdu.b;
        } else {
            glk.c("Babel_AppUpgradeBanner", "Period 3", new Object[0]);
            return bdu.c;
        }
    }

    private long a(int i, long j) {
        long a = this.f.a(i);
        glk.c("Babel_AppUpgradeBanner", "upgradeNotificationTime: " + a, new Object[0]);
        return j - a;
    }

    public void a(int i, View view) {
        ViewStub viewStub = (ViewStub) view.getRootView().findViewById(i);
        viewStub.setLayoutResource(gwb.iN);
        View inflate = viewStub.inflate();
        int a = this.k.a();
        long a2 = a(a, glj.a());
        Button button = (Button) inflate.findViewById(gwb.iL);
        if (a2 >= this.g + this.h) {
            button.setVisibility(8);
        } else {
            button.setOnClickListener(new bdr(this, a2, inflate));
        }
        ((Button) inflate.findViewById(gwb.iM)).setOnClickListener(new bds(this, a2, a));
        PreferenceManager.getDefaultSharedPreferences(this.e).edit().remove("app_upgrade_last_dismisssed").apply();
        a(a2).c(3125);
    }

    iie a(long j) {
        int i;
        mdb mdb = new mdb();
        mdb.b = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(this.e).getInt("app_upgrade_decline_count", 0));
        switch (bdt.a[b(j) - 1]) {
            case wi.j /*1*/:
                i = 1;
                break;
            case wi.l /*2*/:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        mdb.a = Integer.valueOf(i);
        mdb.c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(j));
        return this.m.b().a(mdb);
    }
}
