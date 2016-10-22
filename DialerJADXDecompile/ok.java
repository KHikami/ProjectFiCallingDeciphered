import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: PG */
public final class ok implements Comparator {
    private final Rect a;
    private final Rect b;
    private final boolean c;
    private final oi d;

    public ok(boolean z, oi oiVar) {
        this.a = new Rect();
        this.b = new Rect();
        this.c = z;
        this.d = oiVar;
    }

    public final int compare(Object obj, Object obj2) {
        Rect rect = this.a;
        Rect rect2 = this.b;
        this.d.a(obj, rect);
        this.d.a(obj2, rect2);
        if (rect.top < rect2.top) {
            return -1;
        }
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left < rect2.left) {
            if (this.c) {
                return 1;
            }
            return -1;
        } else if (rect.left > rect2.left) {
            if (this.c) {
                return -1;
            }
            return 1;
        } else if (rect.bottom < rect2.bottom) {
            return -1;
        } else {
            if (rect.bottom > rect2.bottom) {
                return 1;
            }
            if (rect.right < rect2.right) {
                if (this.c) {
                    return 1;
                }
                return -1;
            } else if (rect.right <= rect2.right) {
                return 0;
            } else {
                if (this.c) {
                    return -1;
                }
                return 1;
            }
        }
    }
}
