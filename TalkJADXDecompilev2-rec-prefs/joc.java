package p000;

import android.content.Context;

final class joc extends jgc {
    private final joh f20576a;

    public joc(String str, joh joh) {
        super(str);
        this.f20576a = joh;
    }

    protected jgz mo648a(Context context) {
        boolean a = this.f20576a.m24834a();
        jgz jgz = new jgz(true);
        jgz.m24192d().putBoolean("are_accounts_ready_for_login", a);
        return jgz;
    }
}
