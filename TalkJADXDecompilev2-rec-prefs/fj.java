package p000;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class fj implements ii<Object>, ij<Object> {
    final int f13156a;
    final Bundle f13157b;
    fh<Object> f13158c;
    ig<Object> f13159d;
    boolean f13160e;
    boolean f13161f;
    Object f13162g;
    boolean f13163h;
    boolean f13164i;
    boolean f13165j;
    boolean f13166k;
    boolean f13167l;
    boolean f13168m;
    fj f13169n;
    final /* synthetic */ fi f13170o;

    public fj(fi fiVar, int i, Bundle bundle, fh<Object> fhVar) {
        this.f13170o = fiVar;
        this.f13156a = i;
        this.f13157b = bundle;
        this.f13158c = fhVar;
    }

    void m15402a() {
        if (this.f13164i && this.f13165j) {
            this.f13163h = true;
        } else if (!this.f13163h) {
            this.f13163h = true;
            if (fi.f13093a) {
                new StringBuilder("  Starting: ").append(this);
            }
            if (this.f13159d == null && this.f13158c != null) {
                this.f13159d = this.f13158c.onCreateLoader(this.f13156a, this.f13157b);
            }
            if (this.f13159d == null) {
                return;
            }
            if (!this.f13159d.getClass().isMemberClass() || Modifier.isStatic(this.f13159d.getClass().getModifiers())) {
                if (!this.f13168m) {
                    this.f13159d.m1274a(this.f13156a, this);
                    this.f13159d.m1275a((ii) this);
                    this.f13168m = true;
                }
                this.f13159d.m1291t();
                return;
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f13159d);
        }
    }

    void m15405b() {
        if (fi.f13093a) {
            new StringBuilder("  Retaining: ").append(this);
        }
        this.f13164i = true;
        this.f13165j = this.f13163h;
        this.f13163h = false;
        this.f13158c = null;
    }

    void m15407c() {
        if (this.f13164i) {
            if (fi.f13093a) {
                new StringBuilder("  Finished Retaining: ").append(this);
            }
            this.f13164i = false;
            if (!(this.f13163h == this.f13165j || this.f13163h)) {
                m15409e();
            }
        }
        if (this.f13163h && this.f13160e && !this.f13166k) {
            m15406b(this.f13159d, this.f13162g);
        }
    }

    void m15408d() {
        if (this.f13163h && this.f13166k) {
            this.f13166k = false;
            if (this.f13160e && !this.f13164i) {
                m15406b(this.f13159d, this.f13162g);
            }
        }
    }

    void m15409e() {
        if (fi.f13093a) {
            new StringBuilder("  Stopping: ").append(this);
        }
        this.f13163h = false;
        if (!this.f13164i && this.f13159d != null && this.f13168m) {
            this.f13168m = false;
            this.f13159d.m1276a((ij) this);
            this.f13159d.m1278b((ii) this);
            this.f13159d.m1294w();
        }
    }

    boolean m15410f() {
        if (fi.f13093a) {
            new StringBuilder("  Canceling: ").append(this);
        }
        if (!this.f13163h || this.f13159d == null || !this.f13168m) {
            return false;
        }
        boolean u = this.f13159d.m1292u();
        if (u) {
            return u;
        }
        mo2019h();
        return u;
    }

    void m15411g() {
        String str;
        fh fhVar = null;
        if (fi.f13093a) {
            new StringBuilder("  Destroying: ").append(this);
        }
        this.f13167l = true;
        boolean z = this.f13161f;
        this.f13161f = false;
        if (this.f13158c != null && this.f13159d != null && this.f13160e && z) {
            if (fi.f13093a) {
                new StringBuilder("  Resetting: ").append(this);
            }
            if (this.f13170o.f13100h != null) {
                String str2 = this.f13170o.f13100h.f10793d.f11285v;
                this.f13170o.f13100h.f10793d.f11285v = "onLoaderReset";
                str = str2;
            } else {
                str = null;
            }
            try {
                this.f13158c.onLoaderReset(this.f13159d);
            } finally {
                fhVar = this.f13170o.f13100h;
                if (fhVar != null) {
                    fhVar = this.f13170o.f13100h.f10793d;
                    fhVar.f11285v = str;
                }
            }
        }
        this.f13158c = fhVar;
        this.f13162g = fhVar;
        this.f13160e = false;
        if (this.f13159d != null) {
            if (this.f13168m) {
                this.f13168m = false;
                this.f13159d.m1276a((ij) this);
                this.f13159d.m1278b((ii) this);
            }
            this.f13159d.m1296y();
        }
        if (this.f13169n != null) {
            this.f13169n.m15411g();
        }
    }

    public void mo2019h() {
        if (fi.f13093a) {
            new StringBuilder("onLoadCanceled: ").append(this);
        }
        if (!this.f13167l && this.f13170o.f13094b.m29844a(this.f13156a) == this) {
            fj fjVar = this.f13169n;
            if (fjVar != null) {
                if (fi.f13093a) {
                    new StringBuilder("  Switching to pending loader: ").append(fjVar);
                }
                this.f13169n = null;
                this.f13170o.f13094b.m29845a(this.f13156a, null);
                m15411g();
                this.f13170o.m15327a(fjVar);
            }
        }
    }

    public void mo2018a(ig<Object> igVar, Object obj) {
        if (fi.f13093a) {
            new StringBuilder("onLoadComplete: ").append(this);
        }
        if (!this.f13167l && this.f13170o.f13094b.m29844a(this.f13156a) == this) {
            fj fjVar = this.f13169n;
            if (fjVar != null) {
                if (fi.f13093a) {
                    new StringBuilder("  Switching to pending loader: ").append(fjVar);
                }
                this.f13169n = null;
                this.f13170o.f13094b.m29845a(this.f13156a, null);
                m15411g();
                this.f13170o.m15327a(fjVar);
                return;
            }
            if (!(this.f13162g == obj && this.f13160e)) {
                this.f13162g = obj;
                this.f13160e = true;
                if (this.f13163h) {
                    m15406b(igVar, obj);
                }
            }
            fjVar = (fj) this.f13170o.f13095c.m29844a(this.f13156a);
            if (!(fjVar == null || fjVar == this)) {
                fjVar.f13161f = false;
                fjVar.m15411g();
                this.f13170o.f13095c.m29847b(this.f13156a);
            }
            if (this.f13170o.f13100h != null && !this.f13170o.mo1996a()) {
                this.f13170o.f13100h.f10793d.m13687f();
            }
        }
    }

    void m15406b(ig<Object> igVar, Object obj) {
        String str;
        if (this.f13158c != null) {
            if (this.f13170o.f13100h != null) {
                String str2 = this.f13170o.f13100h.f10793d.f11285v;
                this.f13170o.f13100h.f10793d.f11285v = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (fi.f13093a) {
                    new StringBuilder("  onLoadFinished in ").append(igVar).append(": ").append(igVar.m1281c(obj));
                }
                this.f13158c.onLoadFinished(igVar, obj);
                this.f13161f = true;
            } finally {
                if (this.f13170o.f13100h != null) {
                    this.f13170o.f13100h.f10793d.f11285v = str;
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.f13156a);
        stringBuilder.append(" : ");
        gwb.m1860a(this.f13159d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void m15404a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f13156a);
        printWriter.print(" mArgs=");
        printWriter.println(this.f13157b);
        printWriter.print(str);
        printWriter.print("mCallbacks=");
        printWriter.println(this.f13158c);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f13159d);
        if (this.f13159d != null) {
            this.f13159d.mo208a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f13160e || this.f13161f) {
            printWriter.print(str);
            printWriter.print("mHaveData=");
            printWriter.print(this.f13160e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f13161f);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(this.f13162g);
        }
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.f13163h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.f13166k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f13167l);
        printWriter.print(str);
        printWriter.print("mRetaining=");
        printWriter.print(this.f13164i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.f13165j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.f13168m);
        if (this.f13169n != null) {
            printWriter.print(str);
            printWriter.println("Pending Loader ");
            printWriter.print(this.f13169n);
            printWriter.println(":");
            this.f13169n.m15404a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
