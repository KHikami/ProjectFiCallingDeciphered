import com.google.android.apps.hangouts.notifications.DndDialogActivity;

public final class eas implements Runnable {
    final /* synthetic */ DndDialogActivity a;

    public eas(DndDialogActivity dndDialogActivity) {
        this.a = dndDialogActivity;
    }

    public void run() {
        this.a.finish();
    }
}
