package defpackage;

import android.annotation.TargetApi;
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

@TargetApi(14)
/* compiled from: PG */
/* renamed from: sz */
public class sz extends sk implements MenuItem {
    public Method e;

    public sz(Context context, hq hqVar) {
        super(context, hqVar);
    }

    public int getItemId() {
        return ((hq) this.d).getItemId();
    }

    public int getGroupId() {
        return ((hq) this.d).getGroupId();
    }

    public int getOrder() {
        return ((hq) this.d).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((hq) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((hq) this.d).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((hq) this.d).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((hq) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((hq) this.d).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((hq) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((hq) this.d).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((hq) this.d).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((hq) this.d).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((hq) this.d).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((hq) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((hq) this.d).setNumericShortcut(c);
        return this;
    }

    public char getNumericShortcut() {
        return ((hq) this.d).getNumericShortcut();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((hq) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((hq) this.d).getAlphabeticShortcut();
    }

    public MenuItem setCheckable(boolean z) {
        ((hq) this.d).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((hq) this.d).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((hq) this.d).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((hq) this.d).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((hq) this.d).setVisible(z);
    }

    public boolean isVisible() {
        return ((hq) this.d).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((hq) this.d).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((hq) this.d).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((hq) this.d).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return a(((hq) this.d).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((hq) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new td(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((hq) this.d).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((hq) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((hq) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new tb(view);
        }
        ((hq) this.d).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((hq) this.d).setActionView(i);
        View actionView = ((hq) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((hq) this.d).setActionView(new tb(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((hq) this.d).getActionView();
        return actionView instanceof tb ? (View) ((tb) actionView).a : actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((hq) this.d).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        iv a = ((hq) this.d).a();
        if (a instanceof ta) {
            return ((ta) a).c;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((hq) this.d).expandActionView();
    }

    public boolean collapseActionView() {
        return ((hq) this.d).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((hq) this.d).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((hq) this.d).a(onActionExpandListener != null ? new tc(this, onActionExpandListener) : null);
        return this;
    }

    ta a(ActionProvider actionProvider) {
        return new ta(this, this.a, actionProvider);
    }
}
