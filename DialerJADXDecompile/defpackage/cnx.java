package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: cnx */
public final class cnx extends bui {
    public cnx(Context context, Looper looper, bue bue, brf brf, brg brg) {
        super(context, looper, 51, bue, brf, brg);
    }

    protected final String f() {
        return "com.google.android.gms.phenotype.service.START";
    }

    protected final String g() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cnl)) ? new cnn(iBinder) : (cnl) queryLocalInterface;
    }
}
