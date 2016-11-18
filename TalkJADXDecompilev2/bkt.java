package defpackage;

import android.content.Context;

final class bkt implements jcn {
    final /* synthetic */ bkq a;

    bkt(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "is_gplus_user_to_is_google_plus";
    }

    public void a(Context context, jck jck) {
        if (jck.a("is_gplus_user")) {
            jck.c("is_google_plus", jck.c("is_gplus_user"));
            jck.i("is_gplus_user");
        }
    }
}
