import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
final class tf extends ta implements VisibilityListener {
    private ix d;

    public tf(te teVar, Context context, ActionProvider actionProvider) {
        super(teVar, context, actionProvider);
    }

    public final View a(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    public final boolean b() {
        return this.c.overridesItemVisibility();
    }

    public final boolean c() {
        return this.c.isVisible();
    }

    public final void a(ix ixVar) {
        this.d = ixVar;
        this.c.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.d != null) {
            this.d.a();
        }
    }
}
