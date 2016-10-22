package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: tn */
public class tn extends sk implements Menu {
    public tn(Context context, hp hpVar) {
        super(context, hpVar);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(((hp) this.d).add(charSequence));
    }

    public MenuItem add(int i) {
        return a(((hp) this.d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(((hp) this.d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(((hp) this.d).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(((hp) this.d).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return a(((hp) this.d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(((hp) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(((hp) this.d).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((hp) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((hp) this.d).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((hp) this.d).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((hp) this.d).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((hp) this.d).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return a(((hp) this.d).findItem(i));
    }

    public int size() {
        return ((hp) this.d).size();
    }

    public MenuItem getItem(int i) {
        return a(((hp) this.d).getItem(i));
    }

    public void close() {
        ((hp) this.d).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((hp) this.d).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((hp) this.d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((hp) this.d).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((hp) this.d).setQwertyMode(z);
    }

    public void removeItem(int i) {
        if (this.b != null) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((hp) this.d).removeItem(i);
    }

    public void removeGroup(int i) {
        if (this.b != null) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((hp) this.d).removeGroup(i);
    }

    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        ((hp) this.d).clear();
    }
}
