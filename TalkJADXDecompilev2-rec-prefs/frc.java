package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class frc implements bhd, bhf, bhh, bhj, bhm {
    private final bhr f13805a;

    public frc() {
        this.f13805a = new bhs().m5267a();
    }

    public frc(long j) {
        this.f13805a = new bhs().m5272d(j).m5267a();
    }

    public bhr mo540a() {
        return this.f13805a;
    }

    public void mo541a(Context context) {
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }

    public bhu mo544d() {
        return new bhv().m5278b(true).m5279c(true).m5276a();
    }

    public String mo542b() {
        return "DB_CLEANUP";
    }

    public int mo539a(Context context, bhb bhb) {
        fqq fqq = (fqq) jyn.m25426a(context, fqq.class);
        if (fqq.mo2065a(context)) {
            fqq.mo2064a(context, TimeUnit.MINUTES.toMillis((long) gwb.m1492a(context, "babel_gc_interval", 1440)));
        } else {
            fqq.mo2064a(context, TimeUnit.MINUTES.toMillis((long) gwb.m1492a(context, "babel_gc_next_start", 60)));
        }
        return bhn.f3348a;
    }

    static bhc m16028f() {
        return new bhc("DB_CLEANUP");
    }

    public List<bhc> mo1983e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(frc.m16028f());
        return arrayList;
    }

    public void mo1981b(Context context) {
    }

    public void mo1982c(Context context) {
    }
}
