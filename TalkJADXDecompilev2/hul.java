package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Groups;
import android.text.TextUtils;

public final class hul {
    public static final String[] a = new String[]{"contact_id", "display_name", "mimetype", "data1", "data2", "data3"};
    private static boolean b = false;
    private static boolean c = false;

    public static final String a() {
        return VERSION.SDK_INT < 14 ? null : "((data_set IS NULL) OR (account_type='com.google' AND data_set!='plus'))";
    }

    public static final void a(hwf hwf) {
        hwf.b("(mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2'))");
    }

    public static final void a(hwf hwf, boolean z, Context context) {
        if (!z) {
            if (VERSION.SDK_INT < 11) {
                hwf.b("(in_visible_group=1)");
            } else if (hul.a(context)) {
                hwf.b("(contact_id IN (SELECT _id FROM default_directory))");
            }
        }
        Object a = hul.a();
        if (!TextUtils.isEmpty(a)) {
            hwf.b(a);
        }
    }

    private static final synchronized boolean a(Context context) {
        boolean z;
        Exception e;
        Throwable th;
        synchronized (hul.class) {
            if (c) {
                z = b;
            } else {
                c = true;
                Cursor query;
                try {
                    query = context.getContentResolver().query(Groups.CONTENT_URI, null, "EXISTS (SELECT _id FROM default_directory LIMIT 1)", null, null);
                    if (query != null) {
                        try {
                            b = true;
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                gwb.k("PeopleAggregator", "Error occurred when checking for default_directory table.");
                                gwb.i("PeopleAggregator", e.getMessage());
                                if (query != null) {
                                    query.close();
                                }
                                z = b;
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
                    gwb.k("PeopleAggregator", "Error occurred when checking for default_directory table.");
                    gwb.i("PeopleAggregator", e.getMessage());
                    if (query != null) {
                        query.close();
                    }
                    z = b;
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    query = null;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
                z = b;
            }
        }
        return z;
    }

    public static boolean a(Cursor cursor) {
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

    public static boolean b(Cursor cursor) {
        gwb.b(!cursor.isBeforeFirst());
        if (cursor.isAfterLast()) {
            return false;
        }
        return cursor.moveToNext() && cursor.getLong(0) == cursor.getLong(0);
    }
}
