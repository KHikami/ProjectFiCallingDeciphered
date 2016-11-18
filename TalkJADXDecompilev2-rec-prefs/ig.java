package p000;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ig<D> {
    int f774n;
    ij<D> f775o;
    ii<D> f776p;
    Context f777q;
    boolean f778r = false;
    boolean f779s = false;
    boolean f780t = true;
    boolean f781u = false;
    boolean f782v = false;

    public ig(Context context) {
        this.f777q = context.getApplicationContext();
    }

    public void mo212b(D d) {
        if (this.f775o != null) {
            this.f775o.mo2018a(this, d);
        }
    }

    public void m1285n() {
        if (this.f776p != null) {
            this.f776p.mo2019h();
        }
    }

    public Context m1286o() {
        return this.f777q;
    }

    public int m1287p() {
        return this.f774n;
    }

    public void m1274a(int i, ij<D> ijVar) {
        if (this.f775o != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f775o = ijVar;
        this.f774n = i;
    }

    public void m1276a(ij<D> ijVar) {
        if (this.f775o == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f775o != ijVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f775o = null;
        }
    }

    public void m1275a(ii<D> iiVar) {
        if (this.f776p != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f776p = iiVar;
    }

    public void m1278b(ii<D> iiVar) {
        if (this.f776p == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f776p != iiVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f776p = null;
        }
    }

    public boolean m1288q() {
        return this.f778r;
    }

    public boolean m1289r() {
        return this.f779s;
    }

    public boolean m1290s() {
        return this.f780t;
    }

    public final void m1291t() {
        this.f778r = true;
        this.f780t = false;
        this.f779s = false;
        mo214i();
    }

    public void mo214i() {
    }

    public boolean m1292u() {
        return mo209b();
    }

    protected boolean mo209b() {
        return false;
    }

    public void m1293v() {
        mo207a();
    }

    protected void mo207a() {
    }

    public void m1294w() {
        this.f778r = false;
        mo215j();
    }

    public void mo215j() {
    }

    public void m1295x() {
        this.f779s = true;
    }

    public void m1296y() {
        mo216k();
        this.f780t = true;
        this.f778r = false;
        this.f779s = false;
        this.f781u = false;
        this.f782v = false;
    }

    public void mo216k() {
    }

    public boolean m1297z() {
        boolean z = this.f781u;
        this.f781u = false;
        this.f782v |= z;
        return z;
    }

    public void m1270A() {
        this.f782v = false;
    }

    public void m1271B() {
        if (this.f782v) {
            m1272C();
        }
    }

    public void m1272C() {
        if (this.f778r) {
            m1293v();
        } else {
            this.f781u = true;
        }
    }

    public String m1281c(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        gwb.m1860a((Object) d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        gwb.m1860a((Object) this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f774n);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void mo208a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f774n);
        printWriter.print(" mListener=");
        printWriter.println(this.f775o);
        if (this.f778r || this.f781u || this.f782v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f778r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f781u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f782v);
        }
        if (this.f779s || this.f780t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f779s);
            printWriter.print(" mReset=");
            printWriter.println(this.f780t);
        }
    }
}
