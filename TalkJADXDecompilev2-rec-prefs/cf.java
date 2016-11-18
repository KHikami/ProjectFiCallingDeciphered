package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;

final class cf {
    private static final Matrix f5144m = new Matrix();
    Paint f5145a;
    Paint f5146b;
    final cd f5147c;
    float f5148d;
    float f5149e;
    float f5150f;
    float f5151g;
    int f5152h;
    String f5153i;
    final ky<String, Object> f5154j;
    private final Path f5155k;
    private final Path f5156l;
    private final Matrix f5157n;
    private PathMeasure f5158o;
    private int f5159p;

    public cf() {
        this.f5157n = new Matrix();
        this.f5148d = 0.0f;
        this.f5149e = 0.0f;
        this.f5150f = 0.0f;
        this.f5151g = 0.0f;
        this.f5152h = 255;
        this.f5153i = null;
        this.f5154j = new ky();
        this.f5147c = new cd();
        this.f5155k = new Path();
        this.f5156l = new Path();
    }

    public void m7481a(int i) {
        this.f5152h = i;
    }

    public int m7479a() {
        return this.f5152h;
    }

    public void m7480a(float f) {
        m7481a((int) (255.0f * f));
    }

    public float m7483b() {
        return ((float) m7479a()) / 255.0f;
    }

    public cf(cf cfVar) {
        this.f5157n = new Matrix();
        this.f5148d = 0.0f;
        this.f5149e = 0.0f;
        this.f5150f = 0.0f;
        this.f5151g = 0.0f;
        this.f5152h = 255;
        this.f5153i = null;
        this.f5154j = new ky();
        this.f5147c = new cd(cfVar.f5147c, this.f5154j);
        this.f5155k = new Path(cfVar.f5155k);
        this.f5156l = new Path(cfVar.f5156l);
        this.f5148d = cfVar.f5148d;
        this.f5149e = cfVar.f5149e;
        this.f5150f = cfVar.f5150f;
        this.f5151g = cfVar.f5151g;
        this.f5159p = cfVar.f5159p;
        this.f5152h = cfVar.f5152h;
        this.f5153i = cfVar.f5153i;
        if (cfVar.f5153i != null) {
            this.f5154j.put(cfVar.f5153i, this);
        }
    }

    public void m7482a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        m7478a(this.f5147c, f5144m, canvas, i, i2, null);
    }

    private void m7478a(cd cdVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        cdVar.f5038a.set(matrix);
        cdVar.f5038a.preConcat(cdVar.f5040c);
        canvas.save();
        for (int i3 = 0; i3 < cdVar.f5039b.size(); i3++) {
            Object obj = cdVar.f5039b.get(i3);
            if (obj instanceof cd) {
                m7478a((cd) obj, cdVar.f5038a, canvas, i, i2, colorFilter);
            } else if (obj instanceof ce) {
                ce ceVar = (ce) obj;
                float f = ((float) i) / this.f5150f;
                float f2 = ((float) i2) / this.f5151g;
                float min = Math.min(f, f2);
                Matrix matrix2 = cdVar.f5038a;
                this.f5157n.set(matrix2);
                this.f5157n.postScale(f, f2);
                float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                f2 = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
                float hypot = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
                float f3 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                f2 = Math.max(f2, hypot);
                f = 0.0f;
                if (f2 > 0.0f) {
                    f = Math.abs(f3) / f2;
                }
                if (f != 0.0f) {
                    ceVar.m7130a(this.f5155k);
                    Path path = this.f5155k;
                    this.f5156l.reset();
                    if (ceVar.mo800a()) {
                        this.f5156l.addPath(path, this.f5157n);
                        canvas.clipPath(this.f5156l);
                    } else {
                        Paint paint;
                        cc ccVar = (cc) ceVar;
                        if (!(ccVar.f4984g == 0.0f && ccVar.f4985h == 1.0f)) {
                            hypot = (ccVar.f4984g + ccVar.f4986i) % 1.0f;
                            f3 = (ccVar.f4985h + ccVar.f4986i) % 1.0f;
                            if (this.f5158o == null) {
                                this.f5158o = new PathMeasure();
                            }
                            this.f5158o.setPath(this.f5155k, false);
                            float length = this.f5158o.getLength();
                            hypot *= length;
                            f3 *= length;
                            path.reset();
                            if (hypot > f3) {
                                this.f5158o.getSegment(hypot, length, path, true);
                                this.f5158o.getSegment(0.0f, f3, path, true);
                            } else {
                                this.f5158o.getSegment(hypot, f3, path, true);
                            }
                            path.rLineTo(0.0f, 0.0f);
                        }
                        this.f5156l.addPath(path, this.f5157n);
                        if (ccVar.f4980c != 0) {
                            if (this.f5146b == null) {
                                this.f5146b = new Paint();
                                this.f5146b.setStyle(Style.FILL);
                                this.f5146b.setAntiAlias(true);
                            }
                            paint = this.f5146b;
                            paint.setColor(ca.m7063a(ccVar.f4980c, ccVar.f4983f));
                            paint.setColorFilter(colorFilter);
                            canvas.drawPath(this.f5156l, paint);
                        }
                        if (ccVar.f4978a != 0) {
                            if (this.f5145a == null) {
                                this.f5145a = new Paint();
                                this.f5145a.setStyle(Style.STROKE);
                                this.f5145a.setAntiAlias(true);
                            }
                            paint = this.f5145a;
                            if (ccVar.f4988k != null) {
                                paint.setStrokeJoin(ccVar.f4988k);
                            }
                            if (ccVar.f4987j != null) {
                                paint.setStrokeCap(ccVar.f4987j);
                            }
                            paint.setStrokeMiter(ccVar.f4989l);
                            paint.setColor(ca.m7063a(ccVar.f4978a, ccVar.f4981d));
                            paint.setColorFilter(colorFilter);
                            paint.setStrokeWidth(ccVar.f4979b * (f * min));
                            canvas.drawPath(this.f5156l, paint);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }
}
