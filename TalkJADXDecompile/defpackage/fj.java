package defpackage;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: fj */
final class fj implements ii<Object>, ij<Object> {
    final int a;
    final Bundle b;
    fh<Object> c;
    ig<Object> d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    fj n;
    final /* synthetic */ fi o;

    public fj(fi fiVar, int i, Bundle bundle, fh<Object> fhVar) {
        this.o = fiVar;
        this.a = i;
        this.b = bundle;
        this.c = fhVar;
    }

    void a() {
        if (this.i && this.j) {
            this.h = true;
        } else if (!this.h) {
            this.h = true;
            if (fi.a) {
                new StringBuilder("  Starting: ").append(this);
            }
            if (this.d == null && this.c != null) {
                this.d = this.c.onCreateLoader(this.a, this.b);
            }
            if (this.d == null) {
                return;
            }
            if (!this.d.getClass().isMemberClass() || Modifier.isStatic(this.d.getClass().getModifiers())) {
                if (!this.m) {
                    this.d.a(this.a, this);
                    this.d.a((ii) this);
                    this.m = true;
                }
                this.d.t();
                return;
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
        }
    }

    void b() {
        if (fi.a) {
            new StringBuilder("  Retaining: ").append(this);
        }
        this.i = true;
        this.j = this.h;
        this.h = false;
        this.c = null;
    }

    void c() {
        if (this.i) {
            if (fi.a) {
                new StringBuilder("  Finished Retaining: ").append(this);
            }
            this.i = false;
            if (!(this.h == this.j || this.h)) {
                e();
            }
        }
        if (this.h && this.e && !this.k) {
            b(this.d, this.g);
        }
    }

    void d() {
        if (this.h && this.k) {
            this.k = false;
            if (this.e && !this.i) {
                b(this.d, this.g);
            }
        }
    }

    void e() {
        if (fi.a) {
            new StringBuilder("  Stopping: ").append(this);
        }
        this.h = false;
        if (!this.i && this.d != null && this.m) {
            this.m = false;
            this.d.a((ij) this);
            this.d.b((ii) this);
            this.d.w();
        }
    }

    boolean f() {
        if (fi.a) {
            new StringBuilder("  Canceling: ").append(this);
        }
        if (!this.h || this.d == null || !this.m) {
            return false;
        }
        boolean u = this.d.u();
        if (u) {
            return u;
        }
        h();
        return u;
    }

    void g() {
        String str;
        fh fhVar = null;
        if (fi.a) {
            new StringBuilder("  Destroying: ").append(this);
        }
        this.l = true;
        boolean z = this.f;
        this.f = false;
        if (this.c != null && this.d != null && this.e && z) {
            if (fi.a) {
                new StringBuilder("  Resetting: ").append(this);
            }
            if (this.o.h != null) {
                String str2 = this.o.h.d.v;
                this.o.h.d.v = "onLoaderReset";
                str = str2;
            } else {
                str = null;
            }
            try {
                this.c.onLoaderReset(this.d);
            } finally {
                fhVar = this.o.h;
                if (fhVar != null) {
                    fhVar = this.o.h.d;
                    fhVar.v = str;
                }
            }
        }
        this.c = fhVar;
        this.g = fhVar;
        this.e = false;
        if (this.d != null) {
            if (this.m) {
                this.m = false;
                this.d.a((ij) this);
                this.d.b((ii) this);
            }
            this.d.y();
        }
        if (this.n != null) {
            this.n.g();
        }
    }

    public void h() {
        if (fi.a) {
            new StringBuilder("onLoadCanceled: ").append(this);
        }
        if (!this.l && this.o.b.a(this.a) == this) {
            fj fjVar = this.n;
            if (fjVar != null) {
                if (fi.a) {
                    new StringBuilder("  Switching to pending loader: ").append(fjVar);
                }
                this.n = null;
                this.o.b.a(this.a, null);
                g();
                this.o.a(fjVar);
            }
        }
    }

    public void a(ig<Object> igVar, Object obj) {
        if (fi.a) {
            new StringBuilder("onLoadComplete: ").append(this);
        }
        if (!this.l && this.o.b.a(this.a) == this) {
            fj fjVar = this.n;
            if (fjVar != null) {
                if (fi.a) {
                    new StringBuilder("  Switching to pending loader: ").append(fjVar);
                }
                this.n = null;
                this.o.b.a(this.a, null);
                g();
                this.o.a(fjVar);
                return;
            }
            if (!(this.g == obj && this.e)) {
                this.g = obj;
                this.e = true;
                if (this.h) {
                    b(igVar, obj);
                }
            }
            fjVar = (fj) this.o.c.a(this.a);
            if (!(fjVar == null || fjVar == this)) {
                fjVar.f = false;
                fjVar.g();
                this.o.c.b(this.a);
            }
            if (this.o.h != null && !this.o.a()) {
                this.o.h.d.f();
            }
        }
    }

    void b(ig<Object> igVar, Object obj) {
        String str;
        if (this.c != null) {
            if (this.o.h != null) {
                String str2 = this.o.h.d.v;
                this.o.h.d.v = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (fi.a) {
                    new StringBuilder("  onLoadFinished in ").append(igVar).append(": ").append(igVar.c(obj));
                }
                this.c.onLoadFinished(igVar, obj);
                this.f = true;
            } finally {
                if (this.o.h != null) {
                    this.o.h.d.v = str;
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.a);
        stringBuilder.append(" : ");
        gwb.a(this.d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mArgs=");
        printWriter.println(this.b);
        printWriter.print(str);
        printWriter.print("mCallbacks=");
        printWriter.println(this.c);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.d);
        if (this.d != null) {
            this.d.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mHaveData=");
            printWriter.print(this.e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(this.g);
        }
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mRetaining=");
        printWriter.print(this.i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(str);
            printWriter.println("Pending Loader ");
            printWriter.print(this.n);
            printWriter.println(":");
            this.n.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
