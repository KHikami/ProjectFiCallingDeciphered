package p000;

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
    private final Activity f10790a;
    final Context f10791b;
    final int f10792c;
    final ee f10793d;
    private final Handler f10794e;
    private lo<String, fg> f10795f;
    private boolean f10796g;
    private fi f10797h;
    private boolean f10798i;
    private boolean f10799j;

    public abstract E mo1773g();

    ec(dw dwVar) {
        this(dwVar, dwVar, dwVar.f631c, 0);
    }

    private ec(Activity activity, Context context, Handler handler, int i) {
        this.f10793d = new ee();
        this.f10790a = activity;
        this.f10791b = context;
        this.f10794e = handler;
        this.f10792c = 0;
    }

    public void mo1766a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean mo1768b() {
        return true;
    }

    public LayoutInflater mo1769c() {
        return (LayoutInflater) this.f10791b.getSystemService("layout_inflater");
    }

    public void mo1770d() {
    }

    public void mo1763a(dr drVar, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f10791b.startActivity(intent);
    }

    public void mo1764a(dr drVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        cq.m10683a(this.f10790a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void mo1765a(dr drVar, String[] strArr, int i) {
    }

    public boolean mo1767a(String str) {
        return false;
    }

    public boolean mo1771e() {
        return true;
    }

    public int mo1772f() {
        return this.f10792c;
    }

    public View mo1657a(int i) {
        return null;
    }

    public boolean mo1658a() {
        return true;
    }

    Activity m13032h() {
        return this.f10790a;
    }

    Context m13033i() {
        return this.f10791b;
    }

    Handler m13034j() {
        return this.f10794e;
    }

    ee m13035k() {
        return this.f10793d;
    }

    fi m13036l() {
        if (this.f10797h != null) {
            return this.f10797h;
        }
        this.f10798i = true;
        this.f10797h = m13014a("(root)", this.f10799j, true);
        return this.f10797h;
    }

    void m13024b(String str) {
        if (this.f10795f != null) {
            fi fiVar = (fi) this.f10795f.get(str);
            if (fiVar != null && !fiVar.f13098f) {
                fiVar.m15338h();
                this.f10795f.remove(str);
            }
        }
    }

    void mo1762a(dr drVar) {
    }

    boolean m13037m() {
        return this.f10796g;
    }

    void m13038n() {
        if (!this.f10799j) {
            this.f10799j = true;
            if (this.f10797h != null) {
                this.f10797h.m15332b();
            } else if (!this.f10798i) {
                this.f10797h = m13014a("(root)", this.f10799j, false);
                if (!(this.f10797h == null || this.f10797h.f13097e)) {
                    this.f10797h.m15332b();
                }
            }
            this.f10798i = true;
        }
    }

    void m13021a(boolean z) {
        this.f10796g = z;
        if (this.f10797h != null && this.f10799j) {
            this.f10799j = false;
            if (z) {
                this.f10797h.m15334d();
            } else {
                this.f10797h.m15333c();
            }
        }
    }

    void m13039o() {
        if (this.f10797h != null) {
            this.f10797h.m15338h();
        }
    }

    void m13040p() {
        if (this.f10795f != null) {
            int size = this.f10795f.size();
            fi[] fiVarArr = new fi[size];
            for (int i = size - 1; i >= 0; i--) {
                fiVarArr[i] = (fi) this.f10795f.m28018c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                fi fiVar = fiVarArr[i2];
                fiVar.m15335e();
                fiVar.m15337g();
            }
        }
    }

    fi m13014a(String str, boolean z, boolean z2) {
        if (this.f10795f == null) {
            this.f10795f = new lo();
        }
        fi fiVar = (fi) this.f10795f.get(str);
        if (fiVar != null) {
            fiVar.m15326a(this);
            return fiVar;
        } else if (!z2) {
            return fiVar;
        } else {
            fiVar = new fi(str, this, z);
            this.f10795f.put(str, fiVar);
            return fiVar;
        }
    }

    lo<String, fg> m13041q() {
        int i;
        int i2 = 0;
        if (this.f10795f != null) {
            int size = this.f10795f.size();
            fi[] fiVarArr = new fi[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                fiVarArr[i3] = (fi) this.f10795f.m28018c(i3);
            }
            boolean m = m13037m();
            i = 0;
            while (i2 < size) {
                fi fiVar = fiVarArr[i2];
                if (!fiVar.f13098f && m) {
                    if (!fiVar.f13097e) {
                        fiVar.m15332b();
                    }
                    fiVar.m15334d();
                }
                if (fiVar.f13098f) {
                    i = 1;
                } else {
                    fiVar.m15338h();
                    this.f10795f.remove(fiVar.f13096d);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            return this.f10795f;
        }
        return null;
    }

    void m13020a(lo<String, fg> loVar) {
        this.f10795f = loVar;
    }

    void m13025b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f10799j);
        if (this.f10797h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f10797h)));
            printWriter.println(":");
            this.f10797h.m15328a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }
}
