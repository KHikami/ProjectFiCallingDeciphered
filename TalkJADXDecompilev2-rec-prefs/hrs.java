package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class hrs implements hrq {
    private IBinder f17138a;

    public hrs(IBinder iBinder) {
        this.f17138a = iBinder;
    }

    public void mo2941a(hib hib) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
            obtain.writeStrongBinder(hib != null ? hib.asBinder() : null);
            this.f17138a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2942a(hie hie) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
            obtain.writeStrongBinder(hie != null ? hie.asBinder() : null);
            this.f17138a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2943a(String str, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle2 != null) {
                obtain.writeInt(1);
                bundle2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17138a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17138a;
    }
}
