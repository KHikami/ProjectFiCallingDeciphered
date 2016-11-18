package p000;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public abstract class hv<D> extends ig<D> {
    volatile hw f783a;
    volatile hw f784b;
    long f785c;
    long f786d;
    Handler f787e;
    private final Executor f788f;

    public abstract D mo213d();

    public hv(Context context) {
        this(context, io.f17402c);
    }

    private hv(Context context, Executor executor) {
        super(context);
        this.f786d = -10000;
        this.f788f = executor;
    }

    protected void mo207a() {
        super.mo207a();
        m1292u();
        this.f783a = new hw(this);
        m1304c();
    }

    protected boolean mo209b() {
        boolean z = false;
        if (this.f783a != null) {
            if (this.f784b != null) {
                if (this.f783a.f17409a) {
                    this.f783a.f17409a = false;
                    this.f787e.removeCallbacks(this.f783a);
                }
                this.f783a = null;
            } else if (this.f783a.f17409a) {
                this.f783a.f17409a = false;
                this.f787e.removeCallbacks(this.f783a);
                this.f783a = null;
            } else {
                z = this.f783a.f17406e.cancel(false);
                if (z) {
                    this.f784b = this.f783a;
                    mo217f();
                }
                this.f783a = null;
            }
        }
        return z;
    }

    public void mo210a(D d) {
    }

    void m1304c() {
        if (this.f784b == null && this.f783a != null) {
            if (this.f783a.f17409a) {
                this.f783a.f17409a = false;
                this.f787e.removeCallbacks(this.f783a);
            }
            if (this.f785c <= 0 || SystemClock.uptimeMillis() >= this.f786d + this.f785c) {
                io ioVar = this.f783a;
                Executor executor = this.f788f;
                if (ioVar.f17407f != iu.f19021a) {
                    switch (ir.f18745a[ioVar.f17407f - 1]) {
                        case 1:
                            throw new IllegalStateException("Cannot execute task: the task is already running.");
                        case 2:
                            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                }
                ioVar.f17407f = iu.f19022b;
                ioVar.f17405d.f19084a = null;
                executor.execute(ioVar.f17406e);
                return;
            }
            this.f783a.f17409a = true;
            this.f787e.postAtTime(this.f783a, this.f786d + this.f785c);
        }
    }

    void m1299a(hw hwVar, D d) {
        mo210a(d);
        if (this.f784b == hwVar) {
            m1271B();
            this.f786d = SystemClock.uptimeMillis();
            this.f784b = null;
            m1285n();
            m1304c();
        }
    }

    void m1302b(hw hwVar, D d) {
        if (this.f783a != hwVar) {
            m1299a(hwVar, d);
        } else if (m1289r()) {
            mo210a(d);
        } else {
            m1270A();
            this.f786d = SystemClock.uptimeMillis();
            this.f783a = null;
            mo212b((Object) d);
        }
    }

    protected D m1306e() {
        return mo213d();
    }

    public void mo217f() {
    }

    public boolean m1308g() {
        return this.f784b != null;
    }

    public void mo208a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo208a(str, fileDescriptor, printWriter, strArr);
        if (this.f783a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f783a);
            printWriter.print(" waiting=");
            printWriter.println(this.f783a.f17409a);
        }
        if (this.f784b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f784b);
            printWriter.print(" waiting=");
            printWriter.println(this.f784b.f17409a);
        }
        if (this.f785c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            lq.m29989a(this.f785c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            lq.m29988a(this.f786d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
