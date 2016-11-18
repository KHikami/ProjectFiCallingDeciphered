package p000;

import android.content.Context;

final class jda implements jcn {
    final /* synthetic */ jcx f19888a;

    jda(jcx jcx) {
        this.f19888a = jcx;
    }

    public String mo547a() {
        return "upgrade:active_to_logged_in";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3448c("active")) {
            jck.mo3451i("active");
            jck.mo3447c("logged_in", true);
        }
    }
}
