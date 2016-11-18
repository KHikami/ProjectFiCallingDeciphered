package defpackage;

import android.app.Notification;
import android.os.Binder;
import com.google.android.libraries.hangouts.video.internal.CallService;

public final class ikc extends Binder {
    final /* synthetic */ CallService a;

    public ikc(CallService callService) {
        this.a = callService;
    }

    public void a(ijn ijn) {
        this.a.a = ijn;
        Notification s = ijn.o().a().s();
        if (s == null) {
            itx.a(5, "vclib", "No notification was specified for the call; service may be terminated unexpectedly.");
            return;
        }
        s.flags |= 2;
        this.a.startForeground(1, s);
    }

    public void a() {
        this.a.a = null;
        this.a.stopForeground(true);
    }
}
