package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class cxs implements OnClickListener {
    final /* synthetic */ FloatingActionButton f9269a;

    public cxs(FloatingActionButton floatingActionButton) {
        this.f9269a = floatingActionButton;
    }

    public void onClick(View view) {
        if (this.f9269a.f6212a != null) {
            int i;
            cxt cxt = this.f9269a.f6212a;
            if (this.f9269a.f6215d != -1) {
                i = this.f9269a.f6215d;
            } else {
                i = this.f9269a.f6213b;
            }
            cxt.m11225a(i);
        }
    }
}
