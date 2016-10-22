package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: ts */
public final class ts extends tn implements SubMenu {
    public ts(Context context, hr hrVar) {
        super(context, hrVar);
    }

    public final SubMenu setHeaderTitle(int i) {
        ((hr) this.d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((hr) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        ((hr) this.d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((hr) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((hr) this.d).setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        ((hr) this.d).clearHeader();
    }

    public final SubMenu setIcon(int i) {
        ((hr) this.d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((hr) this.d).setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return a(((hr) this.d).getItem());
    }
}
