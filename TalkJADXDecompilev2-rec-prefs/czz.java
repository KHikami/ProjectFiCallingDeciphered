package p000;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czz extends AccessibilityDelegate {
    final /* synthetic */ CallContactPickerFragment f9400a;

    public czz(CallContactPickerFragment callContactPickerFragment) {
        this.f9400a = callContactPickerFragment;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText().add(view.getResources().getString(bc.bl));
        return true;
    }
}
