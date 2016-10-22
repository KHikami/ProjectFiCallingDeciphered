package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: bsm */
final class bsm extends bta {
    private /* synthetic */ bsf b;
    private /* synthetic */ SignInResponse c;

    bsm(bsl bsl, bsy bsy, bsf bsf, SignInResponse signInResponse) {
        this.b = bsf;
        this.c = signInResponse;
        super(bsy);
    }

    public final void a() {
        bsf bsf = this.b;
        SignInResponse signInResponse = this.c;
        if (bsf.b(0)) {
            ConnectionResult connectionResult = signInResponse.b;
            if (connectionResult.b()) {
                ResolveAccountResponse resolveAccountResponse = signInResponse.c;
                connectionResult = resolveAccountResponse.c;
                if (connectionResult.b()) {
                    bsf.g = true;
                    bsf.h = bva.a(resolveAccountResponse.b);
                    bsf.i = resolveAccountResponse.d;
                    bsf.j = resolveAccountResponse.e;
                    bsf.e();
                    return;
                }
                Log.wtf("GoogleApiClientConnecting", "Sign-in succeeded with resolve account failure: " + connectionResult, new Exception());
                bsf.b(connectionResult);
            } else if (bsf.a(connectionResult)) {
                bsf.f();
                bsf.e();
            } else {
                bsf.b(connectionResult);
            }
        }
    }
}
