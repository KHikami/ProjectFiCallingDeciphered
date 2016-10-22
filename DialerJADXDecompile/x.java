import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;

public final class x implements OnClickListener {
    private /* synthetic */ OnClickListener a;
    private /* synthetic */ Snackbar b;

    public x(Snackbar snackbar, OnClickListener onClickListener) {
        this.b = snackbar;
        this.a = onClickListener;
    }

    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.b(1);
    }
}
