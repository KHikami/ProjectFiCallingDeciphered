package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ojn;
import ojr;

/* renamed from: fbn */
public class fbn {
    private static final fbr a;
    private final Context b;
    private volatile ojn c;

    static {
        fbr fbr = new fbr("oauth2:https://www.googleapis.com/auth/device_registry");
        a = fbr;
        fbr.a(fbs.PROD, "deviceregistry-pa.googleapis.com");
        a.a(fbs.AUTOPUSH, "autopush-deviceregistry-pa.sandbox.googleapis.com");
        a.a(fbs.SANDBOX, "dev-deviceregistry-pa.sandbox.googleapis.com");
    }

    public fbn(Context context) {
        this.b = context;
    }

    synchronized boolean a(int i, fbr fbr) {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            glk.c("Babel_Grpc", "Initializing gRPC channel.", new Object[0]);
            try {
                this.c = ((fbo) jyn.a(this.b, fbo.class)).a(i, fbr);
                if (this.c != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable e) {
                glk.d("Babel_Grpc", "Initializing gRPC channel failed ", e);
                z = false;
            }
        }
        return z;
    }

    public mvp a(int i, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        if (!a(i, a)) {
            return null;
        }
        mvp a = mvo.a(this.c);
        a = (mvp) a.a(a.a, a.b.a(30000, TimeUnit.MILLISECONDS));
        return (mvp) a.a(ojr.a(a.a, new ojq[]{gwb.a((AtomicReference) atomicReference, (AtomicReference) atomicReference2)}), a.b);
    }
}
