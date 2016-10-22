package defpackage;

import android.content.Context;

/* renamed from: jdf */
final class jdf implements jcn {
    final /* synthetic */ jcx a;

    jdf(jcx jcx) {
        this.a = jcx;
    }

    public String a() {
        return "add_skinny_page_boolean";
    }

    public void a(Context context, jck jck) {
        boolean z = false;
        if (!jck.c("is_google_plus") && jck.a("page_count", 0) > 0) {
            z = true;
        }
        jck.c("gplus_skinny_page", z);
    }
}
