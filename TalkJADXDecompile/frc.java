import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class frc implements bhd, bhf, bhh, bhj, bhm {
    private final bhr a;

    public frc() {
        this.a = new bhs().a();
    }

    public frc(long j) {
        this.a = new bhs().d(j).a();
    }

    public bhr a() {
        return this.a;
    }

    public void a(Context context) {
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }

    public bhu d() {
        return new bhv().b(true).c(true).a();
    }

    public String b() {
        return "DB_CLEANUP";
    }

    public int a(Context context, bhb bhb) {
        fqq fqq = (fqq) jyn.a(context, fqq.class);
        if (fqq.a(context)) {
            fqq.a(context, TimeUnit.MINUTES.toMillis((long) gwb.a(context, "babel_gc_interval", 1440)));
        } else {
            fqq.a(context, TimeUnit.MINUTES.toMillis((long) gwb.a(context, "babel_gc_next_start", 60)));
        }
        return bhn.a;
    }

    static bhc f() {
        return new bhc("DB_CLEANUP");
    }

    public List<bhc> e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(f());
        return arrayList;
    }

    public void b(Context context) {
    }

    public void c(Context context) {
    }
}
