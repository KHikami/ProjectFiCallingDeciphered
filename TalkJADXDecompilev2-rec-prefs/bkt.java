package p000;

import android.content.Context;

final class bkt implements jcn {
    final /* synthetic */ bkq f3664a;

    bkt(bkq bkq) {
        this.f3664a = bkq;
    }

    public String mo547a() {
        return "is_gplus_user_to_is_google_plus";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3438a("is_gplus_user")) {
            jck.mo3447c("is_google_plus", jck.mo3448c("is_gplus_user"));
            jck.mo3451i("is_gplus_user");
        }
    }
}
