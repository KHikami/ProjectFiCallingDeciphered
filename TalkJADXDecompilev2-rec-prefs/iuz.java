package p000;

import android.graphics.PointF;
import java.util.ArrayList;

public final class iuz {
    static final iuw f19081a = new iuw();
    private static final iux f19082c = new iux();
    private ArrayList<ivd> f19083b = new ArrayList();

    public void m23338a(float f, float f2) {
        this.f19083b.add(new ivc(0.0f, 0.0f, false));
    }

    public void m23339a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f19083b.add(new ivb(f, f2, f3, f4, 1.0f, 1.0f, false));
    }

    float[] m23340a(float f) {
        float f2;
        int i = 0;
        int size = this.f19083b.size();
        ArrayList arrayList = new ArrayList(size + 1);
        ArrayList arrayList2 = new ArrayList(size + 1);
        PointF pointF = new PointF();
        for (int i2 = 0; i2 < size; i2++) {
            ((ivd) this.f19083b.get(i2)).mo3404a(arrayList, arrayList2, 4.0000004E-6f, pointF);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList2.add(Float.valueOf(0.0f));
        }
        float floatValue = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
        if (floatValue == 0.0f) {
            arrayList.add((PointF) arrayList.get(arrayList.size() - 1));
            arrayList2.add(Float.valueOf(1.0f));
            f2 = 1.0f;
        } else {
            f2 = floatValue;
        }
        int size2 = arrayList.size();
        float[] fArr = new float[(size2 * 3)];
        size = 0;
        while (i < size2) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i3 = size + 1;
            fArr[size] = ((Float) arrayList2.get(i)).floatValue() / f2;
            size = i3 + 1;
            fArr[i3] = pointF2.x;
            int i4 = size + 1;
            fArr[size] = pointF2.y;
            i++;
            size = i4;
        }
        return fArr;
    }

    static void m23336a(PointF[] pointFArr, iuv iuv, boolean z, ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        iva iva = new iva(null, 1.0f, iuv.mo3403a(1.0f, pointFArr, new PointF()));
        iva iva2 = new iva(iva, 0.0f, iuv.mo3403a(0.0f, pointFArr, new PointF()));
        float[] fArr = new float[1];
        iva iva3 = iva2;
        boolean z2 = z;
        while (iva != null) {
            boolean z3;
            do {
                iva iva4 = iva;
                boolean z4 = z2;
                PointF pointF2 = new PointF();
                boolean a = iuz.m23337a(pointFArr, iuv, iva3.f19087b, iva3.f19088c, iva4.f19087b, iva4.f19088c, fArr, pointF2, f);
                if (!a && z4) {
                    float[] fArr2 = new float[1];
                    PointF[] pointFArr2 = pointFArr;
                    iuv iuv2 = iuv;
                    a = iuz.m23337a(pointFArr2, iuv2, iva3.f19087b, iva3.f19088c, fArr[0], pointF2, fArr2, new PointF(), f);
                    if (a) {
                        z3 = a;
                        z2 = false;
                        if (z3) {
                            iva = iva4;
                            continue;
                        } else {
                            iva = new iva(iva4, fArr[0], pointF2);
                            iva3.f19086a = iva;
                            continue;
                        }
                    }
                }
                z3 = a;
                z2 = z4;
                if (z3) {
                    iva = iva4;
                    continue;
                } else {
                    iva = new iva(iva4, fArr[0], pointF2);
                    iva3.f19086a = iva;
                    continue;
                }
            } while (z3);
            iva3 = iva;
            iva = iva.f19086a;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList2.add(Float.valueOf(0.0f));
            pointF.set(0.0f, 0.0f);
        }
        PointF pointF3 = (PointF) arrayList.get(arrayList.size() - 1);
        PointF pointF4 = pointF3;
        float floatValue = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
        PointF pointF5 = pointF4;
        for (iva iva5 = iva2; iva5 != null; iva5 = iva5.f19086a) {
            arrayList.add(iva5.f19088c);
            floatValue += PointF.length(iva5.f19088c.x - pointF5.x, iva5.f19088c.y - pointF5.y);
            arrayList2.add(Float.valueOf(floatValue));
            pointF5 = iva5.f19088c;
        }
    }

    private static boolean m23337a(PointF[] pointFArr, iuv iuv, float f, PointF pointF, float f2, PointF pointF2, float[] fArr, PointF pointF3, float f3) {
        fArr[0] = (f2 + f) / 2.0f;
        float f4 = (pointF2.x + pointF.x) / 2.0f;
        float f5 = (pointF2.y + pointF.y) / 2.0f;
        iuv.mo3403a(fArr[0], pointFArr, pointF3);
        f4 = pointF3.x - f4;
        f5 = pointF3.y - f5;
        if ((f4 * f4) + (f5 * f5) > f3) {
            return true;
        }
        return false;
    }
}
