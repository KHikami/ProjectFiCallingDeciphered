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
            case wi.j /*1*/:
                jck.c("is_bad", true);
            case wi.z /*3*/:
                jck.c("gplus_no_mobile_tos", true);
            case wi.h /*4*/:
                jck.c("is_google_plus", true);
                jck.c("logged_in", true);
            case wi.p /*5*/:
                jck.c("is_google_plus", true);
                jck.c("logged_out", true);
            default:
        }
    }
}
