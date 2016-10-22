package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.PhoneLookup;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: bad */
public final class bad {
    private static final String[] x;
    private static final String[] y;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public String k;
    public int l;
    public int m;
    public long n;
    public String o;
    public long p;
    public Uri q;
    public Uri r;
    public Drawable s;
    public boolean t;
    public String u;
    boolean v;
    boolean w;
    private String z;

    static {
        x = new String[]{"contact_id", "display_name", "lookup", "number", "normalized_number", "label", "type", "photo_uri", "custom_ringtone", "send_to_voicemail"};
        y = new String[]{"_id", "display_name", "lookup", "number", "normalized_number", "label", "type", "photo_uri", "custom_ringtone", "send_to_voicemail"};
    }

    public bad() {
        this.v = false;
        this.w = false;
        this.p = 0;
    }

    public static String[] a(Uri uri) {
        if (buf.c()) {
            return x;
        }
        if (uri.getBooleanQueryParameter("sip", false)) {
            return x;
        }
        return y;
    }

    public static bad a(Context context, Uri uri, Cursor cursor) {
        String uri2;
        String str = null;
        bad bad = new bad();
        bad.m = 0;
        bad.k = null;
        bad.l = 0;
        bad.z = null;
        bad.s = null;
        bad.t = false;
        bad.j = false;
        bad.p = 0;
        bdf.b((Object) "CallerInfo", "getCallerInfo() based on cursor...");
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                long j;
                Long valueOf;
                int columnIndex = cursor.getColumnIndex("display_name");
                if (columnIndex != -1) {
                    bad.a = cursor.getString(columnIndex);
                }
                columnIndex = cursor.getColumnIndex("number");
                if (columnIndex != -1) {
                    bad.c = cursor.getString(columnIndex);
                }
                columnIndex = cursor.getColumnIndex("normalized_number");
                if (columnIndex != -1) {
                    bad.d = cursor.getString(columnIndex);
                }
                columnIndex = cursor.getColumnIndex("label");
                if (columnIndex != -1) {
                    int columnIndex2 = cursor.getColumnIndex("type");
                    if (columnIndex2 != -1) {
                        bad.l = cursor.getInt(columnIndex2);
                        bad.z = cursor.getString(columnIndex);
                        bad.k = Phone.getTypeLabel(context.getResources(), bad.l, bad.z).toString();
                    }
                }
                String valueOf2 = String.valueOf(uri);
                bdf.b((Object) "CallerInfo", new StringBuilder(String.valueOf(valueOf2).length() + 51).append("- getColumnIndexForPersonId: contactRef URI = '").append(valueOf2).append("'...").toString());
                uri2 = uri.toString();
                if (uri2.startsWith("content://com.android.contacts/data/phones")) {
                    bdf.b((Object) "CallerInfo", "'data/phones' URI; using RawContacts.CONTACT_ID");
                    valueOf2 = "contact_id";
                } else if (uri2.startsWith("content://com.android.contacts/data")) {
                    bdf.b((Object) "CallerInfo", "'data' URI; using Data.CONTACT_ID");
                    valueOf2 = "contact_id";
                } else if (uri2.startsWith("content://com.android.contacts/phone_lookup")) {
                    bdf.b((Object) "CallerInfo", "'phone_lookup' URI; using PhoneLookup._ID");
                    valueOf2 = buf.f(uri);
                } else {
                    bdf.b((Object) "CallerInfo", new StringBuilder(String.valueOf(uri2).length() + 35).append("Unexpected prefix for contactRef '").append(uri2).append("'").toString());
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    columnIndex = cursor.getColumnIndex(valueOf2);
                } else {
                    columnIndex = -1;
                }
                bdf.b((Object) "CallerInfo", new StringBuilder(String.valueOf(valueOf2).length() + 71).append("==> Using column '").append(valueOf2).append("' (columnIndex = ").append(columnIndex).append(") for person_id lookup...").toString());
                if (columnIndex != -1) {
                    j = cursor.getLong(columnIndex);
                    if (j != 0 && (buf.c() || !Contacts.isEnterpriseContactId(j))) {
                        bad.n = j;
                        bdf.b((Object) "CallerInfo", "==> got info.contactIdOrZero: " + bad.n);
                        columnIndex = cursor.getColumnIndex("lookup");
                        if (columnIndex != -1) {
                            bad.o = cursor.getString(columnIndex);
                        }
                    }
                } else {
                    valueOf2 = String.valueOf(uri);
                    bdf.b((Object) "CallerInfo", new StringBuilder(String.valueOf(valueOf2).length() + 35).append("Couldn't find contactId column for ").append(valueOf2).toString());
                    j = 0;
                }
                columnIndex = cursor.getColumnIndex("photo_uri");
                if (columnIndex == -1 || cursor.getString(columnIndex) == null) {
                    bad.q = null;
                } else {
                    bad.q = Uri.parse(cursor.getString(columnIndex));
                }
                columnIndex = cursor.getColumnIndex("custom_ringtone");
                if (columnIndex == -1 || cursor.getString(columnIndex) == null) {
                    bad.r = null;
                } else if (TextUtils.isEmpty(cursor.getString(columnIndex))) {
                    bad.r = Uri.EMPTY;
                } else {
                    bad.r = Uri.parse(cursor.getString(columnIndex));
                }
                columnIndex = cursor.getColumnIndex("send_to_voicemail");
                if (columnIndex != -1) {
                    cursor.getInt(columnIndex);
                }
                bad.j = true;
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.getQueryParameter("directory");
                }
                if (uri2 != null) {
                    try {
                        valueOf = Long.valueOf(Long.parseLong(uri2));
                    } catch (NumberFormatException e) {
                    }
                    bad.p = abl.a(valueOf, Long.valueOf(j));
                    bad.b = awt.a(context, bad.o, bad.p, valueOf);
                }
                valueOf = null;
                bad.p = abl.a(valueOf, Long.valueOf(j));
                bad.b = awt.a(context, bad.o, bad.p, valueOf);
            }
            cursor.close();
        }
        uri2 = bad.a;
        if (uri2 == null || uri2.length() > 0) {
            str = uri2;
        }
        bad.a = str;
        return bad;
    }

    static bad a(Context context, String str, bad bad) {
        if (bad.j || !awy.a(str)) {
            return bad;
        }
        String b = awy.b(str);
        if (!PhoneNumberUtils.isGlobalPhoneNumber(b)) {
            return bad;
        }
        Uri withAppendedPath = Uri.withAppendedPath(PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI, Uri.encode(b));
        return bad.a(context, withAppendedPath, context.getContentResolver().query(withAppendedPath, null, null, null, null));
    }

    final bad a(Context context) {
        this.w = true;
        try {
            this.a = buf.k(context);
            this.c = null;
        } catch (Exception e) {
            bdf.a("CallerInfo", "Cannot access VoiceMail.", e);
        }
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(128).append(String.valueOf(super.toString()).concat(" { "));
        String str = "name ";
        String valueOf = String.valueOf(this.a == null ? "null" : "non-null");
        append = append.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = ", phoneNumber ";
        valueOf = String.valueOf(this.c == null ? "null" : "non-null");
        return append.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).append(" }").toString();
    }
}
