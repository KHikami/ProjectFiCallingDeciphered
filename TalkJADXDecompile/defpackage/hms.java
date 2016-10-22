package defpackage;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;

/* renamed from: hms */
public abstract class hms extends Binder implements hmr {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                a(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
