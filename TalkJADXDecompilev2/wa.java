package defpackage;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

final class wa extends xj {
    final /* synthetic */ vv a;

    public wa(vv vvVar, Callback callback) {
        this.a = vvVar;
        super(callback);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel && !this.a.b) {
            this.a.a.j();
            this.a.b = true;
        }
        return onPreparePanel;
    }

    public View onCreatePanelView(int i) {
        switch (i) {
            case 0:
                Menu p = this.a.a.p();
                if (onPreparePanel(i, null, p) && onMenuOpened(i, p)) {
                    vv vvVar = this.a;
                    if (vvVar.d == null && (p instanceof xy)) {
                        xy xyVar = (xy) p;
                        Context b = vvVar.a.b();
                        TypedValue typedValue = new TypedValue();
                        Theme newTheme = b.getResources().newTheme();
                        newTheme.setTo(b.getTheme());
                        newTheme.resolveAttribute(gwb.q, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme.applyStyle(typedValue.resourceId, true);
                        }
                        newTheme.resolveAttribute(gwb.W, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme.applyStyle(typedValue.resourceId, true);
                        } else {
                            newTheme.applyStyle(gwb.ch, true);
                        }
                        Context contextThemeWrapper = new ContextThemeWrapper(b, 0);
                        contextThemeWrapper.getTheme().setTo(newTheme);
                        vvVar.d = new xv(contextThemeWrapper, gwb.bV);
                        vvVar.d.a(new vz(vvVar));
                        xyVar.a(vvVar.d);
                    }
                    if (p == null || vvVar.d == null) {
                        return null;
                    }
                    return vvVar.d.a().getCount() > 0 ? (View) vvVar.d.a(vvVar.a.a()) : null;
                }
                break;
        }
        return super.onCreatePanelView(i);
    }
}
