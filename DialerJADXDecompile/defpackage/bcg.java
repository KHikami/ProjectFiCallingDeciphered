package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: bcg */
public class bcg {
    int a;
    String b;
    String c;

    public void a(View view) {
        int i = 8;
        ImageView imageView = (ImageView) view.findViewById(az.X);
        TextView textView = (TextView) view.findViewById(az.V);
        TextView textView2 = (TextView) view.findViewById(az.G);
        if (this.a == 0) {
            return;
        }
        if (this.b != null || this.c != null) {
            int i2;
            imageView.setImageDrawable(view.getContext().getDrawable(this.a));
            textView.setText(this.b);
            if (TextUtils.isEmpty(this.b)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            textView2.setText(this.c);
            if (!TextUtils.isEmpty(this.c)) {
                i = 0;
            }
            textView2.setVisibility(i);
        }
    }

    public bcg(byte b) {
        this();
    }
}
