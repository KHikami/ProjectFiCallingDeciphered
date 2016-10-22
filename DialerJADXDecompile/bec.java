import android.content.Context;
import android.location.Address;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
public class bec implements brf, brg {
    public final Context a;
    public final bed b;
    public brc c;

    public void a() {
        if (this.c != null) {
            this.c.c();
            this.c.b((brf) this);
            this.c.b((brg) this);
            this.c = null;
        }
    }

    public float a(Address address) {
        Location c = c();
        if (this.c == null || c == null || address == null) {
            return -1.0f;
        }
        try {
            float[] fArr = new float[3];
            Location.distanceBetween(address.getLatitude(), address.getLongitude(), c.getLatitude(), c.getLongitude(), fArr);
            return fArr[0];
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(address);
            String valueOf2 = String.valueOf(c);
            String valueOf3 = String.valueOf(e);
            bdf.e("DistanceHelper", new StringBuilder(((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("No distance found between ").append(valueOf).append(" and ").append(valueOf2).append(".").append(valueOf3).toString());
            return -1.0f;
        } catch (IllegalStateException e2) {
            String valueOf4 = String.valueOf(address);
            bdf.e("DistanceHelper", new StringBuilder(String.valueOf(valueOf4).length() + 29).append("No latitude or longitude for ").append(valueOf4).toString());
            return -1.0f;
        }
    }

    public bec(Context context, bed bed) {
        this.a = context;
        this.b = bed;
        b();
    }

    public void b() {
        if (!buf.j(this.a)) {
            bdf.a("DistanceHelper", "No location permissions, unable to get location.");
        } else if (bln.b(this.a) && bln.a(this.a)) {
            this.c = new brd(this.a).a(coo.b).a((brf) this).a((brg) this).b();
            this.c.b();
        } else {
            bdf.a("DistanceHelper", "Location is disabled, unable to get location.");
        }
    }

    public void a(Bundle bundle) {
        this.b.c();
    }

    public void a(int i) {
    }

    public void a(ConnectionResult connectionResult) {
    }

    public Location c() {
        if (this.c != null) {
            return coo.c.a(this.c);
        }
        return null;
    }
}
