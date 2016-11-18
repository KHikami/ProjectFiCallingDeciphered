package p000;

import android.graphics.PointF;
import java.util.ArrayList;

public final class ivc implements ivd {
    final float f19096a;
    final float f19097b;
    private final boolean f19098c = false;

    public ivc(float f, float f2, boolean z) {
        this.f19096a = f;
        this.f19097b = f2;
    }

    public void mo3404a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        PointF pointF2;
        if (arrayList2.isEmpty()) {
            arrayList2.add(Float.valueOf(0.0f));
        } else {
            arrayList2.add((Float) arrayList2.get(arrayList2.size() - 1));
        }
        if (!this.f19098c || arrayList.isEmpty()) {
            pointF2 = new PointF(this.f19096a, this.f19097b);
        } else {
            pointF2 = (PointF) arrayList.get(arrayList.size() - 1);
            pointF2 = new PointF(pointF2.x + this.f19096a, pointF2.y + this.f19097b);
        }
        arrayList.add(pointF2);
        pointF.set(pointF2);
    }
}
