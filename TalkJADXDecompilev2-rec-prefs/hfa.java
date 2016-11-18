package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

final class hfa extends hfk {
    final /* synthetic */ hes f16795a;
    final /* synthetic */ SignInResponse f16796b;
    final /* synthetic */ hez f16797c;

    hfa(hez hez, hfi hfi, hes hes, SignInResponse signInResponse) {
        this.f16797c = hez;
        this.f16795a = hes;
        this.f16796b = signInResponse;
        super(hfi);
    }

    public void mo2500a() {
        hes hes = this.f16795a;
        SignInResponse signInResponse = this.f16796b;
        if (hes.m19561b(0)) {
            ConnectionResult a = signInResponse.m9996a();
            if (a.m9653b()) {
                ResolveAccountResponse b = signInResponse.m9997b();
                a = b.m9695b();
                if (a.m9653b()) {
                    hes.f16766g = true;
                    hes.f16767h = b.m9694a();
                    hes.f16768i = b.m9696c();
                    hes.f16769j = b.m9697d();
                    hes.m19564e();
                    return;
                }
                String valueOf = String.valueOf(a);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                hes.m19558b(a);
            } else if (hes.m19556a(a)) {
                hes.m19565f();
                hes.m19564e();
            } else {
                hes.m19558b(a);
            }
        }
    }
}
