package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class yv extends xy implements SubMenu {
    private xy f35864d;
    private yc f35865e;

    public yv(Context context, xy xyVar, yc ycVar) {
        super(context);
        this.f35864d = xyVar;
        this.f35865e = ycVar;
    }

    public void setQwertyMode(boolean z) {
        this.f35864d.setQwertyMode(z);
    }

    public boolean mo4538b() {
        return this.f35864d.mo4538b();
    }

    public boolean mo4540c() {
        return this.f35864d.mo4540c();
    }

    public Menu m41550u() {
        return this.f35864d;
    }

    public MenuItem getItem() {
        return this.f35865e;
    }

    public void mo4535a(xz xzVar) {
        this.f35864d.mo4535a(xzVar);
    }

    public xy mo4541r() {
        return this.f35864d.mo4541r();
    }

    boolean mo4536a(xy xyVar, MenuItem menuItem) {
        return super.mo4536a(xyVar, menuItem) || this.f35864d.mo4536a(xyVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f35865e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f35865e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m41407a(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m41434e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m41409a(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m41432d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m41408a(view);
    }

    public boolean mo4537a(yc ycVar) {
        return this.f35864d.mo4537a(ycVar);
    }

    public boolean mo4539b(yc ycVar) {
        return this.f35864d.mo4539b(ycVar);
    }

    public String mo4534a() {
        int itemId = this.f35865e != null ? this.f35865e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo4534a() + ":" + itemId;
    }
}
