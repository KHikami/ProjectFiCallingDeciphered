package p000;

import android.content.Context;

public final class dph {
    public static boolean m12416a(Context context) {
        if (gwb.m1906a(context, "babel_healthcheck_memory_enabled", false) || gwb.m1906a(context, "babel_healthcheck_timer_enabled", false) || gwb.m1906a(context, "babel_healthcheck_crash_enabled", false) || gwb.m1906a(context, "babel_healthcheck_package_enabled", false)) {
            return true;
        }
        return false;
    }

    public iyd m12417b(Context context) {
        boolean a = gwb.m1906a(context, "babel_healthcheck_memory_enabled", false);
        glk.m17979c("Babel_Prime", "isMemoryEnabled=" + a, new Object[0]);
        return new dpi(this, a);
    }

    public iym m12418c(Context context) {
        boolean a = gwb.m1906a(context, "babel_healthcheck_timer_enabled", false);
        glk.m17979c("Babel_Prime", "isTimerEnabled=" + a, new Object[0]);
        return new dpj(this, a);
    }

    public ixw m12419d(Context context) {
        boolean a = gwb.m1906a(context, "babel_healthcheck_crash_enabled", false);
        glk.m17979c("Babel_Prime", "isCrashCounterEnabled=" + a, new Object[0]);
        return new dpk(this, a);
    }
}
