package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class cpu implements OnClickListener {
    final /* synthetic */ TextView f8805a;

    cpu(TextView textView) {
        this.f8805a = textView;
    }

    public void onClick(View view) {
        this.f8805a.setTextSize(0, Math.min(this.f8805a.getTextSize() + 10.0f, 200.0f));
    }
}
