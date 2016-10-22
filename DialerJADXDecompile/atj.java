import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
public final class atj implements OnFocusChangeListener {
    public atj(SearchEditTextLayout searchEditTextLayout) {
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            buf.x(view);
        } else {
            buf.y(view);
        }
    }
}
