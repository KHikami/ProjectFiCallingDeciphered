import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class gaw extends gqs {
    static final int a;
    String b;
    Spannable c;
    final View d;
    final OnClickListener e;
    private final erm g;

    static {
        a = etx.STATUS_MESSAGE.l;
    }

    public gaw(kbu kbu, int i, TextView textView, View view) {
        super(textView);
        this.e = new gax(this);
        this.d = view;
        this.g = new gay(this, textView.getContext(), kbu, i);
    }

    public void a(String str, String str2) {
        this.b = str;
        this.g.a(str2);
    }

    public void a() {
        a(null, null);
        super.a();
    }

    protected void b() {
        if (this.g.e() != null) {
            int i = !TextUtils.isEmpty(this.c) ? 0 : 8;
            if (!TextUtils.isEmpty(this.c)) {
                gob.a(this.f.getContext()).a(this.c, null, this.f);
            }
            this.f.setVisibility(i);
            this.f.setText(this.c);
            return;
        }
        super.b();
    }
}
