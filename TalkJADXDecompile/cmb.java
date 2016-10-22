import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

public final class cmb implements OnClickListener {
    final /* synthetic */ SlidingTabLayout a;

    public cmb(SlidingTabLayout slidingTabLayout) {
        this.a = slidingTabLayout;
    }

    public void onClick(View view) {
        for (int i = 0; i < this.a.c.getChildCount(); i++) {
            if (view == this.a.c.getChildAt(i)) {
                this.a.a.b(i);
                return;
            }
        }
    }
}
