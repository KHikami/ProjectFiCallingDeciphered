import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.dialer.app.dialpad.DialpadFragment;

/* compiled from: PG */
public final class aol implements OnTouchListener {
    private /* synthetic */ DialpadFragment a;

    public aol(DialpadFragment dialpadFragment) {
        this.a = dialpadFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.a.d()) {
            return false;
        }
        if (this.a.getActivity() != null) {
            return ((aos) this.a.getActivity()).p();
        }
        return true;
    }
}
