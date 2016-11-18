package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;

public final class xa extends ContextWrapper {
    private int a;
    private Theme b;
    private LayoutInflater c;

    public xa(Context context, int i) {
        super(context);
        this.a = i;
    }

    public void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }

    public int a() {
        return this.a;
    }

    public Theme getTheme() {
        if (this.b != null) {
            return this.b;
        }
        if (this.a == 0) {
            this.a = gwb.ci;
        }
        b();
        return this.b;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    private void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }
}
