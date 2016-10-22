import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public class cos extends bui {
    public final cpu e;
    private final String f;

    public cos(Context context, Looper looper, brf brf, brg brg, String str, bue bue) {
        super(context, looper, 23, bue, brf, brg);
        this.e = new cpu(this);
        this.f = str;
    }

    protected final String f() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String g() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f);
        return bundle;
    }

    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cpf)) ? new cph(iBinder) : (cpf) queryLocalInterface;
    }
}
