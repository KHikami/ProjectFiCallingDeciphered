package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;

final class cp implements cn {
    private TimeInterpolator a;

    cp() {
    }

    public void a(View view) {
        if (this.a == null) {
            this.a = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.a);
    }
}
