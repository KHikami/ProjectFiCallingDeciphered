import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

public abstract class csg extends Binder implements csf {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        bvj bvj = null;
        switch (i) {
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(parcel.readInt() != 0 ? (AuthAccountRequest) AuthAccountRequest.CREATOR.createFromParcel(parcel) : null, csd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(parcel.readInt() != 0 ? (CheckServerAuthResult) CheckServerAuthResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case rl.f /*4*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case rl.g /*5*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                ResolveAccountRequest resolveAccountRequest = parcel.readInt() != 0 ? (ResolveAccountRequest) ResolveAccountRequest.CREATOR.createFromParcel(parcel) : null;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    bvj = (queryLocalInterface == null || !(queryLocalInterface instanceof bvj)) ? new bvl(readStrongBinder) : (bvj) queryLocalInterface;
                }
                a(resolveAccountRequest, bvj);
                parcel2.writeNoException();
                return true;
            case rl.h /*7*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case rl.j /*8*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, csd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.l /*9*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                buz a = bva.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a, readInt, z);
                parcel2.writeNoException();
                return true;
            case rl.m /*10*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(parcel.readInt() != 0 ? (RecordConsentRequest) RecordConsentRequest.CREATOR.createFromParcel(parcel) : null, csd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.n /*11*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(csd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.k /*12*/:
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                a(parcel.readInt() != 0 ? (SignInRequest) SignInRequest.CREATOR.createFromParcel(parcel) : null, csd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
