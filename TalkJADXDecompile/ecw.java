import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.List;

public class ecw extends ebz {
    private static final String a;
    private static final String b;
    private static final Object c;
    public long A;
    private final boolean B;

    static {
        String valueOf = String.valueOf("conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?)) AND type IN (");
        int ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        a = new StringBuilder(String.valueOf(valueOf).length() + 25).append(valueOf).append(ordinal).append(", ").append(fwy.OUTGOING_USER_MESSAGE.ordinal()).append(")").toString();
        valueOf = String.valueOf("conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?)) AND type IN (");
        ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        int ordinal2 = fwy.OUTGOING_USER_MESSAGE.ordinal();
        String valueOf2 = String.valueOf("timestamp");
        String valueOf3 = String.valueOf("chat_watermark");
        String valueOf4 = String.valueOf("timestamp");
        String valueOf5 = String.valueOf("1355097600000000");
        b = new StringBuilder(((((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append(valueOf).append(ordinal).append(", ").append(ordinal2).append(") AND ").append(valueOf2).append(">").append(valueOf3).append(" AND ").append(valueOf4).append(" > ").append(valueOf5).toString();
        c = new Object();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r6, int r7, gjj r8) {
        /*
        r0 = 0;
        if (r8 == 0) goto L_0x0011;
    L_0x0003:
        r1 = r8.size();
        r2 = 1;
        if (r1 <= r2) goto L_0x0011;
    L_0x000a:
        r1 = eao.c(r6);
        if (r1 != 0) goto L_0x0011;
    L_0x0010:
        r8 = r0;
    L_0x0011:
        r1 = c;
        monitor-enter(r1);
        r2 = a(r6, r7);	 Catch:{ all -> 0x0065 }
        if (r2 == 0) goto L_0x0068;
    L_0x001a:
        r3 = r2.iterator();	 Catch:{ all -> 0x0065 }
    L_0x001e:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x0068;
    L_0x0024:
        r0 = r3.next();	 Catch:{ all -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0065 }
        if (r8 == 0) goto L_0x0032;
    L_0x002c:
        r4 = r8.contains(r0);	 Catch:{ all -> 0x0065 }
        if (r4 != 0) goto L_0x001e;
    L_0x0032:
        r0 = ecm.a(r6, r7, r0);	 Catch:{ all -> 0x0065 }
        r4 = gw.a(r6);	 Catch:{ all -> 0x0065 }
        r5 = 0;
        ecm.a(r0, r5);	 Catch:{ all -> 0x0065 }
        r5 = 0;
        r4.a(r0, r5);	 Catch:{ all -> 0x0065 }
        r4 = d;	 Catch:{ all -> 0x0065 }
        if (r4 == 0) goto L_0x001e;
    L_0x0046:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0065 }
        r5 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0065 }
        r5 = r5.length();	 Catch:{ all -> 0x0065 }
        r5 = r5 + 57;
        r4.<init>(r5);	 Catch:{ all -> 0x0065 }
        r5 = "SingleConversationNotifier.cancel [tag=]";
        r4 = r4.append(r5);	 Catch:{ all -> 0x0065 }
        r0 = r4.append(r0);	 Catch:{ all -> 0x0065 }
        r4 = " [id=]0";
        r0.append(r4);	 Catch:{ all -> 0x0065 }
        goto L_0x001e;
    L_0x0065:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0065 }
        throw r0;
    L_0x0068:
        r0 = jcf.class;
        r0 = jyn.a(r6, r0);	 Catch:{ jcj -> 0x00b9 }
        r0 = (jcf) r0;	 Catch:{ jcj -> 0x00b9 }
        r0 = r0.b(r7);	 Catch:{ jcj -> 0x00b9 }
        if (r8 != 0) goto L_0x0088;
    L_0x0076:
        if (r2 == 0) goto L_0x0086;
    L_0x0078:
        r2 = "notifications_group_children_key";
        r3 = 0;
        r0 = r0.b(r2, r3);	 Catch:{ all -> 0x0065 }
        r0.d();	 Catch:{ all -> 0x0065 }
        r0 = d;	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x0086;
    L_0x0086:
        monitor-exit(r1);	 Catch:{ all -> 0x0065 }
        return;
    L_0x0088:
        r2 = r8.equals(r2);	 Catch:{ all -> 0x0065 }
        if (r2 != 0) goto L_0x0086;
    L_0x008e:
        r2 = "notifications_group_children_key";
        r3 = r8.b();	 Catch:{ all -> 0x0065 }
        r0 = r0.b(r2, r3);	 Catch:{ all -> 0x0065 }
        r0.d();	 Catch:{ all -> 0x0065 }
        r0 = d;	 Catch:{ all -> 0x0065 }
        if (r0 == 0) goto L_0x0086;
    L_0x009f:
        r0 = "Writing to prefstore: notified conversations ";
        r2 = r8.b();	 Catch:{ all -> 0x0065 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0065 }
        r3 = r2.length();	 Catch:{ all -> 0x0065 }
        if (r3 == 0) goto L_0x00b3;
    L_0x00af:
        r0.concat(r2);	 Catch:{ all -> 0x0065 }
        goto L_0x0086;
    L_0x00b3:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0065 }
        r2.<init>(r0);	 Catch:{ all -> 0x0065 }
        goto L_0x0086;
    L_0x00b9:
        r0 = move-exception;
        goto L_0x0086;
        */
        throw new UnsupportedOperationException("Method not decompiled: ecw.a(android.content.Context, int, gjj):void");
    }

    private static gjj a(Context context, int i) {
        String a;
        try {
            a = ((jcf) jyn.a(context, jcf.class)).a(i).a("notifications_group_children_key", "");
        } catch (jcj e) {
            a = "";
        }
        if (a == null || a.length() <= 0) {
            return null;
        }
        if (d) {
            String str = "Reading from prefstore: notified conversations ";
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        return gjj.a(a);
    }

    protected ecw(Context context, int i, eap eap, boolean z) {
        super(context, i, eap);
        this.B = z;
        ear ear = (ear) eap.b.get(0);
        b(ear.a);
        c(ear.a);
        ebs ebs = (ebs) ear.h.get(0);
        this.j = ebs.c;
        this.k = ebs.d;
        if (this.j == null || !TextUtils.isEmpty(ebs.b)) {
            this.h = ebs.b;
        } else {
            int i2 = bc.jo;
            if (this.k == 2) {
                i2 = bc.jn;
            } else if (this.k == 3) {
                i2 = bc.jw;
            } else if (this.k == 4) {
                i2 = bc.jp;
            } else if (this.k == 6) {
                i2 = bc.jv;
            } else if (this.k == 7) {
                i2 = bc.jq;
            }
            this.h = context.getString(i2);
        }
        if (ear.c) {
            this.f = this.h;
            this.e = ebs.s;
            this.h = c(a(ebs), ebs.b, this.j, this.k);
            this.g = ear.f;
        } else {
            this.g = ((ebs) ear.h.get(0)).s;
        }
        this.i = gwb.a(i, ear.a, ear.e);
        this.i.putExtra("is_chat_notification", true);
        this.i.putExtra("opened_from_impression", 1637);
        this.A = ear.m;
    }

    private static String a(ebs ebs) {
        Object obj = (ebs.a == fwy.INCOMING_USER_MESSAGE || !ebs.b.toString().contains(ebs.s)) ? null : 1;
        return obj != null ? null : String.valueOf(ebs.r).concat(":");
    }

    protected void a(boolean z) {
        Resources resources = this.r.getResources();
        ear ear = (ear) this.n.b.get(0);
        List list = ear.h;
        int size = list.size();
        this.w.a(this.g).c(m()).b(this.h);
        if (this.n.a > 1) {
            this.w.b(this.n.a);
        }
        String str;
        if (size == 1 && this.j != null && this.k != 2 && this.k != 3) {
            String valueOf;
            if (this.j.startsWith("//")) {
                str = "http:";
                valueOf = String.valueOf(this.j);
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                this.j = valueOf;
            }
            this.v = new fv(this.w).a(a(((ebs) list.get(0)).r, null, null, 0));
            frj bnn = new bnn(new gkc(this.j, ((jcf) jyn.a(this.r, jcf.class)).a(this.s).b("account_name")).a(resources.getDimensionPixelSize(gwb.fk), resources.getDimensionPixelSize(gwb.fj)).c(this.k == 3).d(true), new ecx(this), false, this);
            if (d) {
                valueOf = "postNotification created ImageRequest on: ";
                str = String.valueOf(this.j);
                if (str.length() != 0) {
                    valueOf.concat(str);
                } else {
                    str = new String(valueOf);
                }
            }
            ((fsi) jyn.a(this.r, fsi.class)).c(bnn);
        } else if (gwb.c()) {
            gl gbVar = new gb(this.r.getString(bc.gZ));
            if (ear.c) {
                gbVar.a(ear.f);
            }
            this.v = gbVar;
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                CharSequence charSequence;
                r1 = (ebs) ((ecj) list.get(size2));
                this.j = r1.c;
                if (this.j != null && this.j.startsWith("//")) {
                    String str2 = "http:";
                    str = String.valueOf(this.j);
                    if (str.length() != 0) {
                        str = str2.concat(str);
                    } else {
                        str = new String(str2);
                    }
                    this.j = str;
                }
                this.k = r1.d;
                CharSequence charSequence2 = r1.b;
                if (TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(this.j)) {
                    charSequence2 = a(this.k);
                }
                if (TextUtils.equals(bkq.c(this.r, this.s).b, r1.m)) {
                    charSequence = null;
                } else {
                    charSequence = r1.r;
                }
                gc gcVar = new gc(charSequence2, Long.parseLong(r1.l), charSequence);
                if (!TextUtils.isEmpty(this.j)) {
                    if (this.k == 3) {
                        gcVar.a("video/mp4", Uri.parse(this.j));
                    } else if (this.k == 1) {
                        gcVar.a("image/jpeg", Uri.parse(this.j));
                    }
                }
                gbVar.a(gcVar);
            }
        } else {
            gl fwVar = new fw(this.w);
            this.v = fwVar;
            if (size == 1) {
                fwVar.b(this.h);
            } else {
                CharSequence spannableStringBuilder = new SpannableStringBuilder();
                for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                    r1 = (ebs) ((ecj) list.get(size3));
                    this.j = r1.c;
                    this.k = r1.d;
                    CharSequence charSequence3 = r1.b;
                    if (!TextUtils.isEmpty(charSequence3) || !TextUtils.isEmpty(this.j)) {
                        CharSequence c;
                        if (ear.c) {
                            c = c(a(r1), charSequence3, this.j, this.k);
                        } else {
                            c = c(null, charSequence3, this.j, this.k);
                        }
                        spannableStringBuilder.append(c);
                        if (size3 > 0) {
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
                fwVar.b(spannableStringBuilder);
            }
        }
        for (ecv a : jyn.c(this.r, ecv.class)) {
            fr a2 = a.a(this.s, ear, 2854);
            if (a2 != null) {
                this.w.a(a2);
            }
        }
        this.w.a(ear.g / 1000);
        super.a(z);
    }

    protected void a() {
        if (!(!eao.b(this.r) || q() || ((ear) this.n.b.get(0)).c)) {
            eid x = x();
            if (x != null) {
                PendingIntent c = c(false);
                hg a = ecm.a(this.r);
                Intent a2 = BabelGatewayActivity.a(this.s, this.t.a());
                a2.setFlags(268468224);
                this.w.a(new e().a(x.a(PendingIntent.getActivity(this.r, super.v() + 1, a2, 134217728)).a(c, a).a()).a(this.r.getResources().getColor(gwb.dU)));
            }
        }
        if (eao.a(this.r) || giw.e(this.r)) {
            int i;
            int i2 = this.r.getSharedPreferences("wearablePrefs", 0).getInt("api_level", 22);
            this.x.a(true);
            boolean q = q();
            boolean z = ((ear) this.n.b.get(0)).c && q && fyi.c();
            if (z) {
                i = bc.hv;
            } else if (q) {
                i = bc.hw;
            } else {
                i = bc.hu;
            }
            hg a3 = ecm.a(this.r);
            fs fsVar = new fs(R$drawable.bc, this.r.getString(i), c(true));
            fsVar.a(a3);
            fsVar.a(true);
            this.x.a(fsVar.a(new fu().a(true).b(true)).b());
            this.x.c(true);
            if (i2 > 21) {
                fs fsVar2 = new fs(R$drawable.bi, this.r.getString(bc.hE), s());
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putString("action", "android.intent.action.VIEW");
                bundle.putString("packageName", "com.google.android.talk");
                bundle.putInt("flags", 32768);
                Bundle bundle2 = new Bundle();
                bundle2.putString("accountGaia", bkq.b(this.r, this.s));
                bundle2.putString("conversationId", this.t.a());
                bundle.putBundle("extras", bundle2);
                fsVar2.a().putBundle("com.google.android.wearable.preview.extra.REMOTE_INTENT", bundle);
                this.x.a(fsVar2.b());
            } else {
                Notification a4 = a(bkf.b(fde.e(this.s), this.t.a()), y());
                if (a4 != null) {
                    this.x.a(a4);
                }
            }
        }
        super.a();
    }

    private eid x() {
        String a = this.t.a();
        Uri a2 = EsProvider.a(EsProvider.l, this.s);
        eid eid = null;
        Cursor query = this.r.getContentResolver().query(a2, ebv.a, b, new String[]{a}, "timestamp ASC");
        if (query == null) {
            return null;
        }
        try {
            eid eid2;
            if (query.moveToFirst()) {
                while (true) {
                    ebs ebs = new ebs(query, this.s);
                    if (TextUtils.isEmpty(ebs.b)) {
                        eid2 = eid;
                    } else {
                        if (eid == null) {
                            eid2 = new eid(ebs.s);
                        } else {
                            eid2 = eid;
                        }
                        eid2.a(ebs.p.g / 1000);
                        eid2.a(ebs.b.toString());
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                    eid = eid2;
                }
            } else {
                eid2 = null;
            }
            query.close();
            return eid2;
        } catch (Throwable th) {
            query.close();
        }
    }

    private boolean y() {
        return ((ear) this.n.b.get(0)).b();
    }

    private Notification a(int i, boolean z) {
        CharSequence charSequence = null;
        String a = this.t.a();
        Uri build = EsProvider.a(EsProvider.l, this.s).buildUpon().appendQueryParameter("limit", "21").build();
        List arrayList = new ArrayList();
        Cursor query = this.r.getContentResolver().query(build, ebv.a, a, new String[]{a}, "timestamp DESC");
        if (query != null) {
            try {
                if (!query.moveToFirst()) {
                    return null;
                }
                while (true) {
                    ebs ebs = new ebs(query, this.s);
                    if (!(ebs.r == null || (TextUtils.isEmpty(ebs.b) && ebs.c == null))) {
                        arrayList.add(c(ebs.r, ebs.b, ebs.c, ebs.d));
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                }
                query.close();
            } finally {
                query.close();
            }
        }
        if (arrayList.size() <= 1) {
            return null;
        }
        int i2;
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        int size = arrayList.size() - 1;
        if (arrayList.size() == 21) {
            spannableStringBuilder.append(this.r.getString(bc.cp)).append("\n\n");
            size--;
        }
        for (i2 = size; i2 >= 0; i2--) {
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            if (i2 > 0) {
                spannableStringBuilder.append("\n\n");
            }
        }
        i2 = i + 1;
        if (i2 > 2) {
            Resources resources = this.r.getResources();
            if (z) {
                size = gwb.ih;
            } else {
                size = gwb.ig;
            }
            charSequence = new SpannableString(resources.getQuantityString(size, i2, new Object[]{Integer.valueOf(i2)}));
        } else if (z) {
            charSequence = new SpannableString(this.r.getResources().getString(bc.kW));
        }
        if (charSequence != null) {
            charSequence.setSpan(new ForegroundColorSpan(this.r.getResources().getColor(gwb.ev)), 0, charSequence.length(), 33);
            spannableStringBuilder.append("\n\n").append(charSequence);
        }
        fx fxVar = new fx(this.r);
        fxVar.a(new fw(fxVar).b(spannableStringBuilder));
        fz gmVar = new gm();
        gmVar.a(true);
        fxVar.a(gmVar);
        return fxVar.b();
    }

    private PendingIntent c(boolean z) {
        int w;
        boolean z2 = true;
        boolean z3 = ((ear) this.n.b.get(0)).c && q() && fyi.c();
        Context context = this.r;
        int i = this.s;
        String a = this.t.a();
        long j = this.A;
        if (y()) {
            z2 = false;
        }
        Intent a2 = BabelGatewayActivity.a(context, i, a, j, z3, z2);
        a2.setFlags(268468224);
        if (z) {
            a2.putExtra("opened_from_impression", 2257);
            w = w();
        } else {
            w = super.v();
        }
        return PendingIntent.getActivity(this.r, w, a2, 134217728);
    }

    protected int p() {
        return super.p() + 2;
    }

    protected String d() {
        return ecm.a(this.r, this.s, this.t.a());
    }

    private void a(int i, int i2) {
        ear ear = (ear) this.n.b.get(0);
        if (this.B) {
            ba.a(this.s, glj.b(), 10, ba.c().a(i).c(((ebs) ear.h.get(0)).k).a(ear.a).b(true));
        } else if (i2 != 0) {
            ebs.a(this.s, this.n.b, 0, i2, false, null);
        }
    }

    protected void c() {
        int i;
        super.c();
        ear ear = (ear) this.n.b.get(0);
        bko e = fde.e(this.s);
        if (ear.h.size() == 1) {
            i = 1926;
        } else {
            i = 1927;
        }
        gwb.a(e, i);
        b(this.B);
        a((int) HttpStatusCodes.STATUS_CODE_METHOD_NOT_ALLOWED, 463);
    }

    protected void e() {
        a(406, 0);
    }
}
