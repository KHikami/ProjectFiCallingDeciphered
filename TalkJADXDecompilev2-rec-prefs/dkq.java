package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.apps.hangouts.hangout.ProximityCoverView;

public final class dkq implements SensorEventListener {
    final /* synthetic */ ProximityCoverView f10025a;

    public dkq(ProximityCoverView proximityCoverView) {
        this.f10025a = proximityCoverView;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f10025a.f6424b = sensorEvent.sensor.getMaximumRange();
        this.f10025a.f6423a = sensorEvent.values[0];
        this.f10025a.m8680c();
    }
}
