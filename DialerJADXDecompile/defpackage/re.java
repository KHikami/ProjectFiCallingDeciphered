package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* compiled from: PG */
/* renamed from: re */
final class re {
    static final rf a;
    final Context b;
    private final LocationManager c;

    static {
        a = new rf();
    }

    re(Context context) {
        this.b = context;
        this.c = (LocationManager) context.getSystemService("location");
    }

    final Location a(String str) {
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

    static boolean a(rf rfVar) {
        return rfVar != null && rfVar.b > System.currentTimeMillis();
    }
}
