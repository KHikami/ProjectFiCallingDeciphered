import android.content.Context;

public class fkq implements bhf, bhj, bhm {
    private final bhr a;
    private final int b;
    private final long c;

    public fkq(int i, Context context) {
        this.c = (long) gwb.a(context, "babel_suggested_contact_renew_period_ms", 86400000);
        this.b = i;
        long a = ((jcf) jyn.a(context, jcf.class)).a(i).a("last_suggested_contacts_time", 0);
        long j = this.c + a;
        long a2 = glj.a();
        if (a == 0 || a2 >= j || a > a2) {
            a = 0;
        } else {
            a = j - a2;
        }
        this.a = new bhs().d(a).a();
    }

    public int a(Context context, bhb bhb) {
        jyn b = jyn.b(context);
        try {
            ((jcf) b.a(jcf.class)).b(this.b);
            ((bhl) b.a(bhl.class)).a(new fkr(this.b));
            this.a.a(this.c);
            return bhn.b;
        } catch (jcj e) {
            return bhn.c;
        }
    }

    public bhr a() {
        return this.a;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.b).toString();
    }
}
