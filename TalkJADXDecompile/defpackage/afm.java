package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import us;

/* renamed from: afm */
public final class afm extends ContextWrapper {
    private static final ArrayList<WeakReference<afm>> a;
    private final Resources b;
    private final Theme c;

    static {
        a = new ArrayList();
    }

    private afm(Context context) {
        super(context);
        if (aga.a()) {
            this.b = new aga(this, context.getResources());
            this.c = this.b.newTheme();
            this.c.setTo(context.getTheme());
            return;
        }
        this.b = new afo(this, context.getResources());
        this.c = null;
    }

    public Theme getTheme() {
        return this.c == null ? super.getTheme() : this.c;
    }

    public void setTheme(int i) {
        if (this.c == null) {
            super.setTheme(i);
        } else {
            this.c.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        return this.b;
    }

    public static Context a(Context context) {
        Object obj;
        if ((context instanceof afm) || (context.getResources() instanceof afo) || (context.getResources() instanceof aga)) {
            obj = null;
        } else if (!us.b || VERSION.SDK_INT <= 20) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            return context;
        }
        Context context2;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) a.get(i);
            context2 = weakReference != null ? (afm) weakReference.get() : null;
            if (context2 != null && context2.getBaseContext() == context) {
                return context2;
            }
        }
        context2 = new afm(context);
        a.add(new WeakReference(context2));
        return context2;
    }
}
