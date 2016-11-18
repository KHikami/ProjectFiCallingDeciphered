package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class ty implements tu {
    final Activity f35173a;

    ty(Activity activity) {
        this.f35173a = activity;
    }

    public Drawable mo4387a() {
        TypedArray obtainStyledAttributes = mo4390b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public Context mo4390b() {
        ActionBar actionBar = this.f35173a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.f35173a;
    }

    public boolean mo4391c() {
        ActionBar actionBar = this.f35173a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    public void mo4389a(Drawable drawable, int i) {
        ActionBar actionBar = this.f35173a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public void mo4388a(int i) {
        ActionBar actionBar = this.f35173a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }
}
