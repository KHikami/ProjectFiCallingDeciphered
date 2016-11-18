package p000;

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
    private static String f35798w;
    private static String f35799x;
    private static String f35800y;
    private static String f35801z;
    public xy f35802a;
    private final int f35803b;
    private final int f35804c;
    private final int f35805d;
    private final int f35806e;
    private CharSequence f35807f;
    private CharSequence f35808g;
    private Intent f35809h;
    private char f35810i;
    private char f35811j;
    private Drawable f35812k;
    private int f35813l = 0;
    private yv f35814m;
    private Runnable f35815n;
    private OnMenuItemClickListener f35816o;
    private int f35817p = 16;
    private int f35818q = 0;
    private View f35819r;
    private mb f35820s;
    private ng f35821t;
    private boolean f35822u = false;
    private ContextMenuInfo f35823v;

    public /* synthetic */ MenuItem setActionView(int i) {
        return m41469a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m41470a(view);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m41471b(i);
    }

    yc(xy xyVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f35802a = xyVar;
        this.f35803b = i2;
        this.f35804c = i;
        this.f35805d = i3;
        this.f35806e = i4;
        this.f35807f = charSequence;
        this.f35818q = i5;
    }

    public boolean m41480b() {
        if ((this.f35816o != null && this.f35816o.onMenuItemClick(this)) || this.f35802a.mo4536a(this.f35802a.mo4541r(), (MenuItem) this)) {
            return true;
        }
        if (this.f35815n != null) {
            this.f35815n.run();
            return true;
        }
        if (this.f35809h != null) {
            try {
                this.f35802a.m41433e().startActivity(this.f35809h);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.f35820s == null || !this.f35820s.d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f35817p & 16) != 0;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f35817p |= 16;
        } else {
            this.f35817p &= -17;
        }
        this.f35802a.m41425b(false);
        return this;
    }

    public int getGroupId() {
        return this.f35804c;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f35803b;
    }

    public int getOrder() {
        return this.f35805d;
    }

    public int m41481c() {
        return this.f35806e;
    }

    public Intent getIntent() {
        return this.f35809h;
    }

    public MenuItem setIntent(Intent intent) {
        this.f35809h = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f35811j;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f35811j != c) {
            this.f35811j = Character.toLowerCase(c);
            this.f35802a.m41425b(false);
        }
        return this;
    }

    public char getNumericShortcut() {
        return this.f35810i;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f35810i != c) {
            this.f35810i = c;
            this.f35802a.m41425b(false);
        }
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f35810i = c;
        this.f35811j = Character.toLowerCase(c2);
        this.f35802a.m41425b(false);
        return this;
    }

    public char m41483d() {
        return this.f35802a.mo4538b() ? this.f35811j : this.f35810i;
    }

    public String m41485e() {
        char d = m41483d();
        if (d == '\u0000') {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(f35798w);
        switch (d) {
            case '\b':
                stringBuilder.append(f35800y);
                break;
            case '\n':
                stringBuilder.append(f35799x);
                break;
            case ' ':
                stringBuilder.append(f35801z);
                break;
            default:
                stringBuilder.append(d);
                break;
        }
        return stringBuilder.toString();
    }

    public boolean m41487f() {
        return this.f35802a.mo4540c() && m41483d() != '\u0000';
    }

    public SubMenu getSubMenu() {
        return this.f35814m;
    }

    public boolean hasSubMenu() {
        return this.f35814m != null;
    }

    public void m41477a(yv yvVar) {
        this.f35814m = yvVar;
        yvVar.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f35807f;
    }

    public CharSequence m41472a(yq yqVar) {
        if (yqVar == null || !yqVar.m41524b()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f35807f = charSequence;
        this.f35802a.m41425b(false);
        if (this.f35814m != null) {
            this.f35814m.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.f35802a.m41433e().getString(i));
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f35808g != null ? this.f35808g : this.f35807f;
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f35808g = charSequence;
        this.f35802a.m41425b(false);
        return this;
    }

    public Drawable getIcon() {
        if (this.f35812k != null) {
            return this.f35812k;
        }
        if (this.f35813l == 0) {
            return null;
        }
        Drawable b = wk.m41196b(this.f35802a.m41433e(), this.f35813l);
        this.f35813l = 0;
        this.f35812k = b;
        return b;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f35813l = 0;
        this.f35812k = drawable;
        this.f35802a.m41425b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f35812k = null;
        this.f35813l = i;
        this.f35802a.m41425b(false);
        return this;
    }

    public boolean isCheckable() {
        return (this.f35817p & 1) == 1;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f35817p;
        this.f35817p = (z ? 1 : 0) | (this.f35817p & -2);
        if (i != this.f35817p) {
            this.f35802a.m41425b(false);
        }
        return this;
    }

    public void m41478a(boolean z) {
        this.f35817p = (z ? 4 : 0) | (this.f35817p & -5);
    }

    public boolean m41488g() {
        return (this.f35817p & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f35817p & 2) == 2;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f35817p & 4) != 0) {
            this.f35802a.m41412a((MenuItem) this);
        } else {
            m41479b(z);
        }
        return this;
    }

    void m41479b(boolean z) {
        int i;
        int i2 = this.f35817p;
        int i3 = this.f35817p & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f35817p = i | i3;
        if (i2 != this.f35817p) {
            this.f35802a.m41425b(false);
        }
    }

    public boolean isVisible() {
        if (this.f35820s == null || !this.f35820s.b()) {
            if ((this.f35817p & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.f35817p & 8) == 0 && this.f35820s.c()) {
            return true;
        } else {
            return false;
        }
    }

    boolean m41482c(boolean z) {
        int i = this.f35817p;
        this.f35817p = (z ? 0 : 8) | (this.f35817p & -9);
        if (i != this.f35817p) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean z) {
        if (m41482c(z)) {
            this.f35802a.m41438i();
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f35816o = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        return this.f35807f != null ? this.f35807f.toString() : null;
    }

    void m41476a(ContextMenuInfo contextMenuInfo) {
        this.f35823v = contextMenuInfo;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f35823v;
    }

    public boolean m41489h() {
        return this.f35802a.m41448s();
    }

    public boolean m41490i() {
        return (this.f35817p & 32) == 32;
    }

    public boolean m41491j() {
        return (this.f35818q & 1) == 1;
    }

    public boolean m41492k() {
        return (this.f35818q & 2) == 2;
    }

    public void m41484d(boolean z) {
        if (z) {
            this.f35817p |= 32;
        } else {
            this.f35817p &= -33;
        }
    }

    public boolean m41493l() {
        return (this.f35818q & 4) == 4;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f35818q = i;
                this.f35802a.m41439j();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    private ju m41470a(View view) {
        this.f35819r = view;
        this.f35820s = null;
        if (view != null && view.getId() == -1 && this.f35803b > 0) {
            view.setId(this.f35803b);
        }
        this.f35802a.m41439j();
        return this;
    }

    private ju m41469a(int i) {
        Context e = this.f35802a.m41433e();
        m41470a(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public View getActionView() {
        if (this.f35819r != null) {
            return this.f35819r;
        }
        if (this.f35820s == null) {
            return null;
        }
        this.f35819r = this.f35820s.a(this);
        return this.f35819r;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public mb m41475a() {
        return this.f35820s;
    }

    public ju m41473a(mb mbVar) {
        if (this.f35820s != null) {
            this.f35820s.f();
        }
        this.f35819r = null;
        this.f35820s = mbVar;
        this.f35802a.m41425b(true);
        if (this.f35820s != null) {
            this.f35820s.a(new md(this));
        }
        return this;
    }

    private ju m41471b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        if (!m41494m()) {
            return false;
        }
        if (this.f35821t == null || this.f35821t.mo4532a(this)) {
            return this.f35802a.mo4537a(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.f35818q & 8) == 0) {
            return false;
        }
        if (this.f35819r == null) {
            return true;
        }
        if (this.f35821t == null || this.f35821t.mo4533b(this)) {
            return this.f35802a.mo4539b(this);
        }
        return false;
    }

    public ju m41474a(ng ngVar) {
        this.f35821t = ngVar;
        return this;
    }

    public boolean m41494m() {
        if ((this.f35818q & 8) == 0) {
            return false;
        }
        if (this.f35819r == null && this.f35820s != null) {
            this.f35819r = this.f35820s.a(this);
        }
        if (this.f35819r != null) {
            return true;
        }
        return false;
    }

    public void m41486e(boolean z) {
        this.f35822u = z;
        this.f35802a.m41425b(false);
    }

    public boolean isActionViewExpanded() {
        return this.f35822u;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
}
