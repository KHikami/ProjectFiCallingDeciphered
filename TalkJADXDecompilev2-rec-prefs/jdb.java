package p000;

import android.content.Context;

final class jdb implements jcn {
    final /* synthetic */ jcx f19889a;

    jdb(jcx jcx) {
        this.f19889a = jcx;
    }

    public String mo547a() {
        return "upgrade_direct_login_to_managed_login";
    }

    public void mo548a(Context context, jck jck) {
        boolean z;
        if (jck.mo3438a("is_direct_login")) {
            boolean a = jck.mo3439a("is_direct_login", false);
            jck.mo3447c("is_managed_account", !a);
            jck.mo3451i("is_direct_login");
            z = a;
        } else {
            z = false;
        }
        if (jck.mo3439a("is_plus_page", false) && !r0) {
            jck.mo3447c("is_managed_account", true);
        }
    }
}
