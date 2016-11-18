package p000;

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
    private static final int[] f35759d = new int[]{1, 4, 5, 3, 2, 0};
    CharSequence f35760a;
    Drawable f35761b;
    View f35762c;
    private final Context f35763e;
    private final Resources f35764f;
    private boolean f35765g;
    private boolean f35766h;
    private xz f35767i;
    private ArrayList<yc> f35768j;
    private ArrayList<yc> f35769k;
    private boolean f35770l;
    private ArrayList<yc> f35771m;
    private ArrayList<yc> f35772n;
    private boolean f35773o;
    private int f35774p = 0;
    private ContextMenuInfo f35775q;
    private boolean f35776r = false;
    private boolean f35777s = false;
    private boolean f35778t = false;
    private boolean f35779u = false;
    private ArrayList<yc> f35780v = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<yn>> f35781w = new CopyOnWriteArrayList();
    private yc f35782x;
    private boolean f35783y;

    public xy(Context context) {
        boolean z = true;
        this.f35763e = context;
        this.f35764f = context.getResources();
        this.f35768j = new ArrayList();
        this.f35769k = new ArrayList();
        this.f35770l = true;
        this.f35771m = new ArrayList();
        this.f35772n = new ArrayList();
        this.f35773o = true;
        if (this.f35764f.getConfiguration().keyboard == 1 || !this.f35764f.getBoolean(gwb.af)) {
            z = false;
        }
        this.f35766h = z;
    }

    public xy m41406a(int i) {
        this.f35774p = 1;
        return this;
    }

    public void m41415a(yn ynVar) {
        m41416a(ynVar, this.f35763e);
    }

    public void m41416a(yn ynVar, Context context) {
        this.f35781w.add(new WeakReference(ynVar));
        ynVar.mo4509a(context, this);
        this.f35773o = true;
    }

    public void m41424b(yn ynVar) {
        Iterator it = this.f35781w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            yn ynVar2 = (yn) weakReference.get();
            if (ynVar2 == null || ynVar2 == ynVar) {
                this.f35781w.remove(weakReference);
            }
        }
    }

    public void m41411a(Bundle bundle) {
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
                ((yv) item.getSubMenu()).m41411a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4534a(), sparseArray);
        }
    }

    public void m41423b(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo4534a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View a = nb.a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((yv) item.getSubMenu()).m41423b(bundle);
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

    protected String mo4534a() {
        return "android:menu:actionviewstates";
    }

    public void mo4535a(xz xzVar) {
        this.f35767i = xzVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return m41404a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return m41404a(0, 0, 0, this.f35764f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m41404a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m41404a(i, i2, i3, this.f35764f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f35764f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        yc ycVar = (yc) m41404a(i, i2, i3, charSequence);
        yv yvVar = new yv(this.f35763e, this, ycVar);
        ycVar.m41477a(yvVar);
        return yvVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f35764f.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f35763e.getPackageManager();
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
        m41402a(m41422b(i), true);
    }

    public void removeGroup(int i) {
        int c = m41428c(i);
        if (c >= 0) {
            int size = this.f35768j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((yc) this.f35768j.get(c)).getGroupId() != i) {
                    m41425b(true);
                } else {
                    m41402a(c, false);
                    i2 = i3;
                }
            }
            m41425b(true);
        }
    }

    private void m41402a(int i, boolean z) {
        if (i >= 0 && i < this.f35768j.size()) {
            this.f35768j.remove(i);
            if (z) {
                m41425b(true);
            }
        }
    }

    public void clear() {
        if (this.f35782x != null) {
            mo4539b(this.f35782x);
        }
        this.f35768j.clear();
        m41425b(true);
    }

    void m41412a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f35768j.size();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (yc) this.f35768j.get(i);
            if (menuItem2.getGroupId() == groupId && menuItem2.m41488g() && menuItem2.isCheckable()) {
                menuItem2.m41479b(menuItem2 == menuItem);
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f35768j.size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = (yc) this.f35768j.get(i2);
            if (ycVar.getGroupId() == i) {
                ycVar.m41478a(z2);
                ycVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f35768j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            boolean z3;
            yc ycVar = (yc) this.f35768j.get(i2);
            if (ycVar.getGroupId() == i && ycVar.m41482c(z)) {
                z3 = true;
            } else {
                z3 = z2;
            }
            i2++;
            z2 = z3;
        }
        if (z2) {
            m41425b(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f35768j.size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = (yc) this.f35768j.get(i2);
            if (ycVar.getGroupId() == i) {
                ycVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f35783y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((yc) this.f35768j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = (yc) this.f35768j.get(i2);
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

    public int m41422b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((yc) this.f35768j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int m41428c(int i) {
        return m41403a(i, 0);
    }

    public int m41403a(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((yc) this.f35768j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    public int size() {
        return this.f35768j.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f35768j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m41410a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.f35765g = z;
        m41425b(false);
    }

    boolean mo4538b() {
        return this.f35765g;
    }

    public boolean mo4540c() {
        return this.f35766h;
    }

    Resources m41431d() {
        return this.f35764f;
    }

    public Context m41433e() {
        return this.f35763e;
    }

    boolean mo4536a(xy xyVar, MenuItem menuItem) {
        return this.f35767i != null && this.f35767i.mo4420a(xyVar, menuItem);
    }

    public void m41435f() {
        if (this.f35767i != null) {
            this.f35767i.mo4417a(this);
        }
    }

    private static int m41400a(ArrayList<yc> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((yc) arrayList.get(size)).m41481c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m41410a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = m41418a(a, i2);
        }
        if ((i2 & 2) != 0) {
            m41417a(true);
        }
        return z;
    }

    void m41413a(List<yc> list, int i, KeyEvent keyEvent) {
        boolean b = mo4538b();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f35768j.size();
            for (int i2 = 0; i2 < size; i2++) {
                yc ycVar = (yc) this.f35768j.get(i2);
                if (ycVar.hasSubMenu()) {
                    ((xy) ycVar.getSubMenu()).m41413a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? ycVar.getAlphabeticShortcut() : ycVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && ycVar.isEnabled())) {
                    list.add(ycVar);
                }
            }
        }
    }

    yc m41410a(int i, KeyEvent keyEvent) {
        List list = this.f35780v;
        list.clear();
        m41413a(list, i, keyEvent);
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
        boolean b = mo4538b();
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
        return m41418a(findItem(i), i2);
    }

    public boolean m41418a(MenuItem menuItem, int i) {
        return m41419a(menuItem, null, i);
    }

    public boolean m41419a(MenuItem menuItem, yn ynVar, int i) {
        boolean z = false;
        yc ycVar = (yc) menuItem;
        if (ycVar == null || !ycVar.isEnabled()) {
            return false;
        }
        boolean z2;
        boolean b = ycVar.m41480b();
        mb a = ycVar.m41475a();
        if (a == null || !a.e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean expandActionView;
        if (ycVar.m41494m()) {
            expandActionView = ycVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            m41417a(true);
            return expandActionView;
        } else if (ycVar.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                m41417a(false);
            }
            if (!ycVar.hasSubMenu()) {
                ycVar.m41477a(new yv(m41433e(), this, ycVar));
            }
            yv yvVar = (yv) ycVar.getSubMenu();
            if (z2) {
                a.a(yvVar);
            }
            if (!this.f35781w.isEmpty()) {
                if (ynVar != null) {
                    z = ynVar.mo4512a(yvVar);
                }
                Iterator it = this.f35781w.iterator();
                boolean z3 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    yn ynVar2 = (yn) weakReference.get();
                    if (ynVar2 == null) {
                        this.f35781w.remove(weakReference);
                    } else {
                        if (z3) {
                            z = z3;
                        } else {
                            z = ynVar2.mo4512a(yvVar);
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
            m41417a(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                m41417a(true);
            }
            return b;
        }
    }

    public final void m41417a(boolean z) {
        if (!this.f35779u) {
            this.f35779u = true;
            Iterator it = this.f35781w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar == null) {
                    this.f35781w.remove(weakReference);
                } else {
                    ynVar.mo4510a(this, z);
                }
            }
            this.f35779u = false;
        }
    }

    public void close() {
        m41417a(true);
    }

    public void m41425b(boolean z) {
        if (this.f35776r) {
            this.f35777s = true;
            return;
        }
        if (z) {
            this.f35770l = true;
            this.f35773o = true;
        }
        if (!this.f35781w.isEmpty()) {
            m41436g();
            Iterator it = this.f35781w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar == null) {
                    this.f35781w.remove(weakReference);
                } else {
                    ynVar.mo4513b(z);
                }
            }
            m41437h();
        }
    }

    public void m41436g() {
        if (!this.f35776r) {
            this.f35776r = true;
            this.f35777s = false;
        }
    }

    public void m41437h() {
        this.f35776r = false;
        if (this.f35777s) {
            this.f35777s = false;
            m41425b(true);
        }
    }

    public void m41438i() {
        this.f35770l = true;
        m41425b(true);
    }

    void m41439j() {
        this.f35773o = true;
        m41425b(true);
    }

    public ArrayList<yc> m41440k() {
        if (!this.f35770l) {
            return this.f35769k;
        }
        this.f35769k.clear();
        int size = this.f35768j.size();
        for (int i = 0; i < size; i++) {
            yc ycVar = (yc) this.f35768j.get(i);
            if (ycVar.isVisible()) {
                this.f35769k.add(ycVar);
            }
        }
        this.f35770l = false;
        this.f35773o = true;
        return this.f35769k;
    }

    public void m41441l() {
        ArrayList k = m41440k();
        if (this.f35773o) {
            Iterator it = this.f35781w.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar == null) {
                    this.f35781w.remove(weakReference);
                } else {
                    i = ynVar.mo4514b() | i;
                }
            }
            if (i != 0) {
                this.f35771m.clear();
                this.f35772n.clear();
                i = k.size();
                for (int i2 = 0; i2 < i; i2++) {
                    yc ycVar = (yc) k.get(i2);
                    if (ycVar.m41490i()) {
                        this.f35771m.add(ycVar);
                    } else {
                        this.f35772n.add(ycVar);
                    }
                }
            } else {
                this.f35771m.clear();
                this.f35772n.clear();
                this.f35772n.addAll(m41440k());
            }
            this.f35773o = false;
        }
    }

    public ArrayList<yc> m41442m() {
        m41441l();
        return this.f35771m;
    }

    public ArrayList<yc> m41443n() {
        m41441l();
        return this.f35772n;
    }

    public void clearHeader() {
        this.f35761b = null;
        this.f35760a = null;
        this.f35762c = null;
        m41425b(false);
    }

    private void m41401a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = m41431d();
        if (view != null) {
            this.f35762c = view;
            this.f35760a = null;
            this.f35761b = null;
        } else {
            if (i > 0) {
                this.f35760a = d.getText(i);
            } else if (charSequence != null) {
                this.f35760a = charSequence;
            }
            if (i2 > 0) {
                this.f35761b = ia.a(m41433e(), i2);
            } else if (drawable != null) {
                this.f35761b = drawable;
            }
            this.f35762c = null;
        }
        m41425b(false);
    }

    protected xy m41409a(CharSequence charSequence) {
        m41401a(0, charSequence, 0, null, null);
        return this;
    }

    protected xy m41432d(int i) {
        m41401a(i, null, 0, null, null);
        return this;
    }

    protected xy m41407a(Drawable drawable) {
        m41401a(0, null, 0, drawable, null);
        return this;
    }

    protected xy m41434e(int i) {
        m41401a(0, null, i, null, null);
        return this;
    }

    protected xy m41408a(View view) {
        m41401a(0, null, 0, null, view);
        return this;
    }

    public CharSequence m41444o() {
        return this.f35760a;
    }

    public Drawable m41445p() {
        return this.f35761b;
    }

    public View m41446q() {
        return this.f35762c;
    }

    public xy mo4541r() {
        return this;
    }

    boolean m41448s() {
        return this.f35778t;
    }

    public boolean mo4537a(yc ycVar) {
        boolean z = false;
        if (!this.f35781w.isEmpty()) {
            m41436g();
            Iterator it = this.f35781w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar != null) {
                    z = ynVar.mo4515b(ycVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } else {
                    this.f35781w.remove(weakReference);
                }
            }
            z = z2;
            m41437h();
            if (z) {
                this.f35782x = ycVar;
            }
        }
        return z;
    }

    public boolean mo4539b(yc ycVar) {
        boolean z = false;
        if (!this.f35781w.isEmpty() && this.f35782x == ycVar) {
            m41436g();
            Iterator it = this.f35781w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                yn ynVar = (yn) weakReference.get();
                if (ynVar != null) {
                    z = ynVar.mo4516c(ycVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } else {
                    this.f35781w.remove(weakReference);
                }
            }
            z = z2;
            m41437h();
            if (z) {
                this.f35782x = null;
            }
        }
        return z;
    }

    public yc m41449t() {
        return this.f35782x;
    }

    public void m41429c(boolean z) {
        this.f35783y = z;
    }

    protected MenuItem m41404a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 < 0 || i4 >= f35759d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f35759d[i4] << 16) | (65535 & i3);
        MenuItem ycVar = new yc(this, i, i2, i3, i5, charSequence, this.f35774p);
        if (this.f35775q != null) {
            ycVar.m41476a(this.f35775q);
        }
        this.f35768j.add(xy.m41400a(this.f35768j, i5), ycVar);
        m41425b(true);
        return ycVar;
    }
}
