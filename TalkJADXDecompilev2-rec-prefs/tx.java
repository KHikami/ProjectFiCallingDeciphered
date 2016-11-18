package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class tx implements tu {
    final Activity f35171a;
    ub f35172b;

    tx(Activity activity) {
        this.f35171a = activity;
    }

    public Drawable mo4387a() {
        return ua.m40879a(this.f35171a);
    }

    public Context mo4390b() {
        ActionBar actionBar = this.f35171a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.f35171a;
    }

    public boolean mo4391c() {
        ActionBar actionBar = this.f35171a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    public void mo4389a(Drawable drawable, int i) {
        ActionBar actionBar = this.f35171a.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            this.f35172b = ua.m40880a(this.f35171a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }
    }

    public void mo4388a(int i) {
        this.f35172b = ua.m40881a(this.f35172b, this.f35171a, i);
    }
}
