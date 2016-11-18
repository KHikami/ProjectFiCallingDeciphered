package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class xy implements jt {
    private static final int[] d = new int[]{1, 4, 5, 3, 2, 0};
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private xz i;
    private ArrayList<yc> j;
    private ArrayList<yc> k;
    private boolean l;
    private ArrayList<yc> m;
    private ArrayList<yc> n;
    private boolean o;
    private int p = 0;
    private ContextMenuInfo q;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<yc> v = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<yn>> w = new CopyOnWriteArrayList();
    private yc x;
    private boolean y;

    public xy(Context context) {
        boolean z = true;
        this.e = context;
        this.f = context.getResources();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = true;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = true;
        if (this.f.getConfiguration().keyboard == 1 || !this.f.getBoolean(gwb.af)) {
            z = false;
        }
        this.h = z;
    }

    public xy a(int i) {
        this.p = 1;
        return this;
    }

    public void a(yn ynVar) {
        a(ynVar, this.e);
    }

    public void a(yn ynVar, Context context) {
        this.w.add(new WeakReference(ynVar));
        ynVar.a(context, this);
        this.o = true;
    }

    public void b(yn ynVar) {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            yn ynVar2 = (yn) weakReference.get();
            if (ynVar2 == null || ynVar2 == ynVar) {
                this.w.remove(weakReference);
            }
        }
    }

    public void a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a = nb.a(item);
            if (!(a == null || a.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                a.saveHierarchyState(sparseArray);
                if (nb.c(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((yv) item.getSubMenu()).a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public void b(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View a = nb.a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((yv) item.getSubMenu()).b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    nb.b(item);
                }
            }
        }
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public void a(xz xzVar) {
        this.i = xzVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return a(0, 0, 0, this.f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        yc ycVar = (yc) a(i, i2, i3, charSequence);
        yv yvVar = new yv(this.e, this, ycVar);
        ycVar.a(yvVar);
        return yvVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            Intent intent2;
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return size;
    }

    public void removeItem(int i) {
        a(b(i), true);
    }

    public void removeGroup(int i) {
        int c = c(i);
        if (c >= 0) {
            int size = this.j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((yc) this.j.get(c)).getGroupId() != i) {
                    b(true);
                } else {
                    a(c, false);
                    i2 = i3;
                }
            }
            b(true);
        }
    }

    private void a(int i, boolean z) {
        if (i >= 0 && i < this.j.size()) {
            this.j.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    public void clear() {
        if (this.x != null) {
            b(this.x);
        }
        this.j.clear();
        b(true);
    }

    void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (yc) this.j.get(i);
            if (menuItem2.getGroupId() == groupId && menuItem2.g() && menuItem2.isCheckable()) {
                menuItem2.b(menuItem2 == menuItem);
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = (yc) this.j.get(i2);
            if (ycVar.getGroupId() == i) {
                ycVar.a(z2);
                ycVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            boolean z3;
            yc ycVar = (yc) this.j.get(i2);
            if (ycVar.getGroupId() == i && ycVar.c(z)) {
                z3 = true;
            } else {
                z3 = z2;
            }
            i2++;
            z2 = z3;
        }
        if (z2) {
            b(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = (yc) this.j.get(i2);
            if (ycVar.getGroupId() == i) {
                ycVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((yc) this.j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = (yc) this.j.get(i2);
            if (ycVar.getItemId() == i) {
                return ycVar;
            }
            if (ycVar.hasSubMenu()) {
                MenuItem findItem = ycVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public int b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((yc) this.j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int c(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((yc) this.j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    public int size() {
        return this.j.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.g = z;
        b(false);
    }

    boolean b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }

    Resources d() {
        return this.f;
    }

    public Context e() {
        return this.e;
    }

    boolean a(xy xyVar, MenuItem menuItem) {
        return this.i != null && this.i.a(xyVar, menuItem);
    }

    public void f() {
        if (this.i != null) {
            this.i.a(this);
        }
    }

    private static int a(ArrayList<yc> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((yc) arrayList.get(size)).c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = a(a, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return z;
    }

    void a(List<yc> list, int i, KeyEvent keyEvent) {
        boolean b = b();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                yc ycVar = (yc) this.j.get(i2);
                if (ycVar.hasSubMenu()) {
                    ((xy) ycVar.getSubMenu()).a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? ycVar.getAlphabeticShortcut() : ycVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && ycVar.isEnabled())) {
                    list.add(ycVar);
                }
            }
        }
    }

    yc a(int i, KeyEvent keyEvent) {
        List list = this.v;
        list.clear();
        a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (yc) list.get(0);
        }
        boolean b = b();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            yc ycVar = (yc) list.get(i2);
            if (b) {
                alphabeticShortcut = ycVar.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = ycVar.getNumericShortcut();
            }
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return ycVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return ycVar;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return ycVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, null, i);
    }

    public boolean a(MenuItem menuItem, yn ynVar, int i) {
        boolean z = false;
        yc ycVar = (yc) menuItem;
        if (ycVar == null || !ycVar.isEnabled()) {
            return false;
        }
        boolean z2;
        boolean b = ycVar.b();
        mb a = ycVar.a();
        if (a == null || !a.e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean expandActionView;
        if (ycVar.m()) {
            expandActionView = ycVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            a(true);
            return expandActionView;
        } else if (ycVar.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                a(false);
            }
            if (!ycVar.hasSubMenu()) {
                ycVar.a(new yv(e(), this, ycVar));
            }
            yv yvVar = (yv) ycVar.getSubMenu();
            if (z2) {
                a.a(yvVar);
            }
            if (!this.w.isEmpty()) {
                if (ynVar != null) {
                    z = ynVar.a(yvVar);
                }
                Iterator it = this.w.iterator();
                boolean z3 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    yn ynVar2 = (yn) weakReference.get();
                    if (ynVar2 == null) {
                        this.w.remove(weakReference);
                    } else {
                        if (z3) {
                            z = z3;
                        } else {
                            z = ynVar2.a(yvVar);
                        }
                        z3 = z;
                    }
                }
                z = z3;
            }
            expandActionView = b | r2;
            if (expandActionView) {
                return expandActionView;
            }
            a(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                a(true);
            }
            return b;
        }
    }

    public final void a(boolean z) {
        if (!this.u) {
            this.u = true;
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar == null) {
                    this.w.remove(weakReference);
                } else {
                    ynVar.a(this, z);
                }
            }
            this.u = false;
        }
    }

    public void close() {
        a(true);
    }

    public void b(boolean z) {
        if (this.r) {
            this.s = true;
            return;
        }
        if (z) {
            this.l = true;
            this.o = true;
        }
        if (!this.w.isEmpty()) {
            g();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar == null) {
                    this.w.remove(weakReference);
                } else {
                    ynVar.b(z);
                }
            }
            h();
        }
    }

    public void g() {
        if (!this.r) {
            this.r = true;
            this.s = false;
        }
    }

    public void h() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(true);
        }
    }

    public void i() {
        this.l = true;
        b(true);
    }

    void j() {
        this.o = true;
        b(true);
    }

    public ArrayList<yc> k() {
        if (!this.l) {
            return this.k;
        }
        this.k.clear();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            yc ycVar = (yc) this.j.get(i);
            if (ycVar.isVisible()) {
                this.k.add(ycVar);
            }
        }
        this.l = false;
        this.o = true;
        return this.k;
    }

    public void l() {
        ArrayList k = k();
        if (this.o) {
            Iterator it = this.w.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar == null) {
                    this.w.remove(weakReference);
                } else {
                    i = ynVar.b() | i;
                }
            }
            if (i != 0) {
                this.m.clear();
                this.n.clear();
                i = k.size();
                for (int i2 = 0; i2 < i; i2++) {
                    yc ycVar = (yc) k.get(i2);
                    if (ycVar.i()) {
                        this.m.add(ycVar);
                    } else {
                        this.n.add(ycVar);
                    }
                }
            } else {
                this.m.clear();
                this.n.clear();
                this.n.addAll(k());
            }
            this.o = false;
        }
    }

    public ArrayList<yc> m() {
        l();
        return this.m;
    }

    public ArrayList<yc> n() {
        l();
        return this.n;
    }

    public void clearHeader() {
        this.b = null;
        this.a = null;
        this.c = null;
        b(false);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = d();
        if (view != null) {
            this.c = view;
            this.a = null;
            this.b = null;
        } else {
            if (i > 0) {
                this.a = d.getText(i);
            } else if (charSequence != null) {
                this.a = charSequence;
            }
            if (i2 > 0) {
                this.b = ia.a(e(), i2);
            } else if (drawable != null) {
                this.b = drawable;
            }
            this.c = null;
        }
        b(false);
    }

    protected xy a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    protected xy d(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    protected xy a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected xy e(int i) {
        a(0, null, i, null, null);
        return this;
    }

    protected xy a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence o() {
        return this.a;
    }

    public Drawable p() {
        return this.b;
    }

    public View q() {
        return this.c;
    }

    public xy r() {
        return this;
    }

    boolean s() {
        return this.t;
    }

    public boolean a(yc ycVar) {
        boolean z = false;
        if (!this.w.isEmpty()) {
            g();
            Iterator it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar != null) {
                    z = ynVar.b(ycVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } else {
                    this.w.remove(weakReference);
                }
            }
            z = z2;
            h();
            if (z) {
                this.x = ycVar;
            }
        }
        return z;
    }

    public boolean b(yc ycVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == ycVar) {
            g();
            Iterator it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar != null) {
                    z = ynVar.c(ycVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } else {
                    this.w.remove(weakReference);
                }
            }
            z = z2;
            h();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    public yc t() {
        return this.x;
    }

    public void c(boolean z) {
        this.y = z;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 < 0 || i4 >= d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (d[i4] << 16) | (65535 & i3);
        MenuItem ycVar = new yc(this, i, i2, i3, i5, charSequence, this.p);
        if (this.q != null) {
            ycVar.a(this.q);
        }
        this.j.add(xy.a(this.j, i5), ycVar);
        b(true);
        return ycVar;
    }
}
