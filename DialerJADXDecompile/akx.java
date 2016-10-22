import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
public final class akx implements OnTouchListener {
    private /* synthetic */ DialtactsActivity a;

    public akx(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a(true, false);
        DialtactsActivity dialtactsActivity = this.a;
        dialtactsActivity.t.a(dialtactsActivity.getResources().getDrawable(cob.an), dialtactsActivity.getResources().getString(cob.aW));
        dialtactsActivity.t.a(dialtactsActivity.y(), false);
        dialtactsActivity.t.a(300);
        return false;
    }
}
