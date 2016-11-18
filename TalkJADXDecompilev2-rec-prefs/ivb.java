package p000;

import android.graphics.PointF;
import java.util.ArrayList;

public final class ivb implements ivd {
    final float f19089a;
    final float f19090b;
    final float f19091c;
    final float f19092d;
    final float f19093e;
    final float f19094f;
    private final boolean f19095g = false;

    public ivb(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.f19089a = f;
        this.f19090b = f2;
        this.f19091c = f3;
        this.f19092d = f4;
        this.f19093e = f5;
        this.f19094f = f6;
    }

    public void mo3404a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        PointF pointF2;
        PointF[] pointFArr;
        if (arrayList.isEmpty()) {
            pointF2 = new PointF(0.0f, 0.0f);
        } else {
            pointF2 = (PointF) arrayList.get(arrayList.size() - 1);
        }
        if (this.f19095g) {
            PointF[] pointFArr2 = new PointF[4];
            pointFArr2[0] = pointF2;
            pointFArr2[1] = new PointF(this.f19089a + pointF2.x, this.f19090b + pointF2.y);
            pointFArr2[2] = new PointF(this.f19091c + pointF2.x, this.f19092d + pointF2.y);
            pointFArr2[3] = new PointF(this.f19093e + pointF2.x, pointF2.y + this.f19094f);
            pointFArr = pointFArr2;
        } else {
            pointFArr = new PointF[]{pointF2, new PointF(this.f19089a, this.f19090b), new PointF(this.f19091c, this.f19092d), new PointF(this.f19093e, this.f19094f)};
        }
        iuz.m23336a(pointFArr, iuz.f19081a, true, arrayList, arrayList2, f, pointF);
    }
}
