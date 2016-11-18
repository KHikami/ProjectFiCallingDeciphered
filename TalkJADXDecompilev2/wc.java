package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

final class wc {
    static wc a;
    private final Context b;
    private final LocationManager c;
    private final wd d = new wd();

    wc(Context context, LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    boolean a() {
        Object obj;
        wd wdVar = this.d;
        if (this.d == null || this.d.f <= System.currentTimeMillis()) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            return wdVar.a;
        }
        Location location = null;
        Location location2 = null;
        if (gwb.b(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = a("network");
        }
        if (gwb.b(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = a("gps");
        }
        Location location3 = (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
        if (location3 != null) {
            long j;
            wd wdVar2 = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            if (wb.a == null) {
                wb.a = new wb();
            }
            wb wbVar = wb.a;
            wbVar.a(currentTimeMillis - 86400000, location3.getLatitude(), location3.getLongitude());
            long j2 = wbVar.b;
            wbVar.a(currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            boolean z = wbVar.d == 1;
            long j3 = wbVar.c;
            long j4 = wbVar.b;
            wbVar.a(86400000 + currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            long j5 = wbVar.c;
            if (j3 == -1 || j4 == -1) {
                j = 43200000 + currentTimeMillis;
            } else {
                if (currentTimeMillis > j4) {
                    j = 0 + j5;
                } else if (currentTimeMillis > j3) {
                    j = 0 + j4;
                } else {
                    j = 0 + j3;
                }
                j += 60000;
            }
            wdVar2.a = z;
            wdVar2.b = j2;
            wdVar2.c = j3;
            wdVar2.d = j4;
            wdVar2.e = j5;
            wdVar2.f = j;
            return wdVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private Location a(String str) {
        if (this.c != null) {
            try {
                if (this.c.isProviderEnabled(str)) {
                    return this.c.getLastKnownLocation(str);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
}
