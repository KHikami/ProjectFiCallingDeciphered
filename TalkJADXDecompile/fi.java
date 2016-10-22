import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class fi extends fg {
    static boolean a;
    final lp<fj> b;
    final lp<fj> c;
    final String d;
    boolean e;
    boolean f;
    boolean g;
    ec h;

    static {
        a = false;
    }

    fi(String str, ec ecVar, boolean z) {
        this.b = new lp();
        this.c = new lp();
        this.d = str;
        this.h = ecVar;
        this.e = z;
    }

    void a(ec ecVar) {
        this.h = ecVar;
    }

    private fj c(int i, Bundle bundle, fh<Object> fhVar) {
        fj fjVar = new fj(this, i, bundle, fhVar);
        fjVar.d = fhVar.onCreateLoader(i, bundle);
        return fjVar;
    }

    private fj d(int i, Bundle bundle, fh<Object> fhVar) {
        try {
            this.g = true;
            fj c = c(i, bundle, fhVar);
            a(c);
            return c;
        } finally {
            this.g = false;
        }
    }

    void a(fj fjVar) {
        this.b.a(fjVar.a, fjVar);
        if (this.e) {
            fjVar.a();
        }
    }

    public <D> ig<D> a(int i, Bundle bundle, fh<D> fhVar) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        fj fjVar = (fj) this.b.a(i);
        if (a) {
            new StringBuilder("initLoader in ").append(this).append(": args=").append(bundle);
        }
        if (fjVar == null) {
            fjVar = d(i, bundle, fhVar);
            if (a) {
                new StringBuilder("  Created new loader ").append(fjVar);
            }
        } else {
            if (a) {
                new StringBuilder("  Re-using existing loader ").append(fjVar);
            }
            fjVar.c = fhVar;
        }
        if (fjVar.e && this.e) {
            fjVar.b(fjVar.d, fjVar.g);
        }
        return fjVar.d;
    }

    public <D> ig<D> b(int i, Bundle bundle, fh<D> fhVar) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        fj fjVar = (fj) this.b.a(i);
        if (a) {
            new StringBuilder("restartLoader in ").append(this).append(": args=").append(bundle);
        }
        if (fjVar != null) {
            fj fjVar2 = (fj) this.c.a(i);
            if (fjVar2 != null) {
                if (fjVar.e) {
                    if (a) {
                        new StringBuilder("  Removing last inactive loader: ").append(fjVar);
                    }
                    fjVar2.f = false;
                    fjVar2.g();
                } else if (fjVar.f()) {
                    if (fjVar.n != null) {
                        if (a) {
                            new StringBuilder("  Removing pending loader: ").append(fjVar.n);
                        }
                        fjVar.n.g();
                        fjVar.n = null;
                    }
                    fjVar.n = c(i, bundle, fhVar);
                    return fjVar.n.d;
                } else {
                    this.b.a(i, null);
                    fjVar.g();
                }
            } else if (a) {
                new StringBuilder("  Making last loader inactive: ").append(fjVar);
            }
            fjVar.d.x();
            this.c.a(i, fjVar);
        }
        return d(i, bundle, fhVar).d;
    }

    public void a(int i) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a) {
            new StringBuilder("destroyLoader in ").append(this).append(" of ").append(i);
        }
        int f = this.b.f(i);
        if (f >= 0) {
            fj fjVar = (fj) this.b.e(f);
            this.b.c(f);
            fjVar.g();
        }
        f = this.c.f(i);
        if (f >= 0) {
            fjVar = (fj) this.c.e(f);
            this.c.c(f);
            fjVar.g();
        }
        if (this.h != null && !a()) {
            this.h.d.f();
        }
    }

    public <D> ig<D> b(int i) {
        if (this.g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        fj fjVar = (fj) this.b.a(i);
        if (fjVar == null) {
            return null;
        }
        if (fjVar.n != null) {
            return fjVar.n.d;
        }
        return fjVar.d;
    }

    void b() {
        if (a) {
            new StringBuilder("Starting in ").append(this);
        }
        if (this.e) {
            new RuntimeException("here").fillInStackTrace();
            new StringBuilder("Called doStart when already started: ").append(this);
            return;
        }
        this.e = true;
        for (int a = this.b.a() - 1; a >= 0; a--) {
            ((fj) this.b.e(a)).a();
        }
    }

    void c() {
        if (a) {
            new StringBuilder("Stopping in ").append(this);
        }
        if (this.e) {
            for (int a = this.b.a() - 1; a >= 0; a--) {
                ((fj) this.b.e(a)).e();
            }
            this.e = false;
            return;
        }
        new RuntimeException("here").fillInStackTrace();
        new StringBuilder("Called doStop when not started: ").append(this);
    }

    void d() {
        if (a) {
            new StringBuilder("Retaining in ").append(this);
        }
        if (this.e) {
            this.f = true;
            this.e = false;
            for (int a = this.b.a() - 1; a >= 0; a--) {
                ((fj) this.b.e(a)).b();
            }
            return;
        }
        new RuntimeException("here").fillInStackTrace();
        new StringBuilder("Called doRetain when not started: ").append(this);
    }

    void e() {
        if (this.f) {
            if (a) {
                new StringBuilder("Finished Retaining in ").append(this);
            }
            this.f = false;
            for (int a = this.b.a() - 1; a >= 0; a--) {
                ((fj) this.b.e(a)).c();
            }
        }
    }

    void f() {
        for (int a = this.b.a() - 1; a >= 0; a--) {
            ((fj) this.b.e(a)).k = true;
        }
    }

    void g() {
        for (int a = this.b.a() - 1; a >= 0; a--) {
            ((fj) this.b.e(a)).d();
        }
    }

    void h() {
        int a;
        if (!this.f) {
            if (a) {
                new StringBuilder("Destroying Active in ").append(this);
            }
            for (a = this.b.a() - 1; a >= 0; a--) {
                ((fj) this.b.e(a)).g();
            }
            this.b.b();
        }
        if (a) {
            new StringBuilder("Destroying Inactive in ").append(this);
        }
        for (a = this.c.a() - 1; a >= 0; a--) {
            ((fj) this.c.e(a)).g();
        }
        this.c.b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        gwb.a(this.h, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.b.a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.b.a(); i2++) {
                fj fjVar = (fj) this.b.e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.d(i2));
                printWriter.print(": ");
                printWriter.println(fjVar.toString());
                fjVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.c.a()) {
                fjVar = (fj) this.c.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.d(i));
                printWriter.print(": ");
                printWriter.println(fjVar.toString());
                fjVar.a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean a() {
        int a = this.b.a();
        boolean z = false;
        for (int i = 0; i < a; i++) {
            int i2;
            fj fjVar = (fj) this.b.e(i);
            if (!fjVar.h || fjVar.f) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            z |= i2;
        }
        return z;
    }
}
