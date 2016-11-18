package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

public final class hqx implements hqv {
    private IBinder a;

    public hqx(IBinder iBinder) {
        this.a = iBinder;
    }

    public Tile a(int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Tile tile = obtain2.readInt() != 0 ? (Tile) Tile.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return tile;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
