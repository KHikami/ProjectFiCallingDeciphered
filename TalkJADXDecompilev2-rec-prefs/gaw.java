package p000;

import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class gaw extends gqs {
    static final int f14566a = etx.STATUS_MESSAGE.f12271l;
    String f14567b;
    Spannable f14568c;
    final View f14569d;
    final OnClickListener f14570e = new gax(this);
    private final erm f14571g;

    public gaw(kbu kbu, int i, TextView textView, View view) {
        super(textView);
        this.f14569d = view;
        this.f14571g = new gay(this, textView.getContext(), kbu, i);
    }

    public void mo2174a(String str, String str2) {
        this.f14567b = str;
        this.f14571g.m7738a(str2);
    }

    public void mo2173a() {
        mo2174a(null, null);
        super.mo2173a();
    }

    protected void mo2175b() {
        if (this.f14571g.m7741e() != null) {
            int i = !TextUtils.isEmpty(this.f14568c) ? 0 : 8;
            if (!TextUtils.isEmpty(this.f14568c)) {
                gob.m18199a(this.f.getContext()).mo2308a(this.f14568c, null, this.f);
            }
            this.f.setVisibility(i);
            this.f.setText(this.f14568c);
            return;
        }
        super.mo2175b();
    }
}
