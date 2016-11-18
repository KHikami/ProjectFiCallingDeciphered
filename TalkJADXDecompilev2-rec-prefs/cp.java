package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;

final class cp implements cn {
    private TimeInterpolator f8756a;

    cp() {
    }

    public void mo1032a(View view) {
        if (this.f8756a == null) {
            this.f8756a = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.f8756a);
    }
}
