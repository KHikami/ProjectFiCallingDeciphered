package defpackage;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

/* renamed from: bmn */
public final class bmn implements UncaughtExceptionHandler {
    final UncaughtExceptionHandler a;
    private final bmx b;
    private final Context c;
    private bmm d;
    private bmo e;

    public bmn(bmx bmx, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (bmx == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context == null) {
            throw new NullPointerException("context cannot be null");
        } else {
            this.a = uncaughtExceptionHandler;
            this.b = bmx;
            this.d = new bmw(context, new ArrayList());
            this.c = context.getApplicationContext();
            bpn.b("ExceptionReporter created, original handler is " + (uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName()));
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.d != null) {
            str = this.d.a(thread != null ? thread.getName() : null, th);
        }
        bpn.b("Reporting uncaught exception: " + str);
        bmx bmx = this.b;
        bmt bmt = new bmt();
        bmt.a("&exd", str);
        bmt.a("&exf", bpq.a(true));
        bmx.a(bmt.a());
        if (this.e == null) {
            this.e = bmo.a(this.c);
        }
        bmb bmb = this.e;
        bmb.a.c().b();
        bmb.a.c().c();
        if (this.a != null) {
            bpn.b("Passing exception to the original handler");
            this.a.uncaughtException(thread, th);
        }
    }
}
