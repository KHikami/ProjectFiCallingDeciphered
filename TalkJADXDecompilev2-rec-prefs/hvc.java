package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public abstract class hvc extends Binder implements hvb {
    public hvc() {
        attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public static hvb m20913a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hvb)) ? new hvd(iBinder) : (hvb) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                mo2956a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                mo2959a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DataHolder) DataHolder.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                mo2957a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2960a(readInt, bundle, (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                mo2958a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
