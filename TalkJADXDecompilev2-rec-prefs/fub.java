package p000;

import android.content.Context;
import android.content.Intent;

final class fub implements jxa, kcq {
    final /* synthetic */ ftx f14005a;

    fub(ftx ftx) {
        this.f14005a = ftx;
    }

    public boolean mo2095a(int i, int i2, Intent intent) {
        if (i != 1) {
            return false;
        }
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL");
            Context context = this.f14005a.context;
            bko bko = this.f14005a.f13994a;
            if (bkq.f3659a) {
                String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
                new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(stringExtra).length()).append("setAvatarUrl: ").append(valueOf).append(" avatarUrl: ").append(stringExtra);
            }
            jci b = ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g());
            b.m23879b("profile_photo_url", stringExtra);
            b.m23891d();
            this.f14005a.f13995b.m16218a(this.f14005a.f13994a.m5647p(), this.f14005a.f13994a);
        }
        return true;
    }
}
