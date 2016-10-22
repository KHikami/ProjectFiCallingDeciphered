import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhw implements Runnable {
    final /* synthetic */ fqj a;

    public fhw(fqj fqj) {
        this.a = fqj;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).c();
        }
    }
}
