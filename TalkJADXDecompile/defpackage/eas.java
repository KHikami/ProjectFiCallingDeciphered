package defpackage;

import com.google.android.apps.hangouts.notifications.DndDialogActivity;

/* renamed from: eas */
public final class eas implements Runnable {
    final /* synthetic */ DndDialogActivity a;

    public eas(DndDialogActivity dndDialogActivity) {
        this.a = dndDialogActivity;
    }

    public void run() {
        this.a.finish();
    }
}
