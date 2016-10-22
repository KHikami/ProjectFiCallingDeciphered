package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import ye;
import yf;
import yg;
import yh;

/* renamed from: yd */
public class yd extends xo<ju> implements MenuItem {
    private Method e;

    public yd(Context context, ju juVar) {
        super(context, juVar);
    }

    public int getItemId() {
        return ((ju) this.d).getItemId();
    }

    public int getGroupId() {
        return ((ju) this.d).getGroupId();
    }

    public int getOrder() {
        return ((ju) this.d).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((ju) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((ju) this.d).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((ju) this.d).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((ju) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((ju) this.d).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((ju) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((ju) this.d).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((ju) this.d).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((ju) this.d).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((ju) this.d).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((ju) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((ju) this.d).setNumericShortcut(c);
        return this;
    }

    public char getNumericShortcut() {
        return ((ju) this.d).getNumericShortcut();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((ju) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((ju) this.d).getAlphabeticShortcut();
    }

    public MenuItem setCheckable(boolean z) {
        ((ju) this.d).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((ju) this.d).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((ju) this.d).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((ju) this.d).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((ju) this.d).setVisible(z);
    }

    public boolean isVisible() {
        return ((ju) this.d).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((ju) this.d).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((ju) this.d).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((ju) this.d).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return a(((ju) this.d).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((ju) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new yh(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((ju) this.d).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((ju) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((ju) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new yf(view);
        }
        ((ju) this.d).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((ju) this.d).setActionView(i);
        View actionView = ((ju) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((ju) this.d).setActionView(new yf(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((ju) this.d).getActionView();
        if (actionView instanceof yf) {
            return ((yf) actionView).c();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((ju) this.d).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        mb a = ((ju) this.d).a();
        if (a instanceof ye) {
            return ((ye) a).a;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((ju) this.d).expandActionView();
    }

    public boolean collapseActionView() {
        return ((ju) this.d).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((ju) this.d).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((ju) this.d).a(onActionExpandListener != null ? new yg(this, onActionExpandListener) : null);
        return this;
    }

    public void a(boolean z) {
        try {
            if (this.e == null) {
                this.e = ((ju) this.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.e.invoke(this.d, new Object[]{Boolean.valueOf(true)});
        } catch (Exception e) {
        }
    }

    ye a(ActionProvider actionProvider) {
        return new ye(this, this.a, actionProvider);
    }
}
