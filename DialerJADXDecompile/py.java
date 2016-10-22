import android.content.Context;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
public final class py {
    public final pt a;
    public final int b;

    public py(Context context) {
        this(context, px.a(context, 0));
    }

    private py(Context context, int i) {
        this.a = new pt(new ContextThemeWrapper(context, px.a(context, i)));
        this.b = i;
    }
}
