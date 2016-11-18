package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

public class yr extends xo<jt> implements Menu {
    public yr(Context context, jt jtVar) {
        super(context, jtVar);
    }

    public MenuItem add(CharSequence charSequence) {
        return m33708a(((jt) this.d).add(charSequence));
    }

    public MenuItem add(int i) {
        return m33708a(((jt) this.d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m33708a(((jt) this.d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m33708a(((jt) this.d).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m33709a(((jt) this.d).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return m33709a(((jt) this.d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m33709a(((jt) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m33709a(((jt) this.d).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((jt) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m33708a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((jt) this.d).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((jt) this.d).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((jt) this.d).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((jt) this.d).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return m33708a(((jt) this.d).findItem(i));
    }

    public int size() {
        return ((jt) this.d).size();
    }

    public MenuItem getItem(int i) {
        return m33708a(((jt) this.d).getItem(i));
    }

    public void close() {
        ((jt) this.d).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((jt) this.d).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((jt) this.d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((jt) this.d).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((jt) this.d).setQwertyMode(z);
    }

    public void removeItem(int i) {
        if (this.f29063b != null) {
            Iterator it = this.f29063b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((jt) this.d).removeItem(i);
    }

    public void removeGroup(int i) {
        if (this.f29063b != null) {
            Iterator it = this.f29063b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((jt) this.d).removeGroup(i);
    }

    public void clear() {
        if (this.f29063b != null) {
            this.f29063b.clear();
        }
        if (this.f29064c != null) {
            this.f29064c.clear();
        }
        ((jt) this.d).clear();
    }
}
