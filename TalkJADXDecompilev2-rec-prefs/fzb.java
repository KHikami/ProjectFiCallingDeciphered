package p000;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Mms;
import android.provider.Telephony.Sms;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class fzb {
    private static final ScheduledExecutorService f14415B = Executors.newSingleThreadScheduledExecutor();
    private static final String[] f14416C = new String[]{"count()"};
    private static List<String> f14417D = null;
    static final boolean f14418a = false;
    static final String f14419b = String.format(Locale.US, "(%s IN (%d, %d))", new Object[]{"type", Integer.valueOf(1), Integer.valueOf(2)});
    static final String f14420c = String.format(Locale.US, "((%s IN (%d, %d)) AND (%s IN (%d, %d)))", new Object[]{"msg_box", Integer.valueOf(1), Integer.valueOf(2), "m_type", Integer.valueOf(128), Integer.valueOf(132)});
    static final String f14421d = String.format(Locale.US, "((%s=%d) AND (%s=%d OR %s=%d) AND (%s=%d))", new Object[]{"transport_type", Integer.valueOf(3), "sms_type", Integer.valueOf(0), "sms_type", Integer.valueOf(1), "status", Integer.valueOf(fwx.ON_SERVER.ordinal())});
    static volatile long f14422e;
    static final Uri f14423f;
    static final Uri f14424g;
    private static volatile int f14425i;
    private static volatile int f14426j;
    private static volatile int f14427k;
    private static volatile long f14428l;
    private static volatile long f14429m;
    private static volatile int f14430n;
    private static volatile int f14431o;
    private static gkg[] f14432p = new gkg[]{new gkg(), new gkg()};
    private static final Map<String, List<fzm>> f14433q = new HashMap();
    private final boolean f14434A;
    volatile boolean f14435h;
    private final Context f14436r = gwb.m1400H();
    private final bko f14437s;
    private final blo f14438t;
    private final lc<String> f14439u;
    private final lc<List<String>> f14440v;
    private final ky<String, fzf> f14441w;
    private final long f14442x;
    private boolean f14443y;
    private boolean f14444z;

    static {
        Uri uri;
        kae kae = glk.f15571r;
        gwb.m1835a(new fzc());
        if (VERSION.SDK_INT >= 19) {
            uri = Mms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://mms");
        }
        f14423f = uri;
        if (VERSION.SDK_INT >= 19) {
            uri = Sms.CONTENT_URI;
        } else {
            uri = Uri.parse("content://sms");
        }
        f14424g = uri;
    }

    static void m16666a() {
        f14425i = gwb.m1492a(gwb.m1400H(), "babel_sms_sync_first_batch_size", 100);
        f14426j = gwb.m1492a(gwb.m1400H(), "babel_sms_sync_subsequent_batch_size_min", 100);
        f14427k = gwb.m1492a(gwb.m1400H(), "babel_sms_sync_subsequent_batch_size_max", 1000);
        f14428l = gwb.m1519a(gwb.m1400H(), "babel_sms_sync_subsequent_batch_time_limit", 2000);
        f14429m = gwb.m1519a(gwb.m1400H(), "babel_sms_incremental_sync_batch_interval_in_millis", 1000);
        f14430n = gwb.m1492a(gwb.m1400H(), "babel_sms_sync_batch_max_messages_to_scan", 2000);
        f14422e = gwb.m1519a(gwb.m1400H(), "babel_sms_full_sync_backoff_time_millis", 3600000);
        f14431o = gwb.m1492a(gwb.m1400H(), "babel_mms_text_limit", 2000);
    }

    public static void m16667a(int i, long j) {
        iil.m21868a(i, 0, 1);
        synchronized (f14432p) {
            if (j >= 0) {
                f14432p[i].m17883b(j);
            }
        }
    }

    public static void m16679b(int i, long j) {
        iil.m21868a(i, 0, 1);
        synchronized (f14432p) {
            if (j >= 0) {
                f14432p[i].m17884c(j);
            }
        }
    }

    private static boolean m16682c(int i, long j) {
        boolean a;
        iil.m21868a(i, 0, 1);
        synchronized (f14432p) {
            a = f14432p[i].m17882a(j);
        }
        return a;
    }

    static void m16672a(String str, fzm fzm) {
        synchronized (f14433q) {
            List list = (List) f14433q.get(str);
            if (list != null) {
                list.remove(fzm);
            }
        }
    }

    private static void m16680b(String str) {
        synchronized (f14433q) {
            for (String str2 : f14433q.keySet()) {
                if (!TextUtils.equals(str, str2)) {
                    List<fzm> list = (List) f14433q.get(str2);
                    if (list != null) {
                        for (fzm a : list) {
                            a.m16701a();
                        }
                    }
                }
            }
        }
    }

    fzb(blo blo, long j, boolean z) {
        this.f14438t = blo;
        this.f14437s = blo.m6056g();
        this.f14442x = j;
        this.f14435h = false;
        this.f14434A = z;
        this.f14439u = new lc();
        this.f14440v = new lc();
        this.f14441w = new ky();
    }

    public static void m16669a(bko bko, boolean z) {
        fzb.m16670a(bko, true, 0);
    }

    private static int m16658a(Cursor cursor) {
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

    static boolean m16676a(blo blo) {
        Context H = gwb.m1400H();
        int a;
        try {
            int a2 = fzb.m16658a(blo.m6044e().m6200a("messages", f14416C, f14421d, null, null, null, null));
            a = fzb.m16658a(gwb.m1558a(H.getContentResolver(), f14424g, f14416C, f14419b, null, null)) + fzb.m16658a(gwb.m1558a(H.getContentResolver(), f14423f, f14416C, f14420c, null, null));
            boolean z = a2 == a;
            if (!f14418a && z) {
                return z;
            }
            int g = blo.m6056g().m5638g();
            String str = z ? ": " : ": NOT IN SYNC, ";
            new StringBuilder(String.valueOf(str).length() + 69).append("SmsSyncManager A#").append(g).append(str).append("local = ").append(a2).append(", remote = ").append(a);
            return z;
        } catch (Throwable e) {
            a = blo.m6056g().m5638g();
            String valueOf = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 53).append("SmsSyncManager A#").append(a).append(": failed to query counts ").append(valueOf).toString(), e);
            return true;
        }
    }

    int m16683b() {
        if (f14418a || this.f14434A) {
            int g = this.f14437s.m5638g();
            new StringBuilder(60).append("SmsSyncManager A#").append(g).append(": sync from ").append(this.f14442x);
        }
        long a = glj.m17956a();
        long b = glj.m17963b();
        fzl fzl = new fzl();
        int i = f14425i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        long j = -1;
        this.f14443y = false;
        this.f14444z = false;
        boolean z = true;
        while (!this.f14435h) {
            z = m16675a(i, j, fzl);
            i2 += fzl.f14471c;
            i3 += fzl.f14472d;
            i4 += fzl.f14474f;
            i5 += fzl.f14476h;
            if (!z) {
                break;
            }
            if (fzl.f14470b <= 0) {
                i = f14425i;
            } else {
                i = (int) ((((double) (fzl.f14476h + fzl.f14474f)) / ((double) fzl.f14470b)) * ((double) f14428l));
                if (i < f14426j) {
                    i = f14426j;
                } else if (i > f14427k) {
                    i = f14427k;
                }
            }
            j = fzl.f14477i / 1000;
            if (f14429m > 0) {
                try {
                    Thread.sleep(f14429m);
                } catch (InterruptedException e) {
                }
            }
        }
        if (z) {
            if (f14418a || this.f14434A) {
                new StringBuilder(42).append("SmsSyncManager A#").append(this.f14437s.m5638g()).append(": sync aborted");
            }
            return -1;
        }
        if (this.f14443y) {
            fyi.m16629d(f14424g);
        }
        if (this.f14444z) {
            fyi.m16629d(f14423f);
        }
        if (f14418a || this.f14434A) {
            j = glj.m17963b() - b;
            new StringBuilder(168).append("SmsSyncManager A#").append(this.f14437s.m5638g()).append(": sync done in ").append(j).append(" millis, scanned ").append(i2).append(" local msgs, ").append(i3).append(" remote msgs, ").append(i4).append(" added, ").append(i5).append(" deleted.");
        }
        ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(this.f14437s.m5638g()).m23878b("sms_last_sync_time_millis", a).m23891d();
        return i4 + i5;
    }

    private static String[] m16677a(List<fzi> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = Long.toString(((fzi) list.get(i)).m16694d());
        }
        return strArr;
    }

    static Uri m16662a(String str) {
        String n = gwb.m2307n(str);
        if (TextUtils.isEmpty(n) || !n.startsWith("content://")) {
            return null;
        }
        return Uri.parse(n);
    }

    static long m16660a(Uri uri) {
        if (uri != null) {
            try {
                return ContentUris.parseId(uri);
            } catch (UnsupportedOperationException e) {
            } catch (NumberFormatException e2) {
            }
        }
        return -1;
    }

    private static String m16678b(String str, String str2, long j, long j2) {
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

    private static void m16673a(List<fxr> list, lc<fxp> lcVar, fxn fxn) {
        if (fxn.mo2112a() == 1) {
            lcVar.m28559c(fxn.mo2113b(), (fxp) fxn);
        } else {
            list.add((fxr) fxn);
        }
    }

    private long m16661a(fxp fxp) {
        if (fxp.f14287w.size() <= 0) {
            glk.m17981d("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": MMS message has no part", new Object[0]);
        }
        List a = m16665a(fxp.f14282r);
        if (a == null || a.size() <= 0) {
            glk.m17982e("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": MMS message has no recipient", new Object[0]);
            return -1;
        } else if (fzb.m16682c(1, fxp.f14277m)) {
            return -1;
        } else {
            String a2;
            Object obj = fxp.f14278n != 1 ? 1 : null;
            if (obj == null) {
                a2 = fyi.m16600a(m16665a(fxp.f14282r), fxp.f14277m);
            } else {
                a2 = null;
            }
            edo edo = null;
            if (obj != null) {
                edo = this.f14437s != null ? this.f14437s.m5632b() : null;
            } else if (!TextUtils.isEmpty(a2)) {
                edo = gwb.m2130d(gwb.m1400H(), a2);
            }
            if (edo == null) {
                int g = this.f14437s.m5638g();
                glk.m17982e("Babel_SMS", "SmsSyncManager A#" + g + ": found MMS has no From: id=" + fxp.f14277m + " type=" + fxp.f14278n + " thread_id=" + fxp.f14282r, new Object[0]);
                return -1;
            }
            edo edo2;
            boolean a3 = blf.m5802a(edo);
            long j = fxp.f14282r;
            if (a3) {
                edo2 = edo;
            } else {
                edo2 = null;
            }
            String a4 = m16663a(j, edo2);
            if (a4 == null) {
                glk.m17982e("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": failed to create conversation for mms thread " + fxp.f14282r, new Object[0]);
                return -1;
            }
            int ordinal;
            String i = blo.m5900i();
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
            contentValues.put("author_chat_id", edo.f11245b);
            contentValues.put("author_gaia_id", edo.f11244a);
            str = fxp.m16491e();
            if (str != null && str.length() > f14431o) {
                str = str.substring(0, f14431o);
            }
            contentValues.put("text", str);
            contentValues.put("local_url", fxp.m16492f());
            contentValues.put("attachment_content_type", fxp.m16493g());
            contentValues.put("width_pixels", Integer.valueOf(0));
            contentValues.put("height_pixels", Integer.valueOf(0));
            contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
            contentValues.put("timestamp", Long.valueOf(fxp.f14281q));
            contentValues.put("notification_level", Integer.valueOf(-1));
            contentValues.put("expiration_timestamp", Long.valueOf(Long.MAX_VALUE));
            String[] strArr = new String[1];
            String valueOf = String.valueOf(f14423f);
            strArr[0] = Uri.parse(new StringBuilder(String.valueOf(valueOf).length() + 21).append(valueOf).append("/").append(fxp.f14277m).toString()).toString();
            contentValues.put("external_ids", gwb.m1678a(strArr));
            if (obj != null) {
                contentValues.put("sms_raw_recipients", TextUtils.join(",", a));
            } else {
                contentValues.put("sms_raw_sender", a2);
                if (a.size() > 1) {
                    contentValues.put("sms_raw_recipients", fyi.m16601a(a, a2));
                }
            }
            contentValues.put("sms_priority", Integer.valueOf(fxp.f14283s));
            contentValues.put("mms_subject", fxp.f14279o);
            contentValues.put("sms_message_status", Integer.valueOf(-1));
            contentValues.put("sms_type", Integer.valueOf(1));
            contentValues.put("sms_message_size", Long.valueOf(fxp.m16494h()));
            contentValues.put("persisted", Boolean.valueOf(true));
            j = this.f14438t.m6008b(contentValues);
            if (j == -1) {
                glk.m17982e("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": failed to insert message into table", new Object[0]);
                return -1;
            }
            if (fxp.m16497k() > 1) {
                for (fxq fxq : fxp.m16490d()) {
                    if (fxq.m16503b()) {
                        bmf bmf = new bmf();
                        bmf.f3953a = a4;
                        bmf.f3954b = i;
                        bmf.f3955c = fxq.m16505d().toString();
                        bmf.f3956d = fxq.f14299i;
                        bmf.f3957e = 0;
                        bmf.f3958f = 0;
                        this.f14438t.m5941a(bmf);
                    }
                }
            }
            this.f14444z |= fxp.f14286v;
            int i2 = 2;
            if (fxp.m16496j() <= 1 && fxp.m16497k() == 1 && ba.m4613b(fxp.m16493g())) {
                i2 = 3;
            } else if (fxp.f14287w.size() > 1 || ba.m4636e(fxp.m16493g())) {
                i2 = 9;
            }
            m16671a(a4, edo, str, fxp.m16492f(), fxp.f14281q, j, i2, fxp.m16493g(), 1, fxp.f14285u, fxp.f14282r);
            return j;
        }
    }

    private void m16674a(lc<fxp> lcVar) {
        int a = lcVar.m28550a();
        for (int i = 0; i < a; i += 128) {
            int min = Math.min(i + 128, a) - i;
            String format = String.format(Locale.US, "%s != '%s' AND %s IN %s", new Object[]{"ct", "application/smil", "mid", fyi.m16595a(min)});
            String[] strArr = new String[min];
            for (int i2 = 0; i2 < min; i2++) {
                strArr[i2] = Long.toString(((fxp) lcVar.m28554b(i + i2)).f14277m);
            }
            Cursor a2 = gwb.m1558a(this.f14436r.getContentResolver(), fyi.f14370c, fxq.f14290a, format, strArr, null);
            if (a2 != null) {
                while (a2.moveToNext()) {
                    try {
                        fxq a3 = fxq.m16499a(a2, false);
                        fxp fxp = (fxp) lcVar.m28551a(a3.f14298h);
                        if (fxp != null) {
                            fxp.m16487a(a3);
                        }
                    } finally {
                        a2.close();
                    }
                }
            }
        }
    }

    private String m16663a(long j, edo edo) {
        boolean z = false;
        String str = (String) this.f14439u.m28551a(j);
        if (str != null) {
            return str;
        }
        List<String> a = m16665a(j);
        if (a == null || a.size() <= 0) {
            glk.m17982e("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": could not find recipients for threadId " + j, new Object[0]);
            return null;
        }
        int i;
        List arrayList = new ArrayList();
        for (String str2 : a) {
            edk a2 = gwb.m1597a(gwb.m1400H(), str2, null, null);
            if (edo != null) {
                if (edo.m13608a(a2.f11213b)) {
                    a2.f11220i = Boolean.TRUE;
                }
            }
            arrayList.add(a2);
        }
        if (a.size() > 1) {
            i = 2;
        } else {
            i = 1;
        }
        blo blo = this.f14438t;
        if (edo != null) {
            z = true;
        }
        str2 = blf.m5807b(blo, z, null, arrayList, null, null, boy.LOCAL_ONLY, i, 3, true, null, null);
        if (str2 == null) {
            return null;
        }
        this.f14439u.m28557b(j, str2);
        return str2;
    }

    private List<String> m16665a(long j) {
        List<String> list = (List) this.f14440v.m28551a(j);
        if (list == null) {
            list = fyi.m16604a(j);
            if (list != null && list.size() > 0) {
                this.f14440v.m28557b(j, list);
            }
        }
        if (list != null) {
            return list;
        }
        if (f14417D == null) {
            List arrayList = new ArrayList();
            f14417D = arrayList;
            arrayList.add(gwb.m1364A().f11214c);
        }
        return f14417D;
    }

    private void m16671a(String str, edo edo, String str2, String str3, long j, long j2, int i, String str4, int i2, boolean z, long j3) {
        fzf fzf = (fzf) this.f14441w.get(str);
        if (fzf == null) {
            fzf = new fzf();
            this.f14441w.put(str, fzf);
        }
        if (j >= fzf.f14449c) {
            fzf.m16686a(edo, str2, str3, j, j2, i, str4, i2, j3);
        }
        if (z && j >= fzf.f14455i) {
            fzf.m16685a(j);
        }
    }

    private void m16681c() {
        for (String str : this.f14441w.keySet()) {
            fzf fzf = (fzf) this.f14441w.get(str);
            if (!fzf.f14457k) {
                this.f14438t.m6005a(str, fzf.f14449c, -1, fzf.f14452f, fzf.f14453g, fzf.f14447a, fzf.f14448b, fzf.f14451e, fzf.f14450d, fzf.f14454h, 0);
                this.f14438t.m6069i(str, fzf.f14449c);
                this.f14438t.m5978a(str, fzf.f14455i, false, "smssync");
                this.f14438t.m6093n(str, fzf.f14456j);
                fzf.f14457k = true;
            }
        }
    }

    private int m16659a(String str, String str2, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 128) {
            int min = Math.min(i2 + 128, length);
            int i3 = min - i2;
            i += this.f14438t.m6044e().m6196a(str, String.format(Locale.US, "%s IN %s", new Object[]{str2, fyi.m16595a(i3)}), (String[]) Arrays.copyOfRange(strArr, i2, min));
        }
        return i;
    }

    public static void m16668a(bko bko) {
        iil.m21875b("Expected non-null", (Object) bko);
        if (bko.m5636e()) {
            if (f14418a) {
                new StringBuilder(47).append("SmsSyncManager A#").append(bko.m5638g()).append(": scheduled cleanse");
            }
            f14415B.execute(new fze(bko));
        }
    }

    public static void m16670a(bko bko, boolean z, long j) {
        iil.m21875b("Expected non-null", (Object) bko);
        if (bko.m5636e()) {
            Object obj;
            List<fzm> list = (List) f14433q.get(bko.m5629a());
            if (list != null) {
                for (fzm fzm : list) {
                    if (fzm.f14478a) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            if (obj == null) {
                if (f14418a) {
                    int g = bko.m5638g();
                    String str = z ? " full" : "";
                    new StringBuilder(String.valueOf(str).length() + 81).append("SmsSyncManager A#").append(g).append(": scheduled").append(str).append(" sync in ").append(j).append(" milliseconds");
                }
                Runnable fzm2 = new fzm(bko, z);
                String a = bko.m5629a();
                synchronized (f14433q) {
                    List list2 = (List) f14433q.get(a);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        f14433q.put(a, list2);
                    }
                    list2.add(fzm2);
                }
                fzb.m16680b(bko.m5629a());
                f14415B.schedule(fzm2, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16675a(int i, long j, fzl fzl) {
        fzg fzg;
        Throwable th;
        fzg fzg2;
        iil.m21875b("Expected non-null", (Object) fzl);
        fzl.m16699a();
        if (f14418a || this.f14434A) {
            new StringBuilder(99).append("SmsSyncManager A#").append(this.f14437s.m5638g()).append(": batch started with size = ").append(i).append(", last ts = ").append(j);
        }
        long b = glj.m17963b();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        List arrayList = new ArrayList();
        lc lcVar = new lc();
        List arrayList2 = new ArrayList();
        Set<fxn> hashSet = new HashSet();
        Set<fxn> hashSet2 = new HashSet();
        fzg fzk;
        String str;
        try {
            fzg fzh = new fzh(this.f14438t, this.f14442x, j);
            try {
                fzk = new fzk(this.f14442x, j);
                try {
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    fxn a = fzk.mo2140a();
                    fxn a2 = fzh.mo2140a();
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 + i9 < f14430n && i2 + i4 < i) {
                        if (a == null && a2 == null) {
                            z = false;
                            break;
                        }
                        if (a != null || a2 == null) {
                            if (!(a2 == null || a == null)) {
                            }
                            if ((a2 != null || a == null) && (a2 == null || a == null || a2.mo2114c() >= a.mo2114c())) {
                                long c = a2.mo2114c();
                                fzl.m16700a(c);
                                fxn a3 = fzk.mo2140a();
                                fxn a4 = fzh.mo2140a();
                                if ((a3 == null || a3.mo2114c() != c) && (a4 == null || a4.mo2114c() != c)) {
                                    if (a.equals(a2)) {
                                        i5 = i4;
                                        i6 = i2;
                                    } else {
                                        arrayList2.add((fzi) a2);
                                        i5 = i4 + 1;
                                        fzb.m16673a(arrayList, lcVar, a);
                                        i6 = i2 + 1;
                                    }
                                    a = a3;
                                    i4 = i5;
                                    i2 = i6;
                                    i9++;
                                    i10++;
                                    a2 = a4;
                                } else {
                                    hashSet2.clear();
                                    hashSet2.add(a);
                                    a = a3;
                                    int i11 = i9 + 1;
                                    while (a != null && a.mo2114c() == c) {
                                        hashSet2.add(a);
                                        int i12 = i11 + 1;
                                        a = fzk.mo2140a();
                                        i11 = i12;
                                    }
                                    hashSet.clear();
                                    hashSet.add(a2);
                                    a3 = a4;
                                    int i13 = i10 + 1;
                                    while (a3 != null && a3.mo2114c() == c) {
                                        hashSet.add(a3);
                                        i6 = i13 + 1;
                                        a3 = fzh.mo2140a();
                                        i13 = i6;
                                    }
                                    i6 = i4;
                                    for (fxn fxn : hashSet) {
                                        if (hashSet2.contains(fxn)) {
                                            i5 = i6;
                                        } else {
                                            arrayList2.add((fzi) fxn);
                                            i5 = i6 + 1;
                                        }
                                        i6 = i5;
                                    }
                                    i7 = i2;
                                    for (fxn fxn2 : hashSet2) {
                                        if (hashSet.contains(fxn2)) {
                                            i5 = i7;
                                        } else {
                                            fzb.m16673a(arrayList, lcVar, fxn2);
                                            i5 = i7 + 1;
                                        }
                                        i7 = i5;
                                    }
                                    i4 = i6;
                                    i2 = i7;
                                    i9 = i11;
                                    i10 = i13;
                                    a2 = a3;
                                }
                            } else {
                                fzb.m16673a(arrayList, lcVar, a);
                                fzl.m16700a(a.mo2114c());
                                a = fzk.mo2140a();
                                i2++;
                                i9++;
                            }
                        }
                        arrayList2.add((fzi) a2);
                        fzl.m16700a(a2.mo2114c());
                        a2 = fzh.mo2140a();
                        i4++;
                        i10++;
                    }
                    m16674a(lcVar);
                    fzh.mo2141b();
                    fzk.mo2141b();
                    long b2 = glj.m17963b();
                    this.f14438t.m5958a();
                    ArrayList arrayList3 = (ArrayList) arrayList;
                    int size = arrayList3.size();
                    i6 = 0;
                    while (i6 < size) {
                        long j2;
                        int i14 = i6 + 1;
                        fxr fxr = (fxr) arrayList3.get(i6);
                        if (fxr.f14319n == null) {
                            glk.m17981d("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": empty sms body.", new Object[0]);
                            fxr.f14319n = "";
                        }
                        if (TextUtils.isEmpty(fxr.f14318m)) {
                            glk.m17981d("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": empty sms address.", new Object[0]);
                            fxr.f14318m = gwb.m1364A().f11214c;
                        }
                        if (fzb.m16682c(0, fxr.f14320o)) {
                            j2 = -1;
                        } else {
                            Object obj = fxr.f14323r != 1 ? 1 : null;
                            edo edo = null;
                            if (obj != null) {
                                edo = this.f14437s != null ? this.f14437s.m5632b() : null;
                            } else if (!TextUtils.isEmpty(fxr.f14318m)) {
                                edo = gwb.m2130d(gwb.m1400H(), fxr.f14318m);
                            }
                            if (edo == null) {
                                i7 = this.f14437s.m5638g();
                                glk.m17982e("Babel_SMS", "SmsSyncManager A#" + i7 + ": found SMS has no address: id=" + fxr.f14320o + " type=" + fxr.f14323r + " thread_id=" + fxr.f14324s, new Object[0]);
                                j2 = -1;
                            } else {
                                edo edo2;
                                boolean a5 = blf.m5802a(edo);
                                long j3 = fxr.f14324s;
                                if (a5) {
                                    edo2 = edo;
                                } else {
                                    edo2 = null;
                                }
                                String a6 = m16663a(j3, edo2);
                                if (a6 == null) {
                                    glk.m17982e("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": failed to create conversation for sms thread " + fxr.f14324s, new Object[0]);
                                    j2 = -1;
                                } else {
                                    int ordinal;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("message_id", blo.m5900i());
                                    contentValues.put("conversation_id", a6);
                                    contentValues.put("transport_type", Integer.valueOf(3));
                                    String str2 = "type";
                                    if (obj != null) {
                                        ordinal = fwy.OUTGOING_USER_MESSAGE.ordinal();
                                    } else {
                                        ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
                                    }
                                    contentValues.put(str2, Integer.valueOf(ordinal));
                                    contentValues.put("author_chat_id", edo.f11245b);
                                    contentValues.put("author_gaia_id", edo.f11244a);
                                    str = fxr.f14319n;
                                    contentValues.put("text", str);
                                    contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
                                    contentValues.put("timestamp", Long.valueOf(fxr.f14321p));
                                    contentValues.put("notification_level", Integer.valueOf(-1));
                                    contentValues.put("expiration_timestamp", Long.valueOf(Long.MAX_VALUE));
                                    String[] strArr = new String[1];
                                    String valueOf = String.valueOf(f14424g);
                                    strArr[0] = Uri.parse(new StringBuilder(String.valueOf(valueOf).length() + 21).append(valueOf).append("/").append(fxr.f14320o).toString()).toString();
                                    contentValues.put("external_ids", gwb.m1678a(strArr));
                                    contentValues.put("sms_timestamp_sent", Long.valueOf(fxr.f14322q));
                                    if (obj != null) {
                                        contentValues.put("sms_raw_recipients", fxr.f14318m);
                                    } else {
                                        contentValues.put("sms_raw_sender", fxr.f14318m);
                                    }
                                    contentValues.put("sms_message_status", Integer.valueOf(fxr.f14325t));
                                    contentValues.put("sms_type", Integer.valueOf(0));
                                    contentValues.put("persisted", Boolean.valueOf(true));
                                    j2 = this.f14438t.m6008b(contentValues);
                                    if (j2 == -1) {
                                        glk.m17982e("Babel_SMS", "SmsSyncManager A#" + this.f14437s.m5638g() + ": failed to insert sms into table", new Object[0]);
                                        j2 = -1;
                                    } else {
                                        try {
                                            this.f14443y |= fxr.f14327v;
                                            m16671a(a6, edo, str, null, fxr.f14321p, j2, 2, null, 0, fxr.f14326u, fxr.f14324s);
                                        } finally {
                                            i5 = this.f14438t;
                                            i5.m6028c();
                                        }
                                    }
                                }
                            }
                        }
                        if (j2 > 0) {
                            i5 = i3 + 1;
                        } else {
                            i5 = i3;
                        }
                        i6 = i14;
                        i3 = i5;
                    }
                    i6 = 0;
                    i5 = i3;
                    while (i6 < lcVar.m28550a()) {
                        if (m16661a((fxp) lcVar.m28554b(i6)) > 0) {
                            i8 = i5 + 1;
                        } else {
                            i8 = i5;
                        }
                        i6++;
                        i5 = i8;
                    }
                    i8 = m16659a("messages", "_id", fzb.m16677a(arrayList2));
                    m16681c();
                    this.f14438t.m6015b();
                    blf.m5820d(this.f14438t);
                    fzl.f14471c = i10;
                    fzl.f14472d = i9;
                    fzl.f14473e = i2;
                    fzl.f14474f = i5;
                    fzl.f14475g = i4;
                    fzl.f14476h = i8;
                    long b3 = glj.m17963b();
                    fzl.f14469a = b3 - b;
                    fzl.f14470b = b3 - b2;
                    if (f14418a || this.f14434A) {
                        i8 = this.f14437s.m5638g();
                        String valueOf2 = String.valueOf(fzl.toString());
                        new StringBuilder(String.valueOf(valueOf2).length() + 42).append("SmsSyncManager A#").append(i8).append(": batch done. ").append(valueOf2);
                    }
                    return z;
                } catch (Throwable e) {
                    fzg = fzh;
                    th = e;
                    fzg2 = fzk;
                } catch (Throwable e2) {
                    fzg = fzh;
                    th = e2;
                }
            } catch (Throwable e22) {
                fzg = fzh;
                th = e22;
                fzg2 = null;
                try {
                    str = String.valueOf(th);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 47).append("SmsSyncManager: Something's seriously wrong -- ").append(str).toString(), th);
                    if (fzg != null) {
                        fzg.mo2141b();
                    }
                    if (fzg2 != null) {
                        fzg2.mo2141b();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fzk = fzg2;
                    if (fzg != null) {
                        fzg.mo2141b();
                    }
                    if (fzk != null) {
                        fzk.mo2141b();
                    }
                    throw th;
                }
            } catch (Throwable e222) {
                fzk = null;
                fzg = fzh;
                th = e222;
                if (fzg != null) {
                    fzg.mo2141b();
                }
                if (fzk != null) {
                    fzk.mo2141b();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            th = e3;
            fzg2 = null;
            fzg = null;
            str = String.valueOf(th);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 47).append("SmsSyncManager: Something's seriously wrong -- ").append(str).toString(), th);
            if (fzg != null) {
                fzg.mo2141b();
            }
            if (fzg2 != null) {
                fzg2.mo2141b();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fzk = null;
            fzg = null;
            if (fzg != null) {
                fzg.mo2141b();
            }
            if (fzk != null) {
                fzk.mo2141b();
            }
            throw th;
        }
    }
}
