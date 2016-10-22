package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import android.util.Pair;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: blo */
public final class blo {
    private static final String[] A;
    private static final String B;
    private static final String[] C;
    private static final String[] D;
    private static final String[] E;
    private static final String[] F;
    static final String[] b;
    private static final boolean c;
    private static final gma d;
    private static final String[] i;
    private static final String[] j;
    private static final Random k;
    private static final String[] l;
    private static final String[] m;
    private static String o;
    private static String p;
    private static String q;
    private static final String[] r;
    private static final String[] s;
    private static final String[] t;
    private static final String[] u;
    private static final String[] v;
    private static final String[] w;
    private static final String x;
    private static final String[] y;
    private static final String[] z;
    final Context a;
    private final bmv e;
    private final bko f;
    private final int g;
    private int h;
    private final iih n;

    private void a(java.lang.String r10, java.lang.String r11, android.content.ContentValues r12) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Incorrect nodes count for selectOther: B:31:0x00a1 in [B:24:0x007b, B:31:0x00a1, B:32:0x00a2]
	at jadx.core.utils.BlockUtils.selectOther(BlockUtils.java:53)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:62)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r9 = this;
        r4 = 1;
        r0 = 0;
        r1 = r10.equals(r11);
        if (r1 != 0) goto L_0x000d;
    L_0x0008:
        r1 = "conversation_id";
        r12.put(r1, r11);
    L_0x000d:
        r1 = r9.e;
        r2 = "conversations";
        r3 = "conversation_id=?";
        r4 = new java.lang.String[r4];
        r4[r0] = r10;
        r1.a(r2, r12, r3, r4);
        r1 = new android.content.ContentValues;
        r1.<init>();
        r2 = b;
        r3 = r2.length;
    L_0x0022:
        if (r0 >= r3) goto L_0x0036;
    L_0x0024:
        r4 = r2[r0];
        r5 = r12.containsKey(r4);
        if (r5 == 0) goto L_0x0033;
    L_0x002c:
        r5 = r12.getAsInteger(r4);
        r1.put(r4, r5);
    L_0x0033:
        r0 = r0 + 1;
        goto L_0x0022;
    L_0x0036:
        r0 = r1.size();
        if (r0 == 0) goto L_0x00a2;
    L_0x003c:
        r2 = r9.ad(r11);
        r0 = r2.size();
        if (r0 <= 0) goto L_0x00a2;
    L_0x0046:
        r0 = r9.e;
        r0.a();
        r3 = r2.iterator();	 Catch:{ all -> 0x006b }
    L_0x004f:
        r0 = r3.hasNext();	 Catch:{ all -> 0x006b }
        if (r0 == 0) goto L_0x0084;	 Catch:{ all -> 0x006b }
    L_0x0055:
        r0 = r3.next();	 Catch:{ all -> 0x006b }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x006b }
        r4 = r9.e;	 Catch:{ all -> 0x006b }
        r5 = "conversations";	 Catch:{ all -> 0x006b }
        r6 = "conversation_id=?";	 Catch:{ all -> 0x006b }
        r7 = 1;	 Catch:{ all -> 0x006b }
        r7 = new java.lang.String[r7];	 Catch:{ all -> 0x006b }
        r8 = 0;	 Catch:{ all -> 0x006b }
        r7[r8] = r0;	 Catch:{ all -> 0x006b }
        r4.a(r5, r1, r6, r7);	 Catch:{ all -> 0x006b }
        goto L_0x004f;
    L_0x006b:
        r0 = move-exception;
        r1 = r9.e;
        r1.c();
        r1 = r2.iterator();
    L_0x0075:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00a1;
    L_0x007b:
        r1.next();
        r2 = r9.f;
        defpackage.blf.a(r2);
        goto L_0x0075;
    L_0x0084:
        r0 = r9.e;	 Catch:{ all -> 0x006b }
        r0.b();	 Catch:{ all -> 0x006b }
        r0 = r9.e;
        r0.c();
        r0 = r2.iterator();
    L_0x0092:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00a2;
    L_0x0098:
        r0.next();
        r1 = r9.f;
        defpackage.blf.a(r1);
        goto L_0x0092;
    L_0x00a1:
        throw r0;
    L_0x00a2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: blo.a(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }

    static {
        kae kae = glk.d;
        c = false;
        d = gma.a("EsConversationsHelper");
        i = new String[]{"gaia_id", "chat_id", "name", "first_name", "profile_photo_url", "packed_circle_ids"};
        j = new String[]{"_id", "gaia_id", "chat_id", "phone_id", "circle_id", "full_name", "first_name", "fallback_name", "profile_photo_url", "batch_gebi_tag", "blocked", "participant_type"};
        k = mfo.a;
        l = new String[]{"photo_id", "url", "file_name", "last_used"};
        m = new String[]{"album_id", "cover_photo_id", "title", "last_used"};
        r = new String[]{"conversation_id"};
        b = new String[]{"notification_level", "view"};
        s = new String[]{"latest_message_timestamp", "latest_message_expiration_timestamp", "snippet_type", "snippet_text", "snippet_author_chat_id", "snippet_image_url", "chat_watermark", "hangout_watermark"};
        t = new String[]{"gaia_id", "chat_id", "circle_id", "phone_id"};
        u = new String[]{"message_id", "conversation_id", "author_chat_id", "text", "status", "type", "timestamp", "expiration_timestamp", "local_url", "remote_url", "image_id", "album_id", "stream_id", "attachment_content_type", "attachment_name", "latitude", "longitude", "address", "attachment_target_url", "transport_type", "transport_phone", "sms_type", "width_pixels", "height_pixels", "mms_subject", "image_rotation", "new_conversation_name", "participant_keys", "forwarded_mms_url", "forwarded_mms_count", "attachment_description", "attachment_target_url_description", "attachment_target_url_name", "call_media_type", "last_seen_timestamp", "observed_status", "off_the_record", "attachments"};
        v = new String[]{"local_url"};
        w = new String[]{"conversation_id", "self_watermark"};
        x = String.format(Locale.US, "%s=? AND %s=?", new Object[]{"conversation_id", "participant_type"});
        y = new String[]{"first_peak_scroll_time", "first_peak_scroll_to_message_timestamp", "second_peak_scroll_time", "second_peak_scroll_to_message_timestamp"};
        z = new String[]{"sort_timestamp"};
        A = new String[]{"conversation_id", "call_media_type"};
        B = String.format(Locale.US, "%s in (select %s from %s where %s)", new Object[]{"conversation_id", "conversation_id", "conversations", "sort_timestamp<? AND status=? AND transport_type!=3"});
        C = new String[]{"timestamp"};
        D = new String[]{"conversation_type"};
        E = new String[]{"conversation_id"};
        F = new String[]{"conversation_id"};
    }

    public blo(Context context, bmv bmv, int i) {
        this.a = context;
        this.f = fde.e(i);
        this.g = i;
        this.e = bmv;
        this.n = (iih) jyn.a(context, iih.class);
    }

    public blo(Context context, int i) {
        this(context, bmr.a(context, i).b(), i);
    }

    public void a() {
        this.e.a();
        this.h++;
    }

    public void b() {
        this.e.b();
    }

    public void c() {
        if (this.e != null) {
            this.e.c();
        } else {
            String str = "Babel_ConvHelper";
            String str2 = "endTransaction called on a database not fully setup. Account: ";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.h--;
    }

    public void d() {
        if (this.h <= 1) {
            this.e.d();
        } else {
            glk.d("Babel_ConvHelper", "cannot yield from within a nested transaction", new Exception());
        }
    }

    public bmv e() {
        return this.e;
    }

    public Context f() {
        return this.a;
    }

    public bko g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public static boolean a(String str) {
        return str.startsWith("client_generated:");
    }

    public static boolean b(String str) {
        return str.startsWith("client_generated:sms:");
    }

    public static String i() {
        String valueOf = String.valueOf("client_generated:");
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(Math.abs(k.nextLong())).toString();
    }

    public static String a(int i, int i2) {
        String i3 = blo.i();
        ba.a(i, glj.b(), 11, ba.c().b(i3).a(i2));
        return i3;
    }

    public static String j() {
        String valueOf = String.valueOf("client_generated:sms:");
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(Math.abs(k.nextLong())).toString();
    }

    public static String a(long j) {
        String valueOf = String.valueOf("client_generated:");
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(j).toString();
    }

    public static Long c(String str) {
        String replace = str.replace("client_generated:", "");
        if (replace.startsWith("sms:")) {
            replace = replace.replace("sms:", "");
        }
        try {
            return Long.valueOf(replace);
        } catch (NumberFormatException e) {
            String str2 = "Babel_ConvHelper";
            String str3 = "Malformed client-generated-id: ";
            replace = String.valueOf(str);
            glk.e(str2, replace.length() != 0 ? str3.concat(replace) : new String(str3), new Object[0]);
            iil.a("Malformed client-generated-id");
            return null;
        }
    }

    public static long d(String str) {
        return TextUtils.isEmpty(str) ? 0 : gwb.a(blo.c(str));
    }

    public static boolean a(fhe fhe) {
        return fhe == fhe.LOUD;
    }

    private boolean af(String str) {
        Cursor a;
        Throwable th;
        try {
            a = this.e.a("conversations", new String[]{"conversation_id"}, "conversation_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        if (a != null) {
                            a.close();
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private bls a(Cursor cursor) {
        boolean z;
        boolean z2 = true;
        bls bls = new bls();
        bls.s = cursor.getString(20);
        bls.a = cursor.getInt(0) != 0;
        bls.b = cursor.getInt(1);
        bls.k = cursor.getInt(9);
        bls.q = cursor.getLong(16);
        bls.t = cursor.getString(17);
        bls.u = cursor.getLong(18);
        bls.r = cursor.getInt(19);
        Object string = cursor.getString(2);
        if (TextUtils.isEmpty(string)) {
            bls.d = null;
        } else {
            bls.d = string;
        }
        bls.o = cursor.getString(13);
        if (cursor.getInt(3) != 0) {
            z = true;
        } else {
            z = false;
        }
        bls.e = z;
        if (!cursor.isNull(4)) {
            bls.f = cursor.getBlob(4);
        }
        bls.g = cursor.getLong(5);
        bls.i = cursor.getInt(6);
        bls.j = new edo(cursor.getString(7), cursor.getString(8));
        bls.n = cursor.getLong(10);
        if (cursor.getInt(14) == 0) {
            z2 = false;
        }
        bls.p = z2;
        bls.c = cursor.getInt(15);
        bls.l = cursor.getInt(11);
        bls.m = cursor.getInt(12);
        bls.h = blo.b(cursor);
        bls.v = cursor.getInt(21);
        return bls;
    }

    private static String e(String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT ");
        int i = 0;
        while (i < blt.a.length && (z || i != 22)) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(blt.a[i]);
            i++;
        }
        stringBuilder.append(" FROM ");
        stringBuilder.append("conversations");
        stringBuilder.append(' ');
        if (z) {
            stringBuilder.append(" join conversation_participants_view using (conversation_id) ");
        }
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append(" GROUP BY conversation_id ");
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    private static synchronized String D() {
        String str;
        synchronized (blo.class) {
            if (o == null) {
                o = blo.e(" WHERE conversation_id=? ", true);
            }
            str = o;
        }
        return str;
    }

    private static synchronized String E() {
        String str;
        synchronized (blo.class) {
            if (p == null) {
                p = blo.e(" WHERE conversation_id=? ", false);
            }
            str = p;
        }
        return str;
    }

    private static synchronized String F() {
        String str;
        synchronized (blo.class) {
            if (q == null) {
                q = blo.e(null, true);
            }
            str = q;
        }
        return str;
    }

    private Cursor ag(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.e.a(blo.F(), null);
        }
        Cursor a = this.e.a(blo.D(), new String[]{str});
        if (a != null && a.getCount() != 0) {
            return a;
        }
        if (a != null) {
            a.close();
        }
        return this.e.a(blo.E(), new String[]{str});
    }

    public bls e(String str) {
        bls f = f(str);
        if (f != null) {
            return f;
        }
        glk.e("Babel_ConvHelper", new StringBuilder(String.valueOf(str).length() + 31).append("Conversation id ").append(str).append(" does not exist").toString(), new Object[0]);
        throw new NullPointerException("Conversation id does not exist");
    }

    public bls f(String str) {
        if (c) {
            String str2 = "getConversationInfo ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        bls bls = null;
        Cursor ag = ag(str);
        if (ag != null) {
            try {
                if (ag.moveToFirst()) {
                    bls = a(ag);
                }
            } catch (Throwable th) {
                if (ag != null) {
                    ag.close();
                }
            }
        }
        if (ag != null) {
            ag.close();
        }
        return bls;
    }

    private int a(String str, String str2, String str3, int i) {
        Cursor a;
        Throwable th;
        Object obj = (!c || TextUtils.isEmpty(str)) ? null : 1;
        iil.b("Expected condition to be false", TextUtils.isEmpty(str3));
        if (!TextUtils.isEmpty(str2)) {
            try {
                a = this.e.a("conversations", new String[]{str3}, "conversation_id=?", new String[]{str2}, null, null, null);
                if (a != null) {
                    try {
                        if (a.moveToFirst() && !a.isNull(0)) {
                            i = a.getInt(0);
                            if (obj != null) {
                                new StringBuilder(((String.valueOf(str).length() + 45) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(", conversationId ").append(str2).append(", query ").append(str3).append(" returns ").append(i);
                            }
                            if (a != null) {
                                a.close();
                            }
                            return i;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
            } catch (Throwable th3) {
                th = th3;
                a = null;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        if (obj != null) {
            new StringBuilder(((String.valueOf(str).length() + 39) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(", conversationId ").append(str2).append(", query ").append(str3).append(" has no result");
        }
        return i;
    }

    private long a(String str, String str2, String str3, long j) {
        Throwable th;
        Object obj = (!c || TextUtils.isEmpty(str)) ? null : 1;
        iil.b("Expected condition to be false", TextUtils.isEmpty(str3));
        if (!TextUtils.isEmpty(str2)) {
            Cursor a;
            try {
                a = this.e.a("conversations", new String[]{str3}, "conversation_id=?", new String[]{str2}, null, null, null);
                if (a != null) {
                    try {
                        if (a.moveToFirst() && !a.isNull(0)) {
                            j = a.getLong(0);
                            if (obj != null) {
                                new StringBuilder(((String.valueOf(str).length() + 54) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(", conversationId ").append(str2).append(", query ").append(str3).append(" returns ").append(j);
                            }
                            if (a != null) {
                                a.close();
                            }
                            return j;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
            } catch (Throwable th3) {
                th = th3;
                a = null;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        if (obj != null) {
            new StringBuilder(((String.valueOf(str).length() + 39) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(", conversationId ").append(str2).append(", query ").append(str3).append(" has no result");
        }
        return j;
    }

    private String a(String str, String str2, String str3) {
        Throwable th;
        Cursor cursor = null;
        Object obj = (!c || TextUtils.isEmpty(str)) ? null : 1;
        iil.b("Expected condition to be false", TextUtils.isEmpty(str3));
        if (!TextUtils.isEmpty(str2)) {
            try {
                Cursor a = this.e.a("conversations", new String[]{str3}, "conversation_id=?", new String[]{str2}, null, null, null);
                if (a != null) {
                    try {
                        if (a.moveToFirst()) {
                            String string = a.getString(0);
                            if (obj != null) {
                                new StringBuilder((((String.valueOf(str).length() + 34) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(string).length()).append(str).append(", conversationId ").append(str2).append(", query ").append(str3).append(" returns ").append(string);
                            }
                            if (a == null) {
                                return string;
                            }
                            a.close();
                            return string;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        if (obj != null) {
            new StringBuilder(((String.valueOf(str).length() + 49) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(", conversationId ").append(str2).append(", query ").append(str3).append(" returns null (no match)");
        }
        return null;
    }

    public int g(String str) {
        return a("getConversationTransportType", str, "transport_type", 0);
    }

    private static List<edk> b(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getColumnCount() == 22) {
            return arrayList;
        }
        List c = EsProvider.c(cursor.getString(22));
        List c2 = EsProvider.c(cursor.getString(23));
        List c3 = EsProvider.c(cursor.getString(24));
        List c4 = EsProvider.c(cursor.getString(25));
        List c5 = EsProvider.c(cursor.getString(27));
        List c6 = EsProvider.c(cursor.getString(26));
        List c7 = EsProvider.c(cursor.getString(28));
        List c8 = EsProvider.c(cursor.getString(29));
        List c9 = EsProvider.c(cursor.getString(30));
        List c10 = EsProvider.c(cursor.getString(31));
        List c11 = EsProvider.c(cursor.getString(32));
        for (int i = 0; i < c.size(); i++) {
            if (Integer.parseInt((String) c8.get(i)) == 1) {
                try {
                    arrayList.add(gwb.a(gwb.H(), edq.values()[Integer.parseInt((String) c7.get(i))], (String) c.get(i), (String) c2.get(i), (String) c4.get(i), (String) c3.get(i), (String) c5.get(i), (String) c9.get(i), (String) c6.get(i), (String) c10.get(i), (String) c11.get(i), Boolean.valueOf(false), null, 0));
                } catch (NumberFormatException e) {
                }
            }
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        if (c) {
            new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(str2).length()).append("setDraft conversationId: ").append(str).append(" draft: ").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        String str3 = "draft";
        if (str2 == null) {
            str2 = "";
        }
        contentValues.put(str3, str2);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.a(this.f.g());
    }

    public ArrayList<String> k() {
        Throwable th;
        ArrayList<String> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("conversations", r, "is_pending_leave < 0", null, null, null, null);
            while (a.moveToNext()) {
                try {
                    arrayList.add(a.getString(0));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public boolean h(String str) {
        Cursor a;
        Throwable th;
        try {
            a = this.e.a("messages", new String[]{"_id"}, "conversation_id = ? AND timestamp IS NOT NULL", new String[]{str}, null, null, null);
            try {
                boolean moveToNext = a.moveToNext();
                if (a != null) {
                    a.close();
                }
                return moveToNext;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public ArrayList<String> l() {
        Throwable th;
        ArrayList<String> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("conversations", r, "transport_type!=3", null, null, null, null);
            while (a.moveToNext()) {
                try {
                    arrayList.add(a.getString(0));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public String a(String str, int i, int i2, long j, String str2, int i3) {
        if (c) {
            new StringBuilder(89).append("insertConversation: conversationType=").append(i).append(", temporaryTimestamp=").append(j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put("conversation_type", Integer.valueOf(i));
        contentValues.put("is_pending_leave", Integer.valueOf(0));
        contentValues.put("conversation_id", str2);
        contentValues.put("status", Integer.valueOf(2));
        contentValues.put("view", Integer.valueOf(i3));
        contentValues.put("is_draft", Integer.valueOf(1));
        contentValues.put("is_guest", Integer.valueOf(0));
        contentValues.put("has_oldest_message", Integer.valueOf(1));
        contentValues.put("call_media_type", Integer.valueOf(0));
        contentValues.put("notification_level", Integer.valueOf(30));
        contentValues.put("disposition", Integer.valueOf(3));
        contentValues.put("transport_type", Integer.valueOf(i2));
        contentValues.put("otr_status", Integer.valueOf(2));
        contentValues.put("gls_status", Integer.valueOf(0));
        contentValues.put("sort_timestamp", Long.valueOf(j));
        this.e.a("conversations", null, contentValues);
        return str2;
    }

    public void a(String str, long j) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 81).append("insertPlaceholderConversation: conversationId=").append(str).append(" seenTimestamp=").append(j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", str);
        contentValues.put("is_pending_leave", Integer.valueOf(0));
        contentValues.put("metadata_present", Integer.valueOf(0));
        contentValues.put("chat_watermark", Long.valueOf(j));
        contentValues.put("hangout_watermark", Long.valueOf(j));
        this.e.a("conversations", null, contentValues);
    }

    public long i(String str) {
        return a("getContinuationEventTimestamp", str, "continuation_event_timestamp", 0);
    }

    public void a(String str, byte[] bArr, long j) {
        int i;
        if (c) {
            String valueOf = String.valueOf(Arrays.toString(bArr));
            new StringBuilder((String.valueOf(str).length() + 80) + String.valueOf(valueOf).length()).append("setContinuationToken: conversationId=").append(str).append(" token ").append(valueOf).append(" eventTimestamp ").append(j);
        }
        ContentValues contentValues = new ContentValues();
        if (bArr == null) {
            contentValues.putNull("continuation_token");
        } else {
            contentValues.put("continuation_token", bArr);
        }
        contentValues.put("continuation_event_timestamp", Long.valueOf(j));
        String str2 = "has_oldest_message";
        if (bArr == null && j == 0) {
            i = 1;
        } else {
            i = 0;
        }
        contentValues.put(str2, Integer.valueOf(i));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.f(this, str);
    }

    public void j(String str) {
        if (c) {
            String str2 = "clearContinuationToken: conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("continuation_token");
        contentValues.put("continuation_event_timestamp", Integer.valueOf(0));
        contentValues.put("has_oldest_message", Integer.valueOf(0));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.f(this, str);
    }

    public bmb a(String str, String str2, String str3, String str4) {
        String str5;
        if (c) {
            new StringBuilder((((String.valueOf(str).length() + 38) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("getExistingMergedConversationId ").append(str).append(", ").append(str2).append(", ").append(str3).append(", ").append(str4);
        }
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(str4);
        }
        arrayList.add(str);
        switch (arrayList.size()) {
            case wi.l /*2*/:
                str5 = "conversation_id IN (?, ?)";
                break;
            case wi.z /*3*/:
                str5 = "conversation_id IN (?, ?, ?)";
                break;
            case wi.h /*4*/:
                str5 = "conversation_id IN (?, ?, ?, ?)";
                break;
            default:
                str5 = "conversation_id=?";
                break;
        }
        Cursor a = this.e.a("conversations", bly.a, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), null, null, null);
        try {
            bmb bmb;
            if (a.moveToFirst()) {
                String str6;
                blx c = blo.c(a);
                if (c) {
                    str6 = "getExistingMergedConversationId found match ";
                    String valueOf = String.valueOf(c.a);
                    if (valueOf.length() != 0) {
                        str6.concat(valueOf);
                    } else {
                        valueOf = new String(str6);
                    }
                }
                boolean z = false;
                blx blx = c;
                while (a.moveToNext()) {
                    c = blo.c(a);
                    if (c) {
                        str6 = "getExistingMergedConversationId found another conversation ";
                        String valueOf2 = String.valueOf(c.a);
                        if (valueOf2.length() != 0) {
                            str6.concat(valueOf2);
                        } else {
                            valueOf2 = new String(str6);
                        }
                    }
                    blx = a(blx, c);
                    z = true;
                }
                bmb = new bmb(blx, z);
                a.close();
            } else {
                bmb = new bmb(null, false);
            }
            return bmb;
        } finally {
            a.close();
        }
    }

    private static blx c(Cursor cursor) {
        byte[] bArr;
        boolean z = true;
        String string = cursor.getString(0);
        if (cursor.isNull(1)) {
            bArr = null;
        } else {
            bArr = cursor.getBlob(1);
        }
        int i = cursor.getInt(2);
        if (cursor.getInt(3) != 1) {
            z = false;
        }
        return new blx(string, bArr, i, z);
    }

    private blx a(blx blx, blx blx2) {
        boolean z = false;
        if (blx.a.startsWith("client_generated:") || blx.d) {
            blx blx3 = blx2;
            blx2 = blx;
            blx = blx3;
        } else {
            if (blx2.a.startsWith("client_generated:") || blx2.d) {
                z = true;
            }
            iil.a("Expected condition to be true", z);
        }
        if (c) {
            String str = blx2.a;
            String str2 = blx.a;
            new StringBuilder((String.valueOf(str).length() + 60) + String.valueOf(str2).length()).append("moveMessagesFromClientGeneratedId: moving messages from ").append(str).append(" to ").append(str2);
        }
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("conversation_id", blx.a);
            List a = a(contentValues, "conversation_id=? AND status IN (?, ?, ?)", new String[]{blx2.a, Integer.toString(fwx.QUEUED.ordinal()), Integer.toString(fwx.FAILED_TO_SEND.ordinal()), Integer.toString(fwx.ON_SERVER.ordinal())});
            lo loVar = new lo();
            loVar.put(blx.a, a);
            a(loVar);
            int size = a.size();
            if (c) {
                new StringBuilder(58).append("moveMessagesFromClientGeneratedId updated ").append(size).append(" rows");
            }
            RealTimeChatService.f(this.f, blx2.a, blx.a);
            B(blx2.a);
            b();
            blf.d(this);
            return blx;
        } finally {
            c();
        }
    }

    public void k(String str) {
        if (c) {
            String str2 = "clearConversation: conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        if (this.e.a("conversations", "conversation_id=?", new String[]{str}) > 0) {
            blf.d(this);
        }
    }

    public void m() {
        int a = this.e.a("conversations", "is_pending_leave<0", null);
        if (c) {
            new StringBuilder(35).append("RemoveLeftConversations ").append(a);
        }
        if (a > 0) {
            blf.d(this);
        }
    }

    public long l(String str) {
        long a = a("getConversationSequenceNumber", str, "sequence_number", 1);
        if (a < 1) {
            return 1;
        }
        return a;
    }

    public void b(String str, long j) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 83).append("setConversationSequenceNumber: conversationId=").append(str).append(", sequenceNumber=").append(j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("sequence_number", Long.valueOf(j));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public long a(int i) {
        Throwable th;
        Cursor cursor;
        try {
            String str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3";
            switch (i) {
                case wi.l /*2*/:
                    str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=2";
                    break;
                case wi.z /*3*/:
                    str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=1 AND status=1 AND inviter_affinity=1";
                    break;
                case wi.h /*4*/:
                    str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=1 AND status=1 AND inviter_affinity=2";
                    break;
            }
            Cursor a = this.e.a("conversations", new String[]{"MIN(sort_timestamp)"}, str, null, null, null, null);
            try {
                if (a.moveToFirst()) {
                    long j = a.getLong(0);
                    if (j == 0) {
                        j = -1;
                    }
                    if (a == null) {
                        return j;
                    }
                    a.close();
                    return j;
                }
                if (a != null) {
                    a.close();
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void a(String str, long j, long j2, long j3) {
        long n = n(str);
        if (n == j) {
            if (c) {
                new StringBuilder(105).append("updateLatestMessageTimestamp. Local timestamp ").append(j).append(". Server timestamp ").append(j2);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("latest_message_timestamp", Long.valueOf(j2));
            if (j3 > 0) {
                contentValues.put("latest_message_expiration_timestamp", Long.valueOf(j3));
            } else {
                contentValues.putNull("latest_message_expiration_timestamp");
            }
            this.e.a("conversations", contentValues, "conversation_id=?", new String[]{String.valueOf(str)});
        } else if (c) {
            new StringBuilder(133).append("updateLatestMessageTimestamp skipped. Local timestamp for message ").append(j).append(". Latest message timestamp ").append(n);
        }
    }

    public boolean b(String str, String str2) {
        Throwable th;
        Cursor cursor;
        try {
            Cursor a = this.e.a("messages", bmm.a, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                if (a.moveToFirst() && fwy.values()[a.getInt(3)] == fwy.CONVERSATION_RENAME) {
                    boolean a2 = a(str, a.getLong(1), a.getLong(2), 5, edo.b(a.getString(4)), null, null, a.getLong(0), fwx.values()[a.getInt(5)], a.getString(6), null, -1, 0);
                    if (a == null) {
                        return a2;
                    }
                    a.close();
                    return a2;
                }
                if (a != null) {
                    a.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean a(String str, long j, long j2, int i, String str2, edo edo, String str3, String str4, long j3, int i2, int i3) {
        int i4 = i == 6 ? ba.b(str2) ? 3 : ba.d(str2) ? 15 : "hangouts/location".equals(str2) ? 13 : (ba.e(str2) || "application/vnd.wap.multipart.mixed".equals(str2)) ? 9 : "hangouts/gv_voicemail".equals(str2) ? 12 : 2 : i;
        return a(str, j, j2, i4, edo, str3, str4, j3, fwx.UNKNOWN, null, null, i2, i3);
    }

    public boolean a(String str, long j, long j2, int i, edo edo, long j3, fwx fwx, String str2, String str3) {
        return a(str, j, j2, i, edo, null, null, j3, fwx, str2, str3, -1, 0);
    }

    private boolean a(String str, long j, long j2, int i, edo edo, String str2, String str3, long j3, fwx fwx, String str4, String str5, int i2, int i3) {
        bma ah = ah(str);
        if (ah.a <= j) {
            String valueOf;
            if (str2 != null && str2.length() > HttpStatusCodes.STATUS_CODE_SERVER_ERROR) {
                str2 = str2.substring(0, HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
            }
            if (c) {
                valueOf = String.valueOf(edo);
                new StringBuilder((((String.valueOf(str).length() + 202) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("updateLatestEvent with conversationId=").append(str).append(" timestamp=").append(j).append(" expirationTimestamp").append(j2).append(" type=").append(i).append(" authorId=").append(valueOf).append(" text=").append(str2).append(" imageUrl=").append(str3).append(" smsType=").append(i2).append(" voicemailDuration=").append(i3);
            }
            valueOf = edo != null ? edo.b : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("latest_message_timestamp", Long.valueOf(j));
            if (!(i == 1 || i == 8 || i == 10 || i == 11 || j <= ah.g)) {
                contentValues.put("has_chat_notifications", Integer.valueOf(1));
            }
            if (j2 > 0) {
                contentValues.put("latest_message_expiration_timestamp", Long.valueOf(j2));
            } else {
                contentValues.putNull("latest_message_expiration_timestamp");
            }
            contentValues.put("snippet_type", Integer.valueOf(i));
            contentValues.put("snippet_message_row_id", Long.valueOf(j3));
            contentValues.put("snippet_status", Integer.valueOf(fwx.ordinal()));
            contentValues.put("snippet_sms_type", Integer.valueOf(i2));
            switch (i) {
                case wi.j /*1*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.l /*2*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_text", str2);
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.z /*3*/:
                case wi.dD /*13*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_image_url", str3);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.h /*4*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.put("snippet_participant_keys", str5);
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.p /*5*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_new_conversation_name", str4);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.q /*7*/:
                    contentValues.putNull("snippet_author_chat_id");
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.m /*8*/:
                case wi.dB /*11*/:
                    contentValues.put("previous_latest_timestamp", Long.valueOf(ah.a));
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_author_chat_id");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.n /*9*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_text", str2);
                    contentValues.put("snippet_image_url", str3);
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case wi.dM /*12*/:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_text", str2);
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.put("snippet_voicemail_duration", Integer.valueOf(i3));
                    break;
            }
            this.e.a("conversations", contentValues, "conversation_id=?", new String[]{String.valueOf(str)});
            blf.d(this);
            return true;
        }
        if (c) {
            new StringBuilder(120).append("updateLatestMessage skipped. currentLatestMessageTimestamp=").append(ah.a).append(" passed in timestamp=").append(j);
        }
        return false;
    }

    public void m(String str) {
        if (c) {
            String str2 = "expireLatestMessage. conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        long toMicros = TimeUnit.MILLISECONDS.toMicros(glj.a());
        a();
        try {
            bma ah = ah(str);
            if (ah.b <= 0 || ah.b > toMicros) {
                b();
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("latest_message_expiration_timestamp");
            contentValues.put("snippet_type", Integer.valueOf(7));
            contentValues.putNull("snippet_author_chat_id");
            contentValues.putNull("snippet_image_url");
            contentValues.putNull("snippet_text");
            contentValues.putNull("snippet_message_row_id");
            contentValues.putNull("snippet_status");
            contentValues.putNull("previous_latest_timestamp");
            contentValues.putNull("snippet_new_conversation_name");
            contentValues.putNull("snippet_participant_keys");
            contentValues.putNull("snippet_voicemail_duration");
            this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
            b();
            c();
        } finally {
            c();
        }
    }

    private static ContentValues b(fpg fpg) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fpg.s()));
        contentValues.put("notification_level", Integer.valueOf(fpg.r()));
        contentValues.put("conversation_type", Integer.valueOf(fpg.d()));
        if (fpg.B()) {
            contentValues.put("sort_timestamp", Long.valueOf(fpg.y()));
        }
        if (TextUtils.isEmpty(fpg.e())) {
            contentValues.putNull("name");
        } else {
            contentValues.put("name", fpg.e());
        }
        contentValues.put("metadata_present", Integer.valueOf(1));
        contentValues.put("is_draft", Integer.valueOf(0));
        contentValues.put("conversation_hash", fpg.z());
        contentValues.put("otr_status", Integer.valueOf(fpg.u()));
        contentValues.put("otr_toggle", Integer.valueOf(fpg.v()));
        contentValues.put("is_temporary", Boolean.valueOf(fpg.A()));
        contentValues.put("inviter_affinity", Integer.valueOf(fpg.p()));
        contentValues.put("is_guest", Boolean.valueOf(fpg.w()));
        contentValues.put("gls_status", Integer.valueOf(fpg.n()));
        if (fpg.t() == null || fpg.t().length <= 0) {
            contentValues.putNull("view");
        } else {
            contentValues.put("view", Integer.valueOf(fpg.t()[0]));
        }
        edo q = fpg.q();
        if (q != null) {
            contentValues.put("inviter_gaia_id", q.a);
            contentValues.put("inviter_chat_id", q.b);
        }
        return contentValues;
    }

    public void a(String str, int i, fpg fpg) {
        if (c) {
            String valueOf = String.valueOf(fpg.a());
            boolean z = !str.equals(fpg.a());
            String valueOf2 = String.valueOf(fpg.e());
            new StringBuilder(((String.valueOf(str).length() + 85) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("updateExistingConversation -- currentId: ").append(str).append(", conversationId: ").append(valueOf).append(", is_new_id: ").append(z).append(", name: ").append(valueOf2);
        }
        ContentValues b = blo.b(fpg);
        if (i == 2 && fpg.s() == 1) {
            b.put("status", Integer.valueOf(2));
        }
        if (fpg.n() > 0) {
            b.put("gls_status", Integer.valueOf(fpg.n()));
        }
        if (!str.equals(fpg.a())) {
            b.put("conversation_id", fpg.a());
            Long i2 = i(str, str);
            if (i2 != null) {
                f(gwb.a(i2));
            }
        }
        if (fpg.s() != 1) {
            b.put("disposition", Integer.valueOf(0));
        }
        a(str, fpg.a(), b);
    }

    public void a(String str, fhc fhc) {
        bls f = f(str);
        if (f != null) {
            if (f.h.isEmpty()) {
                glk.d("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("found zero invitees when re-creating Purged Convesration: ").append(str).append(", ignore.").toString(), new Object[0]);
                return;
            }
            String i = blo.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("disposition", Integer.valueOf(3));
            a();
            try {
                a(str, i, contentValues);
                contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(fwx.QUEUED.ordinal()));
                a(contentValues, "conversation_id=? AND status=?", new String[]{i, Integer.toString(fwx.SENDING.ordinal())});
                b();
                blf.d(this);
                RealTimeChatService.f(this.f, str, i);
                fhc.a(new eup(i, f.b, f.d, d(f.h), null));
            } finally {
                c();
            }
        }
    }

    private List<edk> d(List<edk> list) {
        List<edk> arrayList = new ArrayList();
        for (edk edk : list) {
            if (!TextUtils.isEmpty(edk.d)) {
                String str = "Babel";
                String str2 = "participant.circleId not empty. Value = ";
                String valueOf = String.valueOf(edk.d);
                glk.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                iil.a("participant.circleId not empty.");
            }
            if (!this.f.b().a(edk.b)) {
                arrayList.add(edk);
            }
        }
        iil.a(Integer.valueOf(list.size() - 1), Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void a(fpg fpg) {
        if (c) {
            String valueOf = String.valueOf(fpg.a());
            String valueOf2 = String.valueOf(fpg.e());
            new StringBuilder((String.valueOf(valueOf).length() + 49) + String.valueOf(valueOf2).length()).append("insertNewConversation -- conversationId: ").append(valueOf).append(", name: ").append(valueOf2);
        }
        ContentValues b = blo.b(fpg);
        if (!fpg.B()) {
            b.put("sort_timestamp", Long.valueOf(fpg.x()));
        }
        b.put("is_pending_leave", Integer.valueOf(0));
        b.put("conversation_id", fpg.a());
        this.e.a("conversations", null, b);
    }

    public long n(String str) {
        return a("getLatestMessageTimestamp", str, "latest_message_timestamp", 0);
    }

    private bma ah(String str) {
        Throwable th;
        if (c) {
            String str2 = "getLatestMessageInfo, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        bma bma = new bma();
        Cursor a;
        try {
            a = this.e.a("conversations", s, "conversation_id=?", new String[]{String.valueOf(str)}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    bma.a = a.getLong(0);
                    bma.b = a.getLong(1);
                    bma.c = a.getInt(2);
                    bma.e = a.getString(3);
                    bma.d = a.getString(4);
                    bma.f = a.getString(5);
                    bma.g = a.getLong(6);
                    bma.h = a.getLong(7);
                }
                if (a != null) {
                    a.close();
                }
                return bma;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void b(String str, String str2, String str3, String str4) {
        if (c) {
            new StringBuilder((String.valueOf(str).length() + 66) + String.valueOf(str2).length()).append("updateConversationParticipantInfo, conversationId=").append(str).append(", generatedName=").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("generated_name", str2);
        contentValues.put("packed_avatar_urls", str3);
        contentValues.put("self_avatar_url", str4);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public List<fbt> n() {
        Throwable th;
        List<fbt> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("participants_view", t, null, null, null, null, null);
            while (a.moveToNext()) {
                try {
                    fbt fbt;
                    String string = a.getString(0);
                    Object string2 = a.getString(1);
                    CharSequence string3 = a.getString(2);
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                        glk.e("Babel_ConvHelper", "RefreshParticipantsPeriodicTask: found a participant with no valid id", new Object[0]);
                        fbt = null;
                    } else if (!TextUtils.isEmpty(string)) {
                        fbt = fbt.a(string);
                    } else if (TextUtils.isEmpty(string2)) {
                        glk.a("Babel_ConvHelper", "RefreshParticipantsPeriodicTask: skip circle", new Object[0]);
                    } else {
                        fbt = gwb.b(new edo(string, string2));
                    }
                    if (fbt == null || !fbt.a()) {
                        glk.e("Babel_ConvHelper", "RefreshParticipantsPeriodicTask: participant has no gaia id", new Object[0]);
                    } else {
                        arrayList.add(fbt);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public String o(String str) {
        Cursor a;
        Throwable th;
        String str2 = null;
        if (c) {
            String str3 = "getConversationName, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        try {
            a = this.e.a("conversations", new String[]{"name", "generated_name"}, "conversation_id=?", new String[]{str}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    str2 = a.getString(0);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = a.getString(1);
                    }
                }
                if (a != null) {
                    a.close();
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void c(String str, String str2) {
        if (c) {
            new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(str2).length()).append("updateConversationName, conversationId=").append(str).append(", name=").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str2);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public int p(String str) {
        return a("getGroupLinkSharingStatus", str, "gls_status", 3);
    }

    public void a(String str, int i) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 65).append("updateGroupLinkSharingStatus, conversationId=").append(str).append(", status=").append(i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gls_status", Integer.valueOf(i));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        ayo bow = new bow(str, h(), box.GROUP_LINK_SHARING_STATUS);
        ((gid) jyn.a(f(), gid.class)).a(bow, bow.a());
    }

    public String q(String str) {
        return a("getGroupConversationUrl", str, "gls_link");
    }

    public void d(String str, String str2) {
        if (c) {
            new StringBuilder((String.valueOf(str).length() + 61) + String.valueOf(str2).length()).append("updateGroupConversationUrl, conversationId=").append(str).append(", conversationUrl=").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gls_link", str2);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.a(g());
        ayo bow = new bow(str, h(), box.GROUP_CONVERSATION_LINK);
        ((gid) jyn.a(f(), gid.class)).a(bow, bow.a());
    }

    public void e(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_ringtone_uri", str2);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public void f(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("hangout_ringtone_uri", str2);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public boolean r(String str) {
        return a("getConversationHasMetadata", str, "metadata_present", 0) == 1;
    }

    public void b(String str, int i) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 78).append("setConversationNotificationLevel, conversationId=").append(str).append("notificationLevel=").append(i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_level", Integer.valueOf(i));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.d(this);
    }

    public int s(String str) {
        return a("getConversationType", str, "conversation_type", 0);
    }

    public void a(String str, boolean z) {
        if (c) {
            String str2 = "setConversationHidden, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        l(str, -2147483648L);
    }

    public void c(String str, int i) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 65).append("setConversationPendingAccept, conversationId=").append(str).append(", status=2");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(2));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public void a(List<fpq> list) {
        this.e.a();
        try {
            for (fpq fpq : list) {
                if (c) {
                    String str = fpq.a;
                    String str2 = fpq.b;
                    new StringBuilder((String.valueOf(str).length() + 73) + String.valueOf(str2).length()).append("markEventObserved, conversationId=").append(str).append(", messageId=").append(str2).append(" observedStatus=").append(fpq.c);
                }
                a(fpq.a, fpq.b, fpq.c);
            }
            this.e.b();
        } finally {
            this.e.c();
        }
    }

    public void a(String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", str2);
        contentValues.put("conversation_id", str);
        contentValues.put("observed_status", Integer.valueOf(i));
        if (a(contentValues, "message_id=? AND conversation_id=?", new String[]{str2, str}).isEmpty()) {
            b(contentValues);
        }
    }

    public int t(String str) {
        return a("getConversationStatus", str, "status", 0);
    }

    private void a(String str, String str2, long j, long j2, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2).append(" conversationid: ").append(str);
        stringBuilder.append(" old ").append(str3).append(": ").append(Long.toString(j));
        stringBuilder.append(" new ").append(str3).append(": ").append(Long.toString(j2));
        gwb.a(this.f.g(), 2697, stringBuilder.toString(), true);
    }

    public void a(String str, long j, boolean z, String str2) {
        Throwable th;
        Cursor cursor;
        long j2 = 0;
        long j3 = 0;
        try {
            Cursor a = this.e.a("conversations", new String[]{"self_watermark", "chat_watermark", "hangout_watermark", "has_chat_notifications", "has_video_notifications", "latest_message_timestamp"}, "conversation_id=?", new String[]{str}, null, null, null);
            try {
                long j4;
                int i;
                long j5;
                int i2;
                long j6;
                long j7;
                long j8;
                long j9;
                if (a.moveToFirst()) {
                    int i3;
                    if (!a.isNull(0)) {
                        j2 = a.getLong(0);
                    }
                    if (!a.isNull(1)) {
                        j3 = a.getLong(1);
                    }
                    if (a.isNull(2)) {
                        j4 = 0;
                    } else {
                        j4 = a.getLong(2);
                    }
                    if (a.isNull(3)) {
                        i3 = 0;
                    } else {
                        i3 = a.getInt(3);
                    }
                    if (a.isNull(4)) {
                        i = 0;
                    } else {
                        i = a.getInt(4);
                    }
                    if (a.isNull(5)) {
                        j5 = 0;
                        i2 = i3;
                        j6 = j4;
                        j4 = j3;
                        j7 = j2;
                    } else {
                        j5 = (long) a.getInt(5);
                        i2 = i3;
                        j6 = j4;
                        j7 = j2;
                        j4 = j3;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                    j6 = 0;
                    j4 = 0;
                    j7 = 0;
                    j5 = 0;
                }
                if (a != null) {
                    a.close();
                }
                if (c) {
                    new StringBuilder(String.valueOf(str).length() + 337).append("setSelfWatermarkTimestamp, conversationId: ").append(str).append(", watermarkTimestamp: ").append(j).append(", currentSelfWatermark: ").append(j7).append(", currentChatWatermark: ").append(j4).append(", currentHangoutWatermark: ").append(j6).append(", hasChatNotifications: ").append(i2).append(", hasVideoNotifications: ").append(i).append(", latestMessageTimestamp: ").append(j5);
                }
                if (j7 == 4611686018427387903L) {
                    j7 = 0;
                }
                if (j4 == 4611686018427387903L) {
                    j8 = 0;
                } else {
                    j8 = j4;
                }
                if (j6 == 4611686018427387903L) {
                    j9 = 0;
                } else {
                    j9 = j6;
                }
                int g = this.f.g();
                if (j > j7 || j > j8 || j > j9) {
                    ContentValues contentValues = new ContentValues();
                    boolean b = fdq.v.b(g);
                    if (j > j7) {
                        contentValues.put("self_watermark", Long.valueOf(j));
                        if (b) {
                            a(str, str2, j7, j, "selfwatermark");
                        }
                    }
                    int i4 = 0;
                    if (j > j8) {
                        contentValues.put("chat_watermark", Long.valueOf(j));
                        if (b) {
                            a(str, str2, j8, j, "seenchatwatermark");
                        }
                        if (j5 > j) {
                            i4 = 1;
                            if (b) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(str2).append(" conversationid: ").append(str);
                                stringBuilder.append("hasChatNotifications=1 latestMessageTs: ").append(Long.toString(j5));
                                stringBuilder.append(" watermarkTs: ").append(Long.toString(j));
                                gwb.a(g, 2697, stringBuilder.toString(), true);
                            }
                        }
                    }
                    contentValues.put("has_chat_notifications", Integer.valueOf(i4));
                    i4 = 0;
                    if (j > j9) {
                        contentValues.put("hangout_watermark", Long.valueOf(j));
                        if (j5 > j) {
                            i4 = 1;
                        }
                    }
                    contentValues.put("has_video_notifications", Integer.valueOf(i4));
                    ContentValues contentValues2 = contentValues;
                    this.e.a("conversations", contentValues2, "conversation_id=?", new String[]{str});
                    if (!z) {
                        glk.a("Babel", "Deleted " + a("delete_after_read_timetamp<?", new String[]{String.valueOf(j)}) + " messages whose deleteAfterRead timestamp is too old. Watermark: " + j, new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public long u(String str) {
        return a("getSelfWatermarkTimestamp", str, "self_watermark", -1);
    }

    public long v(String str) {
        return a("getSeenChatMessageWatermarkTimestamp", str, "chat_watermark", -1);
    }

    public int w(String str) {
        return TextUtils.isEmpty(str) ? this.e.a("UPDATE conversations SET chat_watermark=sort_timestamp, has_chat_notifications=0 WHERE sort_timestamp>chat_watermark", null) : this.e.a("UPDATE conversations SET chat_watermark=sort_timestamp, has_chat_notifications=0 WHERE sort_timestamp>chat_watermark AND conversation_id=?", str);
    }

    public int x(String str) {
        return TextUtils.isEmpty(str) ? this.e.a("UPDATE conversations SET hangout_watermark=sort_timestamp, has_video_notifications=0 WHERE sort_timestamp>hangout_watermark", null) : this.e.a("UPDATE conversations SET hangout_watermark=sort_timestamp, has_video_notifications=0 WHERE sort_timestamp>hangout_watermark AND conversation_id=?", str);
    }

    private int ai(String str) {
        return a("getCallMediaType", str, "call_media_type", 0);
    }

    private long aj(String str) {
        return a("getLastHangoutEventTime", str, "last_hangout_event_time", -1);
    }

    public long y(String str) {
        return a("getLastOtrModificationTime", str, "last_otr_modification_time", -1);
    }

    private boolean b(int i, long j, String str) {
        int i2;
        int i3;
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 119).append("updateConversationCallMediaType, conversationId ").append(str).append(", callMediaType=").append(i).append(", hangoutEventTimestamp=").append(j);
        }
        int ai = ai(str);
        long aj = aj(str);
        if (i == -1) {
            if (ai == 0) {
                i = 1;
            } else {
                i = ai;
            }
        }
        if (ai != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (j < aj) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("call_media_type", Integer.valueOf(i));
        if (j > ah(str).h) {
            contentValues.put("has_video_notifications", Integer.valueOf(1));
        }
        if (i2 != i3) {
            contentValues.put("last_hangout_event_time", Long.valueOf(j));
        }
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        iid a = ((iih) jyn.a(this.a, iih.class)).a(this.g);
        switch (i) {
            case -1:
                a.b().c(2922);
                break;
            case wi.w /*0*/:
                break;
            case wi.j /*1*/:
                a.b().c(2920);
                break;
            case wi.l /*2*/:
                a.b().c(2921);
                break;
            default:
                glk.d("Babel_ConvHelper", "Unknown callMediaType.", new Object[0]);
                break;
        }
        if (ai == 0 && i != 0) {
            a.b().c(2940);
        } else if (ai != 0 && i == 0) {
            a.b().c(2941);
        }
        return true;
    }

    public void a(int i, long j, String str) {
        String str2 = "updateConversationCallMediaTypeAndNotify";
        String b = d.b(str2);
        a();
        try {
            str2 = b(i, j, str);
            b();
            if (str2 != null) {
                blf.a(this.f);
            }
            d.c(b);
        } finally {
            c();
        }
    }

    public void a(int i, int i2, long j, String str) {
        if (c) {
            glk.b("Babel_ConvHelper", new StringBuilder(String.valueOf(str).length() + 127).append("updateConversationOtrStatus, conversationId=").append(str).append(", otrStatus=").append(i).append(", otrToggle=").append(i2).append(", eventTimestamp=").append(j).toString(), new Object[0]);
        }
        long y = y(str);
        if (j >= y) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("otr_status", Integer.valueOf(i));
            contentValues.put("otr_toggle", Integer.valueOf(i2));
            contentValues.put("last_otr_modification_time", Long.valueOf(j));
            if (this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str}) > 0) {
                blf.d(this);
            } else {
                glk.e("Babel_ConvHelper", "updateConversationOtrState: failed to update database", new Object[0]);
            }
        } else if (c) {
            glk.b("Babel_ConvHelper", "dropping OTR update: " + j + " < " + y, new Object[0]);
        }
    }

    public void a(String str, Boolean bool) {
        if (c) {
            String valueOf = String.valueOf(bool);
            new StringBuilder((String.valueOf(str).length() + 76) + String.valueOf(valueOf).length()).append("updateConversationHasPersistentEvents, conversationId ").append(str).append(", hasPersistentEvents=").append(valueOf);
        }
        ContentValues contentValues = new ContentValues();
        String str2 = "has_persistent_events";
        int i = bool == null ? -1 : gwb.b(bool) ? 1 : 0;
        contentValues.put(str2, Integer.valueOf(i));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public String a(List<edk> list, int i) {
        Cursor c = c((List) list, i);
        if (c != null) {
            try {
                if (c.moveToFirst()) {
                    String string = c.getString(0);
                    if (c) {
                        String str = "queryGroupPhoneConversation found conversation ";
                        String valueOf = String.valueOf(string);
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                    }
                    if (c == null) {
                        return string;
                    }
                    c.close();
                    return string;
                }
            } catch (Throwable th) {
                if (c != null) {
                    c.close();
                }
            }
        }
        if (c != null) {
            c.close();
        }
        return null;
    }

    private Cursor c(List<edk> list, int i) {
        int size = list.size() + 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[size];
        int i2 = 0;
        int size2 = list.size() - 1;
        while (size2 >= -1) {
            edo b;
            if (size2 == -1) {
                b = this.f.b();
                CharSequence charSequence = null;
            } else {
                edk edk = (edk) list.get(size2);
                b = edk.b;
                Object f = edk.f();
            }
            if (i2 > 0) {
                stringBuilder.append(" OR ");
            }
            if (b != null && !TextUtils.isEmpty(b.b)) {
                stringBuilder.append("chat_id=?");
                size = i2 + 1;
                strArr[i2] = b.b;
            } else if (b == null || TextUtils.isEmpty(charSequence)) {
                size = i2;
            } else {
                stringBuilder.append("phone_id=?");
                size = i2 + 1;
                strArr[i2] = charSequence;
            }
            size2--;
            i2 = size;
        }
        return a(stringBuilder.toString(), strArr, i);
    }

    private Cursor a(String str, String[] strArr, int i) {
        String valueOf = String.valueOf("SELECT conversation_id FROM conversation_participants_view WHERE active=1 GROUP BY conversation_id HAVING SUM(CASE WHEN ");
        int length = strArr.length;
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 60) + String.valueOf(str).length()).append(valueOf).append(str).append(" THEN 1 ELSE 0 END) = ").append(length).append(" AND count(*) = ").append(strArr.length).toString();
        if (i == 2 || i == 3) {
            String valueOf2 = String.valueOf("SELECT conversation_id FROM conversations WHERE conversation_id IN (");
            String valueOf3 = String.valueOf("transport_type");
            String valueOf4 = String.valueOf(String.valueOf(i));
            valueOf = new StringBuilder((((String.valueOf(valueOf2).length() + 9) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf2).append(valueOf).append(") AND ").append(valueOf3).append(" = ").append(valueOf4).toString();
        }
        Cursor a = this.e.a(valueOf, strArr);
        if (c) {
            int length2 = strArr.length;
            valueOf4 = String.valueOf(strArr[0]);
            new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf4).length()).append("queryMultiple ").append(length2).append("; selection ").append(valueOf).append(valueOf4).append(" ==> ").append(a.getCount());
        }
        return a;
    }

    public String b(List<edk> list) {
        Cursor e = e((List) list);
        if (e != null) {
            try {
                if (e.moveToFirst()) {
                    String string = e.getString(0);
                    if (c) {
                        String str = "queryGroupConversationByGaia found conversation ";
                        String valueOf = String.valueOf(string);
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                    }
                    if (e == null) {
                        return string;
                    }
                    e.close();
                    return string;
                }
            } catch (Throwable th) {
                if (e != null) {
                    e.close();
                }
            }
        }
        if (e != null) {
            e.close();
        }
        return null;
    }

    private Cursor e(List<edk> list) {
        int size = list.size() + 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[size];
        int i = 0;
        int size2 = list.size() - 1;
        while (size2 >= -1) {
            edo b;
            if (size2 == -1) {
                b = this.f.b();
            } else {
                b = ((edk) list.get(size2)).b;
            }
            if (i > 0) {
                stringBuilder.append(" OR ");
            }
            if (b == null || TextUtils.isEmpty(b.a)) {
                size = i;
            } else {
                stringBuilder.append("gaia_id=?");
                size = i + 1;
                strArr[i] = b.a;
            }
            size2--;
            i = size;
        }
        return a(stringBuilder.toString(), strArr, 1);
    }

    public bmh a(edo edo, boolean z, int i) {
        Throwable th;
        bmh bmh = null;
        if (c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("queryOneToOneConversation, participantId ").append(valueOf);
        }
        if (edo != null) {
            p(edo.a, edo.b);
        }
        Cursor a;
        try {
            String valueOf2;
            StringBuilder append = new StringBuilder("select conversations").append(".conversation_id").append(", sort_timestamp").append(", view").append(", transport_type").append(", (select merge_key FROM merge_keys WHERE merge_keys.conversation_id=conversations.conversation_id) as merge_key ").append(" FROM conversations").append(",conversation_participants_view").append(" WHERE conversation_participants_view").append(".conversation_id").append("=conversations").append(".conversation_id");
            String[] strArr = new String[3];
            append.append(" AND conversation_type").append("=?");
            strArr[0] = "1";
            append.append(" AND transport_type").append("=?");
            strArr[1] = String.valueOf(i);
            append.append(" AND ");
            if (edo == null || TextUtils.isEmpty(edo.a)) {
                if (edo != null) {
                    if (!TextUtils.isEmpty(edo.b)) {
                        append.append("chat_id=?");
                        strArr[2] = edo.b;
                    }
                }
                valueOf2 = String.valueOf(edo);
                glk.e("Babel_ConvHelper", new StringBuilder(String.valueOf(valueOf2).length() + 23).append("participantId is empty:").append(valueOf2).toString(), new Object[0]);
                iil.a("participantId is empty");
                return bmh;
            }
            append.append("gaia_id=?");
            strArr[2] = edo.a;
            if (z) {
                append.append(" AND is_temporary").append(" = 1");
            }
            a = this.e.a(append.toString(), strArr);
            try {
                if (a.moveToFirst()) {
                    bmh = new bmh();
                    do {
                        valueOf2 = a.getString(0);
                        if (TextUtils.isEmpty(bmh.a) || (bmh.a.startsWith("client_generated:") && !valueOf2.startsWith("client_generated:"))) {
                            bmh.a = valueOf2;
                            bmh.c = a.getLong(1);
                            bmh.d = a.getInt(2);
                            bmh.e = a.getInt(3);
                            bmh.b = a.getString(4);
                        }
                    } while (a.moveToNext());
                    if (a != null) {
                        a.close();
                    }
                } else if (a != null) {
                    a.close();
                }
                return bmh;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            a = null;
            th = th4;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public bme b(long j) {
        if (c) {
            new StringBuilder(49).append("getMessageInfo, messageRowId=").append(j);
        }
        List o = o("_id", String.valueOf(j));
        if (o.size() == 0) {
            return null;
        }
        return (bme) o.get(0);
    }

    public bme g(String str, String str2) {
        Cursor a;
        Throwable th;
        bme bme = null;
        try {
            a = this.e.a("messages_view", u, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    bme = d(a);
                }
                if (a != null) {
                    a.close();
                }
                return bme;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private List<bme> o(String str, String str2) {
        Cursor a;
        Throwable th;
        List arrayList = new ArrayList();
        try {
            a = this.e.a("messages_view", u, String.valueOf(str).concat("=? "), new String[]{str2}, null, null, null);
            while (a.moveToNext()) {
                try {
                    arrayList.add(d(a));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private bme d(Cursor cursor) {
        fwy fwy = fwy.values()[cursor.getInt(5)];
        fwx fwx = fwx.values()[cursor.getInt(4)];
        String string = cursor.getString(3);
        switch (blq.a[fwy.ordinal()]) {
            case wi.j /*1*/:
            case wi.l /*2*/:
                break;
            default:
                string = gwb.a(fwy, this.f, fwx, null, cursor.getString(2), cursor.getString(26), cursor.getString(27), cursor.getInt(33), true);
                break;
        }
        return new bme(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), string, fwx, fwy, cursor.getLong(6), cursor.getLong(7), cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11), cursor.getString(12), cursor.getString(13), cursor.getString(14), cursor.getDouble(15), cursor.getDouble(16), cursor.getString(17), cursor.getString(18), cursor.getInt(19), cursor.getString(20), cursor.getInt(21), cursor.getInt(22), cursor.getInt(23), cursor.getString(24), cursor.getInt(25), cursor.getString(26), cursor.getString(27), cursor.getString(28), cursor.getInt(29), cursor.getString(32), cursor.getString(31), cursor.getString(30), cursor.getLong(34), cursor.getInt(35), cursor.getInt(36), cursor.getBlob(37));
    }

    public void a(ezj ezj) {
        String str;
        String valueOf;
        String str2;
        Cursor cursor = null;
        if (c) {
            str = "finalizeMessageFromResponse, conversationId ";
            valueOf = String.valueOf(ezj.k());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        String k = ezj.k();
        fwx n = n(k, ezj.l());
        if (n != null && n == fwx.PENDING_DELETE) {
            C();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", ezj.m());
        contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
        contentValues.put("type", Integer.valueOf(fwy.OUTGOING_USER_MESSAGE.ordinal()));
        contentValues.put("timestamp", Long.valueOf(ezj.d));
        boolean z = ezj.c.b == 6;
        if (z) {
            contentValues.put("off_the_record", Boolean.valueOf(true));
        }
        valueOf = "persisted";
        if (z) {
            z = false;
        } else {
            z = true;
        }
        contentValues.put(valueOf, Boolean.valueOf(z));
        if (ezj.n() > 0) {
            contentValues.put("expiration_timestamp", Long.valueOf(ezj.n()));
        } else {
            contentValues.putNull("expiration_timestamp");
        }
        if (ezj.o().length > 0) {
            str = ezj.o()[0];
            contentValues.put("image_id", str);
        } else {
            Object obj = cursor;
        }
        if (ezj.p().length > 0) {
            contentValues.put("album_id", ezj.p()[0]);
        }
        if (ezj.r().length > 0) {
            contentValues.put("stream_id", ezj.r()[0]);
        }
        String[] strArr = new String[]{String.valueOf(ezj.l()), k};
        if (ezj.o().length > 0) {
            eyi eyi;
            valueOf = ezj.q()[0];
            if (str != null) {
                eyi ae = ae(str);
                if (ae != null) {
                    an(str);
                    if (ae.c != null) {
                        valueOf = "file://";
                        str = String.valueOf(ae.c);
                        str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
                        valueOf = str;
                    } else {
                        String str3 = "sticker://";
                        str = String.valueOf(str);
                        str = str.length() != 0 ? str3.concat(str) : new String(str3);
                    }
                    contentValues.put("local_url", str);
                    eyi = ae;
                    str2 = valueOf;
                } else {
                    eyi = ae;
                    str2 = valueOf;
                }
            } else {
                obj = cursor;
                str2 = valueOf;
            }
            contentValues.put("remote_url", str2);
            if (eyi == null && !ezj.s()) {
                try {
                    cursor = this.e.a("messages", v, "message_id=? AND conversation_id=?", strArr, null, null, null);
                    if (cursor.moveToFirst()) {
                        obj = cursor.getString(0);
                        if (!TextUtils.isEmpty(obj)) {
                            Uri parse = Uri.parse(obj);
                            if (TextUtils.equals(parse.getAuthority(), EsProvider.a)) {
                                this.a.getContentResolver().delete(parse, null, null);
                            }
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } else {
            Object obj2 = cursor;
        }
        if (c) {
            str = String.valueOf(String.valueOf(ezj.l()));
            new StringBuilder((String.valueOf(k).length() + 30) + String.valueOf(str).length()).append("finalizeMessageFromResponse: ").append(k).append(" ").append(str);
        }
        if (a(contentValues, "message_id=? AND conversation_id=?", strArr).isEmpty()) {
            strArr[0] = String.valueOf(ezj.m());
            if (a(contentValues, "message_id=? AND conversation_id=?", strArr).isEmpty()) {
                valueOf = String.valueOf(ezj.l());
                String valueOf2 = String.valueOf(ezj.m());
                glk.e("Babel_ConvHelper", new StringBuilder((String.valueOf(valueOf).length() + 68) + String.valueOf(valueOf2).length()).append("Failed to update the given message with client id: ").append(valueOf).append(" and message id: ").append(valueOf2).toString(), new Object[0]);
                iil.a("Failed to update the given message with client id");
            }
        }
        if (str2 != null) {
            contentValues.clear();
            contentValues.put("snippet_image_url", str2);
            int a = this.e.a("conversations", contentValues, "conversation_id=?", new String[]{k});
            if (a != 1) {
                glk.e("Babel", new StringBuilder(String.valueOf(k).length() + 84).append("couldn't update remote url for conversation; got count ").append(a).append(" for conversation ").append(k).toString(), new Object[0]);
                iil.a("couldn't update remote url for conversation");
            }
        }
    }

    public void a(String str, String str2, Uri uri, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
        contentValues.put("type", Integer.valueOf(fwy.OUTGOING_USER_MESSAGE.ordinal()));
        if (uri != null) {
            contentValues.put("external_ids", gwb.a(uri.toString()));
        }
        if (j > 0) {
            contentValues.put("sms_message_size", Long.valueOf(j));
        }
        a(contentValues, "message_id=? AND conversation_id=?", new String[]{String.valueOf(str2), str});
    }

    public long a(bmf bmf) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", bmf.a);
        contentValues.put("message_id", bmf.b);
        contentValues.put("url", bmf.c);
        contentValues.put("content_type", bmf.d);
        contentValues.put("width", Integer.valueOf(bmf.e));
        contentValues.put("height", Integer.valueOf(bmf.f));
        return this.e.a("multipart_attachments", null, contentValues);
    }

    public long a(blw blw) {
        int i = blw.f;
        glk.a("Babel", "Creating suggestion type: " + i + " timestamp: " + blw.d, new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", blw.a);
        contentValues.put("event_id", blw.b);
        contentValues.put("suggestion_id", blw.c);
        contentValues.put("timestamp", Long.valueOf(blw.d));
        contentValues.put("expiration_time_usec", Long.valueOf(blw.e));
        contentValues.put("type", Integer.valueOf(blw.f));
        contentValues.put("gem_asset_url", blw.g);
        contentValues.put("gem_horizontal_alignment", Integer.valueOf(blw.h));
        contentValues.put("matched_message_substring", blw.i);
        long a = this.e.a("event_suggestions", null, contentValues);
        if (a > -1) {
            blf.e(this, blw.a);
        }
        return a;
    }

    public long a(bmd bmd) {
        int i = 1;
        if (c) {
            String str = bmd.c;
            String valueOf = String.valueOf(bmd.f);
            String str2 = bmd.a;
            new StringBuilder(((String.valueOf(str).length() + 68) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append("createMessage, conversationId ").append(str).append(", senderId=").append(valueOf).append(", messageClientGeneratedId=").append(str2);
        }
        Long i2 = i(bmd.c, bmd.a);
        int i3 = i2 != null ? 1 : 0;
        Long h = h(bmd.c, bmd.a);
        int i4;
        if (h == null || gwb.a(h) <= 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (i3 == 0 || r3 == 0) {
            String str3;
            ContentValues c;
            Long b;
            valueOf = bmd.c;
            if (!af(valueOf)) {
                String str4;
                String str5;
                if (valueOf.startsWith("client_generated:")) {
                    valueOf = RealTimeChatService.a(valueOf);
                    if (valueOf == null || !af(valueOf)) {
                        str4 = bmd.c;
                        str5 = bmd.a;
                        glk.e("Babel_ConvHelper", new StringBuilder((String.valueOf(str4).length() + 70) + String.valueOf(str5).length()).append("Messaging: skip message because conversation doesn't exist:").append(str4).append(" messageId:").append(str5).toString(), new Object[0]);
                        iil.a("Messaging: skip message because conversation doesn't exist isClientGeneratedId=true");
                    } else if (c) {
                        str3 = bmd.c;
                        new StringBuilder((String.valueOf(str3).length() + 43) + String.valueOf(valueOf).length()).append("Messaging: conversationId changed from ").append(str3).append(" to ").append(valueOf);
                    }
                } else {
                    str4 = bmd.c;
                    str5 = bmd.a;
                    glk.e("Babel_ConvHelper", new StringBuilder((String.valueOf(str4).length() + 70) + String.valueOf(str5).length()).append("Messaging: skip message because conversation doesn't exist:").append(str4).append(" messageId:").append(str5).toString(), new Object[0]);
                    iil.a("Messaging: skip message because conversation doesn't exist isClientGeneratedId=false");
                }
                if (i != 0) {
                    return -1;
                }
                c = c(bmd);
                b = b(bmd);
                if (b != null) {
                    a(c, b, bmd.c);
                    return gwb.a(b);
                } else if (i3 != 0) {
                    return b(c);
                } else {
                    a(c, i2, bmd.c);
                    return gwb.a(i2);
                }
            }
            if (c && bmd.b != null) {
                str3 = "Messaging: saving message:";
                valueOf = String.valueOf(bmd.a);
                if (valueOf.length() != 0) {
                    str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
            }
            i = 0;
            if (i != 0) {
                return -1;
            }
            c = c(bmd);
            b = b(bmd);
            if (b != null) {
                a(c, b, bmd.c);
                return gwb.a(b);
            } else if (i3 != 0) {
                return b(c);
            } else {
                a(c, i2, bmd.c);
                return gwb.a(i2);
            }
        }
        if (bmd.y) {
            long a = gwb.a(i2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("init_timestamp", Long.valueOf(bmd.W));
            contentValues.put("in_app_msg_latency", Long.valueOf(bmd.X));
            this.e.a("messages", contentValues, "_id=? AND init_timestamp=?", new String[]{String.valueOf(a), "0"});
        }
        return a(bmd, i2);
    }

    private long a(bmd bmd, Long l) {
        if (c) {
            String str = bmd.a;
            String str2 = bmd.c;
            new StringBuilder((String.valueOf(str).length() + 124) + String.valueOf(str2).length()).append("createMessage called for a message already in the database. message id: ").append(str).append(" conversationId: ").append(str2).append(" new notification level ").append(bmd.z);
        }
        if (bmd.z > 10) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_level", Integer.valueOf(bmd.z));
            if (bmd.U == 1) {
                contentValues.put("observed_status", Integer.valueOf(bmd.U));
            }
            a(contentValues, l, bmd.c);
        }
        return gwb.a(l);
    }

    private Long b(bmd bmd) {
        if (bmd.b == null) {
            return null;
        }
        Long i = i(bmd.c, bmd.b);
        if (i != null) {
            if (c || glk.a("Babel", 3)) {
                String str = bmd.c;
                String str2 = bmd.a;
                glk.b("Babel", new StringBuilder((String.valueOf(str).length() + 75) + String.valueOf(str2).length()).append("createMessage found clientGeneratedId ").append(str).append(", messageId ").append(str2).append(" -- fixing up the message").toString(), new Object[0]);
            }
            Long h = h(bmd.c, bmd.b);
            if (h != null) {
                a(bmd.c, bmd.i, gwb.a(h));
            }
            fwx o = o(gwb.a(i));
            if (o != null && o == fwx.PENDING_DELETE) {
                C();
            }
        }
        return i;
    }

    private ContentValues c(bmd bmd) {
        int ordinal;
        String str = bmd.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", bmd.a);
        contentValues.put("conversation_id", str);
        if (bmd.f != null) {
            contentValues.put("author_chat_id", bmd.f.b);
            contentValues.put("author_gaia_id", bmd.f.a);
        }
        contentValues.put("text", bmd.g);
        contentValues.put("status", Integer.valueOf(bmd.h));
        contentValues.put("notification_level", Integer.valueOf(bmd.z));
        String str2 = "type";
        if (bmd.y) {
            ordinal = fwy.OUTGOING_USER_MESSAGE.ordinal();
        } else {
            ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        }
        contentValues.put(str2, Integer.valueOf(ordinal));
        contentValues.put("transport_type", Integer.valueOf(bmd.d));
        contentValues.put("transport_phone", bmd.e);
        contentValues.put("timestamp", Long.valueOf(bmd.i));
        contentValues.put("width_pixels", Integer.valueOf(bmd.C));
        contentValues.put("height_pixels", Integer.valueOf(bmd.D));
        contentValues.put("image_id", bmd.j);
        contentValues.put("album_id", bmd.l);
        contentValues.put("image_rotation", Integer.valueOf(bmd.m));
        contentValues.put("attachment_uploading_progress", Integer.valueOf(bmd.x));
        if (!TextUtils.isEmpty(bmd.j)) {
            eyi ae = ae(bmd.j);
            String str3;
            if (ae != null) {
                if (ae.c != null) {
                    str2 = "local_url";
                    str3 = "file://";
                    str = String.valueOf(ae.c);
                    if (str.length() != 0) {
                        str = str3.concat(str);
                    } else {
                        str = new String(str3);
                    }
                    contentValues.put(str2, str);
                } else {
                    str2 = "local_url";
                    str3 = "sticker://";
                    str = String.valueOf(bmd.j);
                    contentValues.put(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
                }
            } else if (!TextUtils.isEmpty(bmd.k) && bmd.k.equals(gwb.b(this.a, "babel_stickers_account_id", "108618507921641169817"))) {
                str2 = "local_url";
                str3 = "sticker://";
                str = String.valueOf(bmd.j);
                contentValues.put(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
            }
        }
        if (bmd.n != null) {
            if (bmd.n.startsWith("content://")) {
                contentValues.put("local_url", bmd.n);
            } else {
                contentValues.put("remote_url", bmd.n);
            }
        }
        contentValues.put("attachment_name", bmd.o);
        contentValues.put("attachment_description", bmd.p);
        contentValues.put("attachment_target_url", bmd.t);
        contentValues.put("attachment_target_url_name", bmd.u);
        contentValues.put("attachment_target_url_description", bmd.v);
        contentValues.put("attachment_blob_data", bmd.w);
        contentValues.put("attachment_content_type", bmd.E);
        contentValues.put("latitude", Double.valueOf(bmd.q));
        contentValues.put("longitude", Double.valueOf(bmd.r));
        contentValues.put("address", bmd.s);
        if (bmd.A > 0) {
            contentValues.put("expiration_timestamp", Long.valueOf(bmd.A));
        }
        contentValues.put("off_the_record", Boolean.valueOf(bmd.B));
        if (bmd.F != null) {
            contentValues.put("external_ids", bmd.F);
        }
        contentValues.put("sms_timestamp_sent", Long.valueOf(bmd.G));
        contentValues.put("sms_priority", Integer.valueOf(bmd.H));
        contentValues.put("sms_message_size", Long.valueOf(bmd.I));
        contentValues.put("mms_subject", bmd.J);
        if (bmd.K != null) {
            contentValues.put("sms_raw_sender", bmd.K);
        }
        if (bmd.L != null) {
            contentValues.put("sms_raw_recipients", bmd.L);
        }
        contentValues.put("persisted", Boolean.valueOf(bmd.M));
        contentValues.put("sms_message_status", Integer.valueOf(bmd.N));
        contentValues.put("sms_type", Integer.valueOf(bmd.O));
        contentValues.put("forwarded_mms_url", bmd.P);
        contentValues.put("forwarded_mms_count", Integer.valueOf(bmd.Q));
        contentValues.put("sending_error", Integer.valueOf(bmd.R));
        contentValues.put("voicemail_length", Integer.valueOf(bmd.S));
        contentValues.put("stream_url", bmd.T);
        if (bmd.U == 1) {
            contentValues.put("observed_status", Integer.valueOf(bmd.U));
        }
        contentValues.put("receive_type", Integer.valueOf(bmd.V));
        contentValues.put("init_timestamp", Long.valueOf(bmd.W));
        contentValues.put("in_app_msg_latency", Long.valueOf(bmd.X));
        contentValues.put("attachments", bmd.Y);
        contentValues.put("is_user_mentioned", Boolean.valueOf(bmd.Z));
        return contentValues;
    }

    public final eth a(String str, int i, int i2, int i3) {
        String str2;
        String valueOf;
        Throwable th;
        Cursor cursor = null;
        if (c) {
            str2 = "getUnobservedEventsAndUpdateMessageTable, conversationId ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        List arrayList = new ArrayList();
        try {
            String str3;
            CharSequence charSequence;
            switch (blq.b[i - 1]) {
                case wi.j /*1*/:
                    str3 = "conversation_id=? AND observed_status!=? AND notified>0";
                    break;
                case wi.l /*2*/:
                    str3 = "conversation_id=? AND observed_status!=? AND notified=0";
                    break;
                default:
                    str3 = "conversation_id=? AND observed_status!=?";
                    break;
            }
            switch (blq.c[i2 - 1]) {
                case wi.j /*1*/:
                    charSequence = "1";
                    break;
                case wi.l /*2*/:
                    charSequence = "0";
                    break;
                default:
                    charSequence = null;
                    break;
            }
            if (charSequence != null) {
                valueOf = String.valueOf(str3);
                str2 = String.valueOf(" AND {is_user_mentioned}={value}".replace("{is_user_mentioned}", "is_user_mentioned").replace("{value}", charSequence));
                if (str2.length() != 0) {
                    str2 = valueOf.concat(str2);
                } else {
                    str2 = new String(valueOf);
                }
                str3 = str2;
            }
            Cursor a = this.e.a("messages", new String[]{"_id", "message_id"}, str3, new String[]{str, "1"}, null, null, null);
            if (a == null) {
                if (a != null) {
                    a.close();
                }
                return null;
            }
            try {
                a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("observed_status", Integer.valueOf(i3));
                while (a.moveToNext()) {
                    long j = a.getLong(0);
                    CharSequence string = a.getString(1);
                    if (TextUtils.isEmpty(string)) {
                        glk.d("Babel_ConvHelper", "getUnobservedEvent: found a message with no message id.", new Object[0]);
                    } else {
                        if (i != bmg.c) {
                            a(contentValues, Long.valueOf(j), str);
                        }
                        arrayList.add(string);
                    }
                }
                b();
                c();
                blf.d(this, str);
                eth eth = new eth(str, arrayList);
                if (a == null) {
                    return eth;
                }
                a.close();
                return eth;
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void a(String str, String str2, String str3, long j, long j2) {
        if (c) {
            new StringBuilder(((String.valueOf(str2).length() + 94) + String.valueOf(str).length()) + String.valueOf(str3).length()).append("updateMessageId, conversationId ").append(str2).append(", messageClientGeneratedId=").append(str).append(", eventId=").append(str3).append(", ts=").append(j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", str3);
        contentValues.put("timestamp", Long.valueOf(j));
        if (j2 > 0) {
            contentValues.put("expiration_timestamp", Long.valueOf(j2));
        } else {
            contentValues.putNull("expiration_timestamp");
        }
        contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
        if (str2 == null) {
            glk.d("Babel_ConvHelper", new StringBuilder(String.valueOf(str3).length() + 58).append("attempt to update a message id [").append(str3).append("] for null conversation id").toString(), new Object[0]);
            return;
        }
        a(contentValues, "message_id=? AND conversation_id=?", new String[]{str, str2});
    }

    public Pair<String, Integer> c(long j) {
        Throwable th;
        Object obj = null;
        if (c) {
            new StringBuilder(58).append("getConversationIdStatus, messageRowId=").append(j);
        }
        Cursor a;
        try {
            bmv bmv = this.e;
            String str = "messages";
            String[] strArr = new String[]{"conversation_id", "status"};
            String valueOf = String.valueOf("_id=");
            String valueOf2 = String.valueOf(String.valueOf(j));
            a = bmv.a(str, strArr, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null, null, null, null);
            try {
                int i;
                if (a.moveToFirst()) {
                    obj = a.getString(0);
                    i = a.getInt(1);
                } else {
                    i = 0;
                }
                if (a != null) {
                    a.close();
                }
                return new Pair(obj, Integer.valueOf(i));
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public int z(String str) {
        return a("getConversationOtrStatus", str, "otr_status", 1);
    }

    public void a(String str, long j, long j2) {
        Throwable th;
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 105).append("setTimestampsForPendingSentMessages, conversationId=").append(str).append(", ts=").append(j).append(", orgTs=").append(j2);
        }
        ContentValues contentValues = new ContentValues();
        Cursor a;
        try {
            String[] strArr = new String[]{"_id"};
            String valueOf = String.valueOf("conversation_id=? AND (status=");
            int ordinal = fwx.SENDING.ordinal();
            String valueOf2 = String.valueOf("timestamp");
            String valueOf3 = String.valueOf("timestamp");
            a = this.e.a("messages", strArr, new StringBuilder(((String.valueOf(valueOf).length() + 26) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(ordinal).append(") AND ").append(valueOf2).append(">? AND ").append(valueOf3).append("<?").toString(), new String[]{str, String.valueOf(j2), String.valueOf(j)}, null, null, "timestamp ASC");
            try {
                contentValues.clear();
                while (a.moveToNext()) {
                    long j3 = a.getLong(0);
                    j++;
                    contentValues.put("timestamp", Long.valueOf(j));
                    a(contentValues, Long.valueOf(j3), str);
                }
                if (a != null) {
                    a.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public Long h(String str, String str2) {
        Throwable th;
        Long l = null;
        if (c) {
            String str3 = "getMessageTimeStamp, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        Cursor a;
        try {
            a = this.e.a("messages", new String[]{"timestamp"}, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    l = Long.valueOf(a.getLong(0));
                }
                if (a != null) {
                    a.close();
                }
                return l;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public List<Pair<String, String>> d(long j) {
        Throwable th;
        if (c) {
            new StringBuilder(68).append("queryConversationsSince, lastSuccessfulSyncTime=").append(j);
        }
        List<Pair<String, String>> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("messages_view", new String[]{"conversation_id", "message_id"}, "timestamp >? AND conversation_id NOT LIKE ?", new String[]{String.valueOf(j), "client_generated:%"}, null, null, "conversation_id");
            while (a.moveToNext()) {
                try {
                    arrayList.add(new Pair(a.getString(0), a.getString(1)));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public List<Pair<String, Long>> o() {
        Throwable th;
        List<Pair<String, Long>> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("conversations", w, "self_watermark < sort_timestamp AND conversation_id NOT LIKE 'client_generated:%'", null, null, null, null);
            while (a.moveToNext()) {
                try {
                    arrayList.add(new Pair(a.getString(0), Long.valueOf(a.getLong(1))));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void e(long j) {
        Throwable th;
        a("timestamp>? AND persisted = 1", new String[]{String.valueOf(j)});
        ArrayList arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("conversations", w, "self_watermark >? AND conversation_id NOT LIKE 'client_generated:%'", new String[]{String.valueOf(j)}, null, null, null);
            while (a.moveToNext()) {
                try {
                    arrayList.add(a.getString(0));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("self_watermark", Long.valueOf(j));
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                this.e.a("conversations", contentValues, "conversation_id=?", new String[]{(String) obj});
                blf.f(this, r1);
            }
            bkq.b(this.a, g().g(), "last_successful_sync_time", j);
            blf.d(this);
            blf.c(this);
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void A(String str) {
        if (c) {
            String str2 = "removeConversationFromDatabase:";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        if (this.e.a("conversations", "conversation_id=?", new String[]{str}) > 0) {
            blf.d(this);
        }
    }

    public void B(String str) {
        if (c) {
            String str2 = "deleteConversation:";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        this.e.a("conversations", "conversation_id=?", new String[]{str});
        RealTimeChatService.i.post(new fhp(str, g()));
    }

    private void G() {
        this.e.a("conversations", "transport_type=3", null);
    }

    public boolean c(String str, long j) {
        Throwable th;
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 60).append("deleteConversation:").append(str).append(" upperBoundTimestamp:").append(j);
        }
        int a = a("conversation_id=? AND (timestamp<=? OR timestamp IS NULL)", new String[]{str, String.valueOf(j)});
        Cursor a2;
        try {
            a2 = this.e.a("messages", new String[]{"_id"}, "conversation_id=?", new String[]{str}, null, null, null);
            try {
                boolean z = a2.getCount() == 0;
                if (a2 != null) {
                    a2.close();
                }
                if (z) {
                    z = m(str, -2147483648L);
                    boolean startsWith = str.startsWith("client_generated:sms:");
                    new StringBuilder(76).append("no messages: isHidden: ").append(z).append(" messages deleted: ").append(a).append(" isLocalSms: ").append(startsWith);
                    if (z || a > 0 || startsWith) {
                        B(str);
                        return true;
                    }
                }
                a(str, null, j);
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a2 = null;
            if (a2 != null) {
                a2.close();
            }
            throw th;
        }
    }

    public void C(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (c) {
                String str2 = "deleteMessagesFromConversation, conversationId=";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            a("conversation_id=?", new String[]{str});
        }
    }

    public int a(String str, fwy fwy) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (c) {
            String valueOf = String.valueOf(fwy);
            new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf).length()).append("deleteMessagesFromConversation, conversationId=").append(str).append(" type=").append(valueOf);
        }
        return a("conversation_id=? AND type=?", new String[]{str, String.valueOf(fwy.ordinal())});
    }

    public void a(String str, Long l, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (c) {
                String valueOf = String.valueOf(l);
                new StringBuilder((String.valueOf(str).length() + 58) + String.valueOf(valueOf).length()).append("deleteMessagesFromConversationBefore, conversationId=").append(str).append(", ts=").append(valueOf);
            }
            StringBuilder stringBuilder = new StringBuilder("conversation_id");
            stringBuilder.append("= ? AND ");
            stringBuilder.append("timestamp");
            stringBuilder.append("< ?");
            stringBuilder.append(" AND ");
            stringBuilder.append("persisted");
            stringBuilder.append(" = 1");
            a(stringBuilder.toString(), new String[]{str, String.valueOf(l)});
        }
    }

    public void f(long j) {
        if (c) {
            new StringBuilder(42).append("deleteMessages, rowId=").append(j);
        }
        String n = gwb.n(g(j));
        if (n != null && n.startsWith("content://")) {
            this.a.getContentResolver().delete(Uri.parse(n), null, null);
        }
        a("_id=?", new String[]{String.valueOf(j)});
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("latest_message_expiration_timestamp");
        contentValues.put("snippet_type", Integer.valueOf(7));
        contentValues.putNull("snippet_author_chat_id");
        contentValues.putNull("snippet_image_url");
        contentValues.putNull("snippet_text");
        contentValues.putNull("snippet_message_row_id");
        contentValues.putNull("snippet_status");
        contentValues.putNull("previous_latest_timestamp");
        contentValues.putNull("snippet_new_conversation_name");
        contentValues.putNull("snippet_participant_keys");
        contentValues.putNull("snippet_voicemail_duration");
        this.e.a("conversations", contentValues, "snippet_message_row_id=?", new String[]{String.valueOf(j)});
    }

    public String g(long j) {
        Throwable th;
        Cursor cursor = null;
        if (c) {
            new StringBuilder(55).append("getMessageExternalId, messageRowId=").append(j);
        }
        try {
            bmv bmv = this.e;
            String str = "messages";
            String[] strArr = new String[]{"external_ids"};
            String valueOf = String.valueOf("_id=");
            String valueOf2 = String.valueOf(String.valueOf(j));
            Cursor a = bmv.a(str, strArr, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null, null, null, null);
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    if (a == null) {
                        return string;
                    }
                    a.close();
                    return string;
                }
                if (a != null) {
                    a.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public int h(long j) {
        if (c) {
            String str = "deleteExpiredMessages for account: ";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        a();
        try {
            int a = a("expiration_timestamp<? AND transport_type!=3", new String[]{String.valueOf(j)});
            b();
            return a;
        } finally {
            c();
        }
    }

    public int d(String str, long j) {
        if (c) {
            String str2 = "deletePlayedEventSuggestions for account: ";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        a();
        try {
            int a = this.e.a("event_suggestions", "conversation_id=? AND timestamp<=?", new String[]{str, String.valueOf(j)});
            b();
            return a;
        } finally {
            c();
        }
    }

    public int i(long j) {
        if (c) {
            String str = "deleteExpiredEventSuggestions for account: ";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        a();
        try {
            int a = this.e.a("event_suggestions", "expiration_time_usec<=?", new String[]{String.valueOf(j)});
            b();
            if (a > 0 && c) {
                new StringBuilder(78).append("deleteExpiredEventSuggestions:").append(a).append(" cutoffTimestamp:").append(j);
            }
            return a;
        } finally {
            c();
        }
    }

    public int j(long j) {
        if (c) {
            String str = "deleteEmptyConversations for account: ";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        a();
        try {
            int a = this.e.a("conversations", "(has_oldest_message =1 OR has_persistent_events =0) AND sort_timestamp <? AND status != 1 AND NOT EXISTS (SELECT 1 FROM messages WHERE messages.conversation_id=conversations.conversation_id)", new String[]{String.valueOf(j)});
            b();
            if (a > 0) {
                if (c) {
                    new StringBuilder(73).append("deleteEmptyConversations:").append(a).append(" cutoffTimestamp:").append(j);
                }
                blf.d(this);
            }
            return a;
        } finally {
            c();
        }
    }

    public int k(long j) {
        if (c) {
            String str = "deleteExpiredInvitations for account:";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        a();
        try {
            int a = this.e.a("conversations", "sort_timestamp <? AND status = 1 AND otr_status = 1", new String[]{String.valueOf(j)});
            b();
            if (a > 0) {
                if (c) {
                    new StringBuilder(73).append("deleteExpiredInvitations:").append(a).append(" cutoffTimestamp:").append(j);
                }
                blf.d(this);
            }
            return a;
        } finally {
            c();
        }
    }

    public Long i(String str, String str2) {
        Throwable th;
        Cursor cursor = null;
        if (c) {
            new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(str2).length()).append("queryMessageRowId, conversationId=").append(str).append(", messageId=").append(str2);
        }
        try {
            Cursor a = this.e.a("messages", new String[]{"_id"}, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                a.moveToFirst();
                if (a.isAfterLast()) {
                    if (a != null) {
                        a.close();
                    }
                    return null;
                }
                Long valueOf = Long.valueOf(a.getLong(0));
                if (a == null) {
                    return valueOf;
                }
                a.close();
                return valueOf;
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public long a(String str, String str2, fwx fwx, edo edo, fwy fwy, long j, long j2, long j3, int i, String str3, String str4) {
        return a(str, str2, fwx, edo, fwy, j, j2, 0, i, str3, str4, 0, null);
    }

    public long a(String str, String str2, fwx fwx, edo edo, fwy fwy, long j, long j2, long j3, int i, String str3, String str4, int i2, String str5) {
        if (c) {
            String valueOf = String.valueOf(fwy);
            new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(valueOf).length()).append("insertSystemMessage: conversationId=").append(str).append("; type ").append(valueOf).append("; ts ").append(j);
        }
        Long i3 = i(str, str2);
        if (i3 == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", str2);
            contentValues.put("conversation_id", str);
            contentValues.put("author_chat_id", edo.b);
            contentValues.put("author_gaia_id", edo.a);
            contentValues.put("status", Integer.valueOf(fwx.ordinal()));
            contentValues.put("type", Integer.valueOf(fwy.ordinal()));
            contentValues.put("timestamp", Long.valueOf(j));
            if (j2 > 0) {
                contentValues.put("expiration_timestamp", Long.valueOf(j2));
            }
            if (j3 > 0) {
                contentValues.put("delete_after_read_timetamp", Long.valueOf(j3));
            }
            contentValues.put("notification_level", Integer.valueOf(i));
            if (str3 != null) {
                contentValues.put("new_conversation_name", str3);
            }
            if (str4 != null) {
                contentValues.put("participant_keys", str4);
            }
            contentValues.put("call_media_type", Integer.valueOf(i2));
            if (!TextUtils.isEmpty(str5)) {
                contentValues.put("text", str5);
            }
            i3 = Long.valueOf(b(contentValues));
        }
        return gwb.a(i3);
    }

    public void a(String str, fwx fwx, fwx fwx2) {
        String valueOf;
        String[] strArr;
        if (c) {
            String valueOf2 = String.valueOf(fwx);
            valueOf = String.valueOf(fwx2);
            new StringBuilder(((String.valueOf(str).length() + 56) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()).append("setMessageStatus: conversationId=").append(str).append(" fromStatus=").append(valueOf2).append("; toStatus=").append(valueOf);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx2.ordinal()));
        if (fwx2 == fwx.SENDING) {
            contentValues.put("notified_for_failure", Integer.valueOf(0));
        }
        if (fwx == fwx.UNKNOWN) {
            valueOf = "conversation_id=?";
            strArr = new String[]{str};
        } else {
            valueOf = "conversation_id=? AND status=?";
            strArr = new String[]{str, String.valueOf(fwx)};
        }
        a(contentValues, valueOf, strArr);
        blf.d(this, str);
    }

    public void a(String str, String str2, fwx fwx, int i) {
        String valueOf = String.valueOf(fwx);
        valueOf = new StringBuilder(((String.valueOf(str).length() + 56) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("setMessageStatusSent: conversationId=").append(str).append(" messageId=").append(str2).append(" status=").append(valueOf).toString();
        if (fwx == fwx.FAILED_TO_SEND) {
            glk.c("Babel_ConvHelper", valueOf, new Object[0]);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.ordinal()));
        if (fwx == fwx.FAILED_TO_SEND) {
            contentValues.put("sending_error", Integer.valueOf(i));
            contentValues.put("notified_for_failure", Integer.valueOf(0));
            ((ect) jyn.a(this.a, ect.class)).d(this.f.g(), true);
        } else {
            contentValues.put("sending_error", Integer.valueOf(0));
        }
        List a = a(contentValues, "conversation_id=? AND message_id=?", new String[]{str, str2});
        if (a.size() != 1) {
            String valueOf2 = String.valueOf(fwx);
            glk.e("Babel", new StringBuilder(((String.valueOf(valueOf2).length() + 72) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("!!!!! failed to set message status to ").append(valueOf2).append(" for ").append(str).append(" ").append(str2).append("; updateCount == ").append(a.size()).toString(), new Object[0]);
        }
        blf.d(this, str);
        if (fwx == fwx.FAILED_TO_SEND || fwx == fwx.ON_SERVER) {
            blf.d(this);
            blf.d(this, str);
        }
    }

    public void a(long j, fwx fwx, long j2) {
        String valueOf;
        if (c) {
            valueOf = String.valueOf(fwx);
            new StringBuilder(String.valueOf(valueOf).length() + 94).append("setMessageStatusTimestamp: messageRowId=").append(j).append(", status=").append(valueOf).append(", ts=").append(j2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.ordinal()));
        if (j2 >= 0) {
            contentValues.put("timestamp", Long.valueOf(j2));
        }
        if (fwx == fwx.QUEUED) {
            contentValues.put("notified_for_failure", Integer.valueOf(0));
        }
        String valueOf2 = String.valueOf("_id=");
        valueOf = String.valueOf(String.valueOf(j));
        a(contentValues, valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2), null);
    }

    public void e(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.PENDING_DELETE.ordinal()));
        a(contentValues, "conversation_id=? AND _id=?", new String[]{str, Long.toString(j)});
    }

    public void p() {
        a(null, null);
        this.e.a("conversation_participants", null, null);
        this.e.a("conversations", null, null);
        blf.d(this);
        blf.c(this);
        blf.b(this);
    }

    private Cursor b(String str, edo edo) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2;
        CharSequence charSequence;
        p(edo.a, edo.b);
        if (!TextUtils.isEmpty(edo.a)) {
            str2 = edo.a;
            charSequence = "gaia_id";
        } else if (TextUtils.isEmpty(edo.b)) {
            Object obj = null;
            charSequence = null;
        } else {
            str2 = edo.b;
            Object obj2 = "chat_id";
        }
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        return this.e.a("participants_view", new String[]{str}, String.valueOf(charSequence).concat("=?"), new String[]{str2}, null, null, null);
    }

    public String a(edo edo) {
        Throwable th;
        String str = null;
        if (c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 40).append("queryParticipantFullName, participantId=").append(valueOf);
        }
        Cursor b;
        try {
            b = b("full_name", edo);
            if (b != null) {
                try {
                    if (b.moveToFirst()) {
                        str = b.getString(0);
                        if (b != null) {
                            b.close();
                        }
                        return str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (b != null) {
                        b.close();
                    }
                    throw th;
                }
            }
            if (b != null) {
                b.close();
            }
            return str;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            b = null;
            th = th4;
            if (b != null) {
                b.close();
            }
            throw th;
        }
    }

    private String d(edo edo) {
        Cursor b;
        Throwable th;
        String str = null;
        if (c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("queryParticipantFirstName, participantId=").append(valueOf);
        }
        try {
            b = b("first_name", edo);
            if (b != null) {
                try {
                    if (b.moveToFirst()) {
                        str = b.getString(0);
                        if (b != null) {
                            b.close();
                        }
                        return str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (b != null) {
                        b.close();
                    }
                    throw th;
                }
            }
            if (b != null) {
                b.close();
            }
            return str;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            b = null;
            th = th4;
            if (b != null) {
                b.close();
            }
            throw th;
        }
    }

    public int b(edo edo) {
        int i = -1;
        if (c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("queryParticipantIdBlocked, participantId=").append(valueOf);
        }
        if (edo != null) {
            Cursor cursor = null;
            try {
                cursor = b("blocked", edo);
                if (cursor != null && cursor.moveToFirst()) {
                    i = cursor.getInt(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    public String c(edo edo) {
        String a = a(edo);
        if (a == null) {
            return d(edo);
        }
        return a;
    }

    public void D(String str) {
        if (c) {
            String str2 = "ensureLocalParticipantExists, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        bko g = g();
        a(str, gwb.a(g.b(), g.c(), g.c(), null, g.p(), null), true);
    }

    public void a(String str, bcg bcg) {
        if (c) {
            String valueOf = String.valueOf(bcg.b());
            new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf).length()).append("insertCircleParticipant ConversationId: ").append(str).append(", circle id: ").append(valueOf);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", str);
        contentValues.put("participant_type", Integer.valueOf(edq.CIRCLE.ordinal()));
        contentValues.put("active", Integer.valueOf(1));
        contentValues.put("participant_row_id", Integer.valueOf(a(null, null, null, bcg.b(), bcg.d(), true)));
        this.e.a("conversation_participants", null, contentValues);
    }

    public void q() {
        this.e.a("blocked_people", "gaia_id IS NOT NULL", null);
        this.a.getContentResolver().notifyChange(EsProvider.m, null);
    }

    public boolean j(String str, String str2) {
        Throwable th;
        Cursor a;
        try {
            boolean z;
            if (!TextUtils.isEmpty(null)) {
                a = this.e.a("blocked_people", new String[]{"_id"}, "gaia_id=?", new String[]{null}, null, null, null);
            } else if (TextUtils.isEmpty(str2)) {
                a = null;
            } else {
                a = this.e.a("blocked_people", new String[]{"_id"}, "chat_id=?", new String[]{str2}, null, null, null);
            }
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        z = true;
                        if (a != null) {
                            a.close();
                        }
                        return z;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            z = false;
            if (a != null) {
                a.close();
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void a(String str, String str2, boolean z) {
        String str3;
        String[] strArr;
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            str3 = "gaia_id=?";
            strArr = new String[]{str};
        } else if (TextUtils.isEmpty(str2)) {
            glk.e("Babel_ConvHelper", "setUserBlocked without a valid gaiaId or chatId", new Object[0]);
            return;
        } else {
            str3 = "chat_id=?";
            strArr = new String[]{str2};
        }
        ContentValues contentValues = new ContentValues();
        String str4 = "blocked";
        if (!z) {
            i = 0;
        }
        contentValues.put(str4, Integer.valueOf(i));
        this.e.a("participants", contentValues, str3, strArr);
        this.a.getContentResolver().notifyChange(EsProvider.m, null);
        bko g = g();
        Builder buildUpon = EsProvider.r.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(g.g()));
        this.a.getContentResolver().notifyChange(buildUpon.build(), null);
    }

    public void k(String str, String str2) {
        String str3;
        String[] strArr;
        if (!TextUtils.isEmpty(str)) {
            str3 = "gaia_id=?";
            strArr = new String[]{str};
        } else if (TextUtils.isEmpty(str2)) {
            glk.e("Babel_ConvHelper", "removeBlockedPerson without a valid gaiaId or chatId", new Object[0]);
            return;
        } else {
            str3 = "chat_id=?";
            strArr = new String[]{str2};
        }
        this.e.a("blocked_people", str3, strArr);
        this.a.getContentResolver().notifyChange(EsProvider.m, null);
    }

    public void c(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("gaia_id", str);
        contentValues.put("chat_id", str2);
        contentValues.put("name", str3);
        contentValues.put("profile_photo_url", str4);
        this.e.a("blocked_people", null, contentValues);
        this.a.getContentResolver().notifyChange(EsProvider.m, null);
    }

    public void r() {
        this.e.a("dismissed_contacts", null, null);
        this.a.getContentResolver().notifyChange(EsProvider.n, null);
    }

    public void E(String str) {
        this.e.a("dismissed_contacts", "gaia_id=?", new String[]{str});
        this.a.getContentResolver().notifyChange(EsProvider.n, null);
    }

    public void d(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("gaia_id", str);
        contentValues.put("chat_id", null);
        contentValues.put("name", str3);
        contentValues.put("profile_photo_url", str4);
        this.e.a("dismissed_contacts", null, contentValues);
        this.a.getContentResolver().notifyChange(EsProvider.n, null);
    }

    public void a(esr esr) {
        if (glk.a("Babel_ConvHelper", 3)) {
            String valueOf = String.valueOf(esr.a);
            glk.a("Babel_ConvHelper", new StringBuilder(String.valueOf(valueOf).length() + 42).append("updateParticipantData  for participantId: ").append(valueOf).toString(), new Object[0]);
        }
        if (a(esr.a.a, esr.a.b, esr.b, null, esr.c, true) >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fallback_name", esr.c);
            if (esr.b != null) {
                contentValues.put("participant_type", Integer.valueOf(edq.PHONE.ordinal()));
                contentValues.put("phone_id", esr.b);
            }
            this.e.a("participants", contentValues, "_id=?", new String[]{Integer.toString(r0)});
            return;
        }
        valueOf = String.valueOf(esr.a.toString());
        String str = esr.c;
        glk.e("Babel_ConvHelper", new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(str).length()).append("updateParticipantData did not find db row for ").append(valueOf).append(" and fallbackName=").append(str).toString(), new Object[0]);
        iil.a("updateParticipantData did not find db row");
    }

    public boolean a(edk edk, boolean z) {
        if (edk.b == null) {
            glk.e("Babel_ConvHelper", "null participantId in insertOrUpdateParticipant", new Object[0]);
            return false;
        }
        bjm a = ((bjn) jyn.a(f(), bjn.class)).a(h());
        try {
            a(a, edk);
            String str = edk.b.a;
            String str2 = edk.b.b;
            String f = edk.f();
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(f) && edk.a != edq.PHONE) {
                glk.e("Babel_ConvHelper", "no gaiaId/chatId/phoneNumber in insertOrUpdateParticipant", new Object[0]);
                return false;
            }
            int i;
            ContentValues contentValues = new ContentValues();
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("gaia_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("chat_id", str2);
            }
            if (!TextUtils.isEmpty(f)) {
                contentValues.put("phone_id", f);
                iil.a(edq.PHONE, edk.a);
            }
            contentValues.put("participant_type", Integer.valueOf(edk.a.ordinal()));
            if (edk.a == edq.UNKNOWN) {
                String str3 = "Babel";
                String str4 = "Encountered participant with participantType UNKNOWN, ParticipantEntity: ";
                String valueOf = String.valueOf(glk.b(edk.toString()));
                if (valueOf.length() != 0) {
                    valueOf = str4.concat(valueOf);
                } else {
                    valueOf = new String(str4);
                }
                glk.e(str3, valueOf, new Object[0]);
                iil.a("ParticipantType UNKNOWN found");
            }
            if (!TextUtils.isEmpty(edk.f)) {
                contentValues.put("first_name", edk.f);
            }
            if (!TextUtils.isEmpty(edk.e)) {
                contentValues.put("full_name", edk.e);
            }
            if (!TextUtils.isEmpty(edk.g)) {
                contentValues.put("fallback_name", edk.g);
            }
            if (!TextUtils.isEmpty(edk.h)) {
                contentValues.put("profile_photo_url", edk.h);
            }
            contentValues.put("in_users_domain", Boolean.valueOf(edk.y));
            if (edk.i != null) {
                contentValues.put("blocked", Integer.valueOf(gwb.b(edk.i) ? 1 : 0));
            }
            if (z) {
                contentValues.putNull("batch_gebi_tag");
            }
            int a2 = a(str, str2, f, null, null, false);
            if (a2 < 0) {
                a2 = (int) this.e.a("participants", null, contentValues);
                if (a2 < 0) {
                    glk.e("Babel_ConvHelper", "insert failed", new Object[0]);
                    i = a2;
                }
                i = a2;
            } else {
                contentValues.remove("phone_id");
                if (this.e.a("participants", contentValues, "_id=?", new String[]{Integer.toString(a2)}) <= 0) {
                    glk.e("Babel_ConvHelper", "update failed", new Object[0]);
                }
                i = a2;
            }
            if (i >= 0) {
                return ((bog) jyn.a(this.a, bog.class)).a(this.f).a(Integer.toString(i), edk, z);
            }
            return false;
        } finally {
            a.a();
        }
    }

    public void a(String str, ContentValues contentValues) {
        if (this.e.a("presence", contentValues, "gaia_id=?", new String[]{str}) <= 0) {
            contentValues.put("gaia_id", str);
            if (((int) this.e.a("presence", null, contentValues)) < 0) {
                glk.e("Babel_ConvHelper", "update failed", new Object[0]);
            }
        }
    }

    private boolean b(edo edo, String str) {
        Cursor cursor;
        Throwable th;
        try {
            String string;
            int i;
            CharSequence string2;
            int i2;
            ContentValues contentValues;
            if (TextUtils.isEmpty(edo.a)) {
                if (TextUtils.isEmpty(edo.b)) {
                    cursor = null;
                } else {
                    cursor = this.e.a("participants_view", new String[]{"_id", "batch_gebi_tag", "chat_id"}, "chat_id=?", new String[]{edo.b}, null, null, null);
                }
            } else if (TextUtils.equals(edo.a, edo.b)) {
                cursor = this.e.a("participants_view", new String[]{"_id", "batch_gebi_tag", "chat_id", "gaia_id", "phone_id"}, "gaia_id=?", new String[]{edo.a}, null, null, null);
            } else {
                cursor = this.e.a("participants_view", new String[]{"_id", "batch_gebi_tag", "chat_id", "gaia_id", "phone_id"}, "gaia_id=? OR chat_id=?", new String[]{edo.a, edo.b}, null, null, null);
            }
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        string = cursor.getString(0);
                        i = cursor.getString(1) == null ? 1 : 0;
                        string2 = cursor.getString(2);
                        i2 = 1;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (i == 0) {
                            return false;
                        }
                        contentValues = new ContentValues();
                        contentValues.put("batch_gebi_tag", str);
                        if (!TextUtils.isEmpty(edo.b) && TextUtils.isEmpty(r2)) {
                            contentValues.put("chat_id", edo.b);
                        }
                        if (!TextUtils.isEmpty(edo.a)) {
                            contentValues.put("gaia_id", edo.a);
                        }
                        if (i2 == 0) {
                            if (this.e.a("participants", contentValues, "_id=?", new String[]{string}) <= 0) {
                                glk.e("Babel_ConvHelper", "update failed on rowid lookup", new Object[0]);
                            }
                        } else if (this.e.a("participants", null, contentValues) < 1) {
                            glk.e("Babel_ConvHelper", "insert failed", new Object[0]);
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            string = null;
            string2 = null;
            i = 0;
            i2 = 0;
            if (cursor != null) {
                cursor.close();
            }
            if (i == 0) {
                return false;
            }
            contentValues = new ContentValues();
            contentValues.put("batch_gebi_tag", str);
            contentValues.put("chat_id", edo.b);
            if (TextUtils.isEmpty(edo.a)) {
                contentValues.put("gaia_id", edo.a);
            }
            if (i2 == 0) {
                if (this.e.a("participants", contentValues, "_id=?", new String[]{string}) <= 0) {
                    glk.e("Babel_ConvHelper", "update failed on rowid lookup", new Object[0]);
                }
            } else if (this.e.a("participants", null, contentValues) < 1) {
                glk.e("Babel_ConvHelper", "insert failed", new Object[0]);
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void a(String str, edk edk, boolean z) {
        a(edk, false);
        a(str, edk.b, edq.UNKNOWN, null, true);
    }

    public boolean a(edo edo, String str, String str2) {
        boolean b = b(edo, str);
        c(str2, edo);
        return b;
    }

    public void a(String str, edo edo, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Integer.valueOf(z ? 1 : 0));
        String str2;
        String valueOf;
        String valueOf2;
        if (edo != null && !TextUtils.isEmpty(edo.a)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.e.a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.a, str, str});
        } else if (edo != null && !TextUtils.isEmpty(edo.b)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.e.a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.b, str, str});
        }
    }

    private void a(String str, edo edo, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("invitation_status", Integer.valueOf(i));
        String str2;
        String valueOf;
        String valueOf2;
        if (!TextUtils.isEmpty(edo.a)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.e.a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.a, str, str});
        } else if (!TextUtils.isEmpty(edo.b)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.e.a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.b, str, str});
        }
    }

    private void c(String str, edo edo) {
        a(str, edo, edq.UNKNOWN, null, false);
    }

    private void a(String str, edo edo, edq edq, String str2, boolean z) {
        Cursor a;
        Throwable th;
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", str);
        if (edq != edq.UNKNOWN) {
            contentValues.put("participant_type", Integer.valueOf(edq.ordinal()));
        }
        Cursor cursor = null;
        try {
            long a2 = (long) a(edo.a, edo.b, null, null, null, false);
            if (a2 != -1) {
                String str3;
                String[] strArr;
                if (!TextUtils.isEmpty(edo.a)) {
                    str3 = "gaia_id=? AND conversation_id=?";
                    strArr = new String[]{edo.a, str};
                } else if (!TextUtils.isEmpty(edo.b)) {
                    str3 = "chat_id=? AND conversation_id=?";
                    strArr = new String[]{edo.b, str};
                } else if (!TextUtils.isEmpty(null)) {
                    str3 = "phone_id=? AND conversation_id=?";
                    strArr = new String[]{null, str};
                } else {
                    return;
                }
                a = this.e.a("conversation_participants_view", new String[]{"_id"}, str3, strArr, null, null, null);
                try {
                    Object obj;
                    int i;
                    if (a.moveToFirst()) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    a.close();
                    cursor = null;
                    if (obj == null) {
                        a = this.e.a("conversation_participants", new String[]{"MAX(sequence)"}, "conversation_id=?", new String[]{str}, null, null, null);
                        i = a.moveToFirst() ? a.getInt(0) : 0;
                    } else {
                        i = 0;
                        a = null;
                    }
                    contentValues.put("sequence", Integer.valueOf(i + 1));
                    if (a != null) {
                        a.close();
                    }
                    contentValues.put("participant_row_id", Long.valueOf(a2));
                    if (obj == null) {
                        contentValues.put("active", Integer.valueOf(z ? 1 : 0));
                        this.e.a("conversation_participants", null, contentValues);
                        return;
                    }
                    this.e.a("conversation_participants", contentValues, "participant_row_id=? AND conversation_id=?", new String[]{String.valueOf(a2), str});
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            a = cursor;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public String a(edo edo, String str) {
        bjm a = ((bjn) jyn.a(f(), bjn.class)).a(h());
        try {
            long j;
            Object obj;
            Object b;
            String a2;
            if (TextUtils.isEmpty(str)) {
                j = -1;
                String str2 = edo.a;
                obj = null;
            } else {
                dak b2 = b(str, a);
                if (b2 != null) {
                    if (((fzw) jyn.a(this.a, fzw.class)).a(this.g)) {
                        CharSequence charSequence = null;
                    } else {
                        b = b2.b();
                    }
                    j = TextUtils.isEmpty(b) ? b2.a() : -1;
                } else {
                    j = -1;
                    b = null;
                }
                obj = glq.f(gwb.H(), str);
            }
            if (!TextUtils.isEmpty(b)) {
                a2 = bnr.GAIA.a(b);
            } else if (j != -1) {
                a2 = bnr.CONTACT.a(String.valueOf(j));
            } else if (TextUtils.isEmpty(obj)) {
                a2 = null;
            } else {
                a2 = bnr.PHONE.a(obj);
            }
            a.a();
            return a2;
        } catch (Throwable th) {
            a.a();
        }
    }

    public void a(bjm bjm, edk edk) {
        bmi a = a(bjm, edk.c, edk.e, edk.h);
        edk.a(a.a, a.b);
    }

    private bmi a(bjm bjm, String str, String str2, String str3) {
        CharSequence charSequence = null;
        if (str != null) {
            charSequence = glq.c(gwb.H(), str);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = charSequence;
        }
        bmi bmi = new bmi(this);
        bmi.a = str2;
        bmi.b = str3;
        dak a = blo.a(str, bjm);
        if (a != null) {
            if (!TextUtils.isEmpty(a.c())) {
                bmi.a = a.c();
            }
            if (!TextUtils.isEmpty(a.d())) {
                bmi.b = a.d();
            }
        }
        return bmi;
    }

    public static dak a(String str, bjm bjm) {
        bjg a = bjm.a(str);
        if (a != null) {
            return dak.a(gwb.H(), a);
        }
        Iterable<bjg> b = bjm.b(str);
        if (b != null) {
            String valueOf;
            String a2;
            Object obj = null;
            long j = -1;
            CharSequence charSequence = null;
            Object obj2 = null;
            for (bjg a3 : b) {
                if (!TextUtils.isEmpty(a3.e())) {
                    String e;
                    long j2;
                    if (obj2 == null) {
                        e = a3.e();
                    } else if (obj2.equalsIgnoreCase(a3.e())) {
                        e = obj2;
                    } else {
                        String valueOf2 = String.valueOf(obj2);
                        valueOf = String.valueOf(", ");
                        e = String.valueOf(a3.e());
                        e = new StringBuilder(((String.valueOf(valueOf2).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(e).length()).append(valueOf2).append(valueOf).append(e).toString();
                        obj = 1;
                    }
                    if (charSequence == null && !TextUtils.isEmpty(a3.f())) {
                        charSequence = a3.f();
                    }
                    if (j != -1 || TextUtils.isEmpty(a3.p())) {
                        j2 = j;
                    } else {
                        j2 = Long.parseLong(a3.p());
                    }
                    j = j2;
                    obj2 = e;
                }
            }
            if (!TextUtils.isEmpty(charSequence) || j == -1) {
                CharSequence charSequence2 = charSequence;
            } else {
                a2 = frm.a(Long.valueOf(j));
            }
            if (obj != null) {
                valueOf = null;
            } else {
                valueOf = a2;
            }
            if (!TextUtils.isEmpty(obj2)) {
                return new dak(obj2, null, valueOf, null, null, null);
            }
        }
        return null;
    }

    public dak b(String str, bjm bjm) {
        bjg a = bjm.a(str);
        if (a != null) {
            return dak.a(gwb.H(), a);
        }
        boolean z;
        String str2;
        Iterable<bjg> b = bjm.b(str);
        boolean z2;
        if (b != null) {
            z2 = false;
            z = false;
            str2 = null;
            for (bjg a2 : b) {
                String i = a2.i();
                if (!(TextUtils.isEmpty(i) || TextUtils.equals(i, str2))) {
                    boolean z3 = a(edo.a(i), false, 1) != null;
                    if (str2 == null) {
                        z = z3;
                        str2 = i;
                    } else if (!z && z3) {
                        z2 = true;
                        z = true;
                        str2 = i;
                    } else if (z && z3) {
                        return null;
                    } else {
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = false;
            z = false;
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        if (z || !r1) {
            return dak.a(f(), bjm.c(str2));
        }
        return null;
    }

    public String a(bls bls) {
        String a = bnr.CONVERSATION.a(bls.s);
        if (!((fzw) jyn.a(this.a, fzw.class)).d() || bls.b != 1 || bls.k == 1) {
            return a;
        }
        if (bnr.MANUAL.b(bls.t)) {
            return bls.t;
        }
        String a2;
        edo b = g().b();
        String str = a;
        int i = 0;
        for (edk edk : bls.h) {
            if (!b.a(edk.b)) {
                i++;
                if (b(edk.b) == 1) {
                    return a;
                }
                a2 = a(edk.b, edk.c);
                if (a2 == null) {
                    a2 = str;
                }
                str = a2;
            }
        }
        if (i > 1) {
            glk.e("Babel", "computeMergeKeyForConversation with > 1 participants: " + i, new Object[0]);
            fzw fzw = (fzw) jyn.a(this.a, fzw.class);
            int i2 = bls.c;
            String str2 = bls.s;
            boolean b2 = fzw.b(this.g);
            glk.e("Babel", new StringBuilder(String.valueOf(str2).length() + 79).append("conv transport: ").append(i2).append("; id: ").append(str2).append("; isCarrierSms: ").append(b2).append("; isCarrierSmsOnly: ").append(fzw.a(this.g)).toString(), new Object[0]);
            a = String.valueOf(blo.ak(b.a));
            String valueOf = String.valueOf(blo.ak(b.b));
            glk.e("Babel", new StringBuilder((String.valueOf(a).length() + 19) + String.valueOf(valueOf).length()).append("self gaia: ").append(a).append("; chat: ").append(valueOf).toString(), new Object[0]);
            for (edk edk2 : bls.h) {
                String valueOf2 = String.valueOf(blo.ak(edk2.b()));
                str2 = String.valueOf(blo.ak(edk2.c()));
                a2 = String.valueOf(blo.ak(edk2.c));
                glk.e("Babel", new StringBuilder(((String.valueOf(valueOf2).length() + 23) + String.valueOf(str2).length()) + String.valueOf(a2).length()).append("gaia: ").append(valueOf2).append("; chat: ").append(str2).append("; phone: ").append(a2).toString(), new Object[0]);
            }
            jcf jcf = (jcf) jyn.a(this.a, jcf.class);
            for (Integer a3 : jcf.a()) {
                int a4 = gwb.a(a3, -1);
                str2 = String.valueOf(blo.ak(jcf.a(a4).b("gaia_id")));
                glk.e("Babel", new StringBuilder(String.valueOf(str2).length() + 18).append("Acct ").append(a4).append(": ").append(str2).toString(), new Object[0]);
            }
            iil.a("participant count (not including self) is " + i);
        }
        return str;
    }

    private static String ak(String str) {
        return (str == null || "_sms_only_account".equals(str) || str.length() < 6) ? str : str.substring(str.length() - 6);
    }

    private int a(String str, String str2, String str3, String str4, String str5, String str6) {
        Cursor a;
        Throwable th;
        int a2 = a(str2, str3, str4, str5, str6, true);
        if (a2 >= 0) {
            edq edq = edq.UNKNOWN;
            try {
                String[] strArr = new String[]{Integer.toString(a2), str};
                a = this.e.a("conversation_participants", new String[]{"_id"}, "participant_row_id=? AND conversation_id=?", strArr, null, null, null);
                try {
                    Object obj;
                    if (a.moveToFirst()) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (a != null) {
                        a.close();
                    }
                    if (obj == null) {
                        try {
                            a = this.e.a("conversation_participants", new String[]{"MAX(sequence)"}, "conversation_id=?", new String[]{str}, null, null, null);
                            try {
                                int i;
                                if (a.moveToFirst()) {
                                    i = a.getInt(0);
                                } else {
                                    i = 0;
                                }
                                if (a != null) {
                                    a.close();
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("conversation_id", str);
                                if (edq != edq.UNKNOWN) {
                                    contentValues.put("participant_type", Integer.valueOf(edq.ordinal()));
                                }
                                contentValues.put("participant_row_id", Integer.valueOf(a2));
                                contentValues.put("sequence", Integer.valueOf(i + 1));
                                contentValues.put("active", Integer.valueOf(0));
                                this.e.a("conversation_participants", null, contentValues);
                            } catch (Throwable th2) {
                                th = th2;
                                if (a != null) {
                                    a.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            a = null;
                            if (a != null) {
                                a.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                a = null;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        return a2;
    }

    public void a(List<edo> list, List<esr> list2, String str) {
        Throwable th;
        Map kyVar = new ky();
        for (esr esr : list2) {
            kyVar.put(esr.a, esr);
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Map kyVar2 = new ky();
        Cursor a;
        try {
            a = this.e.a("conversation_participants_view", new String[]{"gaia_id", "chat_id", "active", "invitation_status"}, "conversation_id=?", new String[]{str}, null, null, null);
            try {
                Object obj;
                if (a.moveToFirst()) {
                    do {
                        edo edo = new edo(a.getString(0), a.getString(1));
                        Object obj2 = a.getInt(2) == 1 ? 1 : null;
                        if (obj2 != null && !blo.a((List) list, edo)) {
                            arrayList.add(edo);
                        } else if (obj2 == null) {
                            if (blo.a((List) list, edo)) {
                                arrayList2.add(edo);
                            }
                        }
                        if (kyVar.containsKey(edo) && a.getInt(3) != ((esr) kyVar.get(edo)).d) {
                            kyVar2.put(edo, Integer.valueOf(((esr) kyVar.get(edo)).d));
                        }
                    } while (a.moveToNext());
                }
                if (a != null) {
                    a.close();
                }
                ArrayList arrayList3 = (ArrayList) arrayList;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    obj = arrayList3.get(i);
                    i++;
                    a(str, (edo) obj, false);
                }
                arrayList3 = (ArrayList) arrayList2;
                size = arrayList3.size();
                i = 0;
                while (i < size) {
                    obj = arrayList3.get(i);
                    i++;
                    a(str, (edo) obj, true);
                }
                for (Entry entry : kyVar2.entrySet()) {
                    a(str, (edo) entry.getKey(), gwb.a((Integer) entry.getValue()));
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private static boolean a(List<edo> list, edo edo) {
        for (edo edo2 : list) {
            if (!TextUtils.isEmpty(edo2.a) && !TextUtils.isEmpty(edo.a) && edo2.a.equals(edo.a)) {
                return true;
            }
        }
        return false;
    }

    public String a(String str, List<edo> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (edo edo : list) {
            long a = (long) a(str, edo.a, edo.b, null, null, null);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('|');
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    private edk a(Cursor cursor, String str) {
        String string;
        String string2 = cursor.getString(0);
        String string3 = cursor.getString(1);
        String string4 = cursor.getString(2);
        String string5 = cursor.getString(3);
        String string6 = cursor.getString(4);
        String string7 = cursor.getString(5);
        String string8 = cursor.getString(6);
        if (TextUtils.isEmpty(str)) {
            string = cursor.getString(7);
        } else {
            string = str;
        }
        String string9 = cursor.getString(8);
        String string10 = cursor.getString(9);
        Boolean bool = null;
        if (cursor.getInt(10) != 0) {
            bool = Boolean.TRUE;
        }
        edk a = gwb.a(gwb.H(), edq.values()[cursor.getInt(11)], string3, string4, string6, string5, string7, string8, string, string9, string10, bool, null, 0);
        ((bog) jyn.a(this.a, bog.class)).a(this.f).a(a, string2);
        return a;
    }

    public edk a(fbt fbt) {
        Cursor a;
        Throwable th;
        edk edk = null;
        if (c) {
            String valueOf = String.valueOf(fbt);
            new StringBuilder(String.valueOf(valueOf).length() + 26).append("getParticipantEntity for: ").append(valueOf);
        }
        try {
            if (!TextUtils.isEmpty(fbt.a)) {
                a = this.e.a("participants_view", j, "gaia_id=?", new String[]{fbt.a}, null, null, null);
            } else if (TextUtils.isEmpty(fbt.b)) {
                a = null;
            } else {
                a = this.e.a("participants_view", j, "chat_id=?", new String[]{fbt.b}, null, null, null);
            }
            if (a != null) {
                try {
                    if (a.moveToNext()) {
                        edk = a(a, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return edk;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, str4);
        contentValues.put(str3, str5);
        this.e.a(str, contentValues, new StringBuilder((String.valueOf(str2).length() + 8) + String.valueOf(str3).length()).append(str2).append("=? OR ").append(str3).append("=?").toString(), new String[]{str4, str5});
    }

    private void p(String str, String str2) {
        Cursor a;
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        int i = 0;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
            String[] strArr = new String[]{str2};
            try {
                Cursor a2 = this.e.a("participants", j, "gaia_id=?", new String[]{str}, null, null, null);
                try {
                    a = this.e.a("participants", j, "chat_id=?", strArr, null, null, null);
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    cursor2 = a2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                try {
                    boolean moveToFirst = a2.moveToFirst();
                    boolean moveToFirst2 = a.moveToFirst();
                    int i2 = ((moveToFirst || moveToFirst2) && !(moveToFirst && moveToFirst2 && TextUtils.equals(a2.getString(0), a.getString(0)))) ? 0 : 1;
                    if (i2 != 0) {
                        if (a2 != null) {
                            a2.close();
                        }
                        if (a != null) {
                            a.close();
                            return;
                        }
                        return;
                    }
                    CharSequence string;
                    String string2;
                    a("conversations", "snippet_author_gaia_id", "snippet_author_chat_id", str, str2);
                    a("conversations", "inviter_gaia_id", "inviter_chat_id", str, str2);
                    a("dismissed_contacts", "gaia_id", "chat_id", str, str2);
                    a("messages", "author_gaia_id", "author_chat_id", str, str2);
                    a("suggested_contacts", "gaia_id", "chat_id", str, str2);
                    int i3 = (!moveToFirst || moveToFirst2) ? 0 : 1;
                    if (moveToFirst && moveToFirst2) {
                        string = a2.getString(0);
                    }
                    if (i3 != 0) {
                        string2 = a2.getString(0);
                    } else {
                        string2 = a.getString(0);
                    }
                    ContentValues contentValues = new ContentValues();
                    if (TextUtils.isEmpty(string)) {
                        i2 = 0;
                    } else {
                        contentValues.put("participant_row_id", string2);
                        i = this.e.a("conversation_participants", contentValues, "participant_row_id=?", new String[]{string});
                        contentValues.clear();
                        contentValues.putNull("gaia_id");
                        contentValues.putNull("chat_id");
                        i2 = this.e.a("participants", contentValues, "_id=?", new String[]{string});
                        contentValues.clear();
                    }
                    if (i3 != 0) {
                        contentValues.put("chat_id", str2);
                        contentValues.put("participant_type", Integer.valueOf(edq.PHONE.ordinal()));
                        contentValues.put("phone_id", str2);
                    } else {
                        contentValues.put("gaia_id", str);
                    }
                    int a3 = this.e.a("participants", contentValues, "_id=?", new String[]{string2});
                    if (c) {
                        new StringBuilder(134).append("offnetwork gaia fixed ").append(i).append(" conversation rows, ").append(i2).append(" participant(s) were deleted, ").append(a3).append(" participant(s) were updated.");
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    if (a != null) {
                        a.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = a;
                    cursor2 = a2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    private int a(String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        String[] strArr;
        Cursor a;
        Throwable th;
        p(str, str2);
        if (!TextUtils.isEmpty(str) && (TextUtils.isEmpty(str2) || TextUtils.equals(str2, str))) {
            str6 = "gaia_id=?";
            strArr = new String[]{str};
        } else if (!TextUtils.isEmpty(str2)) {
            str6 = "chat_id=?";
            strArr = new String[]{str2};
        } else if (!TextUtils.isEmpty(str4)) {
            str6 = "circle_id=?";
            strArr = new String[]{str4};
        } else if (TextUtils.isEmpty(str3)) {
            return -1;
        } else {
            str6 = "phone_id=?";
            strArr = new String[]{str3};
        }
        try {
            int i;
            a = this.e.a("participants_view", j, str6, strArr, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        i = a.getInt(0);
                        a(a, str5);
                        if (a != null) {
                            a.close();
                        }
                        if (!z && i < 0) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("batch_gebi_tag", "-1");
                            if (TextUtils.isEmpty(str4)) {
                                if (!TextUtils.isEmpty(str)) {
                                    contentValues.put("gaia_id", str);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    contentValues.put("chat_id", str2);
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    contentValues.put("participant_type", Integer.valueOf(edq.PERSON.ordinal()));
                                } else {
                                    contentValues.put("phone_id", str3);
                                    contentValues.put("participant_type", Integer.valueOf(edq.PHONE.ordinal()));
                                }
                            } else {
                                contentValues.put("circle_id", str4);
                                contentValues.put("participant_type", Integer.valueOf(edq.CIRCLE.ordinal()));
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                contentValues.put("fallback_name", str5);
                            }
                            i = (int) this.e.a("participants", null, contentValues);
                            if (i >= 0) {
                                return i;
                            }
                            glk.e("Babel_ConvHelper", "insert failed", new Object[0]);
                            return i;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            i = -1;
            if (a != null) {
                a.close();
            }
            return !z ? i : i;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public edk F(String str) {
        Throwable th;
        edk edk = null;
        if (c) {
            String str2 = "cacheParticipantRow for: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Cursor a;
        try {
            a = this.e.a("participants_view", j, "_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToNext()) {
                        edk = a(a, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return edk;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void a(Map<String, bka> map) {
        Cursor a = this.e.a("participants", bmj.a, null, null, null, null, null);
        if (a != null) {
            while (a.moveToNext()) {
                try {
                    bka bka = (bka) map.get(a.getString(0));
                    if (bka != null) {
                        bka.b = a.getString(1);
                    }
                } finally {
                    a.close();
                }
            }
        }
    }

    public void G(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Integer.valueOf(0));
        this.e.a("conversation_participants", contentValues, x, new String[]{str, String.valueOf(edq.CIRCLE.ordinal())});
    }

    public void s() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.FAILED_TO_SEND.ordinal()));
        a();
        try {
            String valueOf = String.valueOf("status=");
            int size = a(contentValues, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(fwx.SENDING.ordinal()).toString(), null).size();
            b();
            if (c) {
                new StringBuilder(47).append("failAnySendingMessages patched ").append(size).append(" rows");
            }
        } finally {
            c();
        }
    }

    public List<edk> H(String str) {
        String valueOf;
        Throwable th;
        Cursor cursor;
        if (c) {
            String str2 = "queryParticipantIdFirstNames ConversationId: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        List<edk> arrayList = new ArrayList();
        try {
            Cursor a = this.e.a("conversation_participants_view", new String[]{"gaia_id", "chat_id", "circle_id", "first_name", "full_name", "fallback_name", "profile_photo_url", "participant_type", "phone_id", "in_users_domain"}, "conversation_id=? AND active=1", new String[]{String.valueOf(str)}, null, null, "sequence ASC");
            while (a.moveToNext()) {
                String string = a.getString(3);
                String string2 = a.getString(6);
                edq edq = edq.values()[a.getInt(7)];
                valueOf = a.getString(4);
                if (edq == edq.PERSON) {
                    edo edo = new edo(a.getString(0), a.getString(1));
                    String string3 = a.getString(5);
                    boolean z = a.getInt(9) != 0;
                    edk a2 = gwb.a(edo, valueOf, string, string3, string2, null);
                    a2.y = z;
                    arrayList.add(a2);
                } else {
                    try {
                        if (edq == edq.CIRCLE) {
                            arrayList.add(gwb.b(a.getString(2), valueOf));
                        } else if (edq == edq.PHONE) {
                            arrayList.add(gwb.a(this.a, a.getString(8), valueOf, string2));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = a;
                    }
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public List<fbw> I(String str) {
        if (c) {
            String str2 = "queryInvitees: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        List<fbw> arrayList = new ArrayList();
        SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter('|');
        simpleStringSplitter.setString(str);
        Iterator it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            arrayList.add(fbw.a(F((String) it.next())));
        }
        return arrayList;
    }

    public String b(String str, List<fbw> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (fbw fbw : list) {
            int a = a(str, fbw.a, fbw.b, fbw.d, fbw.c, fbw.e);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('|');
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public String c(String str, List<fbv> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (fbv fbv : list) {
            int a = a(str, fbv.a.a, fbv.a.b, fbv.a.d, fbv.a.c, fbv.a.e);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('|');
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public gkr J(String str) {
        Cursor a;
        Throwable th;
        if (c) {
            String str2 = "getActiveConversationParticipants ConversationId: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        gkr gkr = new gkr();
        try {
            a = this.e.a("conversation_participants_view", new String[]{"gaia_id", "chat_id", "phone_id"}, "conversation_id=? AND active=?", new String[]{str, "1"}, null, null, null);
            while (a.moveToNext()) {
                try {
                    gkr.add(new edo(a.getString(0), a.getString(1)));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return gkr;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashSet<defpackage.edo> r14) {
        /*
        r13 = this;
        r12 = 1;
        r11 = 0;
        r8 = 0;
        r9 = new java.util.HashSet;
        r9.<init>();
        r10 = r14.iterator();
    L_0x000c:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x0068;
    L_0x0012:
        r0 = r10.next();
        r0 = (defpackage.edo) r0;
        r1 = r0.a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x004f;
    L_0x0020:
        r3 = "gaia_id=?";
        r4 = new java.lang.String[r12];
        r0 = r0.a;
        r4[r11] = r0;
    L_0x0028:
        r0 = r13.e;	 Catch:{ all -> 0x0060 }
        r1 = "conversation_participants_view";
        r2 = r;	 Catch:{ all -> 0x0060 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r1 = r0.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0060 }
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x0049;
    L_0x003b:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0082 }
        r9.add(r0);	 Catch:{ all -> 0x0082 }
        r0 = r1.moveToNext();	 Catch:{ all -> 0x0082 }
        if (r0 != 0) goto L_0x003b;
    L_0x0049:
        if (r1 == 0) goto L_0x000c;
    L_0x004b:
        r1.close();
        goto L_0x000c;
    L_0x004f:
        r1 = r0.b;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x000c;
    L_0x0057:
        r3 = "chat_id=?";
        r4 = new java.lang.String[r12];
        r0 = r0.b;
        r4[r11] = r0;
        goto L_0x0028;
    L_0x0060:
        r0 = move-exception;
        r1 = r8;
    L_0x0062:
        if (r1 == 0) goto L_0x0067;
    L_0x0064:
        r1.close();
    L_0x0067:
        throw r0;
    L_0x0068:
        r1 = r9.iterator();
    L_0x006c:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0081;
    L_0x0072:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        defpackage.blf.b(r13, r0);
        r0 = r13.f;
        defpackage.blf.a(r0);
        goto L_0x006c;
    L_0x0081:
        return;
    L_0x0082:
        r0 = move-exception;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: blo.a(java.util.HashSet):void");
    }

    public void K(String str) {
        edk L = L(str);
        this.e.a("suggested_contacts", "gaia_id=?", new String[]{str});
        if (L != null) {
            d(str, null, L.e, L.h);
        }
        ((dwt) jyn.a(this.a, dwt.class)).a(g().g());
        this.e.a(EsProvider.k);
    }

    public void b(List<edk> list, int i) {
        this.e.a("suggested_contacts", "suggestion_type=?", new String[]{String.valueOf(i)});
        ContentValues contentValues = new ContentValues();
        int i2 = 0;
        for (edk edk : list) {
            if (!(TextUtils.isEmpty(edk.f) || TextUtils.isEmpty(edk.e))) {
                contentValues.clear();
                contentValues.put("chat_id", edk.b.b);
                contentValues.put("gaia_id", edk.b.a);
                contentValues.put("name", edk.e);
                contentValues.put("first_name", edk.f);
                contentValues.put("profile_photo_url", edk.h);
                contentValues.put("packed_circle_ids", edk.r);
                contentValues.put("sequence", Integer.valueOf(i2));
                contentValues.put("suggestion_type", Integer.valueOf(i));
                contentValues.put("logging_id", edk.C);
                contentValues.put("affinity_score", Float.valueOf(edk.D));
                contentValues.put("is_in_same_domain", Boolean.valueOf(edk.y));
                this.e.a("suggested_contacts", null, contentValues);
                i2++;
            }
        }
        this.e.a(EsProvider.k);
    }

    public List<edk> b(int i) {
        Throwable th;
        Cursor cursor;
        List<edk> arrayList = new ArrayList();
        try {
            Cursor a = this.e.a("suggested_contacts", i, "suggestion_type=?", new String[]{"3"}, null, null, null);
            if (a != null) {
                while (a.moveToNext()) {
                    try {
                        arrayList.add(gwb.a(new edo(a.getString(0), a.getString(1)), a.getString(2), a.getString(3), null, a.getString(4), a.getString(5)));
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = a;
                    }
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public edk L(String str) {
        Throwable th;
        Cursor cursor;
        edk edk = null;
        try {
            Cursor a = this.e.a("suggested_contacts", i, "gaia_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToNext()) {
                        edk = gwb.a(new edo(a.getString(0), a.getString(1)), a.getString(2), a.getString(3), null, a.getString(4), a.getString(5));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return edk;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public long c(int i) {
        long a = bkq.a(this.a, g().g(), EsProvider.a(i), -1);
        if (a == -3) {
            return -2;
        }
        return a;
    }

    public void a(long j, int i) {
        bkq.b(this.a, g().g(), EsProvider.a(i), j);
    }

    private void d(int i) {
        bkq.b(this.a, g().g(), EsProvider.a(i));
    }

    public void t() {
        for (int i = 1; i <= 4; i++) {
            d(i);
        }
    }

    public long M(String str) {
        return d(str, 1);
    }

    public long d(String str, int i) {
        return blo.b(O(str), i);
    }

    public static long b(long j, int i) {
        long a = glj.a() * 1000;
        if (a > j) {
            return a;
        }
        a = j % ((long) i);
        return (a == 0 ? (long) i : ((long) i) - a) + j;
    }

    public void e(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("view", Integer.valueOf(i));
        if (this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str}) != 0) {
            blf.d(this);
        }
    }

    public void f(String str, long j) {
        gwb.aK();
        ba.a(j >= 0, (Object) "Valid timestamps must be positive.");
        bmv bmv = this.e;
        String valueOf = String.valueOf("UPDATE conversations SET last_share_timestamp=");
        String valueOf2 = String.valueOf("conversation_id");
        bmv.a(new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append(valueOf).append(j).append(" WHERE ").append(valueOf2).append("=?").toString(), new String[]{String.valueOf(str)});
        this.e.a("UPDATE conversations SET share_count=share_count+1 WHERE conversation_id=?", new String[]{String.valueOf(str)});
    }

    public void b(String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("attachment_uploading_progress", Integer.valueOf(i));
        a(contentValues, "conversation_id=? AND message_id=?", new String[]{str, str2});
    }

    public blv N(String str) {
        Throwable th;
        blv blv = null;
        if (c) {
            String str2 = "getTimestamps, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Cursor a;
        try {
            a = this.e.a("conversations", new String[]{"sort_timestamp", "self_watermark"}, "conversation_id=?", new String[]{String.valueOf(str)}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    blv = new blv(a.getLong(0), a.getLong(1));
                }
                if (a != null) {
                    a.close();
                }
                return blv;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public long O(String str) {
        return a("getSortTimestamp", str, "sort_timestamp", 0);
    }

    public void g(String str, long j) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 68).append("updateSortTimestamp, conversationId=").append(str).append(", timestamp=").append(j);
        }
        a();
        try {
            Object h = h(str, j);
            b();
            if (h > null) {
                blf.d(this);
            }
        } finally {
            c();
        }
    }

    public int h(String str, long j) {
        if (j >= O(str)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sort_timestamp", Long.valueOf(j));
            return this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        } else if (!c) {
            return 0;
        } else {
            new StringBuilder(String.valueOf(str).length() + 129).append("Skip updateSortTimestamp because new timestamp is smaller than current timestamp, conversationId=").append(str).append(", timestamp=").append(j);
            return 0;
        }
    }

    public void i(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sort_timestamp", Long.valueOf(j));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public Cursor a(String str, fwx fwx, String[] strArr) {
        return this.e.a("messages", strArr, "conversation_id = ? AND status = ?", new String[]{str, String.valueOf(fwx.ordinal())}, null, null, "timestamp ASC");
    }

    private static bml a(bml bml, long j, long j2) {
        long c = fqo.a().c();
        bml bml2 = new bml();
        if (j >= c + bml.c) {
            bml2.a = bml.c;
            bml2.b = bml.d;
            bml2.c = j;
            bml2.d = j2;
        } else if (j2 > bml.d) {
            return bml;
        } else {
            bml2.a = bml.a;
            bml2.b = bml.b;
            bml2.c = j;
            bml2.d = j2;
        }
        return bml2;
    }

    private static long a(bml bml) {
        if (bml == null) {
            return 0;
        }
        long c = fqo.a().c();
        long j = Long.MAX_VALUE;
        long a = glj.a();
        if (a < bml.a + (2 * c)) {
            j = bml.b;
        }
        if (a >= (c * 2) + bml.c || j <= bml.d) {
            return j;
        }
        return bml.d;
    }

    private bml H() {
        if (c) {
            String str = "getConversationScrollInfo: account=";
            String valueOf = String.valueOf(this.f.a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        bml bml = new bml();
        int g = g().g();
        bml.a = bkq.a(this.a, g, "first_peak_scroll_time", 0);
        bml.b = bkq.a(this.a, g, "first_peak_scroll_to_conversation_timestamp", 0);
        bml.c = bkq.a(this.a, g, "second_peak_scroll_time", 0);
        bml.d = bkq.a(this.a, g, "second_peak_scroll_to_conversation_timestamp", 0);
        return bml;
    }

    public long u() {
        return blo.a(H());
    }

    public void a(long j, long j2) {
        if (c) {
            new StringBuilder(111).append("updateConversationScrollTime: scrollTime=").append(j).append(" scrollToConverationTimestamp=").append(j2);
        }
        a();
        try {
            bml H = H();
            bml a = blo.a(H, j, j2);
            if (a != H) {
                int g = g().g();
                if (a.a != H.a) {
                    bkq.b(this.a, g, "first_peak_scroll_time", a.a);
                }
                if (a.b != H.b) {
                    bkq.b(this.a, g, "first_peak_scroll_to_conversation_timestamp", a.b);
                }
                if (a.c != H.c) {
                    bkq.b(this.a, g, "second_peak_scroll_time", a.c);
                }
                if (a.d != H.d) {
                    bkq.b(this.a, g, "second_peak_scroll_to_conversation_timestamp", a.d);
                }
            }
            b();
        } finally {
            c();
        }
    }

    private bml al(String str) {
        Throwable th;
        Cursor cursor = null;
        if (c) {
            String valueOf = String.valueOf(this.f.a());
            new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("getMessageScrollInfo: conversationId=").append(str).append(" account=").append(valueOf);
        }
        try {
            Cursor a = this.e.a("conversations", y, "conversation_id=?", new String[]{String.valueOf(str)}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    bml bml = new bml();
                    bml.a = a.getLong(0);
                    bml.b = a.getLong(1);
                    bml.c = a.getLong(2);
                    bml.d = a.getLong(3);
                    if (a == null) {
                        return bml;
                    }
                    a.close();
                    return bml;
                }
                if (a != null) {
                    a.close();
                }
                String str2 = "Babel_ConvHelper";
                String str3 = "Not able to get message scroll info for conversationId=";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                glk.d(str2, valueOf, new Object[0]);
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = a;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public long P(String str) {
        return blo.a(al(str));
    }

    public void b(String str, long j, long j2) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 118).append("updateMessageScrollTime: conversationId=").append(str).append(" scrollTime=").append(j).append(" scrollToMessageTimestamp=").append(j2);
        }
        a();
        try {
            bml al = al(str);
            if (al == null) {
                b();
                return;
            }
            bml a = blo.a(al, j, j2);
            if (a != al) {
                ContentValues contentValues = new ContentValues();
                if (a.a != al.a) {
                    contentValues.put("first_peak_scroll_time", Long.valueOf(a.a));
                }
                if (a.b != al.b) {
                    contentValues.put("first_peak_scroll_to_message_timestamp", Long.valueOf(a.b));
                }
                if (a.c != al.c) {
                    contentValues.put("second_peak_scroll_time", Long.valueOf(a.c));
                }
                if (a.d != al.d) {
                    contentValues.put("second_peak_scroll_to_message_timestamp", Long.valueOf(a.d));
                }
                if (contentValues.size() > 0) {
                    this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
                }
            }
            b();
            c();
        } finally {
            c();
        }
    }

    public List<Long> b(int i, int i2) {
        String str;
        String valueOf;
        Throwable th;
        if (c) {
            str = "getConversationTimestamps: account=";
            valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        Cursor a;
        try {
            String[] strArr;
            String str2 = "transport_type!=3";
            if (i2 == -1) {
                strArr = null;
            } else if (i2 == 1) {
                str = String.valueOf("status");
                valueOf = String.valueOf("inviter_affinity");
                str2 = new StringBuilder(((String.valueOf(str2).length() + 14) + String.valueOf(str).length()) + String.valueOf(valueOf).length()).append(str2).append(" AND ").append(str).append("=? AND ").append(valueOf).append("=?").toString();
                strArr = new String[]{String.valueOf(i2), "1"};
            } else {
                str = String.valueOf("status");
                str2 = new StringBuilder((String.valueOf(str2).length() + 7) + String.valueOf(str).length()).append(str2).append(" AND ").append(str).append("=?").toString();
                strArr = new String[]{String.valueOf(i2)};
            }
            a = this.e.a("conversations", z, str2, strArr, null, null, "sort_timestamp DESC", String.valueOf(i));
            try {
                List<Long> arrayList = new ArrayList();
                while (a.moveToNext()) {
                    arrayList.add(Long.valueOf(a.getLong(0)));
                }
                if (a != null) {
                    a.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public List<String> v() {
        Throwable th;
        List<String> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("conversations", A, "transport_type!=3 AND call_media_type!=0", null, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        do {
                            arrayList.add(a.getString(0));
                        } while (a.moveToNext());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void w() {
        if (c) {
            String str = "deleteAllConversations: account=";
            String valueOf = String.valueOf(glk.b(this.f.a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        this.e.a("conversations", null, null);
        blf.d(this);
    }

    public boolean c(long j, int i) {
        if (c) {
            String valueOf = String.valueOf(glk.b(this.f.a()));
            new StringBuilder(String.valueOf(valueOf).length() + 69).append("deleteOldConversations: account=").append(valueOf).append(" cutOffTimestamp=").append(j);
        }
        String[] strArr = new String[]{String.valueOf(j), String.valueOf(i)};
        int a = a(B, strArr);
        if (a > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("continuation_event_timestamp", Integer.valueOf(0));
            contentValues.putNull("continuation_token");
            contentValues.put("has_oldest_message", Boolean.valueOf(false));
            this.e.a("conversations", contentValues, "sort_timestamp<? AND status=? AND transport_type!=3", strArr);
            blf.d(this);
        }
        if (a > 0 && c) {
            new StringBuilder(102).append("deleteOldConversations:").append(a).append(" cutOffTimestamp:").append(j).append(" conversationStatus:").append(i);
        }
        if (c) {
            new StringBuilder(38).append("Deleted ").append(a).append(" old conversations.");
        }
        if (a > 0) {
            return true;
        }
        return false;
    }

    public void a(int i, long j) {
        if (c) {
            String valueOf = String.valueOf(glk.b(this.f.a()));
            new StringBuilder(String.valueOf(valueOf).length() + 80).append("deleteAllInvites: affinity=").append(i).append(", timestamp=").append(j).append(", account=").append(valueOf);
        }
        this.e.a();
        try {
            int a = this.e.a("conversations", "view=? AND status=? AND inviter_affinity=? AND sort_timestamp<?", new String[]{"1", "1", String.valueOf(i), String.valueOf(j)});
            this.e.b();
            if (a > 0 && c) {
                new StringBuilder(60).append("deleteAllInvites: Removed ").append(a).append(" (affinity:").append(i).append(")");
            }
            blf.d(this);
        } finally {
            this.e.c();
        }
    }

    private void I() {
        a(2, TimeUnit.MILLISECONDS.toMicros(((jhx) jyn.a(this.a, jhx.class)).a()));
    }

    private void J() {
        a(1, TimeUnit.MILLISECONDS.toMicros(((jhx) jyn.a(this.a, jhx.class)).a()));
    }

    public List<Long> f(String str, int i) {
        Cursor a;
        Throwable th;
        if (c) {
            String valueOf = String.valueOf(glk.b(this.f.a()));
            new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(str).length()).append("getMessageTimestamps: account=").append(valueOf).append(" conversationId=").append(str);
        }
        try {
            a = this.e.a("messages", C, "conversation_id=?", new String[]{str}, null, null, "timestamp DESC", String.valueOf(i));
            try {
                List<Long> arrayList = new ArrayList();
                while (a.moveToNext()) {
                    arrayList.add(Long.valueOf(a.getLong(0)));
                }
                if (a != null) {
                    a.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public int j(String str, long j) {
        if (c) {
            String valueOf = String.valueOf(glk.b(this.f.a()));
            new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(str).length()).append("deleteOldMessages: account=").append(valueOf).append(" conversationId=").append(str).append(" cutOffTimestamp=").append(j);
        }
        a(str, null, j);
        int a = a("conversation_id=? AND timestamp<? AND transport_type!=3", new String[]{str, String.valueOf(j)});
        blf.d(this, str);
        return a;
    }

    public int b(String str, boolean z) {
        List a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("notified_for_failure", Integer.valueOf(1));
        if (TextUtils.isEmpty(str)) {
            a = a(contentValues, "notified_for_failure=?", new String[]{"0"});
        } else {
            a = a(contentValues, "notified_for_failure=? AND conversation_id=?", new String[]{"0", str});
        }
        return a.size();
    }

    public void Q(String str) {
        ContentValues contentValues = new ContentValues();
        this.e.a();
        try {
            contentValues.put("alert_in_conversation_list", Integer.valueOf(0));
            this.e.a("messages", contentValues, "conversation_id=? AND alert_in_conversation_list=?", new String[]{str, "1"});
            this.e.b();
        } finally {
            this.e.c();
        }
    }

    private void h(String str, int i) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 74).append("setConversationInviteDisposition, conversationId=").append(str).append(", disposition=").append(i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("disposition", Integer.valueOf(i));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.d(this);
    }

    public void R(String str) {
        if (c) {
            String str2 = "confirmConversationInvite, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(2));
            contentValues.put("disposition", Integer.valueOf(0));
            contentValues.put("notification_level", Integer.valueOf(30));
            this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
            blf.a(g().g());
            b();
        } finally {
            c();
        }
    }

    public String S(String str) {
        String str2 = null;
        Cursor a = e().a("conversations", D, "conversation_id=?", new String[]{str}, null, null, null);
        if (a != null) {
            try {
                if (a.moveToFirst() && a.getInt(0) == 1) {
                    List<edk> H = H(str);
                    edo b = g().b();
                    for (edk edk : H) {
                        edo edo = edk.b;
                        if (!b.equals(edo)) {
                            str2 = edo.a;
                            break;
                        }
                    }
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return str2;
    }

    public long T(String str) {
        return a("getConversationPendingStatus", str, "is_pending_leave", 0);
    }

    public void k(String str, long j) {
        a(str, j, false);
    }

    public void l(String str, long j) {
        a(str, j, true);
    }

    private void a(String str, long j, boolean z) {
        long T = T(str);
        if (z) {
            T |= j;
        } else {
            T &= -1 ^ j;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending_leave", Long.valueOf(T));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public boolean m(String str, long j) {
        Throwable th;
        Cursor a;
        try {
            a = this.e.a("conversations", new String[]{"is_pending_leave"}, "conversation_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        boolean z = (a.getLong(0) & j) != 0;
                        if (a == null) {
                            return z;
                        }
                        a.close();
                        return z;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void b(long j, fwx fwx, long j2) {
        String valueOf;
        if (c) {
            valueOf = String.valueOf(fwx);
            new StringBuilder(String.valueOf(valueOf).length() + 93).append("setMmsNotificationStatus: messageRowId=").append(j).append(", status=").append(valueOf).append(", ts=").append(j2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.ordinal()));
        if (j2 > 0) {
            contentValues.put("sms_timestamp_sent", Long.valueOf(1000 * j2));
        }
        String valueOf2 = String.valueOf("_id=");
        valueOf = String.valueOf(String.valueOf(j));
        a(contentValues, valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2), null);
    }

    public String U(String str) {
        return a("getSmsServiceCenter", str, "sms_service_center");
    }

    public void l(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sms_service_center", str2);
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public long V(String str) {
        return a("getSmsThreadId", str, "sms_thread_id", -1);
    }

    public void n(String str, long j) {
        if (V(str) == -1 && j > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sms_thread_id", Long.valueOf(j));
            this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
        }
    }

    public void a(long j, int i, long j2) {
        ContentValues contentValues = new ContentValues();
        this.e.a();
        try {
            contentValues.put("sms_message_status", Integer.valueOf(i));
            contentValues.put("sms_timestamp_sent", Long.valueOf(j2));
            String valueOf = String.valueOf("_id=");
            String valueOf2 = String.valueOf(String.valueOf(j));
            a(contentValues, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null);
            this.e.b();
        } finally {
            this.e.c();
        }
    }

    public void c(String str, boolean z) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 65).append("updateConversationIsTemporary, conversationId ").append(str).append(", isTemporary=").append(z);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_temporary", Integer.valueOf(z ? 1 : 0));
        this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public boolean W(String str) {
        return a("getConversationIsTemporary", str, "is_temporary", 0) == 1;
    }

    public void a(String str, esu esu, List<esu> list) {
        if (c) {
            String valueOf = String.valueOf(esu);
            String valueOf2 = String.valueOf(esu.a(list));
            new StringBuilder(((String.valueOf(str).length() + 85) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("updateDeliveryMediums, conversationId ").append(str).append(", default delivery medium=").append(valueOf).append(", deliveryMediumList=").append(valueOf2);
        }
        if (esu != null) {
            ContentValues contentValues = new ContentValues();
            this.e.a();
            try {
                contentValues.put("transport_type", Integer.valueOf(esu.a));
                contentValues.put("default_transport_phone", esu.b);
                this.e.a("conversations", contentValues, "conversation_id=?", new String[]{str});
                this.e.b();
            } finally {
                this.e.c();
            }
        }
    }

    public void a(String str, long j, edo edo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_type", Integer.valueOf(1));
        contentValues.put("is_pending_leave", Integer.valueOf(0));
        contentValues.put("conversation_id", str);
        contentValues.put("has_persistent_events", Boolean.valueOf(false));
        contentValues.put("status", Integer.valueOf(2));
        contentValues.put("view", Integer.valueOf(1));
        contentValues.put("is_draft", Integer.valueOf(0));
        contentValues.put("has_oldest_message", Integer.valueOf(0));
        contentValues.put("call_media_type", Integer.valueOf(0));
        contentValues.put("notification_level", Integer.valueOf(30));
        contentValues.put("disposition", Integer.valueOf(0));
        contentValues.put("otr_status", Integer.valueOf(2));
        contentValues.put("otr_toggle", Boolean.valueOf(false));
        contentValues.put("is_temporary", Boolean.valueOf(true));
        contentValues.putNull("name");
        contentValues.put("inviter_gaia_id", edo.a);
        contentValues.put("inviter_chat_id", edo.b);
        contentValues.put("sort_timestamp", Long.valueOf(j));
        this.e.a("conversations", null, contentValues);
    }

    public int x() {
        String format = String.format(Locale.US, "(%s=%d) AND (%s=%d) AND %s", new Object[]{"transport_type", Integer.valueOf(3), "sms_type", Integer.valueOf(1), fyi.a("attachment_content_type")});
        if (glk.a("Babel_ConvHelper", 3)) {
            String str = "Babel_ConvHelper";
            String str2 = "deleteSmsMediaMessags: selection = ";
            String valueOf = String.valueOf(format);
            glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        return a(format, null);
    }

    public int l(long j) {
        return a(String.format(Locale.US, "(%s=%d) AND (%s<=?)", new Object[]{"transport_type", Integer.valueOf(3), "timestamp"}), new String[]{Long.toString(j)});
    }

    public String X(String str) {
        String str2;
        Throwable th;
        if (c) {
            str2 = "getStreamUrlForPhotoId, photoId =";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Cursor a;
        try {
            a = this.e.a("messages", new String[]{"stream_url", "stream_expiration"}, "image_id=?", new String[]{str}, null, null, null);
            try {
                long a2 = glj.a();
                str2 = null;
                while (a.moveToNext()) {
                    str2 = a.getString(0);
                    long j = a.getLong(1);
                    if (!TextUtils.isEmpty(str2) && a2 < j) {
                        a(str, str2, j);
                        if (a != null) {
                            a.close();
                        }
                        return str2;
                    }
                }
                if (a != null) {
                    a.close();
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void a(String str, String str2, long j) {
        if (c) {
            new StringBuilder((String.valueOf(str).length() + 50) + String.valueOf(str2).length()).append("updateStreamUrlForPhotoId, photoId = ").append(str).append(", streamUrl =").append(str2);
        }
        this.e.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stream_url", str2);
            contentValues.put("stream_expiration", Long.valueOf(j));
            a(contentValues, "image_id=?", new String[]{str});
            this.e.b();
        } finally {
            this.e.c();
        }
    }

    public String Y(String str) {
        Throwable th;
        String str2 = null;
        if (c) {
            String str3 = "getConversationIdForPhotoId, photoId =";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        Cursor a;
        try {
            a = this.e.a("messages", new String[]{"conversation_id"}, "image_id=?", new String[]{str}, null, null, null);
            try {
                if (a.moveToNext()) {
                    str2 = a.getString(0);
                }
                if (a != null) {
                    a.close();
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public long a(ContentValues contentValues) {
        this.e.a();
        try {
            long a = this.e.a("mms_notification_inds", null, contentValues);
            this.e.b();
            return a;
        } finally {
            this.e.c();
        }
    }

    public int m(long j) {
        if (c) {
            new StringBuilder(42).append("deleteMmsNotification ").append(j);
        }
        a();
        try {
            int a = this.e.a("mms_notification_inds", "_id=?", new String[]{String.valueOf(j)});
            b();
            return a;
        } finally {
            c();
        }
    }

    public void g(String str, int i) {
        a();
        try {
            h(str, i);
            b();
        } finally {
            c();
        }
    }

    public void Z(String str) {
        if (glk.a("Babel_ConvHelper", 3)) {
            String str2 = "Babel_ConvHelper";
            String str3 = "acceptConversationLocally conversationId: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.a(str2, valueOf, new Object[0]);
        }
        a();
        try {
            c(str, 2);
            h(str, 1);
            b(str, 30);
            b();
        } finally {
            c();
        }
    }

    public void y() {
        glk.a("Babel_ConvHelper", "removeSmsConversationsTransaction", new Object[0]);
        a();
        try {
            G();
            b();
        } finally {
            c();
        }
    }

    public void aa(String str) {
        glk.a("Babel_ConvHelper", "removeConversationTransaction", new Object[0]);
        a();
        try {
            B(str);
            b();
        } finally {
            c();
        }
    }

    public void z() {
        a();
        try {
            I();
            d(4);
            b();
        } finally {
            c();
        }
    }

    public void A() {
        a();
        try {
            J();
            d(3);
            b();
        } finally {
            c();
        }
    }

    public String n(long j) {
        String str = null;
        Cursor a = this.e.a("messages", F, "_id=?", new String[]{Long.toString(j)}, null, null, null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    str = a.getString(0);
                } else {
                    a.close();
                }
            } finally {
                a.close();
            }
        }
        return str;
    }

    public Set<String> ab(String str) {
        Set<String> set = blu.a;
        Cursor a = this.e.a("merge_keys", (String[]) set, "merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)", new String[]{str}, null, null, null);
        try {
            boolean z;
            set = new HashSet();
            if (a != null) {
                while (a.moveToNext()) {
                    set.add(a.getString(0));
                }
            }
            if (set.contains(str) || set.size() == 0 || !TextUtils.isEmpty(RealTimeChatService.a(str))) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            return set;
        } finally {
            if (a != null) {
                a.close();
            }
        }
    }

    public List<bls> ac(String str) {
        Cursor a = this.e.a("merge_keys", blu.a, "merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)", new String[]{str}, null, null, null);
        try {
            List<bls> arrayList = new ArrayList();
            if (a != null) {
                while (a.moveToNext()) {
                    arrayList.add(e(a.getString(0)));
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (a != null) {
                a.close();
            }
        }
    }

    public Set<String> ad(String str) {
        Set<String> ab = ab(str);
        ab.remove(str);
        return ab;
    }

    public static void a(Context context) {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        bbm bbm = (bbm) jyn.a(context, bbm.class);
        for (bko bko : fde.o()) {
            try {
                int g = bko.g();
                if (bbm.d(g)) {
                    blo blo = new blo(context, g);
                    blo.a(context, bko, true);
                    blo.a(blo, null);
                    blf.a(g);
                }
            } catch (jcj e2) {
                e = e2;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.b(bko.a()));
                glk.c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            } catch (bmu e3) {
                e = e3;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.b(bko.a()));
                if (valueOf.length() == 0) {
                }
                glk.c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            }
        }
    }

    public static void b(Context context) {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        bbm bbm = (bbm) jyn.a(context, bbm.class);
        for (bko bko : fde.o()) {
            try {
                int g = bko.g();
                if (bbm.d(g)) {
                    blo.a(context, bko, false);
                    blf.a(g);
                }
            } catch (jcj e2) {
                e = e2;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.b(bko.a()));
                glk.c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            } catch (bmu e3) {
                e = e3;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.b(bko.a()));
                if (valueOf.length() == 0) {
                }
                glk.c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            }
        }
    }

    public static String c(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int append : fde.r()) {
            stringBuilder.append(append).append("|");
        }
        stringBuilder.append(((gmp) jyn.a(context, gmp.class)).c());
        return stringBuilder.toString();
    }

    public static void d(Context context) {
        for (int a : fde.f()) {
            blo.a(context, a);
        }
    }

    public static void a(Context context, int i) {
        String str;
        String valueOf;
        bko e = fde.e(i);
        if (e != null) {
            try {
                if (((jcf) jyn.a(gwb.H(), jcf.class)).a(i).b("effective_gaia_id") == null) {
                    blo blo = new blo(context, i);
                    bjm a = ((bjn) jyn.a(context, bjn.class)).a(e.g());
                    iil.a("Expected condition to be true", a.b());
                    a.a();
                    long a2 = glj.a();
                    int b = blo.b(blo, null) + 0;
                    long a3 = glj.a();
                    b += blo.a(blo, null);
                    a2 = a3 - a2;
                    new StringBuilder(77).append("refreshContactsDerivedData timing ").append(a2).append(" & ").append(glj.a() - a3);
                    if (b > 0) {
                        blf.d(blo);
                        return;
                    }
                    return;
                }
                return;
            } catch (jcj e2) {
                Throwable e3 = e2;
                String str2 = "Babel_ConvHelper";
                str = "Account removed: ";
                valueOf = String.valueOf(glk.b(e.a()));
                if (valueOf.length() == 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                glk.c(str2, valueOf, e3);
                return;
            } catch (bmu e4) {
                e3 = e4;
                String str22 = "Babel_ConvHelper";
                str = "Account removed: ";
                valueOf = String.valueOf(glk.b(e.a()));
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                glk.c(str22, valueOf, e3);
                return;
            } catch (Throwable th) {
                a.a();
            }
        }
        glk.d("Babel", "Can not find account in BabelAccountManager. smsAccountId: " + i, new Object[0]);
    }

    private static void a(Context context, bko bko, boolean z) {
        blo blo = new blo(context, bko.g());
        Locale locale = Locale.US;
        String str = "update merge_keys set merge_key=\"%s\"||conversation_id;";
        Object[] objArr = new Object[1];
        objArr[0] = z ? "" : bnr.MANUAL.f;
        blo.e().a(String.format(locale, str, objArr));
    }

    public void a(String[] strArr) {
        bmv e = e();
        Object arrayList = new ArrayList();
        e.a();
        try {
            ContentValues contentValues = new ContentValues();
            for (String str : strArr) {
                contentValues.clear();
                String a = bnr.MANUAL.a(str);
                contentValues.put("merge_key", a);
                e.a("merge_keys", contentValues, "conversation_id=?", new String[]{str});
                arrayList.add(new Pair(str, a));
            }
            e.b();
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Pair pair = (Pair) arrayList2.get(i);
                RealTimeChatService.a((String) pair.first, (String) pair.second);
                i = i2;
            }
            blf.a(this.f.g());
        } finally {
            e.c();
        }
    }

    public static int a(blo blo, String str) {
        int i = 0;
        Cursor ag = blo.ag(str);
        if (ag != null) {
            int i2 = 0;
            while (ag.moveToNext()) {
                try {
                    int i3;
                    bls a = blo.a(ag);
                    String a2 = blo.a(a);
                    if (!TextUtils.isEmpty(a.t) && TextUtils.equals(a2, a.t)) {
                        i3 = 0;
                    } else if (bnr.MANUAL.b(a.t)) {
                        i3 = 0;
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("merge_key", a2);
                        contentValues.put("conversation_id", a.s);
                        blo.e().a("merge_keys", null, contentValues);
                        RealTimeChatService.a(a.s, a2);
                        i3 = 1;
                    }
                    i2 += i3;
                } finally {
                    ag.close();
                }
            }
            i = i2;
        }
        if (i > 0) {
            blo.am(str);
        }
        return i;
    }

    private void am(String str) {
        Cursor a;
        Throwable th;
        this.e.a();
        try {
            if (TextUtils.isEmpty(str)) {
                a = this.e.a("conversations JOIN merge_keys ON (conversations.conversation_id=merge_keys.conversation_id)", bmc.a, "conversation_type=1", null, null, null, null);
            } else {
                a = this.e.a("conversations JOIN merge_keys ON (conversations.conversation_id=merge_keys.conversation_id)", bmc.a, "conversation_type=1 AND conversations.conversation_id=?", new String[]{str}, null, null, null);
            }
            if (a != null) {
                ContentValues contentValues = null;
                while (a.moveToNext()) {
                    String string = a.getString(0);
                    String string2 = a.getString(1);
                    String string3 = a.getString(2);
                    if (string2 != null || string3 != null) {
                        if (contentValues == null) {
                            contentValues = new ContentValues();
                        } else {
                            try {
                                contentValues.clear();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (string2 != null) {
                            contentValues.put("chat_ringtone_uri", string2);
                        }
                        if (string3 != null) {
                            contentValues.put("hangout_ringtone_uri", string3);
                        }
                        if (contentValues.size() > 0) {
                            this.e.a("conversations", contentValues, "conversation_id IN (SELECT conversation_id FROM merge_keys WHERE merge_key=?)", new String[]{string});
                        }
                    }
                }
            }
            this.e.b();
            if (a != null) {
                a.close();
            }
            this.e.c();
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            this.e.c();
            throw th;
        }
    }

    public void d(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "chat_ringtone_uri";
        } else {
            str2 = "hangout_ringtone_uri";
        }
        this.e.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, null);
            this.e.a("conversations", contentValues, String.valueOf(str2).concat("=?"), new String[]{str});
            this.e.b();
        } finally {
            this.e.c();
        }
    }

    public static int b(blo blo, String str) {
        bjm a = ((bjn) jyn.a(blo.f(), bjn.class)).a(blo.h());
        try {
            int a2 = blo.a(blo, str, a);
            return a2;
        } finally {
            a.a();
        }
    }

    private static int a(blo blo, String str, bjm bjm) {
        Cursor a;
        bmv e = blo.e();
        if (TextUtils.isEmpty(str)) {
            a = e.a("participants", bmk.a, bmk.b, null, null, null, null);
        } else {
            a = e.a("conversation_participants_view", bmk.a, bmk.c, new String[]{str}, null, null, null);
        }
        if (a == null) {
            return 0;
        }
        Cursor a2;
        int i;
        try {
            ContentValues contentValues = new ContentValues();
            String[] strArr = new String[1];
            Iterable iterable = null;
            int i2 = 0;
            while (a.moveToNext()) {
                long j = a.getLong(0);
                String string = a.getString(1);
                String string2 = a.getString(2);
                String string3 = a.getString(3);
                bmi a3 = blo.a(bjm, string, string2, string3);
                if (!TextUtils.equals(a3.a, string2) || !TextUtils.equals(a3.b, string3)) {
                    HashSet hashSet;
                    contentValues.clear();
                    contentValues.put("full_name", a3.a);
                    contentValues.put("profile_photo_url", a3.b);
                    strArr[0] = String.valueOf(j);
                    int a4 = e.a("participants", contentValues, "_id=?", strArr) + i2;
                    if (iterable == null) {
                        hashSet = new HashSet();
                    } else {
                        Iterable iterable2 = iterable;
                    }
                    hashSet.add(Long.valueOf(j));
                    iterable = hashSet;
                    i2 = a4;
                }
            }
            if (iterable != null) {
                String join = TextUtils.join(",", iterable);
                a2 = e.a("SELECT DISTINCT conversations.conversation_id  FROM conversations JOIN conversation_participants  WHERE conversation_participants.conversation_id=conversations.conversation_id  AND conversation_participants.participant_row_id IN (?); ", new String[]{join});
                if (a2 != null) {
                    if (a2.moveToFirst()) {
                        i2 += a2.getCount();
                        while (true) {
                            blf.b(blo, a2.getString(0));
                            if (!a2.moveToNext()) {
                                break;
                            }
                        }
                    }
                }
                i = i2;
                if (a2 != null) {
                }
            } else {
                i = i2;
            }
            a.close();
            return i;
        } catch (Throwable th) {
            i = th;
            if (a2 != null) {
            }
        } finally {
            a.close();
        }
    }

    public void a(bko bko, String str, String str2, long j, long j2, int i) {
        long toMicros;
        fhc fhc = new fhc();
        List arrayList = new ArrayList();
        edo a = edo.a(str);
        for (edk edk : H(str2)) {
            arrayList.add(edk.b);
            if (edk.b.a.equalsIgnoreCase(str)) {
                a = edk.b;
            }
        }
        if (z(str2) == 1) {
            toMicros = j2 + TimeUnit.DAYS.toMicros(1);
        } else {
            toMicros = 0;
        }
        String a2 = a(str2, arrayList);
        a(str2, String.valueOf(j), fwx.ON_SERVER, a, fwy.HANGOUT_START_EVENT, j2, toMicros, 0, i, null, a2);
        int g = bko.g();
        if (i == 20) {
            fhc.a(j2);
        } else {
            fhc.e();
        }
        ((ect) jyn.a(this.a, ect.class)).a(g, fhc.f());
    }

    public void c(List<eyg> list) {
        List<eyg> a = a(false);
        List K = K();
        long a2 = glj.a();
        this.e.a();
        try {
            this.e.a("sticker_photos", null, null);
            this.e.a("sticker_albums", null, null);
            for (eyg eyg : list) {
                long j;
                eyg eyg2 = null;
                for (eyg eyg3 : a) {
                    if (eyg3.a.equals(eyg.a)) {
                        eyg2 = eyg3;
                        break;
                    }
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("album_id", eyg.a);
                contentValues.put("title", eyg.b);
                contentValues.put("cover_photo_id", eyg.c == null ? null : eyg.c.a);
                String str = "last_used";
                if (eyg2 == null) {
                    j = a2 - 1;
                } else {
                    long j2 = eyg2.d;
                    j = a2;
                    a2 = j2;
                }
                contentValues.put(str, Long.valueOf(a2));
                this.e.a("sticker_albums", null, contentValues);
                for (eyi eyi : eyg.e) {
                    ContentValues contentValues2 = new ContentValues();
                    eyi a3 = blo.a(K, eyi.a);
                    if (a3 != null) {
                        K.remove(a3);
                        if (a3.c != null) {
                            contentValues2.put("file_name", a3.c);
                        }
                        contentValues2.put("last_used", Long.valueOf(a3.d));
                    }
                    contentValues2.put("album_id", eyg.a);
                    contentValues2.put("photo_id", eyi.a);
                    contentValues2.put("url", eyi.b);
                    this.e.a("sticker_photos", null, contentValues2);
                }
                a2 = j;
            }
            this.e.b();
            blo.f(K);
        } finally {
            this.e.c();
        }
    }

    private static eyi a(List<eyi> list, String str) {
        for (eyi eyi : list) {
            if (eyi.a.equals(str)) {
                return eyi;
            }
        }
        return null;
    }

    private static void f(List<eyi> list) {
        for (eyi eyi : list) {
            if (eyi.c != null) {
                File file = new File(eyi.c);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.eyg> a(boolean r14) {
        /*
        r13 = this;
        r9 = 0;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r0 = r13.e;	 Catch:{ all -> 0x00c5 }
        r1 = "sticker_albums";
        r2 = m;	 Catch:{ all -> 0x00c5 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r10 = r0.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00c5 }
        if (r10 == 0) goto L_0x00bf;
    L_0x0017:
        r0 = r10.moveToNext();	 Catch:{ all -> 0x009f }
        if (r0 == 0) goto L_0x00bf;
    L_0x001d:
        r12 = new eyg;	 Catch:{ all -> 0x009f }
        r12.<init>();	 Catch:{ all -> 0x009f }
        r0 = 0;
        r0 = r10.getString(r0);	 Catch:{ all -> 0x009f }
        r12.a = r0;	 Catch:{ all -> 0x009f }
        r0 = 2;
        r0 = r10.getString(r0);	 Catch:{ all -> 0x009f }
        r12.b = r0;	 Catch:{ all -> 0x009f }
        r0 = 3;
        r0 = r10.getInt(r0);	 Catch:{ all -> 0x009f }
        r0 = (long) r0;	 Catch:{ all -> 0x009f }
        r12.d = r0;	 Catch:{ all -> 0x009f }
        if (r14 == 0) goto L_0x00ba;
    L_0x003a:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x009f }
        r0.<init>();	 Catch:{ all -> 0x009f }
        r12.e = r0;	 Catch:{ all -> 0x009f }
        r0 = r13.e;	 Catch:{ all -> 0x00c7 }
        r1 = "sticker_photos";
        r2 = l;	 Catch:{ all -> 0x00c7 }
        r3 = "album_id=?";
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x00c7 }
        r5 = 0;
        r6 = r12.a;	 Catch:{ all -> 0x00c7 }
        r4[r5] = r6;	 Catch:{ all -> 0x00c7 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r1 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00c7 }
    L_0x0059:
        if (r1 == 0) goto L_0x00b5;
    L_0x005b:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x0098 }
        if (r0 == 0) goto L_0x00b5;
    L_0x0061:
        r0 = new eyi;	 Catch:{ all -> 0x0098 }
        r0.<init>();	 Catch:{ all -> 0x0098 }
        r2 = 0;
        r2 = r1.getString(r2);	 Catch:{ all -> 0x0098 }
        r0.a = r2;	 Catch:{ all -> 0x0098 }
        r2 = 1;
        r2 = r1.getString(r2);	 Catch:{ all -> 0x0098 }
        r0.b = r2;	 Catch:{ all -> 0x0098 }
        r2 = 2;
        r2 = r1.getString(r2);	 Catch:{ all -> 0x0098 }
        r0.c = r2;	 Catch:{ all -> 0x0098 }
        r2 = 3;
        r2 = r1.getInt(r2);	 Catch:{ all -> 0x0098 }
        r2 = (long) r2;	 Catch:{ all -> 0x0098 }
        r0.d = r2;	 Catch:{ all -> 0x0098 }
        r2 = r0.a;	 Catch:{ all -> 0x0098 }
        r3 = 1;
        r3 = r10.getString(r3);	 Catch:{ all -> 0x0098 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0098 }
        if (r2 == 0) goto L_0x00a7;
    L_0x0090:
        r12.c = r0;	 Catch:{ all -> 0x0098 }
    L_0x0092:
        r2 = r12.e;	 Catch:{ all -> 0x0098 }
        r2.add(r0);	 Catch:{ all -> 0x0098 }
        goto L_0x0059;
    L_0x0098:
        r0 = move-exception;
    L_0x0099:
        if (r1 == 0) goto L_0x009e;
    L_0x009b:
        r1.close();	 Catch:{ all -> 0x009f }
    L_0x009e:
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        r9 = r10;
    L_0x00a1:
        if (r9 == 0) goto L_0x00a6;
    L_0x00a3:
        r9.close();
    L_0x00a6:
        throw r0;
    L_0x00a7:
        r2 = r12.c;	 Catch:{ all -> 0x0098 }
        if (r2 != 0) goto L_0x0092;
    L_0x00ab:
        r2 = 1;
        r2 = r10.getString(r2);	 Catch:{ all -> 0x0098 }
        if (r2 != 0) goto L_0x0092;
    L_0x00b2:
        r12.c = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x0092;
    L_0x00b5:
        if (r1 == 0) goto L_0x00ba;
    L_0x00b7:
        r1.close();	 Catch:{ all -> 0x009f }
    L_0x00ba:
        r11.add(r12);	 Catch:{ all -> 0x009f }
        goto L_0x0017;
    L_0x00bf:
        if (r10 == 0) goto L_0x00c4;
    L_0x00c1:
        r10.close();
    L_0x00c4:
        return r11;
    L_0x00c5:
        r0 = move-exception;
        goto L_0x00a1;
    L_0x00c7:
        r0 = move-exception;
        r1 = r9;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: blo.a(boolean):java.util.List<eyg>");
    }

    private List<eyi> K() {
        Throwable th;
        List<eyi> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("sticker_photos", l, null, null, null, null, null);
            while (a != null) {
                try {
                    if (!a.moveToNext()) {
                        break;
                    }
                    eyi eyi = new eyi();
                    eyi.a = a.getString(0);
                    eyi.b = a.getString(1);
                    eyi.c = a.getString(2);
                    eyi.d = (long) a.getInt(3);
                    arrayList.add(eyi);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public List<eyi> B() {
        Throwable th;
        List<eyi> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.e.a("sticker_photos", l, "last_used!=0", null, null, null, "last_used DESC", "32");
            while (a != null) {
                try {
                    if (!a.moveToNext()) {
                        break;
                    }
                    eyi eyi = new eyi();
                    eyi.a = a.getString(0);
                    eyi.b = a.getString(1);
                    eyi.c = a.getString(2);
                    arrayList.add(eyi);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private boolean an(String str) {
        Throwable th;
        this.e.a();
        Cursor a;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_used", Long.valueOf(glj.a()));
            int a2 = this.e.a("sticker_photos", contentValues, "photo_id=?", new String[]{str});
            a = this.e.a("sticker_photos", new String[]{"album_id"}, "photo_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst() && a.getString(0) != null) {
                        contentValues.clear();
                        contentValues.put("last_used", Long.valueOf(glj.a()));
                        this.e.a("sticker_albums", contentValues, "album_id=?", new String[]{a.getString(0)});
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    this.e.c();
                    throw th;
                }
            }
            this.e.b();
            if (a != null) {
                a.close();
            }
            this.e.c();
            if (a2 == 1) {
                return true;
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            this.e.c();
            throw th;
        }
    }

    public eyi ae(String str) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor a = this.e.a("sticker_photos", l, "photo_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        eyi eyi = new eyi();
                        eyi.a = a.getString(0);
                        eyi.b = a.getString(1);
                        eyi.c = a.getString(2);
                        eyi.d = (long) a.getInt(3);
                        if (a == null) {
                            return eyi;
                        }
                        a.close();
                        return eyi;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean m(String str, String str2) {
        bmv bmv = null;
        bmv bmv2 = this.e;
        bmv2.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("file_name", str);
            bmv2 = this.e.a("sticker_photos", contentValues, "photo_id=?", new String[]{str2});
            this.e.b();
            if (bmv2 == 1) {
                return true;
            }
            return bmv;
        } finally {
            bmv = this.e;
            bmv.c();
        }
    }

    public fwx n(String str, String str2) {
        Throwable th;
        fwx fwx = null;
        Cursor a;
        try {
            a = this.e.a("messages", new String[]{"status"}, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    fwx = fwx.values()[a.getInt(0)];
                }
                if (a != null) {
                    a.close();
                }
                return fwx;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private fwx o(long j) {
        Throwable th;
        fwx fwx = null;
        Cursor a;
        try {
            a = this.e.a("messages", new String[]{"status"}, "_id=?", new String[]{String.valueOf(j)}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    fwx = fwx.values()[a.getInt(0)];
                }
                if (a != null) {
                    a.close();
                }
                return fwx;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void C() {
        new Handler(Looper.getMainLooper()).post(new blp(this));
        this.n.a(this.g).b().c(2939);
    }

    public void a(long j, List<String> list) {
        if (!list.isEmpty()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("notified", Long.valueOf(j));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("_id");
            stringBuilder.append(" IN(");
            for (int i = 0; i < list.size() - 1; i++) {
                stringBuilder.append("?,");
            }
            stringBuilder.append("?) AND ");
            stringBuilder.append("notified");
            stringBuilder.append(" = 0");
            a(contentValues, stringBuilder.toString(), (String[]) list.toArray(new String[0]));
        }
    }

    public int a(String str, String[] strArr) {
        Throwable th;
        this.e.a();
        Cursor a;
        try {
            a = this.e.a("messages", new String[]{"_id", "conversation_id"}, str, strArr, null, null, null);
            try {
                if (a.getCount() > 0) {
                    lo loVar = new lo();
                    while (a.moveToNext()) {
                        String string = a.getString(1);
                        long j = a.getLong(0);
                        if (loVar.get(string) == null) {
                            loVar.put(string, new ArrayList());
                        }
                        ((List) loVar.get(string)).add(Long.valueOf(j));
                    }
                    a(loVar);
                }
                int a2 = this.e.a("messages", str, strArr);
                this.e.b();
                this.e.c();
                if (a != null) {
                    a.close();
                }
                return a2;
            } catch (Throwable th2) {
                th = th2;
                this.e.c();
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            this.e.c();
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public List<Long> a(ContentValues contentValues, String str, String[] strArr) {
        Cursor a;
        Throwable th;
        List<Long> arrayList = new ArrayList();
        this.e.a();
        try {
            a = this.e.a("messages", new String[]{"_id", "conversation_id"}, str, strArr, null, null, null);
            try {
                if (a.getCount() > 0) {
                    lo loVar = new lo();
                    while (a.moveToNext()) {
                        String string = a.getString(1);
                        long j = a.getLong(0);
                        arrayList.add(Long.valueOf(j));
                        if (loVar.get(string) == null) {
                            loVar.put(string, new ArrayList());
                        }
                        ((List) loVar.get(string)).add(Long.valueOf(j));
                    }
                    a(loVar);
                }
                this.e.a("messages", contentValues, str, strArr);
                this.e.b();
                this.e.c();
                if (a != null) {
                    a.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                this.e.c();
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            this.e.c();
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    private void a(ContentValues contentValues, Long l, String str) {
        if (this.e.a("messages", contentValues, "_id=?", new String[]{l.toString()}) > 0) {
            q(str, l.toString());
        }
    }

    public long b(ContentValues contentValues) {
        long a = this.e.a("messages", null, contentValues);
        if (a != -1) {
            q(contentValues.getAsString("conversation_id"), String.valueOf(a));
        }
        return a;
    }

    private void q(String str, String str2) {
        this.e.a(EsProvider.a(h(), str, gwb.ad(str2), gwb.ad(str2)));
    }

    private void a(lo<String, List<Long>> loVar) {
        for (int i = 0; i < loVar.size(); i++) {
            String str = (String) loVar.b(i);
            List list = (List) loVar.c(i);
            List arrayList = new ArrayList();
            if (list.isEmpty()) {
                list = arrayList;
            } else {
                Collections.sort(list);
                long a = gwb.a((Long) list.get(0));
                long j = a;
                for (int i2 = 1; i2 < list.size(); i2++) {
                    long a2 = gwb.a((Long) list.get(i2));
                    if (a2 == 1 + a) {
                        a = a2;
                    } else {
                        arrayList.add(new Pair(Long.valueOf(j), Long.valueOf(a)));
                        a = a2;
                        j = a2;
                    }
                }
                arrayList.add(new Pair(Long.valueOf(j), Long.valueOf(a)));
                list = arrayList;
            }
            ArrayList arrayList2 = (ArrayList) list;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                Pair pair = (Pair) arrayList2.get(i3);
                this.e.a(EsProvider.a(h(), str, gwb.a((Long) pair.first), gwb.a((Long) pair.second)));
                i3 = i4;
            }
        }
    }

    public List<edk> a(String str, edo edo) {
        Cursor a;
        Throwable th;
        iil.b("Expected non-null", (Object) edo);
        iil.b("Expected non-null", edo.a);
        try {
            a = this.e.a("conversation_participants_view", edn.a, "conversation_id=? AND gaia_id!=?", new String[]{str, edo.a}, null, null, null);
            try {
                List<edk> a2 = gwb.a(gwb.H(), a);
                if (a != null) {
                    a.close();
                }
                return a2;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }
}
