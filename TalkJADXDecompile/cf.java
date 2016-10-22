import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;

final class cf {
    private static final Matrix m;
    Paint a;
    Paint b;
    final cd c;
    float d;
    float e;
    float f;
    float g;
    int h;
    String i;
    final ky<String, Object> j;
    private final Path k;
    private final Path l;
    private final Matrix n;
    private PathMeasure o;
    private int p;

    static {
        m = new Matrix();
    }

    public cf() {
        this.n = new Matrix();
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 255;
        this.i = null;
        this.j = new ky();
        this.c = new cd();
        this.k = new Path();
        this.l = new Path();
    }

    public void a(int i) {
        this.h = i;
    }

    public int a() {
        return this.h;
    }

    public void a(float f) {
        a((int) (255.0f * f));
    }

    public float b() {
        return ((float) a()) / 255.0f;
    }

    public cf(cf cfVar) {
        this.n = new Matrix();
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 255;
        this.i = null;
        this.j = new ky();
        this.c = new cd(cfVar.c, this.j);
        this.k = new Path(cfVar.k);
        this.l = new Path(cfVar.l);
        this.d = cfVar.d;
        this.e = cfVar.e;
        this.f = cfVar.f;
        this.g = cfVar.g;
        this.p = cfVar.p;
        this.h = cfVar.h;
        this.i = cfVar.i;
        if (cfVar.i != null) {
            this.j.put(cfVar.i, this);
        }
    }

    public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        a(this.c, m, canvas, i, i2, null);
    }

    private void a(cd cdVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        cdVar.a.set(matrix);
        cdVar.a.preConcat(cdVar.c);
        canvas.save();
        for (int i3 = 0; i3 < cdVar.b.size(); i3++) {
            Object obj = cdVar.b.get(i3);
            if (obj instanceof cd) {
                a((cd) obj, cdVar.a, canvas, i, i2, colorFilter);
            } else if (obj instanceof ce) {
                ce ceVar = (ce) obj;
                float f = ((float) i) / this.f;
                float f2 = ((float) i2) / this.g;
                float min = Math.min(f, f2);
                Matrix matrix2 = cdVar.a;
                this.n.set(matrix2);
                this.n.postScale(f, f2);
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
                    ceVar.a(this.k);
                    Path path = this.k;
                    this.l.reset();
                    if (ceVar.a()) {
                        this.l.addPath(path, this.n);
                        canvas.clipPath(this.l);
                    } else {
                        Paint paint;
                        cc ccVar = (cc) ceVar;
                        if (!(ccVar.g == 0.0f && ccVar.h == 1.0f)) {
                            hypot = (ccVar.g + ccVar.i) % 1.0f;
                            f3 = (ccVar.h + ccVar.i) % 1.0f;
                            if (this.o == null) {
                                this.o = new PathMeasure();
                            }
                            this.o.setPath(this.k, false);
                            float length = this.o.getLength();
                            hypot *= length;
                            f3 *= length;
                            path.reset();
                            if (hypot > f3) {
                                this.o.getSegment(hypot, length, path, true);
                                this.o.getSegment(0.0f, f3, path, true);
                            } else {
                                this.o.getSegment(hypot, f3, path, true);
                            }
                            path.rLineTo(0.0f, 0.0f);
                        }
                        this.l.addPath(path, this.n);
                        if (ccVar.c != 0) {
                            if (this.b == null) {
                                this.b = new Paint();
                                this.b.setStyle(Style.FILL);
                                this.b.setAntiAlias(true);
                            }
                            paint = this.b;
                            paint.setColor(ca.a(ccVar.c, ccVar.f));
                            paint.setColorFilter(colorFilter);
                            canvas.drawPath(this.l, paint);
                        }
                        if (ccVar.a != 0) {
                            if (this.a == null) {
                                this.a = new Paint();
                                this.a.setStyle(Style.STROKE);
                                this.a.setAntiAlias(true);
                            }
                            paint = this.a;
                            if (ccVar.k != null) {
                                paint.setStrokeJoin(ccVar.k);
                            }
                            if (ccVar.j != null) {
                                paint.setStrokeCap(ccVar.j);
                            }
                            paint.setStrokeMiter(ccVar.l);
                            paint.setColor(ca.a(ccVar.a, ccVar.d));
                            paint.setColorFilter(colorFilter);
                            paint.setStrokeWidth(ccVar.b * (f * min));
                            canvas.drawPath(this.l, paint);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }
}
