package p000;

import android.content.Intent;

final class jov implements jej {
    final /* synthetic */ jou f20629a;

    jov(jou jou) {
        this.f20629a = jou;
    }

    public void mo747a(int i, Intent intent) {
        int intExtra;
        if (intent != null) {
            intExtra = intent.getIntExtra("account_id", -1);
        } else {
            intExtra = -1;
        }
        if (intExtra != -1 && this.f20629a.f20621a != null) {
            this.f20629a.f20621a.mo1324k();
        }
    }
}
