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

public final class csj extends bui implements cod {
    private final boolean e;
    private final bue f;
    private final Bundle g;
    private Integer h;

    public csj(Context context, Looper looper, boolean z, bue bue, Bundle bundle, brf brf, brg brg) {
        super(context, looper, 44, bue, brf, brg);
        this.e = z;
        this.f = bue;
        this.g = bundle;
        this.h = bue.h;
    }

    public csj(Context context, Looper looper, boolean z, bue bue, brf brf, brg brg) {
        coe coe = bue.g;
        Integer num = bue.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", bue.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (coe != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", coe.b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", coe.c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", coe.d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", coe.e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", coe.f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", coe.g);
        }
        this(context, looper, true, bue, bundle, brf, brg);
    }

    public final void a(buz buz, boolean z) {
        try {
            ((csf) l()).a(buz, this.h.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(csc csc) {
        buf.d((Object) csc, (Object) "Expecting a valid ISignInCallbacks");
        try {
            bue bue = this.f;
            Account account = bue.a != null ? bue.a : new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                bpy a = bpy.a(this.a);
                googleSignInAccount = a.a(a.b("defaultGoogleSignInAccount"));
            }
            ((csf) l()).a(new SignInRequest(new ResolveAccountRequest(account, this.h.intValue(), googleSignInAccount)), csc);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                csc.a(new SignInResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final boolean c() {
        return this.e;
    }

    protected final String f() {
        return "com.google.android.gms.signin.service.START";
    }

    protected final String g() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void h() {
        try {
            ((csf) l()).a(this.h.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void i() {
        a(new buo(this));
    }

    protected final Bundle j() {
        if (!this.a.getPackageName().equals(this.f.e)) {
            this.g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f.e);
        }
        return this.g;
    }

    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof csf)) ? new csh(iBinder) : (csf) queryLocalInterface;
    }
}
