import android.text.TextUtils;
import android.widget.TextView;

public class gqs {
    private CharSequence a;
    public final TextView f;

    public gqs(TextView textView) {
        this.f = textView;
    }

    public void a(String str, String str2) {
    }

    public void b() {
        this.f.setVisibility(!TextUtils.isEmpty(this.a) ? 0 : 8);
        this.f.setText(this.a);
    }

    public void a() {
        this.a = null;
        b();
    }
}
