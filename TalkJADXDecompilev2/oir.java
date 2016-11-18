package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class oir extends DefaultHandler {
    private static final Matrix E = new Matrix();
    private boolean A = false;
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    HashMap<String, String> a = new HashMap();
    Picture b;
    Canvas c;
    Paint d;
    boolean e = false;
    Stack<Paint> f = new Stack();
    Stack<Boolean> g = new Stack();
    Paint h;
    boolean i = false;
    Stack<Paint> j = new Stack();
    Stack<Boolean> k = new Stack();
    float l = 1.0f;
    Stack<Float> m = new Stack();
    RectF n = new RectF();
    RectF o = null;
    RectF p = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    Integer q = null;
    Integer r = null;
    boolean s = false;
    boolean t = false;
    float u = oik.a;
    int v = 0;
    HashMap<String, Shader> w = new HashMap();
    HashMap<String, oim> x = new HashMap();
    oim y = null;
    ois z = null;

    oir(Picture picture) {
        this.b = picture;
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.d.setStyle(Style.STROKE);
        this.h = new Paint();
        this.h.setAntiAlias(true);
        this.h.setStyle(Style.FILL);
    }

    public void a(float f) {
        this.u = f;
    }

    public void a(Integer num, Integer num2) {
        this.q = num;
        this.r = num2;
    }

    public void a(boolean z) {
        this.s = z;
    }

    public void b(boolean z) {
        this.t = z;
    }

    public void startDocument() {
    }

    public void endDocument() {
    }

    boolean a(oiq oiq, HashMap<String, Shader> hashMap) {
        if ("none".equals(oiq.b("display"))) {
            return false;
        }
        if (this.t) {
            this.h.setShader(null);
            this.h.setColor(-1);
            return true;
        }
        String b = oiq.b("fill");
        if (b != null) {
            String str;
            if (b.startsWith("url(#")) {
                b = b.substring(5, b.length() - 1);
                Shader shader = (Shader) hashMap.get(b);
                if (shader != null) {
                    this.h.setShader(shader);
                    return true;
                }
                str = "Didn't find shader, using black: ";
                b = String.valueOf(b);
                if (b.length() != 0) {
                    str.concat(b);
                } else {
                    b = new String(str);
                }
                this.h.setShader(null);
                a(oiq, Integer.valueOf(-16777216), true, this.h);
                return true;
            } else if (b.equalsIgnoreCase("none")) {
                this.h.setShader(null);
                this.h.setColor(0);
                return true;
            } else {
                this.h.setShader(null);
                Integer c = oiq.c("fill");
                if (c != null) {
                    a(oiq, c, true, this.h);
                    return true;
                }
                str = "Unrecognized fill color, using black: ";
                b = String.valueOf(b);
                if (b.length() != 0) {
                    str.concat(b);
                } else {
                    b = new String(str);
                }
                a(oiq, Integer.valueOf(-16777216), true, this.h);
                return true;
            }
        } else if (!this.i) {
            this.h.setShader(null);
            this.h.setColor(-16777216);
            return true;
        } else if (this.h.getColor() != 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean a(Attributes attributes, Paint paint) {
        Typeface typeface = null;
        if ("none".equals(attributes.getValue("display"))) {
            return false;
        }
        String value;
        Object value2;
        Object value3;
        if (attributes.getValue("font-size") != null) {
            paint.setTextSize(a("font-size", attributes, Float.valueOf(10.0f)).floatValue());
        }
        String str = "font-family";
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                value = attributes.getValue(i);
                break;
            }
        }
        value = null;
        String str2 = "font-style";
        int length2 = attributes.getLength();
        for (int i2 = 0; i2 < length2; i2++) {
            if (attributes.getLocalName(i2).equals(str2)) {
                value2 = attributes.getValue(i2);
                break;
            }
        }
        value2 = null;
        String str3 = "font-weight";
        int length3 = attributes.getLength();
        for (length = 0; length < length3; length++) {
            if (attributes.getLocalName(length).equals(str3)) {
                value3 = attributes.getValue(length);
                break;
            }
        }
        value3 = null;
        if (!(value == null && value2 == null && value3 == null)) {
            int i3;
            if ("italic".equals(value2)) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            if ("bold".equals(value3)) {
                i3 |= 1;
            }
            typeface = Typeface.create(value, i3);
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        if (oir.c(attributes) != null) {
            paint.setTextAlign(oir.c(attributes));
        }
        return true;
    }

    boolean a(oiq oiq) {
        float f = 0.0f;
        if (this.t || "none".equals(oiq.b("display"))) {
            return false;
        }
        Float d = oiq.d("stroke-width");
        if (d != null) {
            this.d.setStrokeWidth(d.floatValue());
        }
        if (this.d.getStrokeWidth() <= 0.0f) {
            return false;
        }
        String b = oiq.b("stroke-linecap");
        if ("round".equals(b)) {
            this.d.setStrokeCap(Cap.ROUND);
        } else if ("square".equals(b)) {
            this.d.setStrokeCap(Cap.SQUARE);
        } else if ("butt".equals(b)) {
            this.d.setStrokeCap(Cap.BUTT);
        }
        b = oiq.b("stroke-linejoin");
        if ("miter".equals(b)) {
            this.d.setStrokeJoin(Join.MITER);
        } else if ("round".equals(b)) {
            this.d.setStrokeJoin(Join.ROUND);
        } else if ("bevel".equals(b)) {
            this.d.setStrokeJoin(Join.BEVEL);
        }
        b = oiq.b("stroke-dasharray");
        String b2 = oiq.b("stroke-dashoffset");
        if (b != null) {
            if (b.equals("none")) {
                this.d.setPathEffect(null);
            } else {
                int i;
                StringTokenizer stringTokenizer = new StringTokenizer(b, " ,");
                int countTokens = stringTokenizer.countTokens();
                if ((countTokens & 1) == 1) {
                    countTokens <<= 1;
                }
                float[] fArr = new float[countTokens];
                float f2 = 1.0f;
                float f3 = 0.0f;
                countTokens = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    i = countTokens + 1;
                    f2 = oir.a(stringTokenizer.nextToken(), f2);
                    fArr[countTokens] = f2;
                    f3 += f2;
                    countTokens = i;
                }
                i = countTokens;
                countTokens = 0;
                while (i < fArr.length) {
                    f2 = fArr[countTokens];
                    fArr[i] = f2;
                    f3 += f2;
                    i++;
                    countTokens++;
                }
                if (b2 != null) {
                    try {
                        f = Float.parseFloat(b2) % f3;
                    } catch (NumberFormatException e) {
                    }
                }
                this.d.setPathEffect(new DashPathEffect(fArr, f));
            }
        }
        b = oiq.a("stroke");
        if (b != null) {
            if (b.equalsIgnoreCase("none")) {
                this.d.setColor(0);
                return false;
            }
            Integer c = oiq.c("stroke");
            if (c != null) {
                a(oiq, c, false, this.d);
                return true;
            }
            String str = "Unrecognized stroke color, using none: ";
            b = String.valueOf(b);
            if (b.length() != 0) {
                str.concat(b);
            } else {
                b = new String(str);
            }
            this.d.setColor(0);
            return false;
        } else if (!this.e) {
            this.d.setColor(0);
            return false;
        } else if (this.d.getColor() != 0) {
            return true;
        } else {
            return false;
        }
    }

    private oim a(boolean z, Attributes attributes) {
        int i;
        String value;
        oim oim = new oim();
        String str = "id";
        int length = attributes.getLength();
        for (i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                value = attributes.getValue(i);
                break;
            }
        }
        value = null;
        oim.a = value;
        oim.c = z;
        if (z) {
            oim.d = a("x1", attributes, Float.valueOf(0.0f)).floatValue();
            oim.f = a("x2", attributes, Float.valueOf(0.0f)).floatValue();
            oim.e = a("y1", attributes, Float.valueOf(0.0f)).floatValue();
            oim.g = a("y2", attributes, Float.valueOf(0.0f)).floatValue();
        } else {
            oim.h = a("cx", attributes, Float.valueOf(0.0f)).floatValue();
            oim.i = a("cy", attributes, Float.valueOf(0.0f)).floatValue();
            oim.j = a("r", attributes, Float.valueOf(0.0f)).floatValue();
        }
        str = "gradientTransform";
        length = attributes.getLength();
        for (i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                value = attributes.getValue(i);
                break;
            }
        }
        value = null;
        if (value != null) {
            Matrix matrix = new Matrix();
            str = value;
            while (true) {
                oip a;
                if (str.startsWith("matrix(")) {
                    if (oik.a(str.substring(7)).a.size() == 6) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{((Float) a.a.get(0)).floatValue(), ((Float) a.a.get(2)).floatValue(), ((Float) a.a.get(4)).floatValue(), ((Float) a.a.get(1)).floatValue(), ((Float) a.a.get(3)).floatValue(), ((Float) a.a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                    }
                } else if (str.startsWith("translate(")) {
                    a = oik.a(str.substring(10));
                    if (a.a.size() > 0) {
                        float floatValue = ((Float) a.a.get(0)).floatValue();
                        r0 = 0.0f;
                        if (a.a.size() > 1) {
                            r0 = ((Float) a.a.get(1)).floatValue();
                        }
                        matrix.preTranslate(floatValue, r0);
                    }
                } else if (str.startsWith("scale(")) {
                    r5 = oik.a(str.substring(6));
                    if (r5.a.size() > 0) {
                        r2 = ((Float) r5.a.get(0)).floatValue();
                        if (r5.a.size() > 1) {
                            r0 = ((Float) r5.a.get(1)).floatValue();
                        } else {
                            r0 = r2;
                        }
                        matrix.preScale(r2, r0);
                    }
                } else if (str.startsWith("skewX(")) {
                    r0 = oik.a(str.substring(6));
                    if (r0.a.size() > 0) {
                        matrix.preSkew((float) Math.tan((double) ((Float) r0.a.get(0)).floatValue()), 0.0f);
                    }
                } else if (str.startsWith("skewY(")) {
                    r0 = oik.a(str.substring(6));
                    if (r0.a.size() > 0) {
                        matrix.preSkew(0.0f, (float) Math.tan((double) ((Float) r0.a.get(0)).floatValue()));
                    }
                } else if (str.startsWith("rotate(")) {
                    r5 = oik.a(str.substring(7));
                    if (r5.a.size() > 0) {
                        float floatValue2 = ((Float) r5.a.get(0)).floatValue();
                        r2 = 0.0f;
                        r0 = 0.0f;
                        if (r5.a.size() > 2) {
                            r2 = ((Float) r5.a.get(1)).floatValue();
                            r0 = ((Float) r5.a.get(2)).floatValue();
                        }
                        matrix.preTranslate(r2, r0);
                        matrix.preRotate(floatValue2);
                        matrix.preTranslate(-r2, -r0);
                    }
                } else {
                    new StringBuilder(String.valueOf(str).length() + 20).append("Invalid transform (").append(str).append(")");
                }
                i = str.indexOf(")");
                if (i <= 0 || str.length() <= i + 1) {
                    oim.m = matrix;
                } else {
                    str = str.substring(i + 1).replaceFirst("[\\s,]*", "");
                }
            }
            oim.m = matrix;
        }
        value = oik.b("href", attributes);
        if (value != null) {
            if (value.startsWith("#")) {
                value = value.substring(1);
            }
            oim.b = value;
        }
        return oim;
    }

    private void a(oiq oiq, Integer num, boolean z, Paint paint) {
        paint.setColor(a(num.intValue()) | -16777216);
        Float d = oiq.d("opacity");
        if (d == null) {
            d = oiq.d(z ? "fill-opacity" : "stroke-opacity");
        }
        if (d == null) {
            d = Float.valueOf(1.0f);
        }
        int intValue = num.intValue();
        if (this.q != null && this.q.intValue() == intValue && this.r != null && this.s) {
            d = Float.valueOf((d.floatValue() * ((float) (this.r.intValue() >>> 24))) / 255.0f);
        }
        paint.setAlpha((int) ((d.floatValue() * 255.0f) * this.l));
    }

    private int a(int i) {
        int i2 = 16777215 & i;
        if (this.q == null || this.q.intValue() != i2 || this.r == null) {
            return i2;
        }
        String.format("Replacing color: 0x%x->0x%x", new Object[]{Integer.valueOf(i2), this.r});
        return this.r.intValue();
    }

    private static float a(String str, float f) {
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException e) {
        }
        return f;
    }

    private void a(float f, float f2) {
        if (f < this.p.left) {
            this.p.left = f;
        }
        if (f > this.p.right) {
            this.p.right = f;
        }
        if (f2 < this.p.top) {
            this.p.top = f2;
        }
        if (f2 > this.p.bottom) {
            this.p.bottom = f2;
        }
    }

    private void a(float f, float f2, float f3, float f4) {
        a(f, f2);
        a(f + f3, f2 + f4);
    }

    private void a(Path path) {
        path.computeBounds(this.n, false);
        a(this.n.left, this.n.top);
        a(this.n.right, this.n.bottom);
    }

    private void a(Attributes attributes) {
        int i;
        String value;
        Matrix matrix;
        String str = "transform";
        int length = attributes.getLength();
        for (i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                value = attributes.getValue(i);
                break;
            }
        }
        value = null;
        if (value == null) {
            matrix = E;
        } else {
            Matrix matrix2 = new Matrix();
            str = value;
            while (true) {
                oip a;
                if (str.startsWith("matrix(")) {
                    if (oik.a(str.substring(7)).a.size() == 6) {
                        Matrix matrix3 = new Matrix();
                        matrix3.setValues(new float[]{((Float) a.a.get(0)).floatValue(), ((Float) a.a.get(2)).floatValue(), ((Float) a.a.get(4)).floatValue(), ((Float) a.a.get(1)).floatValue(), ((Float) a.a.get(3)).floatValue(), ((Float) a.a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                        matrix2.preConcat(matrix3);
                    }
                } else if (str.startsWith("translate(")) {
                    a = oik.a(str.substring(10));
                    if (a.a.size() > 0) {
                        float floatValue = ((Float) a.a.get(0)).floatValue();
                        if (a.a.size() > 1) {
                            r0 = ((Float) a.a.get(1)).floatValue();
                        } else {
                            r0 = 0.0f;
                        }
                        matrix2.preTranslate(floatValue, r0);
                    }
                } else if (str.startsWith("scale(")) {
                    r6 = oik.a(str.substring(6));
                    if (r6.a.size() > 0) {
                        r3 = ((Float) r6.a.get(0)).floatValue();
                        if (r6.a.size() > 1) {
                            r0 = ((Float) r6.a.get(1)).floatValue();
                        } else {
                            r0 = r3;
                        }
                        matrix2.preScale(r3, r0);
                    }
                } else if (str.startsWith("skewX(")) {
                    r0 = oik.a(str.substring(6));
                    if (r0.a.size() > 0) {
                        matrix2.preSkew((float) Math.tan((double) ((Float) r0.a.get(0)).floatValue()), 0.0f);
                    }
                } else if (str.startsWith("skewY(")) {
                    r0 = oik.a(str.substring(6));
                    if (r0.a.size() > 0) {
                        matrix2.preSkew(0.0f, (float) Math.tan((double) ((Float) r0.a.get(0)).floatValue()));
                    }
                } else if (str.startsWith("rotate(")) {
                    r6 = oik.a(str.substring(7));
                    if (r6.a.size() > 0) {
                        float floatValue2 = ((Float) r6.a.get(0)).floatValue();
                        if (r6.a.size() > 2) {
                            r3 = ((Float) r6.a.get(1)).floatValue();
                            r0 = ((Float) r6.a.get(2)).floatValue();
                        } else {
                            r0 = 0.0f;
                            r3 = 0.0f;
                        }
                        matrix2.preTranslate(r3, r0);
                        matrix2.preRotate(floatValue2);
                        matrix2.preTranslate(-r3, -r0);
                    }
                } else {
                    new StringBuilder(String.valueOf(str).length() + 20).append("Invalid transform (").append(str).append(")");
                }
                i = str.indexOf(")");
                if (i <= 0 || str.length() <= i + 1) {
                    matrix = matrix2;
                } else {
                    str = str.substring(i + 1).replaceFirst("[\\s,]*", "");
                }
            }
            matrix = matrix2;
        }
        this.v++;
        this.c.save();
        this.c.concat(matrix);
    }

    private void a() {
        this.c.restore();
        this.v--;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startElement(java.lang.String r16, java.lang.String r17, java.lang.String r18, org.xml.sax.Attributes r19) {
        /*
        r15 = this;
        r2 = r15.e;
        if (r2 != 0) goto L_0x000b;
    L_0x0004:
        r2 = r15.d;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2.setAlpha(r3);
    L_0x000b:
        r2 = r15.i;
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        r2 = r15.h;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2.setAlpha(r3);
    L_0x0016:
        r2 = r15.C;
        if (r2 == 0) goto L_0x0078;
    L_0x001a:
        r2 = "rect";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0077;
    L_0x0024:
        r2 = "x";
        r3 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0, r3);
        if (r2 != 0) goto L_0x0034;
    L_0x002f:
        r2 = 0;
        r2 = java.lang.Float.valueOf(r2);
    L_0x0034:
        r3 = "y";
        r4 = 0;
        r0 = r19;
        r3 = r15.a(r3, r0, r4);
        if (r3 != 0) goto L_0x0044;
    L_0x003f:
        r3 = 0;
        r3 = java.lang.Float.valueOf(r3);
    L_0x0044:
        r4 = "width";
        r5 = 0;
        r0 = r19;
        r4 = r15.a(r4, r0, r5);
        r5 = "height";
        r6 = 0;
        r0 = r19;
        r5 = r15.a(r5, r0, r6);
        r6 = new android.graphics.RectF;
        r7 = r2.floatValue();
        r8 = r3.floatValue();
        r2 = r2.floatValue();
        r4 = r4.floatValue();
        r2 = r2 + r4;
        r3 = r3.floatValue();
        r4 = r5.floatValue();
        r3 = r3 + r4;
        r6.<init>(r7, r8, r2, r3);
        r15.o = r6;
    L_0x0077:
        return;
    L_0x0078:
        r2 = r15.D;
        if (r2 != 0) goto L_0x0077;
    L_0x007c:
        r2 = "svg";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00b5;
    L_0x0086:
        r2 = "width";
        r3 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0, r3);
        r2 = r2.floatValue();
        r2 = (double) r2;
        r2 = java.lang.Math.ceil(r2);
        r2 = (int) r2;
        r3 = "height";
        r4 = 0;
        r0 = r19;
        r3 = r15.a(r3, r0, r4);
        r3 = r3.floatValue();
        r4 = (double) r3;
        r4 = java.lang.Math.ceil(r4);
        r3 = (int) r4;
        r4 = r15.b;
        r2 = r4.beginRecording(r2, r3);
        r15.c = r2;
        goto L_0x0077;
    L_0x00b5:
        r2 = "defs";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00c3;
    L_0x00bf:
        r2 = 1;
        r15.D = r2;
        goto L_0x0077;
    L_0x00c3:
        r2 = "linearGradient";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00d7;
    L_0x00cd:
        r2 = 1;
        r0 = r19;
        r2 = r15.a(r2, r0);
        r15.y = r2;
        goto L_0x0077;
    L_0x00d7:
        r2 = "radialGradient";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00eb;
    L_0x00e1:
        r2 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0);
        r15.y = r2;
        goto L_0x0077;
    L_0x00eb:
        r2 = "stop";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x016d;
    L_0x00f5:
        r2 = r15.y;
        if (r2 == 0) goto L_0x0077;
    L_0x00f9:
        r2 = "offset";
        r3 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0, r3);
        r3 = r2.floatValue();
        r2 = "style";
        r0 = r19;
        r2 = defpackage.oik.b(r2, r0);
        r4 = new oit;
        r4.<init>(r2);
        r2 = "stop-color";
        r5 = r4.a(r2);
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        if (r5 == 0) goto L_0x0130;
    L_0x011d:
        r2 = "#";
        r2 = r5.startsWith(r2);
        if (r2 == 0) goto L_0x0162;
    L_0x0125:
        r2 = 1;
        r2 = r5.substring(r2);
        r5 = 16;
        r2 = java.lang.Integer.parseInt(r2, r5);
    L_0x0130:
        r2 = r15.a(r2);
        r5 = "stop-opacity";
        r4 = r4.a(r5);
        if (r4 == 0) goto L_0x0169;
    L_0x013c:
        r4 = java.lang.Float.parseFloat(r4);
        r5 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r4 = r4 * r5;
        r4 = java.lang.Math.round(r4);
        r4 = r4 << 24;
        r2 = r2 | r4;
    L_0x014a:
        r4 = r15.y;
        r4 = r4.k;
        r3 = java.lang.Float.valueOf(r3);
        r4.add(r3);
        r3 = r15.y;
        r3 = r3.l;
        r2 = java.lang.Integer.valueOf(r2);
        r3.add(r2);
        goto L_0x0077;
    L_0x0162:
        r2 = 16;
        r2 = java.lang.Integer.parseInt(r5, r2);
        goto L_0x0130;
    L_0x0169:
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r2 | r4;
        goto L_0x014a;
    L_0x016d:
        r2 = "use";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x031e;
    L_0x0177:
        r2 = "xlink:href";
        r0 = r19;
        r3 = r0.getValue(r2);
        r2 = "transform";
        r0 = r19;
        r2 = r0.getValue(r2);
        r4 = "x";
        r0 = r19;
        r4 = r0.getValue(r4);
        r5 = "y";
        r0 = r19;
        r5 = r0.getValue(r5);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "<g";
        r6.append(r7);
        r7 = " xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' version='1.1'";
        r6.append(r7);
        if (r2 != 0) goto L_0x01ac;
    L_0x01a8:
        if (r4 != 0) goto L_0x01ac;
    L_0x01aa:
        if (r5 == 0) goto L_0x0250;
    L_0x01ac:
        r7 = " transform='";
        r6.append(r7);
        if (r2 == 0) goto L_0x01de;
    L_0x01b3:
        r7 = "\"";
        r8 = "&quot;";
        r2 = r2.replaceAll(r7, r8);
        r7 = "'";
        r8 = "&apos";
        r2 = r2.replaceAll(r7, r8);
        r7 = "<";
        r8 = "&lt;";
        r2 = r2.replaceAll(r7, r8);
        r7 = ">";
        r8 = "&gt;";
        r2 = r2.replaceAll(r7, r8);
        r7 = "&";
        r8 = "&amp;";
        r2 = r2.replaceAll(r7, r8);
        r6.append(r2);
    L_0x01de:
        if (r4 != 0) goto L_0x01e2;
    L_0x01e0:
        if (r5 == 0) goto L_0x024b;
    L_0x01e2:
        r2 = "translate(";
        r6.append(r2);
        if (r4 == 0) goto L_0x02d4;
    L_0x01e9:
        r2 = "\"";
        r7 = "&quot;";
        r2 = r4.replaceAll(r2, r7);
        r4 = "'";
        r7 = "&apos";
        r2 = r2.replaceAll(r4, r7);
        r4 = "<";
        r7 = "&lt;";
        r2 = r2.replaceAll(r4, r7);
        r4 = ">";
        r7 = "&gt;";
        r2 = r2.replaceAll(r4, r7);
        r4 = "&";
        r7 = "&amp;";
        r2 = r2.replaceAll(r4, r7);
    L_0x0211:
        r6.append(r2);
        r2 = ",";
        r6.append(r2);
        if (r5 == 0) goto L_0x02d8;
    L_0x021b:
        r2 = "\"";
        r4 = "&quot;";
        r2 = r5.replaceAll(r2, r4);
        r4 = "'";
        r5 = "&apos";
        r2 = r2.replaceAll(r4, r5);
        r4 = "<";
        r5 = "&lt;";
        r2 = r2.replaceAll(r4, r5);
        r4 = ">";
        r5 = "&gt;";
        r2 = r2.replaceAll(r4, r5);
        r4 = "&";
        r5 = "&amp;";
        r2 = r2.replaceAll(r4, r5);
    L_0x0243:
        r6.append(r2);
        r2 = ")";
        r6.append(r2);
    L_0x024b:
        r2 = "'";
        r6.append(r2);
    L_0x0250:
        r2 = 0;
    L_0x0251:
        r4 = r19.getLength();
        if (r2 >= r4) goto L_0x02dc;
    L_0x0257:
        r0 = r19;
        r4 = r0.getQName(r2);
        r5 = "x";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x02d0;
    L_0x0265:
        r5 = "y";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x02d0;
    L_0x026d:
        r5 = "width";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x02d0;
    L_0x0275:
        r5 = "height";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x02d0;
    L_0x027d:
        r5 = "xlink:href";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x02d0;
    L_0x0285:
        r5 = "transform";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x02d0;
    L_0x028d:
        r5 = " ";
        r6.append(r5);
        r6.append(r4);
        r4 = "='";
        r6.append(r4);
        r0 = r19;
        r4 = r0.getValue(r2);
        r5 = "\"";
        r7 = "&quot;";
        r4 = r4.replaceAll(r5, r7);
        r5 = "'";
        r7 = "&apos";
        r4 = r4.replaceAll(r5, r7);
        r5 = "<";
        r7 = "&lt;";
        r4 = r4.replaceAll(r5, r7);
        r5 = ">";
        r7 = "&gt;";
        r4 = r4.replaceAll(r5, r7);
        r5 = "&";
        r7 = "&amp;";
        r4 = r4.replaceAll(r5, r7);
        r6.append(r4);
        r4 = "'";
        r6.append(r4);
    L_0x02d0:
        r2 = r2 + 1;
        goto L_0x0251;
    L_0x02d4:
        r2 = "0";
        goto L_0x0211;
    L_0x02d8:
        r2 = "0";
        goto L_0x0243;
    L_0x02dc:
        r2 = ">";
        r6.append(r2);
        r2 = r15.a;
        r4 = 1;
        r3 = r3.substring(r4);
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        r6.append(r2);
        r2 = "</g>";
        r6.append(r2);
        r2 = new org.xml.sax.InputSource;
        r3 = new java.io.StringReader;
        r4 = r6.toString();
        r3.<init>(r4);
        r2.<init>(r3);
        r3 = javax.xml.parsers.SAXParserFactory.newInstance();	 Catch:{ Exception -> 0x0318 }
        r3 = r3.newSAXParser();	 Catch:{ Exception -> 0x0318 }
        r3 = r3.getXMLReader();	 Catch:{ Exception -> 0x0318 }
        r3.setContentHandler(r15);	 Catch:{ Exception -> 0x0318 }
        r3.parse(r2);	 Catch:{ Exception -> 0x0318 }
        goto L_0x0077;
    L_0x0318:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0077;
    L_0x031e:
        r2 = "g";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x03f0;
    L_0x0328:
        r2 = "bounds";
        r3 = "id";
        r0 = r19;
        r3 = defpackage.oik.b(r3, r0);
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x033b;
    L_0x0338:
        r2 = 1;
        r15.C = r2;
    L_0x033b:
        r2 = r15.A;
        if (r2 == 0) goto L_0x0345;
    L_0x033f:
        r2 = r15.B;
        r2 = r2 + 1;
        r15.B = r2;
    L_0x0345:
        r2 = "none";
        r3 = "display";
        r0 = r19;
        r3 = defpackage.oik.b(r3, r0);
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x035f;
    L_0x0355:
        r2 = r15.A;
        if (r2 != 0) goto L_0x035f;
    L_0x0359:
        r2 = 1;
        r15.A = r2;
        r2 = 1;
        r15.B = r2;
    L_0x035f:
        r0 = r19;
        r15.a(r0);
        r3 = new oiq;
        r0 = r19;
        r3.<init>(r0);
        r2 = r15.j;
        r4 = new android.graphics.Paint;
        r5 = r15.h;
        r4.<init>(r5);
        r2.push(r4);
        r2 = r15.f;
        r4 = new android.graphics.Paint;
        r5 = r15.d;
        r4.<init>(r5);
        r2.push(r4);
        r2 = r15.k;
        r4 = r15.i;
        r4 = java.lang.Boolean.valueOf(r4);
        r2.push(r4);
        r2 = r15.g;
        r4 = r15.e;
        r4 = java.lang.Boolean.valueOf(r4);
        r2.push(r4);
        r2 = r15.m;
        r4 = r15.l;
        r4 = java.lang.Float.valueOf(r4);
        r2.push(r4);
        r2 = "opacity";
        r4 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0, r4);
        if (r2 == 0) goto L_0x03b8;
    L_0x03af:
        r4 = r15.l;
        r2 = r2.floatValue();
        r2 = r2 * r4;
        r15.l = r2;
    L_0x03b8:
        r2 = r15.h;
        r0 = r19;
        r15.a(r0, r2);
        r2 = r15.d;
        r0 = r19;
        r15.a(r0, r2);
        r2 = r15.w;
        r15.a(r3, r2);
        r15.a(r3);
        r4 = r15.i;
        r2 = "fill";
        r2 = r3.b(r2);
        if (r2 == 0) goto L_0x03ec;
    L_0x03d8:
        r2 = 1;
    L_0x03d9:
        r2 = r2 | r4;
        r15.i = r2;
        r4 = r15.e;
        r2 = "stroke";
        r2 = r3.b(r2);
        if (r2 == 0) goto L_0x03ee;
    L_0x03e6:
        r2 = 1;
    L_0x03e7:
        r2 = r2 | r4;
        r15.e = r2;
        goto L_0x0077;
    L_0x03ec:
        r2 = 0;
        goto L_0x03d9;
    L_0x03ee:
        r2 = 0;
        goto L_0x03e7;
    L_0x03f0:
        r2 = r15.A;
        if (r2 != 0) goto L_0x053e;
    L_0x03f4:
        r2 = "rect";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x053e;
    L_0x03fe:
        r2 = "x";
        r3 = 0;
        r3 = java.lang.Float.valueOf(r3);
        r0 = r19;
        r8 = r15.a(r2, r0, r3);
        r2 = "y";
        r3 = 0;
        r3 = java.lang.Float.valueOf(r3);
        r0 = r19;
        r9 = r15.a(r2, r0, r3);
        r2 = "width";
        r3 = 0;
        r0 = r19;
        r10 = r15.a(r2, r0, r3);
        r2 = "height";
        r3 = 0;
        r0 = r19;
        r11 = r15.a(r2, r0, r3);
        r2 = "rx";
        r3 = 0;
        r3 = java.lang.Float.valueOf(r3);
        r0 = r19;
        r12 = r15.a(r2, r0, r3);
        r2 = "ry";
        r3 = 0;
        r3 = java.lang.Float.valueOf(r3);
        r0 = r19;
        r13 = r15.a(r2, r0, r3);
        r0 = r19;
        r15.a(r0);
        r14 = new oiq;
        r0 = r19;
        r14.<init>(r0);
        r2 = r15.w;
        r2 = r15.a(r14, r2);
        if (r2 == 0) goto L_0x049e;
    L_0x0458:
        r2 = r8.floatValue();
        r3 = r9.floatValue();
        r4 = r10.floatValue();
        r5 = r11.floatValue();
        r15.a(r2, r3, r4, r5);
        r2 = r12.floatValue();
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 > 0) goto L_0x04dc;
    L_0x0474:
        r2 = r13.floatValue();
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 > 0) goto L_0x04dc;
    L_0x047d:
        r2 = r15.c;
        r3 = r8.floatValue();
        r4 = r9.floatValue();
        r5 = r8.floatValue();
        r6 = r10.floatValue();
        r5 = r5 + r6;
        r6 = r9.floatValue();
        r7 = r11.floatValue();
        r6 = r6 + r7;
        r7 = r15.h;
        r2.drawRect(r3, r4, r5, r6, r7);
    L_0x049e:
        r2 = r15.a(r14);
        if (r2 == 0) goto L_0x04d7;
    L_0x04a4:
        r2 = r12.floatValue();
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 > 0) goto L_0x050d;
    L_0x04ad:
        r2 = r13.floatValue();
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 > 0) goto L_0x050d;
    L_0x04b6:
        r2 = r15.c;
        r3 = r8.floatValue();
        r4 = r9.floatValue();
        r5 = r8.floatValue();
        r6 = r10.floatValue();
        r5 = r5 + r6;
        r6 = r9.floatValue();
        r7 = r11.floatValue();
        r6 = r6 + r7;
        r7 = r15.d;
        r2.drawRect(r3, r4, r5, r6, r7);
    L_0x04d7:
        r15.a();
        goto L_0x0077;
    L_0x04dc:
        r2 = r15.n;
        r3 = r8.floatValue();
        r4 = r9.floatValue();
        r5 = r8.floatValue();
        r6 = r10.floatValue();
        r5 = r5 + r6;
        r6 = r9.floatValue();
        r7 = r11.floatValue();
        r6 = r6 + r7;
        r2.set(r3, r4, r5, r6);
        r2 = r15.c;
        r3 = r15.n;
        r4 = r12.floatValue();
        r5 = r13.floatValue();
        r6 = r15.h;
        r2.drawRoundRect(r3, r4, r5, r6);
        goto L_0x049e;
    L_0x050d:
        r2 = r15.n;
        r3 = r8.floatValue();
        r4 = r9.floatValue();
        r5 = r8.floatValue();
        r6 = r10.floatValue();
        r5 = r5 + r6;
        r6 = r9.floatValue();
        r7 = r11.floatValue();
        r6 = r6 + r7;
        r2.set(r3, r4, r5, r6);
        r2 = r15.c;
        r3 = r15.n;
        r4 = r12.floatValue();
        r5 = r13.floatValue();
        r6 = r15.d;
        r2.drawRoundRect(r3, r4, r5, r6);
        goto L_0x04d7;
    L_0x053e:
        r2 = r15.A;
        if (r2 != 0) goto L_0x05fc;
    L_0x0542:
        r2 = "image";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x05fc;
    L_0x054c:
        r2 = "href";
        r0 = r19;
        r2 = defpackage.oik.b(r2, r0);
        r3 = "data";
        r3 = r2.startsWith(r3);
        if (r3 == 0) goto L_0x0077;
    L_0x055c:
        r3 = "base64";
        r3 = r2.indexOf(r3);
        if (r3 <= 0) goto L_0x0077;
    L_0x0564:
        r3 = ",";
        r3 = r2.indexOf(r3);
        r3 = r3 + 1;
        r2 = r2.substring(r3);
        r3 = "x";
        r4 = 0;
        r4 = java.lang.Float.valueOf(r4);
        r0 = r19;
        r3 = r15.a(r3, r0, r4);
        r4 = "y";
        r5 = 0;
        r5 = java.lang.Float.valueOf(r5);
        r0 = r19;
        r4 = r15.a(r4, r0, r5);
        r5 = "width";
        r6 = 0;
        r6 = java.lang.Float.valueOf(r6);
        r0 = r19;
        r5 = r15.a(r5, r0, r6);
        r6 = "height";
        r7 = 0;
        r7 = java.lang.Float.valueOf(r7);
        r0 = r19;
        r6 = r15.a(r6, r0, r7);
        r0 = r19;
        r15.a(r0);
        r7 = r3.floatValue();
        r8 = r4.floatValue();
        r9 = r5.floatValue();
        r10 = r6.floatValue();
        r15.a(r7, r8, r9, r10);
        r7 = r15.c;
        r3 = r3.floatValue();
        r4 = r4.floatValue();
        r5 = r5.floatValue();
        r6 = r6.floatValue();
        r8 = 0;
        r2 = android.util.Base64.decode(r2, r8);
        r8 = 0;
        r9 = r2.length;
        r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r8, r9);
        if (r2 == 0) goto L_0x05f7;
    L_0x05db:
        r2.prepareToDraw();
        r8 = new android.graphics.Paint;
        r9 = 3;
        r8.<init>(r9);
        r9 = new android.graphics.RectF;
        r5 = r5 + r3;
        r6 = r6 + r4;
        r9.<init>(r3, r4, r5, r6);
        r3 = android.graphics.Region.Op.REPLACE;
        r7.clipRect(r9, r3);
        r3 = 0;
        r7.drawBitmap(r2, r3, r9, r8);
        r2.recycle();
    L_0x05f7:
        r15.a();
        goto L_0x0077;
    L_0x05fc:
        r2 = r15.A;
        if (r2 != 0) goto L_0x0672;
    L_0x0600:
        r2 = "line";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0672;
    L_0x060a:
        r2 = "x1";
        r3 = 0;
        r0 = r19;
        r3 = r15.a(r2, r0, r3);
        r2 = "x2";
        r4 = 0;
        r0 = r19;
        r5 = r15.a(r2, r0, r4);
        r2 = "y1";
        r4 = 0;
        r0 = r19;
        r4 = r15.a(r2, r0, r4);
        r2 = "y2";
        r6 = 0;
        r0 = r19;
        r6 = r15.a(r2, r0, r6);
        r2 = new oiq;
        r0 = r19;
        r2.<init>(r0);
        r2 = r15.a(r2);
        if (r2 == 0) goto L_0x0077;
    L_0x063b:
        r0 = r19;
        r15.a(r0);
        r2 = r3.floatValue();
        r7 = r4.floatValue();
        r15.a(r2, r7);
        r2 = r5.floatValue();
        r7 = r6.floatValue();
        r15.a(r2, r7);
        r2 = r15.c;
        r3 = r3.floatValue();
        r4 = r4.floatValue();
        r5 = r5.floatValue();
        r6 = r6.floatValue();
        r7 = r15.d;
        r2.drawLine(r3, r4, r5, r6, r7);
        r15.a();
        goto L_0x0077;
    L_0x0672:
        r2 = r15.A;
        if (r2 != 0) goto L_0x0710;
    L_0x0676:
        r2 = "circle";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0710;
    L_0x0680:
        r2 = "cx";
        r3 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0, r3);
        r3 = "cy";
        r4 = 0;
        r0 = r19;
        r3 = r15.a(r3, r0, r4);
        r4 = "r";
        r5 = 0;
        r0 = r19;
        r4 = r15.a(r4, r0, r5);
        if (r2 == 0) goto L_0x0077;
    L_0x069d:
        if (r3 == 0) goto L_0x0077;
    L_0x069f:
        if (r4 == 0) goto L_0x0077;
    L_0x06a1:
        r0 = r19;
        r15.a(r0);
        r5 = new oiq;
        r0 = r19;
        r5.<init>(r0);
        r6 = r15.w;
        r6 = r15.a(r5, r6);
        if (r6 == 0) goto L_0x06f2;
    L_0x06b5:
        r6 = r2.floatValue();
        r7 = r4.floatValue();
        r6 = r6 - r7;
        r7 = r3.floatValue();
        r8 = r4.floatValue();
        r7 = r7 - r8;
        r15.a(r6, r7);
        r6 = r2.floatValue();
        r7 = r4.floatValue();
        r6 = r6 + r7;
        r7 = r3.floatValue();
        r8 = r4.floatValue();
        r7 = r7 + r8;
        r15.a(r6, r7);
        r6 = r15.c;
        r7 = r2.floatValue();
        r8 = r3.floatValue();
        r9 = r4.floatValue();
        r10 = r15.h;
        r6.drawCircle(r7, r8, r9, r10);
    L_0x06f2:
        r5 = r15.a(r5);
        if (r5 == 0) goto L_0x070b;
    L_0x06f8:
        r5 = r15.c;
        r2 = r2.floatValue();
        r3 = r3.floatValue();
        r4 = r4.floatValue();
        r6 = r15.d;
        r5.drawCircle(r2, r3, r4, r6);
    L_0x070b:
        r15.a();
        goto L_0x0077;
    L_0x0710:
        r2 = r15.A;
        if (r2 != 0) goto L_0x07ce;
    L_0x0714:
        r2 = "ellipse";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x07ce;
    L_0x071e:
        r2 = "cx";
        r3 = 0;
        r0 = r19;
        r2 = r15.a(r2, r0, r3);
        r3 = "cy";
        r4 = 0;
        r0 = r19;
        r3 = r15.a(r3, r0, r4);
        r4 = "rx";
        r5 = 0;
        r0 = r19;
        r4 = r15.a(r4, r0, r5);
        r5 = "ry";
        r6 = 0;
        r0 = r19;
        r5 = r15.a(r5, r0, r6);
        if (r2 == 0) goto L_0x0077;
    L_0x0744:
        if (r3 == 0) goto L_0x0077;
    L_0x0746:
        if (r4 == 0) goto L_0x0077;
    L_0x0748:
        if (r5 == 0) goto L_0x0077;
    L_0x074a:
        r0 = r19;
        r15.a(r0);
        r6 = new oiq;
        r0 = r19;
        r6.<init>(r0);
        r7 = r15.n;
        r8 = r2.floatValue();
        r9 = r4.floatValue();
        r8 = r8 - r9;
        r9 = r3.floatValue();
        r10 = r5.floatValue();
        r9 = r9 - r10;
        r10 = r2.floatValue();
        r11 = r4.floatValue();
        r10 = r10 + r11;
        r11 = r3.floatValue();
        r12 = r5.floatValue();
        r11 = r11 + r12;
        r7.set(r8, r9, r10, r11);
        r7 = r15.w;
        r7 = r15.a(r6, r7);
        if (r7 == 0) goto L_0x07ba;
    L_0x0787:
        r7 = r2.floatValue();
        r8 = r4.floatValue();
        r7 = r7 - r8;
        r8 = r3.floatValue();
        r9 = r5.floatValue();
        r8 = r8 - r9;
        r15.a(r7, r8);
        r2 = r2.floatValue();
        r4 = r4.floatValue();
        r2 = r2 + r4;
        r3 = r3.floatValue();
        r4 = r5.floatValue();
        r3 = r3 + r4;
        r15.a(r2, r3);
        r2 = r15.c;
        r3 = r15.n;
        r4 = r15.h;
        r2.drawOval(r3, r4);
    L_0x07ba:
        r2 = r15.a(r6);
        if (r2 == 0) goto L_0x07c9;
    L_0x07c0:
        r2 = r15.c;
        r3 = r15.n;
        r4 = r15.d;
        r2.drawOval(r3, r4);
    L_0x07c9:
        r15.a();
        goto L_0x0077;
    L_0x07ce:
        r2 = r15.A;
        if (r2 != 0) goto L_0x0879;
    L_0x07d2:
        r2 = "polygon";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x07e6;
    L_0x07dc:
        r2 = "polyline";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0879;
    L_0x07e6:
        r2 = "points";
        r0 = r19;
        r2 = defpackage.oik.a(r2, r0);
        if (r2 == 0) goto L_0x0077;
    L_0x07f0:
        r4 = new android.graphics.Path;
        r4.<init>();
        r5 = r2.a;
        r2 = r5.size();
        r3 = 1;
        if (r2 <= r3) goto L_0x0077;
    L_0x07fe:
        r0 = r19;
        r15.a(r0);
        r6 = new oiq;
        r0 = r19;
        r6.<init>(r0);
        r2 = 0;
        r2 = r5.get(r2);
        r2 = (java.lang.Float) r2;
        r3 = r2.floatValue();
        r2 = 1;
        r2 = r5.get(r2);
        r2 = (java.lang.Float) r2;
        r2 = r2.floatValue();
        r4.moveTo(r3, r2);
        r2 = 2;
        r3 = r2;
    L_0x0825:
        r2 = r5.size();
        if (r3 >= r2) goto L_0x0848;
    L_0x082b:
        r2 = r5.get(r3);
        r2 = (java.lang.Float) r2;
        r7 = r2.floatValue();
        r2 = r3 + 1;
        r2 = r5.get(r2);
        r2 = (java.lang.Float) r2;
        r2 = r2.floatValue();
        r4.lineTo(r7, r2);
        r2 = r3 + 2;
        r3 = r2;
        goto L_0x0825;
    L_0x0848:
        r2 = "polygon";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0855;
    L_0x0852:
        r4.close();
    L_0x0855:
        r2 = r15.w;
        r2 = r15.a(r6, r2);
        if (r2 == 0) goto L_0x0867;
    L_0x085d:
        r15.a(r4);
        r2 = r15.c;
        r3 = r15.h;
        r2.drawPath(r4, r3);
    L_0x0867:
        r2 = r15.a(r6);
        if (r2 == 0) goto L_0x0874;
    L_0x086d:
        r2 = r15.c;
        r3 = r15.d;
        r2.drawPath(r4, r3);
    L_0x0874:
        r15.a();
        goto L_0x0077;
    L_0x0879:
        r2 = r15.A;
        if (r2 != 0) goto L_0x08c3;
    L_0x087d:
        r2 = "path";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x08c3;
    L_0x0887:
        r2 = "d";
        r0 = r19;
        r2 = defpackage.oik.b(r2, r0);
        r2 = defpackage.oik.b(r2);
        r0 = r19;
        r15.a(r0);
        r3 = new oiq;
        r0 = r19;
        r3.<init>(r0);
        r4 = r15.w;
        r4 = r15.a(r3, r4);
        if (r4 == 0) goto L_0x08b1;
    L_0x08a7:
        r15.a(r2);
        r4 = r15.c;
        r5 = r15.h;
        r4.drawPath(r2, r5);
    L_0x08b1:
        r3 = r15.a(r3);
        if (r3 == 0) goto L_0x08be;
    L_0x08b7:
        r3 = r15.c;
        r4 = r15.d;
        r3.drawPath(r2, r4);
    L_0x08be:
        r15.a();
        goto L_0x0077;
    L_0x08c3:
        r2 = r15.A;
        if (r2 != 0) goto L_0x08e1;
    L_0x08c7:
        r2 = "text";
        r0 = r17;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x08e1;
    L_0x08d1:
        r0 = r19;
        r15.a(r0);
        r2 = new ois;
        r0 = r19;
        r2.<init>(r15, r0);
        r15.z = r2;
        goto L_0x0077;
    L_0x08e1:
        r2 = r15.A;
        if (r2 != 0) goto L_0x0077;
    L_0x08e5:
        r2 = "Unrecognized tag: %s (%s)";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r3[r4] = r17;
        r4 = 1;
        r5 = defpackage.oir.b(r19);
        r3[r4] = r5;
        java.lang.String.format(r2, r3);
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: oir.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    private static String b(Attributes attributes) {
        String str = "";
        for (int i = 0; i < attributes.getLength(); i++) {
            str = String.valueOf(str);
            String valueOf = String.valueOf(attributes.getLocalName(i));
            String valueOf2 = String.valueOf(attributes.getValue(i));
            str = new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(" ").append(valueOf).append("='").append(valueOf2).append("'").toString();
        }
        return str;
    }

    public void characters(char[] cArr, int i, int i2) {
        if (this.z != null) {
            this.z.a(cArr, i, i2);
        }
    }

    public void endElement(String str, String str2, String str3) {
        int i = 0;
        if (this.D) {
            if (str2.equals("defs")) {
                this.D = false;
            }
        } else if (str2.equals("svg")) {
            this.b.endRecording();
        } else if (!this.A && str2.equals("text")) {
            if (this.z != null) {
                this.z.a(this.c);
                this.z.a();
            }
            a();
        } else if (str2.equals("linearGradient")) {
            if (this.y.a != null) {
                if (this.y.b != null) {
                    r0 = (oim) this.x.get(this.y.b);
                    if (r0 != null) {
                        this.y = r0.a(this.y);
                    }
                }
                int[] iArr = new int[this.y.l.size()];
                for (r1 = 0; r1 < iArr.length; r1++) {
                    iArr[r1] = ((Integer) this.y.l.get(r1)).intValue();
                }
                float[] fArr = new float[this.y.k.size()];
                while (i < fArr.length) {
                    fArr[i] = ((Float) this.y.k.get(i)).floatValue();
                    i++;
                }
                LinearGradient linearGradient = new LinearGradient(this.y.d, this.y.e, this.y.f, this.y.g, iArr, fArr, TileMode.CLAMP);
                if (this.y.m != null) {
                    linearGradient.setLocalMatrix(this.y.m);
                }
                this.w.put(this.y.a, linearGradient);
                this.x.put(this.y.a, this.y);
            }
        } else if (str2.equals("radialGradient")) {
            if (this.y.a != null) {
                if (this.y.b != null) {
                    r0 = (oim) this.x.get(this.y.b);
                    if (r0 != null) {
                        this.y = r0.a(this.y);
                    }
                }
                int[] iArr2 = new int[this.y.l.size()];
                for (r1 = 0; r1 < iArr2.length; r1++) {
                    iArr2[r1] = ((Integer) this.y.l.get(r1)).intValue();
                }
                float[] fArr2 = new float[this.y.k.size()];
                while (i < fArr2.length) {
                    fArr2[i] = ((Float) this.y.k.get(i)).floatValue();
                    i++;
                }
                RadialGradient radialGradient = new RadialGradient(this.y.h, this.y.i, this.y.j, iArr2, fArr2, TileMode.CLAMP);
                if (this.y.m != null) {
                    radialGradient.setLocalMatrix(this.y.m);
                }
                this.w.put(this.y.a, radialGradient);
                this.x.put(this.y.a, this.y);
            }
        } else if (str2.equals("g")) {
            if (this.C) {
                this.C = false;
            }
            if (this.A) {
                this.B--;
                if (this.B == 0) {
                    this.A = false;
                }
            }
            this.w.clear();
            a();
            this.h = (Paint) this.j.pop();
            this.i = ((Boolean) this.k.pop()).booleanValue();
            this.d = (Paint) this.f.pop();
            this.e = ((Boolean) this.g.pop()).booleanValue();
            this.l = ((Float) this.m.pop()).floatValue();
        }
    }

    private static Align c(Attributes attributes) {
        Object value;
        String str = "text-anchor";
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                value = attributes.getValue(i);
                break;
            }
        }
        value = null;
        if (value == null) {
            return null;
        }
        if ("middle".equals(value)) {
            return Align.CENTER;
        }
        if ("end".equals(value)) {
            return Align.RIGHT;
        }
        return Align.LEFT;
    }

    Float a(String str, Attributes attributes, Float f) {
        String value;
        Float f2 = null;
        float f3 = this.u;
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                value = attributes.getValue(i);
                break;
            }
        }
        value = null;
        if (value != null) {
            if (value.endsWith("px")) {
                f2 = Float.valueOf(Float.parseFloat(value.substring(0, value.length() - 2)));
            } else if (value.endsWith("pt")) {
                f2 = Float.valueOf((Float.valueOf(value.substring(0, value.length() - 2)).floatValue() * f3) / 72.0f);
            } else if (value.endsWith("pc")) {
                f2 = Float.valueOf((Float.valueOf(value.substring(0, value.length() - 2)).floatValue() * f3) / 6.0f);
            } else if (value.endsWith("cm")) {
                f2 = Float.valueOf((Float.valueOf(value.substring(0, value.length() - 2)).floatValue() * f3) / 2.54f);
            } else if (value.endsWith("mm")) {
                f2 = Float.valueOf((Float.valueOf(value.substring(0, value.length() - 2)).floatValue() * f3) / 254.0f);
            } else if (value.endsWith("in")) {
                f2 = Float.valueOf(Float.valueOf(value.substring(0, value.length() - 2)).floatValue() * f3);
            } else if (value.endsWith("em")) {
                f2 = Float.valueOf(this.h.getTextSize() * Float.valueOf(value.substring(0, value.length() - 2)).floatValue());
            } else if (value.endsWith("ex")) {
                f2 = Float.valueOf((this.h.getTextSize() * Float.valueOf(value.substring(0, value.length() - 2)).floatValue()) / 2.0f);
            } else if (value.endsWith("%")) {
                float width;
                Float valueOf = Float.valueOf(value.substring(0, value.length() - 1));
                if (str.indexOf("x") >= 0 || str.equals("width")) {
                    width = ((float) this.c.getWidth()) / 100.0f;
                } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                    width = ((float) this.c.getHeight()) / 100.0f;
                } else {
                    width = ((float) (this.c.getHeight() + this.c.getWidth())) / 2.0f;
                }
                f2 = Float.valueOf(width * valueOf.floatValue());
            } else {
                f2 = Float.valueOf(value);
            }
        }
        if (f2 == null) {
            return f;
        }
        return f2;
    }
}
