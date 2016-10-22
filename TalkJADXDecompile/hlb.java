import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;

public final class hlb {
    public final hln a;

    protected hlb(hln hln) {
        this.a = (hln) gwb.L((Object) hln);
    }

    public final hpt a(MarkerOptions markerOptions) {
        try {
            hqm a = this.a.a(markerOptions);
            return a != null ? new hpt(a) : null;
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public final void a(hla hla) {
        try {
            this.a.a(hla.a());
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }
}
