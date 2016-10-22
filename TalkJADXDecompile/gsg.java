import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class gsg extends Binder implements gsf {
    public gsg() {
        attachInterface(this, "com.google.android.apps.tycho.IProxyNumberCallback");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.apps.tycho.IProxyNumberCallback");
                a(parcel.readString(), parcel.readString());
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.apps.tycho.IProxyNumberCallback");
                a(parcel.readInt());
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.apps.tycho.IProxyNumberCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
