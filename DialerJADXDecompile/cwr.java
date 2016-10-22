import android.util.Log;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
public final class cwr {
    public boolean a;
    public cwq b;
    private final cwt c;
    private cws d;

    public cwr() {
        this(new cwt());
    }

    private cwr(cwt cwt) {
        this.a = false;
        this.c = (cwt) buf.B((Object) cwt);
    }

    public final synchronized void a(Object obj, String str) {
        if (this.a) {
            if (this.d == null) {
                this.d = new cws(new ReferenceQueue(), new cwu(), this.b);
                this.d.start();
            }
            cws cws = this.d;
            buf.B((Object) str);
            buf.B(obj);
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                String str2 = "Watching ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            cws.c.put(cws.b.a(obj, cws.a), str);
        }
    }

    public final synchronized void a() {
        this.a = true;
    }

    public final synchronized void b() {
        if (this.a) {
            this.a = false;
            if (this.d != null) {
                this.d.interrupt();
                this.d = null;
            }
        }
    }
}
