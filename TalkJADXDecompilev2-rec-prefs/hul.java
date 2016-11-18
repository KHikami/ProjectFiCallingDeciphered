package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;

public final class hul {
    public static final String[] f17297a = new String[]{"contact_id", "display_name", "mimetype", "data1", "data2", "data3"};
    private static boolean f17298b = false;
    private static boolean f17299c = false;

    public static final String m20867a() {
        return VERSION.SDK_INT < 14 ? null : "((data_set IS NULL) OR (account_type='com.google' AND data_set!='plus'))";
    }

    public static final void m20868a(hwf hwf) {
        hwf.m21137b("(mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2'))");
    }

    public static final void m20869a(hwf hwf, boolean z, Context context) {
        if (!z) {
            if (VERSION.SDK_INT < 11) {
                hwf.m21137b("(in_visible_group=1)");
            } else if (hul.m20870a(context)) {
                hwf.m21137b("(contact_id IN (SELECT _id FROM default_directory))");
            }
        }
        Object a = hul.m20867a();
        if (!TextUtils.isEmpty(a)) {
            hwf.m21137b(a);
        }
    }

    private static final synchronized boolean m20870a(Context context) {
        boolean z;
        Cursor query;
        Exception e;
        Throwable th;
        synchronized (hul.class) {
            if (f17299c) {
                z = f17298b;
            } else {
                f17299c = true;
                try {
                    query = context.getContentResolver().query(Groups.CONTENT_URI, null, "EXISTS (SELECT _id FROM default_directory LIMIT 1)", null, null);
                    if (query != null) {
                        try {
                            f17298b = true;
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                gwb.m2279k("PeopleAggregator", "Error occurred when checking for default_directory table.");
                                gwb.m2253i("PeopleAggregator", e.getMessage());
                                if (query != null) {
                                    query.close();
                                }
                                z = f17298b;
                                return z;
                            } catch (Throwable th2) {
                                th = th2;
                                if (query != null) {
                                    query.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (Exception e3) {
                    e = e3;
                    query = null;
                    gwb.m2279k("PeopleAggregator", "Error occurred when checking for default_directory table.");
                    gwb.m2253i("PeopleAggregator", e.getMessage());
                    if (query != null) {
                        query.close();
                    }
                    z = f17298b;
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    query = null;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
                z = f17298b;
            }
        }
        return z;
    }

    public static boolean m20871a(Cursor cursor) {
        if (cursor.isAfterLast()) {
            return false;
        }
        long j = cursor.getLong(0);
        while (cursor.moveToNext()) {
            if (j != cursor.getLong(0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m20872b(Cursor cursor) {
        gwb.m2047b(!cursor.isBeforeFirst());
        if (cursor.isAfterLast()) {
            return false;
        }
        return cursor.moveToNext() && cursor.getLong(0) == cursor.getLong(0);
    }
}
