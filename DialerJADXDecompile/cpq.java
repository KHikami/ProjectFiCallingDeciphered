import com.google.android.gms.location.LocationSettingsResult;

final class cpq extends cpj {
    private brr a;

    public cpq(brr brr) {
        buf.b(brr != null, (Object) "listener can't be null.");
        this.a = brr;
    }

    public final void a(LocationSettingsResult locationSettingsResult) {
        this.a.a(locationSettingsResult);
        this.a = null;
    }
}
