import android.os.Bundle;
import android.view.View;

final class lw extends lu {
    lw() {
    }

    public Object a(lt ltVar) {
        return gwb.a(new ma(this, ltVar));
    }

    public qx a(Object obj, View view) {
        Object b = gwb.b(obj, view);
        if (b != null) {
            return new qx(b);
        }
        return null;
    }

    public boolean a(Object obj, View view, int i, Bundle bundle) {
        return gwb.a(obj, view, i, bundle);
    }
}
