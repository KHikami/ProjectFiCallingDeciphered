package p000;

import com.google.android.apps.hangouts.notifications.DndDialogActivity;

public final class eas implements Runnable {
    final /* synthetic */ DndDialogActivity f11074a;

    public eas(DndDialogActivity dndDialogActivity) {
        this.f11074a = dndDialogActivity;
    }

    public void run() {
        this.f11074a.finish();
    }
}
