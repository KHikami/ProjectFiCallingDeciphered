package p000;

import android.content.Context;

final class jdf implements jcn {
    final /* synthetic */ jcx f19893a;

    jdf(jcx jcx) {
        this.f19893a = jcx;
    }

    public String mo547a() {
        return "add_skinny_page_boolean";
    }

    public void mo548a(Context context, jck jck) {
        boolean z = false;
        if (!jck.mo3448c("is_google_plus") && jck.mo3433a("page_count", 0) > 0) {
            z = true;
        }
        jck.mo3447c("gplus_skinny_page", z);
    }
}
