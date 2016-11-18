package defpackage;

import android.content.Context;

final class jog extends jgc {
    private final String a;
    private final String b;
    private final joh c;
    private final jmu d;

    jog(String str, String str2, String str3, joh joh, jmu jmu) {
        super(str);
        this.a = str2;
        this.b = str3;
        this.c = joh;
        this.d = jmu;
    }

    protected jgz a(Context context) {
        jnl a = this.c.a(this.a, this.b, this.d, false);
        jgz a2 = joa.a(a);
        if (a.a) {
            a2.d().putInt("account_id", ((Integer) a.f.get(0)).intValue());
        }
        return a2;
    }
}
