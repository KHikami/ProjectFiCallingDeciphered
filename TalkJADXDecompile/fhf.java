import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fhf implements ServiceConnection {
    final /* synthetic */ RealTimeChatService a;

    public fhf(RealTimeChatService realTimeChatService) {
        this.a = realTimeChatService;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof fob) {
            this.a.l = ((fob) iBinder).a();
            boolean z = RealTimeChatService.a;
            return;
        }
        glk.e("Babel_RTCS", "service is not an instance of RequestWriter.LocalBinder", new Object[0]);
        String valueOf = String.valueOf(iBinder);
        glk.e("Babel_RTCS", new StringBuilder(String.valueOf(valueOf).length() + 11).append("service is ").append(valueOf).toString(), new Object[0]);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.a.l = null;
        boolean z = RealTimeChatService.a;
    }
}
