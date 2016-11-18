package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Mms;
import android.provider.Telephony.Sms;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class fzb {
    private static final ScheduledExecutorService B = Executors.newSingleThreadScheduledExecutor();
    private static final String[] C = new String[]{"count()"};
    private static List<String> D = null;
    static final boolean a = false;
    static final String b = String.format(Locale.US, "(%s IN (%d, %d))", new Object[]{"type", Integer.valueOf(1), Integer.valueOf(2)});
    static final String c = String.format(Locale.US, "((%s IN (%d, %d)) AND (%s IN (%d, %d)))", new Object[]{"msg_box", Integer.valueOf(1), Integer.valueOf(2), "m_type", Integer.valueOf(128), Integer.valueOf(132)});
    static final String d = String.format(Locale.US, "((%s=%d) AND (%s=%d OR %s=%d) AND (%s=%d))", new Object[]{"transport_type", Integer.valueOf(3), "sms_type", Integer.valueOf(0), "sms_type", Integer.valueOf(1), "status", Integer.valueOf(fwx.ON_SERVER.ordinal())});
    static volatile long e;
    static final Uri f;
    static final Uri g;
    private static volatile int i;
    private static volatile int j;
    private static volatile int k;
    private static volatile long l;
    private static volatile long m;
    private static volatile int n;
    private static volatile int o;
    private static gkg[] p = new gkg[]{new gkg(), new gkg()};
    private static final Map<String, List<fzm>> q = new HashMap();
    private final boolean A;
    volatile boolean h;
    private final Context r = gwb.H();
    private final bko s;
    private final blo t;
    private final lc<String> u;
    private final lc<List<String>> v;
    private final ky<String, fzf> w;
    private final long x;
    private boolean y;
    private boolean z;

    static {
        Uri uri;
        kae kae = glk.r;
        gwb.a(new fzc());
        if (VERSION.SDK_INT >= 19) {
            uri = Mms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms");
        }
        f = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://sms");
        }
        g = uri;
    }

    static void a() {
        i = gwb.a(gwb.H(), "babel_sms_sync_first_batch_size", 100);
        j = gwb.a(gwb.H(), "babel_sms_sync_subsequent_batch_size_min", 100);
        k = gwb.a(gwb.H(), "babel_sms_sync_subsequent_batch_size_max", 1000);
        l = gwb.a(gwb.H(), "babel_sms_sync_subsequent_batch_time_limit", 2000);
        m = gwb.a(gwb.H(), "babel_sms_incremental_sync_batch_interval_in_millis", 1000);
        n = gwb.a(gwb.H(), "babel_sms_sync_batch_max_messages_to_scan", 2000);
        e = gwb.a(gwb.H(), "babel_sms_full_sync_backoff_time_millis", 3600000);
        o = gwb.a(gwb.H(), "babel_mms_text_limit", 2000);
    }

    public static void a(int i, long j) {
        iil.a(i, 0, 1);
        synchronized (p) {
            if (j >= 0) {
                p[i].b(j);
            }
        }
    }

    public static void b(int i, long j) {
        iil.a(i, 0, 1);
        synchronized (p) {
            if (j >= 0) {
                p[i].c(j);
            }
        }
    }

    private static boolean c(int i, long j) {
        boolean a;
        iil.a(i, 0, 1);
        synchronized (p) {
            a = p[i].a(j);
        }
        return a;
    }

    static void a(String str, fzm fzm) {
        synchronized (q) {
            List list = (List) q.get(str);
            if (list != null) {
                list.remove(fzm);
            }
        }
    }

    private static void b(String str) {
        synchronized (q) {
            for (String str2 : q.keySet()) {
                if (!TextUtils.equals(str, str2)) {
                    List<fzm> list = (List) q.get(str2);
                    if (list != null) {
                        for (fzm a : list) {
                            a.a();
                        }
                    }
                }
            }
        }
    }

    fzb(blo blo, long j, boolean z) {
        this.t = blo;
        this.s = blo.g();
        this.x = j;
        this.h = false;
        this.A = z;
        this.u = new lc();
        this.v = new lc();
        this.w = new ky();
    }

    public static void a(bko bko, boolean z) {
        fzb.a(bko, true, 0);
    }

    private static int a(Cursor cursor) {
        int i = 0;
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    i = cursor.getInt(0);
                    return i;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return i;
    }

    static boolean a(blo blo) {
        int a;
        Context H = gwb.H();
        try {
            int a2 = fzb.a(blo.e().a("messages", C, d, null, null, null, null));
            a = fzb.a(gwb.a(H.getContentResolver(), g, C, b, null, null)) + fzb.a(gwb.a(H.getContentResolver(), f, C, c, null, null));
            boolean z = a2 == a;
            if (!a && z) {
                return z;
            }
            int g = blo.g().g();
            String str = z ? ": " : ": NOT IN SYNC, ";
            new StringBuilder(String.valueOf(str).length() + 69).append("SmsSyncManager A#").append(g).append(str).append("local = ").append(a2).append(", remote = ").append(a);
            return z;
        } catch (Throwable e) {
            a = blo.g().g();
            String valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 53).append("SmsSyncManager A#").append(a).append(": failed to query counts ").append(valueOf).toString(), e);
            return true;
        }
    }

    int b() {
        if (a || this.A) {
            int g = this.s.g();
            new StringBuilder(60).append("SmsSyncManager A#").append(g).append(": sync from ").append(this.x);
        }
        long a = glj.a();
        long b = glj.b();
        fzl fzl = new fzl();
        int i = i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        long j = -1;
        this.y = false;
        this.z = false;
        boolean z = true;
        while (!this.h) {
            z = a(i, j, fzl);
            i2 += fzl.c;
            i3 += fzl.d;
            i4 += fzl.f;
            i5 += fzl.h;
            if (!z) {
                break;
            }
            if (fzl.b <= 0) {
                i = i;
            } else {
                i = (int) ((((double) (fzl.h + fzl.f)) / ((double) fzl.b)) * ((double) l));
                if (i < j) {
                    i = j;
                } else if (i > k) {
                    i = k;
                }
            }
            j = fzl.i / 1000;
            if (m > 0) {
                try {
                    Thread.sleep(m);
                } catch (InterruptedException e) {
                }
            }
        }
        if (z) {
            if (a || this.A) {
                new StringBuilder(42).append("SmsSyncManager A#").append(this.s.g()).append(": sync aborted");
            }
            return -1;
        }
        if (this.y) {
            fyi.d(g);
        }
        if (this.z) {
            fyi.d(f);
        }
        if (a || this.A) {
            j = glj.b() - b;
            new StringBuilder(168).append("SmsSyncManager A#").append(this.s.g()).append(": sync done in ").append(j).append(" millis, scanned ").append(i2).append(" local msgs, ").append(i3).append(" remote msgs, ").append(i4).append(" added, ").append(i5).append(" deleted.");
        }
        ((jcf) jyn.a(gwb.H(), jcf.class)).b(this.s.g()).b("sms_last_sync_time_millis", a).d();
        return i4 + i5;
    }

    private static String[] a(List<fzi> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = Long.toString(((fzi) list.get(i)).d());
        }
        return strArr;
    }

    static Uri a(String str) {
        String n = gwb.n(str);
        if (TextUtils.isEmpty(n) || !n.startsWith("content://")) {
            return null;
        }
        return Uri.parse(n);
    }

    static long a(Uri uri) {
        if (uri != null) {
            try {
                return ContentUris.parseId(uri);
            } catch (UnsupportedOperationException e) {
            } catch (NumberFormatException e2) {
            }
        }
        return -1;
    }

    private static String b(String str, String str2, long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        if (j > 0) {
            stringBuilder.append(" AND ").append(str2).append(">=").append(j);
        }
        if (j2 > 0) {
            stringBuilder.append(" AND ").append(str2).append("<=").append(j2);
        }
        return stringBuilder.toString();
    }

    private static void a(List<fxr> list, lc<fxp> lcVar, fxn fxn) {
        if (fxn.a() == 1) {
            lcVar.c(fxn.b(), (fxp) fxn);
        } else {
            list.add((fxr) fxn);
        }
    }

    private long a(fxp fxp) {
        if (fxp.w.size() <= 0) {
            glk.d("Babel_SMS", "SmsSyncManager A#" + this.s.g() + ": MMS message has no part", new Object[0]);
        }
        List a = a(fxp.r);
        if (a == null || a.size() <= 0) {
            glk.e("Babel_SMS", "SmsSyncManager A#" + this.s.g() + ": MMS message has no recipient", new Object[0]);
            return -1;
        } else if (fzb.c(1, fxp.m)) {
            return -1;
        } else {
            String a2;
            Object obj = fxp.n != 1 ? 1 : null;
            if (obj == null) {
                a2 = fyi.a(a(fxp.r), fxp.m);
            } else {
                a2 = null;
            }
            edo edo = null;
            if (obj != null) {
                edo = this.s != null ? this.s.b() : null;
            } else if (!TextUtils.isEmpty(a2)) {
                edo = gwb.d(gwb.H(), a2);
            }
            if (edo == null) {
                int g = this.s.g();
                glk.e("Babel_SMS", "SmsSyncManager A#" + g + ": found MMS has no From: id=" + fxp.m + " type=" + fxp.n + " thread_id=" + fxp.r, new Object[0]);
                return -1;
            }
            edo edo2;
            boolean a3 = blf.a(edo);
            long j = fxp.r;
            if (a3) {
                edo2 = edo;
            } else {
                edo2 = null;
            }
            String a4 = a(j, edo2);
            if (a4 == null) {
                glk.e("Babel_SMS", "SmsSyncManager A#" + this.s.g() + ": failed to create conversation for mms thread " + fxp.r, new Object[0]);
                return -1;
            }
            int ordinal;
            String i = blo.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", i);
            contentValues.put("conversation_id", a4);
            contentValues.put("transport_type", Integer.valueOf(3));
            String str = "type";
            if (obj != null) {
                ordinal = fwy.OUTGOING_USER_MESSAGE.ordinal();
            } else {
                ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
            }
            contentValues.put(str, Integer.valueOf(ordinal));
            contentValues.put("author_chat_id", edo.b);
            contentValues.put("author_gaia_id", edo.a);
            str = fxp.e();
            if (str != null && str.length() > o) {
                str = str.substring(0, o);
            }
            contentValues.put("text", str);
            contentValues.put("local_url", fxp.f());
            contentValues.put("attachment_content_type", fxp.g());
            contentValues.put("width_pixels", Integer.valueOf(0));
            contentValues.put("height_pixels", Integer.valueOf(0));
            contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
            contentValues.put("timestamp", Long.valueOf(fxp.q));
            contentValues.put("notification_level", Integer.valueOf(-1));
            contentValues.put("expiration_timestamp", Long.valueOf(Long.MAX_VALUE));
            String[] strArr = new String[1];
            String valueOf = String.valueOf(f);
            strArr[0] = Uri.parse(new StringBuilder(String.valueOf(valueOf).length() + 21).append(valueOf).append("/").append(fxp.m).toString()).toString();
            contentValues.put("external_ids", gwb.a(strArr));
            if (obj != null) {
                contentValues.put("sms_raw_recipients", TextUtils.join(",", a));
            } else {
                contentValues.put("sms_raw_sender", a2);
                if (a.size() > 1) {
                    contentValues.put("sms_raw_recipients", fyi.a(a, a2));
                }
            }
            contentValues.put("sms_priority", Integer.valueOf(fxp.s));
            contentValues.put("mms_subject", fxp.o);
            contentValues.put("sms_message_status", Integer.valueOf(-1));
            contentValues.put("sms_type", Integer.valueOf(1));
            contentValues.put("sms_message_size", Long.valueOf(fxp.h()));
            contentValues.put("persisted", Boolean.valueOf(true));
            j = this.t.b(contentValues);
            if (j == -1) {
                glk.e("Babel_SMS", "SmsSyncManager A#" + this.s.g() + ": failed to insert message into table", new Object[0]);
                return -1;
            }
            if (fxp.k() > 1) {
                for (fxq fxq : fxp.d()) {
                    if (fxq.b()) {
                        bmf bmf = new bmf();
                        bmf.a = a4;
                        bmf.b = i;
                        bmf.c = fxq.d().toString();
                        bmf.d = fxq.i;
                        bmf.e = 0;
                        bmf.f = 0;
                        this.t.a(bmf);
                    }
                }
            }
            this.z |= fxp.v;
            int i2 = 2;
            if (fxp.j() <= 1 && fxp.k() == 1 && ba.b(fxp.g())) {
                i2 = 3;
            } else if (fxp.w.size() > 1 || ba.e(fxp.g())) {
                i2 = 9;
            }
            a(a4, edo, str, fxp.f(), fxp.q, j, i2, fxp.g(), 1, fxp.u, fxp.r);
            return j;
        }
    }

    private void a(lc<fxp> lcVar) {
        int a = lcVar.a();
        for (int i = 0; i < a; i += 128) {
            int min = Math.min(i + 128, a) - i;
            String format = String.format(Locale.US, "%s != '%s' AND %s IN %s", new Object[]{"ct", "application/smil", "mid", fyi.a(min)});
            String[] strArr = new String[min];
            for (int i2 = 0; i2 < min; i2++) {
                strArr[i2] = Long.toString(((fxp) lcVar.b(i + i2)).m);
            }
            Cursor a2 = gwb.a(this.r.getContentResolver(), fyi.c, fxq.a, format, strArr, null);
            if (a2 != null) {
                while (a2.moveToNext()) {
                    try {
                        fxq a3 = fxq.a(a2, false);
                        fxp fxp = (fxp) lcVar.a(a3.h);
                        if (fxp != null) {
                            fxp.a(a3);
                        }
                    } finally {
                        a2.close();
                    }
                }
            }
        }
    }

    private String a(long j, edo edo) {
        boolean z = false;
        String str = (String) this.u.a(j);
        if (str != null) {
            return str;
        }
        List<String> a = a(j);
        if (a == null || a.size() <= 0) {
            glk.e("Babel_SMS", "SmsSyncManager A#" + this.s.g() + ": could not find recipients for threadId " + j, new Object[0]);
            return null;
        }
        int i;
        List arrayList = new ArrayList();
        for (String str2 : a) {
            edk a2 = gwb.a(gwb.H(), str2, null, null);
            if (edo != null) {
                if (edo.a(a2.b)) {
                    a2.i = Boolean.TRUE;
                }
            }
            arrayList.add(a2);
        }
        if (a.size() > 1) {
            i = 2;
        } else {
            i = 1;
        }
        blo blo = this.t;
        if (edo != null) {
            z = true;
        }
        str2 = blf.b(blo, z, null, arrayList, null, null, boy.LOCAL_ONLY, i, 3, true, null, null);
        if (str2 == null) {
            return null;
        }
        this.u.b(j, str2);
        return str2;
    }

    private List<String> a(long j) {
        List<String> list = (List) this.v.a(j);
        if (list == null) {
            list = fyi.a(j);
            if (list != null && list.size() > 0) {
                this.v.b(j, list);
            }
        }
        if (list != null) {
            return list;
        }
        if (D == null) {
            List arrayList = new ArrayList();
            D = arrayList;
            arrayList.add(gwb.A().c);
        }
        return D;
    }

    private void a(String str, edo edo, String str2, String str3, long j, long j2, int i, String str4, int i2, boolean z, long j3) {
        fzf fzf = (fzf) this.w.get(str);
        if (fzf == null) {
            fzf = new fzf();
            this.w.put(str, fzf);
        }
        if (j >= fzf.c) {
            fzf.a(edo, str2, str3, j, j2, i, str4, i2, j3);
        }
        if (z && j >= fzf.i) {
            fzf.a(j);
        }
    }

    private void c() {
        for (String str : this.w.keySet()) {
            fzf fzf = (fzf) this.w.get(str);
            if (!fzf.k) {
                this.t.a(str, fzf.c, -1, fzf.f, fzf.g, fzf.a, fzf.b, fzf.e, fzf.d, fzf.h, 0);
                this.t.i(str, fzf.c);
                this.t.a(str, fzf.i, false, "smssync");
                this.t.n(str, fzf.j);
                fzf.k = true;
            }
        }
    }

    private int a(String str, String str2, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 128) {
            int min = Math.min(i2 + 128, length);
            int i3 = min - i2;
            i += this.t.e().a(str, String.format(Locale.US, "%s IN %s", new Object[]{str2, fyi.a(i3)}), (String[]) Arrays.copyOfRange(strArr, i2, min));
        }
        return i;
    }

    public static void a(bko bko) {
        iil.b("Expected non-null", (Object) bko);
        if (bko.e()) {
            if (a) {
                new StringBuilder(47).append("SmsSyncManager A#").append(bko.g()).append(": scheduled cleanse");
            }
            B.execute(new fze(bko));
        }
    }

    public static void a(bko bko, boolean z, long j) {
        iil.b("Expected non-null", (Object) bko);
        if (bko.e()) {
            Object obj;
            List<fzm> list = (List) q.get(bko.a());
            if (list != null) {
                for (fzm fzm : list) {
                    if (fzm.a) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            if (obj == null) {
                if (a) {
                    int g = bko.g();
                    String str = z ? " full" : "";
                    new StringBuilder(String.valueOf(str).length() + 81).append("SmsSyncManager A#").append(g).append(": scheduled").append(str).append(" sync in ").append(j).append(" milliseconds");
                }
                Runnable fzm2 = new fzm(bko, z);
                String a = bko.a();
                synchronized (q) {
                    List list2 = (List) q.get(a);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        q.put(a, list2);
                    }
                    list2.add(fzm2);
                }
                fzb.b(bko.a());
                B.schedule(fzm2, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int r35, long r36, defpackage.fzl r38) {
        /*
        r34 = this;
        r4 = "Expected non-null";
        r0 = r38;
        defpackage.iil.b(r4, r0);
        r38.a();
        r4 = a;
        if (r4 != 0) goto L_0x0014;
    L_0x000e:
        r0 = r34;
        r4 = r0.A;
        if (r4 == 0) goto L_0x0044;
    L_0x0014:
        r0 = r34;
        r4 = r0.s;
        r4 = r4.g();
        r5 = new java.lang.StringBuilder;
        r6 = 99;
        r5.<init>(r6);
        r6 = "SmsSyncManager A#";
        r5 = r5.append(r6);
        r4 = r5.append(r4);
        r5 = ": batch started with size = ";
        r4 = r4.append(r5);
        r0 = r35;
        r4 = r4.append(r0);
        r5 = ", last ts = ";
        r4 = r4.append(r5);
        r0 = r36;
        r4.append(r0);
    L_0x0044:
        r28 = defpackage.glj.b();
        r23 = 1;
        r14 = 0;
        r13 = 0;
        r21 = 0;
        r22 = 0;
        r20 = 0;
        r12 = 0;
        r11 = 0;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r27 = new lc;
        r27.<init>();
        r30 = new java.util.ArrayList;
        r30.<init>();
        r15 = new java.util.HashSet;
        r15.<init>();
        r16 = new java.util.HashSet;
        r16.<init>();
        r4 = new fzh;	 Catch:{ SQLiteException -> 0x029c, all -> 0x02d1 }
        r0 = r34;
        r5 = r0.t;	 Catch:{ SQLiteException -> 0x029c, all -> 0x02d1 }
        r0 = r34;
        r6 = r0.x;	 Catch:{ SQLiteException -> 0x029c, all -> 0x02d1 }
        r8 = r36;
        r4.<init>(r5, r6, r8);	 Catch:{ SQLiteException -> 0x029c, all -> 0x02d1 }
        r8 = new fzk;	 Catch:{ SQLiteException -> 0x05d6, all -> 0x05c7 }
        r0 = r34;
        r6 = r0.x;	 Catch:{ SQLiteException -> 0x05d6, all -> 0x05c7 }
        r0 = r36;
        r8.<init>(r6, r0);	 Catch:{ SQLiteException -> 0x05d6, all -> 0x05c7 }
        r12 = r8.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r6 = r4.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r25 = r13;
        r26 = r14;
    L_0x0093:
        r5 = r26 + r25;
        r7 = n;	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r5 >= r7) goto L_0x00a5;
    L_0x0099:
        r5 = r21 + r20;
        r0 = r35;
        if (r5 >= r0) goto L_0x00a5;
    L_0x009f:
        if (r12 != 0) goto L_0x015a;
    L_0x00a1:
        if (r6 != 0) goto L_0x015a;
    L_0x00a3:
        r23 = 0;
    L_0x00a5:
        r0 = r34;
        r1 = r27;
        r0.a(r1);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r4.b();
        r8.b();
        r32 = defpackage.glj.b();
        r0 = r34;
        r4 = r0.t;
        r4.a();
        r0 = r10;
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x04e2 }
        r4 = r0;
        r31 = r4.size();	 Catch:{ all -> 0x04e2 }
        r5 = 0;
        r6 = r5;
    L_0x00c7:
        r0 = r31;
        if (r6 >= r0) goto L_0x050c;
    L_0x00cb:
        r5 = r4.get(r6);	 Catch:{ all -> 0x04e2 }
        r24 = r6 + 1;
        r5 = (defpackage.fxr) r5;	 Catch:{ all -> 0x04e2 }
        r6 = r5.n;	 Catch:{ all -> 0x04e2 }
        if (r6 != 0) goto L_0x0106;
    L_0x00d7:
        r6 = "Babel_SMS";
        r0 = r34;
        r7 = r0.s;	 Catch:{ all -> 0x04e2 }
        r7 = r7.g();	 Catch:{ all -> 0x04e2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04e2 }
        r9 = 45;
        r8.<init>(r9);	 Catch:{ all -> 0x04e2 }
        r9 = "SmsSyncManager A#";
        r8 = r8.append(r9);	 Catch:{ all -> 0x04e2 }
        r7 = r8.append(r7);	 Catch:{ all -> 0x04e2 }
        r8 = ": empty sms body.";
        r7 = r7.append(r8);	 Catch:{ all -> 0x04e2 }
        r7 = r7.toString();	 Catch:{ all -> 0x04e2 }
        r8 = 0;
        r8 = new java.lang.Object[r8];	 Catch:{ all -> 0x04e2 }
        defpackage.glk.d(r6, r7, r8);	 Catch:{ all -> 0x04e2 }
        r6 = "";
        r5.n = r6;	 Catch:{ all -> 0x04e2 }
    L_0x0106:
        r6 = r5.m;	 Catch:{ all -> 0x04e2 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x04e2 }
        if (r6 == 0) goto L_0x0141;
    L_0x010e:
        r6 = "Babel_SMS";
        r0 = r34;
        r7 = r0.s;	 Catch:{ all -> 0x04e2 }
        r7 = r7.g();	 Catch:{ all -> 0x04e2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04e2 }
        r9 = 48;
        r8.<init>(r9);	 Catch:{ all -> 0x04e2 }
        r9 = "SmsSyncManager A#";
        r8 = r8.append(r9);	 Catch:{ all -> 0x04e2 }
        r7 = r8.append(r7);	 Catch:{ all -> 0x04e2 }
        r8 = ": empty sms address.";
        r7 = r7.append(r8);	 Catch:{ all -> 0x04e2 }
        r7 = r7.toString();	 Catch:{ all -> 0x04e2 }
        r8 = 0;
        r8 = new java.lang.Object[r8];	 Catch:{ all -> 0x04e2 }
        defpackage.glk.d(r6, r7, r8);	 Catch:{ all -> 0x04e2 }
        r6 = defpackage.gwb.A();	 Catch:{ all -> 0x04e2 }
        r6 = r6.c;	 Catch:{ all -> 0x04e2 }
        r5.m = r6;	 Catch:{ all -> 0x04e2 }
    L_0x0141:
        r6 = 0;
        r8 = r5.o;	 Catch:{ all -> 0x04e2 }
        r6 = defpackage.fzb.c(r6, r8);	 Catch:{ all -> 0x04e2 }
        if (r6 == 0) goto L_0x02df;
    L_0x014a:
        r12 = -1;
    L_0x014c:
        r6 = 0;
        r5 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x05e5;
    L_0x0152:
        r5 = r22 + 1;
    L_0x0154:
        r6 = r24;
        r22 = r5;
        goto L_0x00c7;
    L_0x015a:
        if (r12 != 0) goto L_0x015e;
    L_0x015c:
        if (r6 != 0) goto L_0x016e;
    L_0x015e:
        if (r6 == 0) goto L_0x018c;
    L_0x0160:
        if (r12 == 0) goto L_0x018c;
    L_0x0162:
        r18 = r6.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r32 = r12.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (r18 > r32 ? 1 : (r18 == r32 ? 0 : -1));
        if (r5 <= 0) goto L_0x018c;
    L_0x016e:
        r0 = r6;
        r0 = (defpackage.fzi) r0;	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = r0;
        r0 = r30;
        r0.add(r5);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r6 = r6.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r38;
        r0.a(r6);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r6 = r4.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r11 = r26 + 1;
        r20 = r20 + 1;
        r26 = r11;
        goto L_0x0093;
    L_0x018c:
        if (r6 != 0) goto L_0x0190;
    L_0x018e:
        if (r12 != 0) goto L_0x01a0;
    L_0x0190:
        if (r6 == 0) goto L_0x01ba;
    L_0x0192:
        if (r12 == 0) goto L_0x01ba;
    L_0x0194:
        r18 = r6.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r32 = r12.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (r18 > r32 ? 1 : (r18 == r32 ? 0 : -1));
        if (r5 >= 0) goto L_0x01ba;
    L_0x01a0:
        r0 = r27;
        defpackage.fzb.a(r10, r0, r12);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r12 = r12.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r38;
        r0.a(r12);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r12 = r8.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r13 = r25 + 1;
        r21 = r21 + 1;
        r25 = r13;
        goto L_0x0093;
    L_0x01ba:
        r18 = r6.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r38;
        r1 = r18;
        r0.a(r1);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r9 = r8.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r7 = r4.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r9 == 0) goto L_0x01d7;
    L_0x01cf:
        r32 = r9.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (r32 > r18 ? 1 : (r32 == r18 ? 0 : -1));
        if (r5 == 0) goto L_0x0207;
    L_0x01d7:
        if (r7 == 0) goto L_0x01e1;
    L_0x01d9:
        r32 = r7.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (r32 > r18 ? 1 : (r32 == r18 ? 0 : -1));
        if (r5 == 0) goto L_0x0207;
    L_0x01e1:
        r5 = r12.equals(r6);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r5 != 0) goto L_0x05ef;
    L_0x01e7:
        r6 = (defpackage.fzi) r6;	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r30;
        r0.add(r6);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = r20 + 1;
        r0 = r27;
        defpackage.fzb.a(r10, r0, r12);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r6 = r21 + 1;
    L_0x01f7:
        r11 = r26 + 1;
        r13 = r25 + 1;
        r12 = r9;
        r20 = r5;
        r21 = r6;
        r25 = r13;
        r26 = r11;
        r6 = r7;
        goto L_0x0093;
    L_0x0207:
        r16.clear();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r16;
        r0.add(r12);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = r25 + 1;
        r12 = r9;
        r13 = r5;
    L_0x0213:
        if (r12 == 0) goto L_0x022b;
    L_0x0215:
        r24 = r12.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1));
        if (r5 != 0) goto L_0x022b;
    L_0x021d:
        r0 = r16;
        r0.add(r12);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r9 = r13 + 1;
        r5 = r8.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r12 = r5;
        r13 = r9;
        goto L_0x0213;
    L_0x022b:
        r15.clear();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r15.add(r6);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = r26 + 1;
        r9 = r7;
        r11 = r5;
    L_0x0235:
        if (r9 == 0) goto L_0x024b;
    L_0x0237:
        r6 = r9.c();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1));
        if (r5 != 0) goto L_0x024b;
    L_0x023f:
        r15.add(r9);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r6 = r11 + 1;
        r5 = r4.a();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r9 = r5;
        r11 = r6;
        goto L_0x0235;
    L_0x024b:
        r7 = r15.iterator();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r6 = r20;
    L_0x0251:
        r5 = r7.hasNext();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r5 == 0) goto L_0x0270;
    L_0x0257:
        r5 = r7.next();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (defpackage.fxn) r5;	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r16;
        r14 = r0.contains(r5);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r14 != 0) goto L_0x05ec;
    L_0x0265:
        r5 = (defpackage.fzi) r5;	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r0 = r30;
        r0.add(r5);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = r6 + 1;
    L_0x026e:
        r6 = r5;
        goto L_0x0251;
    L_0x0270:
        r14 = r16.iterator();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r7 = r21;
    L_0x0276:
        r5 = r14.hasNext();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r5 == 0) goto L_0x0291;
    L_0x027c:
        r5 = r14.next();	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = (defpackage.fxn) r5;	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r17 = r15.contains(r5);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        if (r17 != 0) goto L_0x05e9;
    L_0x0288:
        r0 = r27;
        defpackage.fzb.a(r10, r0, r5);	 Catch:{ SQLiteException -> 0x05dc, all -> 0x05cd }
        r5 = r7 + 1;
    L_0x028f:
        r7 = r5;
        goto L_0x0276;
    L_0x0291:
        r20 = r6;
        r21 = r7;
        r25 = r13;
        r26 = r11;
        r6 = r9;
        goto L_0x0093;
    L_0x029c:
        r4 = move-exception;
        r5 = r11;
        r6 = r12;
    L_0x029f:
        r7 = "Babel_SMS";
        r8 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x05d2 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05d2 }
        r10 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x05d2 }
        r10 = r10.length();	 Catch:{ all -> 0x05d2 }
        r10 = r10 + 47;
        r9.<init>(r10);	 Catch:{ all -> 0x05d2 }
        r10 = "SmsSyncManager: Something's seriously wrong -- ";
        r9 = r9.append(r10);	 Catch:{ all -> 0x05d2 }
        r8 = r9.append(r8);	 Catch:{ all -> 0x05d2 }
        r8 = r8.toString();	 Catch:{ all -> 0x05d2 }
        defpackage.glk.d(r7, r8, r4);	 Catch:{ all -> 0x05d2 }
        if (r6 == 0) goto L_0x02ca;
    L_0x02c7:
        r6.b();
    L_0x02ca:
        if (r5 == 0) goto L_0x02cf;
    L_0x02cc:
        r5.b();
    L_0x02cf:
        r4 = 0;
    L_0x02d0:
        return r4;
    L_0x02d1:
        r4 = move-exception;
        r8 = r11;
        r6 = r12;
    L_0x02d4:
        if (r6 == 0) goto L_0x02d9;
    L_0x02d6:
        r6.b();
    L_0x02d9:
        if (r8 == 0) goto L_0x02de;
    L_0x02db:
        r8.b();
    L_0x02de:
        throw r4;
    L_0x02df:
        r6 = r5.r;	 Catch:{ all -> 0x04e2 }
        r7 = 1;
        if (r6 == r7) goto L_0x0347;
    L_0x02e4:
        r6 = 1;
        r9 = r6;
    L_0x02e6:
        r7 = 0;
        if (r9 == 0) goto L_0x034c;
    L_0x02e9:
        r0 = r34;
        r6 = r0.s;	 Catch:{ all -> 0x04e2 }
        if (r6 == 0) goto L_0x034a;
    L_0x02ef:
        r0 = r34;
        r6 = r0.s;	 Catch:{ all -> 0x04e2 }
        r6 = r6.b();	 Catch:{ all -> 0x04e2 }
    L_0x02f7:
        r7 = r6;
    L_0x02f8:
        if (r7 != 0) goto L_0x035f;
    L_0x02fa:
        r6 = "Babel_SMS";
        r0 = r34;
        r7 = r0.s;	 Catch:{ all -> 0x04e2 }
        r7 = r7.g();	 Catch:{ all -> 0x04e2 }
        r8 = r5.o;	 Catch:{ all -> 0x04e2 }
        r10 = r5.r;	 Catch:{ all -> 0x04e2 }
        r12 = r5.s;	 Catch:{ all -> 0x04e2 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04e2 }
        r11 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r5.<init>(r11);	 Catch:{ all -> 0x04e2 }
        r11 = "SmsSyncManager A#";
        r5 = r5.append(r11);	 Catch:{ all -> 0x04e2 }
        r5 = r5.append(r7);	 Catch:{ all -> 0x04e2 }
        r7 = ": found SMS has no address: id=";
        r5 = r5.append(r7);	 Catch:{ all -> 0x04e2 }
        r5 = r5.append(r8);	 Catch:{ all -> 0x04e2 }
        r7 = " type=";
        r5 = r5.append(r7);	 Catch:{ all -> 0x04e2 }
        r5 = r5.append(r10);	 Catch:{ all -> 0x04e2 }
        r7 = " thread_id=";
        r5 = r5.append(r7);	 Catch:{ all -> 0x04e2 }
        r5 = r5.append(r12);	 Catch:{ all -> 0x04e2 }
        r5 = r5.toString();	 Catch:{ all -> 0x04e2 }
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x04e2 }
        defpackage.glk.e(r6, r5, r7);	 Catch:{ all -> 0x04e2 }
        r12 = -1;
        goto L_0x014c;
    L_0x0347:
        r6 = 0;
        r9 = r6;
        goto L_0x02e6;
    L_0x034a:
        r6 = 0;
        goto L_0x02f7;
    L_0x034c:
        r6 = r5.m;	 Catch:{ all -> 0x04e2 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x04e2 }
        if (r6 != 0) goto L_0x02f8;
    L_0x0354:
        r6 = defpackage.gwb.H();	 Catch:{ all -> 0x04e2 }
        r7 = r5.m;	 Catch:{ all -> 0x04e2 }
        r7 = defpackage.gwb.d(r6, r7);	 Catch:{ all -> 0x04e2 }
        goto L_0x02f8;
    L_0x035f:
        r6 = defpackage.blf.a(r7);	 Catch:{ all -> 0x04e2 }
        r10 = r5.s;	 Catch:{ all -> 0x04e2 }
        if (r6 == 0) goto L_0x03a5;
    L_0x0367:
        r6 = r7;
    L_0x0368:
        r0 = r34;
        r6 = r0.a(r10, r6);	 Catch:{ all -> 0x04e2 }
        if (r6 != 0) goto L_0x03a7;
    L_0x0370:
        r6 = "Babel_SMS";
        r0 = r34;
        r7 = r0.s;	 Catch:{ all -> 0x04e2 }
        r7 = r7.g();	 Catch:{ all -> 0x04e2 }
        r8 = r5.s;	 Catch:{ all -> 0x04e2 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04e2 }
        r10 = 95;
        r5.<init>(r10);	 Catch:{ all -> 0x04e2 }
        r10 = "SmsSyncManager A#";
        r5 = r5.append(r10);	 Catch:{ all -> 0x04e2 }
        r5 = r5.append(r7);	 Catch:{ all -> 0x04e2 }
        r7 = ": failed to create conversation for sms thread ";
        r5 = r5.append(r7);	 Catch:{ all -> 0x04e2 }
        r5 = r5.append(r8);	 Catch:{ all -> 0x04e2 }
        r5 = r5.toString();	 Catch:{ all -> 0x04e2 }
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x04e2 }
        defpackage.glk.e(r6, r5, r7);	 Catch:{ all -> 0x04e2 }
        r12 = -1;
        goto L_0x014c;
    L_0x03a5:
        r6 = 0;
        goto L_0x0368;
    L_0x03a7:
        r10 = new android.content.ContentValues;	 Catch:{ all -> 0x04e2 }
        r10.<init>();	 Catch:{ all -> 0x04e2 }
        r8 = "message_id";
        r11 = defpackage.blo.i();	 Catch:{ all -> 0x04e2 }
        r10.put(r8, r11);	 Catch:{ all -> 0x04e2 }
        r8 = "conversation_id";
        r10.put(r8, r6);	 Catch:{ all -> 0x04e2 }
        r8 = "transport_type";
        r11 = 3;
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x04e2 }
        r10.put(r8, r11);	 Catch:{ all -> 0x04e2 }
        r11 = "type";
        if (r9 == 0) goto L_0x04d2;
    L_0x03c8:
        r8 = defpackage.fwy.OUTGOING_USER_MESSAGE;	 Catch:{ all -> 0x04e2 }
        r8 = r8.ordinal();	 Catch:{ all -> 0x04e2 }
    L_0x03ce:
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r8);	 Catch:{ all -> 0x04e2 }
        r8 = "author_chat_id";
        r11 = r7.b;	 Catch:{ all -> 0x04e2 }
        r10.put(r8, r11);	 Catch:{ all -> 0x04e2 }
        r8 = "author_gaia_id";
        r11 = r7.a;	 Catch:{ all -> 0x04e2 }
        r10.put(r8, r11);	 Catch:{ all -> 0x04e2 }
        r8 = r5.n;	 Catch:{ all -> 0x04e2 }
        r11 = "text";
        r10.put(r11, r8);	 Catch:{ all -> 0x04e2 }
        r11 = "status";
        r12 = defpackage.fwx.ON_SERVER;	 Catch:{ all -> 0x04e2 }
        r12 = r12.ordinal();	 Catch:{ all -> 0x04e2 }
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r12);	 Catch:{ all -> 0x04e2 }
        r11 = "timestamp";
        r12 = r5.p;	 Catch:{ all -> 0x04e2 }
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r12);	 Catch:{ all -> 0x04e2 }
        r11 = "notification_level";
        r12 = -1;
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r12);	 Catch:{ all -> 0x04e2 }
        r11 = "expiration_timestamp";
        r12 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r12);	 Catch:{ all -> 0x04e2 }
        r11 = "external_ids";
        r12 = 1;
        r12 = new java.lang.String[r12];	 Catch:{ all -> 0x04e2 }
        r13 = 0;
        r14 = g;	 Catch:{ all -> 0x04e2 }
        r14 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x04e2 }
        r0 = r5.o;	 Catch:{ all -> 0x04e2 }
        r16 = r0;
        r15 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04e2 }
        r18 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x04e2 }
        r18 = r18.length();	 Catch:{ all -> 0x04e2 }
        r18 = r18 + 21;
        r0 = r18;
        r15.<init>(r0);	 Catch:{ all -> 0x04e2 }
        r14 = r15.append(r14);	 Catch:{ all -> 0x04e2 }
        r15 = "/";
        r14 = r14.append(r15);	 Catch:{ all -> 0x04e2 }
        r0 = r16;
        r14 = r14.append(r0);	 Catch:{ all -> 0x04e2 }
        r14 = r14.toString();	 Catch:{ all -> 0x04e2 }
        r14 = android.net.Uri.parse(r14);	 Catch:{ all -> 0x04e2 }
        r14 = r14.toString();	 Catch:{ all -> 0x04e2 }
        r12[r13] = r14;	 Catch:{ all -> 0x04e2 }
        r12 = defpackage.gwb.a(r12);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r12);	 Catch:{ all -> 0x04e2 }
        r11 = "sms_timestamp_sent";
        r12 = r5.q;	 Catch:{ all -> 0x04e2 }
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x04e2 }
        r10.put(r11, r12);	 Catch:{ all -> 0x04e2 }
        if (r9 == 0) goto L_0x04da;
    L_0x046f:
        r9 = "sms_raw_recipients";
        r11 = r5.m;	 Catch:{ all -> 0x04e2 }
        r10.put(r9, r11);	 Catch:{ all -> 0x04e2 }
    L_0x0476:
        r9 = "sms_message_status";
        r11 = r5.t;	 Catch:{ all -> 0x04e2 }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x04e2 }
        r10.put(r9, r11);	 Catch:{ all -> 0x04e2 }
        r9 = "sms_type";
        r11 = 0;
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x04e2 }
        r10.put(r9, r11);	 Catch:{ all -> 0x04e2 }
        r9 = "persisted";
        r11 = 1;
        r11 = java.lang.Boolean.valueOf(r11);	 Catch:{ all -> 0x04e2 }
        r10.put(r9, r11);	 Catch:{ all -> 0x04e2 }
        r0 = r34;
        r9 = r0.t;	 Catch:{ all -> 0x04e2 }
        r12 = r9.b(r10);	 Catch:{ all -> 0x04e2 }
        r10 = -1;
        r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r9 != 0) goto L_0x04eb;
    L_0x04a3:
        r5 = "Babel_SMS";
        r0 = r34;
        r6 = r0.s;	 Catch:{ all -> 0x04e2 }
        r6 = r6.g();	 Catch:{ all -> 0x04e2 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04e2 }
        r8 = 61;
        r7.<init>(r8);	 Catch:{ all -> 0x04e2 }
        r8 = "SmsSyncManager A#";
        r7 = r7.append(r8);	 Catch:{ all -> 0x04e2 }
        r6 = r7.append(r6);	 Catch:{ all -> 0x04e2 }
        r7 = ": failed to insert sms into table";
        r6 = r6.append(r7);	 Catch:{ all -> 0x04e2 }
        r6 = r6.toString();	 Catch:{ all -> 0x04e2 }
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x04e2 }
        defpackage.glk.e(r5, r6, r7);	 Catch:{ all -> 0x04e2 }
        r12 = -1;
        goto L_0x014c;
    L_0x04d2:
        r8 = defpackage.fwy.INCOMING_USER_MESSAGE;	 Catch:{ all -> 0x04e2 }
        r8 = r8.ordinal();	 Catch:{ all -> 0x04e2 }
        goto L_0x03ce;
    L_0x04da:
        r9 = "sms_raw_sender";
        r11 = r5.m;	 Catch:{ all -> 0x04e2 }
        r10.put(r9, r11);	 Catch:{ all -> 0x04e2 }
        goto L_0x0476;
    L_0x04e2:
        r4 = move-exception;
        r0 = r34;
        r5 = r0.t;
        r5.c();
        throw r4;
    L_0x04eb:
        r0 = r34;
        r9 = r0.y;	 Catch:{ all -> 0x04e2 }
        r10 = r5.v;	 Catch:{ all -> 0x04e2 }
        r9 = r9 | r10;
        r0 = r34;
        r0.y = r9;	 Catch:{ all -> 0x04e2 }
        r9 = 0;
        r10 = r5.p;	 Catch:{ all -> 0x04e2 }
        r14 = 2;
        r15 = 0;
        r16 = 0;
        r0 = r5.u;	 Catch:{ all -> 0x04e2 }
        r17 = r0;
        r0 = r5.s;	 Catch:{ all -> 0x04e2 }
        r18 = r0;
        r5 = r34;
        r5.a(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x04e2 }
        goto L_0x014c;
    L_0x050c:
        r4 = 0;
        r6 = r4;
        r5 = r22;
    L_0x0510:
        r4 = r27.a();	 Catch:{ all -> 0x04e2 }
        if (r6 >= r4) goto L_0x0531;
    L_0x0516:
        r0 = r27;
        r4 = r0.b(r6);	 Catch:{ all -> 0x04e2 }
        r4 = (defpackage.fxp) r4;	 Catch:{ all -> 0x04e2 }
        r0 = r34;
        r8 = r0.a(r4);	 Catch:{ all -> 0x04e2 }
        r10 = 0;
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 <= 0) goto L_0x05e2;
    L_0x052a:
        r4 = r5 + 1;
    L_0x052c:
        r5 = r6 + 1;
        r6 = r5;
        r5 = r4;
        goto L_0x0510;
    L_0x0531:
        r4 = "messages";
        r6 = "_id";
        r7 = defpackage.fzb.a(r30);	 Catch:{ all -> 0x04e2 }
        r0 = r34;
        r4 = r0.a(r4, r6, r7);	 Catch:{ all -> 0x04e2 }
        r34.c();	 Catch:{ all -> 0x04e2 }
        r0 = r34;
        r6 = r0.t;	 Catch:{ all -> 0x04e2 }
        r6.b();	 Catch:{ all -> 0x04e2 }
        r0 = r34;
        r6 = r0.t;
        r6.c();
        r0 = r34;
        r6 = r0.t;
        defpackage.blf.d(r6);
        r0 = r26;
        r1 = r38;
        r1.c = r0;
        r0 = r25;
        r1 = r38;
        r1.d = r0;
        r0 = r21;
        r1 = r38;
        r1.e = r0;
        r0 = r38;
        r0.f = r5;
        r0 = r20;
        r1 = r38;
        r1.g = r0;
        r0 = r38;
        r0.h = r4;
        r4 = defpackage.glj.b();
        r6 = r4 - r28;
        r0 = r38;
        r0.a = r6;
        r4 = r4 - r32;
        r0 = r38;
        r0.b = r4;
        r4 = a;
        if (r4 != 0) goto L_0x0591;
    L_0x058b:
        r0 = r34;
        r4 = r0.A;
        if (r4 == 0) goto L_0x05c3;
    L_0x0591:
        r0 = r34;
        r4 = r0.s;
        r4 = r4.g();
        r5 = r38.toString();
        r5 = java.lang.String.valueOf(r5);
        r6 = new java.lang.StringBuilder;
        r7 = java.lang.String.valueOf(r5);
        r7 = r7.length();
        r7 = r7 + 42;
        r6.<init>(r7);
        r7 = "SmsSyncManager A#";
        r6 = r6.append(r7);
        r4 = r6.append(r4);
        r6 = ": batch done. ";
        r4 = r4.append(r6);
        r4.append(r5);
    L_0x05c3:
        r4 = r23;
        goto L_0x02d0;
    L_0x05c7:
        r5 = move-exception;
        r8 = r11;
        r6 = r4;
        r4 = r5;
        goto L_0x02d4;
    L_0x05cd:
        r5 = move-exception;
        r6 = r4;
        r4 = r5;
        goto L_0x02d4;
    L_0x05d2:
        r4 = move-exception;
        r8 = r5;
        goto L_0x02d4;
    L_0x05d6:
        r5 = move-exception;
        r6 = r4;
        r4 = r5;
        r5 = r11;
        goto L_0x029f;
    L_0x05dc:
        r5 = move-exception;
        r6 = r4;
        r4 = r5;
        r5 = r8;
        goto L_0x029f;
    L_0x05e2:
        r4 = r5;
        goto L_0x052c;
    L_0x05e5:
        r5 = r22;
        goto L_0x0154;
    L_0x05e9:
        r5 = r7;
        goto L_0x028f;
    L_0x05ec:
        r5 = r6;
        goto L_0x026e;
    L_0x05ef:
        r5 = r20;
        r6 = r21;
        goto L_0x01f7;
        */
        throw new UnsupportedOperationException("Method not decompiled: fzb.a(int, long, fzl):boolean");
    }
}
