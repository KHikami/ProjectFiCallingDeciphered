package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

public final class cmb implements OnClickListener {
    final /* synthetic */ SlidingTabLayout f5618a;

    public cmb(SlidingTabLayout slidingTabLayout) {
        this.f5618a = slidingTabLayout;
    }

    public void onClick(View view) {
        for (int i = 0; i < this.f5618a.f6112c.getChildCount(); i++) {
            if (view == this.f5618a.f6112c.getChildAt(i)) {
                this.f5618a.f6110a.m3190b(i);
                return;
            }
        }
    }
}
