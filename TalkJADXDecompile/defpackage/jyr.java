package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* renamed from: jyr */
public final class jyr extends ContextWrapper implements jyq {
    private final jyn a;
    private LayoutInflater b;

    public jyr(Context context, jyn jyn) {
        super(context);
        if (context == null) {
            throw new IllegalArgumentException("Cannot construct BinderContextWrapper with null Context");
        }
        this.a = new jyn(this, jyn);
    }

    public jyr(Context context) {
        this(context, jyn.b(context));
    }

    public jyr() {
        super(null);
        this.a = new jyn();
    }

    public void a(Context context) {
        attachBaseContext(context);
        this.a.a(context);
    }

    public void a(jyn jyn) {
        this.a.a(jyn);
    }

    public jyn getBinder() {
        return this.a;
    }

    public Object getSystemService(String str) {
        if (!str.equals("layout_inflater")) {
            return super.getSystemService(str);
        }
        if (this.b == null) {
            this.b = ((LayoutInflater) super.getSystemService(str)).cloneInContext(this);
        }
        return this.b;
    }
}
