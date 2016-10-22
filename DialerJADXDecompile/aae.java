import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
public final class aae extends ContextWrapper {
    private static final ArrayList a;
    private Resources b;
    private final Theme c;

    static {
        a = new ArrayList();
    }

    public static Context a(Context context) {
        Object obj;
        if ((context instanceof aae) || (context.getResources() instanceof aag) || (context.getResources() instanceof aar)) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            return context;
        }
        Context context2;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) a.get(i);
            context2 = weakReference != null ? (aae) weakReference.get() : null;
            if (context2 != null && context2.getBaseContext() == context) {
                return context2;
            }
        }
        context2 = new aae(context);
        a.add(new WeakReference(context2));
        return context2;
    }

    private aae(Context context) {
        super(context);
        if (aar.a()) {
            this.c = getResources().newTheme();
            this.c.setTo(context.getTheme());
            return;
        }
        this.c = null;
    }

    public final Theme getTheme() {
        return this.c == null ? super.getTheme() : this.c;
    }

    public final void setTheme(int i) {
        if (this.c == null) {
            super.setTheme(i);
        } else {
            this.c.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        if (this.b == null) {
            Resources aag;
            if (this.c == null) {
                aag = new aag(this, super.getResources());
            } else {
                aag = new aar(this, super.getResources());
            }
            this.b = aag;
        }
        return this.b;
    }
}
