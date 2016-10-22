package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: hv */
public abstract class hv<D> extends ig<D> {
    volatile hw a;
    volatile hw b;
    long c;
    long d;
    Handler e;
    private final Executor f;

    public abstract D d();

    public hv(Context context) {
        this(context, io.c);
    }

    private hv(Context context, Executor executor) {
        super(context);
        this.d = -10000;
        this.f = executor;
    }

    protected void a() {
        super.a();
        u();
        this.a = new hw(this);
        c();
    }

    protected boolean b() {
        boolean z = false;
        if (this.a != null) {
            if (this.b != null) {
                if (this.a.a) {
                    this.a.a = false;
                    this.e.removeCallbacks(this.a);
                }
                this.a = null;
            } else if (this.a.a) {
                this.a.a = false;
                this.e.removeCallbacks(this.a);
                this.a = null;
            } else {
                z = this.a.e.cancel(false);
                if (z) {
                    this.b = this.a;
                    f();
                }
                this.a = null;
            }
        }
        return z;
    }

    public void a(D d) {
    }

    void c() {
        if (this.b == null && this.a != null) {
            if (this.a.a) {
                this.a.a = false;
                this.e.removeCallbacks(this.a);
            }
            if (this.c <= 0 || SystemClock.uptimeMillis() >= this.d + this.c) {
                io ioVar = this.a;
                Executor executor = this.f;
                if (ioVar.f != iu.a) {
                    switch (ir.a[ioVar.f - 1]) {
                        case wi.j /*1*/:
                            throw new IllegalStateException("Cannot execute task: the task is already running.");
                        case wi.l /*2*/:
                            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                }
                ioVar.f = iu.b;
                ioVar.d.a = null;
                executor.execute(ioVar.e);
                return;
            }
            this.a.a = true;
            this.e.postAtTime(this.a, this.d + this.c);
        }
    }

    void a(hw hwVar, D d) {
        a(d);
        if (this.b == hwVar) {
            B();
            this.d = SystemClock.uptimeMillis();
            this.b = null;
            n();
            c();
        }
    }

    void b(hw hwVar, D d) {
        if (this.a != hwVar) {
            a(hwVar, d);
        } else if (r()) {
            a(d);
        } else {
            A();
            this.d = SystemClock.uptimeMillis();
            this.a = null;
            b((Object) d);
        }
    }

    protected D e() {
        return d();
    }

    public void f() {
    }

    public boolean g() {
        return this.b != null;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            printWriter.println(this.a.a);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.b);
            printWriter.print(" waiting=");
            printWriter.println(this.b.a);
        }
        if (this.c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            lq.a(this.c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            lq.a(this.d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
