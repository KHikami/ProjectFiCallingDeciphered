import android.support.design.widget.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class ab extends lt {
    final /* synthetic */ CheckableImageButton a;

    public ab(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.isChecked());
    }

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        qlVar.a(true);
        qlVar.b(this.a.isChecked());
    }
}
