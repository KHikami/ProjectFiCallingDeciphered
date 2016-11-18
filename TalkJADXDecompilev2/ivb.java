package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

public final class ivb implements ivd {
    final float a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    private final boolean g = false;

    public ivb(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public void a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        PointF pointF2;
        PointF[] pointFArr;
        if (arrayList.isEmpty()) {
            pointF2 = new PointF(0.0f, 0.0f);
        } else {
            pointF2 = (PointF) arrayList.get(arrayList.size() - 1);
        }
        if (this.g) {
            PointF[] pointFArr2 = new PointF[4];
            pointFArr2[0] = pointF2;
            pointFArr2[1] = new PointF(this.a + pointF2.x, this.b + pointF2.y);
            pointFArr2[2] = new PointF(this.c + pointF2.x, this.d + pointF2.y);
            pointFArr2[3] = new PointF(this.e + pointF2.x, pointF2.y + this.f);
            pointFArr = pointFArr2;
        } else {
            pointFArr = new PointF[]{pointF2, new PointF(this.a, this.b), new PointF(this.c, this.d), new PointF(this.e, this.f)};
        }
        iuz.a(pointFArr, iuz.a, true, arrayList, arrayList2, f, pointF);
    }
}
