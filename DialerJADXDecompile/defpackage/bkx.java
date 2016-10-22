package defpackage;

import android.content.Context;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bkx */
public final class bkx {
    private final Context a;

    public bkx(Context context) {
        this.a = context;
    }

    final dbx a(String str, int i, int i2) {
        int i3;
        dbx dbx = new dbx();
        Context context = this.a;
        Map arrayMap = new ArrayMap();
        arrayMap.put("phone_number", str);
        arrayMap.put("current_global_blacklist_version ", String.valueOf(bky.b(context)));
        dbx.b = buf.a(context, "dialer_spam_report", arrayMap);
        dbx.a = "dialer";
        dbx.d = str;
        dbx.i = String.valueOf(bky.b(this.a));
        den den = new den();
        den.a = TimeUnit.HOURS.toSeconds(TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()));
        dbx.e = den;
        switch (i) {
            case rq.b /*1*/:
                i3 = 1;
                break;
            case rl.e /*3*/:
                i3 = 2;
                break;
            case rl.f /*4*/:
                i3 = 3;
                break;
            default:
                i3 = 0;
                break;
        }
        dbx.f = i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        dbx.g = telephonyManager.getSimCountryIso();
        dbx.h = telephonyManager.getNetworkCountryIso();
        dbx.k = i2;
        return dbx;
    }

    final void a(dbx dbx) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(String.valueOf("This method must not be called from the UI thread!"));
        }
        brc b = new brd(this.a).a(bqg.b).b();
        b.a(1000, TimeUnit.MILLISECONDS);
        if (b.d()) {
            dem dby = new dby();
            dby.a = dbx;
            new bqg(this.a, "SCOOBY_SPAM_REPORT_LOG", null, null).a(dem.a(dby)).a(b);
            buf.a("SpamClearcutLoggerHelper, Spam Report Logged", new Object[0]);
            return;
        }
        buf.a("SpamClearcutLoggerHelper, Not connected to Google API client, can't send spam clearcut log.", new Object[0]);
    }
}
