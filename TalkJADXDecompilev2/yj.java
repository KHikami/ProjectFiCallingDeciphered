package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class yj extends ye implements VisibilityListener {
    md c;
    final /* synthetic */ yi d;

    public yj(yi yiVar, Context context, ActionProvider actionProvider) {
        this.d = yiVar;
        super(yiVar, context, actionProvider);
    }

    public View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    public boolean b() {
        return this.a.overridesItemVisibility();
    }

    public boolean c() {
        return this.a.isVisible();
    }

    public void a(md mdVar) {
        this.c = mdVar;
        this.a.setVisibilityListener(this);
    }

    public void onActionProviderVisibilityChanged(boolean z) {
        if (this.c != null) {
            this.c.a();
        }
    }
}
