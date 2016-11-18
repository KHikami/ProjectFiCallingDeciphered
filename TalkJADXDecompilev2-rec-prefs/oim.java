package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

final class oim {
    String f32985a;
    String f32986b;
    boolean f32987c;
    float f32988d;
    float f32989e;
    float f32990f;
    float f32991g;
    float f32992h;
    float f32993i;
    float f32994j;
    ArrayList<Float> f32995k = new ArrayList();
    ArrayList<Integer> f32996l = new ArrayList();
    Matrix f32997m = null;

    oim() {
    }

    public oim m38488a(oim oim) {
        oim oim2 = new oim();
        oim2.f32985a = oim.f32985a;
        oim2.f32986b = this.f32985a;
        oim2.f32987c = oim.f32987c;
        oim2.f32988d = oim.f32988d;
        oim2.f32990f = oim.f32990f;
        oim2.f32989e = oim.f32989e;
        oim2.f32991g = oim.f32991g;
        oim2.f32992h = oim.f32992h;
        oim2.f32993i = oim.f32993i;
        oim2.f32994j = oim.f32994j;
        oim2.f32995k = this.f32995k;
        oim2.f32996l = this.f32996l;
        oim2.f32997m = this.f32997m;
        if (oim.f32997m != null) {
            if (this.f32997m == null) {
                oim2.f32997m = oim.f32997m;
            } else {
                Matrix matrix = new Matrix(this.f32997m);
                matrix.preConcat(oim.f32997m);
                oim2.f32997m = matrix;
            }
        }
        return oim2;
    }
}
