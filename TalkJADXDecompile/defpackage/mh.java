package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: mh */
final class mh extends Handler {
    final /* synthetic */ mg a;

    mh(mg mgVar) {
        this.a = mgVar;
    }

    mh(mg mgVar, Handler handler) {
        this.a = mgVar;
        super(handler.getLooper());
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                this.a.b.onShowPress(this.a.g);
            case wi.l /*2*/:
                mg mgVar = this.a;
                mgVar.a.removeMessages(3);
                mgVar.e = false;
                mgVar.f = true;
                mgVar.b.onLongPress(mgVar.g);
            case wi.z /*3*/:
                if (this.a.c == null) {
                    return;
                }
                if (this.a.d) {
                    this.a.e = true;
                } else {
                    this.a.c.onSingleTapConfirmed(this.a.g);
                }
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
