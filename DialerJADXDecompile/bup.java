import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class bup extends buj {
    private IBinder c;
    private /* synthetic */ bui d;

    public bup(bui bui, int i, IBinder iBinder, Bundle bundle) {
        this.d = bui;
        super(bui, i, bundle);
        this.c = iBinder;
    }

    protected final void a(ConnectionResult connectionResult) {
        if (this.d.w != null) {
            this.d.w.a(connectionResult);
        }
        this.d.a(connectionResult);
    }

    protected final boolean a() {
        try {
            String interfaceDescriptor = this.c.getInterfaceDescriptor();
            if (this.d.g().equals(interfaceDescriptor)) {
                IInterface a = this.d.a(this.c);
                if (a == null || !this.d.a(2, 3, a)) {
                    return false;
                }
                bui bui = this.d;
                if (this.d.v != null) {
                    this.d.v.a(null);
                }
                return true;
            }
            Log.e("GmsClient", "service descriptor mismatch: " + this.d.g() + " vs. " + interfaceDescriptor);
            return false;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
