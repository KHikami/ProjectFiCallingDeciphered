package p000;

import android.content.Context;

final class jde implements jcn {
    final /* synthetic */ jcx f19892a;

    jde(jcx jcx) {
        this.f19892a = jcx;
    }

    public String mo547a() {
        return "upgrade:remove_account_status";
    }

    public void mo548a(Context context, jck jck) {
        switch (jck.mo3433a("account_status", 0)) {
            case 1:
                jck.mo3447c("is_bad", true);
                return;
            case 3:
                jck.mo3447c("gplus_no_mobile_tos", true);
                return;
            case 4:
                jck.mo3447c("is_google_plus", true);
                jck.mo3447c("logged_in", true);
                return;
            case 5:
                jck.mo3447c("is_google_plus", true);
                jck.mo3447c("logged_out", true);
                return;
            default:
                return;
        }
    }
}
