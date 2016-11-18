package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class yv extends xy implements SubMenu {
    private xy d;
    private yc e;

    public yv(Context context, xy xyVar, yc ycVar) {
        super(context);
        this.d = xyVar;
        this.e = ycVar;
    }

    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    public boolean b() {
        return this.d.b();
    }

    public boolean c() {
        return this.d.c();
    }

    public Menu u() {
        return this.d;
    }

    public MenuItem getItem() {
        return this.e;
    }

    public void a(xz xzVar) {
        this.d.a(xzVar);
    }

    public xy r() {
        return this.d.r();
    }

    boolean a(xy xyVar, MenuItem menuItem) {
        return super.a(xyVar, menuItem) || this.d.a(xyVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.a(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a(view);
    }

    public boolean a(yc ycVar) {
        return this.d.a(ycVar);
    }

    public boolean b(yc ycVar) {
        return this.d.b(ycVar);
    }

    public String a() {
        int itemId = this.e != null ? this.e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }
}
