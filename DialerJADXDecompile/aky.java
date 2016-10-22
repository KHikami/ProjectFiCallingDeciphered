import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
public final class aky implements OnDragListener {
    private /* synthetic */ DialtactsActivity a;

    public aky(DialtactsActivity dialtactsActivity) {
        this.a = dialtactsActivity;
    }

    public final boolean onDrag(View view, DragEvent dragEvent) {
        if (dragEvent.getAction() == 2) {
            this.a.r.a(view, (int) dragEvent.getX(), (int) dragEvent.getY());
        }
        return true;
    }
}
