package p000;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

public interface hxa extends IInterface {
    void mo2502a(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    void mo2503a(Status status);

    void mo2504a(Status status, GoogleSignInAccount googleSignInAccount);

    void mo2505a(SignInResponse signInResponse);

    void mo2506b(Status status);
}
