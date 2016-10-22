import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

public abstract class hnf extends Binder implements hne {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                a(parcel.readInt() != 0 ? (CameraPosition) CameraPosition.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
