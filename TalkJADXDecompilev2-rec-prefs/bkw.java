package p000;

import android.content.Context;

final class bkw implements jcn {
    final /* synthetic */ bkq f3667a;

    bkw(bkq bkq) {
        this.f3667a = bkq;
    }

    public String mo547a() {
        return "fix_sms_logged_off2";
    }

    public void mo548a(Context context, jck jck) {
        boolean z = true;
        if ("SMS".equals(jck.mo3440b("account_name"))) {
            boolean z2;
            if (jck.mo3448c("is_sms_account") && fde.m15028i()) {
                z2 = true;
            } else {
                z2 = false;
            }
            jck.mo3447c("logged_in", z2);
            String str = "logged_out";
            if (z2) {
                z = false;
            }
            jck.mo3447c(str, z);
        }
    }
}
