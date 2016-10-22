import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
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

/* compiled from: PG */
public class su implements hp {
    private static final int[] k;
    final Context a;
    public sv b;
    ArrayList c;
    public ArrayList d;
    public int e;
    CharSequence f;
    Drawable g;
    View h;
    sy i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private boolean n;
    private ArrayList o;
    private boolean p;
    private ArrayList q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ArrayList w;
    private CopyOnWriteArrayList x;

    static {
        k = new int[]{1, 4, 5, 3, 2, 0};
    }

    public su(Context context) {
        boolean z = true;
        this.e = 0;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = new ArrayList();
        this.x = new CopyOnWriteArrayList();
        this.a = context;
        this.l = context.getResources();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = true;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        if (this.l.getConfiguration().keyboard == 1 || !this.l.getBoolean(buf.ab)) {
            z = false;
        }
        this.n = z;
    }

    public final void a(tj tjVar) {
        a(tjVar, this.a);
    }

    public final void a(tj tjVar, Context context) {
        this.x.add(new WeakReference(tjVar));
        tjVar.a(context, this);
        this.r = true;
    }

    public final void b(tj tjVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            tj tjVar2 = (tj) weakReference.get();
            if (tjVar2 == null || tjVar2 == tjVar) {
                this.x.remove(weakReference);
            }
        }
    }

    public final void a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a = jq.a(item);
            if (!(a == null || a.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                a.saveHierarchyState(sparseArray);
                if (jq.c(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((tr) item.getSubMenu()).a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View a = jq.a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((tr) item.getSubMenu()).b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    jq.b(item);
                }
            }
        }
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public void a(sv svVar) {
        this.b = svVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return a(0, 0, 0, this.l.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.l.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        sy syVar = (sy) a(i, i2, i3, charSequence);
        tr trVar = new tr(this.a, this, syVar);
        syVar.a(trVar);
        return trVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeGroup(int r6) {
        /*
        r5 = this;
        r1 = 0;
        r3 = r5.size();
        r2 = r1;
    L_0x0006:
        if (r2 >= r3) goto L_0x003c;
    L_0x0008:
        r0 = r5.c;
        r0 = r0.get(r2);
        r0 = (sy) r0;
        r0 = r0.getGroupId();
        if (r0 != r6) goto L_0x0039;
    L_0x0016:
        r3 = r2;
    L_0x0017:
        if (r3 < 0) goto L_0x0043;
    L_0x0019:
        r0 = r5.c;
        r0 = r0.size();
        r4 = r0 - r3;
        r0 = r1;
    L_0x0022:
        r2 = r0 + 1;
        if (r0 >= r4) goto L_0x003f;
    L_0x0026:
        r0 = r5.c;
        r0 = r0.get(r3);
        r0 = (sy) r0;
        r0 = r0.getGroupId();
        if (r0 != r6) goto L_0x003f;
    L_0x0034:
        r5.a(r3, r1);
        r0 = r2;
        goto L_0x0022;
    L_0x0039:
        r2 = r2 + 1;
        goto L_0x0006;
    L_0x003c:
        r0 = -1;
        r3 = r0;
        goto L_0x0017;
    L_0x003f:
        r0 = 1;
        r5.b(r0);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: su.removeGroup(int):void");
    }

    private final void a(int i, boolean z) {
        if (i >= 0 && i < this.c.size()) {
            this.c.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    public void clear() {
        if (this.i != null) {
            b(this.i);
        }
        this.c.clear();
        b(true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) this.c.get(i2);
            if (syVar.getGroupId() == i) {
                syVar.a(z2);
                syVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            boolean z3;
            sy syVar = (sy) this.c.get(i2);
            if (syVar.getGroupId() == i && syVar.c(z)) {
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
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) this.c.get(i2);
            if (syVar.getGroupId() == i) {
                syVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((sy) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) this.c.get(i2);
            if (syVar.getItemId() == i) {
                return syVar;
            }
            if (syVar.hasSubMenu()) {
                MenuItem findItem = syVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public int size() {
        return this.c.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.m = z;
        b(false);
    }

    boolean b() {
        return this.m;
    }

    public boolean c() {
        return this.n;
    }

    boolean a(su suVar, MenuItem menuItem) {
        return this.b != null && this.b.a(suVar, menuItem);
    }

    private static int a(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((sy) arrayList.get(size)).a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = a(a, null, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return z;
    }

    private void a(List list, int i, KeyEvent keyEvent) {
        boolean b = b();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                sy syVar = (sy) this.c.get(i2);
                if (syVar.hasSubMenu()) {
                    ((su) syVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = b ? syVar.getAlphabeticShortcut() : syVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && syVar.isEnabled())) {
                    list.add(syVar);
                }
            }
        }
    }

    private sy a(int i, KeyEvent keyEvent) {
        List list = this.w;
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
            return (sy) list.get(0);
        }
        boolean b = b();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            sy syVar = (sy) list.get(i2);
            if (b) {
                alphabeticShortcut = syVar.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = syVar.getNumericShortcut();
            }
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return syVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return syVar;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return syVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), null, i2);
    }

    public final boolean a(MenuItem menuItem, tj tjVar, int i) {
        boolean z = false;
        sy syVar = (sy) menuItem;
        if (syVar == null || !syVar.isEnabled()) {
            return false;
        }
        boolean z2;
        boolean b = syVar.b();
        iv ivVar = syVar.d;
        if (ivVar == null || !ivVar.e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean expandActionView;
        if (syVar.i()) {
            expandActionView = syVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            a(true);
            return expandActionView;
        } else if (syVar.hasSubMenu() || z2) {
            if (!syVar.hasSubMenu()) {
                syVar.a(new tr(this.a, this, syVar));
            }
            tr trVar = (tr) syVar.getSubMenu();
            if (z2) {
                ivVar.a((SubMenu) trVar);
            }
            if (!this.x.isEmpty()) {
                if (tjVar != null) {
                    z = tjVar.a(trVar);
                }
                Iterator it = this.x.iterator();
                boolean z3 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    tj tjVar2 = (tj) weakReference.get();
                    if (tjVar2 == null) {
                        this.x.remove(weakReference);
                    } else {
                        if (z3) {
                            z = z3;
                        } else {
                            z = tjVar2.a(trVar);
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
        if (!this.v) {
            this.v = true;
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                tj tjVar = (tj) weakReference.get();
                if (tjVar == null) {
                    this.x.remove(weakReference);
                } else {
                    tjVar.a(this, z);
                }
            }
            this.v = false;
        }
    }

    public void close() {
        a(true);
    }

    public final void b(boolean z) {
        if (this.s) {
            this.t = true;
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        }
        if (!this.x.isEmpty()) {
            d();
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                tj tjVar = (tj) weakReference.get();
                if (tjVar == null) {
                    this.x.remove(weakReference);
                } else {
                    tjVar.b(z);
                }
            }
            e();
        }
    }

    public final void d() {
        if (!this.s) {
            this.s = true;
            this.t = false;
        }
    }

    public final void e() {
        this.s = false;
        if (this.t) {
            this.t = false;
            b(true);
        }
    }

    public final void f() {
        this.p = true;
        b(true);
    }

    final void g() {
        this.r = true;
        b(true);
    }

    public final ArrayList h() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            sy syVar = (sy) this.c.get(i);
            if (syVar.isVisible()) {
                this.o.add(syVar);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    public final void i() {
        ArrayList h = h();
        if (this.r) {
            Iterator it = this.x.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                tj tjVar = (tj) weakReference.get();
                if (tjVar == null) {
                    this.x.remove(weakReference);
                } else {
                    i = tjVar.a() | i;
                }
            }
            if (i != 0) {
                this.d.clear();
                this.q.clear();
                i = h.size();
                for (int i2 = 0; i2 < i; i2++) {
                    sy syVar = (sy) h.get(i2);
                    if (syVar.f()) {
                        this.d.add(syVar);
                    } else {
                        this.q.add(syVar);
                    }
                }
            } else {
                this.d.clear();
                this.q.clear();
                this.q.addAll(h());
            }
            this.r = false;
        }
    }

    public final ArrayList j() {
        i();
        return this.q;
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        b(false);
    }

    final void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.l;
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (i > 0) {
                this.f = resources.getText(i);
            } else if (charSequence != null) {
                this.f = charSequence;
            }
            if (i2 > 0) {
                this.g = gd.a(this.a, i2);
            } else if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        b(false);
    }

    public su k() {
        return this;
    }

    public boolean a(sy syVar) {
        boolean z = false;
        if (!this.x.isEmpty()) {
            d();
            Iterator it = this.x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                tj tjVar = (tj) weakReference.get();
                if (tjVar != null) {
                    z = tjVar.b(syVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } else {
                    this.x.remove(weakReference);
                }
            }
            z = z2;
            e();
            if (z) {
                this.i = syVar;
            }
        }
        return z;
    }

    public boolean b(sy syVar) {
        boolean z = false;
        if (!this.x.isEmpty() && this.i == syVar) {
            d();
            Iterator it = this.x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                tj tjVar = (tj) weakReference.get();
                if (tjVar != null) {
                    z = tjVar.c(syVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } else {
                    this.x.remove(weakReference);
                }
            }
            z = z2;
            e();
            if (z) {
                this.i = null;
            }
        }
        return z;
    }

    private MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 < 0 || i4 >= k.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (k[i4] << 16) | (65535 & i3);
        MenuItem syVar = new sy(this, i, i2, i3, i5, charSequence, this.e);
        this.c.add(a(this.c, i5), syVar);
        b(true);
        return syVar;
    }

    public void removeItem(int i) {
        int i2;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((sy) this.c.get(i3)).getItemId() == i) {
                i2 = i3;
                break;
            }
        }
        i2 = -1;
        a(i2, true);
    }
}
