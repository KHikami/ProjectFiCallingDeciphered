package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

final class cwa implements SensorEventListener {
    final /* synthetic */ cvx a;

    cwa(cvx cvx) {
        this.a = cvx;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = true;
        float maximumRange = sensorEvent.sensor.getMaximumRange();
        float f = sensorEvent.values[0];
        cvx cvx = this.a;
        boolean z2 = f >= 0.0f && (f < 1.0f || (f <= 5.0f && maximumRange > 5.0f));
        cvx.d = z2;
        if (!(cvx.c() && cvx.d)) {
            z = false;
        }
        cvx.a(z);
    }
}
