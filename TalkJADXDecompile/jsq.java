import android.content.Context;
import java.util.List;

final class jsq implements jsn {
    private final List<jso> a;
    private final Context b;

    jsq(Context context) {
        this.a = jyn.c(context, jso.class);
        this.b = context;
    }

    public void a(jsp jsp) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i);
        }
    }
}
