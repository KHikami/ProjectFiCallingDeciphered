package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Mms.Draft;
import android.provider.Telephony.Mms.Inbox;
import android.provider.Telephony.Mms.Outbox;
import android.provider.Telephony.Mms.Sent;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class aip {
    public static final String[] a = new String[]{"_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs", "read", "seen"};
    private static aip b;
    private static final aiz c = aiz.b();
    private static final int[] d = new int[]{129, 130, 137, 151};
    private static final String[] e = new String[]{"_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", "text"};
    private static final lo<Uri, Integer> f;
    private static final SparseIntArray g;
    private static final SparseIntArray h;
    private static final SparseIntArray i;
    private static final SparseIntArray j;
    private static final SparseIntArray k;
    private static final SparseArray<String> l;
    private static final SparseArray<String> m;
    private static final SparseArray<String> n;
    private static final SparseArray<String> o;
    private static final SparseArray<String> p;
    private final Context q;
    private final ContentResolver r;
    private final TelephonyManager s;

    static {
        lo loVar = new lo();
        f = loVar;
        loVar.put(Inbox.CONTENT_URI, Integer.valueOf(1));
        f.put(Sent.CONTENT_URI, Integer.valueOf(2));
        f.put(Draft.CONTENT_URI, Integer.valueOf(3));
        f.put(Outbox.CONTENT_URI, Integer.valueOf(4));
        SparseIntArray sparseIntArray = new SparseIntArray();
        g = sparseIntArray;
        sparseIntArray.put(150, 25);
        g.put(154, 26);
        SparseArray sparseArray = new SparseArray();
        l = sparseArray;
        sparseArray.put(150, "sub_cs");
        l.put(154, "retr_txt_cs");
        sparseIntArray = new SparseIntArray();
        h = sparseIntArray;
        sparseIntArray.put(154, 3);
        h.put(150, 4);
        sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(154, "retr_txt");
        m.put(150, "sub");
        sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        sparseIntArray.put(131, 5);
        i.put(132, 6);
        i.put(138, 7);
        i.put(139, 8);
        i.put(147, 9);
        i.put(152, 10);
        sparseArray = new SparseArray();
        n = sparseArray;
        sparseArray.put(131, "ct_l");
        n.put(132, "ct_t");
        n.put(138, "m_cls");
        n.put(139, "m_id");
        n.put(147, "resp_txt");
        n.put(152, "tr_id");
        sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.put(186, 11);
        j.put(134, 12);
        j.put(140, 13);
        j.put(141, 14);
        j.put(143, 15);
        j.put(144, 16);
        j.put(155, 17);
        j.put(145, 18);
        j.put(153, 19);
        j.put(149, 20);
        sparseArray = new SparseArray();
        o = sparseArray;
        sparseArray.put(186, "ct_cls");
        o.put(134, "d_rpt");
        o.put(140, "m_type");
        o.put(141, "v");
        o.put(143, "pri");
        o.put(144, "rr");
        o.put(155, "read_status");
        o.put(145, "rpt_a");
        o.put(153, "retr_st");
        o.put(149, "st");
        sparseIntArray = new SparseIntArray();
        k = sparseIntArray;
        sparseIntArray.put(133, 21);
        k.put(135, 22);
        k.put(136, 23);
        k.put(142, 24);
        sparseArray = new SparseArray();
        p = sparseArray;
        sparseArray.put(133, "date");
        p.put(135, "d_tm");
        p.put(136, "exp");
        p.put(142, "m_size");
    }

    private aip(Context context) {
        this.q = context;
        this.r = context.getContentResolver();
        this.s = (TelephonyManager) context.getSystemService("phone");
    }

    public static aip a(Context context) {
        if (b == null || !context.equals(b.q)) {
            b = new aip(context);
        }
        return b;
    }

    private static byte[] a(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return aip.a(cursor.getString(i));
    }

    private aio[] a(long j) {
        Throwable e;
        InputStream inputStream = null;
        Cursor a = gwb.a(this.r, Uri.parse("content://mms/" + j + "/part"), e, null, null, null);
        if (a != null) {
            if (a.getCount() != 0) {
                aio[] aioArr = new aio[a.getCount()];
                int i = 0;
                while (a.moveToNext()) {
                    Integer num;
                    aio aio = new aio();
                    if (a.isNull(1)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(a.getInt(1));
                    }
                    if (num != null) {
                        aio.a(num.intValue());
                    }
                    byte[] a2 = aip.a(a, 2);
                    if (a2 != null) {
                        aio.d(a2);
                    }
                    a2 = aip.a(a, 3);
                    if (a2 != null) {
                        aio.b(a2);
                    }
                    a2 = aip.a(a, 4);
                    if (a2 != null) {
                        aio.c(a2);
                    }
                    a2 = aip.a(a, 5);
                    if (a2 != null) {
                        aio.e(a2);
                        byte[] a3 = aip.a(a, 6);
                        if (a3 != null) {
                            aio.h(a3);
                        }
                        a3 = aip.a(a, 7);
                        if (a3 != null) {
                            aio.g(a3);
                        }
                        Uri parse = Uri.parse("content://mms/part/" + a.getLong(0));
                        aio.a(parse);
                        String a4 = aip.a(a2);
                        if (!(gwb.e(a4) || gwb.f(a4) || gwb.g(a4))) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            int intValue;
                            if ("text/plain".equals(a4) || "application/smil".equals(a4) || "text/html".equals(a4)) {
                                a4 = a.getString(8);
                                intValue = num != null ? num.intValue() : 106;
                                if (a4 == null) {
                                    try {
                                        a4 = "";
                                    } catch (Throwable e2) {
                                        Log.e("PduPersister", "Failed to close stream", e2);
                                    } catch (Throwable th) {
                                        if (a != null) {
                                            a.close();
                                        }
                                    }
                                }
                                a2 = new aic(intValue, a4).b();
                                byteArrayOutputStream.write(a2, 0, a2.length);
                            } else {
                                try {
                                    InputStream openInputStream = this.r.openInputStream(parse);
                                    try {
                                        a3 = new byte[256];
                                        for (intValue = openInputStream.read(a3); intValue >= 0; intValue = openInputStream.read(a3)) {
                                            byteArrayOutputStream.write(a3, 0, intValue);
                                        }
                                        if (openInputStream != null) {
                                            openInputStream.close();
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        inputStream = openInputStream;
                                    } catch (Throwable th2) {
                                        e = th2;
                                        inputStream = openInputStream;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                }
                            }
                            aio.a(byteArrayOutputStream.toByteArray());
                        }
                        int i2 = i + 1;
                        aioArr[i] = aio;
                        i = i2;
                    } else {
                        throw new ahz("Content-Type must be set.");
                    }
                }
                if (a != null) {
                    a.close();
                }
                return aioArr;
            }
        }
        if (a == null) {
            return null;
        }
        a.close();
        return null;
        try {
            Log.e("PduPersister", "Failed to load part data", e);
            a.close();
            throw new ahz(e);
        } catch (Throwable th3) {
            e = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e22) {
                    Log.e("PduPersister", "Failed to close stream", e22);
                }
            }
            throw e;
        }
    }

    private void a(long j, aim aim) {
        Cursor a = gwb.a(this.r, Uri.parse("content://mms/" + j + "/addr"), new String[]{"address", "charset", "type"}, null, null, null);
        if (a != null) {
            while (a.moveToNext()) {
                String string = a.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    int i = a.getInt(2);
                    switch (i) {
                        case 129:
                        case 130:
                        case 151:
                            aim.b(new aic(a.getInt(1), aip.a(string)), i);
                            break;
                        case 137:
                            try {
                                aim.a(new aic(a.getInt(1), aip.a(string)), i);
                                break;
                            } finally {
                                a.close();
                            }
                        default:
                            Log.e("PduPersister", "Unknown address type: " + i);
                            break;
                    }
                }
            }
        }
    }

    public aid a(Uri uri) {
        return a(uri, null);
    }

    public aid a(Uri uri, aiq aiq) {
        Cursor a;
        try {
            aid a2;
            synchronized (c) {
                String str;
                if (c.a(uri)) {
                    try {
                        c.wait();
                    } catch (Throwable e) {
                        Log.e("PduPersister", "load: ", e);
                    }
                    aja aja = (aja) c.a(uri);
                    if (aja != null) {
                        a2 = aja.a();
                        synchronized (c) {
                            c.a(uri, false);
                            c.notifyAll();
                        }
                    }
                }
                c.a(uri, true);
                a = gwb.a(this.r, uri, a, null, null, null);
                aim aim = new aim();
                long parseId = ContentUris.parseId(uri);
                if (a != null) {
                    if (a.getCount() == 1 && a.moveToFirst()) {
                        int i = a.getInt(1);
                        long j = a.getLong(2);
                        a(a, aim);
                        if (a != null) {
                            a.close();
                        }
                        if (parseId == -1) {
                            throw new ahz("Error! ID of the message: -1.");
                        }
                        a(parseId, aim);
                        int a3 = aim.a(140);
                        aig a4 = a(parseId, a3);
                        String valueOf;
                        switch (a3) {
                            case 128:
                                a2 = new aiv(aim, a4);
                                break;
                            case 129:
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                                str = "Unsupported PDU type: ";
                                valueOf = String.valueOf(Integer.toHexString(a3));
                                throw new ahz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            case 130:
                                a2 = new aif(aim);
                                break;
                            case 131:
                                a2 = new aid(aim, (short) 0);
                                break;
                            case 132:
                                a2 = new ait(aim, a4);
                                break;
                            case 133:
                                a2 = new aid(aim, (byte) 0);
                                break;
                            case 134:
                                a2 = new aid(aim, '\u0000');
                                break;
                            case 135:
                                a2 = new aid(aim, 0);
                                break;
                            case 136:
                                a2 = new ais(aim);
                                break;
                            default:
                                str = "Unrecognized PDU type: ";
                                valueOf = String.valueOf(Integer.toHexString(a3));
                                if (valueOf.length() != 0) {
                                    valueOf = str.concat(valueOf);
                                } else {
                                    valueOf = new String(str);
                                }
                                throw new ahz(valueOf);
                        }
                        synchronized (c) {
                            c.a(uri, new aja(a2, i, j));
                            c.a(uri, false);
                            c.notifyAll();
                        }
                    }
                }
                str = String.valueOf(uri);
                throw new ahz(new StringBuilder(String.valueOf(str).length() + 9).append("Bad uri: ").append(str).toString());
            }
            return a2;
        } catch (Throwable th) {
            synchronized (c) {
                c.a(uri, false);
                c.notifyAll();
            }
        }
    }

    private void a(Cursor cursor, aim aim) {
        int size = h.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            int valueAt = h.valueAt(size);
            int keyAt = h.keyAt(size);
            String string = cursor.getString(valueAt);
            if (string != null && string.length() > 0) {
                aim.a(new aic(cursor.getInt(g.get(keyAt)), aip.a(string)), keyAt);
            }
        }
        size = i.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            valueAt = i.valueAt(size);
            keyAt = i.keyAt(size);
            string = cursor.getString(valueAt);
            if (string != null) {
                aim.a(aip.a(string), keyAt);
            }
        }
        size = j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            valueAt = j.valueAt(size);
            keyAt = j.keyAt(size);
            if (!cursor.isNull(valueAt)) {
                aim.a(cursor.getInt(valueAt), keyAt);
            }
        }
        size = k.size();
        while (true) {
            size--;
            if (size >= 0) {
                valueAt = k.valueAt(size);
                keyAt = k.keyAt(size);
                if (!cursor.isNull(valueAt)) {
                    aim.a(cursor.getLong(valueAt), keyAt);
                }
            } else {
                return;
            }
        }
    }

    private aig a(long j, int i) {
        aig aig = new aig();
        if (i == 132 || i == 128) {
            aio[] a = a(j);
            if (a != null) {
                for (aio a2 : a) {
                    aig.a(a2);
                }
            }
        }
        return aig;
    }

    private void a(long j, int i, aic[] aicArr) {
        ContentValues contentValues = new ContentValues(3);
        for (aic aic : aicArr) {
            contentValues.clear();
            contentValues.put("address", aip.a(aic.b()));
            contentValues.put("charset", Integer.valueOf(aic.a()));
            contentValues.put("type", Integer.valueOf(i));
            gwb.a(this.r, Uri.parse("content://mms/" + j + "/addr"), contentValues);
        }
    }

    private static String a(aio aio) {
        return aio.g() == null ? null : aip.a(aio.g());
    }

    public Uri a(aio aio, long j, Map<Uri, InputStream> map) {
        Uri parse = Uri.parse("content://mms/" + j + "/part");
        ContentValues contentValues = new ContentValues(8);
        int d = aio.d();
        if (d != 0) {
            contentValues.put("chset", Integer.valueOf(d));
        }
        String a = aip.a(aio);
        if (a != null) {
            if ("image/jpg".equals(a)) {
                a = "image/jpeg";
            }
            if ("text/plain".equals(a) && new aic(d, aio.a()).c().startsWith("BEGIN:VCARD")) {
                a = "text/x-vCard";
                aio.e(a.getBytes());
            }
            contentValues.put("ct", a);
            if ("application/smil".equals(a)) {
                contentValues.put("seq", Integer.valueOf(-1));
            }
            byte[] j2 = aio.j();
            if (j2 != null) {
                contentValues.put("fn", new String(j2));
            }
            j2 = aio.i();
            if (j2 != null) {
                contentValues.put("name", new String(j2));
            }
            j2 = aio.f();
            if (j2 != null) {
                contentValues.put("cd", aip.a(j2));
            }
            j2 = aio.c();
            if (j2 != null) {
                contentValues.put("cid", aip.a(j2));
            }
            j2 = aio.e();
            if (j2 != null) {
                contentValues.put("cl", aip.a(j2));
            }
            parse = gwb.a(this.r, parse, contentValues);
            if (parse == null) {
                throw new ahz("Failed to persist part, return null.");
            }
            a(aio, parse, a, (Map) map);
            aio.a(parse);
            return parse;
        }
        throw new ahz("MIME type of the part must be set.");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.aio r16, android.net.Uri r17, java.lang.String r18, java.util.Map<android.net.Uri, java.io.InputStream> r19) {
        /*
        r15 = this;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r7 = r16.a();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r2 = r16.d();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r8 = "text/plain";
        r0 = r18;
        r8 = r8.equals(r0);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        if (r8 != 0) goto L_0x002a;
    L_0x0016:
        r8 = "application/smil";
        r0 = r18;
        r8 = r8.equals(r0);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        if (r8 != 0) goto L_0x002a;
    L_0x0020:
        r8 = "text/html";
        r0 = r18;
        r8 = r8.equals(r0);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        if (r8 == 0) goto L_0x00c6;
    L_0x002a:
        if (r7 == 0) goto L_0x0256;
    L_0x002c:
        r8 = new android.content.ContentValues;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r8.<init>();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r9 = "text";
        r10 = new aic;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r10.<init>(r2, r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r2 = r10.c();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r8.put(r9, r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r2 = r15.r;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r7 = 0;
        r9 = 0;
        r0 = r17;
        r2 = r2.update(r0, r8, r7, r9);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r7 = 1;
        if (r2 == r7) goto L_0x0256;
    L_0x004c:
        r7 = new ahz;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r8 = "unable to update ";
        r2 = r17.toString();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r9 = r2.length();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        if (r9 == 0) goto L_0x00b2;
    L_0x005e:
        r2 = r8.concat(r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
    L_0x0062:
        r7.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        throw r7;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
    L_0x0066:
        r2 = move-exception;
        r7 = "PduPersister";
        r8 = "Failed to open Input/Output stream.";
        android.util.Log.e(r7, r8, r2);	 Catch:{ all -> 0x0074 }
        r7 = new ahz;	 Catch:{ all -> 0x0074 }
        r7.<init>(r2);	 Catch:{ all -> 0x0074 }
        throw r7;	 Catch:{ all -> 0x0074 }
    L_0x0074:
        r2 = move-exception;
        r14 = r2;
        r2 = r3;
        r3 = r14;
    L_0x0078:
        if (r6 == 0) goto L_0x007d;
    L_0x007a:
        r6.close();	 Catch:{ IOException -> 0x02fd }
    L_0x007d:
        if (r5 == 0) goto L_0x0082;
    L_0x007f:
        r5.close();	 Catch:{ IOException -> 0x0326 }
    L_0x0082:
        if (r4 == 0) goto L_0x00b1;
    L_0x0084:
        r4.a(r2);
        r4 = new java.io.File;
        r4.<init>(r2);
        r5 = new android.content.ContentValues;
        r2 = 0;
        r5.<init>(r2);
        r6 = r15.r;
        r7 = "content://mms/resetFilePerm/";
        r2 = r4.getName();
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x034f;
    L_0x00a4:
        r2 = r7.concat(r2);
    L_0x00a8:
        r2 = android.net.Uri.parse(r2);
        r4 = 0;
        r7 = 0;
        defpackage.gwb.a(r6, r2, r5, r4, r7);
    L_0x00b1:
        throw r3;
    L_0x00b2:
        r2 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        r2.<init>(r8);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        goto L_0x0062;
    L_0x00b8:
        r2 = move-exception;
        r7 = "PduPersister";
        r8 = "Failed to read/write data.";
        android.util.Log.e(r7, r8, r2);	 Catch:{ all -> 0x0074 }
        r7 = new ahz;	 Catch:{ all -> 0x0074 }
        r7.<init>(r2);	 Catch:{ all -> 0x0074 }
        throw r7;	 Catch:{ all -> 0x0074 }
    L_0x00c6:
        r8 = defpackage.gwb.k(r18);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8, all -> 0x0356 }
        if (r8 == 0) goto L_0x0146;
    L_0x00cc:
        if (r17 == 0) goto L_0x0111;
    L_0x00ce:
        r2 = r15.q;	 Catch:{  }
        r0 = r17;
        r3 = defpackage.aip.a(r2, r0);	 Catch:{  }
        r2 = new java.io.File;	 Catch:{ Exception -> 0x00e6 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x00e6 }
        r10 = r2.length();	 Catch:{ Exception -> 0x00e6 }
        r12 = 0;
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 <= 0) goto L_0x0111;
    L_0x00e5:
        return;
    L_0x00e6:
        r2 = move-exception;
        r9 = "PduPersister";
        r10 = r16.b();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r11 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r12 = java.lang.String.valueOf(r10);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r12 = r12.length();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r12 = r12 + 25;
        r11.<init>(r12);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r12 = "Can't get file info for: ";
        r11 = r11.append(r12);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r10 = r11.append(r10);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r10 = r10.toString();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        android.util.Log.e(r9, r10, r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x0111:
        r2 = r15.q;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r0 = r18;
        r4 = defpackage.aiy.a(r2, r0);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        if (r4 != 0) goto L_0x0146;
    L_0x011b:
        r2 = new ahz;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = java.lang.String.valueOf(r18);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = r8.length();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = r8 + 31;
        r7.<init>(r8);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = "Mimetype ";
        r7 = r7.append(r8);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r0 = r18;
        r7 = r7.append(r0);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = " can not be converted.";
        r7 = r7.append(r8);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = r7.toString();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r2.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x0146:
        r2 = r15.r;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r0 = r17;
        r6 = r2.openOutputStream(r0);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        if (r6 != 0) goto L_0x0177;
    L_0x0150:
        r2 = new ahz;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = java.lang.String.valueOf(r17);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = java.lang.String.valueOf(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = r9.length();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = r9 + 34;
        r8.<init>(r9);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = "Failed to create output stream on ";
        r8 = r8.append(r9);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = r8.append(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = r7.toString();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r2.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x0177:
        if (r7 != 0) goto L_0x0251;
    L_0x0179:
        r7 = r16.b();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        if (r7 == 0) goto L_0x0183;
    L_0x017f:
        r0 = r17;
        if (r7 != r0) goto L_0x01e7;
    L_0x0183:
        if (r6 == 0) goto L_0x0188;
    L_0x0185:
        r6.close();	 Catch:{ IOException -> 0x01b9 }
    L_0x0188:
        if (r4 == 0) goto L_0x00e5;
    L_0x018a:
        r4.a(r3);
        r2 = new java.io.File;
        r2.<init>(r3);
        r3 = new android.content.ContentValues;
        r4 = 0;
        r3.<init>(r4);
        r4 = r15.r;
        r5 = "content://mms/resetFilePerm/";
        r2 = r2.getName();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x01e1;
    L_0x01aa:
        r2 = r5.concat(r2);
    L_0x01ae:
        r2 = android.net.Uri.parse(r2);
        r5 = 0;
        r6 = 0;
        defpackage.gwb.a(r4, r2, r3, r5, r6);
        goto L_0x00e5;
    L_0x01b9:
        r2 = move-exception;
        r5 = "PduPersister";
        r6 = java.lang.String.valueOf(r6);
        r7 = new java.lang.StringBuilder;
        r8 = java.lang.String.valueOf(r6);
        r8 = r8.length();
        r8 = r8 + 27;
        r7.<init>(r8);
        r8 = "IOException while closing: ";
        r7 = r7.append(r8);
        r6 = r7.append(r6);
        r6 = r6.toString();
        android.util.Log.e(r5, r6, r2);
        goto L_0x0188;
    L_0x01e1:
        r2 = new java.lang.String;
        r2.<init>(r5);
        goto L_0x01ae;
    L_0x01e7:
        if (r19 == 0) goto L_0x01fa;
    L_0x01e9:
        r0 = r19;
        r2 = r0.containsKey(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        if (r2 == 0) goto L_0x01fa;
    L_0x01f1:
        r0 = r19;
        r2 = r0.get(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r2 = (java.io.InputStream) r2;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r5 = r2;
    L_0x01fa:
        if (r5 != 0) goto L_0x0202;
    L_0x01fc:
        r2 = r15.r;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r5 = r2.openInputStream(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x0202:
        if (r5 != 0) goto L_0x022b;
    L_0x0204:
        r2 = new ahz;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r8 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = java.lang.String.valueOf(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = r9.length();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = r9 + 33;
        r8.<init>(r9);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = "Failed to create input stream on ";
        r8 = r8.append(r9);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = r8.append(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = r7.toString();	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r2.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x022b:
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2 = new byte[r2];	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x022f:
        r7 = r5.read(r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r9 = -1;
        if (r7 == r9) goto L_0x0256;
    L_0x0236:
        if (r8 != 0) goto L_0x023d;
    L_0x0238:
        r9 = 0;
        r6.write(r2, r9, r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        goto L_0x022f;
    L_0x023d:
        r7 = r4.a(r2, r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        if (r7 == 0) goto L_0x0249;
    L_0x0243:
        r9 = 0;
        r10 = r7.length;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r6.write(r7, r9, r10);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        goto L_0x022f;
    L_0x0249:
        r2 = new ahz;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = "Error converting drm data.";
        r2.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x0251:
        if (r8 != 0) goto L_0x0291;
    L_0x0253:
        r6.write(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x0256:
        if (r6 == 0) goto L_0x025b;
    L_0x0258:
        r6.close();	 Catch:{ IOException -> 0x02a6 }
    L_0x025b:
        if (r5 == 0) goto L_0x0260;
    L_0x025d:
        r5.close();	 Catch:{ IOException -> 0x02ce }
    L_0x0260:
        if (r4 == 0) goto L_0x00e5;
    L_0x0262:
        r4.a(r3);
        r2 = new java.io.File;
        r2.<init>(r3);
        r3 = new android.content.ContentValues;
        r4 = 0;
        r3.<init>(r4);
        r4 = r15.r;
        r5 = "content://mms/resetFilePerm/";
        r2 = r2.getName();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x02f7;
    L_0x0282:
        r2 = r5.concat(r2);
    L_0x0286:
        r2 = android.net.Uri.parse(r2);
        r5 = 0;
        r6 = 0;
        defpackage.gwb.a(r4, r2, r3, r5, r6);
        goto L_0x00e5;
    L_0x0291:
        r2 = r7.length;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r2 = r4.a(r7, r2);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        if (r2 == 0) goto L_0x029e;
    L_0x0298:
        r7 = 0;
        r8 = r2.length;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r6.write(r2, r7, r8);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        goto L_0x0256;
    L_0x029e:
        r2 = new ahz;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        r7 = "Error converting drm data.";
        r2.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x00b8 }
    L_0x02a6:
        r2 = move-exception;
        r7 = "PduPersister";
        r6 = java.lang.String.valueOf(r6);
        r8 = new java.lang.StringBuilder;
        r9 = java.lang.String.valueOf(r6);
        r9 = r9.length();
        r9 = r9 + 27;
        r8.<init>(r9);
        r9 = "IOException while closing: ";
        r8 = r8.append(r9);
        r6 = r8.append(r6);
        r6 = r6.toString();
        android.util.Log.e(r7, r6, r2);
        goto L_0x025b;
    L_0x02ce:
        r2 = move-exception;
        r6 = "PduPersister";
        r5 = java.lang.String.valueOf(r5);
        r7 = new java.lang.StringBuilder;
        r8 = java.lang.String.valueOf(r5);
        r8 = r8.length();
        r8 = r8 + 27;
        r7.<init>(r8);
        r8 = "IOException while closing: ";
        r7 = r7.append(r8);
        r5 = r7.append(r5);
        r5 = r5.toString();
        android.util.Log.e(r6, r5, r2);
        goto L_0x0260;
    L_0x02f7:
        r2 = new java.lang.String;
        r2.<init>(r5);
        goto L_0x0286;
    L_0x02fd:
        r7 = move-exception;
        r8 = "PduPersister";
        r6 = java.lang.String.valueOf(r6);
        r9 = new java.lang.StringBuilder;
        r10 = java.lang.String.valueOf(r6);
        r10 = r10.length();
        r10 = r10 + 27;
        r9.<init>(r10);
        r10 = "IOException while closing: ";
        r9 = r9.append(r10);
        r6 = r9.append(r6);
        r6 = r6.toString();
        android.util.Log.e(r8, r6, r7);
        goto L_0x007d;
    L_0x0326:
        r6 = move-exception;
        r7 = "PduPersister";
        r5 = java.lang.String.valueOf(r5);
        r8 = new java.lang.StringBuilder;
        r9 = java.lang.String.valueOf(r5);
        r9 = r9.length();
        r9 = r9 + 27;
        r8.<init>(r9);
        r9 = "IOException while closing: ";
        r8 = r8.append(r9);
        r5 = r8.append(r5);
        r5 = r5.toString();
        android.util.Log.e(r7, r5, r6);
        goto L_0x0082;
    L_0x034f:
        r2 = new java.lang.String;
        r2.<init>(r7);
        goto L_0x00a8;
    L_0x0356:
        r2 = move-exception;
        r14 = r2;
        r2 = r3;
        r3 = r14;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: aip.a(aio, android.net.Uri, java.lang.String, java.util.Map):void");
    }

    private static String a(Context context, Uri uri) {
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("") || scheme.equals("file")) {
            return uri.getPath();
        }
        if (scheme.equals("http")) {
            return uri.toString();
        }
        if (scheme.equals("content")) {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                if (cursor == null || cursor.getCount() == 0 || !cursor.moveToFirst()) {
                    throw new IllegalArgumentException("Given Uri could not be found in media store");
                }
                scheme = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (cursor == null) {
                    return scheme;
                }
                cursor.close();
                return scheme;
            } catch (SQLiteException e) {
                throw new IllegalArgumentException("Given Uri is not formatted in a way so that it can be found in media store.");
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } else {
            throw new IllegalArgumentException("Given Uri scheme is not supported");
        }
    }

    public Uri a(aid aid, Uri uri, boolean z, boolean z2, Map<Uri, InputStream> map) {
        return a(aid, uri, true, z2, null, null);
    }

    public Uri a(aid aid, Uri uri, boolean z, boolean z2, Map<Uri, InputStream> map, aiq aiq) {
        if (uri == null) {
            throw new ahz("Uri may not be null.");
        }
        long j = -1;
        try {
            j = ContentUris.parseId(uri);
        } catch (NumberFormatException e) {
        }
        Object obj = j != -1 ? 1 : null;
        if (obj == null && f.get(uri) == null) {
            throw new ahz("Bad destination, must be one of content://mms/inbox, content://mms/sent, content://mms/drafts, content://mms/outbox, content://mms/temp.");
        }
        Object obj2;
        int b;
        Uri uri2;
        Uri parse;
        synchronized (c) {
            if (c.a(uri)) {
                try {
                    c.wait();
                } catch (Throwable e2) {
                    Log.e("PduPersister", "persist1: ", e2);
                }
            }
        }
        c.b(uri);
        aim a = aid.a();
        ContentValues contentValues = new ContentValues();
        int size = m.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                break;
            }
            size = m.keyAt(i);
            aic c = a.c(size);
            if (c != null) {
                String str = (String) l.get(size);
                contentValues.put((String) m.valueAt(i), aip.a(c.b()));
                contentValues.put(str, Integer.valueOf(c.a()));
            }
            size = i;
        }
        size = n.size();
        while (true) {
            int i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            byte[] b2 = a.b(n.keyAt(i2));
            if (b2 != null) {
                contentValues.put((String) n.valueAt(i2), aip.a(b2));
            }
            size = i2;
        }
        size = o.size();
        while (true) {
            i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            i = a.a(o.keyAt(i2));
            if (i != 0) {
                contentValues.put((String) o.valueAt(i2), Integer.valueOf(i));
            }
            size = i2;
        }
        size = p.size();
        while (true) {
            i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            long e3 = a.e(p.keyAt(i2));
            if (e3 != -1) {
                contentValues.put((String) p.valueAt(i2), Long.valueOf(e3));
            }
            size = i2;
        }
        SparseArray sparseArray = new SparseArray(d.length);
        for (int i3 : d) {
            obj2 = null;
            if (i3 == 137) {
                if (a.c(i3) != null) {
                    obj2 = new aic[]{a.c(i3)};
                }
            } else {
                obj2 = a.d(i3);
            }
            sparseArray.put(i3, obj2);
        }
        HashSet hashSet = new HashSet();
        size = aid.b();
        if (size == 130 || size == 132 || size == 128) {
            switch (size) {
                case 128:
                    a(151, hashSet, sparseArray, false);
                    break;
                case 130:
                case 132:
                    a(137, hashSet, sparseArray, false);
                    if (z2) {
                        a(151, hashSet, sparseArray, true);
                        a(130, hashSet, sparseArray, true);
                        break;
                    }
                    break;
            }
            long j2 = -1;
            if (z && !hashSet.isEmpty()) {
                j2 = ajc.a(this.q, (Set) hashSet);
            }
            contentValues.put("thread_id", Long.valueOf(j2));
            if (aiq != null) {
                aiq.a(j2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        obj2 = 1;
        if (aid instanceof aie) {
            aig d = ((aie) aid).d();
            if (d != null) {
                b = d.b();
                if (b > 2) {
                    obj2 = null;
                }
                for (i2 = 0; i2 < b; i2++) {
                    aio a2 = d.a(i2);
                    a(a2, currentTimeMillis, (Map) map);
                    String a3 = aip.a(a2);
                    if (!(a3 == null || "application/smil".equals(a3) || "text/plain".equals(a3))) {
                        obj2 = null;
                    }
                }
            }
        }
        if (VERSION.SDK_INT >= 17) {
            contentValues.put("text_only", Integer.valueOf(obj2 != null ? 1 : 0));
        }
        if (obj != null) {
            gwb.a(this.r, uri, contentValues, null, null);
            uri2 = uri;
        } else {
            uri2 = gwb.a(this.r, uri, contentValues);
            if (uri2 == null) {
                throw new ahz("persist() failed: return null.");
            }
            j = ContentUris.parseId(uri2);
        }
        ContentValues contentValues2 = new ContentValues(1);
        contentValues2.put("mid", Long.valueOf(j));
        gwb.a(this.r, Uri.parse("content://mms/" + currentTimeMillis + "/part"), contentValues2, null, null);
        if (obj == null) {
            str = String.valueOf(uri);
            parse = Uri.parse(new StringBuilder(String.valueOf(str).length() + 21).append(str).append("/").append(j).toString());
        } else {
            parse = uri2;
        }
        for (int i4 : d) {
            aic[] aicArr = (aic[]) sparseArray.get(i4);
            if (aicArr != null) {
                a(j, i4, aicArr);
            }
        }
        return parse;
    }

    private void a(int i, HashSet<String> hashSet, SparseArray<aic[]> sparseArray, boolean z) {
        aic[] aicArr = (aic[]) sparseArray.get(i);
        if (aicArr != null) {
            if (!z || aicArr.length != 1) {
                String line1Number = z ? this.s.getLine1Number() : null;
                for (aic aic : aicArr) {
                    if (aic != null) {
                        String c = aic.c();
                        if ((line1Number == null || !PhoneNumberUtils.compare(c, line1Number)) && !hashSet.contains(c)) {
                            hashSet.add(c);
                        }
                    }
                }
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            return new String(bArr, "iso-8859-1");
        } catch (Throwable e) {
            Log.e("PduPersister", "ISO_8859_1 must be supported!", e);
            return "";
        }
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("iso-8859-1");
        } catch (Throwable e) {
            Log.e("PduPersister", "ISO_8859_1 must be supported!", e);
            return new byte[0];
        }
    }
}
