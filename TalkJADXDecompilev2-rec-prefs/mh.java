package p000;

import android.os.Handler;
import android.os.Message;

final class mh extends Handler {
    final /* synthetic */ mg f27713a;

    mh(mg mgVar) {
        this.f27713a = mgVar;
    }

    mh(mg mgVar, Handler handler) {
        this.f27713a = mgVar;
        super(handler.getLooper());
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f27713a.f27640b.onShowPress(this.f27713a.f27645g);
                return;
            case 2:
                mg mgVar = this.f27713a;
                mgVar.f27639a.removeMessages(3);
                mgVar.f27643e = false;
                mgVar.f27644f = true;
                mgVar.f27640b.onLongPress(mgVar.f27645g);
                return;
            case 3:
                if (this.f27713a.f27641c == null) {
                    return;
                }
                if (this.f27713a.f27642d) {
                    this.f27713a.f27643e = true;
                    return;
                } else {
                    this.f27713a.f27641c.onSingleTapConfirmed(this.f27713a.f27645g);
                    return;
                }
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
