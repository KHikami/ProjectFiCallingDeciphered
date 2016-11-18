package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

public final class hgm<R extends gup> extends gwb implements guq<R> {
    u f16913a;
    hgm<? extends gup> f16914b;
    final Object f16915c;
    final WeakReference<gui> f16916d;
    final hgo f16917e;
    private volatile u f16918f;
    private gum<R> f16919g;
    private Status f16920h;
    private boolean f16921i;

    private void m19746b(Status status) {
        synchronized (this.f16915c) {
            if (this.f16913a != null) {
                Status a = this.f16913a.a(status);
                gwb.m2195f((Object) a, (Object) "onFailure must not return null");
                this.f16914b.m19750a(a);
            } else if (m19748b()) {
                u uVar = this.f16918f;
            }
        }
    }

    static void m19747b(gup gup) {
        if (gup instanceof guo) {
            try {
                ((guo) gup).mo2073b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(gup);
                new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf);
            }
        }
    }

    private boolean m19748b() {
        return (this.f16918f == null || ((gui) this.f16916d.get()) == null) ? false : true;
    }

    void m19749a() {
        this.f16918f = null;
    }

    void m19750a(Status status) {
        synchronized (this.f16915c) {
            this.f16920h = status;
            m19746b(this.f16920h);
        }
    }

    public void m19751a(gum<?> gum_) {
        synchronized (this.f16915c) {
            this.f16919g = gum_;
            if (!(this.f16913a == null && this.f16918f == null)) {
                gui gui = (gui) this.f16916d.get();
                if (!(this.f16921i || this.f16913a == null || gui == null)) {
                    gui.mo2515a(this);
                    this.f16921i = true;
                }
                if (this.f16920h != null) {
                    m19746b(this.f16920h);
                } else if (this.f16919g != null) {
                    this.f16919g.mo2419a(this);
                }
            }
        }
    }

    public void mo1538a(R r) {
        synchronized (this.f16915c) {
            if (!r.mo1279k().m9663d()) {
                m19750a(r.mo1279k());
                hgm.m19747b((gup) r);
            } else if (this.f16913a != null) {
                hgi.f16904a.submit(new hgn(this, r));
            } else if (m19748b()) {
                u uVar = this.f16918f;
            }
        }
    }
}
