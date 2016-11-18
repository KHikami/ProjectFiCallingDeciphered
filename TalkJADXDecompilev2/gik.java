package defpackage;

import android.app.Activity;

final class gik implements jze, jzr {
    gik() {
    }

    public void a(Activity activity, kbu kbu, jyn jyn) {
        jyn.a(gie.class, new gij(activity, kbu));
    }

    public void a(dr drVar, kbu kbu, jyn jyn) {
        jyn.a(gie.class, new gij(drVar.getContext(), kbu));
    }

    public Class<?> a() {
        return gie.class;
    }
}
