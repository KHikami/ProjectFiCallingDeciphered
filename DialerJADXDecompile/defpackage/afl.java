package defpackage;

import android.content.AsyncTaskLoader;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.Loader.ForceLoadContentObserver;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Directory;
import android.provider.ContactsContract.Groups;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: afl */
public class afl extends AsyncTaskLoader {
    private static final String a;
    private static afj b;
    private final Uri c;
    private final Set d;
    private Uri e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private afj j;
    private ForceLoadContentObserver k;

    public /* synthetic */ void deliverResult(Object obj) {
        e((afj) obj);
    }

    public /* synthetic */ Object loadInBackground() {
        return a();
    }

    static {
        a = afl.class.getSimpleName();
        b = null;
    }

    public static afj a(Uri uri) {
        try {
            return afl.a(uri, uri);
        } catch (JSONException e) {
            return null;
        }
    }

    private static afj a(Uri uri, Uri uri2) {
        JSONObject jSONObject = new JSONObject(uri.getEncodedFragment());
        long longValue = Long.valueOf(uri.getQueryParameter("directory")).longValue();
        String optString = jSONObject.optString("display_name");
        String optString2 = jSONObject.optString("display_name_alt", optString);
        Uri uri3 = uri;
        Uri uri4 = uri;
        Uri uri5 = uri2;
        afj afj = new afj(uri3, uri4, uri5, longValue, null, -1, -1, jSONObject.getInt("display_name_source"), 0, jSONObject.optString("photo_uri", null), optString, optString2, null, false, null, false, null, false);
        afj.i = new daa().a();
        String optString3 = jSONObject.optString("account_name", null);
        String queryParameter = uri.getQueryParameter("displayName");
        if (optString3 != null) {
            afj.a(queryParameter, null, optString3, jSONObject.getString("account_type"), jSONObject.optInt("exportSupport", 1));
        } else {
            afj.a(queryParameter, null, null, null, jSONObject.optInt("exportSupport", 2));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(-1));
        contentValues.put("contact_id", Integer.valueOf(-1));
        afq afq = new afq(contentValues);
        JSONObject jSONObject2 = jSONObject.getJSONObject("vnd.android.cursor.item/contact");
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            queryParameter = (String) keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(queryParameter);
            if (optJSONObject == null) {
                JSONArray jSONArray = jSONObject2.getJSONArray(queryParameter);
                for (int i = 0; i < jSONArray.length(); i++) {
                    afl.a(afq, jSONArray.getJSONObject(i), queryParameter);
                }
            } else {
                afl.a(afq, optJSONObject, queryParameter);
            }
        }
        afj.h = new czv().c(afq).a();
        return afj;
    }

    private static void a(afq afq, JSONObject jSONObject, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", str);
        contentValues.put("_id", Integer.valueOf(-1));
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Object obj = jSONObject.get(str2);
            if (obj instanceof String) {
                contentValues.put(str2, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str2, (Integer) obj);
            }
        }
        afq.a(contentValues);
    }

    private afj a() {
        String str = a;
        String valueOf = String.valueOf(this.e);
        Log.e(str, new StringBuilder(String.valueOf(valueOf).length() + 17).append("loadInBackground=").append(valueOf).toString());
        String string;
        try {
            afj a;
            ContentResolver contentResolver = getContext().getContentResolver();
            Uri a2 = buf.a(contentResolver, this.e);
            b = null;
            if (a2.getLastPathSegment().equals("encoded")) {
                a = afl.a(a2, this.e);
            } else {
                a = a(contentResolver, a2);
            }
            if (a.a()) {
                if (a.b()) {
                    Cursor query = getContext().getContentResolver().query(ContentUris.withAppendedId(Directory.CONTENT_URI, a.b), afo.a, null, null, null);
                    if (query != null) {
                        int i;
                        try {
                            if (query.moveToFirst()) {
                                valueOf = query.getString(0);
                                str = query.getString(1);
                                i = query.getInt(2);
                                String string2 = query.getString(3);
                                String string3 = query.getString(4);
                                int i2 = query.getInt(5);
                                if (!TextUtils.isEmpty(str)) {
                                    string = getContext().getPackageManager().getResourcesForApplication(str).getString(i);
                                    a.a(valueOf, string, string2, string3, i2);
                                }
                                string = null;
                                a.a(valueOf, string, string2, string3, i2);
                            }
                        } catch (NameNotFoundException e) {
                            Log.w(a, new StringBuilder(String.valueOf(str).length() + 50).append("Contact directory resource not found: ").append(str).append(".").append(i).toString());
                        } catch (Throwable th) {
                            query.close();
                        }
                        query.close();
                    }
                } else if (this.f && a.k == null) {
                    c(a);
                }
                if (this.i) {
                    d(a);
                }
                a(a);
                if (this.g && a.j == null) {
                    b(a);
                }
            }
            return a;
        } catch (Throwable e2) {
            Throwable th2 = e2;
            str = a;
            string = String.valueOf(this.e);
            Log.e(str, new StringBuilder(String.valueOf(string).length() + 27).append("Error loading the contact: ").append(string).toString(), th2);
            return new afj(this.c, afk.ERROR, th2);
        }
    }

    private final afj a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(Uri.withAppendedPath(uri, "entities"), afn.a, null, null, "raw_contact_id");
        if (query == null) {
            Log.e(a, "No cursor returned in loadContactEntity");
            return afj.a(this.c);
        }
        try {
            afj afj;
            if (query.moveToFirst()) {
                long j;
                Integer num;
                Uri withAppendedId;
                String queryParameter = uri.getQueryParameter("directory");
                if (queryParameter == null) {
                    j = 0;
                } else {
                    j = Long.parseLong(queryParameter);
                }
                long j2 = query.getLong(13);
                String string = query.getString(2);
                long j3 = query.getLong(0);
                int i = query.getInt(1);
                String string2 = query.getString(3);
                String string3 = query.getString(4);
                String string4 = query.getString(5);
                long j4 = query.getLong(6);
                String string5 = query.getString(58);
                boolean z = query.getInt(7) != 0;
                if (query.isNull(8)) {
                    num = null;
                } else {
                    num = Integer.valueOf(query.getInt(8));
                }
                boolean z2 = query.getInt(59) == 1;
                String string6 = query.getString(60);
                boolean z3 = query.getInt(61) == 1;
                if (j == 0 || j == 1) {
                    withAppendedId = ContentUris.withAppendedId(Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, string), j2);
                } else {
                    withAppendedId = uri;
                }
                afj = new afj(this.c, uri, withAppendedId, j, string, j2, j3, i, j4, string5, string2, string3, string4, z, num, z2, string6, z3);
                long j5 = -1;
                afq afq = null;
                czv czv = new czv();
                daa daa = new daa();
                while (true) {
                    j = query.getLong(14);
                    if (j != j5) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_id", Long.valueOf(query.getLong(14)));
                        afl.a(query, contentValues, 15);
                        afl.a(query, contentValues, 16);
                        afl.a(query, contentValues, 17);
                        afl.a(query, contentValues, 18);
                        afl.a(query, contentValues, 19);
                        afl.a(query, contentValues, 20);
                        afl.a(query, contentValues, 21);
                        afl.a(query, contentValues, 22);
                        afl.a(query, contentValues, 23);
                        afl.a(query, contentValues, 24);
                        afl.a(query, contentValues, 25);
                        afl.a(query, contentValues, 13);
                        afl.a(query, contentValues, 7);
                        afq = new afq(contentValues);
                        czv.c(afq);
                        j5 = j;
                    }
                    if (!query.isNull(26)) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("_id", Long.valueOf(query.getLong(26)));
                        afl.a(query, contentValues2, 27);
                        afl.a(query, contentValues2, 28);
                        afl.a(query, contentValues2, 29);
                        afl.a(query, contentValues2, 30);
                        afl.a(query, contentValues2, 31);
                        afl.a(query, contentValues2, 32);
                        afl.a(query, contentValues2, 33);
                        afl.a(query, contentValues2, 34);
                        afl.a(query, contentValues2, 35);
                        afl.a(query, contentValues2, 36);
                        afl.a(query, contentValues2, 37);
                        afl.a(query, contentValues2, 38);
                        afl.a(query, contentValues2, 39);
                        afl.a(query, contentValues2, 40);
                        afl.a(query, contentValues2, 41);
                        afl.a(query, contentValues2, 42);
                        afl.a(query, contentValues2, 43);
                        afl.a(query, contentValues2, 44);
                        afl.a(query, contentValues2, 45);
                        afl.a(query, contentValues2, 46);
                        afl.a(query, contentValues2, 47);
                        afl.a(query, contentValues2, 48);
                        afl.a(query, contentValues2, 49);
                        afl.a(query, contentValues2, 50);
                        afl.a(query, contentValues2, 52);
                        afl.a(query, contentValues2, 62);
                        afl.a(query, contentValues2, 63);
                        if (abw.g()) {
                            afl.a(query, contentValues2, 64);
                        }
                        afq.a(contentValues2);
                        if (!(query.isNull(51) && query.isNull(53))) {
                            daa.a(Long.valueOf(query.getLong(26)), new aio(query));
                        }
                    }
                    if (!query.moveToNext()) {
                        afj.h = czv.a();
                        afj.i = daa.a();
                        query.close();
                        return afj;
                    }
                }
            }
            afj = afj.a(this.c);
            query.close();
            return afj;
        } finally {
            query.close();
        }
    }

    private final void b(afj afj) {
        czv czv = new czv();
        if (!afj.g) {
            Map b = afb.a(getContext()).b();
            if (!b.isEmpty()) {
                Map a = day.a(b);
                Iterator b2 = afj.h.b();
                while (b2.hasNext()) {
                    afq afq = (afq) b2.next();
                    a.remove(agc.a(afq.a(), afq.b()));
                }
                czv.b(a.values());
            }
        }
        afj.j = czv.a();
    }

    private static void a(Cursor cursor, ContentValues contentValues, int i) {
        switch (cursor.getType(i)) {
            case rl.c /*0*/:
            case rq.b /*1*/:
                contentValues.put(afn.a[i], Long.valueOf(cursor.getLong(i)));
            case rl.e /*3*/:
                contentValues.put(afn.a[i], cursor.getString(i));
            case rl.f /*4*/:
                contentValues.put(afn.a[i], cursor.getBlob(i));
            default:
                throw new IllegalStateException("Invalid or unhandled data type");
        }
    }

    private final void c(afj afj) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator b = afj.h.b();
        while (b.hasNext()) {
            afq afq = (afq) b.next();
            String asString = afq.a.getAsString("account_name");
            String a = afq.a();
            String b2 = afq.b();
            afm afm = new afm(asString, a, b2);
            if (!(asString == null || a == null || hashSet.contains(afm))) {
                hashSet.add(afm);
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(" OR ");
                }
                stringBuilder.append("(account_name=? AND account_type=?");
                arrayList.add(asString);
                arrayList.add(a);
                if (b2 != null) {
                    stringBuilder.append(" AND data_set=?");
                    arrayList.add(b2);
                } else {
                    stringBuilder.append(" AND data_set IS NULL");
                }
                stringBuilder.append(")");
            }
        }
        czv czv = new czv();
        Cursor query = getContext().getContentResolver().query(Groups.CONTENT_URI, afp.a, stringBuilder.toString(), (String[]) arrayList.toArray(new String[0]), null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    boolean z;
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    long j = query.getLong(3);
                    a = query.getString(4);
                    boolean z2 = (query.isNull(5) || query.getInt(5) == 0) ? false : true;
                    if (query.isNull(6) || query.getInt(6) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    czv.c(new abm(string, string2, string3, j, a, z2, z));
                } finally {
                    query.close();
                }
            }
        }
        afj.k = czv.a();
    }

    private final void d(afj afj) {
        String g = buf.g(getContext());
        czt czt = afj.h;
        int size = czt.size();
        for (int i = 0; i < size; i++) {
            List d = ((afq) czt.get(i)).d();
            int size2 = d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ahl ahl = (ahl) d.get(i2);
                if (ahl instanceof ahv) {
                    ahv ahv = (ahv) ahl;
                    String asString = ahv.a.getAsString("data1");
                    if (asString != null) {
                        ahv.a.put("formattedPhoneNumber", buf.a(asString, ahv.a.getAsString("data4"), g));
                    }
                }
            }
        }
    }

    private void e(afj afj) {
        c();
        if (!isReset() && afj != null) {
            this.j = afj;
            if (afj.a()) {
                this.e = afj.a;
                if (!afj.b()) {
                    String valueOf = String.valueOf(this.e);
                    new StringBuilder(String.valueOf(valueOf).length() + 33).append("Registering content observer for ").append(valueOf);
                    if (this.k == null) {
                        this.k = new ForceLoadContentObserver(this);
                    }
                    getContext().getContentResolver().registerContentObserver(this.e, true, this.k);
                }
                if (this.h) {
                    b();
                }
            }
            super.deliverResult(this.j);
        }
    }

    private final void b() {
        Context context = getContext();
        Iterator b = this.j.h.b();
        while (b.hasNext()) {
            afq afq = (afq) b.next();
            long longValue = afq.a.getAsLong("_id").longValue();
            if (!this.d.contains(Long.valueOf(longValue))) {
                this.d.add(Long.valueOf(longValue));
                if (afq.b == null) {
                    afq.b = afb.a(context);
                }
                afv a = afq.b.a(afq.a(), afq.b());
                Object d = a.d();
                Object e = a.e();
                if (!(TextUtils.isEmpty(d) || TextUtils.isEmpty(e))) {
                    Uri withAppendedId = ContentUris.withAppendedId(RawContacts.CONTENT_URI, longValue);
                    Intent intent = new Intent();
                    intent.setClassName(e, d);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setDataAndType(withAppendedId, "vnd.android.cursor.item/raw_contact");
                    try {
                        context.startService(intent);
                    } catch (Throwable e2) {
                        Log.e(a, "Error sending message to source-app", e2);
                    }
                }
            }
        }
    }

    private final void c() {
        if (this.k != null) {
            getContext().getContentResolver().unregisterContentObserver(this.k);
            this.k = null;
        }
    }

    protected void onStartLoading() {
        if (this.j != null) {
            e(this.j);
        }
        if (takeContentChanged() || this.j == null) {
            forceLoad();
        }
    }

    protected void onStopLoading() {
        cancelLoad();
    }

    protected void onReset() {
        super.onReset();
        cancelLoad();
        c();
        this.j = null;
    }

    private final void a(afj afj) {
        InputStream openStream;
        long j = afj.d;
        if (j > 0) {
            Iterator b = afj.h.b();
            while (b.hasNext()) {
                for (ahl ahl : ((afq) b.next()).d()) {
                    if (ahl.a.getAsLong("_id").longValue() == j) {
                        if (ahl instanceof ahw) {
                            afj.m = ((ahw) ahl).a.getAsByteArray("data15");
                        }
                    }
                }
            }
        }
        String str = afj.e;
        if (str != null) {
            AssetFileDescriptor assetFileDescriptor;
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if ("http".equals(scheme) || "https".equals(scheme)) {
                    openStream = new URL(str).openStream();
                    assetFileDescriptor = null;
                } else {
                    AssetFileDescriptor openAssetFileDescriptor = getContext().getContentResolver().openAssetFileDescriptor(parse, "r");
                    openStream = openAssetFileDescriptor.createInputStream();
                    assetFileDescriptor = openAssetFileDescriptor;
                }
                byte[] bArr = new byte[16384];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = openStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                afj.l = byteArrayOutputStream.toByteArray();
                openStream.close();
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                    return;
                }
                return;
            } catch (IOException e) {
            } catch (Throwable th) {
                openStream.close();
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
            }
        }
        afj.l = afj.m;
    }
}
