package p000;

import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class afk extends Animation {
    final float f530a;
    final float f531b;
    final float f532c;
    final /* synthetic */ SwitchCompat f533d;

    public afk(SwitchCompat switchCompat, float f, float f2) {
        this.f533d = switchCompat;
        this.f530a = f;
        this.f531b = f2;
        this.f532c = f2 - f;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.f533d.m3399a(this.f530a + (this.f532c * f));
    }
}
