package defpackage;

import android.content.Context;

final class joc extends jgc {
    private final joh a;

    public joc(String str, joh joh) {
        super(str);
        this.a = joh;
    }

    protected jgz a(Context context) {
        boolean a = this.a.a();
        jgz jgz = new jgz(true);
        jgz.d().putBoolean("are_accounts_ready_for_login", a);
        return jgz;
    }
}
