import android.database.Cursor;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekx implements OnDismissListener {
    final /* synthetic */ Cursor a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ DebugActivity c;

    public ekx(DebugActivity debugActivity, Cursor cursor, Runnable runnable) {
        this.c = debugActivity;
        this.a = cursor;
        this.b = runnable;
    }

    public void onDismiss() {
        if (this.a != null) {
            this.a.close();
        }
        if (this.b != null) {
            this.b.run();
        }
    }
}
