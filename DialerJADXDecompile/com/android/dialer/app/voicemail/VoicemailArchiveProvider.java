package com.android.dialer.app.voicemail;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import avw;
import awg;
import buf;
import java.io.File;
import rq;

/* compiled from: PG */
public class VoicemailArchiveProvider extends ContentProvider {
    private final UriMatcher a;
    private avw b;

    public VoicemailArchiveProvider() {
        this.a = new UriMatcher(-1);
    }

    public boolean onCreate() {
        this.b = buf.G(getContext()).a(getContext());
        if (this.b == null) {
            return false;
        }
        this.a.addURI("com.google.android.dialer.voicemail.voicemailarchiveprovider", "voicemail_archive_table", 1);
        this.a.addURI("com.google.android.dialer.voicemail.voicemailarchiveprovider", "voicemail_archive_table/#", 2);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = a(uri).query(this.b.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
        if (query != null) {
            query.setNotificationUri(getContext().getContentResolver(), awg.a);
        }
        return query;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/voicmail_archive_table";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        long insert = this.b.getWritableDatabase().insert("voicemail_archive_table", null, contentValues);
        if (insert < 0) {
            return null;
        }
        b(uri);
        File file = new File(getContext().getFilesDir(), "voicemails");
        file.mkdirs();
        Uri withAppendedId = ContentUris.withAppendedId(uri, insert);
        if (!contentValues.containsKey("_data")) {
            String l;
            Object extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentValues.getAsString("mime_type"));
            if (TextUtils.isEmpty(extensionFromMimeType)) {
                l = Long.toString(insert);
            } else {
                l = new StringBuilder(String.valueOf(extensionFromMimeType).length() + 21).append(insert).append(".").append(extensionFromMimeType).toString();
            }
            contentValues.put("_data", new File(file, l).getPath());
        }
        update(withAppendedId, contentValues, null, null);
        return withAppendedId;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        Cursor query = a(uri).query(writableDatabase, null, str, strArr, null, null, null);
        while (query.moveToNext()) {
            Object string = query.getString(query.getColumnIndex("_data"));
            if (!TextUtils.isEmpty(string)) {
                File file = new File(string);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
        int delete = writableDatabase.delete("voicemail_archive_table", a(str, uri), strArr);
        if (delete > 0) {
            b(uri);
        }
        return delete;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = this.b.getWritableDatabase().update("voicemail_archive_table", contentValues, a(str, uri), strArr);
        if (update > 0) {
            b(uri);
        }
        return update;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        if (this.a.match(uri) == 2) {
            return openFileHelper(uri, str);
        }
        throw new IllegalArgumentException("URI Invalid.");
    }

    private final SQLiteQueryBuilder a(Uri uri) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("voicemail_archive_table");
        CharSequence a = a(null, uri);
        if (!TextUtils.isEmpty(a)) {
            sQLiteQueryBuilder.appendWhere(a);
        }
        return sQLiteQueryBuilder;
    }

    private final String a(String str, Uri uri) {
        switch (this.a.match(uri)) {
            case rq.b /*1*/:
                return str;
            case rq.c /*2*/:
                String valueOf = String.valueOf("_id=");
                valueOf = new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(ContentUris.parseId(uri)).toString();
                return TextUtils.isEmpty(str) ? valueOf : new StringBuilder((String.valueOf(str).length() + 5) + String.valueOf(valueOf).length()).append(str).append(" AND ").append(valueOf).toString();
            default:
                String valueOf2 = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 13).append("Unknown uri: ").append(valueOf2).toString());
        }
    }

    private final void b(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }
}
