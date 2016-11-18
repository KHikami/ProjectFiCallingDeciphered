package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class csa implements OnTouchListener {
    final /* synthetic */ me a;
    final /* synthetic */ crq b;

    csa(crq crq, me meVar) {
        this.b = crq;
        this.a = meVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        crq crq = this.b;
        switch (motionEvent.getAction()) {
            case 0:
                crq.e();
                break;
            case 1:
                crq.d();
                break;
        }
        if (this.a.a(motionEvent) && motionEvent.getAction() == 1) {
            return true;
        }
        return false;
    }
}
