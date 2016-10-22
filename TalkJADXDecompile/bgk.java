import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class bgk implements bhf, bhj, bhm {
    private final int a;
    private final List<String> b;
    private blo c;
    private final bhk d;
    private final bhr e;

    bgk(int i, long j) {
        this.a = i;
        this.b = new ArrayList();
        this.d = bhk.USE_OLD;
        this.e = new bhs().d(j).a();
    }

    bgk(int i, long j, List<String> list) {
        this.a = i;
        this.b = list;
        this.d = bhk.REPLACE_OLD;
        this.e = new bhs().d(j).a();
    }

    public bhr a() {
        return this.e;
    }

    public void a(Context context) {
    }

    public String b() {
        return getClass().getName();
    }

    public bhk c() {
        return this.d;
    }

    public bhu d() {
        return new bhv().a();
    }

    public int a(Context context, bhb bhb) {
        if (this.c == null) {
            try {
                this.c = new blo(context, this.a);
            } catch (bmu e) {
                glk.a("Babel_CMTRLogTask", "AccountId is no longer valid: %d.", Integer.valueOf(this.a));
                return bhn.a;
            }
        }
        List v = this.c.v();
        iid a = ((iih) jyn.a(context, iih.class)).a(this.a);
        for (String contains : this.b) {
            if (!v.contains(contains)) {
                a.b().c(2925);
            }
        }
        if (!v.isEmpty() && this.b.isEmpty()) {
            glk.a("Babel_CMTRLogTask", "Found %d ongoing hangouts.", Integer.valueOf(v.size()));
            long a2 = gwb.a(context, "babel_call_media_type_refresh_max_delay_ms", fls.v);
            long a3 = gwb.a(context, "babel_call_media_type_refresh_min_delay_ms", fls.w);
            ((bhl) jyn.a(context, bhl.class)).a(new bgj(this.a, ((long) mfo.a.nextInt((int) (a2 - a3))) + a3, v));
            glk.a("Babel_CMTRLogTask", "call_media_type refresh task scheduled with a delay of %d ms and %d conversations for account %d.", Long.valueOf(a2), Integer.valueOf(v.size()), Integer.valueOf(this.a));
        }
        return bhn.a;
    }
}
