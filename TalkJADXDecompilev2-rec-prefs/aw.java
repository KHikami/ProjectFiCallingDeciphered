package p000;

import android.support.design.widget.Snackbar;
import android.view.View;

public class aw {
    final /* synthetic */ Snackbar f2420a;

    public void m4158a(View view) {
        view.setVisibility(8);
        as.m3892a().m3897a(this.f2420a.f1503d, 0);
    }

    public void m4157a(int i) {
        switch (i) {
            case 0:
                as.m3892a().m3901d(this.f2420a.f1503d);
                return;
            case 1:
            case 2:
                as.m3892a().m3900c(this.f2420a.f1503d);
                return;
            default:
                return;
        }
    }

    aw(Snackbar snackbar) {
        this.f2420a = snackbar;
    }
}
