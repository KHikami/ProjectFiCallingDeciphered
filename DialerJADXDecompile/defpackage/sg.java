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

/* compiled from: PG */
/* renamed from: sg */
public final class sg implements hq {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private char h;
    private Drawable i;
    private Context j;
    private int k;

    public sg(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.k = 16;
        this.j = context;
        this.a = 16908332;
        this.b = 0;
        this.c = 0;
        this.d = charSequence;
    }

    public final char getAlphabeticShortcut() {
        return this.h;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        return this.i;
    }

    public final Intent getIntent() {
        return this.f;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.g;
    }

    public final int getOrder() {
        return this.c;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.d;
    }

    public final CharSequence getTitleCondensed() {
        return this.e != null ? this.e : this.d;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.k & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.k & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.k & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.k & 8) == 0;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.h = c;
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.k = (z ? 1 : 0) | (this.k & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.k = (z ? 2 : 0) | (this.k & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.k = (z ? 16 : 0) | (this.k & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.i = drawable;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.i = gd.a(this.j, i);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.g = c;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.g = c;
        this.h = c2;
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.d = this.j.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        this.k = (z ? 0 : 8) | (this.k & 8);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final View getActionView() {
        return null;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final iv a() {
        return null;
    }

    public final hq a(iv ivVar) {
        throw new UnsupportedOperationException();
    }

    public final boolean expandActionView() {
        return false;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final hq a(jv jvVar) {
        return this;
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }
}
