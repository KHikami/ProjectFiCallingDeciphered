package com.google.android.apps.dialer.phonenumbercache;

import acb;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import bhn;
import bjg;
import buf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class PhoneNumberCacheProvider extends ContentProvider {
    private static final String a;
    private static final UriMatcher b;
    private static final Set c;
    private final String[] d;
    private File e;
    private File f;
    private bhn g;

    static {
        a = PhoneNumberCacheProvider.class.getSimpleName();
        b = new UriMatcher(-1);
        c = new HashSet();
        b.addURI("com.google.android.dialer.cacheprovider", "contact", 1000);
        b.addURI("com.google.android.dialer.cacheprovider", "contact/*", 1001);
        b.addURI("com.google.android.dialer.cacheprovider", "photo/*", 2000);
        b.addURI("com.google.android.dialer.cacheprovider", "thumbnail/*", 3000);
        c.add("number");
        c.add("phone_type");
        c.add("phone_label");
        c.add("display_name");
        c.add("photo_uri");
        c.add("source_name");
        c.add("source_type");
        c.add("source_id");
        c.add("lookup_key");
        c.add("reported");
        c.add("object_id");
        c.add("user_type");
    }

    public PhoneNumberCacheProvider() {
        this.d = new String[1];
    }

    public boolean onCreate() {
        this.g = bhn.a(getContext());
        this.f = new File(getContext().getFilesDir(), "photos/raw");
        a(this.f);
        this.e = new File(getContext().getFilesDir(), "thumbnails/raw");
        a(this.e);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (b.match(uri) != 1001) {
            return null;
        }
        String a = a(uri);
        if (a == null) {
            return new acb(strArr);
        }
        this.g.a();
        this.d[0] = a;
        return this.g.getWritableDatabase().query("cached_number_contacts", strArr, "normalized_number=?", this.d, null, null, null);
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        int match = b.match(uri);
        switch (match) {
            case 1000:
            case 1001:
                String asString;
                Object a;
                this.g.a();
                if (match == 1000) {
                    asString = contentValues.getAsString("number");
                    if (asString == null || asString.length() == 0) {
                        throw new IllegalArgumentException("Phone number not provided");
                    }
                    a = a(asString);
                } else {
                    String a2 = a(uri);
                }
                if (TextUtils.isEmpty(a)) {
                    return null;
                }
                for (String asString2 : contentValues.keySet()) {
                    if (!c.contains(asString2)) {
                        contentValues.remove(asString2);
                        String str = a;
                        String str2 = "Ignoring unsupported column for update: ";
                        asString2 = String.valueOf(asString2);
                        Log.e(str, asString2.length() != 0 ? str2.concat(asString2) : new String(str2));
                    }
                }
                contentValues.put("normalized_number", a);
                contentValues.put("time_last_updated", Long.valueOf(System.currentTimeMillis()));
                SQLiteDatabase writableDatabase = this.g.getWritableDatabase();
                this.d[0] = a;
                Integer asInteger = contentValues.getAsInteger("source_type");
                if (asInteger == null || !bjg.a(asInteger.intValue())) {
                    match = -1;
                    try {
                        match = (int) DatabaseUtils.longForQuery(writableDatabase, "SELECT source_type FROM cached_number_contacts WHERE normalized_number=?", this.d);
                    } catch (SQLiteDoneException e) {
                    }
                    if (bjg.a(match)) {
                        match = 0;
                    } else {
                        match = 1;
                    }
                } else {
                    match = 1;
                }
                if (match == 0) {
                    return uri;
                }
                writableDatabase.insertWithOnConflict("cached_number_contacts", null, contentValues, 5);
                return uri;
            default:
                throw new IllegalArgumentException("Unknown URI");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (b.match(uri) == 1001) {
            this.g.a();
            String a = a(uri);
            this.d[0] = a;
            SQLiteDatabase writableDatabase = this.g.getWritableDatabase();
            boolean b = b(a, true);
            boolean b2 = b(a, false);
            if (b || b2) {
            }
            return writableDatabase.delete("cached_number_contacts", "normalized_number=?", this.d);
        }
        throw new IllegalArgumentException("Unknown URI or phone number not provided");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("The cache does not support update operations. Use insert to replace an existing phone number, if needed.");
    }

    private final String a(Uri uri) {
        if (uri.getPathSegments().size() == 2) {
            return a(uri.getLastPathSegment());
        }
        throw new IllegalArgumentException("Invalid URI or phone number not provided");
    }

    private final String a(String str) {
        return PhoneNumberUtils.formatNumberToE164(str, buf.g(getContext()));
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        boolean z = true;
        int match = b.match(uri);
        switch (match) {
            case 2000:
            case 3000:
                boolean z2;
                String a = a(uri);
                SQLiteDatabase readableDatabase = this.g.getReadableDatabase();
                this.d[0] = a;
                if (DatabaseUtils.queryNumEntries(readableDatabase, "cached_number_contacts", "normalized_number=?", this.d) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (!str.equals("r")) {
                        if (match != 2000) {
                            z = false;
                        }
                        return a(a, z);
                    }
                    File b;
                    if (match == 2000) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        b = b(a);
                    } else {
                        b = c(a);
                    }
                    if (b.exists()) {
                        return ParcelFileDescriptor.open(b, 268435456);
                    }
                    a(a, z2, false);
                    String str2 = "No photo file found for number: ";
                    String valueOf = String.valueOf(a);
                    throw new FileNotFoundException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                throw new FileNotFoundException("Phone number does not exist in cache");
            default:
                throw new FileNotFoundException("Unknown or unsupported URI");
        }
    }

    private final void a(String str, boolean z, boolean z2) {
        String str2;
        if (z) {
            str2 = "has_photo";
        } else {
            str2 = "has_thumbnail";
        }
        SQLiteDatabase writableDatabase = this.g.getWritableDatabase();
        this.d[0] = str;
        String valueOf = String.valueOf("UPDATE cached_number_contacts SET ");
        String str3 = z2 ? "1" : "0";
        String valueOf2 = String.valueOf("normalized_number=?");
        writableDatabase.execSQL(new StringBuilder((((String.valueOf(valueOf).length() + 9) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append("=").append(str3).append(" WHERE ").append(valueOf2).append(";").toString(), this.d);
    }

    private final ParcelFileDescriptor a(String str, boolean z) {
        File b;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (z) {
            b = b(str);
        } else {
            b = c(str);
        }
        try {
            if (!b.exists()) {
                b.createNewFile();
                a(str, z, true);
            }
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open(b, 805306368);
            } catch (FileNotFoundException e) {
            }
        } catch (IOException e2) {
        }
        return parcelFileDescriptor;
    }

    private final boolean b(String str, boolean z) {
        File b;
        if (z) {
            b = b(str);
        } else {
            b = c(str);
        }
        return b.delete();
    }

    private static void a(File file) {
        if (!file.exists() && !file.mkdirs()) {
            String str = "Unable to create photo storage directory ";
            String valueOf = String.valueOf(file.getPath());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private final File b(String str) {
        return new File(this.f, str);
    }

    private final File c(String str) {
        return new File(this.e, str);
    }
}
