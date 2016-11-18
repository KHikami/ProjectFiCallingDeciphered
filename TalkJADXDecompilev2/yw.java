package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class yw extends yr implements SubMenu {
    public yw(Context context, jv jvVar) {
        super(context, jvVar);
    }

    private jv a() {
        return (jv) this.d;
    }

    public SubMenu setHeaderTitle(int i) {
        a().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        a().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        a().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        a().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        a().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        a().clearHeader();
    }

    public SubMenu setIcon(int i) {
        a().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        a().setIcon(drawable);
        return this;
    }

    public MenuItem getItem() {
        return a(a().getItem());
    }
}
