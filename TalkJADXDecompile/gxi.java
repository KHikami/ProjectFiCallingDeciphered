import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountResponse;

public abstract class gxi extends Binder implements gxh {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                a(parcel.readInt() != 0 ? (ResolveAccountResponse) ResolveAccountResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
