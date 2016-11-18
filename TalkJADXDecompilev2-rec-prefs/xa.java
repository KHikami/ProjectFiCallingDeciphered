package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;

public final class xa extends ContextWrapper {
    private int f35621a;
    private Theme f35622b;
    private LayoutInflater f35623c;

    public xa(Context context, int i) {
        super(context);
        this.f35621a = i;
    }

    public void setTheme(int i) {
        if (this.f35621a != i) {
            this.f35621a = i;
            m41263b();
        }
    }

    public int m41264a() {
        return this.f35621a;
    }

    public Theme getTheme() {
        if (this.f35622b != null) {
            return this.f35622b;
        }
        if (this.f35621a == 0) {
            this.f35621a = gwb.ci;
        }
        m41263b();
        return this.f35622b;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f35623c == null) {
            this.f35623c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f35623c;
    }

    private void m41263b() {
        if (this.f35622b == null) {
            this.f35622b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f35622b.setTo(theme);
            }
        }
        this.f35622b.applyStyle(this.f35621a, true);
    }
}
