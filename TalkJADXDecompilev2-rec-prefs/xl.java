package p000;

import android.support.v7.view.menu.ActionMenuItemView;

public final class xl extends acm {
    final /* synthetic */ ActionMenuItemView f35695a;

    public xl(ActionMenuItemView actionMenuItemView) {
        this.f35695a = actionMenuItemView;
        super(actionMenuItemView);
    }

    public ys m41312a() {
        if (this.f35695a.c != null) {
            return this.f35695a.c.m41314a();
        }
        return null;
    }

    protected boolean m41313b() {
        if (this.f35695a.b == null || !this.f35695a.b.m41464a(this.f35695a.a)) {
            return false;
        }
        ys a = m41312a();
        if (a == null || !a.mo4527d()) {
            return false;
        }
        return true;
    }
}
