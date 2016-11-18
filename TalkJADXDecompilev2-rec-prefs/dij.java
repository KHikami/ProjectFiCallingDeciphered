package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;

public final class dij extends LinearLayout {
    private View f9870a = findViewById(ba.ch);
    private ImageView f9871b = ((ImageView) findViewById(ba.ce));
    private TextView f9872c = ((TextView) findViewById(ba.cg));
    private TextView f9873d = ((TextView) findViewById(ba.cf));
    private boolean f9874e = false;

    public dij(Context context, AttributeSet attributeSet) {
        super(context, null);
        setPadding(0, 0, 0, 0);
        setOrientation(0);
        LayoutInflater.from(context).inflate(gwb.gJ, this, true);
        m12007a();
    }

    public void m12009a(String str) {
        TextView textView = this.f9872c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        textView.setText(str);
        m12007a();
    }

    public void m12010b(String str) {
        TextView textView = this.f9873d;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        textView.setText(str);
        m12007a();
    }

    public void m12008a(Drawable drawable) {
        this.f9874e = drawable != null;
        this.f9871b.setImageDrawable(drawable);
        m12007a();
    }

    public void setClickable(boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        super.setClickable(z);
        setBackgroundResource(z ? R$drawable.aD : 17170445);
        if (z) {
            dimensionPixelSize = getResources().getDimensionPixelSize(gwb.eV);
        } else {
            dimensionPixelSize = 0;
        }
        if (z) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(gwb.eW);
        } else {
            dimensionPixelSize2 = 0;
        }
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    private void m12007a() {
        int i;
        int i2 = 8;
        boolean isEmpty = TextUtils.isEmpty(this.f9872c.getText());
        boolean isEmpty2 = TextUtils.isEmpty(this.f9873d.getText());
        this.f9872c.setVisibility(isEmpty ? 8 : 0);
        TextView textView = this.f9873d;
        if (isEmpty2) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        View view = this.f9870a;
        if (isEmpty && isEmpty2) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        ImageView imageView = this.f9871b;
        if (this.f9874e) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (!(isEmpty && isEmpty2 && !this.f9874e)) {
            i2 = 0;
        }
        setVisibility(i2);
    }
}
