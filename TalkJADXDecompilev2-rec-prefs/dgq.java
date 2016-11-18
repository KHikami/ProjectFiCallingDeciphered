package p000;

import android.content.Intent;
import android.util.Base64;
import com.google.android.apps.hangouts.realtimechat.GcmIntentService;

final class dgq implements Runnable {
    final /* synthetic */ Intent f9709a;
    final /* synthetic */ dgg f9710b;

    dgq(dgg dgg, Intent intent) {
        this.f9710b = dgg;
        this.f9709a = intent;
    }

    public void run() {
        inx.m22408a().m22415a(Base64.decode(GcmIntentService.m8973a(this.f9709a), 0));
    }
}
