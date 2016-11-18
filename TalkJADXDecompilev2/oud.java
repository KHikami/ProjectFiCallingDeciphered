package defpackage;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.TraceEvent;

public final class oud extends ouc implements IdleHandler {
    private long a = 0;
    private long b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private boolean f = false;

    final void a(String str) {
        if (this.e == 0) {
            TraceEvent.a("Looper.queueIdle");
        }
        this.b = SystemClock.elapsedRealtime();
        a();
        super.a(str);
    }

    final void b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (elapsedRealtime > 16) {
            oud.a(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.b(str);
        a();
        this.c++;
        this.e++;
    }

    private static void a(int i, String str) {
        TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", str);
        Log.println(i, "TraceEvent.LooperMonitor", str);
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == 0) {
            this.a = elapsedRealtime;
        }
        long j = elapsedRealtime - this.a;
        this.d++;
        TraceEvent.b("Looper.queueIdle", this.e + " tasks since last idle.");
        if (j > 48) {
            oud.a(3, this.c + " tasks and " + this.d + " idles processed so far, " + this.e + " tasks bursted and " + j + "ms elapsed since last idle");
        }
        this.a = elapsedRealtime;
        this.e = 0;
        return true;
    }

    oud() {
    }

    private final void a() {
        if (TraceEvent.a && !this.f) {
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f = true;
        } else if (this.f && !TraceEvent.a) {
            Looper.myQueue().removeIdleHandler(this);
            this.f = false;
        }
    }
}
