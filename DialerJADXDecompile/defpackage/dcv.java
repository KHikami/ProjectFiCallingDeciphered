package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: dcv */
public final class dcv {
    private String a;
    private Boolean b;
    private Integer c;
    private UncaughtExceptionHandler d;
    private ThreadFactory e;

    public dcv() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final dcv a(String str) {
        dcv.a(str, Integer.valueOf(0));
        this.a = str;
        return this;
    }

    public final dcv a(boolean z) {
        this.b = Boolean.valueOf(true);
        return this;
    }

    public final ThreadFactory a() {
        String str = this.a;
        return new dcw(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0) : null, this.b, null, null);
    }

    static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }
}
