package defpackage;

import android.content.Context;

/* renamed from: dph */
public final class dph {
    public static boolean a(Context context) {
        if (gwb.a(context, "babel_healthcheck_memory_enabled", false) || gwb.a(context, "babel_healthcheck_timer_enabled", false) || gwb.a(context, "babel_healthcheck_crash_enabled", false) || gwb.a(context, "babel_healthcheck_package_enabled", false)) {
            return true;
        }
        return false;
    }

    public iyd b(Context context) {
        boolean a = gwb.a(context, "babel_healthcheck_memory_enabled", false);
        glk.c("Babel_Prime", "isMemoryEnabled=" + a, new Object[0]);
        return new dpi(this, a);
    }

    public iym c(Context context) {
        boolean a = gwb.a(context, "babel_healthcheck_timer_enabled", false);
        glk.c("Babel_Prime", "isTimerEnabled=" + a, new Object[0]);
        return new dpj(this, a);
    }

    public ixw d(Context context) {
        boolean a = gwb.a(context, "babel_healthcheck_crash_enabled", false);
        glk.c("Babel_Prime", "isCrashCounterEnabled=" + a, new Object[0]);
        return new dpk(this, a);
    }
}
