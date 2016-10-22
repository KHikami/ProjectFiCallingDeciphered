import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.LicenseActivity;

public final class jlz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ScrollView b;
    final /* synthetic */ LicenseActivity c;

    public jlz(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.c = licenseActivity;
        this.a = i;
        this.b = scrollView;
    }

    public void run() {
        TextView textView = (TextView) this.c.findViewById(gwb.zh);
        this.b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.a)));
    }
}
