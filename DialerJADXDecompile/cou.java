import android.os.IBinder;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class cou extends cow {
    private /* synthetic */ LocationRequest f;
    private /* synthetic */ com g;

    public cou(coj coj, brc brc, LocationRequest locationRequest, com com) {
        this.f = locationRequest;
        this.g = com;
        super(brc);
    }

    protected final /* synthetic */ void b(bra bra) {
        IBinder iBinder = null;
        cpp cpp = (cpp) bra;
        coz cox = new cox(this);
        LocationRequest locationRequest = this.f;
        com com = this.g;
        synchronized (cpp.f) {
            cpl cpl = cpp.f;
            cpl.a.b();
            cqb a = cpl.a(com, null);
            cpf cpf = (cpf) cpl.a.a();
            LocationRequestInternal a2 = LocationRequestInternal.a(locationRequest);
            IBinder asBinder = a.asBinder();
            if (cox != null) {
                iBinder = cox.asBinder();
            }
            cpf.a(new LocationRequestUpdateData(1, 1, a2, asBinder, null, null, iBinder));
        }
    }
}
