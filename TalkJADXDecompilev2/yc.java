package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class yc implements ju {
    private static String w;
    private static String x;
    private static String y;
    private static String z;
    public xy a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private CharSequence f;
    private CharSequence g;
    private Intent h;
    private char i;
    private char j;
    private Drawable k;
    private int l = 0;
    private yv m;
    private Runnable n;
    private OnMenuItemClickListener o;
    private int p = 16;
    private int q = 0;
    private View r;
    private mb s;
    private ng t;
    private boolean u = false;
    private ContextMenuInfo v;

    public /* synthetic */ MenuItem setActionView(int i) {
        return a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return a(view);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return b(i);
    }

    yc(xy xyVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.a = xyVar;
        this.b = i2;
        this.c = i;
        this.d = i3;
        this.e = i4;
        this.f = charSequence;
        this.q = i5;
    }

    public boolean b() {
        if ((this.o != null && this.o.onMenuItemClick(this)) || this.a.a(this.a.r(), (MenuItem) this)) {
            return true;
        }
        if (this.n != null) {
            this.n.run();
            return true;
        }
        if (this.h != null) {
            try {
                this.a.e().startActivity(this.h);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.s == null || !this.s.d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.p |= 16;
        } else {
            this.p &= -17;
        }
        this.a.b(false);
        return this;
    }

    public int getGroupId() {
        return this.c;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.b;
    }

    public int getOrder() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public Intent getIntent() {
        return this.h;
    }

    public MenuItem setIntent(Intent intent) {
        this.h = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j != c) {
            this.j = Character.toLowerCase(c);
            this.a.b(false);
        }
        return this;
    }

    public char getNumericShortcut() {
        return this.i;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.i != c) {
            this.i = c;
            this.a.b(false);
        }
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.i = c;
        this.j = Character.toLowerCase(c2);
        this.a.b(false);
        return this;
    }

    public char d() {
        return this.a.b() ? this.j : this.i;
    }

    public String e() {
        char d = d();
        if (d == '\u0000') {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(w);
        switch (d) {
            case '\b':
                stringBuilder.append(y);
                break;
            case '\n':
                stringBuilder.append(x);
                break;
            case ' ':
                stringBuilder.append(z);
                break;
            default:
                stringBuilder.append(d);
                break;
        }
        return stringBuilder.toString();
    }

    public boolean f() {
        return this.a.c() && d() != '\u0000';
    }

    public SubMenu getSubMenu() {
        return this.m;
    }

    public boolean hasSubMenu() {
        return this.m != null;
    }

    public void a(yv yvVar) {
        this.m = yvVar;
        yvVar.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f;
    }

    public CharSequence a(yq yqVar) {
        if (yqVar == null || !yqVar.b()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f = charSequence;
        this.a.b(false);
        if (this.m != null) {
            this.m.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.a.e().getString(i));
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.g != null ? this.g : this.f;
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.g = charSequence;
        this.a.b(false);
        return this;
    }

    public Drawable getIcon() {
        if (this.k != null) {
            return this.k;
        }
        if (this.l == 0) {
            return null;
        }
        Drawable b = wk.b(this.a.e(), this.l);
        this.l = 0;
        this.k = b;
        return b;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.l = 0;
        this.k = drawable;
        this.a.b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.k = null;
        this.l = i;
        this.a.b(false);
        return this;
    }

    public boolean isCheckable() {
        return (this.p & 1) == 1;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.p;
        this.p = (z ? 1 : 0) | (this.p & -2);
        if (i != this.p) {
            this.a.b(false);
        }
        return this;
    }

    public void a(boolean z) {
        this.p = (z ? 4 : 0) | (this.p & -5);
    }

    public boolean g() {
        return (this.p & 4) != 0;
    }

    public boolean isChecked() {
        return (this.p & 2) == 2;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.p & 4) != 0) {
            this.a.a((MenuItem) this);
        } else {
            b(z);
        }
        return this;
    }

    void b(boolean z) {
        int i;
        int i2 = this.p;
        int i3 = this.p & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.p = i | i3;
        if (i2 != this.p) {
            this.a.b(false);
        }
    }

    public boolean isVisible() {
        if (this.s == null || !this.s.b()) {
            if ((this.p & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.p & 8) == 0 && this.s.c()) {
            return true;
        } else {
            return false;
        }
    }

    boolean c(boolean z) {
        int i = this.p;
        this.p = (z ? 0 : 8) | (this.p & -9);
        if (i != this.p) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean z) {
        if (c(z)) {
            this.a.i();
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.o = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        return this.f != null ? this.f.toString() : null;
    }

    void a(ContextMenuInfo contextMenuInfo) {
        this.v = contextMenuInfo;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.v;
    }

    public boolean h() {
        return this.a.s();
    }

    public boolean i() {
        return (this.p & 32) == 32;
    }

    public boolean j() {
        return (this.q & 1) == 1;
    }

    public boolean k() {
        return (this.q & 2) == 2;
    }

    public void d(boolean z) {
        if (z) {
            this.p |= 32;
        } else {
            this.p &= -33;
        }
    }

    public boolean l() {
        return (this.q & 4) == 4;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.q = i;
                this.a.j();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    private ju a(View view) {
        this.r = view;
        this.s = null;
        if (view != null && view.getId() == -1 && this.b > 0) {
            view.setId(this.b);
        }
        this.a.j();
        return this;
    }

    private ju a(int i) {
        Context e = this.a.e();
        a(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public View getActionView() {
        if (this.r != null) {
            return this.r;
        }
        if (this.s == null) {
            return null;
        }
        this.r = this.s.a(this);
        return this.r;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public mb a() {
        return this.s;
    }

    public ju a(mb mbVar) {
        if (this.s != null) {
            this.s.f();
        }
        this.r = null;
        this.s = mbVar;
        this.a.b(true);
        if (this.s != null) {
            this.s.a(new md(this));
        }
        return this;
    }

    private ju b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        if (this.t == null || this.t.a(this)) {
            return this.a.a(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.q & 8) == 0) {
            return false;
        }
        if (this.r == null) {
            return true;
        }
        if (this.t == null || this.t.b(this)) {
            return this.a.b(this);
        }
        return false;
    }

    public ju a(ng ngVar) {
        this.t = ngVar;
        return this;
    }

    public boolean m() {
        if ((this.q & 8) == 0) {
            return false;
        }
        if (this.r == null && this.s != null) {
            this.r = this.s.a(this);
        }
        if (this.r != null) {
            return true;
        }
        return false;
    }

    public void e(boolean z) {
        this.u = z;
        this.a.b(false);
    }

    public boolean isActionViewExpanded() {
        return this.u;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
}
