package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: cpv */
final class cpv implements OnClickListener {
    final /* synthetic */ TextView a;

    cpv(TextView textView) {
        this.a = textView;
    }

    public void onClick(View view) {
        this.a.setTextSize(0, Math.max(this.a.getTextSize() - 10.0f, 40.0f));
    }
}
