package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.apps.hangouts.hangout.ProximityCoverView;

public final class dkq implements SensorEventListener {
    final /* synthetic */ ProximityCoverView a;

    public dkq(ProximityCoverView proximityCoverView) {
        this.a = proximityCoverView;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        this.a.b = sensorEvent.sensor.getMaximumRange();
        this.a.a = sensorEvent.values[0];
        this.a.c();
    }
}
