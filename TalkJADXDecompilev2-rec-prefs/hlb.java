package p000;

import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;

public final class hlb {
    public final hln f17062a;

    protected hlb(hln hln) {
        this.f17062a = (hln) gwb.m1419L((Object) hln);
    }

    public final hpt m20011a(MarkerOptions markerOptions) {
        try {
            hqm a = this.f17062a.mo2624a(markerOptions);
            return a != null ? new hpt(a) : null;
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public final void m20012a(hla hla) {
        try {
            this.f17062a.mo2630a(hla.m20010a());
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }
}
