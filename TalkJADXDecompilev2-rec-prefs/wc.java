package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

final class wc {
    static wc f35427a;
    private final Context f35428b;
    private final LocationManager f35429c;
    private final wd f35430d = new wd();

    wc(Context context, LocationManager locationManager) {
        this.f35428b = context;
        this.f35429c = locationManager;
    }

    boolean m41106a() {
        Object obj;
        wd wdVar = this.f35430d;
        if (this.f35430d == null || this.f35430d.f35436f <= System.currentTimeMillis()) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            return wdVar.f35431a;
        }
        Location location = null;
        Location location2 = null;
        if (gwb.b(this.f35428b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m41105a("network");
        }
        if (gwb.b(this.f35428b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m41105a("gps");
        }
        Location location3 = (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
        if (location3 != null) {
            long j;
            wd wdVar2 = this.f35430d;
            long currentTimeMillis = System.currentTimeMillis();
            if (wb.f35423a == null) {
                wb.f35423a = new wb();
            }
            wb wbVar = wb.f35423a;
            wbVar.m41104a(currentTimeMillis - 86400000, location3.getLatitude(), location3.getLongitude());
            long j2 = wbVar.f35424b;
            wbVar.m41104a(currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            boolean z = wbVar.f35426d == 1;
            long j3 = wbVar.f35425c;
            long j4 = wbVar.f35424b;
            wbVar.m41104a(86400000 + currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            long j5 = wbVar.f35425c;
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
            wdVar2.f35431a = z;
            wdVar2.f35432b = j2;
            wdVar2.f35433c = j3;
            wdVar2.f35434d = j4;
            wdVar2.f35435e = j5;
            wdVar2.f35436f = j;
            return wdVar.f35431a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private Location m41105a(String str) {
        if (this.f35429c != null) {
            try {
                if (this.f35429c.isProviderEnabled(str)) {
                    return this.f35429c.getLastKnownLocation(str);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
}
