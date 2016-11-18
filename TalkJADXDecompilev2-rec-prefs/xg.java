package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class xg {
    mb f35646a;
    final /* synthetic */ xe f35647b;
    private Menu f35648c;
    private int f35649d;
    private int f35650e;
    private int f35651f;
    private int f35652g;
    private boolean f35653h;
    private boolean f35654i;
    private boolean f35655j;
    private int f35656k;
    private int f35657l;
    private CharSequence f35658m;
    private CharSequence f35659n;
    private int f35660o;
    private char f35661p;
    private char f35662q;
    private int f35663r;
    private boolean f35664s;
    private boolean f35665t;
    private boolean f35666u;
    private int f35667v;
    private int f35668w;
    private String f35669x;
    private String f35670y;
    private String f35671z;

    public xg(xe xeVar, Menu menu) {
        this.f35647b = xeVar;
        this.f35648c = menu;
        m41292a();
    }

    public void m41292a() {
        this.f35649d = 0;
        this.f35650e = 0;
        this.f35651f = 0;
        this.f35652g = 0;
        this.f35653h = true;
        this.f35654i = true;
    }

    public void m41293a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f35647b.f35641e.obtainStyledAttributes(attributeSet, wi.by);
        this.f35649d = obtainStyledAttributes.getResourceId(wi.bB, 0);
        this.f35650e = obtainStyledAttributes.getInt(wi.bC, 0);
        this.f35651f = obtainStyledAttributes.getInt(wi.bD, 0);
        this.f35652g = obtainStyledAttributes.getInt(wi.bz, 0);
        this.f35653h = obtainStyledAttributes.getBoolean(wi.bE, true);
        this.f35654i = obtainStyledAttributes.getBoolean(wi.bA, true);
        obtainStyledAttributes.recycle();
    }

    public void m41295b(AttributeSet attributeSet) {
        boolean z = true;
        TypedArray obtainStyledAttributes = this.f35647b.f35641e.obtainStyledAttributes(attributeSet, wi.bF);
        this.f35656k = obtainStyledAttributes.getResourceId(wi.bO, 0);
        this.f35657l = (obtainStyledAttributes.getInt(wi.bP, this.f35650e) & -65536) | (obtainStyledAttributes.getInt(wi.bS, this.f35651f) & 65535);
        this.f35658m = obtainStyledAttributes.getText(wi.bT);
        this.f35659n = obtainStyledAttributes.getText(wi.bU);
        this.f35660o = obtainStyledAttributes.getResourceId(wi.bN, 0);
        this.f35661p = xg.m41289a(obtainStyledAttributes.getString(wi.bJ));
        this.f35662q = xg.m41289a(obtainStyledAttributes.getString(wi.bQ));
        if (obtainStyledAttributes.hasValue(wi.bK)) {
            this.f35663r = obtainStyledAttributes.getBoolean(wi.bK, false) ? 1 : 0;
        } else {
            this.f35663r = this.f35652g;
        }
        this.f35664s = obtainStyledAttributes.getBoolean(wi.bL, false);
        this.f35665t = obtainStyledAttributes.getBoolean(wi.bV, this.f35653h);
        this.f35666u = obtainStyledAttributes.getBoolean(wi.bM, this.f35654i);
        this.f35667v = obtainStyledAttributes.getInt(wi.bW, -1);
        this.f35671z = obtainStyledAttributes.getString(wi.bR);
        this.f35668w = obtainStyledAttributes.getResourceId(wi.bG, 0);
        this.f35669x = obtainStyledAttributes.getString(wi.bI);
        this.f35670y = obtainStyledAttributes.getString(wi.bH);
        if (this.f35670y == null) {
            z = false;
        }
        if (z && this.f35668w == 0 && this.f35669x == null) {
            this.f35646a = (mb) m41290a(this.f35670y, xe.f35638b, this.f35647b.f35640d);
        } else {
            this.f35646a = null;
        }
        obtainStyledAttributes.recycle();
        this.f35655j = false;
    }

    private static char m41289a(String str) {
        if (str == null) {
            return '\u0000';
        }
        return str.charAt(0);
    }

    private void m41291a(MenuItem menuItem) {
        boolean z = true;
        menuItem.setChecked(this.f35664s).setVisible(this.f35665t).setEnabled(this.f35666u).setCheckable(this.f35663r > 0).setTitleCondensed(this.f35659n).setIcon(this.f35660o).setAlphabeticShortcut(this.f35661p).setNumericShortcut(this.f35662q);
        if (this.f35667v >= 0) {
            nb.a(menuItem, this.f35667v);
        }
        if (this.f35671z != null) {
            if (this.f35647b.f35641e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            xe xeVar = this.f35647b;
            if (xeVar.f35642f == null) {
                xeVar.f35642f = xeVar.m41288a(xeVar.f35641e);
            }
            menuItem.setOnMenuItemClickListener(new xf(xeVar.f35642f, this.f35671z));
        }
        if (this.f35663r >= 2) {
            if (menuItem instanceof yc) {
                ((yc) menuItem).m41478a(true);
            } else if (menuItem instanceof yd) {
                ((yd) menuItem).a(true);
            }
        }
        if (this.f35669x != null) {
            nb.a(menuItem, (View) m41290a(this.f35669x, xe.f35637a, this.f35647b.f35639c));
        } else {
            z = false;
        }
        if (this.f35668w > 0 && !r1) {
            nb.b(menuItem, this.f35668w);
        }
        if (this.f35646a != null) {
            nb.a(menuItem, this.f35646a);
        }
    }

    public void m41294b() {
        this.f35655j = true;
        m41291a(this.f35648c.add(this.f35649d, this.f35656k, this.f35657l, this.f35658m));
    }

    public SubMenu m41296c() {
        this.f35655j = true;
        SubMenu addSubMenu = this.f35648c.addSubMenu(this.f35649d, this.f35656k, this.f35657l, this.f35658m);
        m41291a(addSubMenu.getItem());
        return addSubMenu;
    }

    public boolean m41297d() {
        return this.f35655j;
    }

    private <T> T m41290a(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor constructor = this.f35647b.f35641e.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            new StringBuilder("Cannot instantiate class: ").append(str);
            return null;
        }
    }
}
