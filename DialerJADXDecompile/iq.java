import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
final class iq extends io {
    iq() {
    }

    public final Object a(in inVar) {
        return buf.a(new iu(this, inVar));
    }

    public final nb a(Object obj, View view) {
        Object b = buf.b(obj, view);
        if (b != null) {
            return new nb(b);
        }
        return null;
    }

    public final boolean a(Object obj, View view, int i, Bundle bundle) {
        return buf.a(obj, view, i, bundle);
    }
}
