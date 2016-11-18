package p000;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

final class hez extends hwy {
    private final WeakReference<hes> f16794a;

    hez(hes hes) {
        this.f16794a = new WeakReference(hes);
    }

    public void mo2505a(SignInResponse signInResponse) {
        hes hes = (hes) this.f16794a.get();
        if (hes != null) {
            hes.f16760a.m19639a(new hfa(this, hes, hes, signInResponse));
        }
    }
}
