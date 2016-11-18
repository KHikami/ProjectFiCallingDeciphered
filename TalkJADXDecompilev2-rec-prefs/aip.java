package p000;

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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class aip {
    public static final String[] f949a = new String[]{"_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs", "read", "seen"};
    private static aip f950b;
    private static final aiz f951c = aiz.m2585b();
    private static final int[] f952d = new int[]{129, 130, 137, 151};
    private static final String[] f953e = new String[]{"_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", "text"};
    private static final lo<Uri, Integer> f954f;
    private static final SparseIntArray f955g;
    private static final SparseIntArray f956h;
    private static final SparseIntArray f957i;
    private static final SparseIntArray f958j;
    private static final SparseIntArray f959k;
    private static final SparseArray<String> f960l;
    private static final SparseArray<String> f961m;
    private static final SparseArray<String> f962n;
    private static final SparseArray<String> f963o;
    private static final SparseArray<String> f964p;
    private final Context f965q;
    private final ContentResolver f966r;
    private final TelephonyManager f967s;

    static {
        lo loVar = new lo();
        f954f = loVar;
        loVar.put(Inbox.CONTENT_URI, Integer.valueOf(1));
        f954f.put(Sent.CONTENT_URI, Integer.valueOf(2));
        f954f.put(Draft.CONTENT_URI, Integer.valueOf(3));
        f954f.put(Outbox.CONTENT_URI, Integer.valueOf(4));
        SparseIntArray sparseIntArray = new SparseIntArray();
        f955g = sparseIntArray;
        sparseIntArray.put(150, 25);
        f955g.put(154, 26);
        SparseArray sparseArray = new SparseArray();
        f960l = sparseArray;
        sparseArray.put(150, "sub_cs");
        f960l.put(154, "retr_txt_cs");
        sparseIntArray = new SparseIntArray();
        f956h = sparseIntArray;
        sparseIntArray.put(154, 3);
        f956h.put(150, 4);
        sparseArray = new SparseArray();
        f961m = sparseArray;
        sparseArray.put(154, "retr_txt");
        f961m.put(150, "sub");
        sparseIntArray = new SparseIntArray();
        f957i = sparseIntArray;
        sparseIntArray.put(131, 5);
        f957i.put(132, 6);
        f957i.put(138, 7);
        f957i.put(139, 8);
        f957i.put(147, 9);
        f957i.put(152, 10);
        sparseArray = new SparseArray();
        f962n = sparseArray;
        sparseArray.put(131, "ct_l");
        f962n.put(132, "ct_t");
        f962n.put(138, "m_cls");
        f962n.put(139, "m_id");
        f962n.put(147, "resp_txt");
        f962n.put(152, "tr_id");
        sparseIntArray = new SparseIntArray();
        f958j = sparseIntArray;
        sparseIntArray.put(186, 11);
        f958j.put(134, 12);
        f958j.put(140, 13);
        f958j.put(141, 14);
        f958j.put(143, 15);
        f958j.put(144, 16);
        f958j.put(155, 17);
        f958j.put(145, 18);
        f958j.put(153, 19);
        f958j.put(149, 20);
        sparseArray = new SparseArray();
        f963o = sparseArray;
        sparseArray.put(186, "ct_cls");
        f963o.put(134, "d_rpt");
        f963o.put(140, "m_type");
        f963o.put(141, "v");
        f963o.put(143, "pri");
        f963o.put(144, "rr");
        f963o.put(155, "read_status");
        f963o.put(145, "rpt_a");
        f963o.put(153, "retr_st");
        f963o.put(149, "st");
        sparseIntArray = new SparseIntArray();
        f959k = sparseIntArray;
        sparseIntArray.put(133, 21);
        f959k.put(135, 22);
        f959k.put(136, 23);
        f959k.put(142, 24);
        sparseArray = new SparseArray();
        f964p = sparseArray;
        sparseArray.put(133, "date");
        f964p.put(135, "d_tm");
        f964p.put(136, "exp");
        f964p.put(142, "m_size");
    }

    private aip(Context context) {
        this.f965q = context;
        this.f966r = context.getContentResolver();
        this.f967s = (TelephonyManager) context.getSystemService("phone");
    }

    public static aip m2541a(Context context) {
        if (f950b == null || !context.equals(f950b.f965q)) {
            f950b = new aip(context);
        }
        return f950b;
    }

    private static byte[] m2550a(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return aip.m2551a(cursor.getString(i));
    }

    private aio[] m2552a(long j) {
        Throwable e;
        InputStream inputStream = null;
        Cursor a = gwb.m1558a(this.f966r, Uri.parse("content://mms/" + j + "/part"), f953e, null, null, null);
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
                        aio.m2520a(num.intValue());
                    }
                    byte[] a2 = aip.m2550a(a, 2);
                    if (a2 != null) {
                        aio.m2529d(a2);
                    }
                    a2 = aip.m2550a(a, 3);
                    if (a2 != null) {
                        aio.m2525b(a2);
                    }
                    a2 = aip.m2550a(a, 4);
                    if (a2 != null) {
                        aio.m2526c(a2);
                    }
                    a2 = aip.m2550a(a, 5);
                    if (a2 != null) {
                        aio.m2530e(a2);
                        byte[] a3 = aip.m2550a(a, 6);
                        if (a3 != null) {
                            aio.m2536h(a3);
                        }
                        a3 = aip.m2550a(a, 7);
                        if (a3 != null) {
                            aio.m2534g(a3);
                        }
                        Uri parse = Uri.parse("content://mms/part/" + a.getLong(0));
                        aio.m2521a(parse);
                        String a4 = aip.m2544a(a2);
                        if (!(gwb.m2187e(a4) || gwb.m2206f(a4) || gwb.m2224g(a4))) {
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
                                a2 = new aic(intValue, a4).m2443b();
                                byteArrayOutputStream.write(a2, 0, a2.length);
                            } else {
                                try {
                                    InputStream openInputStream = this.f966r.openInputStream(parse);
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
                            aio.m2522a(byteArrayOutputStream.toByteArray());
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

    private void m2547a(long j, aim aim) {
        Cursor a = gwb.m1558a(this.f966r, Uri.parse("content://mms/" + j + "/addr"), new String[]{"address", "charset", "type"}, null, null, null);
        if (a != null) {
            while (a.moveToNext()) {
                String string = a.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    int i = a.getInt(2);
                    switch (i) {
                        case 129:
                        case 130:
                        case 151:
                            aim.m2501b(new aic(a.getInt(1), aip.m2551a(string)), i);
                            break;
                        case 137:
                            try {
                                aim.m2498a(new aic(a.getInt(1), aip.m2551a(string)), i);
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

    public aid m2553a(Uri uri) {
        return m2554a(uri, null);
    }

    public aid m2554a(Uri uri, aiq aiq) {
        Cursor a;
        try {
            aid a2;
            synchronized (f951c) {
                String str;
                if (f951c.m2591a(uri)) {
                    try {
                        f951c.wait();
                    } catch (Throwable e) {
                        Log.e("PduPersister", "load: ", e);
                    }
                    aja aja = (aja) f951c.m2578a(uri);
                    if (aja != null) {
                        a2 = aja.m2596a();
                        synchronized (f951c) {
                            f951c.m2590a(uri, false);
                            f951c.notifyAll();
                        }
                    }
                }
                f951c.m2590a(uri, true);
                a = gwb.m1558a(this.f966r, uri, f949a, null, null, null);
                aim aim = new aim();
                long parseId = ContentUris.parseId(uri);
                if (a != null) {
                    if (a.getCount() == 1 && a.moveToFirst()) {
                        int i = a.getInt(1);
                        long j = a.getLong(2);
                        m2549a(a, aim);
                        if (a != null) {
                            a.close();
                        }
                        if (parseId == -1) {
                            throw new ahz("Error! ID of the message: -1.");
                        }
                        m2547a(parseId, aim);
                        int a3 = aim.m2495a(140);
                        aig a4 = m2540a(parseId, a3);
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
                        synchronized (f951c) {
                            f951c.m2592a(uri, new aja(a2, i, j));
                            f951c.m2590a(uri, false);
                            f951c.notifyAll();
                        }
                    }
                }
                str = String.valueOf(uri);
                throw new ahz(new StringBuilder(String.valueOf(str).length() + 9).append("Bad uri: ").append(str).toString());
            }
            return a2;
        } catch (Throwable th) {
            synchronized (f951c) {
                f951c.m2590a(uri, false);
                f951c.notifyAll();
            }
        }
    }

    private void m2549a(Cursor cursor, aim aim) {
        int size = f956h.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            int valueAt = f956h.valueAt(size);
            int keyAt = f956h.keyAt(size);
            String string = cursor.getString(valueAt);
            if (string != null && string.length() > 0) {
                aim.m2498a(new aic(cursor.getInt(f955g.get(keyAt)), aip.m2551a(string)), keyAt);
            }
        }
        size = f957i.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            valueAt = f957i.valueAt(size);
            keyAt = f957i.keyAt(size);
            string = cursor.getString(valueAt);
            if (string != null) {
                aim.m2499a(aip.m2551a(string), keyAt);
            }
        }
        size = f958j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            valueAt = f958j.valueAt(size);
            keyAt = f958j.keyAt(size);
            if (!cursor.isNull(valueAt)) {
                aim.m2496a(cursor.getInt(valueAt), keyAt);
            }
        }
        size = f959k.size();
        while (true) {
            size--;
            if (size >= 0) {
                valueAt = f959k.valueAt(size);
                keyAt = f959k.keyAt(size);
                if (!cursor.isNull(valueAt)) {
                    aim.m2497a(cursor.getLong(valueAt), keyAt);
                }
            } else {
                return;
            }
        }
    }

    private aig m2540a(long j, int i) {
        aig aig = new aig();
        if (i == 132 || i == 128) {
            aio[] a = m2552a(j);
            if (a != null) {
                for (aio a2 : a) {
                    aig.m2470a(a2);
                }
            }
        }
        return aig;
    }

    private void m2546a(long j, int i, aic[] aicArr) {
        ContentValues contentValues = new ContentValues(3);
        for (aic aic : aicArr) {
            contentValues.clear();
            contentValues.put("address", aip.m2544a(aic.m2443b()));
            contentValues.put("charset", Integer.valueOf(aic.m2440a()));
            contentValues.put("type", Integer.valueOf(i));
            gwb.m1572a(this.f966r, Uri.parse("content://mms/" + j + "/addr"), contentValues);
        }
    }

    private static String m2542a(aio aio) {
        return aio.m2535g() == null ? null : aip.m2544a(aio.m2535g());
    }

    public Uri m2557a(aio aio, long j, Map<Uri, InputStream> map) {
        Uri parse = Uri.parse("content://mms/" + j + "/part");
        ContentValues contentValues = new ContentValues(8);
        int d = aio.m2528d();
        if (d != 0) {
            contentValues.put("chset", Integer.valueOf(d));
        }
        String a = aip.m2542a(aio);
        if (a != null) {
            if ("image/jpg".equals(a)) {
                a = "image/jpeg";
            }
            if ("text/plain".equals(a) && new aic(d, aio.m2523a()).m2444c().startsWith("BEGIN:VCARD")) {
                a = "text/x-vCard";
                aio.m2530e(a.getBytes());
            }
            contentValues.put("ct", a);
            if ("application/smil".equals(a)) {
                contentValues.put("seq", Integer.valueOf(-1));
            }
            byte[] j2 = aio.m2539j();
            if (j2 != null) {
                contentValues.put("fn", new String(j2));
            }
            j2 = aio.m2538i();
            if (j2 != null) {
                contentValues.put("name", new String(j2));
            }
            j2 = aio.m2533f();
            if (j2 != null) {
                contentValues.put("cd", aip.m2544a(j2));
            }
            j2 = aio.m2527c();
            if (j2 != null) {
                contentValues.put("cid", aip.m2544a(j2));
            }
            j2 = aio.m2531e();
            if (j2 != null) {
                contentValues.put("cl", aip.m2544a(j2));
            }
            parse = gwb.m1572a(this.f966r, parse, contentValues);
            if (parse == null) {
                throw new ahz("Failed to persist part, return null.");
            }
            m2548a(aio, parse, a, (Map) map);
            aio.m2521a(parse);
            return parse;
        }
        throw new ahz("MIME type of the part must be set.");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2548a(aio aio, Uri uri, String str, Map<Uri, InputStream> map) {
        String valueOf;
        String str2;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        aiy aiy = null;
        String str3 = null;
        try {
            File file;
            ContentValues contentValues;
            ContentResolver contentResolver;
            String valueOf2;
            byte[] a = aio.m2523a();
            int d = aio.m2528d();
            if (!"text/plain".equals(str) && !"application/smil".equals(str) && !"text/html".equals(str)) {
                boolean k = gwb.m2282k(str);
                if (k) {
                    if (uri != null) {
                        str3 = aip.m2543a(this.f965q, uri);
                        try {
                            if (new File(str3).length() > 0) {
                                return;
                            }
                        } catch (Throwable e) {
                            String valueOf3 = String.valueOf(aio.m2524b());
                            Log.e("PduPersister", new StringBuilder(String.valueOf(valueOf3).length() + 25).append("Can't get file info for: ").append(valueOf3).toString(), e);
                        }
                    }
                    aiy = aiy.m2582a(this.f965q, str);
                    if (aiy == null) {
                        throw new ahz(new StringBuilder(String.valueOf(str).length() + 31).append("Mimetype ").append(str).append(" can not be converted.").toString());
                    }
                }
                outputStream = this.f966r.openOutputStream(uri);
                String valueOf4;
                if (outputStream == null) {
                    valueOf4 = String.valueOf(uri);
                    throw new ahz(new StringBuilder(String.valueOf(valueOf4).length() + 34).append("Failed to create output stream on ").append(valueOf4).toString());
                } else if (a == null) {
                    Uri b = aio.m2524b();
                    if (b != null && b != uri) {
                        if (map != null) {
                            if (map.containsKey(b)) {
                                inputStream = (InputStream) map.get(b);
                            }
                        }
                        if (inputStream == null) {
                            inputStream = this.f966r.openInputStream(b);
                        }
                        if (inputStream != null) {
                            r2 = new byte[8192];
                            while (true) {
                                int read = inputStream.read(r2);
                                if (read == -1) {
                                    break;
                                } else if (k) {
                                    a = aiy.m2584a(r2, read);
                                    if (a != null) {
                                        outputStream.write(a, 0, a.length);
                                    } else {
                                        throw new ahz("Error converting drm data.");
                                    }
                                } else {
                                    outputStream.write(r2, 0, read);
                                }
                            }
                        } else {
                            valueOf4 = String.valueOf(b);
                            throw new ahz(new StringBuilder(String.valueOf(valueOf4).length() + 33).append("Failed to create input stream on ").append(valueOf4).toString());
                        }
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable e2) {
                            valueOf = String.valueOf(outputStream);
                            Log.e("PduPersister", new StringBuilder(String.valueOf(valueOf).length() + 27).append("IOException while closing: ").append(valueOf).toString(), e2);
                        }
                    }
                    if (aiy != null) {
                        aiy.m2583a(str3);
                        file = new File(str3);
                        contentValues = new ContentValues(0);
                        contentResolver = this.f966r;
                        str2 = "content://mms/resetFilePerm/";
                        valueOf2 = String.valueOf(file.getName());
                        if (valueOf2.length() != 0) {
                            valueOf2 = str2.concat(valueOf2);
                        } else {
                            valueOf2 = new String(str2);
                        }
                        gwb.m1491a(contentResolver, Uri.parse(valueOf2), contentValues, null, null);
                        return;
                    }
                    return;
                } else if (k) {
                    r2 = aiy.m2584a(a, a.length);
                    if (r2 != null) {
                        outputStream.write(r2, 0, r2.length);
                    } else {
                        throw new ahz("Error converting drm data.");
                    }
                } else {
                    outputStream.write(a);
                }
            } else if (a != null) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("text", new aic(d, a).m2444c());
                if (this.f966r.update(uri, contentValues2, null, null) != 1) {
                    String str4 = "unable to update ";
                    valueOf2 = String.valueOf(uri.toString());
                    if (valueOf2.length() != 0) {
                        valueOf2 = str4.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str4);
                    }
                    throw new ahz(valueOf2);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable e22) {
                    valueOf = String.valueOf(outputStream);
                    Log.e("PduPersister", new StringBuilder(String.valueOf(valueOf).length() + 27).append("IOException while closing: ").append(valueOf).toString(), e22);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable e222) {
                    str2 = String.valueOf(inputStream);
                    Log.e("PduPersister", new StringBuilder(String.valueOf(str2).length() + 27).append("IOException while closing: ").append(str2).toString(), e222);
                }
            }
            if (aiy != null) {
                aiy.m2583a(str3);
                file = new File(str3);
                contentValues = new ContentValues(0);
                contentResolver = this.f966r;
                str2 = "content://mms/resetFilePerm/";
                valueOf2 = String.valueOf(file.getName());
                if (valueOf2.length() != 0) {
                    valueOf2 = str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
                gwb.m1491a(contentResolver, Uri.parse(valueOf2), contentValues, null, null);
            }
        } catch (Throwable e2222) {
            Log.e("PduPersister", "Failed to open Input/Output stream.", e2222);
            throw new ahz(e2222);
        } catch (Throwable e22222) {
            Log.e("PduPersister", "Failed to read/write data.", e22222);
            throw new ahz(e22222);
        }
    }

    private static String m2543a(Context context, Uri uri) {
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

    public Uri m2555a(aid aid, Uri uri, boolean z, boolean z2, Map<Uri, InputStream> map) {
        return m2556a(aid, uri, true, z2, null, null);
    }

    public Uri m2556a(aid aid, Uri uri, boolean z, boolean z2, Map<Uri, InputStream> map, aiq aiq) {
        if (uri == null) {
            throw new ahz("Uri may not be null.");
        }
        long j = -1;
        try {
            j = ContentUris.parseId(uri);
        } catch (NumberFormatException e) {
        }
        Object obj = j != -1 ? 1 : null;
        if (obj == null && f954f.get(uri) == null) {
            throw new ahz("Bad destination, must be one of content://mms/inbox, content://mms/sent, content://mms/drafts, content://mms/outbox, content://mms/temp.");
        }
        Object obj2;
        int b;
        Uri uri2;
        Uri parse;
        synchronized (f951c) {
            if (f951c.m2591a(uri)) {
                try {
                    f951c.wait();
                } catch (Throwable e2) {
                    Log.e("PduPersister", "persist1: ", e2);
                }
            }
        }
        f951c.m2594b(uri);
        aim a = aid.m2445a();
        ContentValues contentValues = new ContentValues();
        int size = f961m.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                break;
            }
            size = f961m.keyAt(i);
            aic c = a.m2503c(size);
            if (c != null) {
                String str = (String) f960l.get(size);
                contentValues.put((String) f961m.valueAt(i), aip.m2544a(c.m2443b()));
                contentValues.put(str, Integer.valueOf(c.m2440a()));
            }
            size = i;
        }
        size = f962n.size();
        while (true) {
            int i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            byte[] b2 = a.m2502b(f962n.keyAt(i2));
            if (b2 != null) {
                contentValues.put((String) f962n.valueAt(i2), aip.m2544a(b2));
            }
            size = i2;
        }
        size = f963o.size();
        while (true) {
            i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            i = a.m2495a(f963o.keyAt(i2));
            if (i != 0) {
                contentValues.put((String) f963o.valueAt(i2), Integer.valueOf(i));
            }
            size = i2;
        }
        size = f964p.size();
        while (true) {
            i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            long e3 = a.m2505e(f964p.keyAt(i2));
            if (e3 != -1) {
                contentValues.put((String) f964p.valueAt(i2), Long.valueOf(e3));
            }
            size = i2;
        }
        SparseArray sparseArray = new SparseArray(f952d.length);
        for (int i3 : f952d) {
            obj2 = null;
            if (i3 == 137) {
                if (a.m2503c(i3) != null) {
                    obj2 = new aic[]{a.m2503c(i3)};
                }
            } else {
                obj2 = a.m2504d(i3);
            }
            sparseArray.put(i3, obj2);
        }
        HashSet hashSet = new HashSet();
        size = aid.m2449b();
        if (size == 130 || size == 132 || size == 128) {
            switch (size) {
                case 128:
                    m2545a(151, hashSet, sparseArray, false);
                    break;
                case 130:
                case 132:
                    m2545a(137, hashSet, sparseArray, false);
                    if (z2) {
                        m2545a(151, hashSet, sparseArray, true);
                        m2545a(130, hashSet, sparseArray, true);
                        break;
                    }
                    break;
            }
            long j2 = -1;
            if (z && !hashSet.isEmpty()) {
                j2 = ajc.m2604a(this.f965q, (Set) hashSet);
            }
            contentValues.put("thread_id", Long.valueOf(j2));
            if (aiq != null) {
                aiq.m2559a(j2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        obj2 = 1;
        if (aid instanceof aie) {
            aig d = ((aie) aid).m2456d();
            if (d != null) {
                b = d.m2471b();
                if (b > 2) {
                    obj2 = null;
                }
                for (i2 = 0; i2 < b; i2++) {
                    aio a2 = d.m2467a(i2);
                    m2557a(a2, currentTimeMillis, (Map) map);
                    String a3 = aip.m2542a(a2);
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
            gwb.m1491a(this.f966r, uri, contentValues, null, null);
            uri2 = uri;
        } else {
            uri2 = gwb.m1572a(this.f966r, uri, contentValues);
            if (uri2 == null) {
                throw new ahz("persist() failed: return null.");
            }
            j = ContentUris.parseId(uri2);
        }
        ContentValues contentValues2 = new ContentValues(1);
        contentValues2.put("mid", Long.valueOf(j));
        gwb.m1491a(this.f966r, Uri.parse("content://mms/" + currentTimeMillis + "/part"), contentValues2, null, null);
        if (obj == null) {
            str = String.valueOf(uri);
            parse = Uri.parse(new StringBuilder(String.valueOf(str).length() + 21).append(str).append("/").append(j).toString());
        } else {
            parse = uri2;
        }
        for (int i4 : f952d) {
            aic[] aicArr = (aic[]) sparseArray.get(i4);
            if (aicArr != null) {
                m2546a(j, i4, aicArr);
            }
        }
        return parse;
    }

    private void m2545a(int i, HashSet<String> hashSet, SparseArray<aic[]> sparseArray, boolean z) {
        aic[] aicArr = (aic[]) sparseArray.get(i);
        if (aicArr != null) {
            if (!z || aicArr.length != 1) {
                String line1Number = z ? this.f967s.getLine1Number() : null;
                for (aic aic : aicArr) {
                    if (aic != null) {
                        String c = aic.m2444c();
                        if ((line1Number == null || !PhoneNumberUtils.compare(c, line1Number)) && !hashSet.contains(c)) {
                            hashSet.add(c);
                        }
                    }
                }
            }
        }
    }

    public static String m2544a(byte[] bArr) {
        try {
            return new String(bArr, "iso-8859-1");
        } catch (Throwable e) {
            Log.e("PduPersister", "ISO_8859_1 must be supported!", e);
            return "";
        }
    }

    private static byte[] m2551a(String str) {
        try {
            return str.getBytes("iso-8859-1");
        } catch (Throwable e) {
            Log.e("PduPersister", "ISO_8859_1 must be supported!", e);
            return new byte[0];
        }
    }
}
