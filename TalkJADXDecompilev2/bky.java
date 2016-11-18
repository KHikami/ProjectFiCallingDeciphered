package defpackage;

import android.content.Context;

final class bky implements jcn {
    final /* synthetic */ bkq a;

    bky(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "legacy_avatar_url";
    }

    public void a(Context context, jck jck) {
        if (jck.a("avatar_url")) {
            jck.c("profile_photo_url", jck.b("avatar_url"));
            jck.i("avatar_url");
        }
    }
}
