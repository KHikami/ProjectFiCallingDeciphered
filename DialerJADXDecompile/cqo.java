import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cqo implements Runnable {
    private /* synthetic */ cqk a;
    private /* synthetic */ cqn b;

    public cqo(cqn cqn, cqk cqk) {
        this.b = cqn;
        this.a = cqk;
    }

    public final void run() {
        this.a.a.a(this.a);
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        cqn cqn = this.b;
        cqk cqk = this.a;
        buf.p("deliver should be called from worker thread");
        buf.b(cqk.c, (Object) "Measurement must be submitted");
        List<cqt> list = cqk.i;
        if (!list.isEmpty()) {
            Set hashSet = new HashSet();
            for (cqt cqt : list) {
                Uri a = cqt.a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    cqt.a(cqk);
                }
            }
        }
    }
}
