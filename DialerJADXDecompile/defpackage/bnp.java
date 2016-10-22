package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: bnp */
public class bnp {
    private static bnp i;
    public final Context a;
    final Context b;
    public final bwa c;
    final bom d;
    final bot e;
    final boo f;
    final box g;
    public final bon h;
    private final cqn j;
    private final bni k;
    private final bpa l;
    private final bmo m;
    private final boh n;
    private final bnh o;
    private final boa p;

    private bnp(bnr bnr) {
        boolean z;
        Context context = bnr.a;
        buf.d((Object) context, (Object) "Application context can't be null");
        buf.b(context instanceof Application, (Object) "getApplicationContext didn't return the application");
        Object obj = bnr.b;
        buf.A(obj);
        this.a = context;
        this.b = obj;
        this.c = bwb.c();
        this.d = new bom(this);
        bot bot = new bot(this);
        bot.p();
        this.e = bot;
        if (btq.a) {
            a().d("Google Analytics " + bpc.a + " is starting up.");
        } else {
            a().d("Google Analytics " + bpc.a + " is starting up. To enable debug logging on a device run:\n" + "  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        }
        box box = new box(this);
        box.p();
        this.g = box;
        bpa bpa = new bpa(this);
        bpa.p();
        this.l = bpa;
        bni bni = new bni(this, bnr);
        boh boh = new boh(this);
        bnh bnh = new bnh(this);
        boa boa = new boa(this);
        bon bon = new bon(this);
        cqn a = cqn.a(context);
        a.d = new bnq(this);
        this.j = a;
        bmb bmo = new bmo(this);
        boh.p();
        this.n = boh;
        bnh.p();
        this.o = bnh;
        boa.p();
        this.p = boa;
        bon.p();
        this.h = bon;
        boo boo = new boo(this);
        boo.p();
        this.f = boo;
        bni.p();
        this.k = bni;
        if (btq.a) {
            a().b("Device AnalyticsService version", bpc.a);
        }
        bpa e = bmo.a.e();
        e.o();
        e.o();
        if (e.c) {
            e.o();
            bmo.f = e.d;
        }
        e.o();
        bmo.c = true;
        this.m = bmo;
        bno bno = bni.a;
        bno.o();
        if (bno.a) {
            z = false;
        } else {
            z = true;
        }
        buf.a(z, (Object) "Analytics backend already started");
        bno.a = true;
        if (!btq.a) {
            context = bno.f.a;
            if (!bmc.a(context)) {
                bno.e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
            } else if (!bmd.a(context)) {
                bno.f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
            }
            if (!bmh.a(context)) {
                bno.e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
            } else if (!bmi.a(context)) {
                bno.e("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
            }
        }
        bno.f.b().a(new boe(bno));
    }

    public static bnp a(Context context) {
        buf.A((Object) context);
        if (i == null) {
            synchronized (bnp.class) {
                if (i == null) {
                    bwa c = bwb.c();
                    long b = c.b();
                    bnp bnp = new bnp(new bnr(context.getApplicationContext()));
                    i = bnp;
                    bmo.a();
                    b = c.b() - b;
                    long longValue = ((Long) boq.E.a()).longValue();
                    if (b > longValue) {
                        bnp.a().c("Slow initialization (ms)", Long.valueOf(b), Long.valueOf(longValue));
                    }
                }
            }
        }
        return i;
    }

    static void a(bpb bpb) {
        buf.d((Object) bpb, (Object) "Analytics service not created/initialized");
        buf.b(bpb.n(), (Object) "Analytics service not initialized");
    }

    public final bot a() {
        bnp.a(this.e);
        return this.e;
    }

    public final cqn b() {
        buf.A(this.j);
        return this.j;
    }

    public final bni c() {
        bnp.a(this.k);
        return this.k;
    }

    public final bmo d() {
        buf.A(this.m);
        buf.b(this.m.c, (Object) "Analytics instance not initialized");
        return this.m;
    }

    public final bpa e() {
        bnp.a(this.l);
        return this.l;
    }

    public final bnh f() {
        bnp.a(this.o);
        return this.o;
    }

    public final boh g() {
        bnp.a(this.n);
        return this.n;
    }

    public final boa h() {
        bnp.a(this.p);
        return this.p;
    }
}
