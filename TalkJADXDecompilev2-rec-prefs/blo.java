package p000;

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

public final class blo {
    private static final String[] f3705A = new String[]{"conversation_id", "call_media_type"};
    private static final String f3706B = String.format(Locale.US, "%s in (select %s from %s where %s)", new Object[]{"conversation_id", "conversation_id", "conversations", "sort_timestamp<? AND status=? AND transport_type!=3"});
    private static final String[] f3707C = new String[]{"timestamp"};
    private static final String[] f3708D = new String[]{"conversation_type"};
    private static final String[] f3709E = new String[]{"conversation_id"};
    private static final String[] f3710F = new String[]{"conversation_id"};
    static final String[] f3711b = new String[]{"notification_level", "view"};
    private static final boolean f3712c = false;
    private static final gma f3713d = gma.m18073a("EsConversationsHelper");
    private static final String[] f3714i = new String[]{"gaia_id", "chat_id", "name", "first_name", "profile_photo_url", "packed_circle_ids"};
    private static final String[] f3715j = new String[]{"_id", "gaia_id", "chat_id", "phone_id", "circle_id", "full_name", "first_name", "fallback_name", "profile_photo_url", "batch_gebi_tag", "blocked", "participant_type"};
    private static final Random f3716k = mfo.f27617a;
    private static final String[] f3717l = new String[]{"photo_id", "url", "file_name", "last_used"};
    private static final String[] f3718m = new String[]{"album_id", "cover_photo_id", "title", "last_used"};
    private static String f3719o;
    private static String f3720p;
    private static String f3721q;
    private static final String[] f3722r = new String[]{"conversation_id"};
    private static final String[] f3723s = new String[]{"latest_message_timestamp", "latest_message_expiration_timestamp", "snippet_type", "snippet_text", "snippet_author_chat_id", "snippet_image_url", "chat_watermark", "hangout_watermark"};
    private static final String[] f3724t = new String[]{"gaia_id", "chat_id", "circle_id", "phone_id"};
    private static final String[] f3725u = new String[]{"message_id", "conversation_id", "author_chat_id", "text", "status", "type", "timestamp", "expiration_timestamp", "local_url", "remote_url", "image_id", "album_id", "stream_id", "attachment_content_type", "attachment_name", "latitude", "longitude", "address", "attachment_target_url", "transport_type", "transport_phone", "sms_type", "width_pixels", "height_pixels", "mms_subject", "image_rotation", "new_conversation_name", "participant_keys", "forwarded_mms_url", "forwarded_mms_count", "attachment_description", "attachment_target_url_description", "attachment_target_url_name", "call_media_type", "last_seen_timestamp", "observed_status", "off_the_record", "attachments"};
    private static final String[] f3726v = new String[]{"local_url"};
    private static final String[] f3727w = new String[]{"conversation_id", "self_watermark"};
    private static final String f3728x = String.format(Locale.US, "%s=? AND %s=?", new Object[]{"conversation_id", "participant_type"});
    private static final String[] f3729y = new String[]{"first_peak_scroll_time", "first_peak_scroll_to_message_timestamp", "second_peak_scroll_time", "second_peak_scroll_to_message_timestamp"};
    private static final String[] f3730z = new String[]{"sort_timestamp"};
    final Context f3731a;
    private final bmv f3732e;
    private final bko f3733f;
    private final int f3734g;
    private int f3735h;
    private final iih f3736n;

    private void m5867a(java.lang.String r10, java.lang.String r11, android.content.ContentValues r12) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Incorrect nodes count for selectOther: B:31:0x00a1 in [B:24:0x007b, B:31:0x00a1, B:32:0x00a2]
	at jadx.core.utils.BlockUtils.selectOther(BlockUtils.java:53)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:64)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
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
        r1 = r9.f3732e;
        r2 = "conversations";
        r3 = "conversation_id=?";
        r4 = new java.lang.String[r4];
        r4[r0] = r10;
        r1.m6194a(r2, r12, r3, r4);
        r1 = new android.content.ContentValues;
        r1.<init>();
        r2 = f3711b;
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
        r0 = r9.f3732e;
        r0.m6202a();
        r3 = r2.iterator();	 Catch:{ all -> 0x006b }
    L_0x004f:
        r0 = r3.hasNext();	 Catch:{ all -> 0x006b }
        if (r0 == 0) goto L_0x0084;	 Catch:{ all -> 0x006b }
    L_0x0055:
        r0 = r3.next();	 Catch:{ all -> 0x006b }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x006b }
        r4 = r9.f3732e;	 Catch:{ all -> 0x006b }
        r5 = "conversations";	 Catch:{ all -> 0x006b }
        r6 = "conversation_id=?";	 Catch:{ all -> 0x006b }
        r7 = 1;	 Catch:{ all -> 0x006b }
        r7 = new java.lang.String[r7];	 Catch:{ all -> 0x006b }
        r8 = 0;	 Catch:{ all -> 0x006b }
        r7[r8] = r0;	 Catch:{ all -> 0x006b }
        r4.m6194a(r5, r1, r6, r7);	 Catch:{ all -> 0x006b }
        goto L_0x004f;
    L_0x006b:
        r0 = move-exception;
        r1 = r9.f3732e;
        r1.m6208c();
        r1 = r2.iterator();
    L_0x0075:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00a1;
    L_0x007b:
        r1.next();
        r2 = r9.f3733f;
        p000.blf.m5761a(r2);
        goto L_0x0075;
    L_0x0084:
        r0 = r9.f3732e;	 Catch:{ all -> 0x006b }
        r0.m6207b();	 Catch:{ all -> 0x006b }
        r0 = r9.f3732e;
        r0.m6208c();
        r0 = r2.iterator();
    L_0x0092:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00a2;
    L_0x0098:
        r0.next();
        r1 = r9.f3733f;
        p000.blf.m5761a(r1);
        goto L_0x0092;
    L_0x00a1:
        throw r0;
    L_0x00a2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: blo.a(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }

    public java.lang.String m5954a(java.util.List<p000.edk> r6, int r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0029 in list [B:11:0x0026]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r5 = this;
        r1 = r5.m5885c(r6, r7);
        if (r1 == 0) goto L_0x0037;
    L_0x0006:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x0037;	 Catch:{ all -> 0x0030 }
    L_0x000c:
        r0 = 0;	 Catch:{ all -> 0x0030 }
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0030 }
        r2 = f3712c;	 Catch:{ all -> 0x0030 }
        if (r2 == 0) goto L_0x0024;	 Catch:{ all -> 0x0030 }
    L_0x0015:
        r2 = "queryGroupPhoneConversation found conversation ";	 Catch:{ all -> 0x0030 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0030 }
        r4 = r3.length();	 Catch:{ all -> 0x0030 }
        if (r4 == 0) goto L_0x002a;	 Catch:{ all -> 0x0030 }
    L_0x0021:
        r2.concat(r3);	 Catch:{ all -> 0x0030 }
    L_0x0024:
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r1.close();
    L_0x0029:
        return r0;
    L_0x002a:
        r3 = new java.lang.String;	 Catch:{ all -> 0x0030 }
        r3.<init>(r2);	 Catch:{ all -> 0x0030 }
        goto L_0x0024;
    L_0x0030:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.close();
    L_0x0036:
        throw r0;
    L_0x0037:
        if (r1 == 0) goto L_0x003c;
    L_0x0039:
        r1.close();
    L_0x003c:
        r0 = 0;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: blo.a(java.util.List, int):java.lang.String");
    }

    public java.lang.String m6012b(java.util.List<p000.edk> r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0029 in list [B:11:0x0026]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r5 = this;
        r1 = r5.m5896e(r6);
        if (r1 == 0) goto L_0x0037;
    L_0x0006:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x0037;	 Catch:{ all -> 0x0030 }
    L_0x000c:
        r0 = 0;	 Catch:{ all -> 0x0030 }
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0030 }
        r2 = f3712c;	 Catch:{ all -> 0x0030 }
        if (r2 == 0) goto L_0x0024;	 Catch:{ all -> 0x0030 }
    L_0x0015:
        r2 = "queryGroupConversationByGaia found conversation ";	 Catch:{ all -> 0x0030 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0030 }
        r4 = r3.length();	 Catch:{ all -> 0x0030 }
        if (r4 == 0) goto L_0x002a;	 Catch:{ all -> 0x0030 }
    L_0x0021:
        r2.concat(r3);	 Catch:{ all -> 0x0030 }
    L_0x0024:
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r1.close();
    L_0x0029:
        return r0;
    L_0x002a:
        r3 = new java.lang.String;	 Catch:{ all -> 0x0030 }
        r3.<init>(r2);	 Catch:{ all -> 0x0030 }
        goto L_0x0024;
    L_0x0030:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.close();
    L_0x0036:
        throw r0;
    L_0x0037:
        if (r1 == 0) goto L_0x003c;
    L_0x0039:
        r1.close();
    L_0x003c:
        r0 = 0;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: blo.b(java.util.List):java.lang.String");
    }

    static {
        kae kae = glk.f15557d;
    }

    public blo(Context context, bmv bmv, int i) {
        this.f3731a = context;
        this.f3733f = fde.m15018e(i);
        this.f3734g = i;
        this.f3732e = bmv;
        this.f3736n = (iih) jyn.m25426a(context, iih.class);
    }

    public blo(Context context, int i) {
        this(context, bmr.m6166a(context, i).m6187b(), i);
    }

    public void m5958a() {
        this.f3732e.m6202a();
        this.f3735h++;
    }

    public void m6015b() {
        this.f3732e.m6207b();
    }

    public void m6028c() {
        if (this.f3732e != null) {
            this.f3732e.m6208c();
        } else {
            String str = "Babel_ConvHelper";
            String str2 = "endTransaction called on a database not fully setup. Account: ";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.f3735h--;
    }

    public void m6039d() {
        if (this.f3735h <= 1) {
            this.f3732e.m6209d();
        } else {
            glk.m17980d("Babel_ConvHelper", "cannot yield from within a nested transaction", new Exception());
        }
    }

    public bmv m6044e() {
        return this.f3732e;
    }

    public Context m6049f() {
        return this.f3731a;
    }

    public bko m6056g() {
        return this.f3733f;
    }

    public int m6061h() {
        return this.f3734g;
    }

    public static boolean m5871a(String str) {
        return str.startsWith("client_generated:");
    }

    public static boolean m5883b(String str) {
        return str.startsWith("client_generated:sms:");
    }

    public static String m5900i() {
        String valueOf = String.valueOf("client_generated:");
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(Math.abs(f3716k.nextLong())).toString();
    }

    public static String m5856a(int i, int i2) {
        String i3 = blo.m5900i();
        ba.m4548a(i, glj.m17963b(), 11, ba.m4618c().m12794b(i3).m12786a(i2));
        return i3;
    }

    public static String m5901j() {
        String valueOf = String.valueOf("client_generated:sms:");
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(Math.abs(f3716k.nextLong())).toString();
    }

    public static String m5857a(long j) {
        String valueOf = String.valueOf("client_generated:");
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(j).toString();
    }

    public static Long m5887c(String str) {
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
            glk.m17982e(str2, replace.length() != 0 ? str3.concat(replace) : new String(str3), new Object[0]);
            iil.m21870a("Malformed client-generated-id");
            return null;
        }
    }

    public static long m5890d(String str) {
        return TextUtils.isEmpty(str) ? 0 : gwb.m1523a(blo.m5887c(str));
    }

    public static boolean m5870a(fhe fhe) {
        return fhe == fhe.LOUD;
    }

    private boolean af(String str) {
        Throwable th;
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", new String[]{"conversation_id"}, "conversation_id=?", new String[]{str}, null, null, null);
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

    private bls m5849a(Cursor cursor) {
        boolean z;
        boolean z2 = true;
        bls bls = new bls();
        bls.f3773s = cursor.getString(20);
        bls.f3755a = cursor.getInt(0) != 0;
        bls.f3756b = cursor.getInt(1);
        bls.f3765k = cursor.getInt(9);
        bls.f3771q = cursor.getLong(16);
        bls.f3774t = cursor.getString(17);
        bls.f3775u = cursor.getLong(18);
        bls.f3772r = cursor.getInt(19);
        Object string = cursor.getString(2);
        if (TextUtils.isEmpty(string)) {
            bls.f3758d = null;
        } else {
            bls.f3758d = string;
        }
        bls.f3769o = cursor.getString(13);
        if (cursor.getInt(3) != 0) {
            z = true;
        } else {
            z = false;
        }
        bls.f3759e = z;
        if (!cursor.isNull(4)) {
            bls.f3760f = cursor.getBlob(4);
        }
        bls.f3761g = cursor.getLong(5);
        bls.f3763i = cursor.getInt(6);
        bls.f3764j = new edo(cursor.getString(7), cursor.getString(8));
        bls.f3768n = cursor.getLong(10);
        if (cursor.getInt(14) == 0) {
            z2 = false;
        }
        bls.f3770p = z2;
        bls.f3757c = cursor.getInt(15);
        bls.f3766l = cursor.getInt(11);
        bls.f3767m = cursor.getInt(12);
        bls.f3762h = blo.m5879b(cursor);
        bls.f3776v = cursor.getInt(21);
        return bls;
    }

    private static String m5897e(String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT ");
        int i = 0;
        while (i < blt.f3777a.length && (z || i != 22)) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(blt.f3777a[i]);
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

    private static synchronized String m5832D() {
        String str;
        synchronized (blo.class) {
            if (f3719o == null) {
                f3719o = blo.m5897e(" WHERE conversation_id=? ", true);
            }
            str = f3719o;
        }
        return str;
    }

    private static synchronized String m5833E() {
        String str;
        synchronized (blo.class) {
            if (f3720p == null) {
                f3720p = blo.m5897e(" WHERE conversation_id=? ", false);
            }
            str = f3720p;
        }
        return str;
    }

    private static synchronized String m5834F() {
        String str;
        synchronized (blo.class) {
            if (f3721q == null) {
                f3721q = blo.m5897e(null, true);
            }
            str = f3721q;
        }
        return str;
    }

    private Cursor ag(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f3732e.m6199a(blo.m5834F(), null);
        }
        Cursor a = this.f3732e.m6199a(blo.m5832D(), new String[]{str});
        if (a != null && a.getCount() != 0) {
            return a;
        }
        if (a != null) {
            a.close();
        }
        return this.f3732e.m6199a(blo.m5833E(), new String[]{str});
    }

    public bls m6043e(String str) {
        bls f = m6050f(str);
        if (f != null) {
            return f;
        }
        glk.m17982e("Babel_ConvHelper", new StringBuilder(String.valueOf(str).length() + 31).append("Conversation id ").append(str).append(" does not exist").toString(), new Object[0]);
        throw new NullPointerException("Conversation id does not exist");
    }

    public bls m6050f(String str) {
        if (f3712c) {
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
                    bls = m5849a(ag);
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

    private int m5842a(String str, String str2, String str3, int i) {
        Throwable th;
        Object obj = (!f3712c || TextUtils.isEmpty(str)) ? null : 1;
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str3));
        if (!TextUtils.isEmpty(str2)) {
            Cursor a;
            try {
                a = this.f3732e.m6200a("conversations", new String[]{str3}, "conversation_id=?", new String[]{str2}, null, null, null);
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

    private long m5847a(String str, String str2, String str3, long j) {
        Cursor a;
        Throwable th;
        Object obj = (!f3712c || TextUtils.isEmpty(str)) ? null : 1;
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str3));
        if (!TextUtils.isEmpty(str2)) {
            try {
                a = this.f3732e.m6200a("conversations", new String[]{str3}, "conversation_id=?", new String[]{str2}, null, null, null);
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

    private String m5858a(String str, String str2, String str3) {
        Throwable th;
        Cursor cursor = null;
        Object obj = (!f3712c || TextUtils.isEmpty(str)) ? null : 1;
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str3));
        if (!TextUtils.isEmpty(str2)) {
            try {
                Cursor a = this.f3732e.m6200a("conversations", new String[]{str3}, "conversation_id=?", new String[]{str2}, null, null, null);
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

    public int m6055g(String str) {
        return m5842a("getConversationTransportType", str, "transport_type", 0);
    }

    private static List<edk> m5879b(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getColumnCount() == 22) {
            return arrayList;
        }
        List c = EsProvider.m8275c(cursor.getString(22));
        List c2 = EsProvider.m8275c(cursor.getString(23));
        List c3 = EsProvider.m8275c(cursor.getString(24));
        List c4 = EsProvider.m8275c(cursor.getString(25));
        List c5 = EsProvider.m8275c(cursor.getString(27));
        List c6 = EsProvider.m8275c(cursor.getString(26));
        List c7 = EsProvider.m8275c(cursor.getString(28));
        List c8 = EsProvider.m8275c(cursor.getString(29));
        List c9 = EsProvider.m8275c(cursor.getString(30));
        List c10 = EsProvider.m8275c(cursor.getString(31));
        List c11 = EsProvider.m8275c(cursor.getString(32));
        for (int i = 0; i < c.size(); i++) {
            if (Integer.parseInt((String) c8.get(i)) == 1) {
                try {
                    arrayList.add(gwb.m1596a(gwb.m1400H(), edq.values()[Integer.parseInt((String) c7.get(i))], (String) c.get(i), (String) c2.get(i), (String) c4.get(i), (String) c3.get(i), (String) c5.get(i), (String) c9.get(i), (String) c6.get(i), (String) c10.get(i), (String) c11.get(i), Boolean.valueOf(false), null, 0));
                } catch (NumberFormatException e) {
                }
            }
        }
        return arrayList;
    }

    public void m5988a(String str, String str2) {
        if (f3712c) {
            new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(str2).length()).append("setDraft conversationId: ").append(str).append(" draft: ").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        String str3 = "draft";
        if (str2 == null) {
            str2 = "";
        }
        contentValues.put(str3, str2);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.m5757a(this.f3733f.m5638g());
    }

    public ArrayList<String> m6075k() {
        Throwable th;
        ArrayList<String> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", f3722r, "is_pending_leave < 0", null, null, null, null);
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

    public boolean m6065h(String str) {
        Cursor a;
        Throwable th;
        try {
            a = this.f3732e.m6200a("messages", new String[]{"_id"}, "conversation_id = ? AND timestamp IS NOT NULL", new String[]{str}, null, null, null);
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

    public ArrayList<String> m6081l() {
        Throwable th;
        ArrayList<String> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", f3722r, "transport_type!=3", null, null, null, null);
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

    public String m5952a(String str, int i, int i2, long j, String str2, int i3) {
        if (f3712c) {
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
        this.f3732e.m6197a("conversations", null, contentValues);
        return str2;
    }

    public void m5974a(String str, long j) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 81).append("insertPlaceholderConversation: conversationId=").append(str).append(" seenTimestamp=").append(j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", str);
        contentValues.put("is_pending_leave", Integer.valueOf(0));
        contentValues.put("metadata_present", Integer.valueOf(0));
        contentValues.put("chat_watermark", Long.valueOf(j));
        contentValues.put("hangout_watermark", Long.valueOf(j));
        this.f3732e.m6197a("conversations", null, contentValues);
    }

    public long m6067i(String str) {
        return m5847a("getContinuationEventTimestamp", str, "continuation_event_timestamp", 0);
    }

    public void m5996a(String str, byte[] bArr, long j) {
        int i;
        if (f3712c) {
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
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.m5823f(this, str);
    }

    public void m6072j(String str) {
        if (f3712c) {
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
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.m5823f(this, str);
    }

    public bmb m5945a(String str, String str2, String str3, String str4) {
        String str5;
        if (f3712c) {
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
            case 2:
                str5 = "conversation_id IN (?, ?)";
                break;
            case 3:
                str5 = "conversation_id IN (?, ?, ?)";
                break;
            case 4:
                str5 = "conversation_id IN (?, ?, ?, ?)";
                break;
            default:
                str5 = "conversation_id=?";
                break;
        }
        Cursor a = this.f3732e.m6200a("conversations", bly.f3794a, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), null, null, null);
        try {
            bmb bmb;
            if (a.moveToFirst()) {
                String str6;
                blx c = blo.m5886c(a);
                if (f3712c) {
                    str6 = "getExistingMergedConversationId found match ";
                    String valueOf = String.valueOf(c.f3790a);
                    if (valueOf.length() != 0) {
                        str6.concat(valueOf);
                    } else {
                        valueOf = new String(str6);
                    }
                }
                boolean z = false;
                blx blx = c;
                while (a.moveToNext()) {
                    c = blo.m5886c(a);
                    if (f3712c) {
                        str6 = "getExistingMergedConversationId found another conversation ";
                        String valueOf2 = String.valueOf(c.f3790a);
                        if (valueOf2.length() != 0) {
                            str6.concat(valueOf2);
                        } else {
                            valueOf2 = new String(str6);
                        }
                    }
                    blx = m5850a(blx, c);
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

    private static blx m5886c(Cursor cursor) {
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

    private blx m5850a(blx blx, blx blx2) {
        boolean z = false;
        if (blx.f3790a.startsWith("client_generated:") || blx.f3793d) {
            blx blx3 = blx2;
            blx2 = blx;
            blx = blx3;
        } else {
            if (blx2.f3790a.startsWith("client_generated:") || blx2.f3793d) {
                z = true;
            }
            iil.m21874a("Expected condition to be true", z);
        }
        if (f3712c) {
            String str = blx2.f3790a;
            String str2 = blx.f3790a;
            new StringBuilder((String.valueOf(str).length() + 60) + String.valueOf(str2).length()).append("moveMessagesFromClientGeneratedId: moving messages from ").append(str).append(" to ").append(str2);
        }
        m5958a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("conversation_id", blx.f3790a);
            List a = m5955a(contentValues, "conversation_id=? AND status IN (?, ?, ?)", new String[]{blx2.f3790a, Integer.toString(fwx.QUEUED.ordinal()), Integer.toString(fwx.FAILED_TO_SEND.ordinal()), Integer.toString(fwx.ON_SERVER.ordinal())});
            lo loVar = new lo();
            loVar.put(blx.f3790a, a);
            m5869a(loVar);
            int size = a.size();
            if (f3712c) {
                new StringBuilder(58).append("moveMessagesFromClientGeneratedId updated ").append(size).append(" rows");
            }
            RealTimeChatService.m9113f(this.f3733f, blx2.f3790a, blx.f3790a);
            m5909B(blx2.f3790a);
            m6015b();
            blf.m5820d(this);
            return blx;
        } finally {
            m6028c();
        }
    }

    public void m6076k(String str) {
        if (f3712c) {
            String str2 = "clearConversation: conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        if (this.f3732e.m6196a("conversations", "conversation_id=?", new String[]{str}) > 0) {
            blf.m5820d(this);
        }
    }

    public void m6085m() {
        int a = this.f3732e.m6196a("conversations", "is_pending_leave<0", null);
        if (f3712c) {
            new StringBuilder(35).append("RemoveLeftConversations ").append(a);
        }
        if (a > 0) {
            blf.m5820d(this);
        }
    }

    public long m6080l(String str) {
        long a = m5847a("getConversationSequenceNumber", str, "sequence_number", 1);
        if (a < 1) {
            return 1;
        }
        return a;
    }

    public void m6018b(String str, long j) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 83).append("setConversationSequenceNumber: conversationId=").append(str).append(", sequenceNumber=").append(j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("sequence_number", Long.valueOf(j));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public long m5937a(int i) {
        Throwable th;
        Cursor cursor;
        try {
            String str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3";
            switch (i) {
                case 2:
                    str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=2";
                    break;
                case 3:
                    str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=1 AND status=1 AND inviter_affinity=1";
                    break;
                case 4:
                    str = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=1 AND status=1 AND inviter_affinity=2";
                    break;
            }
            Cursor a = this.f3732e.m6200a("conversations", new String[]{"MIN(sort_timestamp)"}, str, null, null, null, null);
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

    public void m5976a(String str, long j, long j2, long j3) {
        long n = m6089n(str);
        if (n == j) {
            if (f3712c) {
                new StringBuilder(105).append("updateLatestMessageTimestamp. Local timestamp ").append(j).append(". Server timestamp ").append(j2);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("latest_message_timestamp", Long.valueOf(j2));
            if (j3 > 0) {
                contentValues.put("latest_message_expiration_timestamp", Long.valueOf(j3));
            } else {
                contentValues.putNull("latest_message_expiration_timestamp");
            }
            this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{String.valueOf(str)});
        } else if (f3712c) {
            new StringBuilder(133).append("updateLatestMessageTimestamp skipped. Local timestamp for message ").append(j).append(". Latest message timestamp ").append(n);
        }
    }

    public boolean m6023b(String str, String str2) {
        Throwable th;
        Cursor cursor;
        try {
            Cursor a = this.f3732e.m6200a("messages", bmm.f3979a, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                if (a.moveToFirst() && fwy.values()[a.getInt(3)] == fwy.CONVERSATION_RENAME) {
                    boolean a2 = m5872a(str, a.getLong(1), a.getLong(2), 5, edo.m13606b(a.getString(4)), null, null, a.getLong(0), fwx.values()[a.getInt(5)], a.getString(6), null, -1, 0);
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

    public boolean m6005a(String str, long j, long j2, int i, String str2, edo edo, String str3, String str4, long j3, int i2, int i3) {
        int i4 = i == 6 ? ba.m4613b(str2) ? 3 : ba.m4630d(str2) ? 15 : "hangouts/location".equals(str2) ? 13 : (ba.m4636e(str2) || "application/vnd.wap.multipart.mixed".equals(str2)) ? 9 : "hangouts/gv_voicemail".equals(str2) ? 12 : 2 : i;
        return m5872a(str, j, j2, i4, edo, str3, str4, j3, fwx.UNKNOWN, null, null, i2, i3);
    }

    public boolean m6004a(String str, long j, long j2, int i, edo edo, long j3, fwx fwx, String str2, String str3) {
        return m5872a(str, j, j2, i, edo, null, null, j3, fwx, str2, str3, -1, 0);
    }

    private boolean m5872a(String str, long j, long j2, int i, edo edo, String str2, String str3, long j3, fwx fwx, String str4, String str5, int i2, int i3) {
        bma ah = ah(str);
        if (ah.f3851a <= j) {
            String valueOf;
            if (str2 != null && str2.length() > 500) {
                str2 = str2.substring(0, 500);
            }
            if (f3712c) {
                valueOf = String.valueOf(edo);
                new StringBuilder((((String.valueOf(str).length() + 202) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("updateLatestEvent with conversationId=").append(str).append(" timestamp=").append(j).append(" expirationTimestamp").append(j2).append(" type=").append(i).append(" authorId=").append(valueOf).append(" text=").append(str2).append(" imageUrl=").append(str3).append(" smsType=").append(i2).append(" voicemailDuration=").append(i3);
            }
            valueOf = edo != null ? edo.f11245b : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("latest_message_timestamp", Long.valueOf(j));
            if (!(i == 1 || i == 8 || i == 10 || i == 11 || j <= ah.f3857g)) {
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
                case 1:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 2:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_text", str2);
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 3:
                case 13:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_image_url", str3);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 4:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.put("snippet_participant_keys", str5);
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 5:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_new_conversation_name", str4);
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 7:
                    contentValues.putNull("snippet_author_chat_id");
                    contentValues.putNull("snippet_text");
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 8:
                case 11:
                    contentValues.put("previous_latest_timestamp", Long.valueOf(ah.f3851a));
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_author_chat_id");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 9:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_text", str2);
                    contentValues.put("snippet_image_url", str3);
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.putNull("snippet_voicemail_duration");
                    break;
                case 12:
                    contentValues.put("snippet_author_chat_id", valueOf);
                    contentValues.put("snippet_text", str2);
                    contentValues.putNull("snippet_image_url");
                    contentValues.putNull("snippet_new_conversation_name");
                    contentValues.putNull("snippet_participant_keys");
                    contentValues.put("snippet_voicemail_duration", Integer.valueOf(i3));
                    break;
            }
            this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{String.valueOf(str)});
            blf.m5820d(this);
            return true;
        }
        if (f3712c) {
            new StringBuilder(120).append("updateLatestMessage skipped. currentLatestMessageTimestamp=").append(ah.f3851a).append(" passed in timestamp=").append(j);
        }
        return false;
    }

    public void m6086m(String str) {
        if (f3712c) {
            String str2 = "expireLatestMessage. conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        long toMicros = TimeUnit.MILLISECONDS.toMicros(glj.m17956a());
        m5958a();
        try {
            bma ah = ah(str);
            if (ah.f3852b <= 0 || ah.f3852b > toMicros) {
                m6015b();
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
            this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
            m6015b();
            m6028c();
        } finally {
            m6028c();
        }
    }

    private static ContentValues m5876b(fpg fpg) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fpg.m15890s()));
        contentValues.put("notification_level", Integer.valueOf(fpg.m15889r()));
        contentValues.put("conversation_type", Integer.valueOf(fpg.m15875d()));
        if (fpg.m15871B()) {
            contentValues.put("sort_timestamp", Long.valueOf(fpg.m15896y()));
        }
        if (TextUtils.isEmpty(fpg.m15876e())) {
            contentValues.putNull("name");
        } else {
            contentValues.put("name", fpg.m15876e());
        }
        contentValues.put("metadata_present", Integer.valueOf(1));
        contentValues.put("is_draft", Integer.valueOf(0));
        contentValues.put("conversation_hash", fpg.m15897z());
        contentValues.put("otr_status", Integer.valueOf(fpg.m15892u()));
        contentValues.put("otr_toggle", Integer.valueOf(fpg.m15893v()));
        contentValues.put("is_temporary", Boolean.valueOf(fpg.m15870A()));
        contentValues.put("inviter_affinity", Integer.valueOf(fpg.m15887p()));
        contentValues.put("is_guest", Boolean.valueOf(fpg.m15894w()));
        contentValues.put("gls_status", Integer.valueOf(fpg.m15885n()));
        if (fpg.m15891t() == null || fpg.m15891t().length <= 0) {
            contentValues.putNull("view");
        } else {
            contentValues.put("view", Integer.valueOf(fpg.m15891t()[0]));
        }
        edo q = fpg.m15888q();
        if (q != null) {
            contentValues.put("inviter_gaia_id", q.f11244a);
            contentValues.put("inviter_chat_id", q.f11245b);
        }
        return contentValues;
    }

    public void m5973a(String str, int i, fpg fpg) {
        if (f3712c) {
            String valueOf = String.valueOf(fpg.m15827a());
            boolean z = !str.equals(fpg.m15827a());
            String valueOf2 = String.valueOf(fpg.m15876e());
            new StringBuilder(((String.valueOf(str).length() + 85) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("updateExistingConversation -- currentId: ").append(str).append(", conversationId: ").append(valueOf).append(", is_new_id: ").append(z).append(", name: ").append(valueOf2);
        }
        ContentValues b = blo.m5876b(fpg);
        if (i == 2 && fpg.m15890s() == 1) {
            b.put("status", Integer.valueOf(2));
        }
        if (fpg.m15885n() > 0) {
            b.put("gls_status", Integer.valueOf(fpg.m15885n()));
        }
        if (!str.equals(fpg.m15827a())) {
            b.put("conversation_id", fpg.m15827a());
            Long i2 = m6068i(str, str);
            if (i2 != null) {
                m6052f(gwb.m1523a(i2));
            }
        }
        if (fpg.m15890s() != 1) {
            b.put("disposition", Integer.valueOf(0));
        }
        m5867a(str, fpg.m15827a(), b);
    }

    public void m5984a(String str, fhc fhc) {
        bls f = m6050f(str);
        if (f != null) {
            if (f.f3762h.isEmpty()) {
                glk.m17981d("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("found zero invitees when re-creating Purged Convesration: ").append(str).append(", ignore.").toString(), new Object[0]);
                return;
            }
            String i = blo.m5900i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("disposition", Integer.valueOf(3));
            m5958a();
            try {
                m5867a(str, i, contentValues);
                contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(fwx.QUEUED.ordinal()));
                m5955a(contentValues, "conversation_id=? AND status=?", new String[]{i, Integer.toString(fwx.SENDING.ordinal())});
                m6015b();
                blf.m5820d(this);
                RealTimeChatService.m9113f(this.f3733f, str, i);
                fhc.m15308a(new eup(i, f.f3756b, f.f3758d, m5893d(f.f3762h), null));
            } finally {
                m6028c();
            }
        }
    }

    private List<edk> m5893d(List<edk> list) {
        List<edk> arrayList = new ArrayList();
        for (edk edk : list) {
            if (!TextUtils.isEmpty(edk.f11215d)) {
                String str = "Babel";
                String str2 = "participant.circleId not empty. Value = ";
                String valueOf = String.valueOf(edk.f11215d);
                glk.m17982e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                iil.m21870a("participant.circleId not empty.");
            }
            if (!this.f3733f.m5632b().m13608a(edk.f11213b)) {
                arrayList.add(edk);
            }
        }
        iil.m21869a(Integer.valueOf(list.size() - 1), Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void m5971a(fpg fpg) {
        if (f3712c) {
            String valueOf = String.valueOf(fpg.m15827a());
            String valueOf2 = String.valueOf(fpg.m15876e());
            new StringBuilder((String.valueOf(valueOf).length() + 49) + String.valueOf(valueOf2).length()).append("insertNewConversation -- conversationId: ").append(valueOf).append(", name: ").append(valueOf2);
        }
        ContentValues b = blo.m5876b(fpg);
        if (!fpg.m15871B()) {
            b.put("sort_timestamp", Long.valueOf(fpg.m15895x()));
        }
        b.put("is_pending_leave", Integer.valueOf(0));
        b.put("conversation_id", fpg.m15827a());
        this.f3732e.m6197a("conversations", null, b);
    }

    public long m6089n(String str) {
        return m5847a("getLatestMessageTimestamp", str, "latest_message_timestamp", 0);
    }

    private bma ah(String str) {
        Throwable th;
        if (f3712c) {
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
            a = this.f3732e.m6200a("conversations", f3723s, "conversation_id=?", new String[]{String.valueOf(str)}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    bma.f3851a = a.getLong(0);
                    bma.f3852b = a.getLong(1);
                    bma.f3853c = a.getInt(2);
                    bma.f3855e = a.getString(3);
                    bma.f3854d = a.getString(4);
                    bma.f3856f = a.getString(5);
                    bma.f3857g = a.getLong(6);
                    bma.f3858h = a.getLong(7);
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

    public void m6021b(String str, String str2, String str3, String str4) {
        if (f3712c) {
            new StringBuilder((String.valueOf(str).length() + 66) + String.valueOf(str2).length()).append("updateConversationParticipantInfo, conversationId=").append(str).append(", generatedName=").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("generated_name", str2);
        contentValues.put("packed_avatar_urls", str3);
        contentValues.put("self_avatar_url", str4);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public List<fbt> m6092n() {
        Throwable th;
        List<fbt> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("participants_view", f3724t, null, null, null, null, null);
            while (a.moveToNext()) {
                try {
                    fbt fbt;
                    String string = a.getString(0);
                    Object string2 = a.getString(1);
                    CharSequence string3 = a.getString(2);
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                        glk.m17982e("Babel_ConvHelper", "RefreshParticipantsPeriodicTask: found a participant with no valid id", new Object[0]);
                        fbt = null;
                    } else if (!TextUtils.isEmpty(string)) {
                        fbt = fbt.m14917a(string);
                    } else if (TextUtils.isEmpty(string2)) {
                        glk.m17970a("Babel_ConvHelper", "RefreshParticipantsPeriodicTask: skip circle", new Object[0]);
                    } else {
                        fbt = gwb.m1987b(new edo(string, string2));
                    }
                    if (fbt == null || !fbt.m14922a()) {
                        glk.m17982e("Babel_ConvHelper", "RefreshParticipantsPeriodicTask: participant has no gaia id", new Object[0]);
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

    public String m6094o(String str) {
        Throwable th;
        String str2 = null;
        if (f3712c) {
            String str3 = "getConversationName, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", new String[]{"name", "generated_name"}, "conversation_id=?", new String[]{str}, null, null, null);
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

    public void m6030c(String str, String str2) {
        if (f3712c) {
            new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(str2).length()).append("updateConversationName, conversationId=").append(str).append(", name=").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str2);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public int m6096p(String str) {
        return m5842a("getGroupLinkSharingStatus", str, "gls_status", 3);
    }

    public void m5972a(String str, int i) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 65).append("updateGroupLinkSharingStatus, conversationId=").append(str).append(", status=").append(i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gls_status", Integer.valueOf(i));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        ayo bow = new bow(str, m6061h(), box.GROUP_LINK_SHARING_STATUS);
        ((gid) jyn.m25426a(m6049f(), gid.class)).mo2276a(bow, bow.m6328a());
    }

    public String m6098q(String str) {
        return m5858a("getGroupConversationUrl", str, "gls_link");
    }

    public void m6040d(String str, String str2) {
        if (f3712c) {
            new StringBuilder((String.valueOf(str).length() + 61) + String.valueOf(str2).length()).append("updateGroupConversationUrl, conversationId=").append(str).append(", conversationUrl=").append(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gls_link", str2);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.m5761a(m6056g());
        ayo bow = new bow(str, m6061h(), box.GROUP_CONVERSATION_LINK);
        ((gid) jyn.m25426a(m6049f(), gid.class)).mo2276a(bow, bow.m6328a());
    }

    public void m6048e(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_ringtone_uri", str2);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public void m6054f(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("hangout_ringtone_uri", str2);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public boolean m6101r(String str) {
        return m5842a("getConversationHasMetadata", str, "metadata_present", 0) == 1;
    }

    public void m6017b(String str, int i) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 78).append("setConversationNotificationLevel, conversationId=").append(str).append("notificationLevel=").append(i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_level", Integer.valueOf(i));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.m5820d(this);
    }

    public int m6102s(String str) {
        return m5842a("getConversationType", str, "conversation_type", 0);
    }

    public void m5995a(String str, boolean z) {
        if (f3712c) {
            String str2 = "setConversationHidden, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        m6082l(str, -2147483648L);
    }

    public void m6029c(String str, int i) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 65).append("setConversationPendingAccept, conversationId=").append(str).append(", status=2");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(2));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public void m5998a(List<fpq> list) {
        this.f3732e.m6202a();
        try {
            for (fpq fpq : list) {
                if (f3712c) {
                    String str = fpq.f13704a;
                    String str2 = fpq.f13705b;
                    new StringBuilder((String.valueOf(str).length() + 73) + String.valueOf(str2).length()).append("markEventObserved, conversationId=").append(str).append(", messageId=").append(str2).append(" observedStatus=").append(fpq.f13706c);
                }
                m5989a(fpq.f13704a, fpq.f13705b, fpq.f13706c);
            }
            this.f3732e.m6207b();
        } finally {
            this.f3732e.m6208c();
        }
    }

    public void m5989a(String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", str2);
        contentValues.put("conversation_id", str);
        contentValues.put("observed_status", Integer.valueOf(i));
        if (m5955a(contentValues, "message_id=? AND conversation_id=?", new String[]{str2, str}).isEmpty()) {
            m6008b(contentValues);
        }
    }

    public int m6104t(String str) {
        return m5842a("getConversationStatus", str, "status", 0);
    }

    private void m5866a(String str, String str2, long j, long j2, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2).append(" conversationid: ").append(str);
        stringBuilder.append(" old ").append(str3).append(": ").append(Long.toString(j));
        stringBuilder.append(" new ").append(str3).append(": ").append(Long.toString(j2));
        gwb.m1731a(this.f3733f.m5638g(), 2697, stringBuilder.toString(), true);
    }

    public void m5978a(String str, long j, boolean z, String str2) {
        Throwable th;
        Cursor cursor;
        long j2 = 0;
        long j3 = 0;
        try {
            Cursor a = this.f3732e.m6200a("conversations", new String[]{"self_watermark", "chat_watermark", "hangout_watermark", "has_chat_notifications", "has_video_notifications", "latest_message_timestamp"}, "conversation_id=?", new String[]{str}, null, null, null);
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
                if (f3712c) {
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
                int g = this.f3733f.m5638g();
                if (j > j7 || j > j8 || j > j9) {
                    ContentValues contentValues = new ContentValues();
                    boolean b = fdq.f12806v.m14370b(g);
                    if (j > j7) {
                        contentValues.put("self_watermark", Long.valueOf(j));
                        if (b) {
                            m5866a(str, str2, j7, j, "selfwatermark");
                        }
                    }
                    int i4 = 0;
                    if (j > j8) {
                        contentValues.put("chat_watermark", Long.valueOf(j));
                        if (b) {
                            m5866a(str, str2, j8, j, "seenchatwatermark");
                        }
                        if (j5 > j) {
                            i4 = 1;
                            if (b) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(str2).append(" conversationid: ").append(str);
                                stringBuilder.append("hasChatNotifications=1 latestMessageTs: ").append(Long.toString(j5));
                                stringBuilder.append(" watermarkTs: ").append(Long.toString(j));
                                gwb.m1731a(g, 2697, stringBuilder.toString(), true);
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
                    this.f3732e.m6194a("conversations", contentValues2, "conversation_id=?", new String[]{str});
                    if (!z) {
                        glk.m17970a("Babel", "Deleted " + m5936a("delete_after_read_timetamp<?", new String[]{String.valueOf(j)}) + " messages whose deleteAfterRead timestamp is too old. Watermark: " + j, new Object[0]);
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

    public long m6107u(String str) {
        return m5847a("getSelfWatermarkTimestamp", str, "self_watermark", -1);
    }

    public long m6108v(String str) {
        return m5847a("getSeenChatMessageWatermarkTimestamp", str, "chat_watermark", -1);
    }

    public int m6110w(String str) {
        return TextUtils.isEmpty(str) ? this.f3732e.m6195a("UPDATE conversations SET chat_watermark=sort_timestamp, has_chat_notifications=0 WHERE sort_timestamp>chat_watermark", null) : this.f3732e.m6195a("UPDATE conversations SET chat_watermark=sort_timestamp, has_chat_notifications=0 WHERE sort_timestamp>chat_watermark AND conversation_id=?", str);
    }

    public int m6113x(String str) {
        return TextUtils.isEmpty(str) ? this.f3732e.m6195a("UPDATE conversations SET hangout_watermark=sort_timestamp, has_video_notifications=0 WHERE sort_timestamp>hangout_watermark", null) : this.f3732e.m6195a("UPDATE conversations SET hangout_watermark=sort_timestamp, has_video_notifications=0 WHERE sort_timestamp>hangout_watermark AND conversation_id=?", str);
    }

    private int ai(String str) {
        return m5842a("getCallMediaType", str, "call_media_type", 0);
    }

    private long aj(String str) {
        return m5847a("getLastHangoutEventTime", str, "last_hangout_event_time", -1);
    }

    public long m6114y(String str) {
        return m5847a("getLastOtrModificationTime", str, "last_otr_modification_time", -1);
    }

    private boolean m5881b(int i, long j, String str) {
        int i2;
        int i3;
        if (f3712c) {
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
        if (j > ah(str).f3858h) {
            contentValues.put("has_video_notifications", Integer.valueOf(1));
        }
        if (i2 != i3) {
            contentValues.put("last_hangout_event_time", Long.valueOf(j));
        }
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        iid a = ((iih) jyn.m25426a(this.f3731a, iih.class)).mo1979a(this.f3734g);
        switch (i) {
            case -1:
                a.mo1693b().mo1714c(2922);
                break;
            case 0:
                break;
            case 1:
                a.mo1693b().mo1714c(2920);
                break;
            case 2:
                a.mo1693b().mo1714c(2921);
                break;
            default:
                glk.m17981d("Babel_ConvHelper", "Unknown callMediaType.", new Object[0]);
                break;
        }
        if (ai == 0 && i != 0) {
            a.mo1693b().mo1714c(2940);
        } else if (ai != 0 && i == 0) {
            a.mo1693b().mo1714c(2941);
        }
        return true;
    }

    public void m5961a(int i, long j, String str) {
        String str2 = "updateConversationCallMediaTypeAndNotify";
        String b = f3713d.m18078b(str2);
        m5958a();
        try {
            str2 = m5881b(i, j, str);
            m6015b();
            if (str2 != null) {
                blf.m5761a(this.f3733f);
            }
            f3713d.m18079c(b);
        } finally {
            m6028c();
        }
    }

    public void m5959a(int i, int i2, long j, String str) {
        if (f3712c) {
            glk.m17976b("Babel_ConvHelper", new StringBuilder(String.valueOf(str).length() + 127).append("updateConversationOtrStatus, conversationId=").append(str).append(", otrStatus=").append(i).append(", otrToggle=").append(i2).append(", eventTimestamp=").append(j).toString(), new Object[0]);
        }
        long y = m6114y(str);
        if (j >= y) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("otr_status", Integer.valueOf(i));
            contentValues.put("otr_toggle", Integer.valueOf(i2));
            contentValues.put("last_otr_modification_time", Long.valueOf(j));
            if (this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str}) > 0) {
                blf.m5820d(this);
            } else {
                glk.m17982e("Babel_ConvHelper", "updateConversationOtrState: failed to update database", new Object[0]);
            }
        } else if (f3712c) {
            glk.m17976b("Babel_ConvHelper", "dropping OTR update: " + j + " < " + y, new Object[0]);
        }
    }

    public void m5986a(String str, Boolean bool) {
        if (f3712c) {
            String valueOf = String.valueOf(bool);
            new StringBuilder((String.valueOf(str).length() + 76) + String.valueOf(valueOf).length()).append("updateConversationHasPersistentEvents, conversationId ").append(str).append(", hasPersistentEvents=").append(valueOf);
        }
        ContentValues contentValues = new ContentValues();
        String str2 = "has_persistent_events";
        int i = bool == null ? -1 : gwb.m2061b(bool) ? 1 : 0;
        contentValues.put(str2, Integer.valueOf(i));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    private Cursor m5885c(List<edk> list, int i) {
        int size = list.size() + 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[size];
        int i2 = 0;
        int size2 = list.size() - 1;
        while (size2 >= -1) {
            edo b;
            if (size2 == -1) {
                b = this.f3733f.m5632b();
                CharSequence charSequence = null;
            } else {
                edk edk = (edk) list.get(size2);
                b = edk.f11213b;
                Object f = edk.m13596f();
            }
            if (i2 > 0) {
                stringBuilder.append(" OR ");
            }
            if (b != null && !TextUtils.isEmpty(b.f11245b)) {
                stringBuilder.append("chat_id=?");
                size = i2 + 1;
                strArr[i2] = b.f11245b;
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
        return m5848a(stringBuilder.toString(), strArr, i);
    }

    private Cursor m5848a(String str, String[] strArr, int i) {
        String valueOf = String.valueOf("SELECT conversation_id FROM conversation_participants_view WHERE active=1 GROUP BY conversation_id HAVING SUM(CASE WHEN ");
        int length = strArr.length;
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 60) + String.valueOf(str).length()).append(valueOf).append(str).append(" THEN 1 ELSE 0 END) = ").append(length).append(" AND count(*) = ").append(strArr.length).toString();
        if (i == 2 || i == 3) {
            String valueOf2 = String.valueOf("SELECT conversation_id FROM conversations WHERE conversation_id IN (");
            String valueOf3 = String.valueOf("transport_type");
            String valueOf4 = String.valueOf(String.valueOf(i));
            valueOf = new StringBuilder((((String.valueOf(valueOf2).length() + 9) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf2).append(valueOf).append(") AND ").append(valueOf3).append(" = ").append(valueOf4).toString();
        }
        Cursor a = this.f3732e.m6199a(valueOf, strArr);
        if (f3712c) {
            int length2 = strArr.length;
            valueOf4 = String.valueOf(strArr[0]);
            new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf4).length()).append("queryMultiple ").append(length2).append("; selection ").append(valueOf).append(valueOf4).append(" ==> ").append(a.getCount());
        }
        return a;
    }

    private Cursor m5896e(List<edk> list) {
        int size = list.size() + 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[size];
        int i = 0;
        int size2 = list.size() - 1;
        while (size2 >= -1) {
            edo b;
            if (size2 == -1) {
                b = this.f3733f.m5632b();
            } else {
                b = ((edk) list.get(size2)).f11213b;
            }
            if (i > 0) {
                stringBuilder.append(" OR ");
            }
            if (b == null || TextUtils.isEmpty(b.f11244a)) {
                size = i;
            } else {
                stringBuilder.append("gaia_id=?");
                size = i + 1;
                strArr[i] = b.f11244a;
            }
            size2--;
            i = size;
        }
        return m5848a(stringBuilder.toString(), strArr, 1);
    }

    public bmh m5946a(edo edo, boolean z, int i) {
        Throwable th;
        bmh bmh = null;
        if (f3712c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("queryOneToOneConversation, participantId ").append(valueOf);
        }
        if (edo != null) {
            m5904p(edo.f11244a, edo.f11245b);
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
            if (edo == null || TextUtils.isEmpty(edo.f11244a)) {
                if (edo != null) {
                    if (!TextUtils.isEmpty(edo.f11245b)) {
                        append.append("chat_id=?");
                        strArr[2] = edo.f11245b;
                    }
                }
                valueOf2 = String.valueOf(edo);
                glk.m17982e("Babel_ConvHelper", new StringBuilder(String.valueOf(valueOf2).length() + 23).append("participantId is empty:").append(valueOf2).toString(), new Object[0]);
                iil.m21870a("participantId is empty");
                return bmh;
            }
            append.append("gaia_id=?");
            strArr[2] = edo.f11244a;
            if (z) {
                append.append(" AND is_temporary").append(" = 1");
            }
            a = this.f3732e.m6199a(append.toString(), strArr);
            try {
                if (a.moveToFirst()) {
                    bmh = new bmh();
                    do {
                        valueOf2 = a.getString(0);
                        if (TextUtils.isEmpty(bmh.f3963a) || (bmh.f3963a.startsWith("client_generated:") && !valueOf2.startsWith("client_generated:"))) {
                            bmh.f3963a = valueOf2;
                            bmh.f3965c = a.getLong(1);
                            bmh.f3966d = a.getInt(2);
                            bmh.f3967e = a.getInt(3);
                            bmh.f3964b = a.getString(4);
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

    public bme m6009b(long j) {
        if (f3712c) {
            new StringBuilder(49).append("getMessageInfo, messageRowId=").append(j);
        }
        List o = m5903o("_id", String.valueOf(j));
        if (o.size() == 0) {
            return null;
        }
        return (bme) o.get(0);
    }

    public bme m6057g(String str, String str2) {
        Cursor a;
        Throwable th;
        bme bme = null;
        try {
            a = this.f3732e.m6200a("messages_view", f3725u, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    bme = m5891d(a);
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

    private List<bme> m5903o(String str, String str2) {
        Throwable th;
        List arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("messages_view", f3725u, String.valueOf(str).concat("=? "), new String[]{str2}, null, null, null);
            while (a.moveToNext()) {
                try {
                    arrayList.add(m5891d(a));
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

    private bme m5891d(Cursor cursor) {
        fwy fwy = fwy.values()[cursor.getInt(5)];
        fwx fwx = fwx.values()[cursor.getInt(4)];
        String string = cursor.getString(3);
        switch (blq.f3738a[fwy.ordinal()]) {
            case 1:
            case 2:
                break;
            default:
                string = gwb.m1661a(fwy, this.f3733f, fwx, null, cursor.getString(2), cursor.getString(26), cursor.getString(27), cursor.getInt(33), true);
                break;
        }
        return new bme(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), string, fwx, fwy, cursor.getLong(6), cursor.getLong(7), cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11), cursor.getString(12), cursor.getString(13), cursor.getString(14), cursor.getDouble(15), cursor.getDouble(16), cursor.getString(17), cursor.getString(18), cursor.getInt(19), cursor.getString(20), cursor.getInt(21), cursor.getInt(22), cursor.getInt(23), cursor.getString(24), cursor.getInt(25), cursor.getString(26), cursor.getString(27), cursor.getString(28), cursor.getInt(29), cursor.getString(32), cursor.getString(31), cursor.getString(30), cursor.getLong(34), cursor.getInt(35), cursor.getInt(36), cursor.getBlob(37));
    }

    public void m5970a(ezj ezj) {
        String str;
        String valueOf;
        Cursor cursor = null;
        if (f3712c) {
            str = "finalizeMessageFromResponse, conversationId ";
            valueOf = String.valueOf(ezj.m14810k());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        String k = ezj.m14810k();
        fwx n = m6090n(k, ezj.m14811l());
        if (n != null && n == fwx.PENDING_DELETE) {
            m5910C();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", ezj.m14812m());
        contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
        contentValues.put("type", Integer.valueOf(fwy.OUTGOING_USER_MESSAGE.ordinal()));
        contentValues.put("timestamp", Long.valueOf(ezj.d));
        boolean z = ezj.c.f12529b == 6;
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
        if (ezj.m14813n() > 0) {
            contentValues.put("expiration_timestamp", Long.valueOf(ezj.m14813n()));
        } else {
            contentValues.putNull("expiration_timestamp");
        }
        if (ezj.m14814o().length > 0) {
            str = ezj.m14814o()[0];
            contentValues.put("image_id", str);
        } else {
            Object obj = cursor;
        }
        if (ezj.m14815p().length > 0) {
            contentValues.put("album_id", ezj.m14815p()[0]);
        }
        if (ezj.m14817r().length > 0) {
            contentValues.put("stream_id", ezj.m14817r()[0]);
        }
        String[] strArr = new String[]{String.valueOf(ezj.m14811l()), k};
        if (ezj.m14814o().length > 0) {
            eyi eyi;
            String str2;
            valueOf = ezj.m14816q()[0];
            if (str != null) {
                eyi ae = ae(str);
                if (ae != null) {
                    an(str);
                    if (ae.f12522c != null) {
                        valueOf = "file://";
                        str = String.valueOf(ae.f12522c);
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
            if (eyi == null && !ezj.m14818s()) {
                try {
                    cursor = this.f3732e.m6200a("messages", f3726v, "message_id=? AND conversation_id=?", strArr, null, null, null);
                    if (cursor.moveToFirst()) {
                        obj = cursor.getString(0);
                        if (!TextUtils.isEmpty(obj)) {
                            Uri parse = Uri.parse(obj);
                            if (TextUtils.equals(parse.getAuthority(), EsProvider.f5998a)) {
                                this.f3731a.getContentResolver().delete(parse, null, null);
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
        if (f3712c) {
            str = String.valueOf(String.valueOf(ezj.m14811l()));
            new StringBuilder((String.valueOf(k).length() + 30) + String.valueOf(str).length()).append("finalizeMessageFromResponse: ").append(k).append(" ").append(str);
        }
        if (m5955a(contentValues, "message_id=? AND conversation_id=?", strArr).isEmpty()) {
            strArr[0] = String.valueOf(ezj.m14812m());
            if (m5955a(contentValues, "message_id=? AND conversation_id=?", strArr).isEmpty()) {
                valueOf = String.valueOf(ezj.m14811l());
                String valueOf2 = String.valueOf(ezj.m14812m());
                glk.m17982e("Babel_ConvHelper", new StringBuilder((String.valueOf(valueOf).length() + 68) + String.valueOf(valueOf2).length()).append("Failed to update the given message with client id: ").append(valueOf).append(" and message id: ").append(valueOf2).toString(), new Object[0]);
                iil.m21870a("Failed to update the given message with client id");
            }
        }
        if (str2 != null) {
            contentValues.clear();
            contentValues.put("snippet_image_url", str2);
            int a = this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{k});
            if (a != 1) {
                glk.m17982e("Babel", new StringBuilder(String.valueOf(k).length() + 84).append("couldn't update remote url for conversation; got count ").append(a).append(" for conversation ").append(k).toString(), new Object[0]);
                iil.m21870a("couldn't update remote url for conversation");
            }
        }
    }

    public void m5991a(String str, String str2, Uri uri, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.ON_SERVER.ordinal()));
        contentValues.put("type", Integer.valueOf(fwy.OUTGOING_USER_MESSAGE.ordinal()));
        if (uri != null) {
            contentValues.put("external_ids", gwb.m1678a(uri.toString()));
        }
        if (j > 0) {
            contentValues.put("sms_message_size", Long.valueOf(j));
        }
        m5955a(contentValues, "message_id=? AND conversation_id=?", new String[]{String.valueOf(str2), str});
    }

    public long m5941a(bmf bmf) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", bmf.f3953a);
        contentValues.put("message_id", bmf.f3954b);
        contentValues.put("url", bmf.f3955c);
        contentValues.put("content_type", bmf.f3956d);
        contentValues.put("width", Integer.valueOf(bmf.f3957e));
        contentValues.put("height", Integer.valueOf(bmf.f3958f));
        return this.f3732e.m6197a("multipart_attachments", null, contentValues);
    }

    public long m5939a(blw blw) {
        int i = blw.f3786f;
        glk.m17970a("Babel", "Creating suggestion type: " + i + " timestamp: " + blw.f3784d, new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", blw.f3781a);
        contentValues.put("event_id", blw.f3782b);
        contentValues.put("suggestion_id", blw.f3783c);
        contentValues.put("timestamp", Long.valueOf(blw.f3784d));
        contentValues.put("expiration_time_usec", Long.valueOf(blw.f3785e));
        contentValues.put("type", Integer.valueOf(blw.f3786f));
        contentValues.put("gem_asset_url", blw.f3787g);
        contentValues.put("gem_horizontal_alignment", Integer.valueOf(blw.f3788h));
        contentValues.put("matched_message_substring", blw.f3789i);
        long a = this.f3732e.m6197a("event_suggestions", null, contentValues);
        if (a > -1) {
            blf.m5822e(this, blw.f3781a);
        }
        return a;
    }

    public long m5940a(bmd bmd) {
        int i = 1;
        if (f3712c) {
            String str = bmd.f3890c;
            String valueOf = String.valueOf(bmd.f3893f);
            String str2 = bmd.f3888a;
            new StringBuilder(((String.valueOf(str).length() + 68) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append("createMessage, conversationId ").append(str).append(", senderId=").append(valueOf).append(", messageClientGeneratedId=").append(str2);
        }
        Long i2 = m6068i(bmd.f3890c, bmd.f3888a);
        int i3 = i2 != null ? 1 : 0;
        Long h = m6064h(bmd.f3890c, bmd.f3888a);
        int i4;
        if (h == null || gwb.m1523a(h) <= 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (i3 == 0 || r3 == 0) {
            String str3;
            ContentValues c;
            Long b;
            valueOf = bmd.f3890c;
            if (!af(valueOf)) {
                String str4;
                String str5;
                if (valueOf.startsWith("client_generated:")) {
                    valueOf = RealTimeChatService.m8987a(valueOf);
                    if (valueOf == null || !af(valueOf)) {
                        str4 = bmd.f3890c;
                        str5 = bmd.f3888a;
                        glk.m17982e("Babel_ConvHelper", new StringBuilder((String.valueOf(str4).length() + 70) + String.valueOf(str5).length()).append("Messaging: skip message because conversation doesn't exist:").append(str4).append(" messageId:").append(str5).toString(), new Object[0]);
                        iil.m21870a("Messaging: skip message because conversation doesn't exist isClientGeneratedId=true");
                    } else if (f3712c) {
                        str3 = bmd.f3890c;
                        new StringBuilder((String.valueOf(str3).length() + 43) + String.valueOf(valueOf).length()).append("Messaging: conversationId changed from ").append(str3).append(" to ").append(valueOf);
                    }
                } else {
                    str4 = bmd.f3890c;
                    str5 = bmd.f3888a;
                    glk.m17982e("Babel_ConvHelper", new StringBuilder((String.valueOf(str4).length() + 70) + String.valueOf(str5).length()).append("Messaging: skip message because conversation doesn't exist:").append(str4).append(" messageId:").append(str5).toString(), new Object[0]);
                    iil.m21870a("Messaging: skip message because conversation doesn't exist isClientGeneratedId=false");
                }
                if (i != 0) {
                    return -1;
                }
                c = m5884c(bmd);
                b = m5878b(bmd);
                if (b != null) {
                    m5859a(c, b, bmd.f3890c);
                    return gwb.m1523a(b);
                } else if (i3 != 0) {
                    return m6008b(c);
                } else {
                    m5859a(c, i2, bmd.f3890c);
                    return gwb.m1523a(i2);
                }
            }
            if (f3712c && bmd.f3889b != null) {
                str3 = "Messaging: saving message:";
                valueOf = String.valueOf(bmd.f3888a);
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
            c = m5884c(bmd);
            b = m5878b(bmd);
            if (b != null) {
                m5859a(c, b, bmd.f3890c);
                return gwb.m1523a(b);
            } else if (i3 != 0) {
                return m6008b(c);
            } else {
                m5859a(c, i2, bmd.f3890c);
                return gwb.m1523a(i2);
            }
        }
        if (bmd.f3912y) {
            long a = gwb.m1523a(i2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("init_timestamp", Long.valueOf(bmd.f3884W));
            contentValues.put("in_app_msg_latency", Long.valueOf(bmd.f3885X));
            this.f3732e.m6194a("messages", contentValues, "_id=? AND init_timestamp=?", new String[]{String.valueOf(a), "0"});
        }
        return m5845a(bmd, i2);
    }

    private long m5845a(bmd bmd, Long l) {
        if (f3712c) {
            String str = bmd.f3888a;
            String str2 = bmd.f3890c;
            new StringBuilder((String.valueOf(str).length() + 124) + String.valueOf(str2).length()).append("createMessage called for a message already in the database. message id: ").append(str).append(" conversationId: ").append(str2).append(" new notification level ").append(bmd.f3913z);
        }
        if (bmd.f3913z > 10) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_level", Integer.valueOf(bmd.f3913z));
            if (bmd.f3882U == 1) {
                contentValues.put("observed_status", Integer.valueOf(bmd.f3882U));
            }
            m5859a(contentValues, l, bmd.f3890c);
        }
        return gwb.m1523a(l);
    }

    private Long m5878b(bmd bmd) {
        if (bmd.f3889b == null) {
            return null;
        }
        Long i = m6068i(bmd.f3890c, bmd.f3889b);
        if (i != null) {
            if (f3712c || glk.m17973a("Babel", 3)) {
                String str = bmd.f3890c;
                String str2 = bmd.f3888a;
                glk.m17976b("Babel", new StringBuilder((String.valueOf(str).length() + 75) + String.valueOf(str2).length()).append("createMessage found clientGeneratedId ").append(str).append(", messageId ").append(str2).append(" -- fixing up the message").toString(), new Object[0]);
            }
            Long h = m6064h(bmd.f3890c, bmd.f3889b);
            if (h != null) {
                m5975a(bmd.f3890c, bmd.f3896i, gwb.m1523a(h));
            }
            fwx o = m5902o(gwb.m1523a(i));
            if (o != null && o == fwx.PENDING_DELETE) {
                m5910C();
            }
        }
        return i;
    }

    private ContentValues m5884c(bmd bmd) {
        int ordinal;
        String str = bmd.f3890c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", bmd.f3888a);
        contentValues.put("conversation_id", str);
        if (bmd.f3893f != null) {
            contentValues.put("author_chat_id", bmd.f3893f.f11245b);
            contentValues.put("author_gaia_id", bmd.f3893f.f11244a);
        }
        contentValues.put("text", bmd.f3894g);
        contentValues.put("status", Integer.valueOf(bmd.f3895h));
        contentValues.put("notification_level", Integer.valueOf(bmd.f3913z));
        String str2 = "type";
        if (bmd.f3912y) {
            ordinal = fwy.OUTGOING_USER_MESSAGE.ordinal();
        } else {
            ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        }
        contentValues.put(str2, Integer.valueOf(ordinal));
        contentValues.put("transport_type", Integer.valueOf(bmd.f3891d));
        contentValues.put("transport_phone", bmd.f3892e);
        contentValues.put("timestamp", Long.valueOf(bmd.f3896i));
        contentValues.put("width_pixels", Integer.valueOf(bmd.f3864C));
        contentValues.put("height_pixels", Integer.valueOf(bmd.f3865D));
        contentValues.put("image_id", bmd.f3897j);
        contentValues.put("album_id", bmd.f3899l);
        contentValues.put("image_rotation", Integer.valueOf(bmd.f3900m));
        contentValues.put("attachment_uploading_progress", Integer.valueOf(bmd.f3911x));
        if (!TextUtils.isEmpty(bmd.f3897j)) {
            eyi ae = ae(bmd.f3897j);
            String str3;
            if (ae != null) {
                if (ae.f12522c != null) {
                    str2 = "local_url";
                    str3 = "file://";
                    str = String.valueOf(ae.f12522c);
                    if (str.length() != 0) {
                        str = str3.concat(str);
                    } else {
                        str = new String(str3);
                    }
                    contentValues.put(str2, str);
                } else {
                    str2 = "local_url";
                    str3 = "sticker://";
                    str = String.valueOf(bmd.f3897j);
                    contentValues.put(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
                }
            } else if (!TextUtils.isEmpty(bmd.f3898k) && bmd.f3898k.equals(gwb.m1998b(this.f3731a, "babel_stickers_account_id", "108618507921641169817"))) {
                str2 = "local_url";
                str3 = "sticker://";
                str = String.valueOf(bmd.f3897j);
                contentValues.put(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
            }
        }
        if (bmd.f3901n != null) {
            if (bmd.f3901n.startsWith("content://")) {
                contentValues.put("local_url", bmd.f3901n);
            } else {
                contentValues.put("remote_url", bmd.f3901n);
            }
        }
        contentValues.put("attachment_name", bmd.f3902o);
        contentValues.put("attachment_description", bmd.f3903p);
        contentValues.put("attachment_target_url", bmd.f3907t);
        contentValues.put("attachment_target_url_name", bmd.f3908u);
        contentValues.put("attachment_target_url_description", bmd.f3909v);
        contentValues.put("attachment_blob_data", bmd.f3910w);
        contentValues.put("attachment_content_type", bmd.f3866E);
        contentValues.put("latitude", Double.valueOf(bmd.f3904q));
        contentValues.put("longitude", Double.valueOf(bmd.f3905r));
        contentValues.put("address", bmd.f3906s);
        if (bmd.f3862A > 0) {
            contentValues.put("expiration_timestamp", Long.valueOf(bmd.f3862A));
        }
        contentValues.put("off_the_record", Boolean.valueOf(bmd.f3863B));
        if (bmd.f3867F != null) {
            contentValues.put("external_ids", bmd.f3867F);
        }
        contentValues.put("sms_timestamp_sent", Long.valueOf(bmd.f3868G));
        contentValues.put("sms_priority", Integer.valueOf(bmd.f3869H));
        contentValues.put("sms_message_size", Long.valueOf(bmd.f3870I));
        contentValues.put("mms_subject", bmd.f3871J);
        if (bmd.f3872K != null) {
            contentValues.put("sms_raw_sender", bmd.f3872K);
        }
        if (bmd.f3873L != null) {
            contentValues.put("sms_raw_recipients", bmd.f3873L);
        }
        contentValues.put("persisted", Boolean.valueOf(bmd.f3874M));
        contentValues.put("sms_message_status", Integer.valueOf(bmd.f3875N));
        contentValues.put("sms_type", Integer.valueOf(bmd.f3876O));
        contentValues.put("forwarded_mms_url", bmd.f3877P);
        contentValues.put("forwarded_mms_count", Integer.valueOf(bmd.f3878Q));
        contentValues.put("sending_error", Integer.valueOf(bmd.f3879R));
        contentValues.put("voicemail_length", Integer.valueOf(bmd.f3880S));
        contentValues.put("stream_url", bmd.f3881T);
        if (bmd.f3882U == 1) {
            contentValues.put("observed_status", Integer.valueOf(bmd.f3882U));
        }
        contentValues.put("receive_type", Integer.valueOf(bmd.f3883V));
        contentValues.put("init_timestamp", Long.valueOf(bmd.f3884W));
        contentValues.put("in_app_msg_latency", Long.valueOf(bmd.f3885X));
        contentValues.put("attachments", bmd.f3886Y);
        contentValues.put("is_user_mentioned", Boolean.valueOf(bmd.f3887Z));
        return contentValues;
    }

    public final eth m5948a(String str, int i, int i2, int i3) {
        String str2;
        String valueOf;
        Throwable th;
        Cursor cursor = null;
        if (f3712c) {
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
            switch (blq.f3739b[i - 1]) {
                case 1:
                    str3 = "conversation_id=? AND observed_status!=? AND notified>0";
                    break;
                case 2:
                    str3 = "conversation_id=? AND observed_status!=? AND notified=0";
                    break;
                default:
                    str3 = "conversation_id=? AND observed_status!=?";
                    break;
            }
            switch (blq.f3740c[i2 - 1]) {
                case 1:
                    charSequence = "1";
                    break;
                case 2:
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
            Cursor a = this.f3732e.m6200a("messages", new String[]{"_id", "message_id"}, str3, new String[]{str, "1"}, null, null, null);
            if (a == null) {
                if (a != null) {
                    a.close();
                }
                return null;
            }
            try {
                m5958a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("observed_status", Integer.valueOf(i3));
                while (a.moveToNext()) {
                    long j = a.getLong(0);
                    CharSequence string = a.getString(1);
                    if (TextUtils.isEmpty(string)) {
                        glk.m17981d("Babel_ConvHelper", "getUnobservedEvent: found a message with no message id.", new Object[0]);
                    } else {
                        if (i != bmg.f3961c) {
                            m5859a(contentValues, Long.valueOf(j), str);
                        }
                        arrayList.add(string);
                    }
                }
                m6015b();
                m6028c();
                blf.m5821d(this, str);
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

    public void m5993a(String str, String str2, String str3, long j, long j2) {
        if (f3712c) {
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
            glk.m17981d("Babel_ConvHelper", new StringBuilder(String.valueOf(str3).length() + 58).append("attempt to update a message id [").append(str3).append("] for null conversation id").toString(), new Object[0]);
            return;
        }
        m5955a(contentValues, "message_id=? AND conversation_id=?", new String[]{str, str2});
    }

    public Pair<String, Integer> m6025c(long j) {
        Cursor a;
        Throwable th;
        Object obj = null;
        if (f3712c) {
            new StringBuilder(58).append("getConversationIdStatus, messageRowId=").append(j);
        }
        try {
            bmv bmv = this.f3732e;
            String str = "messages";
            String[] strArr = new String[]{"conversation_id", "status"};
            String valueOf = String.valueOf("_id=");
            String valueOf2 = String.valueOf(String.valueOf(j));
            a = bmv.m6200a(str, strArr, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null, null, null, null);
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

    public int m6116z(String str) {
        return m5842a("getConversationOtrStatus", str, "otr_status", 1);
    }

    public void m5975a(String str, long j, long j2) {
        Throwable th;
        if (f3712c) {
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
            a = this.f3732e.m6200a("messages", strArr, new StringBuilder(((String.valueOf(valueOf).length() + 26) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(ordinal).append(") AND ").append(valueOf2).append(">? AND ").append(valueOf3).append("<?").toString(), new String[]{str, String.valueOf(j2), String.valueOf(j)}, null, null, "timestamp ASC");
            try {
                contentValues.clear();
                while (a.moveToNext()) {
                    long j3 = a.getLong(0);
                    j++;
                    contentValues.put("timestamp", Long.valueOf(j));
                    m5859a(contentValues, Long.valueOf(j3), str);
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

    public Long m6064h(String str, String str2) {
        Cursor a;
        Throwable th;
        Long l = null;
        if (f3712c) {
            String str3 = "getMessageTimeStamp, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        try {
            a = this.f3732e.m6200a("messages", new String[]{"timestamp"}, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
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

    public List<Pair<String, String>> m6038d(long j) {
        Throwable th;
        if (f3712c) {
            new StringBuilder(68).append("queryConversationsSince, lastSuccessfulSyncTime=").append(j);
        }
        List<Pair<String, String>> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("messages_view", new String[]{"conversation_id", "message_id"}, "timestamp >? AND conversation_id NOT LIKE ?", new String[]{String.valueOf(j), "client_generated:%"}, null, null, "conversation_id");
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

    public List<Pair<String, Long>> m6095o() {
        Throwable th;
        List<Pair<String, Long>> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", f3727w, "self_watermark < sort_timestamp AND conversation_id NOT LIKE 'client_generated:%'", null, null, null, null);
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

    public void m6045e(long j) {
        Throwable th;
        m5936a("timestamp>? AND persisted = 1", new String[]{String.valueOf(j)});
        ArrayList arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", f3727w, "self_watermark >? AND conversation_id NOT LIKE 'client_generated:%'", new String[]{String.valueOf(j)}, null, null, null);
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
                this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{(String) obj});
                blf.m5823f(this, r1);
            }
            bkq.m5677b(this.f3731a, m6056g().m5638g(), "last_successful_sync_time", j);
            blf.m5820d(this);
            blf.m5817c(this);
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void m5907A(String str) {
        if (f3712c) {
            String str2 = "removeConversationFromDatabase:";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        if (this.f3732e.m6196a("conversations", "conversation_id=?", new String[]{str}) > 0) {
            blf.m5820d(this);
        }
    }

    public void m5909B(String str) {
        if (f3712c) {
            String str2 = "deleteConversation:";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        this.f3732e.m6196a("conversations", "conversation_id=?", new String[]{str});
        RealTimeChatService.f6752i.post(new fhp(str, m6056g()));
    }

    private void m5835G() {
        this.f3732e.m6196a("conversations", "transport_type=3", null);
    }

    public boolean m6035c(String str, long j) {
        Cursor a;
        Throwable th;
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 60).append("deleteConversation:").append(str).append(" upperBoundTimestamp:").append(j);
        }
        int a2 = m5936a("conversation_id=? AND (timestamp<=? OR timestamp IS NULL)", new String[]{str, String.valueOf(j)});
        try {
            a = this.f3732e.m6200a("messages", new String[]{"_id"}, "conversation_id=?", new String[]{str}, null, null, null);
            try {
                boolean z = a.getCount() == 0;
                if (a != null) {
                    a.close();
                }
                if (z) {
                    z = m6087m(str, -2147483648L);
                    boolean startsWith = str.startsWith("client_generated:sms:");
                    new StringBuilder(76).append("no messages: isHidden: ").append(z).append(" messages deleted: ").append(a2).append(" isLocalSms: ").append(startsWith);
                    if (z || a2 > 0 || startsWith) {
                        m5909B(str);
                        return true;
                    }
                }
                m5996a(str, null, j);
                return false;
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

    public void m5911C(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (f3712c) {
                String str2 = "deleteMessagesFromConversation, conversationId=";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            m5936a("conversation_id=?", new String[]{str});
        }
    }

    public int m5935a(String str, fwy fwy) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (f3712c) {
            String valueOf = String.valueOf(fwy);
            new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf).length()).append("deleteMessagesFromConversation, conversationId=").append(str).append(" type=").append(valueOf);
        }
        return m5936a("conversation_id=? AND type=?", new String[]{str, String.valueOf(fwy.ordinal())});
    }

    public void m5987a(String str, Long l, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (f3712c) {
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
            m5936a(stringBuilder.toString(), new String[]{str, String.valueOf(l)});
        }
    }

    public void m6052f(long j) {
        if (f3712c) {
            new StringBuilder(42).append("deleteMessages, rowId=").append(j);
        }
        String n = gwb.m2307n(m6058g(j));
        if (n != null && n.startsWith("content://")) {
            this.f3731a.getContentResolver().delete(Uri.parse(n), null, null);
        }
        m5936a("_id=?", new String[]{String.valueOf(j)});
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
        this.f3732e.m6194a("conversations", contentValues, "snippet_message_row_id=?", new String[]{String.valueOf(j)});
    }

    public String m6058g(long j) {
        Throwable th;
        Cursor cursor = null;
        if (f3712c) {
            new StringBuilder(55).append("getMessageExternalId, messageRowId=").append(j);
        }
        try {
            bmv bmv = this.f3732e;
            String str = "messages";
            String[] strArr = new String[]{"external_ids"};
            String valueOf = String.valueOf("_id=");
            String valueOf2 = String.valueOf(String.valueOf(j));
            Cursor a = bmv.m6200a(str, strArr, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null, null, null, null);
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

    public int m6062h(long j) {
        if (f3712c) {
            String str = "deleteExpiredMessages for account: ";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        m5958a();
        try {
            int a = m5936a("expiration_timestamp<? AND transport_type!=3", new String[]{String.valueOf(j)});
            m6015b();
            return a;
        } finally {
            m6028c();
        }
    }

    public int m6036d(String str, long j) {
        if (f3712c) {
            String str2 = "deletePlayedEventSuggestions for account: ";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        m5958a();
        try {
            int a = this.f3732e.m6196a("event_suggestions", "conversation_id=? AND timestamp<=?", new String[]{str, String.valueOf(j)});
            m6015b();
            return a;
        } finally {
            m6028c();
        }
    }

    public int m6066i(long j) {
        if (f3712c) {
            String str = "deleteExpiredEventSuggestions for account: ";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        m5958a();
        try {
            int a = this.f3732e.m6196a("event_suggestions", "expiration_time_usec<=?", new String[]{String.valueOf(j)});
            m6015b();
            if (a > 0 && f3712c) {
                new StringBuilder(78).append("deleteExpiredEventSuggestions:").append(a).append(" cutoffTimestamp:").append(j);
            }
            return a;
        } finally {
            m6028c();
        }
    }

    public int m6070j(long j) {
        if (f3712c) {
            String str = "deleteEmptyConversations for account: ";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        m5958a();
        try {
            int a = this.f3732e.m6196a("conversations", "(has_oldest_message =1 OR has_persistent_events =0) AND sort_timestamp <? AND status != 1 AND NOT EXISTS (SELECT 1 FROM messages WHERE messages.conversation_id=conversations.conversation_id)", new String[]{String.valueOf(j)});
            m6015b();
            if (a > 0) {
                if (f3712c) {
                    new StringBuilder(73).append("deleteEmptyConversations:").append(a).append(" cutoffTimestamp:").append(j);
                }
                blf.m5820d(this);
            }
            return a;
        } finally {
            m6028c();
        }
    }

    public int m6074k(long j) {
        if (f3712c) {
            String str = "deleteExpiredInvitations for account:";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        m5958a();
        try {
            int a = this.f3732e.m6196a("conversations", "sort_timestamp <? AND status = 1 AND otr_status = 1", new String[]{String.valueOf(j)});
            m6015b();
            if (a > 0) {
                if (f3712c) {
                    new StringBuilder(73).append("deleteExpiredInvitations:").append(a).append(" cutoffTimestamp:").append(j);
                }
                blf.m5820d(this);
            }
            return a;
        } finally {
            m6028c();
        }
    }

    public Long m6068i(String str, String str2) {
        Throwable th;
        Cursor cursor = null;
        if (f3712c) {
            new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(str2).length()).append("queryMessageRowId, conversationId=").append(str).append(", messageId=").append(str2);
        }
        try {
            Cursor a = this.f3732e.m6200a("messages", new String[]{"_id"}, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
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

    public long m5942a(String str, String str2, fwx fwx, edo edo, fwy fwy, long j, long j2, long j3, int i, String str3, String str4) {
        return m5943a(str, str2, fwx, edo, fwy, j, j2, 0, i, str3, str4, 0, null);
    }

    public long m5943a(String str, String str2, fwx fwx, edo edo, fwy fwy, long j, long j2, long j3, int i, String str3, String str4, int i2, String str5) {
        if (f3712c) {
            String valueOf = String.valueOf(fwy);
            new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(valueOf).length()).append("insertSystemMessage: conversationId=").append(str).append("; type ").append(valueOf).append("; ts ").append(j);
        }
        Long i3 = m6068i(str, str2);
        if (i3 == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", str2);
            contentValues.put("conversation_id", str);
            contentValues.put("author_chat_id", edo.f11245b);
            contentValues.put("author_gaia_id", edo.f11244a);
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
            i3 = Long.valueOf(m6008b(contentValues));
        }
        return gwb.m1523a(i3);
    }

    public void m5985a(String str, fwx fwx, fwx fwx2) {
        String valueOf;
        String[] strArr;
        if (f3712c) {
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
        m5955a(contentValues, valueOf, strArr);
        blf.m5821d(this, str);
    }

    public void m5992a(String str, String str2, fwx fwx, int i) {
        String valueOf = String.valueOf(fwx);
        valueOf = new StringBuilder(((String.valueOf(str).length() + 56) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("setMessageStatusSent: conversationId=").append(str).append(" messageId=").append(str2).append(" status=").append(valueOf).toString();
        if (fwx == fwx.FAILED_TO_SEND) {
            glk.m17979c("Babel_ConvHelper", valueOf, new Object[0]);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.ordinal()));
        if (fwx == fwx.FAILED_TO_SEND) {
            contentValues.put("sending_error", Integer.valueOf(i));
            contentValues.put("notified_for_failure", Integer.valueOf(0));
            ((ect) jyn.m25426a(this.f3731a, ect.class)).mo1838d(this.f3733f.m5638g(), true);
        } else {
            contentValues.put("sending_error", Integer.valueOf(0));
        }
        List a = m5955a(contentValues, "conversation_id=? AND message_id=?", new String[]{str, str2});
        if (a.size() != 1) {
            String valueOf2 = String.valueOf(fwx);
            glk.m17982e("Babel", new StringBuilder(((String.valueOf(valueOf2).length() + 72) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("!!!!! failed to set message status to ").append(valueOf2).append(" for ").append(str).append(" ").append(str2).append("; updateCount == ").append(a.size()).toString(), new Object[0]);
        }
        blf.m5821d(this, str);
        if (fwx == fwx.FAILED_TO_SEND || fwx == fwx.ON_SERVER) {
            blf.m5820d(this);
            blf.m5821d(this, str);
        }
    }

    public void m5965a(long j, fwx fwx, long j2) {
        String valueOf;
        if (f3712c) {
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
        m5955a(contentValues, valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2), null);
    }

    public void m6047e(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.PENDING_DELETE.ordinal()));
        m5955a(contentValues, "conversation_id=? AND _id=?", new String[]{str, Long.toString(j)});
    }

    public void m6097p() {
        m5936a(null, null);
        this.f3732e.m6196a("conversation_participants", null, null);
        this.f3732e.m6196a("conversations", null, null);
        blf.m5820d(this);
        blf.m5817c(this);
        blf.m5811b(this);
    }

    private Cursor m5877b(String str, edo edo) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2;
        CharSequence charSequence;
        m5904p(edo.f11244a, edo.f11245b);
        if (!TextUtils.isEmpty(edo.f11244a)) {
            str2 = edo.f11244a;
            charSequence = "gaia_id";
        } else if (TextUtils.isEmpty(edo.f11245b)) {
            Object obj = null;
            charSequence = null;
        } else {
            str2 = edo.f11245b;
            Object obj2 = "chat_id";
        }
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        return this.f3732e.m6200a("participants_view", new String[]{str}, String.valueOf(charSequence).concat("=?"), new String[]{str2}, null, null, null);
    }

    public String m5950a(edo edo) {
        Cursor b;
        Throwable th;
        String str = null;
        if (f3712c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 40).append("queryParticipantFullName, participantId=").append(valueOf);
        }
        try {
            b = m5877b("full_name", edo);
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

    private String m5892d(edo edo) {
        Cursor b;
        Throwable th;
        String str = null;
        if (f3712c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("queryParticipantFirstName, participantId=").append(valueOf);
        }
        try {
            b = m5877b("first_name", edo);
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

    public int m6006b(edo edo) {
        int i = -1;
        if (f3712c) {
            String valueOf = String.valueOf(edo);
            new StringBuilder(String.valueOf(valueOf).length() + 41).append("queryParticipantIdBlocked, participantId=").append(valueOf);
        }
        if (edo != null) {
            Cursor cursor = null;
            try {
                cursor = m5877b("blocked", edo);
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

    public String m6026c(edo edo) {
        String a = m5950a(edo);
        if (a == null) {
            return m5892d(edo);
        }
        return a;
    }

    public void m5912D(String str) {
        if (f3712c) {
            String str2 = "ensureLocalParticipantExists, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        bko g = m6056g();
        m5981a(str, gwb.m1601a(g.m5632b(), g.m5634c(), g.m5634c(), null, g.m5647p(), null), true);
    }

    public void m5980a(String str, bcg bcg) {
        if (f3712c) {
            String valueOf = String.valueOf(bcg.m4845b());
            new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf).length()).append("insertCircleParticipant ConversationId: ").append(str).append(", circle id: ").append(valueOf);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", str);
        contentValues.put("participant_type", Integer.valueOf(edq.CIRCLE.ordinal()));
        contentValues.put("active", Integer.valueOf(1));
        contentValues.put("participant_row_id", Integer.valueOf(m5844a(null, null, null, bcg.m4845b(), bcg.m4847d(), true)));
        this.f3732e.m6197a("conversation_participants", null, contentValues);
    }

    public void m6099q() {
        this.f3732e.m6196a("blocked_people", "gaia_id IS NOT NULL", null);
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6010m, null);
    }

    public boolean m6073j(String str, String str2) {
        Throwable th;
        Cursor a;
        try {
            boolean z;
            if (!TextUtils.isEmpty(null)) {
                a = this.f3732e.m6200a("blocked_people", new String[]{"_id"}, "gaia_id=?", new String[]{null}, null, null, null);
            } else if (TextUtils.isEmpty(str2)) {
                a = null;
            } else {
                a = this.f3732e.m6200a("blocked_people", new String[]{"_id"}, "chat_id=?", new String[]{str2}, null, null, null);
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

    public void m5994a(String str, String str2, boolean z) {
        String str3;
        String[] strArr;
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            str3 = "gaia_id=?";
            strArr = new String[]{str};
        } else if (TextUtils.isEmpty(str2)) {
            glk.m17982e("Babel_ConvHelper", "setUserBlocked without a valid gaiaId or chatId", new Object[0]);
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
        this.f3732e.m6194a("participants", contentValues, str3, strArr);
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6010m, null);
        bko g = m6056g();
        Builder buildUpon = EsProvider.f6015r.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(g.m5638g()));
        this.f3731a.getContentResolver().notifyChange(buildUpon.build(), null);
    }

    public void m6078k(String str, String str2) {
        String str3;
        String[] strArr;
        if (!TextUtils.isEmpty(str)) {
            str3 = "gaia_id=?";
            strArr = new String[]{str};
        } else if (TextUtils.isEmpty(str2)) {
            glk.m17982e("Babel_ConvHelper", "removeBlockedPerson without a valid gaiaId or chatId", new Object[0]);
            return;
        } else {
            str3 = "chat_id=?";
            strArr = new String[]{str2};
        }
        this.f3732e.m6196a("blocked_people", str3, strArr);
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6010m, null);
    }

    public void m6031c(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("gaia_id", str);
        contentValues.put("chat_id", str2);
        contentValues.put("name", str3);
        contentValues.put("profile_photo_url", str4);
        this.f3732e.m6197a("blocked_people", null, contentValues);
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6010m, null);
    }

    public void m6100r() {
        this.f3732e.m6196a("dismissed_contacts", null, null);
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6011n, null);
    }

    public void m5913E(String str) {
        this.f3732e.m6196a("dismissed_contacts", "gaia_id=?", new String[]{str});
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6011n, null);
    }

    public void m6041d(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("gaia_id", str);
        contentValues.put("chat_id", null);
        contentValues.put("name", str3);
        contentValues.put("profile_photo_url", str4);
        this.f3732e.m6197a("dismissed_contacts", null, contentValues);
        this.f3731a.getContentResolver().notifyChange(EsProvider.f6011n, null);
    }

    public void m5969a(esr esr) {
        if (glk.m17973a("Babel_ConvHelper", 3)) {
            String valueOf = String.valueOf(esr.f12187a);
            glk.m17970a("Babel_ConvHelper", new StringBuilder(String.valueOf(valueOf).length() + 42).append("updateParticipantData  for participantId: ").append(valueOf).toString(), new Object[0]);
        }
        if (m5844a(esr.f12187a.f11244a, esr.f12187a.f11245b, esr.f12188b, null, esr.f12189c, true) >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fallback_name", esr.f12189c);
            if (esr.f12188b != null) {
                contentValues.put("participant_type", Integer.valueOf(edq.PHONE.ordinal()));
                contentValues.put("phone_id", esr.f12188b);
            }
            this.f3732e.m6194a("participants", contentValues, "_id=?", new String[]{Integer.toString(r0)});
            return;
        }
        valueOf = String.valueOf(esr.f12187a.toString());
        String str = esr.f12189c;
        glk.m17982e("Babel_ConvHelper", new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(str).length()).append("updateParticipantData did not find db row for ").append(valueOf).append(" and fallbackName=").append(str).toString(), new Object[0]);
        iil.m21870a("updateParticipantData did not find db row");
    }

    public boolean m6002a(edk edk, boolean z) {
        if (edk.f11213b == null) {
            glk.m17982e("Babel_ConvHelper", "null participantId in insertOrUpdateParticipant", new Object[0]);
            return false;
        }
        bjm a = ((bjn) jyn.m25426a(m6049f(), bjn.class)).mo1757a(m6061h());
        try {
            m5967a(a, edk);
            String str = edk.f11213b.f11244a;
            String str2 = edk.f11213b.f11245b;
            String f = edk.m13596f();
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(f) && edk.f11212a != edq.PHONE) {
                glk.m17982e("Babel_ConvHelper", "no gaiaId/chatId/phoneNumber in insertOrUpdateParticipant", new Object[0]);
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
                iil.m21869a(edq.PHONE, edk.f11212a);
            }
            contentValues.put("participant_type", Integer.valueOf(edk.f11212a.ordinal()));
            if (edk.f11212a == edq.UNKNOWN) {
                String str3 = "Babel";
                String str4 = "Encountered participant with participantType UNKNOWN, ParticipantEntity: ";
                String valueOf = String.valueOf(glk.m17974b(edk.toString()));
                if (valueOf.length() != 0) {
                    valueOf = str4.concat(valueOf);
                } else {
                    valueOf = new String(str4);
                }
                glk.m17982e(str3, valueOf, new Object[0]);
                iil.m21870a("ParticipantType UNKNOWN found");
            }
            if (!TextUtils.isEmpty(edk.f11217f)) {
                contentValues.put("first_name", edk.f11217f);
            }
            if (!TextUtils.isEmpty(edk.f11216e)) {
                contentValues.put("full_name", edk.f11216e);
            }
            if (!TextUtils.isEmpty(edk.f11218g)) {
                contentValues.put("fallback_name", edk.f11218g);
            }
            if (!TextUtils.isEmpty(edk.f11219h)) {
                contentValues.put("profile_photo_url", edk.f11219h);
            }
            contentValues.put("in_users_domain", Boolean.valueOf(edk.f11236y));
            if (edk.f11220i != null) {
                contentValues.put("blocked", Integer.valueOf(gwb.m2061b(edk.f11220i) ? 1 : 0));
            }
            if (z) {
                contentValues.putNull("batch_gebi_tag");
            }
            int a2 = m5844a(str, str2, f, null, null, false);
            if (a2 < 0) {
                a2 = (int) this.f3732e.m6197a("participants", null, contentValues);
                if (a2 < 0) {
                    glk.m17982e("Babel_ConvHelper", "insert failed", new Object[0]);
                    i = a2;
                }
                i = a2;
            } else {
                contentValues.remove("phone_id");
                if (this.f3732e.m6194a("participants", contentValues, "_id=?", new String[]{Integer.toString(a2)}) <= 0) {
                    glk.m17982e("Babel_ConvHelper", "update failed", new Object[0]);
                }
                i = a2;
            }
            if (i >= 0) {
                return ((bog) jyn.m25426a(this.f3731a, bog.class)).m6289a(this.f3733f).m6288a(Integer.toString(i), edk, z);
            }
            return false;
        } finally {
            a.mo1753a();
        }
    }

    public void m5979a(String str, ContentValues contentValues) {
        if (this.f3732e.m6194a("presence", contentValues, "gaia_id=?", new String[]{str}) <= 0) {
            contentValues.put("gaia_id", str);
            if (((int) this.f3732e.m6197a("presence", null, contentValues)) < 0) {
                glk.m17982e("Babel_ConvHelper", "update failed", new Object[0]);
            }
        }
    }

    private boolean m5882b(edo edo, String str) {
        Throwable th;
        Cursor cursor;
        try {
            String string;
            int i;
            CharSequence string2;
            int i2;
            ContentValues contentValues;
            if (TextUtils.isEmpty(edo.f11244a)) {
                if (TextUtils.isEmpty(edo.f11245b)) {
                    cursor = null;
                } else {
                    cursor = this.f3732e.m6200a("participants_view", new String[]{"_id", "batch_gebi_tag", "chat_id"}, "chat_id=?", new String[]{edo.f11245b}, null, null, null);
                }
            } else if (TextUtils.equals(edo.f11244a, edo.f11245b)) {
                cursor = this.f3732e.m6200a("participants_view", new String[]{"_id", "batch_gebi_tag", "chat_id", "gaia_id", "phone_id"}, "gaia_id=?", new String[]{edo.f11244a}, null, null, null);
            } else {
                cursor = this.f3732e.m6200a("participants_view", new String[]{"_id", "batch_gebi_tag", "chat_id", "gaia_id", "phone_id"}, "gaia_id=? OR chat_id=?", new String[]{edo.f11244a, edo.f11245b}, null, null, null);
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
                        if (!TextUtils.isEmpty(edo.f11245b) && TextUtils.isEmpty(r2)) {
                            contentValues.put("chat_id", edo.f11245b);
                        }
                        if (!TextUtils.isEmpty(edo.f11244a)) {
                            contentValues.put("gaia_id", edo.f11244a);
                        }
                        if (i2 == 0) {
                            if (this.f3732e.m6194a("participants", contentValues, "_id=?", new String[]{string}) <= 0) {
                                glk.m17982e("Babel_ConvHelper", "update failed on rowid lookup", new Object[0]);
                            }
                        } else if (this.f3732e.m6197a("participants", null, contentValues) < 1) {
                            glk.m17982e("Babel_ConvHelper", "insert failed", new Object[0]);
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
            contentValues.put("chat_id", edo.f11245b);
            if (TextUtils.isEmpty(edo.f11244a)) {
                contentValues.put("gaia_id", edo.f11244a);
            }
            if (i2 == 0) {
                if (this.f3732e.m6194a("participants", contentValues, "_id=?", new String[]{string}) <= 0) {
                    glk.m17982e("Babel_ConvHelper", "update failed on rowid lookup", new Object[0]);
                }
            } else if (this.f3732e.m6197a("participants", null, contentValues) < 1) {
                glk.m17982e("Babel_ConvHelper", "insert failed", new Object[0]);
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

    public void m5981a(String str, edk edk, boolean z) {
        m6002a(edk, false);
        m5865a(str, edk.f11213b, edq.UNKNOWN, null, true);
    }

    public boolean m6003a(edo edo, String str, String str2) {
        boolean b = m5882b(edo, str);
        m5889c(str2, edo);
        return b;
    }

    public void m5982a(String str, edo edo, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Integer.valueOf(z ? 1 : 0));
        String str2;
        String valueOf;
        String valueOf2;
        if (edo != null && !TextUtils.isEmpty(edo.f11244a)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.f3732e.m6194a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.f11244a, str, str});
        } else if (edo != null && !TextUtils.isEmpty(edo.f11245b)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.f3732e.m6194a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.f11245b, str, str});
        }
    }

    private void m5864a(String str, edo edo, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("invitation_status", Integer.valueOf(i));
        String str2;
        String valueOf;
        String valueOf2;
        if (!TextUtils.isEmpty(edo.f11244a)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.f3732e.m6194a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.f11244a, str, str});
        } else if (!TextUtils.isEmpty(edo.f11245b)) {
            str2 = "(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)";
            valueOf = String.valueOf("participant_row_id=");
            valueOf2 = String.valueOf("conversation_id");
            this.f3732e.m6194a("conversation_participants", contentValues, new StringBuilder(((String.valueOf(valueOf).length() + 7) + String.valueOf(str2).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str2).append(" AND ").append(valueOf2).append("=?").toString(), new String[]{edo.f11245b, str, str});
        }
    }

    private void m5889c(String str, edo edo) {
        m5865a(str, edo, edq.UNKNOWN, null, false);
    }

    private void m5865a(String str, edo edo, edq edq, String str2, boolean z) {
        Throwable th;
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", str);
        if (edq != edq.UNKNOWN) {
            contentValues.put("participant_type", Integer.valueOf(edq.ordinal()));
        }
        Cursor cursor = null;
        Cursor a;
        try {
            long a2 = (long) m5844a(edo.f11244a, edo.f11245b, null, null, null, false);
            if (a2 != -1) {
                String str3;
                String[] strArr;
                if (!TextUtils.isEmpty(edo.f11244a)) {
                    str3 = "gaia_id=? AND conversation_id=?";
                    strArr = new String[]{edo.f11244a, str};
                } else if (!TextUtils.isEmpty(edo.f11245b)) {
                    str3 = "chat_id=? AND conversation_id=?";
                    strArr = new String[]{edo.f11245b, str};
                } else if (!TextUtils.isEmpty(null)) {
                    str3 = "phone_id=? AND conversation_id=?";
                    strArr = new String[]{null, str};
                } else {
                    return;
                }
                a = this.f3732e.m6200a("conversation_participants_view", new String[]{"_id"}, str3, strArr, null, null, null);
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
                        a = this.f3732e.m6200a("conversation_participants", new String[]{"MAX(sequence)"}, "conversation_id=?", new String[]{str}, null, null, null);
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
                        this.f3732e.m6197a("conversation_participants", null, contentValues);
                        return;
                    }
                    this.f3732e.m6194a("conversation_participants", contentValues, "participant_row_id=? AND conversation_id=?", new String[]{String.valueOf(a2), str});
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

    public String m5951a(edo edo, String str) {
        bjm a = ((bjn) jyn.m25426a(m6049f(), bjn.class)).mo1757a(m6061h());
        try {
            long j;
            Object obj;
            Object b;
            String a2;
            if (TextUtils.isEmpty(str)) {
                j = -1;
                String str2 = edo.f11244a;
                obj = null;
            } else {
                dak b2 = m6010b(str, a);
                if (b2 != null) {
                    if (((fzw) jyn.m25426a(this.f3731a, fzw.class)).mo2146a(this.f3734g)) {
                        CharSequence charSequence = null;
                    } else {
                        b = b2.m11388b();
                    }
                    j = TextUtils.isEmpty(b) ? b2.m11387a() : -1;
                } else {
                    j = -1;
                    b = null;
                }
                obj = glq.m18026f(gwb.m1400H(), str);
            }
            if (!TextUtils.isEmpty(b)) {
                a2 = bnr.GAIA.m6228a(b);
            } else if (j != -1) {
                a2 = bnr.CONTACT.m6228a(String.valueOf(j));
            } else if (TextUtils.isEmpty(obj)) {
                a2 = null;
            } else {
                a2 = bnr.PHONE.m6228a(obj);
            }
            a.mo1753a();
            return a2;
        } catch (Throwable th) {
            a.mo1753a();
        }
    }

    public void m5967a(bjm bjm, edk edk) {
        bmi a = m5851a(bjm, edk.f11214c, edk.f11216e, edk.f11219h);
        edk.m13587a(a.f3968a, a.f3969b);
    }

    private bmi m5851a(bjm bjm, String str, String str2, String str3) {
        CharSequence charSequence = null;
        if (str != null) {
            charSequence = glq.m18012c(gwb.m1400H(), str);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = charSequence;
        }
        bmi bmi = new bmi(this);
        bmi.f3968a = str2;
        bmi.f3969b = str3;
        dak a = blo.m5853a(str, bjm);
        if (a != null) {
            if (!TextUtils.isEmpty(a.m11389c())) {
                bmi.f3968a = a.m11389c();
            }
            if (!TextUtils.isEmpty(a.m11390d())) {
                bmi.f3969b = a.m11390d();
            }
        }
        return bmi;
    }

    public static dak m5853a(String str, bjm bjm) {
        bjg a = bjm.mo1752a(str);
        if (a != null) {
            return dak.m11377a(gwb.m1400H(), a);
        }
        Iterable<bjg> b = bjm.mo1754b(str);
        if (b != null) {
            String valueOf;
            String a2;
            Object obj = null;
            long j = -1;
            CharSequence charSequence = null;
            Object obj2 = null;
            for (bjg a3 : b) {
                if (!TextUtils.isEmpty(a3.mo571e())) {
                    String e;
                    long j2;
                    if (obj2 == null) {
                        e = a3.mo571e();
                    } else if (obj2.equalsIgnoreCase(a3.mo571e())) {
                        e = obj2;
                    } else {
                        String valueOf2 = String.valueOf(obj2);
                        valueOf = String.valueOf(", ");
                        e = String.valueOf(a3.mo571e());
                        e = new StringBuilder(((String.valueOf(valueOf2).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(e).length()).append(valueOf2).append(valueOf).append(e).toString();
                        obj = 1;
                    }
                    if (charSequence == null && !TextUtils.isEmpty(a3.mo572f())) {
                        charSequence = a3.mo572f();
                    }
                    if (j != -1 || TextUtils.isEmpty(a3.mo582p())) {
                        j2 = j;
                    } else {
                        j2 = Long.parseLong(a3.mo582p());
                    }
                    j = j2;
                    obj2 = e;
                }
            }
            if (!TextUtils.isEmpty(charSequence) || j == -1) {
                CharSequence charSequence2 = charSequence;
            } else {
                a2 = frm.m16047a(Long.valueOf(j));
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

    public dak m6010b(String str, bjm bjm) {
        bjg a = bjm.mo1752a(str);
        if (a != null) {
            return dak.m11377a(gwb.m1400H(), a);
        }
        boolean z;
        String str2;
        Iterable<bjg> b = bjm.mo1754b(str);
        boolean z2;
        if (b != null) {
            z2 = false;
            z = false;
            str2 = null;
            for (bjg a2 : b) {
                String i = a2.mo575i();
                if (!(TextUtils.isEmpty(i) || TextUtils.equals(i, str2))) {
                    boolean z3 = m5946a(edo.m13604a(i), false, 1) != null;
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
            return dak.m11379a(m6049f(), bjm.mo1756c(str2));
        }
        return null;
    }

    public String m5949a(bls bls) {
        String a = bnr.CONVERSATION.m6228a(bls.f3773s);
        if (!((fzw) jyn.m25426a(this.f3731a, fzw.class)).mo2155d() || bls.f3756b != 1 || bls.f3765k == 1) {
            return a;
        }
        if (bnr.MANUAL.m6229b(bls.f3774t)) {
            return bls.f3774t;
        }
        edo b = m6056g().m5632b();
        String str = a;
        int i = 0;
        for (edk edk : bls.f3762h) {
            String a2;
            if (!b.m13608a(edk.f11213b)) {
                i++;
                if (m6006b(edk.f11213b) == 1) {
                    return a;
                }
                a2 = m5951a(edk.f11213b, edk.f11214c);
                if (a2 == null) {
                    a2 = str;
                }
                str = a2;
            }
        }
        if (i > 1) {
            glk.m17982e("Babel", "computeMergeKeyForConversation with > 1 participants: " + i, new Object[0]);
            fzw fzw = (fzw) jyn.m25426a(this.f3731a, fzw.class);
            int i2 = bls.f3757c;
            String str2 = bls.f3773s;
            boolean b2 = fzw.mo2148b(this.f3734g);
            glk.m17982e("Babel", new StringBuilder(String.valueOf(str2).length() + 79).append("conv transport: ").append(i2).append("; id: ").append(str2).append("; isCarrierSms: ").append(b2).append("; isCarrierSmsOnly: ").append(fzw.mo2146a(this.f3734g)).toString(), new Object[0]);
            a = String.valueOf(blo.ak(b.f11244a));
            String valueOf = String.valueOf(blo.ak(b.f11245b));
            glk.m17982e("Babel", new StringBuilder((String.valueOf(a).length() + 19) + String.valueOf(valueOf).length()).append("self gaia: ").append(a).append("; chat: ").append(valueOf).toString(), new Object[0]);
            for (edk edk2 : bls.f3762h) {
                String valueOf2 = String.valueOf(blo.ak(edk2.m13590b()));
                str2 = String.valueOf(blo.ak(edk2.m13592c()));
                a2 = String.valueOf(blo.ak(edk2.f11214c));
                glk.m17982e("Babel", new StringBuilder(((String.valueOf(valueOf2).length() + 23) + String.valueOf(str2).length()) + String.valueOf(a2).length()).append("gaia: ").append(valueOf2).append("; chat: ").append(str2).append("; phone: ").append(a2).toString(), new Object[0]);
            }
            jcf jcf = (jcf) jyn.m25426a(this.f3731a, jcf.class);
            for (Integer a3 : jcf.mo3453a()) {
                int a4 = gwb.m1508a(a3, -1);
                str2 = String.valueOf(blo.ak(jcf.mo3456a(a4).mo3440b("gaia_id")));
                glk.m17982e("Babel", new StringBuilder(String.valueOf(str2).length() + 18).append("Acct ").append(a4).append(": ").append(str2).toString(), new Object[0]);
            }
            iil.m21870a("participant count (not including self) is " + i);
        }
        return str;
    }

    private static String ak(String str) {
        return (str == null || "_sms_only_account".equals(str) || str.length() < 6) ? str : str.substring(str.length() - 6);
    }

    private int m5843a(String str, String str2, String str3, String str4, String str5, String str6) {
        Throwable th;
        int a = m5844a(str2, str3, str4, str5, str6, true);
        if (a >= 0) {
            edq edq = edq.UNKNOWN;
            Cursor a2;
            try {
                String[] strArr = new String[]{Integer.toString(a), str};
                a2 = this.f3732e.m6200a("conversation_participants", new String[]{"_id"}, "participant_row_id=? AND conversation_id=?", strArr, null, null, null);
                try {
                    Object obj;
                    if (a2.moveToFirst()) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    if (obj == null) {
                        try {
                            a2 = this.f3732e.m6200a("conversation_participants", new String[]{"MAX(sequence)"}, "conversation_id=?", new String[]{str}, null, null, null);
                            try {
                                int i;
                                if (a2.moveToFirst()) {
                                    i = a2.getInt(0);
                                } else {
                                    i = 0;
                                }
                                if (a2 != null) {
                                    a2.close();
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("conversation_id", str);
                                if (edq != edq.UNKNOWN) {
                                    contentValues.put("participant_type", Integer.valueOf(edq.ordinal()));
                                }
                                contentValues.put("participant_row_id", Integer.valueOf(a));
                                contentValues.put("sequence", Integer.valueOf(i + 1));
                                contentValues.put("active", Integer.valueOf(0));
                                this.f3732e.m6197a("conversation_participants", null, contentValues);
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
                } catch (Throwable th4) {
                    th = th4;
                    if (a2 != null) {
                        a2.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                a2 = null;
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
        }
        return a;
    }

    public void m5999a(List<edo> list, List<esr> list2, String str) {
        Throwable th;
        Map kyVar = new ky();
        for (esr esr : list2) {
            kyVar.put(esr.f12187a, esr);
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Map kyVar2 = new ky();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversation_participants_view", new String[]{"gaia_id", "chat_id", "active", "invitation_status"}, "conversation_id=?", new String[]{str}, null, null, null);
            try {
                Object obj;
                if (a.moveToFirst()) {
                    do {
                        edo edo = new edo(a.getString(0), a.getString(1));
                        Object obj2 = a.getInt(2) == 1 ? 1 : null;
                        if (obj2 != null && !blo.m5873a((List) list, edo)) {
                            arrayList.add(edo);
                        } else if (obj2 == null) {
                            if (blo.m5873a((List) list, edo)) {
                                arrayList2.add(edo);
                            }
                        }
                        if (kyVar.containsKey(edo) && a.getInt(3) != ((esr) kyVar.get(edo)).f12190d) {
                            kyVar2.put(edo, Integer.valueOf(((esr) kyVar.get(edo)).f12190d));
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
                    m5982a(str, (edo) obj, false);
                }
                arrayList3 = (ArrayList) arrayList2;
                size = arrayList3.size();
                i = 0;
                while (i < size) {
                    obj = arrayList3.get(i);
                    i++;
                    m5982a(str, (edo) obj, true);
                }
                for (Entry entry : kyVar2.entrySet()) {
                    m5864a(str, (edo) entry.getKey(), gwb.m1507a((Integer) entry.getValue()));
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

    private static boolean m5873a(List<edo> list, edo edo) {
        for (edo edo2 : list) {
            if (!TextUtils.isEmpty(edo2.f11244a) && !TextUtils.isEmpty(edo.f11244a) && edo2.f11244a.equals(edo.f11244a)) {
                return true;
            }
        }
        return false;
    }

    public String m5953a(String str, List<edo> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (edo edo : list) {
            long a = (long) m5843a(str, edo.f11244a, edo.f11245b, null, null, null);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('|');
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    private edk m5854a(Cursor cursor, String str) {
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
        edk a = gwb.m1596a(gwb.m1400H(), edq.values()[cursor.getInt(11)], string3, string4, string6, string5, string7, string8, string, string9, string10, bool, null, 0);
        ((bog) jyn.m25426a(this.f3731a, bog.class)).m6289a(this.f3733f).m6287a(a, string2);
        return a;
    }

    public edk m5947a(fbt fbt) {
        Throwable th;
        edk edk = null;
        if (f3712c) {
            String valueOf = String.valueOf(fbt);
            new StringBuilder(String.valueOf(valueOf).length() + 26).append("getParticipantEntity for: ").append(valueOf);
        }
        Cursor a;
        try {
            if (!TextUtils.isEmpty(fbt.f12658a)) {
                a = this.f3732e.m6200a("participants_view", f3715j, "gaia_id=?", new String[]{fbt.f12658a}, null, null, null);
            } else if (TextUtils.isEmpty(fbt.f12659b)) {
                a = null;
            } else {
                a = this.f3732e.m6200a("participants_view", f3715j, "chat_id=?", new String[]{fbt.f12659b}, null, null, null);
            }
            if (a != null) {
                try {
                    if (a.moveToNext()) {
                        edk = m5854a(a, null);
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

    private void m5868a(String str, String str2, String str3, String str4, String str5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, str4);
        contentValues.put(str3, str5);
        this.f3732e.m6194a(str, contentValues, new StringBuilder((String.valueOf(str2).length() + 8) + String.valueOf(str3).length()).append(str2).append("=? OR ").append(str3).append("=?").toString(), new String[]{str4, str5});
    }

    private void m5904p(String str, String str2) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        int i = 0;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
            String[] strArr = new String[]{str2};
            try {
                Cursor a;
                Cursor a2 = this.f3732e.m6200a("participants", f3715j, "gaia_id=?", new String[]{str}, null, null, null);
                try {
                    a = this.f3732e.m6200a("participants", f3715j, "chat_id=?", strArr, null, null, null);
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
                    m5868a("conversations", "snippet_author_gaia_id", "snippet_author_chat_id", str, str2);
                    m5868a("conversations", "inviter_gaia_id", "inviter_chat_id", str, str2);
                    m5868a("dismissed_contacts", "gaia_id", "chat_id", str, str2);
                    m5868a("messages", "author_gaia_id", "author_chat_id", str, str2);
                    m5868a("suggested_contacts", "gaia_id", "chat_id", str, str2);
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
                        i = this.f3732e.m6194a("conversation_participants", contentValues, "participant_row_id=?", new String[]{string});
                        contentValues.clear();
                        contentValues.putNull("gaia_id");
                        contentValues.putNull("chat_id");
                        i2 = this.f3732e.m6194a("participants", contentValues, "_id=?", new String[]{string});
                        contentValues.clear();
                    }
                    if (i3 != 0) {
                        contentValues.put("chat_id", str2);
                        contentValues.put("participant_type", Integer.valueOf(edq.PHONE.ordinal()));
                        contentValues.put("phone_id", str2);
                    } else {
                        contentValues.put("gaia_id", str);
                    }
                    int a3 = this.f3732e.m6194a("participants", contentValues, "_id=?", new String[]{string2});
                    if (f3712c) {
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

    private int m5844a(String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        String[] strArr;
        Cursor a;
        Throwable th;
        m5904p(str, str2);
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
            a = this.f3732e.m6200a("participants_view", f3715j, str6, strArr, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        i = a.getInt(0);
                        m5854a(a, str5);
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
                            i = (int) this.f3732e.m6197a("participants", null, contentValues);
                            if (i >= 0) {
                                return i;
                            }
                            glk.m17982e("Babel_ConvHelper", "insert failed", new Object[0]);
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

    public edk m5914F(String str) {
        Cursor a;
        Throwable th;
        edk edk = null;
        if (f3712c) {
            String str2 = "cacheParticipantRow for: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        try {
            a = this.f3732e.m6200a("participants_view", f3715j, "_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToNext()) {
                        edk = m5854a(a, null);
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

    public void m6000a(Map<String, bka> map) {
        Cursor a = this.f3732e.m6200a("participants", bmj.f3971a, null, null, null, null, null);
        if (a != null) {
            while (a.moveToNext()) {
                try {
                    bka bka = (bka) map.get(a.getString(0));
                    if (bka != null) {
                        bka.f3606b = a.getString(1);
                    }
                } finally {
                    a.close();
                }
            }
        }
    }

    public void m5915G(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Integer.valueOf(0));
        this.f3732e.m6194a("conversation_participants", contentValues, f3728x, new String[]{str, String.valueOf(edq.CIRCLE.ordinal())});
    }

    public void m6103s() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(fwx.FAILED_TO_SEND.ordinal()));
        m5958a();
        try {
            String valueOf = String.valueOf("status=");
            int size = m5955a(contentValues, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(fwx.SENDING.ordinal()).toString(), null).size();
            m6015b();
            if (f3712c) {
                new StringBuilder(47).append("failAnySendingMessages patched ").append(size).append(" rows");
            }
        } finally {
            m6028c();
        }
    }

    public List<edk> m5916H(String str) {
        String valueOf;
        Throwable th;
        Cursor cursor;
        if (f3712c) {
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
            Cursor a = this.f3732e.m6200a("conversation_participants_view", new String[]{"gaia_id", "chat_id", "circle_id", "first_name", "full_name", "fallback_name", "profile_photo_url", "participant_type", "phone_id", "in_users_domain"}, "conversation_id=? AND active=1", new String[]{String.valueOf(str)}, null, null, "sequence ASC");
            while (a.moveToNext()) {
                String string = a.getString(3);
                String string2 = a.getString(6);
                edq edq = edq.values()[a.getInt(7)];
                valueOf = a.getString(4);
                if (edq == edq.PERSON) {
                    edo edo = new edo(a.getString(0), a.getString(1));
                    String string3 = a.getString(5);
                    boolean z = a.getInt(9) != 0;
                    edk a2 = gwb.m1601a(edo, valueOf, string, string3, string2, null);
                    a2.f11236y = z;
                    arrayList.add(a2);
                } else {
                    try {
                        if (edq == edq.CIRCLE) {
                            arrayList.add(gwb.m1985b(a.getString(2), valueOf));
                        } else if (edq == edq.PHONE) {
                            arrayList.add(gwb.m1597a(this.f3731a, a.getString(8), valueOf, string2));
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

    public List<fbw> m5917I(String str) {
        if (f3712c) {
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
            arrayList.add(fbw.m14928a(m5914F((String) it.next())));
        }
        return arrayList;
    }

    public String m6011b(String str, List<fbw> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (fbw fbw : list) {
            int a = m5843a(str, fbw.f12666a, fbw.f12667b, fbw.f12669d, fbw.f12668c, fbw.f12670e);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('|');
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public String m6027c(String str, List<fbv> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (fbv fbv : list) {
            int a = m5843a(str, fbv.f12663a.f12666a, fbv.f12663a.f12667b, fbv.f12663a.f12669d, fbv.f12663a.f12668c, fbv.f12663a.f12670e);
            if (stringBuilder.length() > 0) {
                stringBuilder.append('|');
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public gkr m5918J(String str) {
        Throwable th;
        if (f3712c) {
            String str2 = "getActiveConversationParticipants ConversationId: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        gkr gkr = new gkr();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversation_participants_view", new String[]{"gaia_id", "chat_id", "phone_id"}, "conversation_id=? AND active=?", new String[]{str, "1"}, null, null, null);
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

    public void m5997a(HashSet<edo> hashSet) {
        Throwable th;
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str;
            String[] strArr;
            Cursor a;
            edo edo = (edo) it.next();
            if (!TextUtils.isEmpty(edo.f11244a)) {
                str = "gaia_id=?";
                strArr = new String[]{edo.f11244a};
            } else if (TextUtils.isEmpty(edo.f11245b)) {
                continue;
            } else {
                str = "chat_id=?";
                strArr = new String[]{edo.f11245b};
            }
            try {
                a = this.f3732e.m6200a("conversation_participants_view", f3722r, str, strArr, null, null, null);
                try {
                    if (a.moveToFirst()) {
                        do {
                            hashSet2.add(a.getString(0));
                        } while (a.moveToNext());
                    }
                    if (a != null) {
                        a.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                a = null;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            blf.m5813b(this, (String) it2.next());
            blf.m5761a(this.f3733f);
        }
        return;
        if (a != null) {
            a.close();
        }
        throw th;
    }

    public void m5919K(String str) {
        edk L = m5920L(str);
        this.f3732e.m6196a("suggested_contacts", "gaia_id=?", new String[]{str});
        if (L != null) {
            m6041d(str, null, L.f11216e, L.f11219h);
        }
        ((dwt) jyn.m25426a(this.f3731a, dwt.class)).mo1761a(m6056g().m5638g());
        this.f3732e.m6203a(EsProvider.f6008k);
    }

    public void m6022b(List<edk> list, int i) {
        this.f3732e.m6196a("suggested_contacts", "suggestion_type=?", new String[]{String.valueOf(i)});
        ContentValues contentValues = new ContentValues();
        int i2 = 0;
        for (edk edk : list) {
            if (!(TextUtils.isEmpty(edk.f11217f) || TextUtils.isEmpty(edk.f11216e))) {
                contentValues.clear();
                contentValues.put("chat_id", edk.f11213b.f11245b);
                contentValues.put("gaia_id", edk.f11213b.f11244a);
                contentValues.put("name", edk.f11216e);
                contentValues.put("first_name", edk.f11217f);
                contentValues.put("profile_photo_url", edk.f11219h);
                contentValues.put("packed_circle_ids", edk.f11229r);
                contentValues.put("sequence", Integer.valueOf(i2));
                contentValues.put("suggestion_type", Integer.valueOf(i));
                contentValues.put("logging_id", edk.f11205C);
                contentValues.put("affinity_score", Float.valueOf(edk.f11206D));
                contentValues.put("is_in_same_domain", Boolean.valueOf(edk.f11236y));
                this.f3732e.m6197a("suggested_contacts", null, contentValues);
                i2++;
            }
        }
        this.f3732e.m6203a(EsProvider.f6008k);
    }

    public List<edk> m6013b(int i) {
        Throwable th;
        Cursor cursor;
        List<edk> arrayList = new ArrayList();
        try {
            Cursor a = this.f3732e.m6200a("suggested_contacts", f3714i, "suggestion_type=?", new String[]{"3"}, null, null, null);
            if (a != null) {
                while (a.moveToNext()) {
                    try {
                        arrayList.add(gwb.m1601a(new edo(a.getString(0), a.getString(1)), a.getString(2), a.getString(3), null, a.getString(4), a.getString(5)));
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

    public edk m5920L(String str) {
        Throwable th;
        Cursor cursor;
        edk edk = null;
        try {
            Cursor a = this.f3732e.m6200a("suggested_contacts", f3714i, "gaia_id=?", new String[]{str}, null, null, null);
            if (a != null) {
                try {
                    if (a.moveToNext()) {
                        edk = gwb.m1601a(new edo(a.getString(0), a.getString(1)), a.getString(2), a.getString(3), null, a.getString(4), a.getString(5));
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

    public long m6024c(int i) {
        long a = bkq.m5659a(this.f3731a, m6056g().m5638g(), EsProvider.m8255a(i), -1);
        if (a == -3) {
            return -2;
        }
        return a;
    }

    public void m5962a(long j, int i) {
        bkq.m5677b(this.f3731a, m6056g().m5638g(), EsProvider.m8255a(i), j);
    }

    private void m5894d(int i) {
        bkq.m5676b(this.f3731a, m6056g().m5638g(), EsProvider.m8255a(i));
    }

    public void m6105t() {
        for (int i = 1; i <= 4; i++) {
            m5894d(i);
        }
    }

    public long m5921M(String str) {
        return m6037d(str, 1);
    }

    public long m6037d(String str, int i) {
        return blo.m5875b(m5923O(str), i);
    }

    public static long m5875b(long j, int i) {
        long a = glj.m17956a() * 1000;
        if (a > j) {
            return a;
        }
        a = j % ((long) i);
        return (a == 0 ? (long) i : ((long) i) - a) + j;
    }

    public void m6046e(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("view", Integer.valueOf(i));
        if (this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str}) != 0) {
            blf.m5820d(this);
        }
    }

    public void m6053f(String str, long j) {
        gwb.aK();
        ba.m4578a(j >= 0, (Object) "Valid timestamps must be positive.");
        bmv bmv = this.f3732e;
        String valueOf = String.valueOf("UPDATE conversations SET last_share_timestamp=");
        String valueOf2 = String.valueOf("conversation_id");
        bmv.m6205a(new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append(valueOf).append(j).append(" WHERE ").append(valueOf2).append("=?").toString(), new String[]{String.valueOf(str)});
        this.f3732e.m6205a("UPDATE conversations SET share_count=share_count+1 WHERE conversation_id=?", new String[]{String.valueOf(str)});
    }

    public void m6020b(String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("attachment_uploading_progress", Integer.valueOf(i));
        m5955a(contentValues, "conversation_id=? AND message_id=?", new String[]{str, str2});
    }

    public blv m5922N(String str) {
        Cursor a;
        Throwable th;
        blv blv = null;
        if (f3712c) {
            String str2 = "getTimestamps, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        try {
            a = this.f3732e.m6200a("conversations", new String[]{"sort_timestamp", "self_watermark"}, "conversation_id=?", new String[]{String.valueOf(str)}, null, null, null);
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

    public long m5923O(String str) {
        return m5847a("getSortTimestamp", str, "sort_timestamp", 0);
    }

    public void m6060g(String str, long j) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 68).append("updateSortTimestamp, conversationId=").append(str).append(", timestamp=").append(j);
        }
        m5958a();
        try {
            Object h = m6063h(str, j);
            m6015b();
            if (h > null) {
                blf.m5820d(this);
            }
        } finally {
            m6028c();
        }
    }

    public int m6063h(String str, long j) {
        if (j >= m5923O(str)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sort_timestamp", Long.valueOf(j));
            return this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        } else if (!f3712c) {
            return 0;
        } else {
            new StringBuilder(String.valueOf(str).length() + 129).append("Skip updateSortTimestamp because new timestamp is smaller than current timestamp, conversationId=").append(str).append(", timestamp=").append(j);
            return 0;
        }
    }

    public void m6069i(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sort_timestamp", Long.valueOf(j));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public Cursor m5944a(String str, fwx fwx, String[] strArr) {
        return this.f3732e.m6200a("messages", strArr, "conversation_id = ? AND status = ?", new String[]{str, String.valueOf(fwx.ordinal())}, null, null, "timestamp ASC");
    }

    private static bml m5852a(bml bml, long j, long j2) {
        long c = fqo.m15977a().m15989c();
        bml bml2 = new bml();
        if (j >= c + bml.f3977c) {
            bml2.f3975a = bml.f3977c;
            bml2.f3976b = bml.f3978d;
            bml2.f3977c = j;
            bml2.f3978d = j2;
        } else if (j2 > bml.f3978d) {
            return bml;
        } else {
            bml2.f3975a = bml.f3975a;
            bml2.f3976b = bml.f3976b;
            bml2.f3977c = j;
            bml2.f3978d = j2;
        }
        return bml2;
    }

    private static long m5846a(bml bml) {
        if (bml == null) {
            return 0;
        }
        long c = fqo.m15977a().m15989c();
        long j = Long.MAX_VALUE;
        long a = glj.m17956a();
        if (a < bml.f3975a + (2 * c)) {
            j = bml.f3976b;
        }
        if (a >= (c * 2) + bml.f3977c || j <= bml.f3978d) {
            return j;
        }
        return bml.f3978d;
    }

    private bml m5836H() {
        if (f3712c) {
            String str = "getConversationScrollInfo: account=";
            String valueOf = String.valueOf(this.f3733f.m5629a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        bml bml = new bml();
        int g = m6056g().m5638g();
        bml.f3975a = bkq.m5659a(this.f3731a, g, "first_peak_scroll_time", 0);
        bml.f3976b = bkq.m5659a(this.f3731a, g, "first_peak_scroll_to_conversation_timestamp", 0);
        bml.f3977c = bkq.m5659a(this.f3731a, g, "second_peak_scroll_time", 0);
        bml.f3978d = bkq.m5659a(this.f3731a, g, "second_peak_scroll_to_conversation_timestamp", 0);
        return bml;
    }

    public long m6106u() {
        return blo.m5846a(m5836H());
    }

    public void m5964a(long j, long j2) {
        if (f3712c) {
            new StringBuilder(111).append("updateConversationScrollTime: scrollTime=").append(j).append(" scrollToConverationTimestamp=").append(j2);
        }
        m5958a();
        try {
            bml H = m5836H();
            bml a = blo.m5852a(H, j, j2);
            if (a != H) {
                int g = m6056g().m5638g();
                if (a.f3975a != H.f3975a) {
                    bkq.m5677b(this.f3731a, g, "first_peak_scroll_time", a.f3975a);
                }
                if (a.f3976b != H.f3976b) {
                    bkq.m5677b(this.f3731a, g, "first_peak_scroll_to_conversation_timestamp", a.f3976b);
                }
                if (a.f3977c != H.f3977c) {
                    bkq.m5677b(this.f3731a, g, "second_peak_scroll_time", a.f3977c);
                }
                if (a.f3978d != H.f3978d) {
                    bkq.m5677b(this.f3731a, g, "second_peak_scroll_to_conversation_timestamp", a.f3978d);
                }
            }
            m6015b();
        } finally {
            m6028c();
        }
    }

    private bml al(String str) {
        Throwable th;
        Cursor cursor = null;
        if (f3712c) {
            String valueOf = String.valueOf(this.f3733f.m5629a());
            new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("getMessageScrollInfo: conversationId=").append(str).append(" account=").append(valueOf);
        }
        try {
            Cursor a = this.f3732e.m6200a("conversations", f3729y, "conversation_id=?", new String[]{String.valueOf(str)}, null, null, null);
            try {
                if (a.moveToFirst()) {
                    bml bml = new bml();
                    bml.f3975a = a.getLong(0);
                    bml.f3976b = a.getLong(1);
                    bml.f3977c = a.getLong(2);
                    bml.f3978d = a.getLong(3);
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
                glk.m17981d(str2, valueOf, new Object[0]);
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

    public long m5924P(String str) {
        return blo.m5846a(al(str));
    }

    public void m6019b(String str, long j, long j2) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 118).append("updateMessageScrollTime: conversationId=").append(str).append(" scrollTime=").append(j).append(" scrollToMessageTimestamp=").append(j2);
        }
        m5958a();
        try {
            bml al = al(str);
            if (al == null) {
                m6015b();
                return;
            }
            bml a = blo.m5852a(al, j, j2);
            if (a != al) {
                ContentValues contentValues = new ContentValues();
                if (a.f3975a != al.f3975a) {
                    contentValues.put("first_peak_scroll_time", Long.valueOf(a.f3975a));
                }
                if (a.f3976b != al.f3976b) {
                    contentValues.put("first_peak_scroll_to_message_timestamp", Long.valueOf(a.f3976b));
                }
                if (a.f3977c != al.f3977c) {
                    contentValues.put("second_peak_scroll_time", Long.valueOf(a.f3977c));
                }
                if (a.f3978d != al.f3978d) {
                    contentValues.put("second_peak_scroll_to_message_timestamp", Long.valueOf(a.f3978d));
                }
                if (contentValues.size() > 0) {
                    this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
                }
            }
            m6015b();
            m6028c();
        } finally {
            m6028c();
        }
    }

    public List<Long> m6014b(int i, int i2) {
        String str;
        String valueOf;
        Cursor a;
        Throwable th;
        if (f3712c) {
            str = "getConversationTimestamps: account=";
            valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
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
            a = this.f3732e.m6201a("conversations", f3730z, str2, strArr, null, null, "sort_timestamp DESC", String.valueOf(i));
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

    public List<String> m6109v() {
        Throwable th;
        List<String> arrayList = new ArrayList();
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", f3705A, "transport_type!=3 AND call_media_type!=0", null, null, null, null);
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

    public void m6111w() {
        if (f3712c) {
            String str = "deleteAllConversations: account=";
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        this.f3732e.m6196a("conversations", null, null);
        blf.m5820d(this);
    }

    public boolean m6034c(long j, int i) {
        if (f3712c) {
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            new StringBuilder(String.valueOf(valueOf).length() + 69).append("deleteOldConversations: account=").append(valueOf).append(" cutOffTimestamp=").append(j);
        }
        String[] strArr = new String[]{String.valueOf(j), String.valueOf(i)};
        int a = m5936a(f3706B, strArr);
        if (a > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("continuation_event_timestamp", Integer.valueOf(0));
            contentValues.putNull("continuation_token");
            contentValues.put("has_oldest_message", Boolean.valueOf(false));
            this.f3732e.m6194a("conversations", contentValues, "sort_timestamp<? AND status=? AND transport_type!=3", strArr);
            blf.m5820d(this);
        }
        if (a > 0 && f3712c) {
            new StringBuilder(102).append("deleteOldConversations:").append(a).append(" cutOffTimestamp:").append(j).append(" conversationStatus:").append(i);
        }
        if (f3712c) {
            new StringBuilder(38).append("Deleted ").append(a).append(" old conversations.");
        }
        if (a > 0) {
            return true;
        }
        return false;
    }

    public void m5960a(int i, long j) {
        if (f3712c) {
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            new StringBuilder(String.valueOf(valueOf).length() + 80).append("deleteAllInvites: affinity=").append(i).append(", timestamp=").append(j).append(", account=").append(valueOf);
        }
        this.f3732e.m6202a();
        try {
            int a = this.f3732e.m6196a("conversations", "view=? AND status=? AND inviter_affinity=? AND sort_timestamp<?", new String[]{"1", "1", String.valueOf(i), String.valueOf(j)});
            this.f3732e.m6207b();
            if (a > 0 && f3712c) {
                new StringBuilder(60).append("deleteAllInvites: Removed ").append(a).append(" (affinity:").append(i).append(")");
            }
            blf.m5820d(this);
        } finally {
            this.f3732e.m6208c();
        }
    }

    private void m5837I() {
        m5960a(2, TimeUnit.MILLISECONDS.toMicros(((jhx) jyn.m25426a(this.f3731a, jhx.class)).mo3524a()));
    }

    private void m5838J() {
        m5960a(1, TimeUnit.MILLISECONDS.toMicros(((jhx) jyn.m25426a(this.f3731a, jhx.class)).mo3524a()));
    }

    public List<Long> m6051f(String str, int i) {
        Cursor a;
        Throwable th;
        if (f3712c) {
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(str).length()).append("getMessageTimestamps: account=").append(valueOf).append(" conversationId=").append(str);
        }
        try {
            a = this.f3732e.m6201a("messages", f3707C, "conversation_id=?", new String[]{str}, null, null, "timestamp DESC", String.valueOf(i));
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

    public int m6071j(String str, long j) {
        if (f3712c) {
            String valueOf = String.valueOf(glk.m17974b(this.f3733f.m5629a()));
            new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(str).length()).append("deleteOldMessages: account=").append(valueOf).append(" conversationId=").append(str).append(" cutOffTimestamp=").append(j);
        }
        m5996a(str, null, j);
        int a = m5936a("conversation_id=? AND timestamp<? AND transport_type!=3", new String[]{str, String.valueOf(j)});
        blf.m5821d(this, str);
        return a;
    }

    public int m6007b(String str, boolean z) {
        List a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("notified_for_failure", Integer.valueOf(1));
        if (TextUtils.isEmpty(str)) {
            a = m5955a(contentValues, "notified_for_failure=?", new String[]{"0"});
        } else {
            a = m5955a(contentValues, "notified_for_failure=? AND conversation_id=?", new String[]{"0", str});
        }
        return a.size();
    }

    public void m5925Q(String str) {
        ContentValues contentValues = new ContentValues();
        this.f3732e.m6202a();
        try {
            contentValues.put("alert_in_conversation_list", Integer.valueOf(0));
            this.f3732e.m6194a("messages", contentValues, "conversation_id=? AND alert_in_conversation_list=?", new String[]{str, "1"});
            this.f3732e.m6207b();
        } finally {
            this.f3732e.m6208c();
        }
    }

    private void m5899h(String str, int i) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 74).append("setConversationInviteDisposition, conversationId=").append(str).append(", disposition=").append(i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("disposition", Integer.valueOf(i));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        blf.m5820d(this);
    }

    public void m5926R(String str) {
        if (f3712c) {
            String str2 = "confirmConversationInvite, conversationId=";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        m5958a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(2));
            contentValues.put("disposition", Integer.valueOf(0));
            contentValues.put("notification_level", Integer.valueOf(30));
            this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
            blf.m5757a(m6056g().m5638g());
            m6015b();
        } finally {
            m6028c();
        }
    }

    public String m5927S(String str) {
        String str2 = null;
        Cursor a = m6044e().m6200a("conversations", f3708D, "conversation_id=?", new String[]{str}, null, null, null);
        if (a != null) {
            try {
                if (a.moveToFirst() && a.getInt(0) == 1) {
                    List<edk> H = m5916H(str);
                    edo b = m6056g().m5632b();
                    for (edk edk : H) {
                        edo edo = edk.f11213b;
                        if (!b.equals(edo)) {
                            str2 = edo.f11244a;
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

    public long m5928T(String str) {
        return m5847a("getConversationPendingStatus", str, "is_pending_leave", 0);
    }

    public void m6077k(String str, long j) {
        m5863a(str, j, false);
    }

    public void m6082l(String str, long j) {
        m5863a(str, j, true);
    }

    private void m5863a(String str, long j, boolean z) {
        long T = m5928T(str);
        if (z) {
            T |= j;
        } else {
            T &= -1 ^ j;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending_leave", Long.valueOf(T));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public boolean m6087m(String str, long j) {
        Throwable th;
        Cursor a;
        try {
            a = this.f3732e.m6200a("conversations", new String[]{"is_pending_leave"}, "conversation_id=?", new String[]{str}, null, null, null);
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

    public void m6016b(long j, fwx fwx, long j2) {
        String valueOf;
        if (f3712c) {
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
        m5955a(contentValues, valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2), null);
    }

    public String m5929U(String str) {
        return m5858a("getSmsServiceCenter", str, "sms_service_center");
    }

    public void m6083l(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sms_service_center", str2);
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public long m5930V(String str) {
        return m5847a("getSmsThreadId", str, "sms_thread_id", -1);
    }

    public void m6093n(String str, long j) {
        if (m5930V(str) == -1 && j > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sms_thread_id", Long.valueOf(j));
            this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
        }
    }

    public void m5963a(long j, int i, long j2) {
        ContentValues contentValues = new ContentValues();
        this.f3732e.m6202a();
        try {
            contentValues.put("sms_message_status", Integer.valueOf(i));
            contentValues.put("sms_timestamp_sent", Long.valueOf(j2));
            String valueOf = String.valueOf("_id=");
            String valueOf2 = String.valueOf(String.valueOf(j));
            m5955a(contentValues, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), null);
            this.f3732e.m6207b();
        } finally {
            this.f3732e.m6208c();
        }
    }

    public void m6032c(String str, boolean z) {
        if (f3712c) {
            new StringBuilder(String.valueOf(str).length() + 65).append("updateConversationIsTemporary, conversationId ").append(str).append(", isTemporary=").append(z);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_temporary", Integer.valueOf(z ? 1 : 0));
        this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
    }

    public boolean m5931W(String str) {
        return m5842a("getConversationIsTemporary", str, "is_temporary", 0) == 1;
    }

    public void m5983a(String str, esu esu, List<esu> list) {
        if (f3712c) {
            String valueOf = String.valueOf(esu);
            String valueOf2 = String.valueOf(esu.m14421a(list));
            new StringBuilder(((String.valueOf(str).length() + 85) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("updateDeliveryMediums, conversationId ").append(str).append(", default delivery medium=").append(valueOf).append(", deliveryMediumList=").append(valueOf2);
        }
        if (esu != null) {
            ContentValues contentValues = new ContentValues();
            this.f3732e.m6202a();
            try {
                contentValues.put("transport_type", Integer.valueOf(esu.f12209a));
                contentValues.put("default_transport_phone", esu.f12210b);
                this.f3732e.m6194a("conversations", contentValues, "conversation_id=?", new String[]{str});
                this.f3732e.m6207b();
            } finally {
                this.f3732e.m6208c();
            }
        }
    }

    public void m5977a(String str, long j, edo edo) {
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
        contentValues.put("inviter_gaia_id", edo.f11244a);
        contentValues.put("inviter_chat_id", edo.f11245b);
        contentValues.put("sort_timestamp", Long.valueOf(j));
        this.f3732e.m6197a("conversations", null, contentValues);
    }

    public int m6112x() {
        String format = String.format(Locale.US, "(%s=%d) AND (%s=%d) AND %s", new Object[]{"transport_type", Integer.valueOf(3), "sms_type", Integer.valueOf(1), fyi.m16599a("attachment_content_type")});
        if (glk.m17973a("Babel_ConvHelper", 3)) {
            String str = "Babel_ConvHelper";
            String str2 = "deleteSmsMediaMessags: selection = ";
            String valueOf = String.valueOf(format);
            glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        return m5936a(format, null);
    }

    public int m6079l(long j) {
        return m5936a(String.format(Locale.US, "(%s=%d) AND (%s<=?)", new Object[]{"transport_type", Integer.valueOf(3), "timestamp"}), new String[]{Long.toString(j)});
    }

    public String m5932X(String str) {
        String str2;
        Cursor a;
        Throwable th;
        if (f3712c) {
            str2 = "getStreamUrlForPhotoId, photoId =";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        try {
            a = this.f3732e.m6200a("messages", new String[]{"stream_url", "stream_expiration"}, "image_id=?", new String[]{str}, null, null, null);
            try {
                long a2 = glj.m17956a();
                str2 = null;
                while (a.moveToNext()) {
                    str2 = a.getString(0);
                    long j = a.getLong(1);
                    if (!TextUtils.isEmpty(str2) && a2 < j) {
                        m5990a(str, str2, j);
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

    public void m5990a(String str, String str2, long j) {
        if (f3712c) {
            new StringBuilder((String.valueOf(str).length() + 50) + String.valueOf(str2).length()).append("updateStreamUrlForPhotoId, photoId = ").append(str).append(", streamUrl =").append(str2);
        }
        this.f3732e.m6202a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stream_url", str2);
            contentValues.put("stream_expiration", Long.valueOf(j));
            m5955a(contentValues, "image_id=?", new String[]{str});
            this.f3732e.m6207b();
        } finally {
            this.f3732e.m6208c();
        }
    }

    public String m5933Y(String str) {
        Throwable th;
        String str2 = null;
        if (f3712c) {
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
            a = this.f3732e.m6200a("messages", new String[]{"conversation_id"}, "image_id=?", new String[]{str}, null, null, null);
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

    public long m5938a(ContentValues contentValues) {
        this.f3732e.m6202a();
        try {
            long a = this.f3732e.m6197a("mms_notification_inds", null, contentValues);
            this.f3732e.m6207b();
            return a;
        } finally {
            this.f3732e.m6208c();
        }
    }

    public int m6084m(long j) {
        if (f3712c) {
            new StringBuilder(42).append("deleteMmsNotification ").append(j);
        }
        m5958a();
        try {
            int a = this.f3732e.m6196a("mms_notification_inds", "_id=?", new String[]{String.valueOf(j)});
            m6015b();
            return a;
        } finally {
            m6028c();
        }
    }

    public void m6059g(String str, int i) {
        m5958a();
        try {
            m5899h(str, i);
            m6015b();
        } finally {
            m6028c();
        }
    }

    public void m5934Z(String str) {
        if (glk.m17973a("Babel_ConvHelper", 3)) {
            String str2 = "Babel_ConvHelper";
            String str3 = "acceptConversationLocally conversationId: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17970a(str2, valueOf, new Object[0]);
        }
        m5958a();
        try {
            m6029c(str, 2);
            m5899h(str, 1);
            m6017b(str, 30);
            m6015b();
        } finally {
            m6028c();
        }
    }

    public void m6115y() {
        glk.m17970a("Babel_ConvHelper", "removeSmsConversationsTransaction", new Object[0]);
        m5958a();
        try {
            m5835G();
            m6015b();
        } finally {
            m6028c();
        }
    }

    public void aa(String str) {
        glk.m17970a("Babel_ConvHelper", "removeConversationTransaction", new Object[0]);
        m5958a();
        try {
            m5909B(str);
            m6015b();
        } finally {
            m6028c();
        }
    }

    public void m6117z() {
        m5958a();
        try {
            m5837I();
            m5894d(4);
            m6015b();
        } finally {
            m6028c();
        }
    }

    public void m5906A() {
        m5958a();
        try {
            m5838J();
            m5894d(3);
            m6015b();
        } finally {
            m6028c();
        }
    }

    public String m6091n(long j) {
        String str = null;
        Cursor a = this.f3732e.m6200a("messages", f3710F, "_id=?", new String[]{Long.toString(j)}, null, null, null);
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
        Set<String> set = blu.f3778a;
        Cursor a = this.f3732e.m6200a("merge_keys", (String[]) set, "merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)", new String[]{str}, null, null, null);
        try {
            boolean z;
            set = new HashSet();
            if (a != null) {
                while (a.moveToNext()) {
                    set.add(a.getString(0));
                }
            }
            if (set.contains(str) || set.size() == 0 || !TextUtils.isEmpty(RealTimeChatService.m8987a(str))) {
                z = true;
            } else {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            return set;
        } finally {
            if (a != null) {
                a.close();
            }
        }
    }

    public List<bls> ac(String str) {
        Cursor a = this.f3732e.m6200a("merge_keys", blu.f3778a, "merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)", new String[]{str}, null, null, null);
        try {
            List<bls> arrayList = new ArrayList();
            if (a != null) {
                while (a.moveToNext()) {
                    arrayList.add(m6043e(a.getString(0)));
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

    public static void m5860a(Context context) {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        bbm bbm = (bbm) jyn.m25426a(context, bbm.class);
        for (bko bko : fde.m15037o()) {
            try {
                int g = bko.m5638g();
                if (bbm.mo444d(g)) {
                    blo blo = new blo(context, g);
                    blo.m5862a(context, bko, true);
                    blo.m5840a(blo, null);
                    blf.m5757a(g);
                }
            } catch (jcj e2) {
                e = e2;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
                glk.m17978c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            } catch (bmu e3) {
                e = e3;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
                if (valueOf.length() == 0) {
                }
                glk.m17978c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            }
        }
    }

    public static void m5880b(Context context) {
        Throwable e;
        String str;
        String str2;
        String valueOf;
        bbm bbm = (bbm) jyn.m25426a(context, bbm.class);
        for (bko bko : fde.m15037o()) {
            try {
                int g = bko.m5638g();
                if (bbm.mo444d(g)) {
                    blo.m5862a(context, bko, false);
                    blf.m5757a(g);
                }
            } catch (jcj e2) {
                e = e2;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
                glk.m17978c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            } catch (bmu e3) {
                e = e3;
                str = "Babel_ConvHelper";
                str2 = "Account removed: ";
                valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
                if (valueOf.length() == 0) {
                }
                glk.m17978c(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2), e);
            }
        }
    }

    public static String m5888c(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int append : fde.m15040r()) {
            stringBuilder.append(append).append("|");
        }
        stringBuilder.append(((gmp) jyn.m25426a(context, gmp.class)).mo2300c());
        return stringBuilder.toString();
    }

    public static void m5895d(Context context) {
        for (int a : fde.m15022f()) {
            blo.m5861a(context, a);
        }
    }

    public static void m5861a(Context context, int i) {
        String str;
        String valueOf;
        bko e = fde.m15018e(i);
        if (e != null) {
            try {
                if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(i).mo3440b("effective_gaia_id") == null) {
                    blo blo = new blo(context, i);
                    bjm a = ((bjn) jyn.m25426a(context, bjn.class)).mo1757a(e.m5638g());
                    iil.m21874a("Expected condition to be true", a.mo1755b());
                    a.mo1753a();
                    long a2 = glj.m17956a();
                    int b = blo.m5874b(blo, null) + 0;
                    long a3 = glj.m17956a();
                    b += blo.m5840a(blo, null);
                    a2 = a3 - a2;
                    new StringBuilder(77).append("refreshContactsDerivedData timing ").append(a2).append(" & ").append(glj.m17956a() - a3);
                    if (b > 0) {
                        blf.m5820d(blo);
                        return;
                    }
                    return;
                }
                return;
            } catch (jcj e2) {
                Throwable e3 = e2;
                String str2 = "Babel_ConvHelper";
                str = "Account removed: ";
                valueOf = String.valueOf(glk.m17974b(e.m5629a()));
                if (valueOf.length() == 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                glk.m17978c(str2, valueOf, e3);
                return;
            } catch (bmu e4) {
                e3 = e4;
                String str22 = "Babel_ConvHelper";
                str = "Account removed: ";
                valueOf = String.valueOf(glk.m17974b(e.m5629a()));
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                glk.m17978c(str22, valueOf, e3);
                return;
            } catch (Throwable th) {
                a.mo1753a();
            }
        }
        glk.m17981d("Babel", "Can not find account in BabelAccountManager. smsAccountId: " + i, new Object[0]);
    }

    private static void m5862a(Context context, bko bko, boolean z) {
        blo blo = new blo(context, bko.m5638g());
        Locale locale = Locale.US;
        String str = "update merge_keys set merge_key=\"%s\"||conversation_id;";
        Object[] objArr = new Object[1];
        objArr[0] = z ? "" : bnr.MANUAL.f4057f;
        blo.m6044e().m6204a(String.format(locale, str, objArr));
    }

    public void m6001a(String[] strArr) {
        bmv e = m6044e();
        Object arrayList = new ArrayList();
        e.m6202a();
        try {
            ContentValues contentValues = new ContentValues();
            for (String str : strArr) {
                contentValues.clear();
                String a = bnr.MANUAL.m6228a(str);
                contentValues.put("merge_key", a);
                e.m6194a("merge_keys", contentValues, "conversation_id=?", new String[]{str});
                arrayList.add(new Pair(str, a));
            }
            e.m6207b();
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Pair pair = (Pair) arrayList2.get(i);
                RealTimeChatService.m9059a((String) pair.first, (String) pair.second);
                i = i2;
            }
            blf.m5757a(this.f3733f.m5638g());
        } finally {
            e.m6208c();
        }
    }

    public static int m5840a(blo blo, String str) {
        int i = 0;
        Cursor ag = blo.ag(str);
        if (ag != null) {
            int i2 = 0;
            while (ag.moveToNext()) {
                try {
                    int i3;
                    bls a = blo.m5849a(ag);
                    String a2 = blo.m5949a(a);
                    if (!TextUtils.isEmpty(a.f3774t) && TextUtils.equals(a2, a.f3774t)) {
                        i3 = 0;
                    } else if (bnr.MANUAL.m6229b(a.f3774t)) {
                        i3 = 0;
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("merge_key", a2);
                        contentValues.put("conversation_id", a.f3773s);
                        blo.m6044e().m6197a("merge_keys", null, contentValues);
                        RealTimeChatService.m9059a(a.f3773s, a2);
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
        this.f3732e.m6202a();
        try {
            if (TextUtils.isEmpty(str)) {
                a = this.f3732e.m6200a("conversations JOIN merge_keys ON (conversations.conversation_id=merge_keys.conversation_id)", bmc.f3861a, "conversation_type=1", null, null, null, null);
            } else {
                a = this.f3732e.m6200a("conversations JOIN merge_keys ON (conversations.conversation_id=merge_keys.conversation_id)", bmc.f3861a, "conversation_type=1 AND conversations.conversation_id=?", new String[]{str}, null, null, null);
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
                            this.f3732e.m6194a("conversations", contentValues, "conversation_id IN (SELECT conversation_id FROM merge_keys WHERE merge_key=?)", new String[]{string});
                        }
                    }
                }
            }
            this.f3732e.m6207b();
            if (a != null) {
                a.close();
            }
            this.f3732e.m6208c();
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            this.f3732e.m6208c();
            throw th;
        }
    }

    public void m6042d(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "chat_ringtone_uri";
        } else {
            str2 = "hangout_ringtone_uri";
        }
        this.f3732e.m6202a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, null);
            this.f3732e.m6194a("conversations", contentValues, String.valueOf(str2).concat("=?"), new String[]{str});
            this.f3732e.m6207b();
        } finally {
            this.f3732e.m6208c();
        }
    }

    public static int m5874b(blo blo, String str) {
        bjm a = ((bjn) jyn.m25426a(blo.m6049f(), bjn.class)).mo1757a(blo.m6061h());
        try {
            int a2 = blo.m5841a(blo, str, a);
            return a2;
        } finally {
            a.mo1753a();
        }
    }

    private static int m5841a(blo blo, String str, bjm bjm) {
        Cursor a;
        bmv e = blo.m6044e();
        if (TextUtils.isEmpty(str)) {
            Cursor cursor = bmk.f3972a;
            a = e.m6200a("participants", (String[]) cursor, bmk.f3973b, null, null, null, null);
        } else {
            String[] strArr = bmk.f3972a;
            a = e.m6200a("conversation_participants_view", strArr, bmk.f3974c, new String[]{str}, null, null, null);
        }
        if (a == null) {
            return 0;
        }
        int i;
        try {
            ContentValues contentValues = new ContentValues();
            String[] strArr2 = new String[1];
            strArr = null;
            int i2 = 0;
            while (a.moveToNext()) {
                long j = a.getLong(0);
                String string = a.getString(1);
                String string2 = a.getString(2);
                String string3 = a.getString(3);
                bmi a2 = blo.m5851a(bjm, string, string2, string3);
                if (!TextUtils.equals(a2.f3968a, string2) || !TextUtils.equals(a2.f3969b, string3)) {
                    HashSet hashSet;
                    contentValues.clear();
                    contentValues.put("full_name", a2.f3968a);
                    contentValues.put("profile_photo_url", a2.f3969b);
                    strArr2[0] = String.valueOf(j);
                    int a3 = e.m6194a("participants", contentValues, "_id=?", strArr2) + i2;
                    if (strArr == null) {
                        hashSet = new HashSet();
                    } else {
                        Object obj = strArr;
                    }
                    hashSet.add(Long.valueOf(j));
                    strArr = hashSet;
                    i2 = a3;
                }
            }
            if (strArr != null) {
                String join = TextUtils.join(",", strArr);
                cursor = e.m6199a("SELECT DISTINCT conversations.conversation_id  FROM conversations JOIN conversation_participants  WHERE conversation_participants.conversation_id=conversations.conversation_id  AND conversation_participants.participant_row_id IN (?); ", new String[]{join});
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        i2 += cursor.getCount();
                        while (true) {
                            blf.m5813b(blo, cursor.getString(0));
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        }
                    }
                }
                i = i2;
                if (cursor != null) {
                }
            } else {
                i = i2;
            }
        } catch (Throwable th) {
            i = th;
            if (cursor != null) {
            }
        } finally {
            a = 
/*
Method generation error in method: blo.a(blo, java.lang.String, bjm):int
jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r3_4 'a' android.database.Cursor) = (r3_2 'a' android.database.Cursor), (r3_8 'a' android.database.Cursor) in method: blo.a(blo, java.lang.String, bjm):int
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:297)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 24 more

*/

            public void m5968a(bko bko, String str, String str2, long j, long j2, int i) {
                long toMicros;
                fhc fhc = new fhc();
                List arrayList = new ArrayList();
                edo a = edo.m13604a(str);
                for (edk edk : m5916H(str2)) {
                    arrayList.add(edk.f11213b);
                    if (edk.f11213b.f11244a.equalsIgnoreCase(str)) {
                        a = edk.f11213b;
                    }
                }
                if (m6116z(str2) == 1) {
                    toMicros = j2 + TimeUnit.DAYS.toMicros(1);
                } else {
                    toMicros = 0;
                }
                String a2 = m5953a(str2, arrayList);
                m5942a(str2, String.valueOf(j), fwx.ON_SERVER, a, fwy.HANGOUT_START_EVENT, j2, toMicros, 0, i, null, a2);
                int g = bko.m5638g();
                if (i == 20) {
                    fhc.m15305a(j2);
                } else {
                    fhc.m15316e();
                }
                ((ect) jyn.m25426a(this.f3731a, ect.class)).mo1827a(g, fhc.m15317f());
            }

            public void m6033c(List<eyg> list) {
                List<eyg> a = m5957a(false);
                List K = m5839K();
                long a2 = glj.m17956a();
                this.f3732e.m6202a();
                try {
                    this.f3732e.m6196a("sticker_photos", null, null);
                    this.f3732e.m6196a("sticker_albums", null, null);
                    for (eyg eyg : list) {
                        long j;
                        eyg eyg2 = null;
                        for (eyg eyg3 : a) {
                            if (eyg3.f12515a.equals(eyg.f12515a)) {
                                eyg2 = eyg3;
                                break;
                            }
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("album_id", eyg.f12515a);
                        contentValues.put("title", eyg.f12516b);
                        contentValues.put("cover_photo_id", eyg.f12517c == null ? null : eyg.f12517c.f12520a);
                        String str = "last_used";
                        if (eyg2 == null) {
                            j = a2 - 1;
                        } else {
                            long j2 = eyg2.f12518d;
                            j = a2;
                            a2 = j2;
                        }
                        contentValues.put(str, Long.valueOf(a2));
                        this.f3732e.m6197a("sticker_albums", null, contentValues);
                        for (eyi eyi : eyg.f12519e) {
                            ContentValues contentValues2 = new ContentValues();
                            eyi a3 = blo.m5855a(K, eyi.f12520a);
                            if (a3 != null) {
                                K.remove(a3);
                                if (a3.f12522c != null) {
                                    contentValues2.put("file_name", a3.f12522c);
                                }
                                contentValues2.put("last_used", Long.valueOf(a3.f12523d));
                            }
                            contentValues2.put("album_id", eyg.f12515a);
                            contentValues2.put("photo_id", eyi.f12520a);
                            contentValues2.put("url", eyi.f12521b);
                            this.f3732e.m6197a("sticker_photos", null, contentValues2);
                        }
                        a2 = j;
                    }
                    this.f3732e.m6207b();
                    blo.m5898f(K);
                } finally {
                    this.f3732e.m6208c();
                }
            }

            private static eyi m5855a(List<eyi> list, String str) {
                for (eyi eyi : list) {
                    if (eyi.f12520a.equals(str)) {
                        return eyi;
                    }
                }
                return null;
            }

            private static void m5898f(List<eyi> list) {
                for (eyi eyi : list) {
                    if (eyi.f12522c != null) {
                        File file = new File(eyi.f12522c);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }

            public List<eyg> m5957a(boolean z) {
                Cursor cursor = null;
                List<eyg> arrayList = new ArrayList();
                Throwable th;
                try {
                    Cursor a;
                    Cursor a2 = this.f3732e.m6200a("sticker_albums", f3718m, null, null, null, null, null);
                    if (a2 != null) {
                        while (a2.moveToNext()) {
                            try {
                                eyg eyg = new eyg();
                                eyg.f12515a = a2.getString(0);
                                eyg.f12516b = a2.getString(2);
                                eyg.f12518d = (long) a2.getInt(3);
                                if (z) {
                                    eyg.f12519e = new ArrayList();
                                    try {
                                        a = this.f3732e.m6201a("sticker_photos", f3717l, "album_id=?", new String[]{eyg.f12515a}, null, null, null, null);
                                        while (a != null) {
                                            if (!a.moveToNext()) {
                                                break;
                                            }
                                            eyi eyi = new eyi();
                                            eyi.f12520a = a.getString(0);
                                            eyi.f12521b = a.getString(1);
                                            eyi.f12522c = a.getString(2);
                                            eyi.f12523d = (long) a.getInt(3);
                                            if (eyi.f12520a.equals(a2.getString(1))) {
                                                eyg.f12517c = eyi;
                                            } else {
                                                try {
                                                    if (eyg.f12517c == null && a2.getString(1) == null) {
                                                        eyg.f12517c = eyi;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            eyg.f12519e.add(eyi);
                                        }
                                        if (a != null) {
                                            a.close();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        a = null;
                                    }
                                }
                                arrayList.add(eyg);
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = a2;
                            }
                        }
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    return arrayList;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private List<eyi> m5839K() {
                Throwable th;
                List<eyi> arrayList = new ArrayList();
                Cursor a;
                try {
                    a = this.f3732e.m6200a("sticker_photos", f3717l, null, null, null, null, null);
                    while (a != null) {
                        try {
                            if (!a.moveToNext()) {
                                break;
                            }
                            eyi eyi = new eyi();
                            eyi.f12520a = a.getString(0);
                            eyi.f12521b = a.getString(1);
                            eyi.f12522c = a.getString(2);
                            eyi.f12523d = (long) a.getInt(3);
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

            public List<eyi> m5908B() {
                Throwable th;
                List<eyi> arrayList = new ArrayList();
                Cursor a;
                try {
                    a = this.f3732e.m6201a("sticker_photos", f3717l, "last_used!=0", null, null, null, "last_used DESC", "32");
                    while (a != null) {
                        try {
                            if (!a.moveToNext()) {
                                break;
                            }
                            eyi eyi = new eyi();
                            eyi.f12520a = a.getString(0);
                            eyi.f12521b = a.getString(1);
                            eyi.f12522c = a.getString(2);
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
                Cursor a;
                Throwable th;
                this.f3732e.m6202a();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("last_used", Long.valueOf(glj.m17956a()));
                    int a2 = this.f3732e.m6194a("sticker_photos", contentValues, "photo_id=?", new String[]{str});
                    a = this.f3732e.m6200a("sticker_photos", new String[]{"album_id"}, "photo_id=?", new String[]{str}, null, null, null);
                    if (a != null) {
                        try {
                            if (a.moveToFirst() && a.getString(0) != null) {
                                contentValues.clear();
                                contentValues.put("last_used", Long.valueOf(glj.m17956a()));
                                this.f3732e.m6194a("sticker_albums", contentValues, "album_id=?", new String[]{a.getString(0)});
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (a != null) {
                                a.close();
                            }
                            this.f3732e.m6208c();
                            throw th;
                        }
                    }
                    this.f3732e.m6207b();
                    if (a != null) {
                        a.close();
                    }
                    this.f3732e.m6208c();
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
                    this.f3732e.m6208c();
                    throw th;
                }
            }

            public eyi ae(String str) {
                Throwable th;
                Cursor cursor = null;
                try {
                    Cursor a = this.f3732e.m6200a("sticker_photos", f3717l, "photo_id=?", new String[]{str}, null, null, null);
                    if (a != null) {
                        try {
                            if (a.moveToFirst()) {
                                eyi eyi = new eyi();
                                eyi.f12520a = a.getString(0);
                                eyi.f12521b = a.getString(1);
                                eyi.f12522c = a.getString(2);
                                eyi.f12523d = (long) a.getInt(3);
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

            public boolean m6088m(String str, String str2) {
                bmv bmv = null;
                bmv bmv2 = this.f3732e;
                bmv2.m6202a();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("file_name", str);
                    bmv2 = this.f3732e.m6194a("sticker_photos", contentValues, "photo_id=?", new String[]{str2});
                    this.f3732e.m6207b();
                    if (bmv2 == 1) {
                        return true;
                    }
                    return bmv;
                } finally {
                    bmv = this.f3732e;
                    bmv.m6208c();
                }
            }

            public fwx m6090n(String str, String str2) {
                Cursor a;
                Throwable th;
                fwx fwx = null;
                try {
                    a = this.f3732e.m6200a("messages", new String[]{"status"}, "conversation_id=? AND message_id=?", new String[]{str, str2}, null, null, null);
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

            private fwx m5902o(long j) {
                Throwable th;
                fwx fwx = null;
                Cursor a;
                try {
                    a = this.f3732e.m6200a("messages", new String[]{"status"}, "_id=?", new String[]{String.valueOf(j)}, null, null, null);
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

            public void m5910C() {
                new Handler(Looper.getMainLooper()).post(new blp(this));
                this.f3736n.mo1979a(this.f3734g).mo1693b().mo1714c(2939);
            }

            public void m5966a(long j, List<String> list) {
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
                    m5955a(contentValues, stringBuilder.toString(), (String[]) list.toArray(new String[0]));
                }
            }

            public int m5936a(String str, String[] strArr) {
                Cursor a;
                Throwable th;
                this.f3732e.m6202a();
                try {
                    a = this.f3732e.m6200a("messages", new String[]{"_id", "conversation_id"}, str, strArr, null, null, null);
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
                            m5869a(loVar);
                        }
                        int a2 = this.f3732e.m6196a("messages", str, strArr);
                        this.f3732e.m6207b();
                        this.f3732e.m6208c();
                        if (a != null) {
                            a.close();
                        }
                        return a2;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f3732e.m6208c();
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a = null;
                    this.f3732e.m6208c();
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }

            public List<Long> m5955a(ContentValues contentValues, String str, String[] strArr) {
                Cursor a;
                Throwable th;
                List<Long> arrayList = new ArrayList();
                this.f3732e.m6202a();
                try {
                    a = this.f3732e.m6200a("messages", new String[]{"_id", "conversation_id"}, str, strArr, null, null, null);
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
                            m5869a(loVar);
                        }
                        this.f3732e.m6194a("messages", contentValues, str, strArr);
                        this.f3732e.m6207b();
                        this.f3732e.m6208c();
                        if (a != null) {
                            a.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f3732e.m6208c();
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a = null;
                    this.f3732e.m6208c();
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }

            private void m5859a(ContentValues contentValues, Long l, String str) {
                if (this.f3732e.m6194a("messages", contentValues, "_id=?", new String[]{l.toString()}) > 0) {
                    m5905q(str, l.toString());
                }
            }

            public long m6008b(ContentValues contentValues) {
                long a = this.f3732e.m6197a("messages", null, contentValues);
                if (a != -1) {
                    m5905q(contentValues.getAsString("conversation_id"), String.valueOf(a));
                }
                return a;
            }

            private void m5905q(String str, String str2) {
                this.f3732e.m6203a(EsProvider.m8250a(m6061h(), str, gwb.ad(str2), gwb.ad(str2)));
            }

            private void m5869a(lo<String, List<Long>> loVar) {
                for (int i = 0; i < loVar.size(); i++) {
                    String str = (String) loVar.m28017b(i);
                    List list = (List) loVar.m28018c(i);
                    List arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        list = arrayList;
                    } else {
                        Collections.sort(list);
                        long a = gwb.m1523a((Long) list.get(0));
                        long j = a;
                        for (int i2 = 1; i2 < list.size(); i2++) {
                            long a2 = gwb.m1523a((Long) list.get(i2));
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
                        this.f3732e.m6203a(EsProvider.m8250a(m6061h(), str, gwb.m1523a((Long) pair.first), gwb.m1523a((Long) pair.second)));
                        i3 = i4;
                    }
                }
            }

            public List<edk> m5956a(String str, edo edo) {
                Throwable th;
                iil.m21875b("Expected non-null", (Object) edo);
                iil.m21875b("Expected non-null", edo.f11244a);
                Cursor a;
                try {
                    a = this.f3732e.m6200a("conversation_participants_view", edn.f11243a, "conversation_id=? AND gaia_id!=?", new String[]{str, edo.f11244a}, null, null, null);
                    try {
                        List<edk> a2 = gwb.m1691a(gwb.m1400H(), a);
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
