package com.google.android.apps.hangouts.directshare.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import bbm;
import bmr;
import bmu;
import cqp;
import cqs;
import cqu;
import cqv;
import cxg;
import fde;
import glk;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import jyn;

public final class DirectShareProvider extends ContentProvider {
    static final String a;
    static final Uri b;
    private static final String c;
    private static final UriMatcher d;

    static {
        String str;
        d = new UriMatcher(-1);
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
            str = "com.google.android.apps.hangouts.directshare.impl.DirectShareProvider";
        } catch (ClassNotFoundException e) {
            str = "com.google.android.apps.hangouts.directshare.impl.DirectShareProviderAltBuild";
        }
        a = str;
        str = new StringBuilder(String.valueOf(str).length() + 11).append("content://").append(str).append("/").toString();
        c = str;
        String valueOf = String.valueOf(str);
        str = String.valueOf("conversations/shareable");
        b = Uri.parse(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        d.addURI(a, "conversations/shareable", 0);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Context context = getContext();
        if (!((cxg) jyn.a(context, cxg.class)).a("directshare")) {
            return null;
        }
        if (d.match(uri) != 0) {
            throw a("Unknown URI for query.", uri, null);
        }
        int a = a(uri);
        long b = b(uri);
        int[] f = fde.f();
        if (f.length == 0) {
            return null;
        }
        List arrayList = new ArrayList(a);
        bbm bbm = (bbm) jyn.a(getContext(), bbm.class);
        int length = f.length;
        int i = 0;
        while (i < length) {
            int i2 = f[i];
            String a2 = bbm.a(i2);
            String c = bbm.c(i2);
            Cursor a3 = a(i2, a);
            if (a3 == null || !a3.moveToFirst()) {
                if (a3 != null) {
                    a3.close();
                }
                i++;
            } else {
                do {
                    int length2 = f.length;
                    long j = a3.getLong(cqs.SHARE_TIMESTAMP.a());
                    long max = Math.max(0, b - j);
                    arrayList.add(new cqv().a(i2).a(a3.getString(cqs.CONVERSATION_ID.a())).b(a3.getInt(cqs.CONVERSATION_TYPE.a())).b(a3.getString(cqs.NAME.a())).c(a3.getString(cqs.GENERATED_NAME.a())).d(a3.getString(cqs.PACKED_AVATAR_URLS.a())).c(a3.getInt(cqs.SHARE_COUNT.a())).a(j).b(a3.getLong(cqs.SORT_TIMESTAMP.a())).c(max).e(a2).f(c).d(length2).a(0.0f).e(-1).a());
                } while (a3.moveToNext());
                if (a3 != null) {
                    a3.close();
                }
                i++;
            }
        }
        Cursor a4 = a(a(arrayList, a(arrayList), b), a);
        a4.setNotificationUri(context.getContentResolver(), uri);
        return a4;
    }

    private static int a(Uri uri) {
        String queryParameter = uri.getQueryParameter("target_count");
        if (queryParameter == null) {
            throw a("Every URI must have the 'target_count' parameter specified.", uri, null);
        }
        try {
            int parseInt = Integer.parseInt(queryParameter);
            if (parseInt > 0) {
                return parseInt;
            }
            throw a("The target count must be greater than or equal to zero.", uri, null);
        } catch (Exception e) {
            throw a("The target count must be an integer.", uri, e);
        }
    }

    private static long b(Uri uri) {
        String queryParameter = uri.getQueryParameter("share_time_millis");
        if (queryParameter == null) {
            throw a("Every URI must have the 'share_time_millis' parameter specified.", uri, null);
        }
        try {
            return Long.parseLong(queryParameter);
        } catch (Exception e) {
            throw a("The share time must be a long.", uri, e);
        }
    }

    private Cursor a(int i, int i2) {
        try {
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables("conversations");
            String[] strArr = new String[]{"2"};
            return bmr.a(getContext(), i).a().a(sQLiteQueryBuilder, cqs.c(), "view!=?", strArr, null, null, "share_count DESC, last_share_timestamp DESC, sort_timestamp DESC", String.valueOf(i2));
        } catch (bmu e) {
            return null;
        }
    }

    private static int a(List<cqu> list) {
        int i = 0;
        for (cqu a : list) {
            i = Math.max(a.a(), i);
        }
        return i;
    }

    private Queue<cqu> a(List<cqu> list, int i, long j) {
        cqp cqp = (cqp) jyn.a(getContext(), cqp.class);
        for (cqu cqu : list) {
            cqu.a(cqp.a(cqu.a(), cqu.b(), i, j));
        }
        return new PriorityQueue(list);
    }

    private static Cursor a(Queue<cqu> queue, int i) {
        Cursor matrixCursor = new MatrixCursor(cqs.b());
        int min = Math.min(i, queue.size());
        for (int i2 = 0; i2 < min; i2++) {
            cqu cqu = (cqu) queue.poll();
            cqu.a(i2);
            matrixCursor.addRow(cqu.c());
        }
        return matrixCursor;
    }

    public String getType(Uri uri) {
        if (d.match(uri) == 0) {
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.conversations.shareable";
        }
        throw a("Unknown URI for getType.", uri, null);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported.");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported.");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported.");
    }

    public boolean onCreate() {
        return true;
    }

    private static IllegalArgumentException a(String str, Uri uri, Exception exception) {
        String valueOf = String.valueOf(uri);
        glk.e("Babel_DirectSharing", new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(valueOf).length()).append(str).append(". URI: ").append(valueOf).toString(), new Object[0]);
        throw new IllegalArgumentException(str, exception);
    }
}
