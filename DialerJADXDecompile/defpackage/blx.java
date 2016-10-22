package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.dialer.incallui.InCallUiControllerService;

/* compiled from: PG */
/* renamed from: blx */
public class blx extends Binder implements blw {
    public final /* synthetic */ InCallUiControllerService a;

    public blx() {
        attachInterface(this, "com.google.android.dialer.incallui.IInCallUiControllerService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case rq.c /*2*/:
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

    public blx(InCallUiControllerService inCallUiControllerService) {
        this.a = inCallUiControllerService;
        this();
    }

    public void a(PendingIntent pendingIntent) {
        bdf.d(this.a, "showDialog");
        InCallUiControllerService.a(this.a);
        this.a.b.obtainMessage(1, pendingIntent).sendToTarget();
    }
}
