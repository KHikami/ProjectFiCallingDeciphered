import android.view.View;
import android.view.View.OnLongClickListener;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
public final class ati implements OnLongClickListener {
    private /* synthetic */ SearchEditTextLayout a;

    public ati(SearchEditTextLayout searchEditTextLayout) {
        this.a = searchEditTextLayout;
    }

    public final boolean onLongClick(View view) {
        this.a.e.performClick();
        this.a.d.performLongClick();
        return false;
    }
}
