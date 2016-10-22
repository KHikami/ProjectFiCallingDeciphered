package defpackage;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: bsl */
final class bsl extends csa {
    private final WeakReference a;

    bsl(bsf bsf) {
        this.a = new WeakReference(bsf);
    }

    public final void a(SignInResponse signInResponse) {
        bsf bsf = (bsf) this.a.get();
        if (bsf != null) {
            bsf.a.a(new bsm(this, bsf, bsf, signInResponse));
        }
    }
}
