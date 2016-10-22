package defpackage;

import android.content.Context;

/* renamed from: jdc */
final class jdc implements jcn {
    final /* synthetic */ jcx a;

    jdc(jcx jcx) {
        this.a = jcx;
    }

    public String a() {
        return "add_effective_gaia_id";
    }

    public void a(Context context, jck jck) {
        if (jck.c("is_managed_account")) {
            jck.c("effective_gaia_id", jck.b("gaia_id"));
        }
    }
}
