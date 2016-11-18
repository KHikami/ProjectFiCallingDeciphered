package p000;

import android.database.Cursor;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekx implements OnDismissListener {
    final /* synthetic */ Cursor f11783a;
    final /* synthetic */ Runnable f11784b;
    final /* synthetic */ DebugActivity f11785c;

    public ekx(DebugActivity debugActivity, Cursor cursor, Runnable runnable) {
        this.f11785c = debugActivity;
        this.f11783a = cursor;
        this.f11784b = runnable;
    }

    public void onDismiss() {
        if (this.f11783a != null) {
            this.f11783a.close();
        }
        if (this.f11784b != null) {
            this.f11784b.run();
        }
    }
}
