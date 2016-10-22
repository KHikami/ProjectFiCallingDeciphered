import android.content.Context;

public class ftg implements bhj, bhm {
    private final boolean a;

    public ftg(boolean z) {
        this.a = z;
    }

    public int a(Context context, bhb bhb) {
        try {
            ((jmq) jyn.a(context, jmq.class)).a(new jmt().a(this.a).a());
            return bhn.a;
        } catch (Throwable e) {
            glk.c("Babel_AccountRefresh", "Loading device accounts failed", e);
            return bhn.d;
        }
    }

    public String b() {
        return "LoginManagerAccountRefreshTask";
    }

    public bhk c() {
        if (this.a) {
            return bhk.USE_OLD;
        }
        return bhk.REPLACE_OLD;
    }
}
