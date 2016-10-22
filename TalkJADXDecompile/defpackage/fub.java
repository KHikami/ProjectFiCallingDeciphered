package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: fub */
final class fub implements jxa, kcq {
    final /* synthetic */ ftx a;

    fub(ftx ftx) {
        this.a = ftx;
    }

    public boolean a(int i, int i2, Intent intent) {
        if (i != 1) {
            return false;
        }
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL");
            Context context = this.a.context;
            bko bko = this.a.a;
            if (bkq.a) {
                String valueOf = String.valueOf(glk.b(bko.a()));
                new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(stringExtra).length()).append("setAvatarUrl: ").append(valueOf).append(" avatarUrl: ").append(stringExtra);
            }
            jci b = ((jcf) jyn.a(context, jcf.class)).b(bko.g());
            b.b("profile_photo_url", stringExtra);
            b.d();
            this.a.b.a(this.a.a.p(), this.a.a);
        }
        return true;
    }
}
