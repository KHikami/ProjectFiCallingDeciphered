package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public class hjk extends gwg<hjt> {
    public final hkg<hjt> e = new hkg(this);
    private final String f;

    public hjk(Context context, Looper looper, guk guk, gul gul, String str, gwa gwa) {
        super(context, looper, 23, gwa, guk, gul);
        this.f = str;
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    protected String g() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String h() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f);
        return bundle;
    }

    protected hjt b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hjt)) ? new hjv(iBinder) : (hjt) queryLocalInterface;
    }
}
