package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bln */
public final class bln {
    private static final Uri a;

    static {
        a = Uri.parse("content://com.google.settings/partner");
    }

    private static int c(Context context) {
        String string;
        Throwable e;
        int parseInt;
        Cursor cursor = null;
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query;
        try {
            query = contentResolver.query(a, new String[]{"value"}, "name=?", new String[]{"use_location_for_services"}, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        string = query.getString(0);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    try {
                        Log.w("GoogleDialer", "Failed to get 'Use My Location' setting", e);
                        if (query != null) {
                            query.close();
                        }
                        if (string != null) {
                            return 2;
                        }
                        try {
                            parseInt = Integer.parseInt(string);
                        } catch (NumberFormatException e3) {
                            parseInt = 2;
                        }
                        return parseInt;
                    } catch (Throwable th) {
                        e = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw e;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (RuntimeException e4) {
            e = e4;
            query = null;
            Log.w("GoogleDialer", "Failed to get 'Use My Location' setting", e);
            if (query != null) {
                query.close();
            }
            if (string != null) {
                return 2;
            }
            parseInt = Integer.parseInt(string);
            return parseInt;
        } catch (Throwable th2) {
            e = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw e;
        }
        if (string != null) {
            return 2;
        }
        parseInt = Integer.parseInt(string);
        return parseInt;
    }

    public static boolean a(Context context) {
        try {
            return Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Throwable e) {
            Log.w("GoogleDialer", "Failed to get System Location setting", e);
            return false;
        }
    }

    public static boolean b(Context context) {
        boolean z;
        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || bln.c(context) == 1) {
            return true;
        }
        return false;
    }
}
