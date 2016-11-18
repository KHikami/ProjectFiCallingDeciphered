package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class jyr extends ContextWrapper implements jyq {
    private final jyn f21300a;
    private LayoutInflater f21301b;

    public jyr(Context context, jyn jyn) {
        super(context);
        if (context == null) {
            throw new IllegalArgumentException("Cannot construct BinderContextWrapper with null Context");
        }
        this.f21300a = new jyn(this, jyn);
    }

    public jyr(Context context) {
        this(context, jyn.m25435b(context));
    }

    public jyr() {
        super(null);
        this.f21300a = new jyn();
    }

    public void m25458a(Context context) {
        attachBaseContext(context);
        this.f21300a.m25451a(context);
    }

    public void m25459a(jyn jyn) {
        this.f21300a.m25453a(jyn);
    }

    public jyn getBinder() {
        return this.f21300a;
    }

    public Object getSystemService(String str) {
        if (!str.equals("layout_inflater")) {
            return super.getSystemService(str);
        }
        if (this.f21301b == null) {
            this.f21301b = ((LayoutInflater) super.getSystemService(str)).cloneInContext(this);
        }
        return this.f21301b;
    }
}
