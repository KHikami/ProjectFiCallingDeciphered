package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.System;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ecm {
    private static final String f11016a = BabelHomeActivity.class.getName();
    private static final Map<String, Long> f11017b = new ky();
    private static int f11018c;
    private static Bitmap f11019d;
    public static final boolean f11020p = false;
    public static final Set<ecm> f11021q = new HashSet();
    private boolean f11022e;
    private boolean f11023f;
    private boolean f11024g;
    private List<String> f11025h = new ArrayList();
    private List<bkf> f11026i = new LinkedList();
    private int f11027j;
    public final Context f11028r;
    public final int f11029s;
    public final gjj f11030t;
    public final Set<String> f11031u = new HashSet();
    public gl f11032v;
    public fx f11033w;
    public gm f11034x = new gm();
    public fx f11035y;
    public final Set<ecp> f11036z = new HashSet();

    protected abstract boolean mo1808b();

    protected abstract int mo1810f();

    protected abstract int mo1811g();

    protected abstract Intent mo1812h();

    protected abstract Intent mo1813i();

    protected abstract boolean mo1815k();

    protected abstract int mo1816l();

    static {
        kae kae = glk.f15568o;
    }

    protected boolean m13325q() {
        return mo1818o() == fvd.LOCAL_SMS;
    }

    protected boolean m13326r() {
        return mo1818o() == fvd.GV_SMS;
    }

    protected void m13308b(String str) {
        m13300a(str);
        if (!this.f11026i.isEmpty()) {
            for (edk edk : ((bkf) this.f11026i.get(0)).m5590b()) {
                if (!TextUtils.isEmpty(edk.f11219h)) {
                    this.f11025h.add(edk.f11219h);
                }
            }
        }
    }

    protected void m13312c(String str) {
        m13300a(str);
        for (bkf b : this.f11026i) {
            this.f11031u.addAll(gwb.m1701a(this.f11028r, this.f11029s, b.m5590b()));
        }
    }

    private void m13300a(String str) {
        for (bkf a : this.f11026i) {
            if (TextUtils.equals(str, a.m5585a())) {
                return;
            }
        }
        List<bls> ac = new blo(this.f11028r, this.f11029s).ac(str);
        this.f11026i.clear();
        for (bls bls : ac) {
            bkf c = bkf.m5582c(fde.m15018e(this.f11029s), bls.f3773s);
            if (gwb.m2267j(bls.f3757c)) {
                this.f11026i.add(0, c);
            } else {
                this.f11026i.add(c);
            }
        }
    }

    protected static void m13301a(String str, int i) {
        List arrayList = new ArrayList();
        synchronized (f11021q) {
            for (ecm ecm : f11021q) {
                if (str.equals(ecm.mo1819d()) && ecm.mo1810f() == i) {
                    arrayList.add(ecm);
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((ecm) obj).mo1817n();
        }
    }

    protected static hg m13296a(Context context) {
        return new hh("android.intent.extra.TEXT").m19778a(context.getString(bc.hs)).m19780a(gwb.m2068b(context.getResources().getStringArray(gwb.dw))).m19777a();
    }

    protected static String m13303c(Context context, int i) {
        String valueOf = String.valueOf(context.getPackageName());
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(":").append(i).toString();
    }

    protected static String m13298a(Context context, int i, String str) {
        String valueOf = String.valueOf(context.getPackageName());
        return new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(str).length()).append(valueOf).append(":").append(i).append(":").append(str).toString();
    }

    protected static String m13302b(Context context, int i, String str, String str2) {
        String valueOf = String.valueOf(context.getPackageName());
        return new StringBuilder(((String.valueOf(valueOf).length() + 14) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(":").append(i).append(":").append(str).append(":").append(str2).toString();
    }

    protected CharSequence m13307b(String str, CharSequence charSequence, String str2, int i) {
        return m13297a(str, charSequence, null, 0, bc.hB);
    }

    protected CharSequence m13310c(String str, CharSequence charSequence, String str2, int i) {
        return m13297a(str, charSequence, str2, i, bc.hA);
    }

    private CharSequence m13297a(String str, CharSequence charSequence, String str2, int i, int i2) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(this.f11028r.getString(i2));
            }
            spannableStringBuilder.append(charSequence);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(this.f11028r.getString(bc.hz));
            }
            spannableStringBuilder.append(m13304a(i));
        }
        return spannableStringBuilder;
    }

    protected CharSequence m13304a(int i) {
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this.f11028r, gwb.iB);
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        int i2 = bc.hr;
        switch (i) {
            case 2:
                i2 = bc.hn;
                break;
            case 3:
                i2 = bc.hD;
                break;
            case 4:
                i2 = bc.hp;
                break;
            case 6:
                i2 = bc.hC;
                break;
            case 7:
                i2 = bc.le;
                break;
        }
        spannableStringBuilder.append(this.f11028r.getText(i2));
        spannableStringBuilder.setSpan(textAppearanceSpan, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    protected ecm(Context context, int i, gjj gjj) {
        this.f11028r = context;
        this.f11029s = i;
        this.f11030t = gjj;
        this.f11033w = new fx(context);
        this.f11035y = new fx(context);
        this.f11035y.m16417a(mo1816l());
        this.f11035y.m16429a(context.getString(bc.f2959o));
        this.f11035y.m16436b(context.getString(bc.jP));
    }

    protected static void m13299a(ecm ecm) {
        ecm.m13301a(ecm.mo1819d(), ecm.mo1810f());
        f11021q.add(ecm);
    }

    void m13328t() {
        synchronized (this.f11036z) {
            if (this.f11036z.isEmpty()) {
                m13329u();
            }
        }
    }

    void m13329u() {
        synchronized (f11021q) {
            if (!this.f11022e || this.f11023f || this.f11024g) {
                mo1820e();
            } else {
                mo1806a();
            }
        }
    }

    protected void mo1806a() {
        ba.m4609b(Thread.holdsLock(f11021q));
        this.f11033w.m16417a(mo1816l());
        this.f11033w.m16428a(this.f11032v);
        this.f11033w.m16427a(this.f11034x);
        this.f11033w.m16448e(true);
        this.f11033w.m16420a(this.f11035y.m16433b());
        this.f11033w.m16447e(this.f11028r.getResources().getColor(gwb.dU));
        Notification b = this.f11033w.m16433b();
        gw a = gw.m18748a(this.f11028r);
        b.defaults |= 4;
        if (f11020p) {
            String valueOf = String.valueOf(b);
            String valueOf2 = String.valueOf(mo1819d());
            new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Notifier.postNotification: ").append(valueOf).append(" [tag=]").append(valueOf2).append(" [id=]").append(mo1810f());
        }
        a.m18752a(mo1819d(), mo1810f(), b);
        mo1809c();
        this.f11024g = true;
        f11021q.remove(this);
    }

    protected void mo1817n() {
        synchronized (f11021q) {
            if (!this.f11023f) {
                f11021q.remove(this);
            }
            this.f11023f = true;
        }
    }

    protected int mo1821p() {
        return 3;
    }

    protected int m13330v() {
        return this.f11027j + 3;
    }

    protected int m13331w() {
        return this.f11027j + 2;
    }

    protected fvd mo1818o() {
        return fvd.MESSAGE;
    }

    protected String mo1814j() {
        return null;
    }

    protected String mo1819d() {
        if (mo1808b()) {
            return ecm.m13303c(this.f11028r, this.f11029s);
        }
        return ecm.m13298a(this.f11028r, this.f11029s, this.f11030t.m17807a());
    }

    protected void mo1809c() {
    }

    protected void mo1820e() {
    }

    protected void mo1807a(boolean z) {
        Object a;
        int i;
        String b = ((fuz) jyn.m25426a(this.f11028r, fuz.class)).m16292b(this.f11029s, mo1818o());
        Uri a2 = gku.m17905a(System.DEFAULT_NOTIFICATION_URI, mo1814j(), b, gld.m17942b(gwb.ix));
        this.f11027j = gks.m17891a(this.f11029s, mo1821p(), mo1810f(), this.f11030t != null ? this.f11030t.m17807a() : null);
        Intent h = mo1812h();
        if (h != null) {
            this.f11033w.m16435b(PendingIntent.getService(this.f11028r, this.f11027j + 1, h, 134217728));
        }
        if (this.f11030t != null) {
            a = this.f11030t.m17807a();
        } else {
            a = null;
        }
        if (!z) {
            if (!gld.m17937a(this.f11028r)) {
                Long l = (Long) f11017b.get(a);
                if (f11018c == 0) {
                    f11018c = gwb.m1492a(this.f11028r, "babel_notification_time_between_rings", 10) * 1000;
                }
                long b2 = glj.m17963b();
                long a3 = b2 - gwb.m1523a(l);
                if (l == null || a3 > ((long) f11018c)) {
                    f11017b.put(a, Long.valueOf(b2));
                } else {
                    this.f11033w.m16445d(true);
                }
            }
            this.f11033w.m16424a(a2);
            i = 4;
            if (mo1815k()) {
                i = 6;
            }
            this.f11033w.m16439c(i);
        }
        fx fxVar = this.f11033w;
        Intent i2 = mo1813i();
        i2.addFlags(67108864);
        giv.m17744a("prepareNotification notification", i2);
        hq b3 = hq.m20483a(this.f11028r).m20490b(i2);
        for (i = b3.m20485a() - 2; i >= 0; i--) {
            Intent a4 = b3.m20487a(i);
            if (f11016a.equals(a4.getComponent().getClassName())) {
                a4.setAction("com.google.android.apps.hangouts.phone.conversationlist");
                break;
            }
        }
        if (i2.hasExtra("account_id")) {
            int intExtra = i2.getIntExtra("account_id", -1);
            for (i = 0; i < b3.m20485a(); i++) {
                b3.m20487a(i).putExtra("account_id", intExtra);
            }
        }
        fxVar.m16421a(b3.m20486a(this.f11027j, VERSION.SDK_INT < 19 ? 268435456 : 134217728));
        this.f11033w.m16444d(mo1811g());
        if (fde.m15022f().length > 1) {
            CharSequence c = ((bbm) jyn.m25426a(this.f11028r, bbm.class)).mo443c(this.f11029s);
            if (this.f11032v instanceof fw) {
                ((fw) this.f11032v).m16351a(c);
            } else if (this.f11032v instanceof ga) {
                ((ga) this.f11032v).m16797a(c);
            }
        }
        if (!this.f11031u.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArray("android.people", (String[]) this.f11031u.toArray(new String[this.f11031u.size()]));
            this.f11033w.m16425a(bundle);
        }
        if (eao.m13368a(this.f11028r)) {
            if (f11019d == null) {
                f11019d = BitmapFactory.decodeResource(this.f11028r.getResources(), R$drawable.cy);
            }
            this.f11034x.m18068a(f11019d);
        }
        if ((!this.f11025h.isEmpty() || this.f11030t.size() == 1) && !this.f11026i.isEmpty()) {
            bkf bkf = (bkf) this.f11026i.get(0);
            if (!bkf.m5596d()) {
                bjy bjy;
                frj a5;
                boolean z2;
                fsi fsi;
                int a6;
                int i3;
                ArrayList f = bkf.m5599f();
                List linkedList = new LinkedList();
                f = f;
                int size = f.size();
                int i4 = 0;
                while (i4 < size) {
                    a = f.get(i4);
                    i4++;
                    edk edk = (edk) a;
                    if (edk.f11219h == null) {
                        linkedList.add(edk.f11216e);
                    }
                }
                int e = bkf.m5597e() - this.f11025h.size();
                List list = this.f11025h;
                String b4 = ((jcf) jyn.m25426a(this.f11028r, jcf.class)).mo3456a(this.f11029s).mo3440b("account_name");
                size = ((boz) jyn.m25426a(this.f11028r, boz.class)).mo636a();
                bnq ecq = new ecq(this);
                if (!((fzw) jyn.m25426a(this.f11028r, fzw.class)).mo2155d()) {
                    if (m13326r()) {
                        bjy = bjy.GV;
                    } else if (m13325q()) {
                        bjy = bjy.CARRIER;
                    }
                    a5 = bjw.m5528a(list, e, linkedList, b4, size, null, ecq, this, null, true, bjy, false);
                    if (a5 != null) {
                        z2 = bkf.m5597e() <= 1 || VERSION.SDK_INT > 20;
                        a5.mo605a(z2);
                    }
                    fsi = (fsi) jyn.m25426a(this.f11028r, fsi.class);
                    fsi.m12718c(a5);
                    if (eao.m13368a(this.f11028r)) {
                        a6 = gwb.m1492a(this.f11028r, "babel_wear_notification_avatar_request_stress_test_count", 1);
                        for (i3 = 0; i3 < a6; i3++) {
                            list = this.f11025h;
                            b4 = ((jcf) jyn.m25426a(this.f11028r, jcf.class)).mo3456a(this.f11029s).mo3440b("account_name");
                            if (blc.f3678c == 0) {
                                blc.f3678c = gwb.m1400H().getResources().getDimensionPixelSize(gwb.fw);
                            }
                            a5 = bjw.m5528a(list, e, linkedList, b4, blc.f3678c, null, new ecr(this), this, null, true, bjy.NONE, false);
                            if (a5 == null) {
                                a5.mo605a(bkf.m5597e() <= 1);
                            }
                            fsi.m12718c(a5);
                        }
                    }
                }
                bjy = bjy.NONE;
                a5 = bjw.m5528a(list, e, linkedList, b4, size, null, ecq, this, null, true, bjy, false);
                if (a5 != null) {
                    if (bkf.m5597e() <= 1) {
                    }
                    a5.mo605a(z2);
                }
                fsi = (fsi) jyn.m25426a(this.f11028r, fsi.class);
                fsi.m12718c(a5);
                if (eao.m13368a(this.f11028r)) {
                    a6 = gwb.m1492a(this.f11028r, "babel_wear_notification_avatar_request_stress_test_count", 1);
                    for (i3 = 0; i3 < a6; i3++) {
                        list = this.f11025h;
                        b4 = ((jcf) jyn.m25426a(this.f11028r, jcf.class)).mo3456a(this.f11029s).mo3440b("account_name");
                        if (blc.f3678c == 0) {
                            blc.f3678c = gwb.m1400H().getResources().getDimensionPixelSize(gwb.fw);
                        }
                        a5 = bjw.m5528a(list, e, linkedList, b4, blc.f3678c, null, new ecr(this), this, null, true, bjy.NONE, false);
                        if (a5 == null) {
                            if (bkf.m5597e() <= 1) {
                            }
                            a5.mo605a(bkf.m5597e() <= 1);
                        }
                        fsi.m12718c(a5);
                    }
                }
            }
        }
        this.f11022e = true;
        m13328t();
        if (fdq.f12765G.m14370b(this.f11029s)) {
            new Thread(new ecn(this)).start();
        } else {
            new Handler().postDelayed(new eco(this), 2000);
        }
    }

    protected final PendingIntent m13327s() {
        int a;
        Intent i = mo1813i();
        i.addFlags(67108864);
        giv.m17744a("prepareNotification notification", i);
        hq b = hq.m20483a(this.f11028r).m20490b(i);
        for (a = b.m20485a() - 2; a >= 0; a--) {
            Intent a2 = b.m20487a(a);
            if (f11016a.equals(a2.getComponent().getClassName())) {
                a2.setAction("com.google.android.apps.hangouts.phone.conversationlist");
                break;
            }
        }
        if (i.hasExtra("account_id")) {
            int intExtra = i.getIntExtra("account_id", -1);
            for (a = 0; a < b.m20485a(); a++) {
                b.m20487a(a).putExtra("account_id", intExtra);
            }
        }
        return b.m20486a(this.f11027j, VERSION.SDK_INT < 19 ? 268435456 : 134217728);
    }
}
