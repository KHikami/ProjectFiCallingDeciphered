package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: hfa */
final class hfa extends hfk {
    final /* synthetic */ hes a;
    final /* synthetic */ SignInResponse b;
    final /* synthetic */ hez c;

    hfa(hez hez, hfi hfi, hes hes, SignInResponse signInResponse) {
        this.c = hez;
        this.a = hes;
        this.b = signInResponse;
        super(hfi);
    }

    public void a() {
        hes hes = this.a;
        SignInResponse signInResponse = this.b;
        if (hes.b(0)) {
            ConnectionResult a = signInResponse.a();
            if (a.b()) {
                ResolveAccountResponse b = signInResponse.b();
                a = b.b();
                if (a.b()) {
                    hes.g = true;
                    hes.h = b.a();
                    hes.i = b.c();
                    hes.j = b.d();
                    hes.e();
                    return;
                }
                String valueOf = String.valueOf(a);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                hes.b(a);
            } else if (hes.a(a)) {
                hes.f();
                hes.e();
            } else {
                hes.b(a);
            }
        }
    }
}
