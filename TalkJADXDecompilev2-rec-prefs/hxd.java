package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

public interface hxd extends IInterface {
    void mo3031a(int i);

    void mo3032a(int i, Account account, hxa hxa);

    void mo3033a(AuthAccountRequest authAccountRequest, hxa hxa);

    void mo3034a(ResolveAccountRequest resolveAccountRequest, gxh gxh);

    void mo3035a(CheckServerAuthResult checkServerAuthResult);

    void mo3036a(RecordConsentRequest recordConsentRequest, hxa hxa);

    void mo3037a(SignInRequest signInRequest, hxa hxa);

    void mo3038a(gwp gwp, int i, boolean z);

    void mo3039a(hxa hxa);

    void mo3040a(boolean z);
}
