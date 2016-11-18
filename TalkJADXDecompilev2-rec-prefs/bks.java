package p000;

import android.content.Context;

final class bks implements jcn {
    final /* synthetic */ bkq f3663a;

    bks(bkq bkq) {
        this.f3663a = bkq;
    }

    public String mo547a() {
        return "name_to_account_name";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3438a("name")) {
            jck.mo3445c("account_name", jck.mo3440b("name"));
            jck.mo3451i("name");
        }
    }
}
