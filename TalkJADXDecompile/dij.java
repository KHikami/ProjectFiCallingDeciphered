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
    private View a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private boolean e;

    public dij(Context context, AttributeSet attributeSet) {
        super(context, null);
        setPadding(0, 0, 0, 0);
        setOrientation(0);
        LayoutInflater.from(context).inflate(gwb.gJ, this, true);
        this.b = (ImageView) findViewById(ba.ce);
        this.a = findViewById(ba.ch);
        this.c = (TextView) findViewById(ba.cg);
        this.d = (TextView) findViewById(ba.cf);
        this.e = false;
        a();
    }

    public void a(String str) {
        TextView textView = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        textView.setText(str);
        a();
    }

    public void b(String str) {
        TextView textView = this.d;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        textView.setText(str);
        a();
    }

    public void a(Drawable drawable) {
        this.e = drawable != null;
        this.b.setImageDrawable(drawable);
        a();
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

    private void a() {
        int i;
        int i2 = 8;
        boolean isEmpty = TextUtils.isEmpty(this.c.getText());
        boolean isEmpty2 = TextUtils.isEmpty(this.d.getText());
        this.c.setVisibility(isEmpty ? 8 : 0);
        TextView textView = this.d;
        if (isEmpty2) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        View view = this.a;
        if (isEmpty && isEmpty2) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        ImageView imageView = this.b;
        if (this.e) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (!(isEmpty && isEmpty2 && !this.e)) {
            i2 = 0;
        }
        setVisibility(i2);
    }
}
