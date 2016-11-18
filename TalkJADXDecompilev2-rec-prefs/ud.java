package p000;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class ud implements OnClickListener {
    final /* synthetic */ uc f35236a;

    ud(uc ucVar) {
        this.f35236a = ucVar;
    }

    public void onClick(View view) {
        Message obtain;
        if (view == this.f35236a.f35212c && this.f35236a.f35213d != null) {
            obtain = Message.obtain(this.f35236a.f35213d);
        } else if (view == this.f35236a.f35214e && this.f35236a.f35215f != null) {
            obtain = Message.obtain(this.f35236a.f35215f);
        } else if (view != this.f35236a.f35216g || this.f35236a.f35217h == null) {
            obtain = null;
        } else {
            obtain = Message.obtain(this.f35236a.f35217h);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        this.f35236a.f35225p.obtainMessage(1, this.f35236a.f35210a).sendToTarget();
    }
}
