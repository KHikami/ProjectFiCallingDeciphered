package p000;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.gms.impl.GmsInstallActivity;

public final class dfp implements dfm {
    private final Context f9622a;

    public dfp(Context context) {
        this.f9622a = context;
    }

    public boolean mo1521a(boolean z, boolean z2) {
        return m11609a(z, z2, false) == 0;
    }

    void m11614a(Activity activity) {
        if (m11613a(true) != 0) {
            Object action = activity.getIntent().getAction();
            Intent intent = new Intent(activity, GmsInstallActivity.class);
            intent.putExtra("from_main_launcher", TextUtils.equals(action, "android.intent.action.MAIN"));
            intent.setAction(action);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    public int m11613a(boolean z) {
        return m11609a(false, false, z);
    }

    private int m11609a(boolean z, boolean z2, boolean z3) {
        int b = m11611b(z2, z3);
        if (b == 0) {
            ((NotificationManager) this.f9622a.getSystemService("notification")).cancel(m11612b(), 8);
        } else if (z) {
            CharSequence string = this.f9622a.getString(gwb.pQ);
            CharSequence string2 = this.f9622a.getString(gwb.pR);
            PendingIntent activity = PendingIntent.getActivity(this.f9622a, gks.m17890a(8), gwb.m2212g(null), 134217728);
            ((NotificationManager) this.f9622a.getSystemService("notification")).notify(m11612b(), 8, new fx(this.f9622a).m16417a(gwb.pP).m16440c(string).m16419a(System.currentTimeMillis()).m16429a(string2).m16436b(string).m16421a(activity).m16433b());
        }
        return b;
    }

    private int m11611b(boolean z, boolean z2) {
        int i = 0;
        if (z || !m11610a()) {
            if (gwb.m1406I()) {
                glk.m17981d("Babel", "Bypass GmsCore for robolectric.", new Object[0]);
            } else {
                i = gtt.m18579a(this.f9622a);
            }
            PreferenceManager.getDefaultSharedPreferences(this.f9622a).edit().putInt("gms_core_status_code", i).apply();
            return i;
        }
        ba.m4609b(m11610a());
        int i2 = PreferenceManager.getDefaultSharedPreferences(this.f9622a).getInt("gms_core_status_code", -1);
        return (!z2 || i2 == 0) ? i2 : m11611b(true, false);
    }

    private boolean m11610a() {
        return PreferenceManager.getDefaultSharedPreferences(this.f9622a).contains("gms_core_status_code");
    }

    private String m11612b() {
        return String.valueOf(this.f9622a.getPackageName()).concat(":gmscore");
    }
}
