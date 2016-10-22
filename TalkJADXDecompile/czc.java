import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import java.util.ArrayList;
import java.util.List;

public final class czc implements OnCancelListener {
    public static final boolean a;
    private boolean b;
    private boolean c;
    private volatile boolean d;
    private czg e;
    private volatile czh f;
    private final List<czh> g;
    private final czi h;

    static {
        kae kae = glk.f;
        a = false;
    }

    public static czc a(czh czh, czg czg) {
        czc czc = new czc(czg);
        czc.c(czh);
        return czc;
    }

    private czc(czg czg) {
        this.g = new ArrayList();
        this.h = new czi(this);
        this.d = false;
        this.e = czg;
        this.b = false;
        this.c = true;
        if (this.e != null) {
            this.e.a((OnCancelListener) this);
        }
    }

    private void c(czh czh) {
        if (czh == null) {
            glk.e("Babel", "BlockingChainedExecutor: adding empty request", new Object[0]);
            return;
        }
        czh.a(this.h);
        this.g.add(czh);
    }

    public void a() {
        if (this.g.size() <= 0) {
            glk.e("Babel", "BlockingChainedExecutor: make sure you have requests to run!", new Object[0]);
            return;
        }
        this.f = (czh) this.g.get(0);
        if (this.e != null) {
            this.e.a(this.f.a());
        }
        this.f.f();
        if (a) {
            String valueOf = String.valueOf(this.f);
            new StringBuilder(String.valueOf(valueOf).length() + 40).append("BlockingChainedExecutor: handle request ").append(valueOf);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.d = true;
        this.f.g();
    }

    private void a(czh czh, boolean z) {
        if (a && !z) {
            String valueOf = String.valueOf(czh);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("BlockingChainedExecutor: request ").append(valueOf).append(" failed.");
        }
        int indexOf = this.g.indexOf(czh);
        if (indexOf < 0) {
            if (this.e != null) {
                this.e.a();
            }
            glk.e("Babel", "BlockingChainedExecutor: can't find the request!", new Object[0]);
        } else if (indexOf == this.g.size() - 1) {
            if (this.e != null) {
                this.e.a();
            }
            if (z) {
                czh.c();
            } else {
                czh.b();
            }
        } else if (!this.d) {
            if ((z && this.b) || (!z && this.c)) {
                this.f = (czh) this.g.get(indexOf + 1);
                this.f.f();
                if (this.e != null) {
                    this.e.b(this.f.a());
                }
                if (a) {
                    valueOf = String.valueOf(this.f);
                    new StringBuilder(String.valueOf(valueOf).length() + 40).append("BlockingChainedExecutor: handle request ").append(valueOf);
                }
            }
        }
    }

    protected void a(czh czh) {
        a(czh, true);
    }

    protected void b(czh czh) {
        a(czh, false);
    }
}
