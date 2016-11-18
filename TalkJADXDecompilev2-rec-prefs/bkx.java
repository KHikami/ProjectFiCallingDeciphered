package p000;

import android.content.Context;

final class bkx implements jcn {
    final /* synthetic */ bkq f3668a;

    bkx(bkq bkq) {
        this.f3668a = bkq;
    }

    public String mo547a() {
        return "legacy_known_minor";
    }

    public void mo548a(Context context, jck jck) {
        int a = jck.mo3433a("account_age_group", 0);
        if (jck.mo3438a("is_child") && a == 0 && jck.mo3448c("is_child")) {
            jck.mo3443c("account_age_group", 2);
        }
    }
}
