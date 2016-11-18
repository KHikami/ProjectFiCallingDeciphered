package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekz implements OnClickListener {
    final /* synthetic */ TextView f11788a;
    final /* synthetic */ TextView f11789b;
    final /* synthetic */ DebugActivity f11790c;

    ekz(DebugActivity debugActivity, TextView textView, TextView textView2) {
        this.f11790c = debugActivity;
        this.f11788a = textView;
        this.f11789b = textView2;
    }

    public void onClick(View view) {
        if (view == this.f11788a) {
            ((LayoutParams) this.f11790c.f6665b.getLayoutParams()).weight = 5.0f;
            ((LayoutParams) this.f11790c.f6667d.getLayoutParams()).weight = 1.0f;
        } else if (view == this.f11789b) {
            ((LayoutParams) this.f11790c.f6665b.getLayoutParams()).weight = 1.0f;
            ((LayoutParams) this.f11790c.f6667d.getLayoutParams()).weight = 5.0f;
        }
        this.f11788a.getParent().requestLayout();
    }
}
