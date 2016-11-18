package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class yf extends FrameLayout implements wz {
    final CollapsibleActionView f35826a;

    yf(View view) {
        super(view.getContext());
        this.f35826a = (CollapsibleActionView) view;
        addView(view);
    }

    public void mo4530a() {
        this.f35826a.onActionViewExpanded();
    }

    public void mo4531b() {
        this.f35826a.onActionViewCollapsed();
    }

    View m41501c() {
        return (View) this.f35826a;
    }
}
