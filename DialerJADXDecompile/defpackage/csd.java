package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: csd */
public abstract class csd extends Binder implements csc {
    public csd() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public static csc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof csc)) ? new cse(iBinder) : (csc) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                a(parcel.readInt() != 0 ? (ConnectionResult) ConnectionResult.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (AuthAccountResult) AuthAccountResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.f /*4*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.i /*6*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                b(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.h /*7*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (GoogleSignInAccount) GoogleSignInAccount.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.j /*8*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                a(parcel.readInt() != 0 ? (SignInResponse) SignInResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
