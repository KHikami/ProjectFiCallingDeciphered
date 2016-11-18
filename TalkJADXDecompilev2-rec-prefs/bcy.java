package p000;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;

final class bcy extends bcq implements bcp, bcr {
    private final Context f3066a;
    private volatile boolean f3067b;

    public bcy(Context context) {
        this.f3066a = context;
    }

    public long mo464a() {
        return PreferenceManager.getDefaultSharedPreferences(this.f3066a).getLong("first_launch", 0);
    }

    public boolean mo468b() {
        return this.f3067b;
    }

    protected void mo465a(Activity activity) {
        this.f3067b = true;
    }

    protected void mo467b(Activity activity) {
        this.f3067b = false;
    }

    public void mo466a(Context context, boolean z, bcs bcs) {
        if (z) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("first_launch", glj.m17956a()).apply();
        }
    }
}
