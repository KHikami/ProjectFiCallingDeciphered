package p000;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class aas implements OnScrollChangedListener {
    final /* synthetic */ Field f60a;
    final /* synthetic */ PopupWindow f61b;
    final /* synthetic */ OnScrollChangedListener f62c;

    aas(Field field, PopupWindow popupWindow, OnScrollChangedListener onScrollChangedListener) {
        this.f60a = field;
        this.f61b = popupWindow;
        this.f62c = onScrollChangedListener;
    }

    public void onScrollChanged() {
        try {
            WeakReference weakReference = (WeakReference) this.f60a.get(this.f61b);
            if (weakReference != null && weakReference.get() != null) {
                this.f62c.onScrollChanged();
            }
        } catch (IllegalAccessException e) {
        }
    }
}
