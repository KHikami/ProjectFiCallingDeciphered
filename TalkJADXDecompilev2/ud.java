package defpackage;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class ud implements OnClickListener {
    final /* synthetic */ uc a;

    ud(uc ucVar) {
        this.a = ucVar;
    }

    public void onClick(View view) {
        Message obtain;
        if (view == this.a.c && this.a.d != null) {
            obtain = Message.obtain(this.a.d);
        } else if (view == this.a.e && this.a.f != null) {
            obtain = Message.obtain(this.a.f);
        } else if (view != this.a.g || this.a.h == null) {
            obtain = null;
        } else {
            obtain = Message.obtain(this.a.h);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        this.a.p.obtainMessage(1, this.a.a).sendToTarget();
    }
}
