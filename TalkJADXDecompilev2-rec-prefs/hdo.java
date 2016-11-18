package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;

public final class hdo extends gwg<hds> {
    public hdo(Context context, Looper looper, gwa gwa, guk guk, gul gul) {
        super(context, looper, 40, gwa, guk, gul);
    }

    public void m19431a(hdp hdp, LogEventParcelable logEventParcelable) {
        ((hds) m18714p()).mo2465a(hdp, logEventParcelable);
    }

    protected String mo2346g() {
        return "com.google.android.gms.clearcut.service.START";
    }

    protected String mo2347h() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hds)) ? new hdu(iBinder) : (hds) queryLocalInterface;
    }
}
