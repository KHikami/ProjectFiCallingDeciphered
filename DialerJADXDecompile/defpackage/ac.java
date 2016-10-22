package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: ac */
public final class ac extends aj {
    private /* synthetic */ Snackbar g;

    ac(Snackbar snackbar) {
        this.g = snackbar;
    }

    public final boolean a(View view) {
        return view instanceof SnackbarLayout;
    }

    private boolean a(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
        if (coordinatorLayout.a((View) snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            switch (motionEvent.getActionMasked()) {
                case rl.c /*0*/:
                    af.a().a(this.g.e);
                    break;
                case rq.b /*1*/:
                case rl.e /*3*/:
                    af.a().b(this.g.e);
                    break;
            }
        }
        return super.a(coordinatorLayout, (View) snackbarLayout, motionEvent);
    }
}
