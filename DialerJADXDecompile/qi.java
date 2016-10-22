import android.content.Context;
import android.content.res.Resources.Theme;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Window.Callback;
import android.widget.PopupWindow;

/* compiled from: PG */
class qi extends qd {
    private /* synthetic */ qh a;

    qi(qh qhVar, Callback callback) {
        this.a = qhVar;
        super(qhVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (this.a.n) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    final ActionMode a(ActionMode.Callback callback) {
        Object rzVar = new rz(this.a.b, callback);
        ql qlVar = this.a;
        if (qlVar.p != null) {
            qlVar.p.c();
        }
        ru qsVar = new qs(qlVar, rzVar);
        pl a = qlVar.a();
        if (a != null) {
            qlVar.p = a.a(qsVar);
        }
        if (qlVar.p == null) {
            qlVar.l();
            if (qlVar.p != null) {
                qlVar.p.c();
            }
            if (qlVar.q == null) {
                if (qlVar.j) {
                    Context rwVar;
                    TypedValue typedValue = new TypedValue();
                    Theme theme = qlVar.b.getTheme();
                    theme.resolveAttribute(buf.t, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Theme newTheme = qlVar.b.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        rwVar = new rw(qlVar.b, 0);
                        rwVar.getTheme().setTo(newTheme);
                    } else {
                        rwVar = qlVar.b;
                    }
                    qlVar.q = new ActionBarContextView(rwVar);
                    qlVar.r = new PopupWindow(rwVar, null, buf.w);
                    oq.a(qlVar.r, 2);
                    qlVar.r.setContentView(qlVar.q);
                    qlVar.r.setWidth(-1);
                    rwVar.getTheme().resolveAttribute(buf.p, typedValue, true);
                    qlVar.q.d = TypedValue.complexToDimensionPixelSize(typedValue.data, rwVar.getResources().getDisplayMetrics());
                    qlVar.r.setHeight(-2);
                    qlVar.s = new qo(qlVar);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) qlVar.u.findViewById(buf.bi);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(qlVar.k());
                        qlVar.q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (qlVar.q != null) {
                boolean z;
                qlVar.l();
                qlVar.q.b();
                Context context = qlVar.q.getContext();
                ActionBarContextView actionBarContextView = qlVar.q;
                if (qlVar.r == null) {
                    z = true;
                } else {
                    z = false;
                }
                rt rxVar = new rx(context, actionBarContextView, qsVar, z);
                if (qsVar.a(rxVar, rxVar.b())) {
                    rxVar.d();
                    qlVar.q.a(rxVar);
                    qlVar.p = rxVar;
                    kn.c(qlVar.q, 0.0f);
                    qlVar.t = kn.l(qlVar.q).a(1.0f);
                    qlVar.t.a(new qq(qlVar));
                    if (qlVar.r != null) {
                        qlVar.c.getDecorView().post(qlVar.s);
                    }
                } else {
                    qlVar.p = null;
                }
            }
            qlVar.p = qlVar.p;
        }
        rt rtVar = qlVar.p;
        if (rtVar != null) {
            return rzVar.b(rtVar);
        }
        return null;
    }
}
