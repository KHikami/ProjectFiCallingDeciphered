package defpackage;

import android.preference.PreferenceManager;

/* renamed from: bdd */
final class bdd implements Runnable {
    final /* synthetic */ Throwable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Thread c;
    final /* synthetic */ bdc d;

    bdd(bdc bdc, Throwable th, boolean z, Thread thread) {
        this.d = bdc;
        this.a = th;
        this.b = z;
        this.c = thread;
    }

    public void run() {
        bdc bdc = this.d;
        Throwable th = this.a;
        gmp gmp = (gmp) jyn.a(bdc.a, gmp.class);
        if (!gmp.a() && (gmp.b() || gwb.a(bdc.a, "babel_send_silent_crash_feedback", false))) {
            jxp.a(bdc.a, th, String.valueOf(bdc.a.getPackageName()).concat(".SILENT_CRASH_REPORT"));
            PreferenceManager.getDefaultSharedPreferences(bdc.a).edit().putBoolean("sent_silent_feedback", true).commit();
        }
        if (this.a.getClass().equals(OutOfMemoryError.class)) {
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.freeMemory();
            glk.e("Babel_App", "Out of memory error. Free: " + freeMemory + " Total: " + runtime.totalMemory(), new Object[0]);
        }
        if (this.b && this.d.b != null) {
            this.d.b.uncaughtException(this.c, this.a);
        }
    }
}
