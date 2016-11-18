package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

public final class hxh extends gwg<hxd> implements hca {
    private final boolean f17435e;
    private final gwa f17436f;
    private final Bundle f17437g;
    private Integer f17438h;

    public hxh(Context context, Looper looper, boolean z, gwa gwa, Bundle bundle, guk guk, gul gul) {
        super(context, looper, 44, gwa, guk, gul);
        this.f17435e = z;
        this.f17436f = gwa;
        this.f17437g = bundle;
        this.f17438h = gwa.m18763i();
    }

    public void mo3041a(gwp gwp, boolean z) {
        try {
            ((hxd) m18714p()).mo3038a(gwp, this.f17438h.intValue(), z);
        } catch (RemoteException e) {
        }
    }

    public void mo3042a(hxa hxa) {
        gwb.m2195f((Object) hxa, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f17436f.m18756b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = gta.m18507a(this.f16215a).m18509a();
            }
            ((hxd) m18714p()).mo3037a(new SignInRequest(new ResolveAccountRequest(b, this.f17438h.intValue(), googleSignInAccount)), hxa);
        } catch (Throwable e) {
            try {
                hxa.mo2505a(new SignInResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public boolean mo3043d() {
        return this.f17435e;
    }

    protected String mo2346g() {
        return "com.google.android.gms.signin.service.START";
    }

    protected String mo2347h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public void mo2348i() {
        try {
            ((hxd) m18714p()).mo3031a(this.f17438h.intValue());
        } catch (RemoteException e) {
        }
    }

    public void mo3044j() {
        m18698a(new gvx(this));
    }

    protected Bundle mo2560m() {
        if (!this.f16215a.getPackageName().equals(this.f17436f.m18760f())) {
            this.f17437g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f17436f.m18760f());
        }
        return this.f17437g;
    }

    public hxh(Context context, Looper looper, boolean z, gwa gwa, guk guk, gul gul) {
        hcb h = gwa.m18762h();
        Integer i = gwa.m18763i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", gwa.m18754a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.m19195a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.m19196b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.m19197c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.m19198d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.m19199e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.m19200f());
        }
        this(context, looper, true, gwa, bundle, guk, gul);
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hxd)) ? new hxf(iBinder) : (hxd) queryLocalInterface;
    }
}
