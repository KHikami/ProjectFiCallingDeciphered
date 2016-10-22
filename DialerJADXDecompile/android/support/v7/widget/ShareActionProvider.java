package android.support.v7.widget;

import aab;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.SubMenu;
import android.view.View;
import buf;
import iv;
import up;
import uy;
import vi;

/* compiled from: PG */
public class ShareActionProvider extends iv {
    public final Context c;
    public String d;
    private int e;
    private final aab f;

    public ShareActionProvider(Context context) {
        super(context);
        this.e = 4;
        this.f = new aab(this);
        this.d = "share_history.xml";
        this.c = context;
    }

    public final View a() {
        View activityChooserView = new ActivityChooserView(this.c);
        if (!activityChooserView.isInEditMode()) {
            up a = up.a(this.c, this.d);
            uy uyVar = activityChooserView.a;
            up upVar = uyVar.c.a.a;
            if (upVar != null && uyVar.c.isShown()) {
                upVar.unregisterObserver(uyVar.c.i);
            }
            uyVar.a = a;
            if (a != null && uyVar.c.isShown()) {
                a.registerObserver(uyVar.c.i);
            }
            uyVar.notifyDataSetChanged();
            if (activityChooserView.d().q.isShowing()) {
                activityChooserView.b();
                activityChooserView.a();
            }
        }
        TypedValue typedValue = new TypedValue();
        this.c.getTheme().resolveAttribute(buf.x, typedValue, true);
        activityChooserView.e.setImageDrawable(vi.a().a(this.c, typedValue.resourceId, false));
        activityChooserView.h = this;
        activityChooserView.l = buf.ce;
        activityChooserView.e.setContentDescription(activityChooserView.getContext().getString(buf.cd));
        return activityChooserView;
    }

    public final boolean e() {
        return true;
    }

    public final void a(SubMenu subMenu) {
        int i;
        subMenu.clear();
        up a = up.a(this.c, this.d);
        PackageManager packageManager = this.c.getPackageManager();
        int a2 = a.a();
        int min = Math.min(a2, this.e);
        for (i = 0; i < min; i++) {
            ResolveInfo a3 = a.a(i);
            subMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.c.getString(buf.cb));
            for (i = 0; i < a2; i++) {
                a3 = a.a(i);
                addSubMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f);
            }
        }
    }
}
