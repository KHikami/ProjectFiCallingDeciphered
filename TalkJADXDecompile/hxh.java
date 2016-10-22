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
    private final boolean e;
    private final gwa f;
    private final Bundle g;
    private Integer h;

    public hxh(Context context, Looper looper, boolean z, gwa gwa, Bundle bundle, guk guk, gul gul) {
        super(context, looper, 44, gwa, guk, gul);
        this.e = z;
        this.f = gwa;
        this.g = bundle;
        this.h = gwa.i();
    }

    public void a(gwp gwp, boolean z) {
        try {
            ((hxd) p()).a(gwp, this.h.intValue(), z);
        } catch (RemoteException e) {
        }
    }

    public void a(hxa hxa) {
        gwb.f((Object) hxa, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = gta.a(this.a).a();
            }
            ((hxd) p()).a(new SignInRequest(new ResolveAccountRequest(b, this.h.intValue(), googleSignInAccount)), hxa);
        } catch (Throwable e) {
            try {
                hxa.a(new SignInResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public boolean d() {
        return this.e;
    }

    protected String g() {
        return "com.google.android.gms.signin.service.START";
    }

    protected String h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public void i() {
        try {
            ((hxd) p()).a(this.h.intValue());
        } catch (RemoteException e) {
        }
    }

    public void j() {
        a(new gvx(this));
    }

    protected Bundle m() {
        if (!this.a.getPackageName().equals(this.f.f())) {
            this.g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f.f());
        }
        return this.g;
    }

    public hxh(Context context, Looper looper, boolean z, gwa gwa, guk guk, gul gul) {
        hcb h = gwa.h();
        Integer i = gwa.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", gwa.a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.f());
        }
        this(context, looper, true, gwa, bundle, guk, gul);
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hxd)) ? new hxf(iBinder) : (hxd) queryLocalInterface;
    }
}
