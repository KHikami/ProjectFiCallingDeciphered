package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager.WakeLock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class cvx {
    final Context f9207a;
    WakeLock f9208b;
    isr f9209c;
    boolean f9210d;
    private final ite f9211e;
    private final cus f9212f;
    private final SensorManager f9213g;
    private final Sensor f9214h;
    private boolean f9215i;
    private List<cwb> f9216j = new CopyOnWriteArrayList();
    private final itg f9217k = new cvy(this);
    private final cuz f9218l = new cvz(this);
    private final SensorEventListener f9219m = new cwa(this);

    public cvx(Context context, ite ite, cus cus) {
        this.f9207a = context;
        this.f9211e = ite;
        this.f9211e.mo3217a(this.f9217k);
        this.f9212f = cus;
        this.f9212f.m11052a(this.f9218l);
        this.f9213g = (SensorManager) context.getSystemService("sensor");
        this.f9214h = this.f9213g.getDefaultSensor(8);
        if (this.f9214h != null) {
            this.f9213g.registerListener(this.f9219m, this.f9214h, 3);
        }
    }

    void m11142a() {
        if (this.f9208b != null) {
            this.f9208b.release();
            this.f9208b = null;
        }
    }

    protected void finalize() {
        m11145b();
        super.finalize();
    }

    public void m11145b() {
        if (this.f9208b != null) {
            m11142a();
        }
        this.f9212f.m11055b(this.f9218l);
        this.f9211e.mo3219b(this.f9217k);
        if (this.f9214h != null) {
            this.f9213g.unregisterListener(this.f9219m);
        }
    }

    boolean m11147c() {
        return this.f9209c == isr.EARPIECE_ON;
    }

    void m11144a(boolean z) {
        if (this.f9215i != z) {
            this.f9215i = z;
            for (cwb a : this.f9216j) {
                a.m11152a(z);
            }
        }
    }

    public void m11143a(cwb cwb) {
        if (!this.f9216j.contains(cwb)) {
            this.f9216j.add(cwb);
            if (this.f9215i) {
                cwb.m11152a(true);
            }
        }
    }

    public void m11146b(cwb cwb) {
        this.f9216j.remove(cwb);
    }
}
