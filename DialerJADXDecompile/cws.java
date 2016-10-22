import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
final class cws extends Thread {
    final ReferenceQueue a;
    final cwu b;
    final ConcurrentMap c;
    private Map d;
    private final cwq e;
    private Deque f;

    cws(ReferenceQueue referenceQueue, cwu cwu, cwq cwq) {
        this.c = new ConcurrentHashMap();
        this.d = new HashMap();
        this.f = new ArrayDeque(3);
        this.a = (ReferenceQueue) buf.B((Object) referenceQueue);
        this.b = (cwu) buf.B((Object) cwu);
        this.e = (cwq) buf.B((Object) cwq);
    }

    public final void run() {
        while (!isInterrupted()) {
            try {
                buf.d(this.d.isEmpty());
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    this.d.put((Reference) entry.getKey(), (String) entry.getValue());
                    it.remove();
                }
                for (int i = 0; i < 3; i++) {
                    this.f.push(new Object());
                }
                Thread.sleep(5000);
                a();
            } catch (InterruptedException e) {
                interrupt();
            }
        }
        this.c.clear();
        this.d.clear();
        this.f.clear();
    }

    private void a() {
        buf.d(!this.f.isEmpty(), (Object) "The new cycle is not prepared.");
        while (!this.f.isEmpty()) {
            buf.d(!this.f.isEmpty());
            Reference a = this.b.a(this.f.pop(), this.a);
            Object obj = null;
            while (obj == null) {
                Reference remove = this.a.remove();
                while (remove != null) {
                    Object obj2;
                    String str;
                    if (a == remove) {
                        boolean z;
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        buf.d(z, (Object) "Only one dummy object collected at a time.");
                        obj2 = 1;
                    } else {
                        str = (String) this.d.remove(remove);
                        if (str == null) {
                            str = (String) this.c.remove(remove);
                        }
                        if (str != null) {
                            this.e.a(str);
                        }
                        obj2 = obj;
                    }
                    remove = this.a.poll();
                    obj = obj2;
                }
                if (obj == null) {
                    this.e.a();
                }
            }
            if (Log.isLoggable("LeakWatcherThread", 2)) {
                new StringBuilder(38).append("Dummy collected, remaining ").append(this.f.size());
            }
        }
        this.d.isEmpty();
        if (Log.isLoggable("LeakWatcherThread", 3)) {
            new StringBuilder(45).append("Checking for leak: ").append(this.d.size()).append(" leak(s) found.");
        }
        for (String str2 : this.d.values()) {
            this.e.b(str2);
        }
        this.e.a();
        this.d.clear();
    }
}
