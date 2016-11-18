package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class yw extends yr implements SubMenu {
    public yw(Context context, jv jvVar) {
        super(context, jvVar);
    }

    private jv m33713a() {
        return (jv) this.d;
    }

    public SubMenu setHeaderTitle(int i) {
        m33713a().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m33713a().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        m33713a().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        m33713a().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m33713a().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        m33713a().clearHeader();
    }

    public SubMenu setIcon(int i) {
        m33713a().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        m33713a().setIcon(drawable);
        return this;
    }

    public MenuItem getItem() {
        return m33708a(m33713a().getItem());
    }
}
