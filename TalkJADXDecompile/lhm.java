import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class lhm<C> extends ContextWrapper implements lhj<C> {
    private final C a;
    private LayoutInflater b;

    public lhm(Context context, C c) {
        super((Context) bm.a((Object) context));
        this.a = bm.a((Object) c);
    }

    public C a() {
        return this.a;
    }

    public LayoutInflater b() {
        if (this.b == null) {
            this.b = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.b;
    }

    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return b();
        }
        return getBaseContext().getSystemService(str);
    }
}
