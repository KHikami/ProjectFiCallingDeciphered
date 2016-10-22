package com.android.contacts.common.location;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
public class UpdateCountryService extends IntentService {
    private static final String a;

    static {
        a = UpdateCountryService.class.getSimpleName();
    }

    public UpdateCountryService() {
        super(a);
    }

    public static void a(Context context, Location location) {
        Intent intent = new Intent(context, UpdateCountryService.class);
        intent.setAction("saveCountry");
        intent.putExtra("location", location);
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null && "saveCountry".equals(intent.getAction())) {
            String b = b(getApplicationContext(), (Location) intent.getParcelableExtra("location"));
            if (b != null) {
                Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                edit.putLong("preference_time_updated", System.currentTimeMillis());
                edit.putString("preference_current_country", b);
                edit.commit();
            }
        }
    }

    private static String b(Context context, Location location) {
        Geocoder geocoder = new Geocoder(context);
        try {
            double latitude = location.getLatitude();
            if (latitude > 90.0d || latitude < -90.0d) {
                Log.w(a, "Invalid latitude");
                return null;
            }
            String str;
            List fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation == null || fromLocation.size() <= 0) {
                str = null;
            } else {
                str = ((Address) fromLocation.get(0)).getCountryCode();
            }
            return str;
        } catch (IOException e) {
            Log.w(a, "Exception occurred when getting geocoded country from location");
            return null;
        }
    }
}
