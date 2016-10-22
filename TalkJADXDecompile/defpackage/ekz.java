package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

/* renamed from: ekz */
public final class ekz implements OnClickListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ TextView b;
    final /* synthetic */ DebugActivity c;

    ekz(DebugActivity debugActivity, TextView textView, TextView textView2) {
        this.c = debugActivity;
        this.a = textView;
        this.b = textView2;
    }

    public void onClick(View view) {
        if (view == this.a) {
            ((LayoutParams) this.c.b.getLayoutParams()).weight = 5.0f;
            ((LayoutParams) this.c.d.getLayoutParams()).weight = 1.0f;
        } else if (view == this.b) {
            ((LayoutParams) this.c.b.getLayoutParams()).weight = 1.0f;
            ((LayoutParams) this.c.d.getLayoutParams()).weight = 5.0f;
        }
        this.a.getParent().requestLayout();
    }
}
