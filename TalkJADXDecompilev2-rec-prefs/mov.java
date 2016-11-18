package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class mov {
    public abstract String formatImpl(String str, Object obj);

    public abstract mor getBackendImpl(String str);

    public abstract mox getCallerFinderImpl();

    public abstract String getConfigInfoImpl();

    protected boolean shouldForceLoggingImpl(String str, Level level, boolean z) {
        return false;
    }

    protected long getCurrentTimeMicrosImpl() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static mox getCallerFinder() {
        return mow.f28028a.getCallerFinderImpl();
    }

    public static mor getBackend(String str) {
        return mow.f28028a.getBackendImpl(str);
    }

    public static boolean shouldForceLogging(String str, Level level, boolean z) {
        return mow.f28028a.shouldForceLoggingImpl(str, level, z);
    }

    public static moy getInjectedTags() {
        return mow.f28028a.getInjectedTagsImpl();
    }

    protected moy getInjectedTagsImpl() {
        return moy.f28029a;
    }

    public static String format(String str, Object obj) {
        return mow.f28028a.formatImpl(str, obj);
    }

    public static long getCurrentTimeMicros() {
        return mow.f28028a.getCurrentTimeMicrosImpl();
    }

    public static String getConfigInfo() {
        return mow.f28028a.getConfigInfoImpl();
    }
}
