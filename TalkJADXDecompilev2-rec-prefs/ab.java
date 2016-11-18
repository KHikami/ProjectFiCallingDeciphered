package p000;

import android.support.design.widget.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class ab extends lt {
    final /* synthetic */ CheckableImageButton f100a;

    public ab(CheckableImageButton checkableImageButton) {
        this.f100a = checkableImageButton;
    }

    public void mo12a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo12a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f100a.isChecked());
    }

    public void mo13a(View view, ql qlVar) {
        super.mo13a(view, qlVar);
        qlVar.a(true);
        qlVar.b(this.f100a.isChecked());
    }
}
