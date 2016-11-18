package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fhf implements ServiceConnection {
    final /* synthetic */ RealTimeChatService f13054a;

    public fhf(RealTimeChatService realTimeChatService) {
        this.f13054a = realTimeChatService;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof fob) {
            this.f13054a.f6766l = ((fob) iBinder).m15781a();
            boolean z = RealTimeChatService.f6744a;
            return;
        }
        glk.m17982e("Babel_RTCS", "service is not an instance of RequestWriter.LocalBinder", new Object[0]);
        String valueOf = String.valueOf(iBinder);
        glk.m17982e("Babel_RTCS", new StringBuilder(String.valueOf(valueOf).length() + 11).append("service is ").append(valueOf).toString(), new Object[0]);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f13054a.f6766l = null;
        boolean z = RealTimeChatService.f6744a;
    }
}
