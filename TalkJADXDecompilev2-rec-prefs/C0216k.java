package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class C0216k implements C0055i {
    private IBinder f21333a;

    C0216k(IBinder iBinder) {
        this.f21333a = iBinder;
    }

    public IBinder asBinder() {
        return this.f21333a;
    }

    public void mo1961a(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21333a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo1962a(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21333a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
