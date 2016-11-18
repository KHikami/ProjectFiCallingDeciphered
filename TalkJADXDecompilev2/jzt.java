package defpackage;

import android.content.Context;

public final class jzt extends jzj<jzr> {
    private final dr b;

    public jzt(dr drVar, kbu kbu) {
        super(kbu, jzs.class);
        this.b = drVar;
    }

    private void a(jzr jzr, kbu kbu, jyn jyn) {
        jzr.a(this.b, kbu, jyn);
    }

    protected jzi<jzr> a(Context context) {
        return new jzs(context);
    }
}
