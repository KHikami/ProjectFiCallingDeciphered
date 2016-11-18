package p000;

import android.content.Context;

final class jdc implements jcn {
    final /* synthetic */ jcx f19890a;

    jdc(jcx jcx) {
        this.f19890a = jcx;
    }

    public String mo547a() {
        return "add_effective_gaia_id";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3448c("is_managed_account")) {
            jck.mo3445c("effective_gaia_id", jck.mo3440b("gaia_id"));
        }
    }
}
