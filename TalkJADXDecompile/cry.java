import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class cry implements OnTouchListener {
    final /* synthetic */ me a;
    final /* synthetic */ crq b;

    cry(crq crq, me meVar) {
        this.b = crq;
        this.a = meVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        crq crq = this.b;
        switch (motionEvent.getAction()) {
            case wi.w /*0*/:
                crq.e();
                break;
            case wi.j /*1*/:
                crq.d();
                break;
        }
        return this.a.a(motionEvent);
    }
}
