package defpackage;

import android.content.Context;

final class jdb implements jcn {
    final /* synthetic */ jcx a;

    jdb(jcx jcx) {
        this.a = jcx;
    }

    public String a() {
        return "upgrade_direct_login_to_managed_login";
    }

    public void a(Context context, jck jck) {
        boolean z;
        if (jck.a("is_direct_login")) {
            boolean a = jck.a("is_direct_login", false);
            jck.c("is_managed_account", !a);
            jck.i("is_direct_login");
            z = a;
        } else {
            z = false;
        }
        if (jck.a("is_plus_page", false) && !r0) {
            jck.c("is_managed_account", true);
        }
    }
}
