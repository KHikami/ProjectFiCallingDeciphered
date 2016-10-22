import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.TimeUnit;

public final class bdc implements bcu {
    private static final boolean c;
    final Context a;
    final UncaughtExceptionHandler b;

    static {
        kae kae = new kae("debug.chat.crashinfo", (byte) 0);
        c = false;
    }

    bdc(Context context) {
        this.a = context;
        this.b = Thread.getDefaultUncaughtExceptionHandler();
    }

    public void a(boolean z) {
        UncaughtExceptionHandler a;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        Context context = this.a;
        Context context2 = this.a;
        if (dph.a(context2)) {
            glk.c("Babel_Prime", "wrapCrashReportingIntoUncaughtExceptionHandler", new Object[0]);
            a = ((ixk) jyn.a(context2, ixk.class)).a((UncaughtExceptionHandler) this);
        } else {
            glk.a("Babel_Prime", "Primes crash monitoring is disabled", new Object[0]);
            a = this;
        }
        Thread.setDefaultUncaughtExceptionHandler(new kag(context, a, new kah()));
        if (z) {
            PreferenceManager.getDefaultSharedPreferences(this.a).edit().putInt("crashes", 0).putLong("last_crash", 0).putLong("mttf_crash", 0).apply();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        if (z) {
            i = 0;
        } else {
            i = defaultSharedPreferences.getInt("launches", 0);
        }
        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this.a);
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
            i2 = bde.a;
        } else if (z2) {
            i2 = bde.c;
        } else {
            i2 = bde.b;
        }
        if (i2 != bde.a) {
            int i3 = 1;
        } else {
            boolean z4 = false;
        }
        if (i3 != 0) {
            int i4;
            SharedPreferences defaultSharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(this.a);
            glk.e("Babel_App", "Startup - recovered from crash. Launches: %s exception class:  %s", Integer.valueOf(i), defaultSharedPreferences3.getString("exception_class", null));
            mcn mcn = new mcn();
            if (b() == 1) {
                i4 = 1;
            } else {
                z2 = false;
            }
            if (i4 != 0) {
                long j = defaultSharedPreferences3.getLong("last_crash", 0) - ((bcr) jyn.a(this.a, bcr.class)).a();
                glk.e("Babel_App", "Startup - first crash since version change: " + j, new Object[0]);
                mcn.c = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(j));
            }
            mcn.b = Integer.valueOf(i);
            if (c() > 0) {
                mcn.d = Integer.valueOf(c());
            }
            mcn.a = r7;
            e().b().a(mcn).c(2369);
            if (i2 == bde.c) {
                e().b().c(3386);
            }
            defaultSharedPreferences = this.a.getSharedPreferences(dhe.class.getName(), 0);
            if (TextUtils.isEmpty(defaultSharedPreferences.getString("ONGOING_CALL_SESSION", ""))) {
                z2 = false;
            } else {
                defaultSharedPreferences.edit().remove("ONGOING_CALL_SESSION").apply();
                z2 = true;
            }
            if (z2) {
                e().b().c(2714);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
            z3 = defaultSharedPreferences.getBoolean("was_platform_bug", false);
            if (z3) {
                defaultSharedPreferences.edit().putBoolean("was_platform_bug", false).commit();
            }
            if (z3) {
                e().b().c(2955);
            }
            if (c) {
                d();
            }
        } else {
            glk.c("Babel_App", "Startup - clean", new Object[0]);
        }
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        if (i3 != 0) {
            defaultSharedPreferences.edit().putInt("launches", 1).apply();
        } else {
            defaultSharedPreferences.edit().putInt("launches", i + 1).apply();
        }
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        boolean z5 = defaultSharedPreferences.getBoolean("processing_push", false);
        if (z5) {
            defaultSharedPreferences.edit().putBoolean("processing_push", false).commit();
        }
        if (z5) {
            glk.e("Babel_App", "wasProcessingPush is set; force sync", new Object[0]);
            e().b().c(2370);
            RealTimeChatService.a(flt.PUSH_FAILED_RESYNC);
        }
        if (kag.b(this.a)) {
            e().b().c(2956);
        }
    }

    public void a() {
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putBoolean("processing_push", true).commit();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        a(thread, th, false, true);
    }

    private int b() {
        return PreferenceManager.getDefaultSharedPreferences(this.a).getInt("crashes", 0);
    }

    private int c() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(PreferenceManager.getDefaultSharedPreferences(this.a).getLong("mttf_crash", 0));
    }

    private void d() {
        for (Integer a : bkq.a(this.a)) {
            gwb.l(this.a, gwb.a(a, -1));
        }
    }

    private iid e() {
        return ((iih) jyn.a(this.a, iih.class)).a(fde.c(this.a));
    }

    public void a(Thread thread, Throwable th, boolean z, boolean z2) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        long j = defaultSharedPreferences.getLong("last_crash", 0);
        long a = glj.a();
        Editor edit = defaultSharedPreferences.edit();
        edit.putBoolean("crashed", true).putInt("crashes", b() + 1).putLong("last_crash", a).putString("exception_class", th.getClass().getName()).putBoolean("was_platform_bug", z);
        if (j > 0) {
            edit.putLong("mttf_crash", a - j);
        }
        edit.commit();
        Runnable bdd = new bdd(this, th, z2, thread);
        if ((!gwb.aI() ? 1 : null) != null) {
            String valueOf = String.valueOf(thread);
            glk.d("Babel_App", new StringBuilder(String.valueOf(valueOf).length() + 40).append("Uncaught exception in background thread ").append(valueOf).toString(), th);
            gwb.a(bdd);
            return;
        }
        bdd.run();
    }
}
