package p000;

import android.content.Context;

final class bkv implements jcn {
    final /* synthetic */ bkq f3666a;

    bkv(bkq bkq) {
        this.f3666a = bkq;
    }

    public String mo547a() {
        return "logged_off_to_logged_in";
    }

    public void mo548a(Context context, jck jck) {
        boolean z = true;
        boolean a = jck.mo3439a("logged_off", false);
        String valueOf = String.valueOf(glk.m17974b(jck.mo3440b("account_name")));
        glk.m17979c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Account ").append(valueOf).append(" logged off: ").append(a).append(" migrated").toString(), new Object[0]);
        if ("SMS".equals(jck.mo3440b("account_name"))) {
            a = (jck.mo3448c("is_sms_account") && fde.m15028i()) ? false : true;
        }
        String str = "logged_in";
        if (a) {
            z = false;
        }
        jck.mo3447c(str, z);
        jck.mo3447c("logged_out", a);
        jck.mo3451i("logged_off");
    }
}
