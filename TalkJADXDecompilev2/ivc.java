package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

public final class ivc implements ivd {
    final float a;
    final float b;
    private final boolean c = false;

    public ivc(float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
    }

    public void a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        PointF pointF2;
        if (arrayList2.isEmpty()) {
            arrayList2.add(Float.valueOf(0.0f));
        } else {
            arrayList2.add((Float) arrayList2.get(arrayList2.size() - 1));
        }
        if (!this.c || arrayList.isEmpty()) {
            pointF2 = new PointF(this.a, this.b);
        } else {
            pointF2 = (PointF) arrayList.get(arrayList.size() - 1);
            pointF2 = new PointF(pointF2.x + this.a, pointF2.y + this.b);
        }
        arrayList.add(pointF2);
        pointF.set(pointF2);
    }
}
