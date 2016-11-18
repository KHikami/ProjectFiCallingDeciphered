package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.graphics.Region.Op;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

final class oir extends DefaultHandler {
    private static final Matrix f33008E = new Matrix();
    private boolean f33009A = false;
    private int f33010B = 0;
    private boolean f33011C = false;
    private boolean f33012D = false;
    HashMap<String, String> f33013a = new HashMap();
    Picture f33014b;
    Canvas f33015c;
    Paint f33016d;
    boolean f33017e = false;
    Stack<Paint> f33018f = new Stack();
    Stack<Boolean> f33019g = new Stack();
    Paint f33020h;
    boolean f33021i = false;
    Stack<Paint> f33022j = new Stack();
    Stack<Boolean> f33023k = new Stack();
    float f33024l = 1.0f;
    Stack<Float> f33025m = new Stack();
    RectF f33026n = new RectF();
    RectF f33027o = null;
    RectF f33028p = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    Integer f33029q = null;
    Integer f33030r = null;
    boolean f33031s = false;
    boolean f33032t = false;
    float f33033u = oik.f32982a;
    int f33034v = 0;
    HashMap<String, Shader> f33035w = new HashMap();
    HashMap<String, oim> f33036x = new HashMap();
    oim f33037y = null;
    ois f33038z = null;

    oir(Picture picture) {
        this.f33014b = picture;
        this.f33016d = new Paint();
        this.f33016d.setAntiAlias(true);
        this.f33016d.setStyle(Style.STROKE);
        this.f33020h = new Paint();
        this.f33020h.setAntiAlias(true);
        this.f33020h.setStyle(Style.FILL);
    }

    public void m38505a(float f) {
        this.f33033u = f;
    }

    public void m38506a(Integer num, Integer num2) {
        this.f33029q = num;
        this.f33030r = num2;
    }

    public void m38507a(boolean z) {
        this.f33031s = z;
    }

    public void m38511b(boolean z) {
        this.f33032t = z;
    }

    public void startDocument() {
    }

    public void endDocument() {
    }

    boolean m38509a(oiq oiq, HashMap<String, Shader> hashMap) {
        if ("none".equals(oiq.m38490b("display"))) {
            return false;
        }
        if (this.f33032t) {
            this.f33020h.setShader(null);
            this.f33020h.setColor(-1);
            return true;
        }
        String b = oiq.m38490b("fill");
        if (b != null) {
            String str;
            if (b.startsWith("url(#")) {
                b = b.substring(5, b.length() - 1);
                Shader shader = (Shader) hashMap.get(b);
                if (shader != null) {
                    this.f33020h.setShader(shader);
                    return true;
                }
                str = "Didn't find shader, using black: ";
                b = String.valueOf(b);
                if (b.length() != 0) {
                    str.concat(b);
                } else {
                    b = new String(str);
                }
                this.f33020h.setShader(null);
                m38500a(oiq, Integer.valueOf(-16777216), true, this.f33020h);
                return true;
            } else if (b.equalsIgnoreCase("none")) {
                this.f33020h.setShader(null);
                this.f33020h.setColor(0);
                return true;
            } else {
                this.f33020h.setShader(null);
                Integer c = oiq.m38491c("fill");
                if (c != null) {
                    m38500a(oiq, c, true, this.f33020h);
                    return true;
                }
                str = "Unrecognized fill color, using black: ";
                b = String.valueOf(b);
                if (b.length() != 0) {
                    str.concat(b);
                } else {
                    b = new String(str);
                }
                m38500a(oiq, Integer.valueOf(-16777216), true, this.f33020h);
                return true;
            }
        } else if (!this.f33021i) {
            this.f33020h.setShader(null);
            this.f33020h.setColor(-16777216);
            return true;
        } else if (this.f33020h.getColor() != 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean m38510a(Attributes attributes, Paint paint) {
        Typeface typeface = null;
        if ("none".equals(attributes.getValue("display"))) {
            return false;
        }
        String value;
        Object value2;
        Object value3;
        if (attributes.getValue("font-size") != null) {
            paint.setTextSize(m38504a("font-size", attributes, Float.valueOf(10.0f)).floatValue());
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
        if (oir.m38503c(attributes) != null) {
            paint.setTextAlign(oir.m38503c(attributes));
        }
        return true;
    }

    boolean m38508a(oiq oiq) {
        float f = 0.0f;
        if (this.f33032t || "none".equals(oiq.m38490b("display"))) {
            return false;
        }
        Float d = oiq.m38492d("stroke-width");
        if (d != null) {
            this.f33016d.setStrokeWidth(d.floatValue());
        }
        if (this.f33016d.getStrokeWidth() <= 0.0f) {
            return false;
        }
        String b = oiq.m38490b("stroke-linecap");
        if ("round".equals(b)) {
            this.f33016d.setStrokeCap(Cap.ROUND);
        } else if ("square".equals(b)) {
            this.f33016d.setStrokeCap(Cap.SQUARE);
        } else if ("butt".equals(b)) {
            this.f33016d.setStrokeCap(Cap.BUTT);
        }
        b = oiq.m38490b("stroke-linejoin");
        if ("miter".equals(b)) {
            this.f33016d.setStrokeJoin(Join.MITER);
        } else if ("round".equals(b)) {
            this.f33016d.setStrokeJoin(Join.ROUND);
        } else if ("bevel".equals(b)) {
            this.f33016d.setStrokeJoin(Join.BEVEL);
        }
        b = oiq.m38490b("stroke-dasharray");
        String b2 = oiq.m38490b("stroke-dashoffset");
        if (b != null) {
            if (b.equals("none")) {
                this.f33016d.setPathEffect(null);
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
                    f2 = oir.m38493a(stringTokenizer.nextToken(), f2);
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
                this.f33016d.setPathEffect(new DashPathEffect(fArr, f));
            }
        }
        b = oiq.m38489a("stroke");
        if (b != null) {
            if (b.equalsIgnoreCase("none")) {
                this.f33016d.setColor(0);
                return false;
            }
            Integer c = oiq.m38491c("stroke");
            if (c != null) {
                m38500a(oiq, c, false, this.f33016d);
                return true;
            }
            String str = "Unrecognized stroke color, using none: ";
            b = String.valueOf(b);
            if (b.length() != 0) {
                str.concat(b);
            } else {
                b = new String(str);
            }
            this.f33016d.setColor(0);
            return false;
        } else if (!this.f33017e) {
            this.f33016d.setColor(0);
            return false;
        } else if (this.f33016d.getColor() != 0) {
            return true;
        } else {
            return false;
        }
    }

    private oim m38495a(boolean z, Attributes attributes) {
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
        oim.f32985a = value;
        oim.f32987c = z;
        if (z) {
            oim.f32988d = m38504a("x1", attributes, Float.valueOf(0.0f)).floatValue();
            oim.f32990f = m38504a("x2", attributes, Float.valueOf(0.0f)).floatValue();
            oim.f32989e = m38504a("y1", attributes, Float.valueOf(0.0f)).floatValue();
            oim.f32991g = m38504a("y2", attributes, Float.valueOf(0.0f)).floatValue();
        } else {
            oim.f32992h = m38504a("cx", attributes, Float.valueOf(0.0f)).floatValue();
            oim.f32993i = m38504a("cy", attributes, Float.valueOf(0.0f)).floatValue();
            oim.f32994j = m38504a("r", attributes, Float.valueOf(0.0f)).floatValue();
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
                    if (oik.m38482a(str.substring(7)).f33004a.size() == 6) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{((Float) a.f33004a.get(0)).floatValue(), ((Float) a.f33004a.get(2)).floatValue(), ((Float) a.f33004a.get(4)).floatValue(), ((Float) a.f33004a.get(1)).floatValue(), ((Float) a.f33004a.get(3)).floatValue(), ((Float) a.f33004a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                    }
                } else if (str.startsWith("translate(")) {
                    a = oik.m38482a(str.substring(10));
                    if (a.f33004a.size() > 0) {
                        float floatValue = ((Float) a.f33004a.get(0)).floatValue();
                        r0 = 0.0f;
                        if (a.f33004a.size() > 1) {
                            r0 = ((Float) a.f33004a.get(1)).floatValue();
                        }
                        matrix.preTranslate(floatValue, r0);
                    }
                } else if (str.startsWith("scale(")) {
                    r5 = oik.m38482a(str.substring(6));
                    if (r5.f33004a.size() > 0) {
                        r2 = ((Float) r5.f33004a.get(0)).floatValue();
                        if (r5.f33004a.size() > 1) {
                            r0 = ((Float) r5.f33004a.get(1)).floatValue();
                        } else {
                            r0 = r2;
                        }
                        matrix.preScale(r2, r0);
                    }
                } else if (str.startsWith("skewX(")) {
                    r0 = oik.m38482a(str.substring(6));
                    if (r0.f33004a.size() > 0) {
                        matrix.preSkew((float) Math.tan((double) ((Float) r0.f33004a.get(0)).floatValue()), 0.0f);
                    }
                } else if (str.startsWith("skewY(")) {
                    r0 = oik.m38482a(str.substring(6));
                    if (r0.f33004a.size() > 0) {
                        matrix.preSkew(0.0f, (float) Math.tan((double) ((Float) r0.f33004a.get(0)).floatValue()));
                    }
                } else if (str.startsWith("rotate(")) {
                    r5 = oik.m38482a(str.substring(7));
                    if (r5.f33004a.size() > 0) {
                        float floatValue2 = ((Float) r5.f33004a.get(0)).floatValue();
                        r2 = 0.0f;
                        r0 = 0.0f;
                        if (r5.f33004a.size() > 2) {
                            r2 = ((Float) r5.f33004a.get(1)).floatValue();
                            r0 = ((Float) r5.f33004a.get(2)).floatValue();
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
                    oim.f32997m = matrix;
                } else {
                    str = str.substring(i + 1).replaceFirst("[\\s,]*", "");
                }
            }
            oim.f32997m = matrix;
        }
        value = oik.m38485b("href", attributes);
        if (value != null) {
            if (value.startsWith("#")) {
                value = value.substring(1);
            }
            oim.f32986b = value;
        }
        return oim;
    }

    private void m38500a(oiq oiq, Integer num, boolean z, Paint paint) {
        paint.setColor(m38494a(num.intValue()) | -16777216);
        Float d = oiq.m38492d("opacity");
        if (d == null) {
            d = oiq.m38492d(z ? "fill-opacity" : "stroke-opacity");
        }
        if (d == null) {
            d = Float.valueOf(1.0f);
        }
        int intValue = num.intValue();
        if (this.f33029q != null && this.f33029q.intValue() == intValue && this.f33030r != null && this.f33031s) {
            d = Float.valueOf((d.floatValue() * ((float) (this.f33030r.intValue() >>> 24))) / 255.0f);
        }
        paint.setAlpha((int) ((d.floatValue() * 255.0f) * this.f33024l));
    }

    private int m38494a(int i) {
        int i2 = 16777215 & i;
        if (this.f33029q == null || this.f33029q.intValue() != i2 || this.f33030r == null) {
            return i2;
        }
        String.format("Replacing color: 0x%x->0x%x", new Object[]{Integer.valueOf(i2), this.f33030r});
        return this.f33030r.intValue();
    }

    private static float m38493a(String str, float f) {
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException e) {
        }
        return f;
    }

    private void m38497a(float f, float f2) {
        if (f < this.f33028p.left) {
            this.f33028p.left = f;
        }
        if (f > this.f33028p.right) {
            this.f33028p.right = f;
        }
        if (f2 < this.f33028p.top) {
            this.f33028p.top = f2;
        }
        if (f2 > this.f33028p.bottom) {
            this.f33028p.bottom = f2;
        }
    }

    private void m38498a(float f, float f2, float f3, float f4) {
        m38497a(f, f2);
        m38497a(f + f3, f2 + f4);
    }

    private void m38499a(Path path) {
        path.computeBounds(this.f33026n, false);
        m38497a(this.f33026n.left, this.f33026n.top);
        m38497a(this.f33026n.right, this.f33026n.bottom);
    }

    private void m38501a(Attributes attributes) {
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
            matrix = f33008E;
        } else {
            Matrix matrix2 = new Matrix();
            str = value;
            while (true) {
                oip a;
                if (str.startsWith("matrix(")) {
                    if (oik.m38482a(str.substring(7)).f33004a.size() == 6) {
                        Matrix matrix3 = new Matrix();
                        matrix3.setValues(new float[]{((Float) a.f33004a.get(0)).floatValue(), ((Float) a.f33004a.get(2)).floatValue(), ((Float) a.f33004a.get(4)).floatValue(), ((Float) a.f33004a.get(1)).floatValue(), ((Float) a.f33004a.get(3)).floatValue(), ((Float) a.f33004a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                        matrix2.preConcat(matrix3);
                    }
                } else if (str.startsWith("translate(")) {
                    a = oik.m38482a(str.substring(10));
                    if (a.f33004a.size() > 0) {
                        float floatValue = ((Float) a.f33004a.get(0)).floatValue();
                        if (a.f33004a.size() > 1) {
                            r0 = ((Float) a.f33004a.get(1)).floatValue();
                        } else {
                            r0 = 0.0f;
                        }
                        matrix2.preTranslate(floatValue, r0);
                    }
                } else if (str.startsWith("scale(")) {
                    r6 = oik.m38482a(str.substring(6));
                    if (r6.f33004a.size() > 0) {
                        r3 = ((Float) r6.f33004a.get(0)).floatValue();
                        if (r6.f33004a.size() > 1) {
                            r0 = ((Float) r6.f33004a.get(1)).floatValue();
                        } else {
                            r0 = r3;
                        }
                        matrix2.preScale(r3, r0);
                    }
                } else if (str.startsWith("skewX(")) {
                    r0 = oik.m38482a(str.substring(6));
                    if (r0.f33004a.size() > 0) {
                        matrix2.preSkew((float) Math.tan((double) ((Float) r0.f33004a.get(0)).floatValue()), 0.0f);
                    }
                } else if (str.startsWith("skewY(")) {
                    r0 = oik.m38482a(str.substring(6));
                    if (r0.f33004a.size() > 0) {
                        matrix2.preSkew(0.0f, (float) Math.tan((double) ((Float) r0.f33004a.get(0)).floatValue()));
                    }
                } else if (str.startsWith("rotate(")) {
                    r6 = oik.m38482a(str.substring(7));
                    if (r6.f33004a.size() > 0) {
                        float floatValue2 = ((Float) r6.f33004a.get(0)).floatValue();
                        if (r6.f33004a.size() > 2) {
                            r3 = ((Float) r6.f33004a.get(1)).floatValue();
                            r0 = ((Float) r6.f33004a.get(2)).floatValue();
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
        this.f33034v++;
        this.f33015c.save();
        this.f33015c.concat(matrix);
    }

    private void m38496a() {
        this.f33015c.restore();
        this.f33034v--;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (!this.f33017e) {
            this.f33016d.setAlpha(255);
        }
        if (!this.f33021i) {
            this.f33020h.setAlpha(255);
        }
        Float a;
        Float a2;
        if (this.f33011C) {
            if (str2.equals("rect")) {
                a = m38504a("x", attributes, null);
                if (a == null) {
                    a = Float.valueOf(0.0f);
                }
                a2 = m38504a("y", attributes, null);
                if (a2 == null) {
                    a2 = Float.valueOf(0.0f);
                }
                this.f33027o = new RectF(a.floatValue(), a2.floatValue(), a.floatValue() + m38504a("width", attributes, null).floatValue(), a2.floatValue() + m38504a("height", attributes, null).floatValue());
            }
        } else if (!this.f33012D) {
            if (str2.equals("svg")) {
                this.f33015c = this.f33014b.beginRecording((int) Math.ceil((double) m38504a("width", attributes, null).floatValue()), (int) Math.ceil((double) m38504a("height", attributes, null).floatValue()));
                return;
            }
            if (str2.equals("defs")) {
                this.f33012D = true;
                return;
            }
            if (str2.equals("linearGradient")) {
                this.f33037y = m38495a(true, attributes);
                return;
            }
            if (str2.equals("radialGradient")) {
                this.f33037y = m38495a(false, attributes);
                return;
            }
            String value;
            String value2;
            int i;
            float floatValue;
            if (!str2.equals("stop")) {
                String value3;
                if (str2.equals("use")) {
                    String value4 = attributes.getValue("xlink:href");
                    value3 = attributes.getValue("transform");
                    value = attributes.getValue("x");
                    value2 = attributes.getValue("y");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<g");
                    stringBuilder.append(" xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' version='1.1'");
                    if (!(value3 == null && value == null && value2 == null)) {
                        stringBuilder.append(" transform='");
                        if (value3 != null) {
                            stringBuilder.append(value3.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;"));
                        }
                        if (!(value == null && value2 == null)) {
                            stringBuilder.append("translate(");
                            if (value != null) {
                                value3 = value.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;");
                            } else {
                                value3 = "0";
                            }
                            stringBuilder.append(value3);
                            stringBuilder.append(",");
                            if (value2 != null) {
                                value3 = value2.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;");
                            } else {
                                value3 = "0";
                            }
                            stringBuilder.append(value3);
                            stringBuilder.append(")");
                        }
                        stringBuilder.append("'");
                    }
                    for (i = 0; i < attributes.getLength(); i++) {
                        value = attributes.getQName(i);
                        if (!("x".equals(value) || "y".equals(value) || "width".equals(value) || "height".equals(value) || "xlink:href".equals(value) || "transform".equals(value))) {
                            stringBuilder.append(" ");
                            stringBuilder.append(value);
                            stringBuilder.append("='");
                            stringBuilder.append(attributes.getValue(i).replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;"));
                            stringBuilder.append("'");
                        }
                    }
                    stringBuilder.append(">");
                    stringBuilder.append((String) this.f33013a.get(value4.substring(1)));
                    stringBuilder.append("</g>");
                    InputSource inputSource = new InputSource(new StringReader(stringBuilder.toString()));
                    try {
                        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.parse(inputSource);
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                oiq oiq;
                if (str2.equals("g")) {
                    if ("bounds".equalsIgnoreCase(oik.m38485b("id", attributes))) {
                        this.f33011C = true;
                    }
                    if (this.f33009A) {
                        this.f33010B++;
                    }
                    if ("none".equals(oik.m38485b("display", attributes)) && !this.f33009A) {
                        this.f33009A = true;
                        this.f33010B = 1;
                    }
                    m38501a(attributes);
                    oiq = new oiq(attributes);
                    this.f33022j.push(new Paint(this.f33020h));
                    this.f33018f.push(new Paint(this.f33016d));
                    this.f33023k.push(Boolean.valueOf(this.f33021i));
                    this.f33019g.push(Boolean.valueOf(this.f33017e));
                    this.f33025m.push(Float.valueOf(this.f33024l));
                    a = m38504a("opacity", attributes, null);
                    if (a != null) {
                        this.f33024l = a.floatValue() * this.f33024l;
                    }
                    m38510a(attributes, this.f33020h);
                    m38510a(attributes, this.f33016d);
                    m38509a(oiq, this.f33035w);
                    m38508a(oiq);
                    this.f33021i = (oiq.m38490b("fill") != null ? 1 : 0) | this.f33021i;
                    this.f33017e = (oiq.m38490b("stroke") != null ? 1 : 0) | this.f33017e;
                    return;
                }
                Float a3;
                Float a4;
                Float a5;
                oiq oiq2;
                if (!this.f33009A) {
                    if (str2.equals("rect")) {
                        Float a6 = m38504a("x", attributes, Float.valueOf(0.0f));
                        Float a7 = m38504a("y", attributes, Float.valueOf(0.0f));
                        Float a8 = m38504a("width", attributes, null);
                        Float a9 = m38504a("height", attributes, null);
                        Float a10 = m38504a("rx", attributes, Float.valueOf(0.0f));
                        Float a11 = m38504a("ry", attributes, Float.valueOf(0.0f));
                        m38501a(attributes);
                        oiq oiq3 = new oiq(attributes);
                        if (m38509a(oiq3, this.f33035w)) {
                            m38498a(a6.floatValue(), a7.floatValue(), a8.floatValue(), a9.floatValue());
                            if (a10.floatValue() > 0.0f || a11.floatValue() > 0.0f) {
                                this.f33026n.set(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue());
                                this.f33015c.drawRoundRect(this.f33026n, a10.floatValue(), a11.floatValue(), this.f33020h);
                            } else {
                                this.f33015c.drawRect(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue(), this.f33020h);
                            }
                        }
                        if (m38508a(oiq3)) {
                            if (a10.floatValue() > 0.0f || a11.floatValue() > 0.0f) {
                                this.f33026n.set(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue());
                                this.f33015c.drawRoundRect(this.f33026n, a10.floatValue(), a11.floatValue(), this.f33016d);
                            } else {
                                this.f33015c.drawRect(a6.floatValue(), a7.floatValue(), a6.floatValue() + a8.floatValue(), a7.floatValue() + a9.floatValue(), this.f33016d);
                            }
                        }
                        m38496a();
                        return;
                    }
                }
                if (!this.f33009A) {
                    if (str2.equals("image")) {
                        value3 = oik.m38485b("href", attributes);
                        if (value3.startsWith("data") && value3.indexOf("base64") > 0) {
                            value3 = value3.substring(value3.indexOf(",") + 1);
                            a2 = m38504a("x", attributes, Float.valueOf(0.0f));
                            a3 = m38504a("y", attributes, Float.valueOf(0.0f));
                            a4 = m38504a("width", attributes, Float.valueOf(0.0f));
                            a5 = m38504a("height", attributes, Float.valueOf(0.0f));
                            m38501a(attributes);
                            m38498a(a2.floatValue(), a3.floatValue(), a4.floatValue(), a5.floatValue());
                            Canvas canvas = this.f33015c;
                            floatValue = a2.floatValue();
                            float floatValue2 = a3.floatValue();
                            float floatValue3 = a4.floatValue();
                            float floatValue4 = a5.floatValue();
                            byte[] decode = Base64.decode(value3, 0);
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            if (decodeByteArray != null) {
                                decodeByteArray.prepareToDraw();
                                Paint paint = new Paint(3);
                                RectF rectF = new RectF(floatValue, floatValue2, floatValue3 + floatValue, floatValue4 + floatValue2);
                                canvas.clipRect(rectF, Op.REPLACE);
                                canvas.drawBitmap(decodeByteArray, null, rectF, paint);
                                decodeByteArray.recycle();
                            }
                            m38496a();
                            return;
                        }
                        return;
                    }
                }
                if (!this.f33009A) {
                    if (str2.equals("line")) {
                        a2 = m38504a("x1", attributes, null);
                        a4 = m38504a("x2", attributes, null);
                        a3 = m38504a("y1", attributes, null);
                        a5 = m38504a("y2", attributes, null);
                        if (m38508a(new oiq(attributes))) {
                            m38501a(attributes);
                            m38497a(a2.floatValue(), a3.floatValue());
                            m38497a(a4.floatValue(), a5.floatValue());
                            this.f33015c.drawLine(a2.floatValue(), a3.floatValue(), a4.floatValue(), a5.floatValue(), this.f33016d);
                            m38496a();
                            return;
                        }
                        return;
                    }
                }
                if (!this.f33009A) {
                    if (str2.equals("circle")) {
                        a = m38504a("cx", attributes, null);
                        a2 = m38504a("cy", attributes, null);
                        a3 = m38504a("r", attributes, null);
                        if (a != null && a2 != null && a3 != null) {
                            m38501a(attributes);
                            oiq oiq4 = new oiq(attributes);
                            if (m38509a(oiq4, this.f33035w)) {
                                m38497a(a.floatValue() - a3.floatValue(), a2.floatValue() - a3.floatValue());
                                m38497a(a.floatValue() + a3.floatValue(), a2.floatValue() + a3.floatValue());
                                this.f33015c.drawCircle(a.floatValue(), a2.floatValue(), a3.floatValue(), this.f33020h);
                            }
                            if (m38508a(oiq4)) {
                                this.f33015c.drawCircle(a.floatValue(), a2.floatValue(), a3.floatValue(), this.f33016d);
                            }
                            m38496a();
                            return;
                        }
                        return;
                    }
                }
                if (!this.f33009A) {
                    if (str2.equals("ellipse")) {
                        a = m38504a("cx", attributes, null);
                        a2 = m38504a("cy", attributes, null);
                        a3 = m38504a("rx", attributes, null);
                        a4 = m38504a("ry", attributes, null);
                        if (a != null && a2 != null && a3 != null && a4 != null) {
                            m38501a(attributes);
                            oiq2 = new oiq(attributes);
                            this.f33026n.set(a.floatValue() - a3.floatValue(), a2.floatValue() - a4.floatValue(), a.floatValue() + a3.floatValue(), a2.floatValue() + a4.floatValue());
                            if (m38509a(oiq2, this.f33035w)) {
                                m38497a(a.floatValue() - a3.floatValue(), a2.floatValue() - a4.floatValue());
                                m38497a(a.floatValue() + a3.floatValue(), a2.floatValue() + a4.floatValue());
                                this.f33015c.drawOval(this.f33026n, this.f33020h);
                            }
                            if (m38508a(oiq2)) {
                                this.f33015c.drawOval(this.f33026n, this.f33016d);
                            }
                            m38496a();
                            return;
                        }
                        return;
                    }
                }
                if (!this.f33009A) {
                    if (!str2.equals("polygon")) {
                    }
                    oip a12 = oik.m38483a("points", attributes);
                    if (a12 != null) {
                        Path path = new Path();
                        ArrayList arrayList = a12.f33004a;
                        if (arrayList.size() > 1) {
                            m38501a(attributes);
                            oiq2 = new oiq(attributes);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            for (int i2 = 2; i2 < arrayList.size(); i2 += 2) {
                                path.lineTo(((Float) arrayList.get(i2)).floatValue(), ((Float) arrayList.get(i2 + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            if (m38509a(oiq2, this.f33035w)) {
                                m38499a(path);
                                this.f33015c.drawPath(path, this.f33020h);
                            }
                            if (m38508a(oiq2)) {
                                this.f33015c.drawPath(path, this.f33016d);
                            }
                            m38496a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!this.f33009A) {
                    if (str2.equals("path")) {
                        Path b = oik.m38484b(oik.m38485b("d", attributes));
                        m38501a(attributes);
                        oiq = new oiq(attributes);
                        if (m38509a(oiq, this.f33035w)) {
                            m38499a(b);
                            this.f33015c.drawPath(b, this.f33020h);
                        }
                        if (m38508a(oiq)) {
                            this.f33015c.drawPath(b, this.f33016d);
                        }
                        m38496a();
                        return;
                    }
                }
                if (!this.f33009A) {
                    if (str2.equals("text")) {
                        m38501a(attributes);
                        this.f33038z = new ois(this, attributes);
                        return;
                    }
                }
                if (!this.f33009A) {
                    String.format("Unrecognized tag: %s (%s)", new Object[]{str2, oir.m38502b(attributes)});
                }
            } else if (this.f33037y != null) {
                floatValue = m38504a("offset", attributes, null).floatValue();
                oit oit = new oit(oik.m38485b("style", attributes));
                value2 = oit.m38516a("stop-color");
                i = -16777216;
                if (value2 != null) {
                    if (value2.startsWith("#")) {
                        i = Integer.parseInt(value2.substring(1), 16);
                    } else {
                        i = Integer.parseInt(value2, 16);
                    }
                }
                i = m38494a(i);
                value = oit.m38516a("stop-opacity");
                if (value != null) {
                    i |= Math.round(Float.parseFloat(value) * 255.0f) << 24;
                } else {
                    i |= -16777216;
                }
                this.f33037y.f32995k.add(Float.valueOf(floatValue));
                this.f33037y.f32996l.add(Integer.valueOf(i));
            }
        }
    }

    private static String m38502b(Attributes attributes) {
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
        if (this.f33038z != null) {
            this.f33038z.m38515a(cArr, i, i2);
        }
    }

    public void endElement(String str, String str2, String str3) {
        int i = 0;
        if (this.f33012D) {
            if (str2.equals("defs")) {
                this.f33012D = false;
            }
        } else if (str2.equals("svg")) {
            this.f33014b.endRecording();
        } else if (!this.f33009A && str2.equals("text")) {
            if (this.f33038z != null) {
                this.f33038z.m38514a(this.f33015c);
                this.f33038z.m38513a();
            }
            m38496a();
        } else if (str2.equals("linearGradient")) {
            if (this.f33037y.f32985a != null) {
                if (this.f33037y.f32986b != null) {
                    r0 = (oim) this.f33036x.get(this.f33037y.f32986b);
                    if (r0 != null) {
                        this.f33037y = r0.m38488a(this.f33037y);
                    }
                }
                int[] iArr = new int[this.f33037y.f32996l.size()];
                for (r1 = 0; r1 < iArr.length; r1++) {
                    iArr[r1] = ((Integer) this.f33037y.f32996l.get(r1)).intValue();
                }
                float[] fArr = new float[this.f33037y.f32995k.size()];
                while (i < fArr.length) {
                    fArr[i] = ((Float) this.f33037y.f32995k.get(i)).floatValue();
                    i++;
                }
                LinearGradient linearGradient = new LinearGradient(this.f33037y.f32988d, this.f33037y.f32989e, this.f33037y.f32990f, this.f33037y.f32991g, iArr, fArr, TileMode.CLAMP);
                if (this.f33037y.f32997m != null) {
                    linearGradient.setLocalMatrix(this.f33037y.f32997m);
                }
                this.f33035w.put(this.f33037y.f32985a, linearGradient);
                this.f33036x.put(this.f33037y.f32985a, this.f33037y);
            }
        } else if (str2.equals("radialGradient")) {
            if (this.f33037y.f32985a != null) {
                if (this.f33037y.f32986b != null) {
                    r0 = (oim) this.f33036x.get(this.f33037y.f32986b);
                    if (r0 != null) {
                        this.f33037y = r0.m38488a(this.f33037y);
                    }
                }
                int[] iArr2 = new int[this.f33037y.f32996l.size()];
                for (r1 = 0; r1 < iArr2.length; r1++) {
                    iArr2[r1] = ((Integer) this.f33037y.f32996l.get(r1)).intValue();
                }
                float[] fArr2 = new float[this.f33037y.f32995k.size()];
                while (i < fArr2.length) {
                    fArr2[i] = ((Float) this.f33037y.f32995k.get(i)).floatValue();
                    i++;
                }
                RadialGradient radialGradient = new RadialGradient(this.f33037y.f32992h, this.f33037y.f32993i, this.f33037y.f32994j, iArr2, fArr2, TileMode.CLAMP);
                if (this.f33037y.f32997m != null) {
                    radialGradient.setLocalMatrix(this.f33037y.f32997m);
                }
                this.f33035w.put(this.f33037y.f32985a, radialGradient);
                this.f33036x.put(this.f33037y.f32985a, this.f33037y);
            }
        } else if (str2.equals("g")) {
            if (this.f33011C) {
                this.f33011C = false;
            }
            if (this.f33009A) {
                this.f33010B--;
                if (this.f33010B == 0) {
                    this.f33009A = false;
                }
            }
            this.f33035w.clear();
            m38496a();
            this.f33020h = (Paint) this.f33022j.pop();
            this.f33021i = ((Boolean) this.f33023k.pop()).booleanValue();
            this.f33016d = (Paint) this.f33018f.pop();
            this.f33017e = ((Boolean) this.f33019g.pop()).booleanValue();
            this.f33024l = ((Float) this.f33025m.pop()).floatValue();
        }
    }

    private static Align m38503c(Attributes attributes) {
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

    Float m38504a(String str, Attributes attributes, Float f) {
        String value;
        Float f2 = null;
        float f3 = this.f33033u;
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
                f2 = Float.valueOf(this.f33020h.getTextSize() * Float.valueOf(value.substring(0, value.length() - 2)).floatValue());
            } else if (value.endsWith("ex")) {
                f2 = Float.valueOf((this.f33020h.getTextSize() * Float.valueOf(value.substring(0, value.length() - 2)).floatValue()) / 2.0f);
            } else if (value.endsWith("%")) {
                float width;
                Float valueOf = Float.valueOf(value.substring(0, value.length() - 1));
                if (str.indexOf("x") >= 0 || str.equals("width")) {
                    width = ((float) this.f33015c.getWidth()) / 100.0f;
                } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                    width = ((float) this.f33015c.getHeight()) / 100.0f;
                } else {
                    width = ((float) (this.f33015c.getHeight() + this.f33015c.getWidth())) / 2.0f;
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
