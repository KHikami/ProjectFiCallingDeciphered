package p000;

import android.content.Context;

final class jog extends jgc {
    private final String f20581a;
    private final String f20582b;
    private final joh f20583c;
    private final jmu f20584d;

    jog(String str, String str2, String str3, joh joh, jmu jmu) {
        super(str);
        this.f20581a = str2;
        this.f20582b = str3;
        this.f20583c = joh;
        this.f20584d = jmu;
    }

    protected jgz mo648a(Context context) {
        jnl a = this.f20583c.m24826a(this.f20581a, this.f20582b, this.f20584d, false);
        jgz a2 = joa.m24782a(a);
        if (a.f20538a) {
            a2.m24192d().putInt("account_id", ((Integer) a.f20543f.get(0)).intValue());
        }
        return a2;
    }
}
