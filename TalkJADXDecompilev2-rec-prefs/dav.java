package p000;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

final class dav implements OnCheckedChangeListener {
    final /* synthetic */ TextView f9438a;
    final /* synthetic */ dau f9439b;

    dav(dau dau, TextView textView) {
        this.f9439b = dau;
        this.f9438a = textView;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f9438a.setVisibility(z ? 0 : 8);
    }
}
