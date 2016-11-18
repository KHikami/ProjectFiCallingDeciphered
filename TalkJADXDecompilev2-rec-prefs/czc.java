package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import java.util.ArrayList;
import java.util.List;

public final class czc implements OnCancelListener {
    public static final boolean f9368a = false;
    private boolean f9369b;
    private boolean f9370c;
    private volatile boolean f9371d = false;
    private czg f9372e;
    private volatile czh f9373f;
    private final List<czh> f9374g = new ArrayList();
    private final czi f9375h = new czi(this);

    static {
        kae kae = glk.f15559f;
    }

    public static czc m11324a(czh czh, czg czg) {
        czc czc = new czc(czg);
        czc.m11326c(czh);
        return czc;
    }

    private czc(czg czg) {
        this.f9372e = czg;
        this.f9369b = false;
        this.f9370c = true;
        if (this.f9372e != null) {
            this.f9372e.mo1485a((OnCancelListener) this);
        }
    }

    private void m11326c(czh czh) {
        if (czh == null) {
            glk.m17982e("Babel", "BlockingChainedExecutor: adding empty request", new Object[0]);
            return;
        }
        czh.mo1474a(this.f9375h);
        this.f9374g.add(czh);
    }

    public void m11327a() {
        if (this.f9374g.size() <= 0) {
            glk.m17982e("Babel", "BlockingChainedExecutor: make sure you have requests to run!", new Object[0]);
            return;
        }
        this.f9373f = (czh) this.f9374g.get(0);
        if (this.f9372e != null) {
            this.f9372e.mo1486a(this.f9373f.mo1479a());
        }
        this.f9373f.mo1477f();
        if (f9368a) {
            String valueOf = String.valueOf(this.f9373f);
            new StringBuilder(String.valueOf(valueOf).length() + 40).append("BlockingChainedExecutor: handle request ").append(valueOf);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f9371d = true;
        this.f9373f.mo1478g();
    }

    private void m11325a(czh czh, boolean z) {
        if (f9368a && !z) {
            String valueOf = String.valueOf(czh);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("BlockingChainedExecutor: request ").append(valueOf).append(" failed.");
        }
        int indexOf = this.f9374g.indexOf(czh);
        if (indexOf < 0) {
            if (this.f9372e != null) {
                this.f9372e.mo1484a();
            }
            glk.m17982e("Babel", "BlockingChainedExecutor: can't find the request!", new Object[0]);
        } else if (indexOf == this.f9374g.size() - 1) {
            if (this.f9372e != null) {
                this.f9372e.mo1484a();
            }
            if (z) {
                czh.mo1476c();
            } else {
                czh.mo1475b();
            }
        } else if (!this.f9371d) {
            if ((z && this.f9369b) || (!z && this.f9370c)) {
                this.f9373f = (czh) this.f9374g.get(indexOf + 1);
                this.f9373f.mo1477f();
                if (this.f9372e != null) {
                    this.f9372e.mo1487b(this.f9373f.mo1479a());
                }
                if (f9368a) {
                    valueOf = String.valueOf(this.f9373f);
                    new StringBuilder(String.valueOf(valueOf).length() + 40).append("BlockingChainedExecutor: handle request ").append(valueOf);
                }
            }
        }
    }

    protected void m11328a(czh czh) {
        m11325a(czh, true);
    }

    protected void m11329b(czh czh) {
        m11325a(czh, false);
    }
}
