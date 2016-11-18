package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class tx implements tu {
    final Activity a;
    ub b;

    tx(Activity activity) {
        this.a = activity;
    }

    public Drawable a() {
        return ua.a(this.a);
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
            actionBar.setDisplayShowHomeEnabled(true);
            this.b = ua.a(this.a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }
    }

    public void a(int i) {
        this.b = ua.a(this.b, this.a, i);
    }
}
