package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* renamed from: brv */
public final class brv extends buf implements brm {
    f a;
    private Status b;

    static void b(brl brl) {
        if (!(brl instanceof brk)) {
        }
    }

    public final void a(brl brl) {
        synchronized (null) {
            try {
                WeakReference b = brl.a().b();
                if (b != null) {
                    b.get();
                } else {
                    a(brl.a());
                    brv.b(brl);
                }
            } finally {
            }
        }
    }

    final void a(Status status) {
        synchronized (null) {
            WeakReference weakReference;
            try {
                this.b = status;
                Status status2 = this.b;
                weakReference = null;
                synchronized (null) {
                    weakReference.get();
                    weakReference = null;
                }
            } catch (Throwable th) {
                weakReference = th;
            } finally {
            }
        }
    }
}
