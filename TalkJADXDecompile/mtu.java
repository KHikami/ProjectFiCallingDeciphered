import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class mtu {
    private String a;
    private Boolean b;
    private Integer c;
    private UncaughtExceptionHandler d;
    private ThreadFactory e;

    public mtu() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public mtu a(String str) {
        a(str, Integer.valueOf(0));
        this.a = str;
        return this;
    }

    public mtu a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public mtu a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.d = (UncaughtExceptionHandler) bm.a((Object) uncaughtExceptionHandler);
        return this;
    }

    public mtu a(ThreadFactory threadFactory) {
        this.e = (ThreadFactory) bm.a((Object) threadFactory);
        return this;
    }

    static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory a() {
        ThreadFactory threadFactory;
        String str = this.a;
        Boolean bool = this.b;
        Integer num = this.c;
        UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (this.e != null) {
            threadFactory = this.e;
        } else {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new mtv(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
    }
}
