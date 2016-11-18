package p000;

import android.text.TextUtils;
import android.widget.TextView;

public class gqs {
    private CharSequence f14564a;
    public final TextView f14565f;

    public gqs(TextView textView) {
        this.f14565f = textView;
    }

    public void mo2174a(String str, String str2) {
    }

    public void mo2175b() {
        this.f14565f.setVisibility(!TextUtils.isEmpty(this.f14564a) ? 0 : 8);
        this.f14565f.setText(this.f14564a);
    }

    public void mo2173a() {
        this.f14564a = null;
        mo2175b();
    }
}
