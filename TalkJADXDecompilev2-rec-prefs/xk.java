package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class xk implements ju {
    private final int f35681a;
    private final int f35682b;
    private final int f35683c;
    private final int f35684d;
    private CharSequence f35685e;
    private CharSequence f35686f;
    private Intent f35687g;
    private char f35688h;
    private char f35689i;
    private Drawable f35690j;
    private int f35691k = 0;
    private Context f35692l;
    private OnMenuItemClickListener f35693m;
    private int f35694n = 16;

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m41308a(i);
    }

    public xk(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f35692l = context;
        this.f35681a = 16908332;
        this.f35682b = 0;
        this.f35683c = 0;
        this.f35684d = 0;
        this.f35685e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.f35689i;
    }

    public int getGroupId() {
        return this.f35682b;
    }

    public Drawable getIcon() {
        return this.f35690j;
    }

    public Intent getIntent() {
        return this.f35687g;
    }

    public int getItemId() {
        return this.f35681a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f35688h;
    }

    public int getOrder() {
        return this.f35684d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f35685e;
    }

    public CharSequence getTitleCondensed() {
        return this.f35686f != null ? this.f35686f : this.f35685e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f35694n & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f35694n & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f35694n & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f35694n & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f35689i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f35694n = (z ? 1 : 0) | (this.f35694n & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f35694n = (z ? 2 : 0) | (this.f35694n & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f35694n = (z ? 16 : 0) | (this.f35694n & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f35690j = drawable;
        this.f35691k = 0;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f35691k = i;
        this.f35690j = ia.a(this.f35692l, i);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f35687g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f35688h = c;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f35693m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f35688h = c;
        this.f35689i = c2;
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f35685e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f35685e = this.f35692l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f35686f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f35694n = (z ? 0 : 8) | (this.f35694n & 8);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public mb m41311a() {
        return null;
    }

    public ju m41309a(mb mbVar) {
        throw new UnsupportedOperationException();
    }

    private ju m41308a(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public ju m41310a(ng ngVar) {
        return this;
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
