package defpackage;

import android.content.Context;

/* renamed from: caq */
final class caq extends cbd {
    caq() {
    }

    protected void a(Context context, kbu kbu, jyn jyn) {
        if (fdq.O.b(((jca) jyn.a(jca.class)).a())) {
            jyn.a(cam.class, new can(context, kbu));
        } else {
            jyn.a(cam.class, new car(context, kbu));
        }
    }

    public Class<?> a() {
        return cam.class;
    }
}
