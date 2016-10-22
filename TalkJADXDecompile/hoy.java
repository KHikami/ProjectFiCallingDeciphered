import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;

public abstract class hoy extends Binder implements hox {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
                a(parcel.readInt() != 0 ? (PointOfInterest) PointOfInterest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnPoiClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
