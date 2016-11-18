package p000;

import android.preference.PreferenceManager;

final class bdd implements Runnable {
    final /* synthetic */ Throwable f3079a;
    final /* synthetic */ boolean f3080b;
    final /* synthetic */ Thread f3081c;
    final /* synthetic */ bdc f3082d;

    bdd(bdc bdc, Throwable th, boolean z, Thread thread) {
        this.f3082d = bdc;
        this.f3079a = th;
        this.f3080b = z;
        this.f3081c = thread;
    }

    public void run() {
        bdc bdc = this.f3082d;
        Throwable th = this.f3079a;
        gmp gmp = (gmp) jyn.m25426a(bdc.f3077a, gmp.class);
        if (!gmp.mo2298a() && (gmp.mo2299b() || gwb.m1906a(bdc.f3077a, "babel_send_silent_crash_feedback", false))) {
            jxp.m25389a(bdc.f3077a, th, String.valueOf(bdc.f3077a.getPackageName()).concat(".SILENT_CRASH_REPORT"));
            PreferenceManager.getDefaultSharedPreferences(bdc.f3077a).edit().putBoolean("sent_silent_feedback", true).commit();
        }
        if (this.f3079a.getClass().equals(OutOfMemoryError.class)) {
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.freeMemory();
            glk.m17982e("Babel_App", "Out of memory error. Free: " + freeMemory + " Total: " + runtime.totalMemory(), new Object[0]);
        }
        if (this.f3080b && this.f3082d.f3078b != null) {
            this.f3082d.f3078b.uncaughtException(this.f3081c, this.f3079a);
        }
    }
}
