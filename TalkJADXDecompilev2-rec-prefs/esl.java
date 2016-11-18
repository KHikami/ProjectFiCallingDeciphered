package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.promo.impl.PromoActivity;

final class esl implements jcc, jza, kcq {
    private final Context f12163a;
    private esm f12164b;

    esl(Context context, kbu kbu) {
        this.f12163a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f12164b = (esm) jyn.m25443a(esm.class);
        ((jca) jyn.m25443a(jca.class)).mo2318a(this);
    }

    public void mo1133a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.f12164b.m14359a(this.f12163a);
            if (this.f12164b.m14360b(this.f12163a) > 0) {
                Intent intent = new Intent(this.f12163a, PromoActivity.class);
                intent.putExtra("account_id", i2);
                this.f12163a.startActivity(intent);
            }
        }
    }
}
