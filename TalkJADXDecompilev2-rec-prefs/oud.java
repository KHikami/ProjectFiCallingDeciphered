package p000;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.TraceEvent;

public final class oud extends ouc implements IdleHandler {
    private long f34292a = 0;
    private long f34293b = 0;
    private int f34294c = 0;
    private int f34295d = 0;
    private int f34296e = 0;
    private boolean f34297f = false;

    final void mo4226a(String str) {
        if (this.f34296e == 0) {
            TraceEvent.a("Looper.queueIdle");
        }
        this.f34293b = SystemClock.elapsedRealtime();
        m39726a();
        super.mo4226a(str);
    }

    final void mo4227b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f34293b;
        if (elapsedRealtime > 16) {
            oud.m39727a(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.mo4227b(str);
        m39726a();
        this.f34294c++;
        this.f34296e++;
    }

    private static void m39727a(int i, String str) {
        TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", str);
        Log.println(i, "TraceEvent.LooperMonitor", str);
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f34292a == 0) {
            this.f34292a = elapsedRealtime;
        }
        long j = elapsedRealtime - this.f34292a;
        this.f34295d++;
        TraceEvent.b("Looper.queueIdle", this.f34296e + " tasks since last idle.");
        if (j > 48) {
            oud.m39727a(3, this.f34294c + " tasks and " + this.f34295d + " idles processed so far, " + this.f34296e + " tasks bursted and " + j + "ms elapsed since last idle");
        }
        this.f34292a = elapsedRealtime;
        this.f34296e = 0;
        return true;
    }

    oud() {
    }

    private final void m39726a() {
        if (TraceEvent.a && !this.f34297f) {
            this.f34292a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f34297f = true;
        } else if (this.f34297f && !TraceEvent.a) {
            Looper.myQueue().removeIdleHandler(this);
            this.f34297f = false;
        }
    }
}
