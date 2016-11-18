package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

final class dlg extends View {
    static final float[][] f10072a = new float[][]{new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.4f, 0.0f, 0.0f}, new float[]{0.6f, 0.4f, 0.0f}, new float[]{0.8f, 0.6f, 0.4f}, new float[]{1.0f, 0.8f, 0.6f}, new float[]{1.0f, 1.0f, 1.0f}};
    static final float[][] f10073b = new float[][]{new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.25f, 0.0f, 0.0f}, new float[]{0.5f, 0.25f, 0.0f}, new float[]{0.75f, 0.5f, 0.25f}, new float[]{1.0f, 0.75f, 0.5f}, new float[]{1.0f, 1.0f, 1.0f}};
    static final int[] f10074c = new int[]{ba.ci, ba.cj, ba.ck};
    private ImageView[] f10075d = new ImageView[f10074c.length];
    private int f10076e;

    dlg(Context context, ViewGroup viewGroup) {
        super(context);
        dlg.inflate(getContext(), gwb.gK, viewGroup);
        for (int i = 0; i < f10074c.length; i++) {
            this.f10075d[i] = (ImageView) viewGroup.findViewById(f10074c[i]);
        }
        this.f10076e = 0;
    }

    void m12186a(int i) {
        int i2 = 0;
        int e = gld.m17949e(i);
        if (e != this.f10076e) {
            iil.m21868a(e, 0, f10073b.length - 1);
            while (i2 < this.f10075d.length) {
                ImageView imageView = this.f10075d[i2];
                float f = f10072a[e][i2];
                float f2 = f10073b[e][i2];
                imageView.animate().alpha(f).scaleX(f2).scaleY(f2).setDuration(150).start();
                i2++;
            }
            this.f10076e = e;
        }
    }
}
