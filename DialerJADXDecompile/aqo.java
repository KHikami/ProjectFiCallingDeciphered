import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnLongClickListener;

/* compiled from: PG */
final class aqo implements OnLongClickListener {
    aqo(aqn aqn) {
    }

    public final boolean onLongClick(View view) {
        ((aqn) view).startDrag(aqn.g, new DragShadowBuilder(), "PHONE_FAVORITE_TILE", 0);
        return true;
    }
}
