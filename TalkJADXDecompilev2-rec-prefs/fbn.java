package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class fbn {
    private static final fbr f12636a;
    private final Context f12637b;
    private volatile ojn f12638c;

    static {
        fbr fbr = new fbr("oauth2:https://www.googleapis.com/auth/device_registry");
        f12636a = fbr;
        fbr.m14914a(fbs.PROD, "deviceregistry-pa.googleapis.com");
        f12636a.m14914a(fbs.AUTOPUSH, "autopush-deviceregistry-pa.sandbox.googleapis.com");
        f12636a.m14914a(fbs.SANDBOX, "dev-deviceregistry-pa.sandbox.googleapis.com");
    }

    public fbn(Context context) {
        this.f12637b = context;
    }

    synchronized boolean m14895a(int i, fbr fbr) {
        boolean z;
        if (this.f12638c != null) {
            z = true;
        } else {
            glk.m17979c("Babel_Grpc", "Initializing gRPC channel.", new Object[0]);
            try {
                this.f12638c = ((fbo) jyn.m25426a(this.f12637b, fbo.class)).m14896a(i, fbr);
                if (this.f12638c != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable e) {
                glk.m17980d("Babel_Grpc", "Initializing gRPC channel failed ", e);
                z = false;
            }
        }
        return z;
    }

    public mvp m14894a(int i, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        if (!m14895a(i, f12636a)) {
            return null;
        }
        omq a = mvo.m33109a(this.f12638c);
        mvp mvp = (mvp) a.a(a.a, a.b.a(30000, TimeUnit.MILLISECONDS));
        return (mvp) mvp.a(ojr.a(mvp.a, new ojq[]{gwb.m1723a((AtomicReference) atomicReference, (AtomicReference) atomicReference2)}), mvp.b);
    }
}
