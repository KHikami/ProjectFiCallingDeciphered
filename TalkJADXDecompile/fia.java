import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fia implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public fia(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a, this.b);
        }
    }
}
