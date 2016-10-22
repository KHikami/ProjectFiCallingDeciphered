package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.promo.impl.PromoActivity;

/* renamed from: esl */
final class esl implements jcc, jza, kcq {
    private final Context a;
    private esm b;

    esl(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (esm) jyn.a(esm.class);
        ((jca) jyn.a(jca.class)).a(this);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.b.a(this.a);
            if (this.b.b(this.a) > 0) {
                Intent intent = new Intent(this.a, PromoActivity.class);
                intent.putExtra("account_id", i2);
                this.a.startActivity(intent);
            }
        }
    }
}
