package p000;

import android.app.Notification;
import android.os.Binder;
import android.os.Parcel;

public abstract class fe extends Binder implements fd {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Notification notification;
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                } else {
                    notification = null;
                }
                mo1988a(readString, readInt, readString2, notification);
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo1987a(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo1986a(parcel.readString());
                return true;
            case 1598968902:
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
