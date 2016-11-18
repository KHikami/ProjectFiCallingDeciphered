package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class cpv implements OnClickListener {
    final /* synthetic */ TextView f8806a;

    cpv(TextView textView) {
        this.f8806a = textView;
    }

    public void onClick(View view) {
        this.f8806a.setTextSize(0, Math.max(this.f8806a.getTextSize() - 10.0f, 40.0f));
    }
}
