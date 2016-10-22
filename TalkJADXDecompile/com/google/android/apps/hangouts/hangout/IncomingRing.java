package com.google.android.apps.hangouts.hangout;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Vibrator;
import android.text.TextUtils;
import bc;
import bjw;
import bjy;
import bke;
import bkk;
import bko;
import blc;
import bls;
import bnn;
import bnq;
import bol;
import boz;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dhz;
import dit;
import diu;
import div;
import diw;
import dlh;
import dui;
import duj;
import ect;
import edk;
import edo;
import fde;
import fdv;
import fqu;
import fqy;
import frj;
import fsi;
import fuz;
import fx;
import gjo;
import gki;
import gks;
import gkt;
import glj;
import glk;
import glq;
import gm;
import gwb;
import ia;
import iil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jyn;
import mbr;

public final class IncomingRing implements bnq, dui, fqy {
    public static final long[] a;
    public static IncomingRing b;
    private static String h;
    private final ArrayList<diw> A;
    private final Handler B;
    private final String C;
    private final edk D;
    private Bitmap E;
    private final Runnable F;
    private final WakeLock G;
    public final bko c;
    public Vibrator d;
    public final gki e;
    public boolean f;
    public boolean g;
    private final Context i;
    private final dhz j;
    private final String k;
    private final long l;
    private final long m;
    private final long n;
    private String o;
    private final String p;
    private String q;
    private final NotificationManager r;
    private fx s;
    private List<edo> t;
    private final String[] u;
    private int v;
    private int w;
    private final List<String> x;
    private String y;
    private int z;

    public class NotificationActionReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            String str = "NotificationActionReceiver ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            if (IncomingRing.b == null) {
                action = intent.getStringExtra("hangout_incoming_notification_tag");
                if (!TextUtils.isEmpty(action)) {
                    IncomingRing.a(action);
                    IncomingRing.o();
                }
            } else if ("com.google.android.apps.hangouts.hangout.ignore".equals(action)) {
                IncomingRing.b.l();
            }
        }
    }

    static {
        a = new long[]{1000, 1000, 1000, 1000, 1000, 1000};
    }

    private static void a(bko bko, IncomingRing incomingRing) {
        glk.a("Babel_IncomingRing", "Set active ring %s, old ring %s", incomingRing, b);
        b = incomingRing;
        ((ect) jyn.a(gwb.H(), ect.class)).b(bko.g(), true);
        ((ect) jyn.a(gwb.H(), ect.class)).c(bko.g(), true);
    }

    public static void a(Context context, long j, dhz dhz, String str, String str2, String str3, String str4, String str5) {
        glk.a("Babel_IncomingRing", "startRing", new Object[0]);
        new IncomingRing(context, j, dhz, str, str2, str3, str4, str5).p();
    }

    private IncomingRing(Context context, long j, dhz dhz, String str, String str2, String str3, String str4, String str5) {
        edk edk;
        this.u = new String[3];
        this.x = new ArrayList(4);
        this.A = new ArrayList();
        this.B = new Handler();
        this.e = new gki("Babel_IncomingRing");
        this.F = new dit(this);
        this.i = context;
        this.j = dhz;
        this.k = str;
        this.p = str2;
        this.C = str3;
        this.l = j;
        this.n = glj.b();
        this.m = glj.a();
        this.o = str4;
        this.g = this.j.l() == 2;
        this.c = fde.a(this.j.a());
        this.r = (NotificationManager) context.getSystemService("notification");
        if (TextUtils.isEmpty(str5)) {
            edk = null;
        } else {
            edk = gwb.a(gwb.H(), str3, str5, false, null, null, 0);
        }
        this.D = edk;
        this.G = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "Babel_IncomingRing");
        ((dlh) jyn.a(gwb.H(), dlh.class)).a(dhz);
    }

    private void p() {
        int i;
        glk.a("Babel_IncomingRing", "start", new Object[0]);
        if (this.p != null) {
            ((duj) jyn.a(this.i, duj.class)).a(this.c.g()).a(new bkk(this.p, this));
        }
        if (g()) {
            fqu.a(this.C, true, this.c, this);
        } else {
            fqu.a(edo.a(this.k), this.c, this);
        }
        if (!this.G.isHeld()) {
            this.G.acquire();
            glk.c("Babel_IncomingRing", "Acquired partial wake lock to keep process alive for IncomingRing", new Object[0]);
        }
        Resources resources = this.i.getResources();
        Context H = gwb.H();
        int a = gks.a(this.c.g(), 3, 3, this.j.e());
        int i2 = a + 1;
        int i3 = a + 2;
        PendingIntent activity = PendingIntent.getActivity(H, a, gwb.a(d(), s(), glj.b()), 134217728);
        PendingIntent broadcast = PendingIntent.getBroadcast(H, i2, gwb.v(h), 134217728);
        PendingIntent activity2 = PendingIntent.getActivity(H, i3, gwb.C(), 134217728);
        fx a2 = new fx(H).a(glj.a());
        if (this.g || g()) {
            i = R$drawable.cu;
        } else {
            i = R$drawable.cq;
        }
        this.s = a2.a(i).c(4).e(false).d(2).a(activity2).a(R$drawable.aI, resources.getString(bc.fj), broadcast).a(R$drawable.aL, resources.getString(bc.fi), activity).a(new gm().a(-1));
        if (((fuz) jyn.a(gwb.H(), fuz.class)).c(this.c.g())) {
            this.s.a(a);
        }
        this.s.a(activity2, true);
        t();
        this.f = false;
        glk.a("Babel_IncomingRing", "playRingtone", new Object[0]);
        new diu(this, ((AudioManager) this.i.getSystemService("audio")).getRingerMode() == 0).b(new Void[0]);
        a(this.c, this);
        this.B.postDelayed(this.F, 35000);
        ((dlh) jyn.a(gwb.H(), dlh.class)).a(d());
    }

    public void a(bls bls) {
        glk.a("Babel_IncomingRing", "setConversationInfo", new Object[0]);
        edo b = this.c.b();
        this.t = new ArrayList(bls.h.size());
        for (edk edk : bls.h) {
            edo edo = edk.b;
            if (!(b.a(edo) || this.k.equals(edo.a))) {
                if (this.v < 3) {
                    fqu.a(edo, this.c, this);
                    this.v++;
                }
                this.t.add(edo);
            }
        }
        this.q = bls.d;
        t();
    }

    public void a(bkk bkk) {
        glk.d("Babel_IncomingRing", "Conversation load failed for id=%s", bkk.c());
    }

    public void a(String str, String str2, int i, bol bol, bko bko) {
        a(str, str2, (bke) bol, null, bko);
    }

    public void a(bke bke) {
        glk.d("Babel_IncomingRing", "Get contact info failed for %s", bke.c());
    }

    private String c(Resources resources) {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        if (TextUtils.isEmpty(this.o)) {
            if (g()) {
                return glq.i(gwb.H(), this.C);
            }
            if (r()) {
                return resources.getString(bc.df);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(this.o);
        String string = resources.getString(bc.cB);
        for (int i = 0; i < this.w; i++) {
            stringBuilder.append(string).append(this.u[i]);
        }
        return stringBuilder.toString();
    }

    private CharSequence d(Resources resources) {
        if (g()) {
            return resources.getString(bc.ug);
        }
        int i;
        if (TextUtils.isEmpty(this.q) || TextUtils.isEmpty(this.o)) {
            if (this.g) {
                i = bc.up;
            } else {
                i = bc.ed;
            }
            return resources.getString(i);
        }
        if (this.g) {
            i = bc.uq;
        } else {
            i = bc.eP;
        }
        return resources.getString(i, new Object[]{this.o});
    }

    String a(Resources resources) {
        int i;
        if (g()) {
            String i2;
            i = bc.ea;
            Object[] objArr = new Object[1];
            if (this.o == null) {
                i2 = glq.i(gwb.H(), this.C);
            } else {
                i2 = this.o;
            }
            objArr[0] = i2;
            return resources.getString(i, objArr);
        } else if (TextUtils.isEmpty(this.q)) {
            if (this.o == null) {
                if (this.g) {
                    r0 = bc.um;
                } else {
                    r0 = bc.dZ;
                }
                return resources.getString(r0);
            }
            i = this.t == null ? 0 : this.t.size();
            if (i == 0) {
                if (this.g) {
                    r0 = bc.un;
                } else {
                    r0 = bc.eb;
                }
                return resources.getString(r0, new Object[]{this.o});
            } else if (this.w < i) {
                if (this.g) {
                    r0 = gwb.in;
                } else {
                    r0 = gwb.hY;
                }
                return resources.getQuantityString(r0, i, new Object[]{Integer.valueOf(i), this.o});
            } else if (i > 2) {
                if (this.g) {
                    r0 = gwb.im;
                } else {
                    r0 = gwb.hX;
                }
                return resources.getQuantityString(r0, i - 1, new Object[]{Integer.valueOf(i - 1), this.o, this.u[0]});
            } else if (i == 1) {
                if (this.g) {
                    r0 = bc.uj;
                } else {
                    r0 = bc.dW;
                }
                return resources.getString(r0, new Object[]{this.o, this.u[0]});
            } else {
                if (this.g) {
                    r0 = bc.uo;
                } else {
                    r0 = bc.ec;
                }
                return resources.getString(r0, new Object[]{this.o, this.u[0], this.u[1]});
            }
        } else if (this.o == null) {
            if (this.g) {
                r0 = bc.ul;
            } else {
                r0 = bc.dY;
            }
            return resources.getString(r0, new Object[]{this.q});
        } else {
            if (this.g) {
                r0 = bc.uk;
            } else {
                r0 = bc.dX;
            }
            return resources.getString(r0, new Object[]{this.q, this.o});
        }
    }

    String a() {
        if (!g() || this.o == null) {
            return null;
        }
        return glq.i(gwb.H(), this.C);
    }

    String b(Resources resources) {
        return resources.getString(bc.dV, new Object[]{this.c.a()});
    }

    void a(diw diw) {
        this.A.add(diw);
    }

    void b(diw diw) {
        this.A.remove(diw);
    }

    void a(boolean z) {
        glk.a("Babel_IncomingRing", "silence", new Object[0]);
        this.e.a(z);
        if (this.d != null) {
            glk.a("Babel_IncomingRing", "cancel vibration", new Object[0]);
            this.d.cancel();
        }
    }

    private void q() {
        CharSequence i;
        boolean z = false;
        glk.a("Babel_IncomingRing", "notifyMissedPstnCall", new Object[0]);
        if (g() || r()) {
            z = true;
        }
        iil.a("Expected condition to be true", z);
        Resources resources = this.i.getResources();
        fx a = new fx(this.i).a(glj.a()).e(true).c(resources.getString(bc.uh)).a(R$drawable.cs).c(4).d(2).a(this.E != null ? this.E : blc.i()).a(PendingIntent.getActivity(gwb.H(), gks.a(this.c.g(), 1, 2, null), gwb.m(this.c), 134217728)).a(resources.getString(bc.uh));
        if (TextUtils.isEmpty(this.o)) {
            i = glq.i(gwb.H(), this.C);
        } else {
            i = this.o;
        }
        Notification b = a.b(i).b();
        NotificationManager notificationManager = this.r;
        String valueOf = String.valueOf(this.i.getPackageName());
        notificationManager.notify(new StringBuilder(String.valueOf(valueOf).length() + 37).append(valueOf).append(":missed_pstn_notification:").append(this.c.g()).toString(), 2, b);
    }

    public void a(int i, int i2) {
        boolean z = i == 1 || i == 3;
        glk.a("Babel_IncomingRing", "stop", new Object[0]);
        gwb.aJ();
        if (this.f) {
            String str = b == this ? "same" : b == null ? "null" : "different";
            glk.d("Babel_IncomingRing", "Stop called twice. ActiveRing %s", str);
            return;
        }
        this.f = true;
        ((dlh) jyn.a(gwb.H(), dlh.class)).b(d());
        glk.a("Babel_IncomingRing", "sendRingTermination", new Object[0]);
        iil.a(i, 0, 3);
        iil.a(i2, 0, 9);
        mbr mbr = new mbr();
        mbr.a = Long.valueOf(this.l);
        mbr.b = d().g();
        mbr.c = Long.valueOf(this.m * 1000);
        mbr.d = Long.valueOf(glj.b() - this.n);
        mbr.e = Integer.valueOf(i2);
        mbr.f = Integer.valueOf(i);
        RealTimeChatService.a(this.c, mbr);
        if (g() || r()) {
            int i3;
            if (z) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            RealTimeChatService.a(this.c.g(), i3, new fdv(2, this.C, null, 0, null, null, null, 62));
            if (!(z || i2 == 0)) {
                q();
            }
            this.E = null;
        }
        this.r.cancel(h, 3);
        this.B.removeCallbacks(this.F);
        a(z);
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((diw) obj).a();
        }
        a(this.c, null);
        if (this.G.isHeld()) {
            this.G.release();
            glk.c("Babel_IncomingRing", "Released partial wake lock as IncomingRing processing has stopped.", new Object[0]);
        }
    }

    public bko b() {
        return this.c;
    }

    List<edo> c() {
        return this.t;
    }

    public dhz d() {
        return this.j;
    }

    String e() {
        return this.k;
    }

    String f() {
        return this.o;
    }

    public boolean g() {
        return this.C != null;
    }

    private boolean r() {
        return TextUtils.isEmpty(this.q) && TextUtils.isEmpty(this.o) && !g();
    }

    public boolean h() {
        return this.g;
    }

    private int s() {
        if (g()) {
            return 1;
        }
        return 2;
    }

    String i() {
        iil.a("Expected condition to be true", g());
        return this.C;
    }

    public String j() {
        Throwable th;
        Cursor cursor = null;
        if (this.p == null) {
            return null;
        }
        String[] strArr = new String[]{this.p};
        try {
            Cursor query = gwb.H().getContentResolver().query(EsProvider.a(EsProvider.i, this.c.g()), div.a, "conversation_id=?", strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(0);
                        if (query == null) {
                            return string;
                        }
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
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

    private void t() {
        CharSequence c = c(this.i.getResources());
        this.s.a(c).c(c).b(d(this.i.getResources())).e(ia.c(this.i, gwb.dU));
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((diw) obj).b();
        }
        u();
    }

    private void u() {
        Notification b = this.s.b();
        b.flags |= 4;
        this.r.notify(h, 3, b);
    }

    public void k() {
        v();
        gwb.H().startActivity(gwb.a(d(), false, this.D, true, true, 62, s(), glj.b()).addFlags(268435456));
    }

    public void l() {
        glk.a("Babel_IncomingRing", "ignoreHangout", new Object[0]);
        if (!TextUtils.isEmpty(this.p)) {
            ((ect) jyn.a(gwb.H(), ect.class)).b(this.c.g(), this.p);
        }
        a(2, 0);
    }

    public void m() {
        glk.a("Babel_IncomingRing", "cancelForServer ", new Object[0]);
        a(0, 5);
    }

    public void n() {
        glk.a("Babel_IncomingRing", "cancelForPhoneCall", new Object[0]);
        a(0, 1);
    }

    private void v() {
        glk.a("Babel_IncomingRing", "hangoutAccepted", new Object[0]);
        if (!TextUtils.isEmpty(this.p)) {
            ((ect) jyn.a(gwb.H(), ect.class)).b(this.c.g(), this.p);
        }
        ((dlh) jyn.a(gwb.H(), dlh.class)).a(d(), null, true, false, false, true);
        a(1, 0);
    }

    public static void a(Intent intent) {
        glk.a("Babel_IncomingRing", "stopRinging", new Object[0]);
        if (b != null && intent.getBooleanExtra("from_notification", false)) {
            b.v();
        }
    }

    static void a(String str) {
        h = str;
    }

    public static void b(String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(":hangouts_ring_notification");
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        h = valueOf2;
    }

    public void a(String str, String str2, bke bke, String str3, bko bko) {
        boolean equals;
        if (g()) {
            equals = this.C.equals(bke.d().d);
        } else {
            equals = this.k.equals(bke.d().a);
        }
        if (equals) {
            if (!(str == null || TextUtils.isEmpty(str))) {
                this.o = str;
            }
            this.x.add(0, str2);
        } else if (this.w < 3) {
            String[] strArr = this.u;
            int i = this.w;
            this.w = i + 1;
            strArr[i] = str3;
            this.x.add(str2);
        }
        if (this.x.size() != this.z) {
            int i2 = this.v + 1;
            if (this.x.size() <= 1 || this.x.size() == i2) {
                frj a = bjw.a(this.x, 0, Collections.emptyList(), this.c.a(), ((boz) jyn.a(this.i, boz.class)).a(), this.p, this, null, this.y, false, bjy.NONE, true);
                if (a != null) {
                    equals = this.x.size() > 1 || VERSION.SDK_INT > 20;
                    a.a(equals);
                    this.y = a.c();
                    ((fsi) jyn.a(gwb.H(), fsi.class)).a(a);
                    this.z = this.x.size();
                }
            }
        }
        t();
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        if (z) {
            Bitmap d = gkt.d();
            this.s.a(d);
            u();
            if (g()) {
                this.E = d;
            }
        }
    }

    public static void o() {
        iil.a("Expected null", b);
        ((NotificationManager) gwb.H().getSystemService("notification")).cancel(h, 3);
    }
}
