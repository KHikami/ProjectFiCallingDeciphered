package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

final class cwa implements SensorEventListener {
    final /* synthetic */ cvx f9223a;

    cwa(cvx cvx) {
        this.f9223a = cvx;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = true;
        float maximumRange = sensorEvent.sensor.getMaximumRange();
        float f = sensorEvent.values[0];
        cvx cvx = this.f9223a;
        boolean z2 = f >= 0.0f && (f < 1.0f || (f <= 5.0f && maximumRange > 5.0f));
        cvx.f9210d = z2;
        if (!(cvx.m11147c() && cvx.f9210d)) {
            z = false;
        }
        cvx.m11144a(z);
    }
}
