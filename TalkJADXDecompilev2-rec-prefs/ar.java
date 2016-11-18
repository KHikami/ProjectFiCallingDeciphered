package p000;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.MotionEvent;
import android.view.View;

public final class ar extends au<SnackbarLayout> {
    final /* synthetic */ Snackbar f2204a;

    ar(Snackbar snackbar) {
        this.f2204a = snackbar;
    }

    public boolean mo355b(View view) {
        return view instanceof SnackbarLayout;
    }

    private boolean m3814a(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
        if (coordinatorLayout.m3132a((View) snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    as.m3892a().m3900c(this.f2204a.f1503d);
                    break;
                case 1:
                case 3:
                    as.m3892a().m3901d(this.f2204a.f1503d);
                    break;
            }
        }
        return super.mo221a(coordinatorLayout, (View) snackbarLayout, motionEvent);
    }
}
