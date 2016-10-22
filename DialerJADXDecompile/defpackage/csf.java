package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* renamed from: csf */
public interface csf extends IInterface {
    void a(int i);

    void a(int i, Account account, csc csc);

    void a(buz buz, int i, boolean z);

    void a(AuthAccountRequest authAccountRequest, csc csc);

    void a(ResolveAccountRequest resolveAccountRequest, bvj bvj);

    void a(CheckServerAuthResult checkServerAuthResult);

    void a(RecordConsentRequest recordConsentRequest, csc csc);

    void a(SignInRequest signInRequest, csc csc);

    void a(csc csc);

    void a(boolean z);
}
