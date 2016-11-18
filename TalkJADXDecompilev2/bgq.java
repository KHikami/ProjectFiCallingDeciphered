package defpackage;

import android.content.Context;

final class bgq implements jcn {
    final /* synthetic */ bgp a;

    bgq(bgp bgp) {
        this.a = bgp;
    }

    public String a() {
        return "cmm-dep";
    }

    public void a(Context context, jck jck) {
        if (jck.b("effective_gaia_id") != null && jck.c("logged_in")) {
            jck.c("logged_in", false).c("logged_out", true);
            this.a.a.a(-1).b().c(3133);
        }
    }
}
