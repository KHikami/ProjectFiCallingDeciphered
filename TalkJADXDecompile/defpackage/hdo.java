package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;

/* renamed from: hdo */
public final class hdo extends gwg<hds> {
    public hdo(Context context, Looper looper, gwa gwa, guk guk, gul gul) {
        super(context, looper, 40, gwa, guk, gul);
    }

    public void a(hdp hdp, LogEventParcelable logEventParcelable) {
        ((hds) p()).a(hdp, logEventParcelable);
    }

    protected String g() {
        return "com.google.android.gms.clearcut.service.START";
    }

    protected String h() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hds)) ? new hdu(iBinder) : (hds) queryLocalInterface;
    }
}
