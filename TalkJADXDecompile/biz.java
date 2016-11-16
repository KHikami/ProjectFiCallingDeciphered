import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class biz implements biw {
    private static final mks<String> a;
    private final String b;
    private final Context c;
    private final Object d; // Lock
    private boolean e;
    private final List<Runnable> f;

    static {
        a = mks.b("device_country");
    }

    public biz(String str, Context context, Executor executor) {
        this.d = new Object();
        this.f = new ArrayList();
        this.b = str;
        this.c = context;
        executor.execute(new bja(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        context.registerReceiver(new bjb(this), intentFilter);
    }

    private void a(String str) {
        boolean z = str.startsWith(this.b) || str.startsWith("url:") || a.contains(str);
        String str2 = "Config keys must start with ";
        String valueOf = String.valueOf(this.b);
        ba.a(z, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    // Called by gwb
    public String a(String str, String str2) {
        a(str);
        c();
        return icb.a(this.c.getContentResolver(), str, str2);
    }

    //used to calculate thresholds
    public int a(String str, int i) {
        a(str); //checks if string is in proper format (throws Illegal Argument Exception otherwise)
        c();
        return icb.a(this.c.getContentResolver(), str, i); //icb.a(ContentResolver for Context, String, int)
    }

    public long a(String str, long j) {
        a(str);
        c();
        return icb.a(this.c.getContentResolver(), str, j);
    }


    public boolean a(String str, boolean z) {
        a(str);//string in valid format
        c();//trhead check
        return icb.a(this.c.getContentResolver(), str, z);  // Use str as a key in the context hashmap and get the boolean value, or just return z if not a key
    }

    public void a(Runnable runnable) {
        synchronized (this.f) {
            this.f.add(runnable);
        }
    }

    private void c() {
        if (!this.e) {
            // Only one thread in here at a time
            synchronized (this.d) {
                long currentTimeMillis = System.currentTimeMillis();
                // Protect against "spurious wakup" by checking this condition on wake-up
                while (!this.e) {
                    try {
                        this.d.wait(3000);  // Wait 3000 ms (3 sec)
                        if (System.currentTimeMillis() - currentTimeMillis > 3000) {
                            ((iih) jyn.a(this.c, iih.class)).a(-1).b().c(2029);
                            return;
                        }
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        }
    }

    void a() {
        icb.b(this.c.getContentResolver(), this.b);
        synchronized (this.d) {
            this.e = true;
            this.d.notifyAll(); // Wake up all threads waiting on lock d
        }
        b();
    }

    void b() {
        synchronized (this.f) {
            for (Runnable a : this.f) {
                gwb.a(a);
            }
        }
    }
}
