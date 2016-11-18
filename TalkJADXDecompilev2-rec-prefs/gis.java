package p000;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;

public final class gis extends AccessibilityDelegate {
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (view instanceof ListView) {
            ListView listView = (ListView) view;
            if (accessibilityEvent.getEventType() != 4096 && accessibilityEvent.getEventType() != 2048) {
                return;
            }
            if (accessibilityEvent.getEventType() == 4096 || accessibilityEvent.getEventType() == 2048) {
                int headerViewsCount = listView.getHeaderViewsCount();
                int footerViewsCount = listView.getFooterViewsCount();
                int itemCount = accessibilityEvent.getItemCount();
                int fromIndex = accessibilityEvent.getFromIndex();
                int toIndex = accessibilityEvent.getToIndex();
                if (headerViewsCount + footerViewsCount >= itemCount || toIndex < headerViewsCount || fromIndex >= itemCount - footerViewsCount) {
                    accessibilityEvent.setItemCount(0);
                    return;
                }
                accessibilityEvent.setItemCount((itemCount - headerViewsCount) - footerViewsCount);
                fromIndex = Math.max(0, fromIndex - headerViewsCount);
                headerViewsCount = Math.min(((itemCount - headerViewsCount) - footerViewsCount) - 1, toIndex - headerViewsCount);
                accessibilityEvent.setFromIndex(fromIndex);
                accessibilityEvent.setToIndex(headerViewsCount);
            }
        }
    }
}
