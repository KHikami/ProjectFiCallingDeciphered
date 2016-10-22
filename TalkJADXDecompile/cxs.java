import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class cxs implements OnClickListener {
    final /* synthetic */ FloatingActionButton a;

    public cxs(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public void onClick(View view) {
        if (this.a.a != null) {
            int i;
            cxt cxt = this.a.a;
            if (this.a.d != -1) {
                i = this.a.d;
            } else {
                i = this.a.b;
            }
            cxt.a(i);
        }
    }
}
