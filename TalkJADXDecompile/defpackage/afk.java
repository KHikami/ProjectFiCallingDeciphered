package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: afk */
public final class afk extends Animation {
    final float a;
    final float b;
    final float c;
    final /* synthetic */ SwitchCompat d;

    public afk(SwitchCompat switchCompat, float f, float f2) {
        this.d = switchCompat;
        this.a = f;
        this.b = f2;
        this.c = f2 - f;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.d.a(this.a + (this.c * f));
    }
}
