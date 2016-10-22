package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import u;

/* renamed from: hgm */
public final class hgm<R extends gup> extends gwb implements guq<R> {
    u a;
    hgm<? extends gup> b;
    final Object c;
    final WeakReference<gui> d;
    final hgo e;
    private volatile u f;
    private gum<R> g;
    private Status h;
    private boolean i;

    private void b(Status status) {
        synchronized (this.c) {
            if (this.a != null) {
                Status a = this.a.a(status);
                gwb.f((Object) a, (Object) "onFailure must not return null");
                this.b.a(a);
            } else if (b()) {
                u uVar = this.f;
            }
        }
    }

    static void b(gup gup) {
        if (gup instanceof guo) {
            try {
                ((guo) gup).b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(gup);
                new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf);
            }
        }
    }

    private boolean b() {
        return (this.f == null || ((gui) this.d.get()) == null) ? false : true;
    }

    void a() {
        this.f = null;
    }

    void a(Status status) {
        synchronized (this.c) {
            this.h = status;
            b(this.h);
        }
    }

    public void a(gum<?> gum_) {
        synchronized (this.c) {
            this.g = gum_;
            if (!(this.a == null && this.f == null)) {
                gui gui = (gui) this.d.get();
                if (!(this.i || this.a == null || gui == null)) {
                    gui.a(this);
                    this.i = true;
                }
                if (this.h != null) {
                    b(this.h);
                } else if (this.g != null) {
                    this.g.a(this);
                }
            }
        }
    }

    public void a(R r) {
        synchronized (this.c) {
            if (!r.k().d()) {
                a(r.k());
                hgm.b((gup) r);
            } else if (this.a != null) {
                hgi.a.submit(new hgn(this, r));
            } else if (b()) {
                u uVar = this.f;
            }
        }
    }
}
