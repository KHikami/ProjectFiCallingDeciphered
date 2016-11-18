package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class yf extends FrameLayout implements wz {
    final CollapsibleActionView a;

    yf(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public void a() {
        this.a.onActionViewExpanded();
    }

    public void b() {
        this.a.onActionViewCollapsed();
    }

    View c() {
        return (View) this.a;
    }
}
