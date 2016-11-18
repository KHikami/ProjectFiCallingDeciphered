package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class xg {
    mb a;
    final /* synthetic */ xe b;
    private Menu c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private CharSequence m;
    private CharSequence n;
    private int o;
    private char p;
    private char q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private String x;
    private String y;
    private String z;

    public xg(xe xeVar, Menu menu) {
        this.b = xeVar;
        this.c = menu;
        a();
    }

    public void a() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = true;
        this.i = true;
    }

    public void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.b.e.obtainStyledAttributes(attributeSet, wi.by);
        this.d = obtainStyledAttributes.getResourceId(wi.bB, 0);
        this.e = obtainStyledAttributes.getInt(wi.bC, 0);
        this.f = obtainStyledAttributes.getInt(wi.bD, 0);
        this.g = obtainStyledAttributes.getInt(wi.bz, 0);
        this.h = obtainStyledAttributes.getBoolean(wi.bE, true);
        this.i = obtainStyledAttributes.getBoolean(wi.bA, true);
        obtainStyledAttributes.recycle();
    }

    public void b(AttributeSet attributeSet) {
        boolean z = true;
        TypedArray obtainStyledAttributes = this.b.e.obtainStyledAttributes(attributeSet, wi.bF);
        this.k = obtainStyledAttributes.getResourceId(wi.bO, 0);
        this.l = (obtainStyledAttributes.getInt(wi.bP, this.e) & -65536) | (obtainStyledAttributes.getInt(wi.bS, this.f) & 65535);
        this.m = obtainStyledAttributes.getText(wi.bT);
        this.n = obtainStyledAttributes.getText(wi.bU);
        this.o = obtainStyledAttributes.getResourceId(wi.bN, 0);
        this.p = xg.a(obtainStyledAttributes.getString(wi.bJ));
        this.q = xg.a(obtainStyledAttributes.getString(wi.bQ));
        if (obtainStyledAttributes.hasValue(wi.bK)) {
            this.r = obtainStyledAttributes.getBoolean(wi.bK, false) ? 1 : 0;
        } else {
            this.r = this.g;
        }
        this.s = obtainStyledAttributes.getBoolean(wi.bL, false);
        this.t = obtainStyledAttributes.getBoolean(wi.bV, this.h);
        this.u = obtainStyledAttributes.getBoolean(wi.bM, this.i);
        this.v = obtainStyledAttributes.getInt(wi.bW, -1);
        this.z = obtainStyledAttributes.getString(wi.bR);
        this.w = obtainStyledAttributes.getResourceId(wi.bG, 0);
        this.x = obtainStyledAttributes.getString(wi.bI);
        this.y = obtainStyledAttributes.getString(wi.bH);
        if (this.y == null) {
            z = false;
        }
        if (z && this.w == 0 && this.x == null) {
            this.a = (mb) a(this.y, xe.b, this.b.d);
        } else {
            this.a = null;
        }
        obtainStyledAttributes.recycle();
        this.j = false;
    }

    private static char a(String str) {
        if (str == null) {
            return '\u0000';
        }
        return str.charAt(0);
    }

    private void a(MenuItem menuItem) {
        boolean z = true;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.n).setIcon(this.o).setAlphabeticShortcut(this.p).setNumericShortcut(this.q);
        if (this.v >= 0) {
            nb.a(menuItem, this.v);
        }
        if (this.z != null) {
            if (this.b.e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            xe xeVar = this.b;
            if (xeVar.f == null) {
                xeVar.f = xeVar.a(xeVar.e);
            }
            menuItem.setOnMenuItemClickListener(new xf(xeVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof yc) {
                ((yc) menuItem).a(true);
            } else if (menuItem instanceof yd) {
                ((yd) menuItem).a(true);
            }
        }
        if (this.x != null) {
            nb.a(menuItem, (View) a(this.x, xe.a, this.b.c));
        } else {
            z = false;
        }
        if (this.w > 0 && !r1) {
            nb.b(menuItem, this.w);
        }
        if (this.a != null) {
            nb.a(menuItem, this.a);
        }
    }

    public void b() {
        this.j = true;
        a(this.c.add(this.d, this.k, this.l, this.m));
    }

    public SubMenu c() {
        this.j = true;
        SubMenu addSubMenu = this.c.addSubMenu(this.d, this.k, this.l, this.m);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    public boolean d() {
        return this.j;
    }

    private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor constructor = this.b.e.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            new StringBuilder("Cannot instantiate class: ").append(str);
            return null;
        }
    }
}
