package defpackage;

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
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k = 0;
    private Context l;
    private OnMenuItemClickListener m;
    private int n = 16;

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return a(i);
    }

    public xk(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.l = context;
        this.a = 16908332;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.j;
    }

    public Intent getIntent() {
        return this.g;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.h;
    }

    public int getOrder() {
        return this.d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.e;
    }

    public CharSequence getTitleCondensed() {
        return this.f != null ? this.f : this.e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.n & 1) != 0;
    }

    public boolean isChecked() {
        return (this.n & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.n & 16) != 0;
    }

    public boolean isVisible() {
        return (this.n & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.n = (z ? 1 : 0) | (this.n & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.n = (z ? 2 : 0) | (this.n & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.n = (z ? 16 : 0) | (this.n & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.j = drawable;
        this.k = 0;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.k = i;
        this.j = ia.a(this.l, i);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.h = c;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.i = c2;
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.e = this.l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.n = (z ? 0 : 8) | (this.n & 8);
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

    public mb a() {
        return null;
    }

    public ju a(mb mbVar) {
        throw new UnsupportedOperationException();
    }

    private ju a(int i) {
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

    public ju a(ng ngVar) {
        return this;
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
