package p000;

import android.content.Context;

final class jdd implements jcn {
    final /* synthetic */ jcx f19891a;

    jdd(jcx jcx) {
        this.f19891a = jcx;
    }

    public String mo547a() {
        return "upgrade:account_status";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3448c("non_google_plus")) {
            jck.mo3451i("non_google_plus");
            jck.mo3443c("account_status", 2);
        } else if (jck.mo3448c("notifications_only")) {
            jck.mo3451i("notifications_only");
            jck.mo3443c("account_status", 3);
        } else if (jck.mo3448c("logged_in")) {
            jck.mo3451i("logged_in");
            jck.mo3443c("account_status", 4);
        } else {
            jck.mo3443c("account_status", 5);
        }
    }
}
