package defpackage;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bjf */
public final class bjf implements awp {
    public final /* synthetic */ awq a(Context context, String str) {
        return b(context, str);
    }

    public final /* synthetic */ awq a(aws aws) {
        return bjf.b(aws);
    }

    public static void b(Context context) {
        bhn bhn = (bhn) buf.G(context).a(context);
        bhn.a(3);
        bhn.a(4);
    }

    public static bjg b(aws aws) {
        return new bjg(aws);
    }

    public final bjg b(Context context, String str) {
        bjg bjg = null;
        Cursor query = context.getContentResolver().query(bji.a.buildUpon().appendPath(str).build(), bjh.a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int i = query.getInt(8);
                    if (!bjg.a(i) || bjy.a(context)) {
                        Uri uri;
                        Uri a;
                        aws aws = new aws();
                        int i2 = query.getInt(8);
                        String string = query.getString(9);
                        Object string2 = query.getString(7);
                        String string3 = query.getString(10);
                        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string)) {
                            uri = null;
                        } else if (i2 == 1) {
                            if (buf.c()) {
                                uri = Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, string3);
                            } else {
                                uri = Contacts.getLookupUri(0, string3);
                            }
                            uri = uri.buildUpon().appendQueryParameter("directory", string).build();
                        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                            Builder encodedFragment = Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").encodedFragment(string3);
                            if (!TextUtils.isEmpty(string2)) {
                                encodedFragment.appendQueryParameter("displayName", string2);
                            }
                            uri = encodedFragment.appendQueryParameter("directory", string).build();
                        } else {
                            uri = i2 == 5 ? Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").appendQueryParameter("directory", "9223372036854775807").encodedFragment(string3).build() : null;
                        }
                        aws.b = uri;
                        aws.c = query.getString(10);
                        aws.d = query.getString(0);
                        aws.f = query.getInt(5);
                        aws.g = query.getString(6);
                        aws.h = query.getString(4);
                        aws.j = str;
                        aws.i = null;
                        aws.k = 0;
                        i2 = query.getInt(1);
                        int i3 = query.getInt(2);
                        if (i2 != 0) {
                            a = bji.a(str);
                        } else if (i3 != 0) {
                            a = bji.b.buildUpon().appendPath(str).build();
                        } else {
                            String string4 = query.getString(3);
                            if (string4 != null) {
                                a = Uri.parse(string4);
                            }
                        }
                        aws.l = a;
                        aws.m = query.getLong(11) == 1;
                        aws.n = query.getString(12);
                        aws.o = query.getLong(13);
                        bjg = bjf.b(aws);
                        bjg.a(i, query.getString(7), query.getLong(9));
                        query.close();
                    } else {
                        bjf.b(context);
                        bjg = bjf.b(aws.a);
                        query.close();
                    }
                } else {
                    bjg = bjf.b(aws.a);
                }
            } finally {
                query.close();
            }
        }
        return bjg;
    }

    public final void a(Context context, awq awq) {
        if (awq instanceof bjg) {
            bjg bjg = (bjg) awq;
            Uri uri = bji.a;
            ContentValues contentValues = new ContentValues();
            aws aws = bjg.a;
            if (aws != null && aws != aws.a) {
                Object obj = aws.h != null ? aws.h : aws.j;
                if (!TextUtils.isEmpty(obj)) {
                    contentValues.put("number", obj);
                    contentValues.put("phone_type", Integer.valueOf(aws.f));
                    contentValues.put("phone_label", aws.g);
                    contentValues.put("display_name", aws.d);
                    contentValues.put("photo_uri", aws.l != null ? aws.l.toString() : null);
                    contentValues.put("reported", Integer.valueOf(aws.m ? 1 : 0));
                    contentValues.put("object_id", aws.n);
                    contentValues.put("user_type", Long.valueOf(aws.o));
                    contentValues.put("source_name", bjg.b);
                    contentValues.put("source_type", Integer.valueOf(bjg.c));
                    contentValues.put("source_id", Long.valueOf(bjg.d));
                    contentValues.put("lookup_key", bjg.e);
                    context.getContentResolver().insert(uri, contentValues);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri a(android.content.Context r5, java.lang.String r6, java.io.InputStream r7) {
        /*
        r4 = this;
        r1 = 0;
        r0 = defpackage.bji.a(r6);
        r2 = r5.getContentResolver();	 Catch:{ IOException -> 0x0021 }
        r3 = r2.openOutputStream(r0);	 Catch:{ IOException -> 0x0021 }
        defpackage.dbv.a(r7, r3);	 Catch:{ Throwable -> 0x0016, all -> 0x002d }
        if (r3 == 0) goto L_0x0015;
    L_0x0012:
        r3.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0015:
        return r0;
    L_0x0016:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
    L_0x0019:
        if (r3 == 0) goto L_0x0020;
    L_0x001b:
        if (r2 == 0) goto L_0x0029;
    L_0x001d:
        r3.close();	 Catch:{ Throwable -> 0x0024 }
    L_0x0020:
        throw r0;	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0015;
    L_0x0024:
        r3 = move-exception;
        r2.addSuppressed(r3);	 Catch:{ IOException -> 0x0021 }
        goto L_0x0020;
    L_0x0029:
        r3.close();	 Catch:{ IOException -> 0x0021 }
        goto L_0x0020;
    L_0x002d:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjf.a(android.content.Context, java.lang.String, java.io.InputStream):android.net.Uri");
    }

    public final void a(Context context) {
        bhn.a(context).getWritableDatabase().execSQL("DELETE FROM cached_number_contacts");
    }

    public final boolean a(int i) {
        return bjg.b(i);
    }

    public final boolean a(int i, String str) {
        return bjg.a(i) && !TextUtils.isEmpty(str);
    }
}
