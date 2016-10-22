import android.os.Binder;
import android.os.Message;
import android.os.Parcel;

public abstract class hbu extends Binder implements hbt {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
                a(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.iid.IMessengerCompat");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
