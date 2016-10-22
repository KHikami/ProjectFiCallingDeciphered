import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.view.Window;
import android.view.Window.Callback;
import java.util.Calendar;

/* compiled from: PG */
class qh extends qg {
    private static re x;
    boolean n;
    private int y;

    qh(Context context, Window window, qa qaVar) {
        super(context, window, qaVar);
        this.y = -100;
        this.n = true;
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.y == -100) {
            this.y = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    Callback a(Callback callback) {
        return new qi(this, callback);
    }

    public final boolean i() {
        int i;
        if (this.y == -100) {
            i = qb.a;
        } else {
            i = this.y;
        }
        i = f(i);
        if (i == -1) {
            return false;
        }
        Resources resources = this.b.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        i = i == 2 ? 32 : 16;
        if (i2 == i) {
            return false;
        }
        Configuration configuration2 = new Configuration(configuration);
        configuration2.uiMode = i | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        return true;
    }

    int f(int i) {
        switch (i) {
            case -100:
                return -1;
            case rl.c /*0*/:
                boolean z;
                if (x == null) {
                    x = new re(this.b.getApplicationContext());
                }
                re reVar = x;
                rf rfVar = re.a;
                if (re.a(rfVar)) {
                    z = rfVar.a;
                } else {
                    Location location = null;
                    Location location2 = null;
                    if (buf.a(reVar.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        location = reVar.a("network");
                    }
                    if (buf.a(reVar.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location2 = reVar.a("gps");
                    }
                    Location location3 = (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
                    if (location3 != null) {
                        rf rfVar2 = re.a;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (rd.a == null) {
                            rd.a = new rd();
                        }
                        rd rdVar = rd.a;
                        rdVar.a(currentTimeMillis - 86400000, location3.getLatitude(), location3.getLongitude());
                        rdVar.a(currentTimeMillis, location3.getLatitude(), location3.getLongitude());
                        z = rdVar.d == 1;
                        long j = rdVar.c;
                        long j2 = rdVar.b;
                        rdVar.a(86400000 + currentTimeMillis, location3.getLatitude(), location3.getLongitude());
                        long j3 = rdVar.c;
                        if (j == -1 || j2 == -1) {
                            j3 = 43200000 + currentTimeMillis;
                        } else {
                            if (currentTimeMillis > j2) {
                                j3 += 0;
                            } else if (currentTimeMillis > j) {
                                j3 = 0 + j2;
                            } else {
                                j3 = 0 + j;
                            }
                            j3 += 60000;
                        }
                        rfVar2.a = z;
                        rfVar2.b = j3;
                        z = rfVar.a;
                    } else {
                        int i2 = Calendar.getInstance().get(11);
                        z = i2 < 6 || i2 >= 22;
                    }
                }
                if (z) {
                    return 2;
                }
                return 1;
            default:
                return i;
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (this.y != -100) {
            bundle.putInt("appcompat:local_night_mode", this.y);
        }
    }
}
