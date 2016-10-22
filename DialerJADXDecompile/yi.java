import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
public final class yi extends xx implements yh {
    public static Method a;
    public yh b;

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
        }
    }

    public yi(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    final xj a(Context context, boolean z) {
        xj yjVar = new yj(context, z);
        yjVar.d = this;
        return yjVar;
    }

    public final void b(su suVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.b(suVar, menuItem);
        }
    }

    public final void a(su suVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.a(suVar, menuItem);
        }
    }
}
