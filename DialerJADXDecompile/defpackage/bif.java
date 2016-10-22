package defpackage;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: bif */
public final class bif implements UncaughtExceptionHandler {
    private final Context a;
    private final UncaughtExceptionHandler b;
    private final brc c;

    public bif(Context context, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = context;
        this.c = new brd(this.a).a(cka.b).b();
        this.c.b();
        this.b = uncaughtExceptionHandler;
    }

    private final synchronized void a(Throwable th) {
        if (this.c.d()) {
            buf.a("SilentCrashReporter, mApiClient was connected in sendSilentFeedback", new Object[0]);
        } else {
            buf.a("SilentCrashReporter, mApiClient was not connected in sendSilentFeedback", new Object[0]);
        }
        ckf ckg = new ckg(th);
        ckg.c = "com.google.android.dialer.SILENT_CRASH_REPORT";
        ckg.d = true;
        String str = "[SilentFeedBackException] ";
        String valueOf = String.valueOf(th.toString());
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        ckg.b = valueOf;
        cka.b(this.c, ckg.a());
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        buf.a("SilentCrashReporter, sendSilentFeedback", th);
        a(th);
        this.b.uncaughtException(thread, th);
    }
}
