package p000;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class fi extends fg {
    static boolean f13093a = false;
    final lp<fj> f13094b = new lp();
    final lp<fj> f13095c = new lp();
    final String f13096d;
    boolean f13097e;
    boolean f13098f;
    boolean f13099g;
    ec f13100h;

    fi(String str, ec ecVar, boolean z) {
        this.f13096d = str;
        this.f13100h = ecVar;
        this.f13097e = z;
    }

    void m15326a(ec ecVar) {
        this.f13100h = ecVar;
    }

    private fj m15322c(int i, Bundle bundle, fh<Object> fhVar) {
        fj fjVar = new fj(this, i, bundle, fhVar);
        fjVar.f13159d = fhVar.onCreateLoader(i, bundle);
        return fjVar;
    }

    private fj m15323d(int i, Bundle bundle, fh<Object> fhVar) {
        try {
            this.f13099g = true;
            fj c = m15322c(i, bundle, fhVar);
            m15327a(c);
            return c;
        } finally {
            this.f13099g = false;
        }
    }

    void m15327a(fj fjVar) {
        this.f13094b.m29845a(fjVar.f13156a, fjVar);
        if (this.f13097e) {
            fjVar.m15402a();
        }
    }

    public <D> ig<D> mo1994a(int i, Bundle bundle, fh<D> fhVar) {
        if (this.f13099g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        fj fjVar = (fj) this.f13094b.m29844a(i);
        if (f13093a) {
            new StringBuilder("initLoader in ").append(this).append(": args=").append(bundle);
        }
        if (fjVar == null) {
            fjVar = m15323d(i, bundle, fhVar);
            if (f13093a) {
                new StringBuilder("  Created new loader ").append(fjVar);
            }
        } else {
            if (f13093a) {
                new StringBuilder("  Re-using existing loader ").append(fjVar);
            }
            fjVar.f13158c = fhVar;
        }
        if (fjVar.f13160e && this.f13097e) {
            fjVar.m15406b(fjVar.f13159d, fjVar.f13162g);
        }
        return fjVar.f13159d;
    }

    public <D> ig<D> mo1998b(int i, Bundle bundle, fh<D> fhVar) {
        if (this.f13099g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        fj fjVar = (fj) this.f13094b.m29844a(i);
        if (f13093a) {
            new StringBuilder("restartLoader in ").append(this).append(": args=").append(bundle);
        }
        if (fjVar != null) {
            fj fjVar2 = (fj) this.f13095c.m29844a(i);
            if (fjVar2 != null) {
                if (fjVar.f13160e) {
                    if (f13093a) {
                        new StringBuilder("  Removing last inactive loader: ").append(fjVar);
                    }
                    fjVar2.f13161f = false;
                    fjVar2.m15411g();
                } else if (fjVar.m15410f()) {
                    if (fjVar.f13169n != null) {
                        if (f13093a) {
                            new StringBuilder("  Removing pending loader: ").append(fjVar.f13169n);
                        }
                        fjVar.f13169n.m15411g();
                        fjVar.f13169n = null;
                    }
                    fjVar.f13169n = m15322c(i, bundle, fhVar);
                    return fjVar.f13169n.f13159d;
                } else {
                    this.f13094b.m29845a(i, null);
                    fjVar.m15411g();
                }
            } else if (f13093a) {
                new StringBuilder("  Making last loader inactive: ").append(fjVar);
            }
            fjVar.f13159d.m1295x();
            this.f13095c.m29845a(i, fjVar);
        }
        return m15323d(i, bundle, fhVar).f13159d;
    }

    public void mo1995a(int i) {
        if (this.f13099g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f13093a) {
            new StringBuilder("destroyLoader in ").append(this).append(" of ").append(i);
        }
        int f = this.f13094b.m29851f(i);
        if (f >= 0) {
            fj fjVar = (fj) this.f13094b.m29850e(f);
            this.f13094b.m29848c(f);
            fjVar.m15411g();
        }
        f = this.f13095c.m29851f(i);
        if (f >= 0) {
            fjVar = (fj) this.f13095c.m29850e(f);
            this.f13095c.m29848c(f);
            fjVar.m15411g();
        }
        if (this.f13100h != null && !mo1996a()) {
            this.f13100h.f10793d.m13687f();
        }
    }

    public <D> ig<D> mo1997b(int i) {
        if (this.f13099g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        fj fjVar = (fj) this.f13094b.m29844a(i);
        if (fjVar == null) {
            return null;
        }
        if (fjVar.f13169n != null) {
            return fjVar.f13169n.f13159d;
        }
        return fjVar.f13159d;
    }

    void m15332b() {
        if (f13093a) {
            new StringBuilder("Starting in ").append(this);
        }
        if (this.f13097e) {
            new RuntimeException("here").fillInStackTrace();
            new StringBuilder("Called doStart when already started: ").append(this);
            return;
        }
        this.f13097e = true;
        for (int a = this.f13094b.m29843a() - 1; a >= 0; a--) {
            ((fj) this.f13094b.m29850e(a)).m15402a();
        }
    }

    void m15333c() {
        if (f13093a) {
            new StringBuilder("Stopping in ").append(this);
        }
        if (this.f13097e) {
            for (int a = this.f13094b.m29843a() - 1; a >= 0; a--) {
                ((fj) this.f13094b.m29850e(a)).m15409e();
            }
            this.f13097e = false;
            return;
        }
        new RuntimeException("here").fillInStackTrace();
        new StringBuilder("Called doStop when not started: ").append(this);
    }

    void m15334d() {
        if (f13093a) {
            new StringBuilder("Retaining in ").append(this);
        }
        if (this.f13097e) {
            this.f13098f = true;
            this.f13097e = false;
            for (int a = this.f13094b.m29843a() - 1; a >= 0; a--) {
                ((fj) this.f13094b.m29850e(a)).m15405b();
            }
            return;
        }
        new RuntimeException("here").fillInStackTrace();
        new StringBuilder("Called doRetain when not started: ").append(this);
    }

    void m15335e() {
        if (this.f13098f) {
            if (f13093a) {
                new StringBuilder("Finished Retaining in ").append(this);
            }
            this.f13098f = false;
            for (int a = this.f13094b.m29843a() - 1; a >= 0; a--) {
                ((fj) this.f13094b.m29850e(a)).m15407c();
            }
        }
    }

    void m15336f() {
        for (int a = this.f13094b.m29843a() - 1; a >= 0; a--) {
            ((fj) this.f13094b.m29850e(a)).f13166k = true;
        }
    }

    void m15337g() {
        for (int a = this.f13094b.m29843a() - 1; a >= 0; a--) {
            ((fj) this.f13094b.m29850e(a)).m15408d();
        }
    }

    void m15338h() {
        int a;
        if (!this.f13098f) {
            if (f13093a) {
                new StringBuilder("Destroying Active in ").append(this);
            }
            for (a = this.f13094b.m29843a() - 1; a >= 0; a--) {
                ((fj) this.f13094b.m29850e(a)).m15411g();
            }
            this.f13094b.m29846b();
        }
        if (f13093a) {
            new StringBuilder("Destroying Inactive in ").append(this);
        }
        for (a = this.f13095c.m29843a() - 1; a >= 0; a--) {
            ((fj) this.f13095c.m29850e(a)).m15411g();
        }
        this.f13095c.m29846b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        gwb.m1860a(this.f13100h, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void m15328a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f13094b.m29843a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f13094b.m29843a(); i2++) {
                fj fjVar = (fj) this.f13094b.m29850e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f13094b.m29849d(i2));
                printWriter.print(": ");
                printWriter.println(fjVar.toString());
                fjVar.m15404a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f13095c.m29843a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f13095c.m29843a()) {
                fjVar = (fj) this.f13095c.m29850e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f13095c.m29849d(i));
                printWriter.print(": ");
                printWriter.println(fjVar.toString());
                fjVar.m15404a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean mo1996a() {
        int a = this.f13094b.m29843a();
        boolean z = false;
        for (int i = 0; i < a; i++) {
            int i2;
            fj fjVar = (fj) this.f13094b.m29850e(i);
            if (!fjVar.f13163h || fjVar.f13161f) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            z |= i2;
        }
        return z;
    }
}
