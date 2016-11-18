package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class csa implements OnTouchListener {
    final /* synthetic */ me f8971a;
    final /* synthetic */ crq f8972b;

    csa(crq crq, me meVar) {
        this.f8972b = crq;
        this.f8971a = meVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        crq crq = this.f8972b;
        switch (motionEvent.getAction()) {
            case 0:
                crq.m10842e();
                break;
            case 1:
                crq.m10841d();
                break;
        }
        if (this.f8971a.m31932a(motionEvent) && motionEvent.getAction() == 1) {
            return true;
        }
        return false;
    }
}
