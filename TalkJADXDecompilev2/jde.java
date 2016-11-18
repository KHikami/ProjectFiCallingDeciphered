package defpackage;

import android.content.Context;

final class jde implements jcn {
    final /* synthetic */ jcx a;

    jde(jcx jcx) {
        this.a = jcx;
    }

    public String a() {
        return "upgrade:remove_account_status";
    }

    public void a(Context context, jck jck) {
        switch (jck.a("account_status", 0)) {
            case 1:
                jck.c("is_bad", true);
                return;
            case 3:
                jck.c("gplus_no_mobile_tos", true);
                return;
            case 4:
                jck.c("is_google_plus", true);
                jck.c("logged_in", true);
                return;
            case 5:
                jck.c("is_google_plus", true);
                jck.c("logged_out", true);
                return;
            default:
                return;
        }
    }
}
