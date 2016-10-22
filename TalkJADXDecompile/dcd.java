import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dcd {
    static int c;
    static final Object d;
    final Context a;
    final CopyOnWriteArrayList<Integer> b;
    dcg e;

    static {
        c = 16;
        d = new Object();
    }

    public dcd(Context context) {
        this.a = context;
        this.b = new CopyOnWriteArrayList();
        new dcf(this).b(new Void[0]);
    }

    private void b() {
        iiq.a(new dce(this));
    }

    public void a(dcg dcg) {
        this.e = dcg;
    }

    public void a(int i) {
        do {
        } while (this.b.remove(Integer.valueOf(i)));
        this.b.add(0, Integer.valueOf(i));
        if (this.e != null) {
            this.e.x_();
        }
        b();
    }

    public CopyOnWriteArrayList<Integer> a() {
        return this.b;
    }
}
