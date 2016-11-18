package defpackage;

import android.content.Context;

final class jdd implements jcn {
    final /* synthetic */ jcx a;

    jdd(jcx jcx) {
        this.a = jcx;
    }

    public String a() {
        return "upgrade:account_status";
    }

    public void a(Context context, jck jck) {
        if (jck.c("non_google_plus")) {
            jck.i("non_google_plus");
            jck.c("account_status", 2);
        } else if (jck.c("notifications_only")) {
            jck.i("notifications_only");
            jck.c("account_status", 3);
        } else if (jck.c("logged_in")) {
            jck.i("logged_in");
            jck.c("account_status", 4);
        } else {
            jck.c("account_status", 5);
        }
    }
}
