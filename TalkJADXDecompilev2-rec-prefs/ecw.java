package p000;

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
import java.util.Iterator;
import java.util.List;

public class ecw extends ebz {
    private static final String f11049a;
    private static final String f11050b;
    private static final Object f11051c = new Object();
    public long f11052A;
    private final boolean f11053B;

    static {
        String valueOf = String.valueOf("conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?)) AND type IN (");
        int ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        f11049a = new StringBuilder(String.valueOf(valueOf).length() + 25).append(valueOf).append(ordinal).append(", ").append(fwy.OUTGOING_USER_MESSAGE.ordinal()).append(")").toString();
        valueOf = String.valueOf("conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?)) AND type IN (");
        ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        int ordinal2 = fwy.OUTGOING_USER_MESSAGE.ordinal();
        String valueOf2 = String.valueOf("timestamp");
        String valueOf3 = String.valueOf("chat_watermark");
        String valueOf4 = String.valueOf("timestamp");
        String valueOf5 = String.valueOf("1355097600000000");
        f11050b = new StringBuilder(((((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append(valueOf).append(ordinal).append(", ").append(ordinal2).append(") AND ").append(valueOf2).append(">").append(valueOf3).append(" AND ").append(valueOf4).append(" > ").append(valueOf5).toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13355a(Context context, int i, gjj gjj) {
        if (!(gjj == null || gjj.size() <= 1 || eao.m13372c(context))) {
            gjj = null;
        }
        synchronized (f11051c) {
            String str;
            gjj a = ecw.m13352a(context, i);
            if (a != null) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    str = (String) it.next();
                    if (gjj == null || !gjj.contains(str)) {
                        str = ecm.m13298a(context, i, str);
                        gw a2 = gw.m18748a(context);
                        ecm.m13301a(str, 0);
                        a2.m18751a(str, 0);
                        if (d) {
                            new StringBuilder(String.valueOf(str).length() + 57).append("SingleConversationNotifier.cancel [tag=]").append(str).append(" [id=]0");
                        }
                    }
                }
            }
            try {
                jci b = ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(i);
                if (gjj == null) {
                    if (a != null) {
                        b.m23879b("notifications_group_children_key", null).m23891d();
                    }
                } else if (!gjj.equals(a)) {
                    b.m23879b("notifications_group_children_key", gjj.m17808b()).m23891d();
                    if (d) {
                        str = "Writing to prefstore: notified conversations ";
                        String valueOf = String.valueOf(gjj.m17808b());
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                    }
                }
            } catch (jcj e) {
            }
        }
    }

    private static gjj m13352a(Context context, int i) {
        String a;
        try {
            a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3435a("notifications_group_children_key", "");
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
        return gjj.m17806a(a);
    }

    protected ecw(Context context, int i, eap eap, boolean z) {
        super(context, i, eap);
        this.f11053B = z;
        ear ear = (ear) eap.f11060b.get(0);
        m13308b(ear.f11061a);
        m13312c(ear.f11061a);
        ebs ebs = (ebs) ear.f11068h.get(0);
        this.j = ebs.f11125c;
        this.k = ebs.f11126d;
        if (this.j == null || !TextUtils.isEmpty(ebs.f11124b)) {
            this.h = ebs.f11124b;
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
        if (ear.f11063c) {
            this.f = this.h;
            this.e = ebs.s;
            this.h = m13310c(ecw.m13353a(ebs), ebs.f11124b, this.j, this.k);
            this.g = ear.f11066f;
        } else {
            this.g = ((ebs) ear.f11068h.get(0)).s;
        }
        this.i = gwb.m1537a(i, ear.f11061a, ear.f11065e);
        this.i.putExtra("is_chat_notification", true);
        this.i.putExtra("opened_from_impression", 1637);
        this.f11052A = ear.f11073m;
    }

    private static String m13353a(ebs ebs) {
        Object obj = (ebs.f11123a == fwy.INCOMING_USER_MESSAGE || !ebs.f11124b.toString().contains(ebs.s)) ? null : 1;
        return obj != null ? null : String.valueOf(ebs.r).concat(":");
    }

    protected void mo1807a(boolean z) {
        Resources resources = this.r.getResources();
        ear ear = (ear) this.n.f11060b.get(0);
        List list = ear.f11068h;
        int size = list.size();
        this.w.m16429a(this.g).m16440c(m13348m()).m16436b(this.h);
        if (this.n.f11059a > 1) {
            this.w.m16434b(this.n.f11059a);
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
            this.v = new fv(this.w).m16303a(m13335a(((ebs) list.get(0)).r, null, null, 0));
            frj bnn = new bnn(new gkc(this.j, ((jcf) jyn.m25426a(this.r, jcf.class)).mo3456a(this.s).mo3440b("account_name")).m5548a(resources.getDimensionPixelSize(gwb.fk), resources.getDimensionPixelSize(gwb.fj)).m5557c(this.k == 3).m5558d(true), new ecx(this), false, this);
            if (d) {
                valueOf = "postNotification created ImageRequest on: ";
                str = String.valueOf(this.j);
                if (str.length() != 0) {
                    valueOf.concat(str);
                } else {
                    str = new String(valueOf);
                }
            }
            ((fsi) jyn.m25426a(this.r, fsi.class)).m12718c(bnn);
        } else if (gwb.m2107c()) {
            gl gbVar = new gb(this.r.getString(bc.gZ));
            if (ear.f11063c) {
                gbVar.m16835a(ear.f11066f);
            }
            this.v = gbVar;
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                CharSequence charSequence;
                r1 = (ebs) ((ecj) list.get(size2));
                this.j = r1.f11125c;
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
                this.k = r1.f11126d;
                CharSequence charSequence2 = r1.f11124b;
                if (TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(this.j)) {
                    charSequence2 = m13304a(this.k);
                }
                if (TextUtils.equals(bkq.m5685c(this.r, this.s).f11245b, r1.f11135m)) {
                    charSequence = null;
                } else {
                    charSequence = r1.r;
                }
                gc gcVar = new gc(charSequence2, Long.parseLong(r1.f11134l), charSequence);
                if (!TextUtils.isEmpty(this.j)) {
                    if (this.k == 3) {
                        gcVar.m16883a("video/mp4", Uri.parse(this.j));
                    } else if (this.k == 1) {
                        gcVar.m16883a("image/jpeg", Uri.parse(this.j));
                    }
                }
                gbVar.m16834a(gcVar);
            }
        } else {
            gl fwVar = new fw(this.w);
            this.v = fwVar;
            if (size == 1) {
                fwVar.m16352b(this.h);
            } else {
                CharSequence spannableStringBuilder = new SpannableStringBuilder();
                for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                    r1 = (ebs) ((ecj) list.get(size3));
                    this.j = r1.f11125c;
                    this.k = r1.f11126d;
                    CharSequence charSequence3 = r1.f11124b;
                    if (!TextUtils.isEmpty(charSequence3) || !TextUtils.isEmpty(this.j)) {
                        CharSequence c;
                        if (ear.f11063c) {
                            c = m13310c(ecw.m13353a(r1), charSequence3, this.j, this.k);
                        } else {
                            c = m13310c(null, charSequence3, this.j, this.k);
                        }
                        spannableStringBuilder.append(c);
                        if (size3 > 0) {
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
                fwVar.m16352b(spannableStringBuilder);
            }
        }
        for (ecv a : jyn.m25438c(this.r, ecv.class)) {
            fr a2 = a.mo1975a(this.s, ear, 2854);
            if (a2 != null) {
                this.w.m16426a(a2);
            }
        }
        this.w.m16419a(ear.f11067g / 1000);
        super.mo1807a(z);
    }

    protected void mo1806a() {
        if (!(!eao.m13370b(this.r) || m13325q() || ((ear) this.n.f11060b.get(0)).f11063c)) {
            eid x = m13357x();
            if (x != null) {
                PendingIntent c = m13356c(false);
                hg a = ecm.m13296a(this.r);
                Intent a2 = BabelGatewayActivity.m8795a(this.s, this.t.m17807a());
                a2.setFlags(268468224);
                this.w.m16427a(new C0054e().m13264a(x.m13960a(PendingIntent.getActivity(this.r, super.m13330v() + 1, a2, 134217728)).m13961a(c, a).m13958a()).m13263a(this.r.getResources().getColor(gwb.dU)));
            }
        }
        if (eao.m13368a(this.r) || giw.m17760e(this.r)) {
            int i;
            int i2 = this.r.getSharedPreferences("wearablePrefs", 0).getInt("api_level", 22);
            this.x.m18070a(true);
            boolean q = m13325q();
            boolean z = ((ear) this.n.f11060b.get(0)).f11063c && q && fyi.m16627c();
            if (z) {
                i = bc.hv;
            } else if (q) {
                i = bc.hw;
            } else {
                i = bc.hu;
            }
            hg a3 = ecm.m13296a(this.r);
            fs fsVar = new fs(R$drawable.bc, this.r.getString(i), m13356c(true));
            fsVar.m16109a(a3);
            fsVar.m16110a(true);
            this.x.m18069a(fsVar.m16108a(new fu().m16240a(true).m16241b(true)).m16111b());
            this.x.m18072c(true);
            if (i2 > 21) {
                fs fsVar2 = new fs(R$drawable.bi, this.r.getString(bc.hE), m13327s());
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putString("action", "android.intent.action.VIEW");
                bundle.putString("packageName", "com.google.android.talk");
                bundle.putInt("flags", 32768);
                Bundle bundle2 = new Bundle();
                bundle2.putString("accountGaia", bkq.m5675b(this.r, this.s));
                bundle2.putString("conversationId", this.t.m17807a());
                bundle.putBundle("extras", bundle2);
                fsVar2.m16107a().putBundle("com.google.android.wearable.preview.extra.REMOTE_INTENT", bundle);
                this.x.m18069a(fsVar2.m16111b());
            } else {
                Notification a4 = m13351a(bkf.m5580b(fde.m15018e(this.s), this.t.m17807a()), m13358y());
                if (a4 != null) {
                    this.x.m18067a(a4);
                }
            }
        }
        super.mo1806a();
    }

    private eid m13357x() {
        String a = this.t.m17807a();
        Uri a2 = EsProvider.m8251a(EsProvider.f6009l, this.s);
        eid eid = null;
        Cursor query = this.r.getContentResolver().query(a2, ebv.f11143a, f11050b, new String[]{a}, "timestamp ASC");
        if (query == null) {
            return null;
        }
        try {
            eid eid2;
            if (query.moveToFirst()) {
                while (true) {
                    ebs ebs = new ebs(query, this.s);
                    if (TextUtils.isEmpty(ebs.f11124b)) {
                        eid2 = eid;
                    } else {
                        if (eid == null) {
                            eid2 = new eid(ebs.s);
                        } else {
                            eid2 = eid;
                        }
                        eid2.m13959a(ebs.p.f11067g / 1000);
                        eid2.m13962a(ebs.f11124b.toString());
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

    private boolean m13358y() {
        return ((ear) this.n.f11060b.get(0)).m13380b();
    }

    private Notification m13351a(int i, boolean z) {
        CharSequence charSequence = null;
        String a = this.t.m17807a();
        Uri build = EsProvider.m8251a(EsProvider.f6009l, this.s).buildUpon().appendQueryParameter("limit", "21").build();
        List arrayList = new ArrayList();
        Cursor query = this.r.getContentResolver().query(build, ebv.f11143a, f11049a, new String[]{a}, "timestamp DESC");
        if (query != null) {
            try {
                if (!query.moveToFirst()) {
                    return null;
                }
                while (true) {
                    ebs ebs = new ebs(query, this.s);
                    if (!(ebs.r == null || (TextUtils.isEmpty(ebs.f11124b) && ebs.f11125c == null))) {
                        arrayList.add(m13310c(ebs.r, ebs.f11124b, ebs.f11125c, ebs.f11126d));
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
        fxVar.m16428a(new fw(fxVar).m16352b(spannableStringBuilder));
        fz gmVar = new gm();
        gmVar.m18070a(true);
        fxVar.m16427a(gmVar);
        return fxVar.m16433b();
    }

    private PendingIntent m13356c(boolean z) {
        int w;
        boolean z2 = true;
        boolean z3 = ((ear) this.n.f11060b.get(0)).f11063c && m13325q() && fyi.m16627c();
        Context context = this.r;
        int i = this.s;
        String a = this.t.m17807a();
        long j = this.f11052A;
        if (m13358y()) {
            z2 = false;
        }
        Intent a2 = BabelGatewayActivity.m8800a(context, i, a, j, z3, z2);
        a2.setFlags(268468224);
        if (z) {
            a2.putExtra("opened_from_impression", 2257);
            w = m13331w();
        } else {
            w = super.m13330v();
        }
        return PendingIntent.getActivity(this.r, w, a2, 134217728);
    }

    protected int mo1821p() {
        return super.mo1821p() + 2;
    }

    protected String mo1819d() {
        return ecm.m13298a(this.r, this.s, this.t.m17807a());
    }

    private void m13354a(int i, int i2) {
        ear ear = (ear) this.n.f11060b.get(0);
        if (this.f11053B) {
            ba.m4548a(this.s, glj.m17963b(), 10, ba.m4618c().m12786a(i).m12798c(((ebs) ear.f11068h.get(0)).f11133k).m12789a(ear.f11061a).m12795b(true));
        } else if (i2 != 0) {
            ebs.m13479a(this.s, this.n.f11060b, 0, i2, false, null);
        }
    }

    protected void mo1809c() {
        int i;
        super.mo1809c();
        ear ear = (ear) this.n.f11060b.get(0);
        bko e = fde.m15018e(this.s);
        if (ear.f11068h.size() == 1) {
            i = 1926;
        } else {
            i = 1927;
        }
        gwb.m1823a(e, i);
        m13338b(this.f11053B);
        m13354a((int) HttpStatusCodes.STATUS_CODE_METHOD_NOT_ALLOWED, 463);
    }

    protected void mo1820e() {
        m13354a(406, 0);
    }
}
