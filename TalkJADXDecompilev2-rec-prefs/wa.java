package p000;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

final class wa extends xj {
    final /* synthetic */ vv f35422a;

    public wa(vv vvVar, Callback callback) {
        this.f35422a = vvVar;
        super(callback);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel && !this.f35422a.f35407b) {
            this.f35422a.f35406a.j();
            this.f35422a.f35407b = true;
        }
        return onPreparePanel;
    }

    public View onCreatePanelView(int i) {
        switch (i) {
            case 0:
                Menu p = this.f35422a.f35406a.p();
                if (onPreparePanel(i, null, p) && onMenuOpened(i, p)) {
                    vv vvVar = this.f35422a;
                    if (vvVar.f35409d == null && (p instanceof xy)) {
                        xy xyVar = (xy) p;
                        Context b = vvVar.f35406a.b();
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
                        vvVar.f35409d = new xv(contextThemeWrapper, gwb.bV);
                        vvVar.f35409d.mo4511a(new vz(vvVar));
                        xyVar.m41415a(vvVar.f35409d);
                    }
                    if (p == null || vvVar.f35409d == null) {
                        return null;
                    }
                    return vvVar.f35409d.m41384a().getCount() > 0 ? (View) vvVar.f35409d.m41385a(vvVar.f35406a.a()) : null;
                }
                break;
        }
        return super.onCreatePanelView(i);
    }
}
