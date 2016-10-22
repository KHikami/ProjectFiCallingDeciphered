import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
public final class tr extends su implements SubMenu {
    public su k;
    private sy l;

    public tr(Context context, su suVar, sy syVar) {
        super(context);
        this.k = suVar;
        this.l = syVar;
    }

    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    public final boolean b() {
        return this.k.b();
    }

    public final boolean c() {
        return this.k.c();
    }

    public final MenuItem getItem() {
        return this.l;
    }

    public final void a(sv svVar) {
        this.k.a(svVar);
    }

    public final su k() {
        return this.k.k();
    }

    final boolean a(su suVar, MenuItem menuItem) {
        return super.a(suVar, menuItem) || this.k.a(suVar, menuItem);
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        super.a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.a(0, null, 0, null, view);
        return this;
    }

    public final boolean a(sy syVar) {
        return this.k.a(syVar);
    }

    public final boolean b(sy syVar) {
        return this.k.b(syVar);
    }

    public final String a() {
        int itemId = this.l != null ? this.l.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }
}
