package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

final class oim {
    String a;
    String b;
    boolean c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    ArrayList<Float> k = new ArrayList();
    ArrayList<Integer> l = new ArrayList();
    Matrix m = null;

    oim() {
    }

    public oim a(oim oim) {
        oim oim2 = new oim();
        oim2.a = oim.a;
        oim2.b = this.a;
        oim2.c = oim.c;
        oim2.d = oim.d;
        oim2.f = oim.f;
        oim2.e = oim.e;
        oim2.g = oim.g;
        oim2.h = oim.h;
        oim2.i = oim.i;
        oim2.j = oim.j;
        oim2.k = this.k;
        oim2.l = this.l;
        oim2.m = this.m;
        if (oim.m != null) {
            if (this.m == null) {
                oim2.m = oim.m;
            } else {
                Matrix matrix = new Matrix(this.m);
                matrix.preConcat(oim.m);
                oim2.m = matrix;
            }
        }
        return oim2;
    }
}
