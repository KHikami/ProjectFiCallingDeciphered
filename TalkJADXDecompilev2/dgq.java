package defpackage;

import android.content.Intent;
import android.util.Base64;
import com.google.android.apps.hangouts.realtimechat.GcmIntentService;

final class dgq implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ dgg b;

    dgq(dgg dgg, Intent intent) {
        this.b = dgg;
        this.a = intent;
    }

    public void run() {
        inx.a().a(Base64.decode(GcmIntentService.a(this.a), 0));
    }
}
