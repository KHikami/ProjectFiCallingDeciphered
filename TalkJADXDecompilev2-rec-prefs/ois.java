package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.xml.sax.Attributes;

final class ois {
    final /* synthetic */ oir f33039a;
    private Paint f33040b = null;
    private Paint f33041c = null;
    private float f33042d;
    private float f33043e;
    private String f33044f;
    private boolean f33045g;
    private int f33046h = 0;

    public ois(oir oir, Attributes attributes) {
        this.f33039a = oir;
        this.f33042d = oir.m38504a("x", attributes, Float.valueOf(0.0f)).floatValue();
        this.f33043e = oir.m38504a("y", attributes, Float.valueOf(0.0f)).floatValue();
        this.f33044f = null;
        this.f33045g = true;
        oiq oiq = new oiq(attributes);
        if (oir.m38509a(oiq, oir.f33035w)) {
            this.f33041c = new Paint(oir.f33020h);
            oir.m38510a(attributes, this.f33041c);
        }
        if (oir.m38508a(oiq)) {
            this.f33040b = new Paint(oir.f33016d);
            oir.m38510a(attributes, this.f33040b);
        }
        String b = oik.m38485b("alignment-baseline", attributes);
        if ("middle".equals(b)) {
            this.f33046h = 1;
        } else if ("top".equals(b)) {
            this.f33046h = 2;
        }
    }

    public void m38515a(char[] cArr, int i, int i2) {
        if (m38512b()) {
            String str;
            ois ois;
            if (this.f33044f == null) {
                str = new String(cArr, i, i2);
                ois = this;
            } else {
                String valueOf = String.valueOf(this.f33044f);
                str = String.valueOf(new String(cArr, i, i2));
                if (str.length() != 0) {
                    str = valueOf.concat(str);
                    ois = this;
                } else {
                    str = new String(valueOf);
                    ois = this;
                }
            }
            ois.f33044f = str;
            if (this.f33046h > 0) {
                Paint paint = this.f33040b == null ? this.f33041c : this.f33040b;
                Rect rect = new Rect();
                paint.getTextBounds(this.f33044f, 0, this.f33044f.length(), rect);
                this.f33043e = (this.f33046h == 1 ? (float) (-rect.centerY()) : (float) rect.height()) + this.f33043e;
            }
        }
    }

    private boolean m38512b() {
        return this.f33045g;
    }

    public void m38513a() {
        this.f33045g = false;
    }

    public void m38514a(Canvas canvas) {
        if (this.f33041c != null) {
            canvas.drawText(this.f33044f, this.f33042d, this.f33043e, this.f33041c);
        }
        if (this.f33040b != null) {
            canvas.drawText(this.f33044f, this.f33042d, this.f33043e, this.f33040b);
        }
    }
}
