package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public class hjk extends gwg<hjt> {
    public final hkg<hjt> f17042e = new hkg(this);
    private final String f17043f;

    public hjk(Context context, Looper looper, guk guk, gul gul, String str, gwa gwa) {
        super(context, looper, 23, gwa, guk, gul);
        this.f17043f = str;
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        return m19906b(iBinder);
    }

    protected String mo2346g() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String mo2347h() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle mo2560m() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f17043f);
        return bundle;
    }

    protected hjt m19906b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hjt)) ? new hjv(iBinder) : (hjt) queryLocalInterface;
    }
}
