package p000;

import android.content.Context;

final class bky implements jcn {
    final /* synthetic */ bkq f3669a;

    bky(bkq bkq) {
        this.f3669a = bkq;
    }

    public String mo547a() {
        return "legacy_avatar_url";
    }

    public void mo548a(Context context, jck jck) {
        if (jck.mo3438a("avatar_url")) {
            jck.mo3445c("profile_photo_url", jck.mo3440b("avatar_url"));
            jck.mo3451i("avatar_url");
        }
    }
}
