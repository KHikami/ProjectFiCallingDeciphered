package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.MotionEvent;
import android.view.View;

public final class ar extends au<SnackbarLayout> {
    final /* synthetic */ Snackbar a;

    ar(Snackbar snackbar) {
        this.a = snackbar;
    }

    public boolean b(View view) {
        return view instanceof SnackbarLayout;
    }

    private boolean a(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
        if (coordinatorLayout.a((View) snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    as.a().c(this.a.d);
                    break;
                case 1:
                case 3:
                    as.a().d(this.a.d);
                    break;
            }
        }
        return super.a(coordinatorLayout, (View) snackbarLayout, motionEvent);
    }
}
