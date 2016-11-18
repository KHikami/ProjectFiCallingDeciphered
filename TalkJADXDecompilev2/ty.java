package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class ty implements tu {
    final Activity a;

    ty(Activity activity) {
        this.a = activity;
    }

    public Drawable a() {
        TypedArray obtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public Context b() {
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.a;
    }

    public boolean c() {
        ActionBar actionBar = this.a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    public void a(Drawable drawable, int i) {
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public void a(int i) {
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }
}
