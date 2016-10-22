import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
final class ctl implements fr {
    private final ConnectionResult a;

    public ctl(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            throw new IllegalArgumentException("null connectionResult");
        }
        this.a = connectionResult;
    }

    public final String toString() {
        return this.a.toString();
    }
}
