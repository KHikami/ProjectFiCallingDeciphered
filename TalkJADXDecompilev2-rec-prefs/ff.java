package p000;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

final class ff implements fd {
    private IBinder f12950a;

    ff(IBinder iBinder) {
        this.f12950a = iBinder;
    }

    public IBinder asBinder() {
        return this.f12950a;
    }

    public void mo1988a(String str, int i, String str2, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f12950a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo1987a(String str, int i, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.f12950a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo1986a(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            this.f12950a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
