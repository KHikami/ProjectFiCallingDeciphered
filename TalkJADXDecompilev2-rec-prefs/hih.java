package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class hih extends gwg<hrq> {
    public hih(Context context, Looper looper, gwa gwa, guk guk, gul gul) {
        super(context, looper, 28, gwa, guk, gul);
    }

    protected String mo2346g() {
        return "com.google.android.gms.mdm.services.START";
    }

    protected String mo2347h() {
        return "com.google.android.gms.mdm.internal.INetworkQualityService";
    }

    public /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hrq)) ? new hrs(iBinder) : (hrq) queryLocalInterface;
    }
}
