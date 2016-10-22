package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

/* renamed from: dav */
final class dav implements OnCheckedChangeListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ dau b;

    dav(dau dau, TextView textView) {
        this.b = dau;
        this.a = textView;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }
}
