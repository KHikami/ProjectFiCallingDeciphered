package com.android.dialer.blocking;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import avw;
import awe;
import buf;
import rl;
import rq;

/* compiled from: PG */
public class FilteredNumberProvider extends ContentProvider {
    private static final UriMatcher a;
    private static String b;
    private avw c;

    static {
        a = new UriMatcher(-1);
        b = FilteredNumberProvider.class.getSimpleName();
    }

    public boolean onCreate() {
        this.c = buf.G(getContext()).a(getContext());
        if (this.c == null) {
            return false;
        }
        a.addURI("com.google.android.dialer.blocking.filterednumberprovider", "filtered_numbers_table", 1);
        a.addURI("com.google.android.dialer.blocking.filterednumberprovider", "filtered_numbers_table/#", 2);
        a.addURI("com.google.android.dialer.blocking.filterednumberprovider", "filtered_numbers_increment_filtered_count/#", 3);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("filtered_numbers_table");
        switch (a.match(uri)) {
            case rq.b /*1*/:
                break;
            case rq.c /*2*/:
                String valueOf = String.valueOf("_id=");
                sQLiteQueryBuilder.appendWhere(new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(ContentUris.parseId(uri)).toString());
                break;
            default:
                String valueOf2 = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 13).append("Unknown uri: ").append(valueOf2).toString());
        }
        Cursor query = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, null);
        if (query != null) {
            query.setNotificationUri(getContext().getContentResolver(), awe.a);
        }
        return query;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/filtered_numbers_table";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (contentValues.getAsString("country_iso") == null) {
            contentValues.put("country_iso", buf.g(getContext()));
        }
        if (contentValues.getAsInteger("times_filtered") == null) {
            contentValues.put("times_filtered", Integer.valueOf(0));
        }
        if (contentValues.getAsLong("creation_time") == null) {
            contentValues.put("creation_time", Long.valueOf(System.currentTimeMillis()));
        }
        long insert = writableDatabase.insert("filtered_numbers_table", null, contentValues);
        if (insert < 0) {
            return null;
        }
        a(uri);
        return ContentUris.withAppendedId(uri, insert);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        switch (a.match(uri)) {
            case rq.b /*1*/:
                break;
            case rq.c /*2*/:
                str = a(str, ContentUris.parseId(uri));
                break;
            default:
                String valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Unknown uri: ").append(valueOf).toString());
        }
        int delete = writableDatabase.delete("filtered_numbers_table", str, strArr);
        if (delete > 0) {
            a(uri);
        }
        return delete;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        String valueOf;
        switch (a.match(uri)) {
            case rq.b /*1*/:
                break;
            case rq.c /*2*/:
                str = a(str, ContentUris.parseId(uri));
                break;
            case rl.e /*3*/:
                long parseId = ContentUris.parseId(uri);
                try {
                    valueOf = String.valueOf(" UPDATE filtered_numbers_table SETtimes_filtered=times_filtered+1,last_time_filtered=");
                    long currentTimeMillis = System.currentTimeMillis();
                    String valueOf2 = String.valueOf("_id");
                    writableDatabase.execSQL(new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()).append(valueOf).append(currentTimeMillis).append(" WHERE ").append(valueOf2).append("=").append(parseId).toString());
                    return 1;
                } catch (SQLException e) {
                    new StringBuilder(60).append("Could not update blocked statistics for ").append(parseId);
                    return 0;
                }
            default:
                valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Unknown uri: ").append(valueOf).toString());
        }
        int update = writableDatabase.update("filtered_numbers_table", contentValues, str, strArr);
        if (update <= 0) {
            return update;
        }
        a(uri);
        return update;
    }

    private static String a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf("_id=");
            return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(j).toString();
        }
        valueOf = String.valueOf("_id");
        return new StringBuilder((String.valueOf(str).length() + 25) + String.valueOf(valueOf).length()).append(str).append("AND ").append(valueOf).append("=").append(j).toString();
    }

    private final void a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }
}
