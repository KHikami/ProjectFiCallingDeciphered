package defpackage;

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
    private static final String a = BabelHomeActivity.class.getName();
    private static final Map<String, Long> b = new ky();
    private static int c;
    private static Bitmap d;
    public static final boolean p = false;
    public static final Set<ecm> q = new HashSet();
    private boolean e;
    private boolean f;
    private boolean g;
    private List<String> h = new ArrayList();
    private List<bkf> i = new LinkedList();
    private int j;
    public final Context r;
    public final int s;
    public final gjj t;
    public final Set<String> u = new HashSet();
    public gl v;
    public fx w;
    public gm x = new gm();
    public fx y;
    public final Set<ecp> z = new HashSet();

    protected abstract boolean b();

    protected abstract int f();

    protected abstract int g();

    protected abstract Intent h();

    protected abstract Intent i();

    protected abstract boolean k();

    protected abstract int l();

    static {
        kae kae = glk.o;
    }

    protected boolean q() {
        return o() == fvd.LOCAL_SMS;
    }

    protected boolean r() {
        return o() == fvd.GV_SMS;
    }

    protected void b(String str) {
        a(str);
        if (!this.i.isEmpty()) {
            for (edk edk : ((bkf) this.i.get(0)).b()) {
                if (!TextUtils.isEmpty(edk.h)) {
                    this.h.add(edk.h);
                }
            }
        }
    }

    protected void c(String str) {
        a(str);
        for (bkf b : this.i) {
            this.u.addAll(gwb.a(this.r, this.s, b.b()));
        }
    }

    private void a(String str) {
        for (bkf a : this.i) {
            if (TextUtils.equals(str, a.a())) {
                return;
            }
        }
        List<bls> ac = new blo(this.r, this.s).ac(str);
        this.i.clear();
        for (bls bls : ac) {
            bkf c = bkf.c(fde.e(this.s), bls.s);
            if (gwb.j(bls.c)) {
                this.i.add(0, c);
            } else {
                this.i.add(c);
            }
        }
    }

    protected static void a(String str, int i) {
        List arrayList = new ArrayList();
        synchronized (q) {
            for (ecm ecm : q) {
                if (str.equals(ecm.d()) && ecm.f() == i) {
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
            ((ecm) obj).n();
        }
    }

    protected static hg a(Context context) {
        return new hh("android.intent.extra.TEXT").a(context.getString(bc.hs)).a(gwb.b(context.getResources().getStringArray(gwb.dw))).a();
    }

    protected static String c(Context context, int i) {
        String valueOf = String.valueOf(context.getPackageName());
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(":").append(i).toString();
    }

    protected static String a(Context context, int i, String str) {
        String valueOf = String.valueOf(context.getPackageName());
        return new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(str).length()).append(valueOf).append(":").append(i).append(":").append(str).toString();
    }

    protected static String b(Context context, int i, String str, String str2) {
        String valueOf = String.valueOf(context.getPackageName());
        return new StringBuilder(((String.valueOf(valueOf).length() + 14) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(":").append(i).append(":").append(str).append(":").append(str2).toString();
    }

    protected CharSequence b(String str, CharSequence charSequence, String str2, int i) {
        return a(str, charSequence, null, 0, bc.hB);
    }

    protected CharSequence c(String str, CharSequence charSequence, String str2, int i) {
        return a(str, charSequence, str2, i, bc.hA);
    }

    private CharSequence a(String str, CharSequence charSequence, String str2, int i, int i2) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(this.r.getString(i2));
            }
            spannableStringBuilder.append(charSequence);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(this.r.getString(bc.hz));
            }
            spannableStringBuilder.append(a(i));
        }
        return spannableStringBuilder;
    }

    protected CharSequence a(int i) {
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this.r, gwb.iB);
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
        spannableStringBuilder.append(this.r.getText(i2));
        spannableStringBuilder.setSpan(textAppearanceSpan, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    protected ecm(Context context, int i, gjj gjj) {
        this.r = context;
        this.s = i;
        this.t = gjj;
        this.w = new fx(context);
        this.y = new fx(context);
        this.y.a(l());
        this.y.a(context.getString(bc.o));
        this.y.b(context.getString(bc.jP));
    }

    protected static void a(ecm ecm) {
        ecm.a(ecm.d(), ecm.f());
        q.add(ecm);
    }

    void t() {
        synchronized (this.z) {
            if (this.z.isEmpty()) {
                u();
            }
        }
    }

    void u() {
        synchronized (q) {
            if (!this.e || this.f || this.g) {
                e();
            } else {
                a();
            }
        }
    }

    protected void a() {
        ba.b(Thread.holdsLock(q));
        this.w.a(l());
        this.w.a(this.v);
        this.w.a(this.x);
        this.w.e(true);
        this.w.a(this.y.b());
        this.w.e(this.r.getResources().getColor(gwb.dU));
        Notification b = this.w.b();
        gw a = gw.a(this.r);
        b.defaults |= 4;
        if (p) {
            String valueOf = String.valueOf(b);
            String valueOf2 = String.valueOf(d());
            new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Notifier.postNotification: ").append(valueOf).append(" [tag=]").append(valueOf2).append(" [id=]").append(f());
        }
        a.a(d(), f(), b);
        c();
        this.g = true;
        q.remove(this);
    }

    protected void n() {
        synchronized (q) {
            if (!this.f) {
                q.remove(this);
            }
            this.f = true;
        }
    }

    protected int p() {
        return 3;
    }

    protected int v() {
        return this.j + 3;
    }

    protected int w() {
        return this.j + 2;
    }

    protected fvd o() {
        return fvd.MESSAGE;
    }

    protected String j() {
        return null;
    }

    protected String d() {
        if (b()) {
            return ecm.c(this.r, this.s);
        }
        return ecm.a(this.r, this.s, this.t.a());
    }

    protected void c() {
    }

    protected void e() {
    }

    protected void a(boolean z) {
        Object a;
        int i;
        String b = ((fuz) jyn.a(this.r, fuz.class)).b(this.s, o());
        Uri a2 = gku.a(System.DEFAULT_NOTIFICATION_URI, j(), b, gld.b(gwb.ix));
        this.j = gks.a(this.s, p(), f(), this.t != null ? this.t.a() : null);
        Intent h = h();
        if (h != null) {
            this.w.b(PendingIntent.getService(this.r, this.j + 1, h, 134217728));
        }
        if (this.t != null) {
            a = this.t.a();
        } else {
            a = null;
        }
        if (!z) {
            if (!gld.a(this.r)) {
                Long l = (Long) b.get(a);
                if (c == 0) {
                    c = gwb.a(this.r, "babel_notification_time_between_rings", 10) * 1000;
                }
                long b2 = glj.b();
                long a3 = b2 - gwb.a(l);
                if (l == null || a3 > ((long) c)) {
                    b.put(a, Long.valueOf(b2));
                } else {
                    this.w.d(true);
                }
            }
            this.w.a(a2);
            i = 4;
            if (k()) {
                i = 6;
            }
            this.w.c(i);
        }
        fx fxVar = this.w;
        Intent i2 = i();
        i2.addFlags(67108864);
        giv.a("prepareNotification notification", i2);
        hq b3 = hq.a(this.r).b(i2);
        for (i = b3.a() - 2; i >= 0; i--) {
            Intent a4 = b3.a(i);
            if (a.equals(a4.getComponent().getClassName())) {
                a4.setAction("com.google.android.apps.hangouts.phone.conversationlist");
                break;
            }
        }
        if (i2.hasExtra("account_id")) {
            int intExtra = i2.getIntExtra("account_id", -1);
            for (i = 0; i < b3.a(); i++) {
                b3.a(i).putExtra("account_id", intExtra);
            }
        }
        fxVar.a(b3.a(this.j, VERSION.SDK_INT < 19 ? 268435456 : 134217728));
        this.w.d(g());
        if (fde.f().length > 1) {
            CharSequence c = ((bbm) jyn.a(this.r, bbm.class)).c(this.s);
            if (this.v instanceof fw) {
                ((fw) this.v).a(c);
            } else if (this.v instanceof ga) {
                ((ga) this.v).a(c);
            }
        }
        if (!this.u.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArray("android.people", (String[]) this.u.toArray(new String[this.u.size()]));
            this.w.a(bundle);
        }
        if (eao.a(this.r)) {
            if (d == null) {
                d = BitmapFactory.decodeResource(this.r.getResources(), R$drawable.cy);
            }
            this.x.a(d);
        }
        if ((!this.h.isEmpty() || this.t.size() == 1) && !this.i.isEmpty()) {
            bkf bkf = (bkf) this.i.get(0);
            if (!bkf.d()) {
                bjy bjy;
                frj a5;
                boolean z2;
                fsi fsi;
                int a6;
                int i3;
                ArrayList f = bkf.f();
                List linkedList = new LinkedList();
                f = f;
                int size = f.size();
                int i4 = 0;
                while (i4 < size) {
                    a = f.get(i4);
                    i4++;
                    edk edk = (edk) a;
                    if (edk.h == null) {
                        linkedList.add(edk.e);
                    }
                }
                int e = bkf.e() - this.h.size();
                List list = this.h;
                String b4 = ((jcf) jyn.a(this.r, jcf.class)).a(this.s).b("account_name");
                size = ((boz) jyn.a(this.r, boz.class)).a();
                bnq ecq = new ecq(this);
                if (!((fzw) jyn.a(this.r, fzw.class)).d()) {
                    if (r()) {
                        bjy = bjy.GV;
                    } else if (q()) {
                        bjy = bjy.CARRIER;
                    }
                    a5 = bjw.a(list, e, linkedList, b4, size, null, ecq, this, null, true, bjy, false);
                    if (a5 != null) {
                        z2 = bkf.e() <= 1 || VERSION.SDK_INT > 20;
                        a5.a(z2);
                    }
                    fsi = (fsi) jyn.a(this.r, fsi.class);
                    fsi.c(a5);
                    if (eao.a(this.r)) {
                        a6 = gwb.a(this.r, "babel_wear_notification_avatar_request_stress_test_count", 1);
                        for (i3 = 0; i3 < a6; i3++) {
                            list = this.h;
                            b4 = ((jcf) jyn.a(this.r, jcf.class)).a(this.s).b("account_name");
                            if (blc.c == 0) {
                                blc.c = gwb.H().getResources().getDimensionPixelSize(gwb.fw);
                            }
                            a5 = bjw.a(list, e, linkedList, b4, blc.c, null, new ecr(this), this, null, true, bjy.NONE, false);
                            if (a5 == null) {
                                a5.a(bkf.e() <= 1);
                            }
                            fsi.c(a5);
                        }
                    }
                }
                bjy = bjy.NONE;
                a5 = bjw.a(list, e, linkedList, b4, size, null, ecq, this, null, true, bjy, false);
                if (a5 != null) {
                    if (bkf.e() <= 1) {
                    }
                    a5.a(z2);
                }
                fsi = (fsi) jyn.a(this.r, fsi.class);
                fsi.c(a5);
                if (eao.a(this.r)) {
                    a6 = gwb.a(this.r, "babel_wear_notification_avatar_request_stress_test_count", 1);
                    for (i3 = 0; i3 < a6; i3++) {
                        list = this.h;
                        b4 = ((jcf) jyn.a(this.r, jcf.class)).a(this.s).b("account_name");
                        if (blc.c == 0) {
                            blc.c = gwb.H().getResources().getDimensionPixelSize(gwb.fw);
                        }
                        a5 = bjw.a(list, e, linkedList, b4, blc.c, null, new ecr(this), this, null, true, bjy.NONE, false);
                        if (a5 == null) {
                            if (bkf.e() <= 1) {
                            }
                            a5.a(bkf.e() <= 1);
                        }
                        fsi.c(a5);
                    }
                }
            }
        }
        this.e = true;
        t();
        if (fdq.G.b(this.s)) {
            new Thread(new ecn(this)).start();
        } else {
            new Handler().postDelayed(new eco(this), 2000);
        }
    }

    protected final PendingIntent s() {
        int a;
        Intent i = i();
        i.addFlags(67108864);
        giv.a("prepareNotification notification", i);
        hq b = hq.a(this.r).b(i);
        for (a = b.a() - 2; a >= 0; a--) {
            Intent a2 = b.a(a);
            if (a.equals(a2.getComponent().getClassName())) {
                a2.setAction("com.google.android.apps.hangouts.phone.conversationlist");
                break;
            }
        }
        if (i.hasExtra("account_id")) {
            int intExtra = i.getIntExtra("account_id", -1);
            for (a = 0; a < b.a(); a++) {
                b.a(a).putExtra("account_id", intExtra);
            }
        }
        return b.a(this.j, VERSION.SDK_INT < 19 ? 268435456 : 134217728);
    }
}
