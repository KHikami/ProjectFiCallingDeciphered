package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fif implements Runnable {
    final /* synthetic */ Intent f13109a;
    final /* synthetic */ fiu f13110b;
    final /* synthetic */ Object f13111c;

    public fif(Intent intent, fiu fiu, Object obj) {
        this.f13109a = intent;
        this.f13110b = fiu;
        this.f13111c = obj;
    }

    public void run() {
        RealTimeChatService.m9010a(this.f13109a, this.f13110b, this.f13111c, false);
    }
}
