package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class cft implements OnTouchListener {
    final /* synthetic */ cfs a;

    cft(cfs cfs) {
        this.a = cfs;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a.ag();
        return false;
    }
}
