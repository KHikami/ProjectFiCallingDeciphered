package com.android.contacts.common.location;

import afa;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import buf;

/* compiled from: PG */
public final class CountryDetector {
    private static CountryDetector c;
    public final TelephonyManager a;
    public final Context b;
    private final LocationManager d;
    private final afa e;

    /* compiled from: PG */
    public class LocationChangedReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra("location")) {
                UpdateCountryService.a(context, (Location) intent.getExtras().get("location"));
            }
        }
    }

    private CountryDetector(Context context) {
        this(context, (TelephonyManager) context.getSystemService("phone"), (LocationManager) context.getSystemService("location"), new afa());
    }

    private CountryDetector(Context context, TelephonyManager telephonyManager, LocationManager locationManager, afa afa) {
        this.a = telephonyManager;
        this.d = locationManager;
        this.e = afa;
        this.b = context;
        LocationManager locationManager2 = this.d;
        if (!buf.j(context)) {
            Log.w("CountryDetector", "No location permissions, not registering for location updates.");
        } else if (Geocoder.isPresent()) {
            locationManager2.requestLocationUpdates("passive", 43200000, 5000.0f, PendingIntent.getBroadcast(context, 0, new Intent(context, LocationChangedReceiver.class), 134217728));
        }
    }

    public static synchronized CountryDetector a(Context context) {
        CountryDetector countryDetector;
        synchronized (CountryDetector.class) {
            if (c == null) {
                c = new CountryDetector(context.getApplicationContext());
            }
            countryDetector = c;
        }
        return countryDetector;
    }
}
