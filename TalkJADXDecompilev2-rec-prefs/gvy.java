package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class gvy extends gvp {
    public final IBinder f16256e;
    final /* synthetic */ gvo f16257f;

    public gvy(gvo gvo, int i, IBinder iBinder, Bundle bundle) {
        this.f16257f = gvo;
        super(gvo, i, bundle);
        this.f16256e = iBinder;
    }

    protected void mo2353a(ConnectionResult connectionResult) {
        if (this.f16257f.f16235v != null) {
            this.f16257f.f16235v.m18734a(connectionResult);
        }
        this.f16257f.m18697a(connectionResult);
    }

    protected boolean mo2354a() {
        try {
            String interfaceDescriptor = this.f16256e.getInterfaceDescriptor();
            if (this.f16257f.mo2347h().equals(interfaceDescriptor)) {
                IInterface a = this.f16257f.mo2345a(this.f16256e);
                if (a == null || !this.f16257f.m18685a(2, 3, a)) {
                    return false;
                }
                this.f16257f.m18713o();
                if (this.f16257f.f16234u != null) {
                    this.f16257f.f16234u.m18733a(null);
                }
                return true;
            }
            String valueOf = String.valueOf(this.f16257f.mo2347h());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(valueOf).append(" vs. ").append(interfaceDescriptor).toString());
            return false;
        } catch (RemoteException e) {
            return false;
        }
    }
}
