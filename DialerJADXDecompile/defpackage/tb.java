package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: tb */
final class tb extends FrameLayout implements rv {
    final CollapsibleActionView a;

    tb(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void a() {
        this.a.onActionViewExpanded();
    }

    public final void b() {
        this.a.onActionViewCollapsed();
    }
}
