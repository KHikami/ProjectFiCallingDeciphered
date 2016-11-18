package defpackage;

import android.content.Context;

final class bkx implements jcn {
    final /* synthetic */ bkq a;

    bkx(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "legacy_known_minor";
    }

    public void a(Context context, jck jck) {
        int a = jck.a("account_age_group", 0);
        if (jck.a("is_child") && a == 0 && jck.c("is_child")) {
            jck.c("account_age_group", 2);
        }
    }
}
