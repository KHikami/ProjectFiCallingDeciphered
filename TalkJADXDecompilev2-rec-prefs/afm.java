package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class afm extends ContextWrapper {
    private static final ArrayList<WeakReference<afm>> f544a = new ArrayList();
    private final Resources f545b;
    private final Theme f546c;

    private afm(Context context) {
        super(context);
        if (aga.m999a()) {
            this.f545b = new aga(this, context.getResources());
            this.f546c = this.f545b.newTheme();
            this.f546c.setTo(context.getTheme());
            return;
        }
        this.f545b = new afo(this, context.getResources());
        this.f546c = null;
    }

    public Theme getTheme() {
        return this.f546c == null ? super.getTheme() : this.f546c;
    }

    public void setTheme(int i) {
        if (this.f546c == null) {
            super.setTheme(i);
        } else {
            this.f546c.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        return this.f545b;
    }

    public static Context m924a(Context context) {
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
        int size = f544a.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f544a.get(i);
            context2 = weakReference != null ? (afm) weakReference.get() : null;
            if (context2 != null && context2.getBaseContext() == context) {
                return context2;
            }
        }
        context2 = new afm(context);
        f544a.add(new WeakReference(context2));
        return context2;
    }
}
