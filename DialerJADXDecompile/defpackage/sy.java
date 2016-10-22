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

/* compiled from: PG */
/* renamed from: sy */
public final class sy implements hq {
    final int a;
    public su b;
    public int c;
    public iv d;
    private final int e;
    private final int f;
    private final int g;
    private CharSequence h;
    private CharSequence i;
    private Intent j;
    private char k;
    private char l;
    private Drawable m;
    private int n;
    private tr o;
    private OnMenuItemClickListener p;
    private int q;
    private View r;
    private jv s;
    private boolean t;
    private ContextMenuInfo u;

    public final /* synthetic */ MenuItem setActionView(View view) {
        return a(view);
    }

    sy(su suVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = 0;
        this.q = 16;
        this.c = 0;
        this.t = false;
        this.b = suVar;
        this.e = i2;
        this.f = i;
        this.g = i3;
        this.a = i4;
        this.h = charSequence;
        this.c = i5;
    }

    public final boolean b() {
        if ((this.p != null && this.p.onMenuItemClick(this)) || this.b.a(this.b.k(), (MenuItem) this)) {
            return true;
        }
        if (this.j != null) {
            try {
                this.b.a.startActivity(this.j);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.d == null || !this.d.d()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.q & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.q |= 16;
        } else {
            this.q &= -17;
        }
        this.b.b(false);
        return this;
    }

    public final int getGroupId() {
        return this.f;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.e;
    }

    public final int getOrder() {
        return this.g;
    }

    public final Intent getIntent() {
        return this.j;
    }

    public final MenuItem setIntent(Intent intent) {
        this.j = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.l;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.l != c) {
            this.l = Character.toLowerCase(c);
            this.b.b(false);
        }
        return this;
    }

    public final char getNumericShortcut() {
        return this.k;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.k != c) {
            this.k = c;
            this.b.b(false);
        }
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.k = c;
        this.l = Character.toLowerCase(c2);
        this.b.b(false);
        return this;
    }

    public final char c() {
        return this.b.b() ? this.l : this.k;
    }

    public final boolean d() {
        return this.b.c() && c() != '\u0000';
    }

    public final SubMenu getSubMenu() {
        return this.o;
    }

    public final boolean hasSubMenu() {
        return this.o != null;
    }

    public final void a(tr trVar) {
        this.o = trVar;
        trVar.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.h;
    }

    public final CharSequence a(tm tmVar) {
        if (tmVar == null || !tmVar.b()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.h = charSequence;
        this.b.b(false);
        if (this.o != null) {
            this.o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.b.a.getString(i));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.i != null ? this.i : this.h;
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.i = charSequence;
        this.b.b(false);
        return this;
    }

    public final Drawable getIcon() {
        if (this.m != null) {
            return this.m;
        }
        if (this.n == 0) {
            return null;
        }
        Drawable a = vi.a().a(this.b.a, this.n, false);
        this.n = 0;
        this.m = a;
        return a;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.n = 0;
        this.m = drawable;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.m = null;
        this.n = i;
        this.b.b(false);
        return this;
    }

    public final boolean isCheckable() {
        return (this.q & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.q;
        this.q = (z ? 1 : 0) | (this.q & -2);
        if (i != this.q) {
            this.b.b(false);
        }
        return this;
    }

    public final void a(boolean z) {
        this.q = (z ? 4 : 0) | (this.q & -5);
    }

    public final boolean e() {
        return (this.q & 4) != 0;
    }

    public final boolean isChecked() {
        return (this.q & 2) == 2;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.q & 4) != 0) {
            su suVar = this.b;
            int groupId = getGroupId();
            int size = suVar.c.size();
            for (int i = 0; i < size; i++) {
                sy syVar = (sy) suVar.c.get(i);
                if (syVar.getGroupId() == groupId && syVar.e() && syVar.isCheckable()) {
                    syVar.b(syVar == this);
                }
            }
        } else {
            b(z);
        }
        return this;
    }

    final void b(boolean z) {
        int i;
        int i2 = this.q;
        int i3 = this.q & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.q = i | i3;
        if (i2 != this.q) {
            this.b.b(false);
        }
    }

    public final boolean isVisible() {
        if (this.d == null || !this.d.b()) {
            if ((this.q & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.q & 8) == 0 && this.d.c()) {
            return true;
        } else {
            return false;
        }
    }

    final boolean c(boolean z) {
        int i = this.q;
        this.q = (z ? 0 : 8) | (this.q & -9);
        if (i != this.q) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (c(z)) {
            this.b.f();
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        return this.h != null ? this.h.toString() : null;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.u;
    }

    public final boolean f() {
        return (this.q & 32) == 32;
    }

    public final boolean g() {
        return (this.c & 1) == 1;
    }

    public final boolean h() {
        return (this.c & 2) == 2;
    }

    public final void d(boolean z) {
        if (z) {
            this.q |= 32;
        } else {
            this.q &= -33;
        }
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case rl.c /*0*/:
            case rq.b /*1*/:
            case rq.c /*2*/:
                this.c = i;
                this.b.g();
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    private hq a(View view) {
        this.r = view;
        this.d = null;
        if (view != null && view.getId() == -1 && this.e > 0) {
            view.setId(this.e);
        }
        this.b.g();
        return this;
    }

    public final View getActionView() {
        if (this.r != null) {
            return this.r;
        }
        if (this.d == null) {
            return null;
        }
        this.r = this.d.a((MenuItem) this);
        return this.r;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final iv a() {
        return this.d;
    }

    public final hq a(iv ivVar) {
        if (this.d != null) {
            iv ivVar2 = this.d;
            ivVar2.b = null;
            ivVar2.a = null;
        }
        this.r = null;
        this.d = ivVar;
        this.b.b(true);
        if (this.d != null) {
            this.d.a(new ix(this));
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        if (this.s == null || this.s.a(this)) {
            return this.b.a(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.r == null) {
            return true;
        }
        if (this.s == null || this.s.b(this)) {
            return this.b.b(this);
        }
        return false;
    }

    public final hq a(jv jvVar) {
        this.s = jvVar;
        return this;
    }

    public final boolean i() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.r == null && this.d != null) {
            this.r = this.d.a((MenuItem) this);
        }
        if (this.r != null) {
            return true;
        }
        return false;
    }

    public final void e(boolean z) {
        this.t = z;
        this.b.b(false);
    }

    public final boolean isActionViewExpanded() {
        return this.t;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.b.a;
        a(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }
}
