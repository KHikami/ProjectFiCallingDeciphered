import android.view.View;

/* compiled from: PG */
public final class any extends zk {
    public View n;
    public View o;

    private any(View view) {
        super(view);
        this.n = view.findViewById(aq.aW);
        this.o = view.findViewById(aq.bo);
    }

    public static any a(View view) {
        return new any(view);
    }
}
