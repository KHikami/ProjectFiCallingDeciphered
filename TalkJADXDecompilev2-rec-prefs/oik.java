package p000;

import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public final class oik {
    public static float f32982a = 72.0f;

    public static oii m38481a(InputStream inputStream, Integer num, Integer num2, boolean z, boolean z2, boolean z3, float f) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            oir oir = new oir(picture);
            oir.m38506a(num, num2);
            oir.m38507a(false);
            oir.m38511b(false);
            oir.m38505a(f);
            oil oil = new oil(inputStream);
            Object oin = new oin();
            xMLReader.setContentHandler(oin);
            xMLReader.parse(new InputSource(oil.m38487a()));
            oir.f33013a = oin.f32998a;
            xMLReader.setContentHandler(oir);
            xMLReader.parse(new InputSource(oil.m38487a()));
            new StringBuilder(48).append("Parsing complete in ").append(System.currentTimeMillis() - currentTimeMillis).append(" millis.");
            oii oii = new oii(picture, oir.f33027o);
            if (!Float.isInfinite(oir.f33028p.top)) {
                oii.m38480a(oir.f33028p);
            }
            return oii;
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 13).append("Parse error: ").append(valueOf);
            throw new dt(e);
        }
    }

    static oip m38482a(String str) {
        String substring;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            if (obj == null) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() <= 0) {
                            i++;
                            break;
                        }
                        arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        if (charAt != '-') {
                            i = i2 + 1;
                            int i3 = 1;
                            break;
                        }
                        i = i2;
                        break;
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        substring = str.substring(i, i2);
                        if (substring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                        }
                        return new oip(arrayList, i2);
                    default:
                        break;
                }
            }
            obj = null;
        }
        substring = str.substring(i);
        if (substring.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
            } catch (NumberFormatException e) {
            }
            i = str.length();
        }
        return new oip(arrayList, i);
    }

    static Path m38484b(String str) {
        int length = str.length();
        oih oih = new oih(str, 0);
        oih.m38476a();
        Path path = new Path();
        RectF rectF = new RectF();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        char c = 'x';
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (oih.f32974a < length) {
            float c2;
            float c3;
            float c4;
            Object obj;
            float f7;
            char charAt = str.charAt(oih.f32974a);
            if (!Character.isDigit(charAt) && charAt != '.' && charAt != '-') {
                oih.m38477b();
            } else if (c == 'M') {
                charAt = 'L';
            } else if (c == 'm') {
                charAt = 'l';
            } else {
                charAt = c;
            }
            path.computeBounds(rectF, true);
            int i;
            float f8;
            float f9;
            switch (charAt) {
                case 'A':
                case 'a':
                    Object obj2;
                    Object obj3;
                    double d;
                    c2 = oih.m38478c();
                    float c5 = oih.m38478c();
                    float c6 = oih.m38478c();
                    int c7 = (int) oih.m38478c();
                    int c8 = (int) oih.m38478c();
                    c3 = oih.m38478c();
                    c4 = oih.m38478c();
                    if (charAt == 'a') {
                        c3 += f6;
                        c4 += f5;
                    }
                    double d2 = (double) f6;
                    double d3 = (double) f5;
                    double d4 = (double) c3;
                    double d5 = (double) c4;
                    double d6 = (double) c2;
                    double d7 = (double) c5;
                    double d8 = (double) c6;
                    if (c7 == 1) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (c8 == 1) {
                        obj3 = 1;
                    } else {
                        obj3 = null;
                    }
                    double d9 = (d2 - d4) / 2.0d;
                    double d10 = (d3 - d5) / 2.0d;
                    d8 = Math.toRadians(d8 % 360.0d);
                    double cos = Math.cos(d8);
                    double sin = Math.sin(d8);
                    double d11 = (cos * d9) + (sin * d10);
                    double d12 = ((-sin) * d9) + (cos * d10);
                    d10 = Math.abs(d6);
                    d9 = Math.abs(d7);
                    d8 = d10 * d10;
                    d6 = d9 * d9;
                    double d13 = d11 * d11;
                    double d14 = d12 * d12;
                    d7 = (d13 / d8) + (d14 / d6);
                    if (d7 > 1.0d) {
                        d10 *= Math.sqrt(d7);
                        d9 *= Math.sqrt(d7);
                        d7 = d9;
                        d = d10;
                        d9 *= d9;
                        d10 *= d10;
                    } else {
                        d7 = d9;
                        d = d10;
                        d9 = d6;
                        d10 = d8;
                    }
                    if (obj2 == obj3) {
                        d8 = -1.0d;
                    } else {
                        d8 = 1.0d;
                    }
                    d6 = (((d10 * d9) - (d10 * d14)) - (d9 * d13)) / ((d9 * d13) + (d10 * d14));
                    if (d6 < 0.0d) {
                        d6 = 0.0d;
                    }
                    d6 = Math.sqrt(d6) * d8;
                    d8 = ((d * d12) / d7) * d6;
                    d6 *= -((d7 * d11) / d);
                    d9 = ((d2 + d4) / 2.0d) + ((cos * d8) - (sin * d6));
                    d10 = ((d3 + d5) / 2.0d) + ((sin * d8) + (cos * d6));
                    d2 = (d11 - d8) / d;
                    d3 = (d12 - d6) / d7;
                    d8 = ((-d11) - d8) / d;
                    d4 = ((-d12) - d6) / d7;
                    d5 = Math.toDegrees((d3 < 0.0d ? -1.0d : 1.0d) * Math.acos(d2 / Math.sqrt((d2 * d2) + (d3 * d3))));
                    d6 = Math.toDegrees(((d2 * d4) - (d8 * d3) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d3 * d4) + (d2 * d8)) / Math.sqrt(((d2 * d2) + (d3 * d3)) * ((d8 * d8) + (d4 * d4)))));
                    if (obj3 == null && d6 > 0.0d) {
                        d6 -= 360.0d;
                    } else if (obj3 != null && d6 < 0.0d) {
                        d6 += 360.0d;
                    }
                    path.addArc(new RectF((float) (d9 - d), (float) (d10 - d7), (float) (d9 + d), (float) (d10 + d7)), (float) (d5 % 360.0d), (float) (d6 % 360.0d));
                    f6 = f;
                    f5 = f2;
                    c2 = f3;
                    obj = null;
                    f7 = c4;
                    c4 = c3;
                    c3 = f4;
                    break;
                case 'C':
                case 'c':
                    f4 = oih.m38478c();
                    f3 = oih.m38478c();
                    c2 = oih.m38478c();
                    c3 = oih.m38478c();
                    f7 = oih.m38478c();
                    c4 = oih.m38478c();
                    if (charAt == 'c') {
                        c2 += f6;
                        f7 += f6;
                        c3 += f5;
                        c4 += f5;
                        f5 = f3 + f5;
                        f6 = f4 + f6;
                    } else {
                        f5 = f3;
                        f6 = f4;
                    }
                    path.cubicTo(f6, f5, c2, c3, f7, c4);
                    f6 = f;
                    f5 = f2;
                    i = 1;
                    f8 = c3;
                    c3 = c2;
                    c2 = f8;
                    f9 = c4;
                    c4 = f7;
                    f7 = f9;
                    break;
                case 'H':
                case 'h':
                    c4 = oih.m38478c();
                    if (charAt != 'h') {
                        path.lineTo(c4, f5);
                        f6 = f;
                        c2 = f3;
                        c3 = f4;
                        obj = null;
                        f7 = f5;
                        f5 = f2;
                        break;
                    }
                    path.rLineTo(c4, 0.0f);
                    c2 = f3;
                    c3 = f4;
                    c4 = f6 + c4;
                    f6 = f;
                    obj = null;
                    f7 = f5;
                    f5 = f2;
                    break;
                case 'L':
                case 'l':
                    c2 = oih.m38478c();
                    c4 = oih.m38478c();
                    if (charAt != 'l') {
                        path.lineTo(c2, c4);
                        f6 = f;
                        f5 = f2;
                        c3 = f4;
                        obj = null;
                        f7 = c4;
                        c4 = c2;
                        c2 = f3;
                        break;
                    }
                    path.rLineTo(c2, c4);
                    f6 += c2;
                    c4 += f5;
                    f5 = f2;
                    c2 = f3;
                    c3 = f4;
                    f8 = f;
                    obj = null;
                    f7 = c4;
                    c4 = f6;
                    f6 = f8;
                    break;
                case 'M':
                case 'm':
                    c3 = oih.m38478c();
                    c2 = oih.m38478c();
                    if (charAt == 'm') {
                        path.rMoveTo(c3, c2);
                        c3 += f6;
                        f6 = f5 + c2;
                        f5 = c3;
                    } else {
                        path.moveTo(c3, c2);
                        f6 = c2;
                        f5 = c3;
                    }
                    obj = null;
                    c2 = f3;
                    c3 = f4;
                    c4 = f5;
                    f7 = f6;
                    break;
                case 'Q':
                case 'q':
                    c2 = oih.m38478c();
                    c3 = oih.m38478c();
                    f7 = oih.m38478c();
                    c4 = oih.m38478c();
                    if (charAt == 'q') {
                        f7 += f6;
                        c4 += f5;
                        c2 += f6;
                        c3 += f5;
                    }
                    path.cubicTo(f6, f5, c2, c3, f7, c4);
                    f6 = f;
                    f5 = f2;
                    i = 1;
                    f8 = c3;
                    c3 = c2;
                    c2 = f8;
                    f9 = c4;
                    c4 = f7;
                    f7 = f9;
                    break;
                case 'S':
                case 's':
                    c2 = oih.m38478c();
                    c3 = oih.m38478c();
                    f7 = oih.m38478c();
                    c4 = oih.m38478c();
                    if (charAt == 's') {
                        c2 += f6;
                        f7 += f6;
                        c3 += f5;
                        c4 += f5;
                    }
                    path.cubicTo((f6 * 2.0f) - f4, (f5 * 2.0f) - f3, c2, c3, f7, c4);
                    f6 = f;
                    f5 = f2;
                    i = 1;
                    f8 = c3;
                    c3 = c2;
                    c2 = f8;
                    f9 = c4;
                    c4 = f7;
                    f7 = f9;
                    break;
                case 'T':
                case 't':
                    f7 = oih.m38478c();
                    c4 = oih.m38478c();
                    if (charAt == 't') {
                        f7 += f6;
                        c4 += f5;
                    }
                    c2 = (2.0f * f6) - f4;
                    c3 = (2.0f * f5) - f3;
                    path.cubicTo(f6, f5, c2, c3, f7, c4);
                    f6 = f;
                    f5 = f2;
                    i = 1;
                    f8 = c3;
                    c3 = c2;
                    c2 = f8;
                    f9 = c4;
                    c4 = f7;
                    f7 = f9;
                    break;
                case 'V':
                case 'v':
                    c4 = oih.m38478c();
                    if (charAt != 'v') {
                        path.lineTo(f6, c4);
                        f5 = f2;
                        c2 = f3;
                        c3 = f4;
                        f8 = f;
                        obj = null;
                        f7 = c4;
                        c4 = f6;
                        f6 = f8;
                        break;
                    }
                    path.rLineTo(0.0f, c4);
                    c4 += f5;
                    f5 = f2;
                    c2 = f3;
                    c3 = f4;
                    f8 = f;
                    obj = null;
                    f7 = c4;
                    c4 = f6;
                    f6 = f8;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    f6 = f;
                    f5 = f2;
                    c2 = f3;
                    c3 = f4;
                    c4 = f2;
                    f8 = f;
                    obj = null;
                    f7 = f8;
                    break;
                default:
                    new StringBuilder(23).append("Invalid path command: ").append(charAt);
                    oih.m38477b();
                    c2 = f3;
                    c3 = f4;
                    c4 = f6;
                    f6 = f;
                    obj = null;
                    f7 = f5;
                    f5 = f2;
                    break;
            }
            if (obj == null) {
                c2 = f7;
                c3 = c4;
            }
            oih.m38476a();
            f = f6;
            f2 = f5;
            f3 = c2;
            f4 = c3;
            c = charAt;
            f5 = f7;
            f6 = c4;
        }
        return path;
    }

    static oip m38483a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return oik.m38482a(attributes.getValue(i));
            }
        }
        return null;
    }

    static String m38485b(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }
}
