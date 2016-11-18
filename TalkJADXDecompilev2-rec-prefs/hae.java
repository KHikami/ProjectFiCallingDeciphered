package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class hae extends gwg<hag> {
    public hae(Context context, Looper looper, gwa gwa, guk guk, gul gul) {
        super(context, looper, 63, gwa, guk, gul);
    }

    protected String mo2346g() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    protected String mo2347h() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hag)) ? new hai(iBinder) : (hag) queryLocalInterface;
    }
}
