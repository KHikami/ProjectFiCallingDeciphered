import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fie implements Runnable {
    final /* synthetic */ bko a;

    public fie(bko bko) {
        this.a = bko;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).b(this.a);
        }
    }
}
