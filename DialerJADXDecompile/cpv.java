import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

public final class cpv extends brq {
    private /* synthetic */ LocationSettingsRequest f;
    private /* synthetic */ String g;

    public cpv(cor cor, brc brc, LocationSettingsRequest locationSettingsRequest, String str) {
        this.f = locationSettingsRequest;
        this.g = str;
        super(brc, '\u0000');
    }

    protected final /* synthetic */ void b(bra bra) {
        boolean z = true;
        cpp cpp = (cpp) bra;
        LocationSettingsRequest locationSettingsRequest = this.f;
        String str = this.g;
        cpp.k();
        buf.b(locationSettingsRequest != null, (Object) "locationSettingsRequest can't be null nor empty.");
        if (this == null) {
            z = false;
        }
        buf.b(z, (Object) "listener can't be null.");
        ((cpf) cpp.l()).a(locationSettingsRequest, new cpq(this), str);
    }

    public final /* synthetic */ brl c(Status status) {
        return new LocationSettingsResult(status);
    }
}
