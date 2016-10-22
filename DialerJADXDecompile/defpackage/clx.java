package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: clx */
public final class clx extends bui {
    public clx(Context context, Looper looper, bue bue, brf brf, brg brg) {
        super(context, looper, 40, bue, brf, brg);
    }

    protected final String f() {
        return "com.google.android.gms.clearcut.service.START";
    }

    protected final String g() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cmb)) ? new cmd(iBinder) : (cmb) queryLocalInterface;
    }
}
