package p000;

import android.content.Context;

final class bgq implements jcn {
    final /* synthetic */ bgp f3329a;

    bgq(bgp bgp) {
        this.f3329a = bgp;
    }

    public String mo547a() {
        return "cmm-dep";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3440b("effective_gaia_id") != null && jck.mo3448c("logged_in")) {
            jck.mo3447c("logged_in", false).mo3447c("logged_out", true);
            this.f3329a.f3328a.mo1979a(-1).mo1693b().mo1714c(3133);
        }
    }
}
