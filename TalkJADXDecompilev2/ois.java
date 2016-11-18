package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.xml.sax.Attributes;

final class ois {
    final /* synthetic */ oir a;
    private Paint b = null;
    private Paint c = null;
    private float d;
    private float e;
    private String f;
    private boolean g;
    private int h = 0;

    public ois(oir oir, Attributes attributes) {
        this.a = oir;
        this.d = oir.a("x", attributes, Float.valueOf(0.0f)).floatValue();
        this.e = oir.a("y", attributes, Float.valueOf(0.0f)).floatValue();
        this.f = null;
        this.g = true;
        oiq oiq = new oiq(attributes);
        if (oir.a(oiq, oir.w)) {
            this.c = new Paint(oir.h);
            oir.a(attributes, this.c);
        }
        if (oir.a(oiq)) {
            this.b = new Paint(oir.d);
            oir.a(attributes, this.b);
        }
        String b = oik.b("alignment-baseline", attributes);
        if ("middle".equals(b)) {
            this.h = 1;
        } else if ("top".equals(b)) {
            this.h = 2;
        }
    }

    public void a(char[] cArr, int i, int i2) {
        if (b()) {
            String str;
            ois ois;
            if (this.f == null) {
                str = new String(cArr, i, i2);
                ois = this;
            } else {
                String valueOf = String.valueOf(this.f);
                str = String.valueOf(new String(cArr, i, i2));
                if (str.length() != 0) {
                    str = valueOf.concat(str);
                    ois = this;
                } else {
                    str = new String(valueOf);
                    ois = this;
                }
            }
            ois.f = str;
            if (this.h > 0) {
                Paint paint = this.b == null ? this.c : this.b;
                Rect rect = new Rect();
                paint.getTextBounds(this.f, 0, this.f.length(), rect);
                this.e = (this.h == 1 ? (float) (-rect.centerY()) : (float) rect.height()) + this.e;
            }
        }
    }

    private boolean b() {
        return this.g;
    }

    public void a() {
        this.g = false;
    }

    public void a(Canvas canvas) {
        if (this.c != null) {
            canvas.drawText(this.f, this.d, this.e, this.c);
        }
        if (this.b != null) {
            canvas.drawText(this.f, this.d, this.e, this.b);
        }
    }
}
