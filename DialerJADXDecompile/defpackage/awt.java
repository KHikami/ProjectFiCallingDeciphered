package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.PhoneLookup;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: awt */
public class awt {
    public static final String a;
    public final Context b;
    public final awp c;
    private final String d;

    static {
        a = awt.class.getSimpleName();
    }

    public awt(Context context, String str) {
        this.b = context;
        this.d = str;
        this.c = buf.I(this.b).a();
    }

    private static Uri b(String str) {
        try {
            return Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").appendQueryParameter("directory", "9223372036854775807").encodedFragment(new JSONObject().put("display_name", str).put("display_name_source", 20).put("vnd.android.cursor.item/contact", new JSONObject().put("vnd.android.cursor.item/phone_v2", new JSONObject().put("data1", str).put("data2", 0))).toString()).build();
        } catch (JSONException e) {
            return null;
        }
    }

    public static String a(Context context, String str, long j, Long l) {
        Cursor query;
        Throwable e;
        if (str == null || j == 1) {
            return null;
        }
        if (l != null) {
            if (buf.c(l.longValue())) {
                return null;
            }
            if (buf.b(l.longValue())) {
                return null;
            }
        }
        try {
            query = context.getContentResolver().query(Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, str), awx.a, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(0);
                        if (query == null) {
                            return string;
                        }
                        query.close();
                        return string;
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    try {
                        Log.e(a, "IllegalArgumentException in lookUpDisplayNameAlternative", e);
                        if (query != null) {
                            query.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        e = th;
                        if (query != null) {
                            query.close();
                        }
                        throw e;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            query = null;
            Log.e(a, "IllegalArgumentException in lookUpDisplayNameAlternative", e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            e = th2;
            query = null;
            if (query != null) {
                query.close();
            }
            throw e;
        }
        return null;
    }

    public static Uri a(String str) {
        return awt.a(str, -1);
    }

    public static Uri a(String str, long j) {
        Uri uri = PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI;
        if (!buf.c()) {
            if (j != -1) {
                uri = PhoneLookup.CONTENT_FILTER_URI;
            } else {
                str = Uri.encode(str);
            }
        }
        Builder appendQueryParameter = uri.buildUpon().appendPath(str).appendQueryParameter("sip", String.valueOf(awy.a(str)));
        if (j != -1) {
            appendQueryParameter.appendQueryParameter("directory", String.valueOf(j));
        }
        return appendQueryParameter.build();
    }

    public static aws a(Cursor cursor) {
        aws aws = new aws();
        aws.b = buf.j(cursor.getString(11));
        aws.d = cursor.getString(8);
        aws.f = cursor.getInt(9);
        aws.g = cursor.getString(10);
        String string = cursor.getString(12);
        Object string2 = buf.c() ? cursor.getString(awr.b) : "";
        if (string == null) {
            String valueOf = String.valueOf(cursor.getString(1));
            string = String.valueOf(string2);
            string = string.length() != 0 ? valueOf.concat(string) : new String(valueOf);
        }
        aws.h = string;
        aws.j = cursor.getString(13);
        aws.k = cursor.getLong(14);
        aws.l = buf.d(buf.j(cursor.getString(23)));
        aws.i = cursor.getString(15);
        return aws;
    }

    public final aws a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        aws a;
        if (awy.a(str)) {
            a = a(awt.a(str, -1));
            if (a == null || a == aws.a) {
                String b = awy.b(str);
                if (PhoneNumberUtils.isGlobalPhoneNumber(b)) {
                    a = a(b, str2, true);
                }
            }
        } else {
            a = a(str, str2, false);
        }
        if (a == null) {
            a = null;
        } else if (a == aws.a) {
            a = new aws();
            a.h = str;
            a.i = a(str, null, str2);
            a.j = PhoneNumberUtils.formatNumberToE164(str, str2);
            a.b = awt.b(a.i);
        }
        return a;
    }

    private aws a(Uri uri) {
        Cursor query;
        if (uri == null) {
            return null;
        }
        if (!buf.i(this.b)) {
            return aws.a;
        }
        Long valueOf;
        aws aws;
        String queryParameter = uri.getQueryParameter("directory");
        if (queryParameter != null) {
            try {
                valueOf = Long.valueOf(Long.parseLong(queryParameter));
            } catch (NumberFormatException e) {
            }
            query = this.b.getContentResolver().query(uri, awx.a(uri), null, null, null);
            if (query == null) {
                return null;
            }
            try {
                if (query.moveToFirst()) {
                    aws = aws.a;
                    return aws;
                }
                String string = query.getString(7);
                aws = new aws();
                aws.c = string;
                aws.b = Contacts.getLookupUri(query.getLong(0), string);
                aws.d = query.getString(1);
                aws.f = query.getInt(2);
                aws.g = query.getString(3);
                aws.h = query.getString(4);
                aws.j = query.getString(5);
                aws.k = query.getLong(6);
                aws.l = buf.j(query.getString(8));
                aws.i = null;
                aws.o = abl.a(null, Long.valueOf(query.getLong(0)));
                aws.e = awt.a(this.b, string, aws.o, valueOf);
                query.close();
                return aws;
            } finally {
                query.close();
            }
        }
        valueOf = null;
        try {
            query = this.b.getContentResolver().query(uri, awx.a(uri), null, null, null);
            if (query == null) {
                return null;
            }
            if (query.moveToFirst()) {
                String string2 = query.getString(7);
                aws = new aws();
                aws.c = string2;
                aws.b = Contacts.getLookupUri(query.getLong(0), string2);
                aws.d = query.getString(1);
                aws.f = query.getInt(2);
                aws.g = query.getString(3);
                aws.h = query.getString(4);
                aws.j = query.getString(5);
                aws.k = query.getLong(6);
                aws.l = buf.j(query.getString(8));
                aws.i = null;
                aws.o = abl.a(null, Long.valueOf(query.getLong(0)));
                aws.e = awt.a(this.b, string2, aws.o, valueOf);
                query.close();
                return aws;
            }
            aws = aws.a;
            return aws;
        } catch (NullPointerException e2) {
            return null;
        }
    }

    private final aws a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        aws a = a(awt.a(str, -1));
        if (a != null && a != aws.a) {
            a.i = a(str, null, str2);
            return a;
        } else if (this.c == null) {
            return a;
        } else {
            awq a2 = this.c.a(this.b, str);
            if (a2 == null || a2.a().m) {
                return null;
            }
            return a2.a();
        }
    }

    private final String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (awy.a(str)) {
            return str;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = this.d;
        }
        return PhoneNumberUtils.formatNumber(str, null, str3);
    }

    public final boolean a(int i) {
        return this.c != null && this.c.a(i);
    }
}
