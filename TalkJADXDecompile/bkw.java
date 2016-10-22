import android.content.Context;

final class bkw implements jcn {
    final /* synthetic */ bkq a;

    bkw(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "fix_sms_logged_off2";
    }

    public void a(Context context, jck jck) {
        boolean z = true;
        if ("SMS".equals(jck.b("account_name"))) {
            boolean z2;
            if (jck.c("is_sms_account") && fde.i()) {
                z2 = true;
            } else {
                z2 = false;
            }
            jck.c("logged_in", z2);
            String str = "logged_out";
            if (z2) {
                z = false;
            }
            jck.c(str, z);
        }
    }
}
