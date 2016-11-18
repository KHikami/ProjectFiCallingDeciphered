package p000;

import android.content.Context;

public class fey implements bhf, bhj, bhm {
    private final int f12944a;
    private final String f12945b;
    private final long f12946c;
    private final bhr f12947d = new bhs().m5272d(5000).m5267a();

    public fey(int i, String str, long j) {
        this.f12944a = i;
        this.f12945b = str;
        this.f12946c = j;
    }

    public bhr mo540a() {
        return this.f12947d;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5276a();
    }

    public int mo539a(Context context, bhb bhb) {
        int d = new blo(context, this.f12944a).m6036d(this.f12945b, this.f12946c);
        String str = this.f12945b;
        int i = this.f12944a;
        new StringBuilder(String.valueOf(str).length() + 152).append("Deleted ").append(d).append(" played event suggestions for conversation ").append(str).append(" on account ").append(i).append(" where the last played event was at timestamp ").append(this.f12946c).append(".");
        return bhn.f3348a;
    }

    public String mo542b() {
        return getClass().getName();
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }
}
