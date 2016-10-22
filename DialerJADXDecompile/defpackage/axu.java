package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: PG */
/* renamed from: axu */
final class axu implements SensorEventListener {
    private /* synthetic */ axs a;

    axu(axs axs) {
        this.a = axs;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.a.a((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2]);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
