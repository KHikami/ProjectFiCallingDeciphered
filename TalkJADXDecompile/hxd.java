import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

public interface hxd extends IInterface {
    void a(int i);

    void a(int i, Account account, hxa hxa);

    void a(AuthAccountRequest authAccountRequest, hxa hxa);

    void a(ResolveAccountRequest resolveAccountRequest, gxh gxh);

    void a(CheckServerAuthResult checkServerAuthResult);

    void a(RecordConsentRequest recordConsentRequest, hxa hxa);

    void a(SignInRequest signInRequest, hxa hxa);

    void a(gwp gwp, int i, boolean z);

    void a(hxa hxa);

    void a(boolean z);
}
