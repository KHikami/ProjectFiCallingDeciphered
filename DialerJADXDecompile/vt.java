import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: PG */
final class vt implements OnScrollChangedListener {
    private /* synthetic */ Field a;
    private /* synthetic */ PopupWindow b;
    private /* synthetic */ OnScrollChangedListener c;

    vt(Field field, PopupWindow popupWindow, OnScrollChangedListener onScrollChangedListener) {
        this.a = field;
        this.b = popupWindow;
        this.c = onScrollChangedListener;
    }

    public final void onScrollChanged() {
        try {
            WeakReference weakReference = (WeakReference) this.a.get(this.b);
            if (weakReference != null && weakReference.get() != null) {
                this.c.onScrollChanged();
            }
        } catch (IllegalAccessException e) {
        }
    }
}
