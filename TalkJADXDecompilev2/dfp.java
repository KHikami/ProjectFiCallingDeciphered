package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.gms.impl.GmsInstallActivity;

public final class dfp implements dfm {
    private final Context a;

    public dfp(Context context) {
        this.a = context;
    }

    public boolean a(boolean z, boolean z2) {
        return a(z, z2, false) == 0;
    }

    void a(Activity activity) {
        if (a(true) != 0) {
            Object action = activity.getIntent().getAction();
            Intent intent = new Intent(activity, GmsInstallActivity.class);
            intent.putExtra("from_main_launcher", TextUtils.equals(action, "android.intent.action.MAIN"));
            intent.setAction(action);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    public int a(boolean z) {
        return a(false, false, z);
    }

    private int a(boolean z, boolean z2, boolean z3) {
        int b = b(z2, z3);
        if (b == 0) {
            ((NotificationManager) this.a.getSystemService("notification")).cancel(b(), 8);
        } else if (z) {
            CharSequence string = this.a.getString(gwb.pQ);
            CharSequence string2 = this.a.getString(gwb.pR);
            PendingIntent activity = PendingIntent.getActivity(this.a, gks.a(8), gwb.g(null), 134217728);
            ((NotificationManager) this.a.getSystemService("notification")).notify(b(), 8, new fx(this.a).a(gwb.pP).c(string).a(System.currentTimeMillis()).a(string2).b(string).a(activity).b());
        }
        return b;
    }

    private int b(boolean z, boolean z2) {
        int i = 0;
        if (z || !a()) {
            if (gwb.I()) {
                glk.d("Babel", "Bypass GmsCore for robolectric.", new Object[0]);
            } else {
                i = gtt.a(this.a);
            }
            PreferenceManager.getDefaultSharedPreferences(this.a).edit().putInt("gms_core_status_code", i).apply();
            return i;
        }
        ba.b(a());
        int i2 = PreferenceManager.getDefaultSharedPreferences(this.a).getInt("gms_core_status_code", -1);
        return (!z2 || i2 == 0) ? i2 : b(true, false);
    }

    private boolean a() {
        return PreferenceManager.getDefaultSharedPreferences(this.a).contains("gms_core_status_code");
    }

    private String b() {
        return String.valueOf(this.a.getPackageName()).concat(":gmscore");
    }
}
