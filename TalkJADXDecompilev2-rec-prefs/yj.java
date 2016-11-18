package p000;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class yj extends ye implements VisibilityListener {
    md f35829c;
    final /* synthetic */ yi f35830d;

    public yj(yi yiVar, Context context, ActionProvider actionProvider) {
        this.f35830d = yiVar;
        super(yiVar, context, actionProvider);
    }

    public View m41504a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    public boolean m41506b() {
        return this.a.overridesItemVisibility();
    }

    public boolean m41507c() {
        return this.a.isVisible();
    }

    public void m41505a(md mdVar) {
        this.f35829c = mdVar;
        this.a.setVisibilityListener(this);
    }

    public void onActionProviderVisibilityChanged(boolean z) {
        if (this.f35829c != null) {
            this.f35829c.a();
        }
    }
}
