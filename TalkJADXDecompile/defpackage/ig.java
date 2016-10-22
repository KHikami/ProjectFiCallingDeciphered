package defpackage;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ig */
public class ig<D> {
    int n;
    ij<D> o;
    ii<D> p;
    Context q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;

    public ig(Context context) {
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = false;
        this.v = false;
        this.q = context.getApplicationContext();
    }

    public void b(D d) {
        if (this.o != null) {
            this.o.a(this, d);
        }
    }

    public void n() {
        if (this.p != null) {
            this.p.h();
        }
    }

    public Context o() {
        return this.q;
    }

    public int p() {
        return this.n;
    }

    public void a(int i, ij<D> ijVar) {
        if (this.o != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.o = ijVar;
        this.n = i;
    }

    public void a(ij<D> ijVar) {
        if (this.o == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.o != ijVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.o = null;
        }
    }

    public void a(ii<D> iiVar) {
        if (this.p != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.p = iiVar;
    }

    public void b(ii<D> iiVar) {
        if (this.p == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.p != iiVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.p = null;
        }
    }

    public boolean q() {
        return this.r;
    }

    public boolean r() {
        return this.s;
    }

    public boolean s() {
        return this.t;
    }

    public final void t() {
        this.r = true;
        this.t = false;
        this.s = false;
        i();
    }

    public void i() {
    }

    public boolean u() {
        return b();
    }

    protected boolean b() {
        return false;
    }

    public void v() {
        a();
    }

    protected void a() {
    }

    public void w() {
        this.r = false;
        j();
    }

    public void j() {
    }

    public void x() {
        this.s = true;
    }

    public void y() {
        k();
        this.t = true;
        this.r = false;
        this.s = false;
        this.u = false;
        this.v = false;
    }

    public void k() {
    }

    public boolean z() {
        boolean z = this.u;
        this.u = false;
        this.v |= z;
        return z;
    }

    public void A() {
        this.v = false;
    }

    public void B() {
        if (this.v) {
            C();
        }
    }

    public void C() {
        if (this.r) {
            v();
        } else {
            this.u = true;
        }
    }

    public String c(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        gwb.a((Object) d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        gwb.a((Object) this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.n);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.n);
        printWriter.print(" mListener=");
        printWriter.println(this.o);
        if (this.r || this.u || this.v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.v);
        }
        if (this.s || this.t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.s);
            printWriter.print(" mReset=");
            printWriter.println(this.t);
        }
    }
}
