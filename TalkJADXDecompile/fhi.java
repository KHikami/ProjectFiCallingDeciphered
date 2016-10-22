import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhi implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ fpk b;

    public fhi(bko bko, fpk fpk) {
        this.a = bko;
        this.b = fpk;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a, this.b.b(), this.b.c(), this.b.a());
        }
    }
}
