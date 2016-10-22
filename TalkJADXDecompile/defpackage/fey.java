package defpackage;

import android.content.Context;

/* renamed from: fey */
public class fey implements bhf, bhj, bhm {
    private final int a;
    private final String b;
    private final long c;
    private final bhr d;

    public fey(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = new bhs().d(5000).a();
    }

    public bhr a() {
        return this.d;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a();
    }

    public int a(Context context, bhb bhb) {
        int d = new blo(context, this.a).d(this.b, this.c);
        String str = this.b;
        int i = this.a;
        new StringBuilder(String.valueOf(str).length() + 152).append("Deleted ").append(d).append(" played event suggestions for conversation ").append(str).append(" on account ").append(i).append(" where the last played event was at timestamp ").append(this.c).append(".");
        return bhn.a;
    }

    public String b() {
        return getClass().getName();
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }
}
