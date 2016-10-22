import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
public final class fz implements Iterable {
    public final ArrayList a;
    public final Context b;

    static {
        if (VERSION.SDK_INT >= 11) {
            gc gcVar = new gc();
        } else {
            gb gbVar = new gb();
        }
    }

    public fz(Context context) {
        this.a = new ArrayList();
        this.b = context;
    }

    public final fz a(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent a = ei.a(this.b, componentName);
            while (a != null) {
                this.a.add(size, a);
                a = ei.a(this.b, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
