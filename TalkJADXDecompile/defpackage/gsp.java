package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Parcel;

/* renamed from: gsp */
public abstract class gsp extends Binder implements gso {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
                int a = a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case wi.l /*2*/:
                PendingIntent pendingIntent;
                parcel.enforceInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
                if (parcel.readInt() != 0) {
                    pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                } else {
                    pendingIntent = null;
                }
                a(pendingIntent);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.dialer.incallui.IInCallUiControllerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
