package defpackage;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;

final class bcy extends bcq implements bcp, bcr {
    private final Context a;
    private volatile boolean b;

    public bcy(Context context) {
        this.a = context;
    }

    public long a() {
        return PreferenceManager.getDefaultSharedPreferences(this.a).getLong("first_launch", 0);
    }

    public boolean b() {
        return this.b;
    }

    protected void a(Activity activity) {
        this.b = true;
    }

    protected void b(Activity activity) {
        this.b = false;
    }

    public void a(Context context, boolean z, bcs bcs) {
        if (z) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("first_launch", glj.a()).apply();
        }
    }
}
