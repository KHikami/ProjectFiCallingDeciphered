package defpackage;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

public interface hxa extends IInterface {
    void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    void a(Status status);

    void a(Status status, GoogleSignInAccount googleSignInAccount);

    void a(SignInResponse signInResponse);

    void b(Status status);
}
