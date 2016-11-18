package p000;

import android.app.Notification;
import android.os.Binder;
import com.google.android.libraries.hangouts.video.internal.CallService;

public final class ikc extends Binder {
    final /* synthetic */ CallService f17850a;

    public ikc(CallService callService) {
        this.f17850a = callService;
    }

    public void m22104a(ijn ijn) {
        this.f17850a.f8401a = ijn;
        Notification s = ijn.mo3224o().m23201a().m23193s();
        if (s == null) {
            itx.m23277a(5, "vclib", "No notification was specified for the call; service may be terminated unexpectedly.");
            return;
        }
        s.flags |= 2;
        this.f17850a.startForeground(1, s);
    }

    public void m22103a() {
        this.f17850a.f8401a = null;
        this.f17850a.stopForeground(true);
    }
}
