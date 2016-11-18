package defpackage;

import android.app.Activity;

final class cak implements jze, jzr {
    cak() {
    }

    public void a(Activity activity, kbu kbu, jyn jyn) {
        jyn.a(byp.class, new cad(activity, kbu, jyn));
    }

    public void a(dr drVar, kbu kbu, jyn jyn) {
        jyn.a(byp.class, new cad(drVar.getContext(), kbu, jyn));
    }

    public Class<?> a() {
        return byp.class;
    }
}
