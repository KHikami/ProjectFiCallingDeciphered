import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class pp implements OnClickListener {
    private /* synthetic */ po a;

    pp(po poVar) {
        this.a = poVar;
    }

    public final void onClick(View view) {
        Message obtain;
        if (view == this.a.n && this.a.p != null) {
            obtain = Message.obtain(this.a.p);
        } else if (view == this.a.q && this.a.s != null) {
            obtain = Message.obtain(this.a.s);
        } else if (view != this.a.t || this.a.v == null) {
            obtain = null;
        } else {
            obtain = Message.obtain(this.a.v);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        this.a.K.obtainMessage(1, this.a.b).sendToTarget();
    }
}
