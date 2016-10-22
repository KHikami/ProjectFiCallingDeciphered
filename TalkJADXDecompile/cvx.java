import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager.WakeLock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class cvx {
    final Context a;
    WakeLock b;
    isr c;
    boolean d;
    private final ite e;
    private final cus f;
    private final SensorManager g;
    private final Sensor h;
    private boolean i;
    private List<cwb> j;
    private final itg k;
    private final cuz l;
    private final SensorEventListener m;

    public cvx(Context context, ite ite, cus cus) {
        this.j = new CopyOnWriteArrayList();
        this.k = new cvy(this);
        this.l = new cvz(this);
        this.m = new cwa(this);
        this.a = context;
        this.e = ite;
        this.e.a(this.k);
        this.f = cus;
        this.f.a(this.l);
        this.g = (SensorManager) context.getSystemService("sensor");
        this.h = this.g.getDefaultSensor(8);
        if (this.h != null) {
            this.g.registerListener(this.m, this.h, 3);
        }
    }

    void a() {
        if (this.b != null) {
            this.b.release();
            this.b = null;
        }
    }

    protected void finalize() {
        b();
        super.finalize();
    }

    public void b() {
        if (this.b != null) {
            a();
        }
        this.f.b(this.l);
        this.e.b(this.k);
        if (this.h != null) {
            this.g.unregisterListener(this.m);
        }
    }

    boolean c() {
        return this.c == isr.EARPIECE_ON;
    }

    void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            for (cwb a : this.j) {
                a.a(z);
            }
        }
    }

    public void a(cwb cwb) {
        if (!this.j.contains(cwb)) {
            this.j.add(cwb);
            if (this.i) {
                cwb.a(true);
            }
        }
    }

    public void b(cwb cwb) {
        this.j.remove(cwb);
    }
}
