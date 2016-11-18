package p000;

import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.LicenseActivity;

public final class jlz implements Runnable {
    final /* synthetic */ int f20460a;
    final /* synthetic */ ScrollView f20461b;
    final /* synthetic */ LicenseActivity f20462c;

    public jlz(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.f20462c = licenseActivity;
        this.f20460a = i;
        this.f20461b = scrollView;
    }

    public void run() {
        TextView textView = (TextView) this.f20462c.findViewById(gwb.zh);
        this.f20461b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.f20460a)));
    }
}
