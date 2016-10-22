import android.content.Context;

final class bkv implements jcn {
    final /* synthetic */ bkq a;

    bkv(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "logged_off_to_logged_in";
    }

    public void a(Context context, jck jck) {
        boolean z = true;
        boolean a = jck.a("logged_off", false);
        String valueOf = String.valueOf(glk.b(jck.b("account_name")));
        glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Account ").append(valueOf).append(" logged off: ").append(a).append(" migrated").toString(), new Object[0]);
        if ("SMS".equals(jck.b("account_name"))) {
            a = (jck.c("is_sms_account") && fde.i()) ? false : true;
        }
        String str = "logged_in";
        if (a) {
            z = false;
        }
        jck.c(str, z);
        jck.c("logged_out", a);
        jck.i("logged_off");
    }
}
