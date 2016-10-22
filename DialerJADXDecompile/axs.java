import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
public final class axs {
    int a;
    int b;
    axv c;
    private SensorManager d;
    private Sensor e;
    private Handler f;
    private SensorEventListener g;

    public axs(Context context) {
        this.f = new axt(this);
        this.g = new axu(this);
        this.d = (SensorManager) context.getSystemService("sensor");
        this.e = this.d.getDefaultSensor(1);
    }

    public final void a(boolean z) {
        new StringBuilder(13).append("enable(").append(z).append(")");
        synchronized (this) {
            if (z) {
                this.a = 0;
                this.b = 0;
                this.d.registerListener(this.g, this.e, 3);
            } else {
                this.d.unregisterListener(this.g);
                this.f.removeMessages(1234);
            }
        }
    }

    final void a(double d, double d2, double d3) {
        if (d != 0.0d && d2 != 0.0d && d3 != 0.0d) {
            int i;
            if ((Math.atan2(Math.hypot(d, d2), d3) * 180.0d) / 3.141592653589793d > 50.0d) {
                i = 1;
            } else {
                i = 2;
            }
            synchronized (this) {
                if (this.b == i) {
                    return;
                }
                this.f.removeMessages(1234);
                if (this.a != i) {
                    this.b = i;
                    Message obtainMessage = this.f.obtainMessage(1234);
                    if (i == 1) {
                        i = 100;
                    } else {
                        i = 500;
                    }
                    this.f.sendMessageDelayed(obtainMessage, (long) i);
                } else {
                    this.b = 0;
                }
            }
        }
    }
}
