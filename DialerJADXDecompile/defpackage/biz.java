package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: biz */
public class biz {
    private static String a;

    static {
        a = biz.class.getSimpleName();
    }

    public static Location a(brc brc) {
        Object obj;
        if (brc == null || !brc.d()) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null && biz.b(brc).b.g == 0) {
            return coo.c.a(brc);
        }
        return null;
    }

    public static LocationSettingsResult b(brc brc) {
        boolean z;
        if (brc == null || !(brc.d() || brc.e())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        LocationRequest a = new LocationRequest().a(104);
        coq coq = new coq();
        coq.a.add(a);
        return (LocationSettingsResult) coo.d.a(brc, new LocationSettingsRequest(coq.a, false, false)).a(3000, TimeUnit.MILLISECONDS);
    }
}
