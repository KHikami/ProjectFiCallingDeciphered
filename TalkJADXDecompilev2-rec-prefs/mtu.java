package p000;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class mtu {
    private String f28297a = null;
    private Boolean f28298b = null;
    private Integer f28299c = null;
    private UncaughtExceptionHandler f28300d = null;
    private ThreadFactory f28301e = null;

    public mtu m32893a(String str) {
        mtu.m32891a(str, Integer.valueOf(0));
        this.f28297a = str;
        return this;
    }

    public mtu m32896a(boolean z) {
        this.f28298b = Boolean.valueOf(z);
        return this;
    }

    public mtu m32894a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f28300d = (UncaughtExceptionHandler) bm.m6122a((Object) uncaughtExceptionHandler);
        return this;
    }

    public mtu m32895a(ThreadFactory threadFactory) {
        this.f28301e = (ThreadFactory) bm.m6122a((Object) threadFactory);
        return this;
    }

    static String m32891a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory m32892a() {
        ThreadFactory threadFactory;
        String str = this.f28297a;
        Boolean bool = this.f28298b;
        Integer num = this.f28299c;
        UncaughtExceptionHandler uncaughtExceptionHandler = this.f28300d;
        if (this.f28301e != null) {
            threadFactory = this.f28301e;
        } else {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new mtv(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
    }
}
