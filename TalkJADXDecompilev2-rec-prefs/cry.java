package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class cry implements OnTouchListener {
    final /* synthetic */ me f8968a;
    final /* synthetic */ crq f8969b;

    cry(crq crq, me meVar) {
        this.f8969b = crq;
        this.f8968a = meVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        crq crq = this.f8969b;
        switch (motionEvent.getAction()) {
            case 0:
                crq.m10842e();
                break;
            case 1:
                crq.m10841d();
                break;
        }
        return this.f8968a.m31932a(motionEvent);
    }
}
