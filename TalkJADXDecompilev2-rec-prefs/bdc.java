package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.TimeUnit;

public final class bdc implements bcu {
    private static final boolean f3076c = false;
    final Context f3077a;
    final UncaughtExceptionHandler f3078b = Thread.getDefaultUncaughtExceptionHandler();

    static {
        kae kae = new kae("debug.chat.crashinfo", (byte) 0);
    }

    bdc(Context context) {
        this.f3077a = context;
    }

    public void mo474a(boolean z) {
        UncaughtExceptionHandler a;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        Context context = this.f3077a;
        Context context2 = this.f3077a;
        if (dph.m12416a(context2)) {
            glk.m17979c("Babel_Prime", "wrapCrashReportingIntoUncaughtExceptionHandler", new Object[0]);
            a = ((ixk) jyn.m25426a(context2, ixk.class)).m23446a((UncaughtExceptionHandler) this);
        } else {
            glk.m17970a("Babel_Prime", "Primes crash monitoring is disabled", new Object[0]);
            a = this;
        }
        Thread.setDefaultUncaughtExceptionHandler(new kag(context, a, new kah()));
        if (z) {
            PreferenceManager.getDefaultSharedPreferences(this.f3077a).edit().putInt("crashes", 0).putLong("last_crash", 0).putLong("mttf_crash", 0).apply();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
        if (z) {
            i = 0;
        } else {
            i = defaultSharedPreferences.getInt("launches", 0);
        }
        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
        if (z) {
            z2 = false;
            z3 = false;
        } else {
            z3 = defaultSharedPreferences2.getBoolean("crashed", false);
            z2 = defaultSharedPreferences2.getBoolean("sent_silent_feedback", false);
        }
        if (z || z3) {
            defaultSharedPreferences2.edit().putBoolean("crashed", false).putBoolean("sent_silent_feedback", false).commit();
        }
        if (!z3) {
            i2 = bde.f3083a;
        } else if (z2) {
            i2 = bde.f3085c;
        } else {
            i2 = bde.f3084b;
        }
        if (i2 != bde.f3083a) {
            int i3 = 1;
        } else {
            boolean z4 = false;
        }
        if (i3 != 0) {
            int i4;
            SharedPreferences defaultSharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
            glk.m17982e("Babel_App", "Startup - recovered from crash. Launches: %s exception class:  %s", Integer.valueOf(i), defaultSharedPreferences3.getString("exception_class", null));
            mcn mcn = new mcn();
            if (m4955b() == 1) {
                i4 = 1;
            } else {
                z2 = false;
            }
            if (i4 != 0) {
                long j = defaultSharedPreferences3.getLong("last_crash", 0) - ((bcr) jyn.m25426a(this.f3077a, bcr.class)).mo464a();
                glk.m17982e("Babel_App", "Startup - first crash since version change: " + j, new Object[0]);
                mcn.f27342c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(j));
            }
            mcn.f27341b = Integer.valueOf(i);
            if (m4956c() > 0) {
                mcn.f27343d = Integer.valueOf(m4956c());
            }
            mcn.f27340a = r7;
            m4958e().mo1693b().mo1703a(mcn).mo1714c(2369);
            if (i2 == bde.f3085c) {
                m4958e().mo1693b().mo1714c(3386);
            }
            defaultSharedPreferences = this.f3077a.getSharedPreferences(dhe.class.getName(), 0);
            if (TextUtils.isEmpty(defaultSharedPreferences.getString("ONGOING_CALL_SESSION", ""))) {
                z2 = false;
            } else {
                defaultSharedPreferences.edit().remove("ONGOING_CALL_SESSION").apply();
                z2 = true;
            }
            if (z2) {
                m4958e().mo1693b().mo1714c(2714);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
            z3 = defaultSharedPreferences.getBoolean("was_platform_bug", false);
            if (z3) {
                defaultSharedPreferences.edit().putBoolean("was_platform_bug", false).commit();
            }
            if (z3) {
                m4958e().mo1693b().mo1714c(2955);
            }
            if (f3076c) {
                m4957d();
            }
        } else {
            glk.m17979c("Babel_App", "Startup - clean", new Object[0]);
        }
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
        if (i3 != 0) {
            defaultSharedPreferences.edit().putInt("launches", 1).apply();
        } else {
            defaultSharedPreferences.edit().putInt("launches", i + 1).apply();
        }
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
        boolean z5 = defaultSharedPreferences.getBoolean("processing_push", false);
        if (z5) {
            defaultSharedPreferences.edit().putBoolean("processing_push", false).commit();
        }
        if (z5) {
            glk.m17982e("Babel_App", "wasProcessingPush is set; force sync", new Object[0]);
            m4958e().mo1693b().mo1714c(2370);
            RealTimeChatService.m9041a(flt.PUSH_FAILED_RESYNC);
        }
        if (kag.m25501b(this.f3077a)) {
            m4958e().mo1693b().mo1714c(2956);
        }
    }

    public void mo473a() {
        PreferenceManager.getDefaultSharedPreferences(this.f3077a).edit().putBoolean("processing_push", true).commit();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m4960a(thread, th, false, true);
    }

    private int m4955b() {
        return PreferenceManager.getDefaultSharedPreferences(this.f3077a).getInt("crashes", 0);
    }

    private int m4956c() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(PreferenceManager.getDefaultSharedPreferences(this.f3077a).getLong("mttf_crash", 0));
    }

    private void m4957d() {
        for (Integer a : bkq.m5662a(this.f3077a)) {
            gwb.m2286l(this.f3077a, gwb.m1508a(a, -1));
        }
    }

    private iid m4958e() {
        return ((iih) jyn.m25426a(this.f3077a, iih.class)).mo1979a(fde.m15011c(this.f3077a));
    }

    public void m4960a(Thread thread, Throwable th, boolean z, boolean z2) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3077a);
        long j = defaultSharedPreferences.getLong("last_crash", 0);
        long a = glj.m17956a();
        Editor edit = defaultSharedPreferences.edit();
        edit.putBoolean("crashed", true).putInt("crashes", m4955b() + 1).putLong("last_crash", a).putString("exception_class", th.getClass().getName()).putBoolean("was_platform_bug", z);
        if (j > 0) {
            edit.putLong("mttf_crash", a - j);
        }
        edit.commit();
        Runnable bdd = new bdd(this, th, z2, thread);
        if ((!gwb.aI() ? 1 : null) != null) {
            String valueOf = String.valueOf(thread);
            glk.m17980d("Babel_App", new StringBuilder(String.valueOf(valueOf).length() + 40).append("Uncaught exception in background thread ").append(valueOf).toString(), th);
            gwb.m1863a(bdd);
            return;
        }
        bdd.run();
    }
}
