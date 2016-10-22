package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ffb */
public class ffb implements bhd, bhf, bhi, bhj, bhm {
    private final bhr a;
    private final List<bhc> b;

    public static bhc f() {
        String str = "cancel_";
        String valueOf = String.valueOf(ffb.class.getName());
        return new bhc(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public ffb() {
        this.a = new bhs().d(0).a();
        this.b = new ArrayList();
        this.b.add(ffb.f());
    }

    public bhr a() {
        return this.a;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public String b() {
        return getClass().getName();
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }

    public int a(Context context, bhb bhb) {
        if (!((bcr) jyn.a(context, bcr.class)).b()) {
            return bhn.c;
        }
        RealTimeChatService.a(flt.FOREGROUND_SYNC);
        this.a.a(gwb.a(context, "babel_foreground_periodic_warm_sync_interval_ms", fls.c));
        return bhn.b;
    }

    public List<bhc> e() {
        return this.b;
    }

    public void b(Context context) {
    }

    public void c(Context context) {
    }
}
