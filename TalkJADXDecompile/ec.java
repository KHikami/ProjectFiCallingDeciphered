import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class ec<E> extends ea {
    private final Activity a;
    final Context b;
    final int c;
    final ee d;
    private final Handler e;
    private lo<String, fg> f;
    private boolean g;
    private fi h;
    private boolean i;
    private boolean j;

    public abstract E g();

    ec(dw dwVar) {
        this(dwVar, dwVar, dwVar.c, 0);
    }

    private ec(Activity activity, Context context, Handler handler, int i) {
        this.d = new ee();
        this.a = activity;
        this.b = context;
        this.e = handler;
        this.c = 0;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        return (LayoutInflater) this.b.getSystemService("layout_inflater");
    }

    public void d() {
    }

    public void a(dr drVar, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.b.startActivity(intent);
    }

    public void a(dr drVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        cq.a(this.a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void a(dr drVar, String[] strArr, int i) {
    }

    public boolean a(String str) {
        return false;
    }

    public boolean e() {
        return true;
    }

    public int f() {
        return this.c;
    }

    public View a(int i) {
        return null;
    }

    public boolean a() {
        return true;
    }

    Activity h() {
        return this.a;
    }

    Context i() {
        return this.b;
    }

    Handler j() {
        return this.e;
    }

    ee k() {
        return this.d;
    }

    fi l() {
        if (this.h != null) {
            return this.h;
        }
        this.i = true;
        this.h = a("(root)", this.j, true);
        return this.h;
    }

    void b(String str) {
        if (this.f != null) {
            fi fiVar = (fi) this.f.get(str);
            if (fiVar != null && !fiVar.f) {
                fiVar.h();
                this.f.remove(str);
            }
        }
    }

    void a(dr drVar) {
    }

    boolean m() {
        return this.g;
    }

    void n() {
        if (!this.j) {
            this.j = true;
            if (this.h != null) {
                this.h.b();
            } else if (!this.i) {
                this.h = a("(root)", this.j, false);
                if (!(this.h == null || this.h.e)) {
                    this.h.b();
                }
            }
            this.i = true;
        }
    }

    void a(boolean z) {
        this.g = z;
        if (this.h != null && this.j) {
            this.j = false;
            if (z) {
                this.h.d();
            } else {
                this.h.c();
            }
        }
    }

    void o() {
        if (this.h != null) {
            this.h.h();
        }
    }

    void p() {
        if (this.f != null) {
            int size = this.f.size();
            fi[] fiVarArr = new fi[size];
            for (int i = size - 1; i >= 0; i--) {
                fiVarArr[i] = (fi) this.f.c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                fi fiVar = fiVarArr[i2];
                fiVar.e();
                fiVar.g();
            }
        }
    }

    fi a(String str, boolean z, boolean z2) {
        if (this.f == null) {
            this.f = new lo();
        }
        fi fiVar = (fi) this.f.get(str);
        if (fiVar != null) {
            fiVar.a(this);
            return fiVar;
        } else if (!z2) {
            return fiVar;
        } else {
            fiVar = new fi(str, this, z);
            this.f.put(str, fiVar);
            return fiVar;
        }
    }

    lo<String, fg> q() {
        int i;
        int i2 = 0;
        if (this.f != null) {
            int size = this.f.size();
            fi[] fiVarArr = new fi[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                fiVarArr[i3] = (fi) this.f.c(i3);
            }
            boolean m = m();
            i = 0;
            while (i2 < size) {
                fi fiVar = fiVarArr[i2];
                if (!fiVar.f && m) {
                    if (!fiVar.e) {
                        fiVar.b();
                    }
                    fiVar.d();
                }
                if (fiVar.f) {
                    i = 1;
                } else {
                    fiVar.h();
                    this.f.remove(fiVar.d);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            return this.f;
        }
        return null;
    }

    void a(lo<String, fg> loVar) {
        this.f = loVar;
    }

    void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
            printWriter.println(":");
            this.h.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
