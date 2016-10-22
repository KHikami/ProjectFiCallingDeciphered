package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region.Op;

/* compiled from: PG */
/* renamed from: bs */
final class bs {
    private static final Matrix m;
    Paint a;
    Paint b;
    final bq c;
    float d;
    float e;
    float f;
    float g;
    int h;
    String i;
    final hv j;
    private final Path k;
    private final Path l;
    private final Matrix n;
    private PathMeasure o;
    private int p;

    static {
        m = new Matrix();
    }

    public bs() {
        this.n = new Matrix();
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 255;
        this.i = null;
        this.j = new hv();
        this.c = new bq();
        this.k = new Path();
        this.l = new Path();
    }

    public bs(bs bsVar) {
        this.n = new Matrix();
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 255;
        this.i = null;
        this.j = new hv();
        this.c = new bq(bsVar.c, this.j);
        this.k = new Path(bsVar.k);
        this.l = new Path(bsVar.l);
        this.d = bsVar.d;
        this.e = bsVar.e;
        this.f = bsVar.f;
        this.g = bsVar.g;
        this.p = bsVar.p;
        this.h = bsVar.h;
        this.i = bsVar.i;
        if (bsVar.i != null) {
            this.j.put(bsVar.i, this);
        }
    }

    public final void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        a(this.c, m, canvas, i, i2, null);
    }

    private final void a(bq bqVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        bqVar.a.set(matrix);
        bqVar.a.preConcat(bqVar.j);
        for (int i3 = 0; i3 < bqVar.b.size(); i3++) {
            Object obj = bqVar.b.get(i3);
            if (obj instanceof bq) {
                a((bq) obj, bqVar.a, canvas, i, i2, colorFilter);
            } else if (obj instanceof br) {
                float abs;
                br brVar = (br) obj;
                float f = ((float) i) / this.f;
                float f2 = ((float) i2) / this.g;
                float min = Math.min(f, f2);
                Matrix matrix2 = bqVar.a;
                this.n.set(matrix2);
                this.n.postScale(f, f2);
                float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float f3 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                f2 = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                if (f2 > 0.0f) {
                    abs = Math.abs(f3) / f2;
                } else {
                    abs = 0.0f;
                }
                if (abs != 0.0f) {
                    float f4;
                    float f5;
                    Path path = this.k;
                    path.reset();
                    if (brVar.m != null) {
                        bl[] blVarArr = brVar.m;
                        float[] fArr2 = new float[6];
                        char c = 'm';
                        for (int i4 = 0; i4 < blVarArr.length; i4++) {
                            int i5;
                            char c2 = blVarArr[i4].a;
                            float[] fArr3 = blVarArr[i4].b;
                            float f6 = fArr2[0];
                            float f7 = fArr2[1];
                            f3 = fArr2[2];
                            f2 = fArr2[3];
                            f4 = fArr2[4];
                            f5 = fArr2[5];
                            switch (c2) {
                                case 'A':
                                case 'a':
                                    i5 = 7;
                                    break;
                                case 'C':
                                case 'c':
                                    i5 = 6;
                                    break;
                                case 'H':
                                case 'V':
                                case 'h':
                                case 'v':
                                    i5 = 1;
                                    break;
                                case 'L':
                                case 'M':
                                case 'T':
                                case 'l':
                                case 'm':
                                case 't':
                                    i5 = 2;
                                    break;
                                case 'Q':
                                case 'S':
                                case 'q':
                                case 's':
                                    i5 = 4;
                                    break;
                                case 'Z':
                                case 'z':
                                    path.close();
                                    path.moveTo(f4, f5);
                                    f2 = f5;
                                    f3 = f4;
                                    f7 = f5;
                                    f6 = f4;
                                    i5 = 2;
                                    break;
                                default:
                                    i5 = 2;
                                    break;
                            }
                            int i6 = 0;
                            float f8 = f5;
                            float f9 = f4;
                            float f10 = f7;
                            float f11 = f6;
                            char c3 = c;
                            while (i6 < fArr3.length) {
                                float f12;
                                boolean z;
                                boolean z2;
                                switch (c2) {
                                    case 'A':
                                        f3 = fArr3[i6 + 5];
                                        f4 = fArr3[i6 + 6];
                                        f7 = fArr3[i6];
                                        f6 = fArr3[i6 + 1];
                                        f12 = fArr3[i6 + 2];
                                        z = fArr3[i6 + 3] != 0.0f;
                                        if (fArr3[i6 + 4] != 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        bl.a(path, f11, f10, f3, f4, f7, f6, f12, z, z2);
                                        f3 = fArr3[i6 + 5];
                                        f2 = fArr3[i6 + 6];
                                        f5 = f8;
                                        f4 = f9;
                                        f7 = f3;
                                        f6 = f2;
                                        f12 = f3;
                                        f3 = f2;
                                        break;
                                    case 'C':
                                        path.cubicTo(fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3], fArr3[i6 + 4], fArr3[i6 + 5]);
                                        f4 = fArr3[i6 + 4];
                                        f5 = fArr3[i6 + 5];
                                        f7 = fArr3[i6 + 2];
                                        f6 = f5;
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = fArr3[i6 + 3];
                                        break;
                                    case 'H':
                                        path.lineTo(fArr3[i6], f10);
                                        f5 = f8;
                                        f7 = f3;
                                        f6 = f10;
                                        f12 = fArr3[i6];
                                        f3 = f2;
                                        f4 = f9;
                                        break;
                                    case 'L':
                                        path.lineTo(fArr3[i6], fArr3[i6 + 1]);
                                        f4 = fArr3[i6];
                                        f7 = f3;
                                        f6 = fArr3[i6 + 1];
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2;
                                        break;
                                    case 'M':
                                        f4 = fArr3[i6];
                                        f5 = fArr3[i6 + 1];
                                        if (i6 <= 0) {
                                            path.moveTo(fArr3[i6], fArr3[i6 + 1]);
                                            f7 = f3;
                                            f6 = f5;
                                            f12 = f4;
                                            f3 = f2;
                                            break;
                                        }
                                        path.lineTo(fArr3[i6], fArr3[i6 + 1]);
                                        f7 = f3;
                                        f6 = f5;
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2;
                                        break;
                                    case 'Q':
                                        path.quadTo(fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3]);
                                        f3 = fArr3[i6];
                                        f2 = fArr3[i6 + 1];
                                        f4 = fArr3[i6 + 2];
                                        f7 = f3;
                                        f6 = fArr3[i6 + 3];
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2;
                                        break;
                                    case 'S':
                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                            f5 = (2.0f * f10) - f2;
                                            f2 = (2.0f * f11) - f3;
                                        } else {
                                            f5 = f10;
                                            f2 = f11;
                                        }
                                        path.cubicTo(f2, f5, fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3]);
                                        f3 = fArr3[i6];
                                        f2 = fArr3[i6 + 1];
                                        f4 = fArr3[i6 + 2];
                                        f7 = f3;
                                        f6 = fArr3[i6 + 3];
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2;
                                        break;
                                    case 'T':
                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                            f11 = (2.0f * f11) - f3;
                                            f10 = (2.0f * f10) - f2;
                                        }
                                        path.quadTo(f11, f10, fArr3[i6], fArr3[i6 + 1]);
                                        f4 = fArr3[i6];
                                        f3 = f10;
                                        f7 = f11;
                                        f6 = fArr3[i6 + 1];
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        break;
                                    case 'V':
                                        path.lineTo(f11, fArr3[i6]);
                                        f4 = f9;
                                        f7 = f3;
                                        f6 = fArr3[i6];
                                        f12 = f11;
                                        f3 = f2;
                                        f5 = f8;
                                        break;
                                    case 'a':
                                        f3 = fArr3[i6 + 5] + f11;
                                        f4 = fArr3[i6 + 6] + f10;
                                        f7 = fArr3[i6];
                                        f6 = fArr3[i6 + 1];
                                        f12 = fArr3[i6 + 2];
                                        z = fArr3[i6 + 3] != 0.0f;
                                        if (fArr3[i6 + 4] != 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        bl.a(path, f11, f10, f3, f4, f7, f6, f12, z, z2);
                                        f3 = f11 + fArr3[i6 + 5];
                                        f2 = fArr3[i6 + 6] + f10;
                                        f5 = f8;
                                        f4 = f9;
                                        f7 = f3;
                                        f6 = f2;
                                        f12 = f3;
                                        f3 = f2;
                                        break;
                                    case 'c':
                                        path.rCubicTo(fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3], fArr3[i6 + 4], fArr3[i6 + 5]);
                                        f7 = f11 + fArr3[i6 + 2];
                                        f6 = fArr3[i6 + 5] + f10;
                                        f12 = f11 + fArr3[i6 + 4];
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = fArr3[i6 + 3] + f10;
                                        break;
                                    case 'h':
                                        path.rLineTo(fArr3[i6], 0.0f);
                                        f5 = f8;
                                        f7 = f3;
                                        f6 = f10;
                                        f12 = f11 + fArr3[i6];
                                        f3 = f2;
                                        f4 = f9;
                                        break;
                                    case 'l':
                                        path.rLineTo(fArr3[i6], fArr3[i6 + 1]);
                                        f7 = f3;
                                        f6 = fArr3[i6 + 1] + f10;
                                        f12 = f11 + fArr3[i6];
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2;
                                        break;
                                    case 'm':
                                        f4 = f11 + fArr3[i6];
                                        f5 = fArr3[i6 + 1] + f10;
                                        if (i6 <= 0) {
                                            path.rMoveTo(fArr3[i6], fArr3[i6 + 1]);
                                            f7 = f3;
                                            f6 = f5;
                                            f12 = f4;
                                            f3 = f2;
                                            break;
                                        }
                                        path.rLineTo(fArr3[i6], fArr3[i6 + 1]);
                                        f7 = f3;
                                        f6 = f5;
                                        f12 = f4;
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2;
                                        break;
                                    case 'q':
                                        path.rQuadTo(fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3]);
                                        f7 = f11 + fArr3[i6];
                                        f6 = fArr3[i6 + 3] + f10;
                                        f12 = f11 + fArr3[i6 + 2];
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = fArr3[i6 + 1] + f10;
                                        break;
                                    case 's':
                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                            f5 = f10 - f2;
                                            f2 = f11 - f3;
                                        } else {
                                            f5 = 0.0f;
                                            f2 = 0.0f;
                                        }
                                        path.rCubicTo(f2, f5, fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3]);
                                        f7 = f11 + fArr3[i6];
                                        f6 = fArr3[i6 + 3] + f10;
                                        f12 = f11 + fArr3[i6 + 2];
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = fArr3[i6 + 1] + f10;
                                        break;
                                    case 't':
                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                            f5 = f11 - f3;
                                            f2 = f10 - f2;
                                        } else {
                                            f2 = 0.0f;
                                            f5 = 0.0f;
                                        }
                                        path.rQuadTo(f5, f2, fArr3[i6], fArr3[i6 + 1]);
                                        f7 = f11 + f5;
                                        f6 = fArr3[i6 + 1] + f10;
                                        f12 = f11 + fArr3[i6];
                                        f5 = f8;
                                        f4 = f9;
                                        f3 = f2 + f10;
                                        break;
                                    case 'v':
                                        path.rLineTo(0.0f, fArr3[i6]);
                                        f4 = f9;
                                        f7 = f3;
                                        f6 = fArr3[i6] + f10;
                                        f12 = f11;
                                        f3 = f2;
                                        f5 = f8;
                                        break;
                                    default:
                                        f5 = f8;
                                        f4 = f9;
                                        f7 = f3;
                                        f6 = f10;
                                        f12 = f11;
                                        f3 = f2;
                                        break;
                                }
                                i6 += i5;
                                f8 = f5;
                                f9 = f4;
                                f10 = f6;
                                f11 = f12;
                                f2 = f3;
                                c3 = c2;
                                f3 = f7;
                            }
                            fArr2[0] = f11;
                            fArr2[1] = f10;
                            fArr2[2] = f3;
                            fArr2[3] = f2;
                            fArr2[4] = f9;
                            fArr2[5] = f8;
                            c = blVarArr[i4].a;
                        }
                    }
                    Path path2 = this.k;
                    this.l.reset();
                    if (brVar.a()) {
                        this.l.addPath(path2, this.n);
                        canvas.clipPath(this.l, Op.REPLACE);
                    } else {
                        Paint paint;
                        bp bpVar = (bp) brVar;
                        if (!(bpVar.g == 0.0f && bpVar.h == 1.0f)) {
                            f5 = (bpVar.g + bpVar.i) % 1.0f;
                            f3 = (bpVar.h + bpVar.i) % 1.0f;
                            if (this.o == null) {
                                this.o = new PathMeasure();
                            }
                            this.o.setPath(this.k, false);
                            f4 = this.o.getLength();
                            f5 *= f4;
                            f3 *= f4;
                            path2.reset();
                            if (f5 > f3) {
                                this.o.getSegment(f5, f4, path2, true);
                                this.o.getSegment(0.0f, f3, path2, true);
                            } else {
                                this.o.getSegment(f5, f3, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.l.addPath(path2, this.n);
                        if (bpVar.d != 0) {
                            if (this.b == null) {
                                this.b = new Paint();
                                this.b.setStyle(Style.FILL);
                                this.b.setAntiAlias(true);
                            }
                            paint = this.b;
                            paint.setColor(bn.a(bpVar.d, bpVar.f));
                            paint.setColorFilter(colorFilter);
                            canvas.drawPath(this.l, paint);
                        }
                        if (bpVar.b != 0) {
                            if (this.a == null) {
                                this.a = new Paint();
                                this.a.setStyle(Style.STROKE);
                                this.a.setAntiAlias(true);
                            }
                            paint = this.a;
                            if (bpVar.k != null) {
                                paint.setStrokeJoin(bpVar.k);
                            }
                            if (bpVar.j != null) {
                                paint.setStrokeCap(bpVar.j);
                            }
                            paint.setStrokeMiter(bpVar.l);
                            paint.setColor(bn.a(bpVar.b, bpVar.e));
                            paint.setColorFilter(colorFilter);
                            paint.setStrokeWidth(bpVar.c * (min * abs));
                            canvas.drawPath(this.l, paint);
                        }
                    }
                }
            }
        }
    }
}
