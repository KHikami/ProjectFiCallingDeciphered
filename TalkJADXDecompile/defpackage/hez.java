package defpackage;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: hez */
final class hez extends hwy {
    private final WeakReference<hes> a;

    hez(hes hes) {
        this.a = new WeakReference(hes);
    }

    public void a(SignInResponse signInResponse) {
        hes hes = (hes) this.a.get();
        if (hes != null) {
            hes.a.a(new hfa(this, hes, hes, signInResponse));
        }
    }
}
