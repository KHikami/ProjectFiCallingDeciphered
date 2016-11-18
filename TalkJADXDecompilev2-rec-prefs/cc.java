package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

final class cc extends ce {
    int f4978a = 0;
    float f4979b = 0.0f;
    int f4980c = 0;
    float f4981d = 1.0f;
    int f4982e;
    float f4983f = 1.0f;
    float f4984g = 0.0f;
    float f4985h = 1.0f;
    float f4986i = 0.0f;
    Cap f4987j = Cap.BUTT;
    Join f4988k = Join.MITER;
    float f4989l = 4.0f;
    private int[] f4990p;

    public cc(cc ccVar) {
        super(ccVar);
        this.f4990p = ccVar.f4990p;
        this.f4978a = ccVar.f4978a;
        this.f4979b = ccVar.f4979b;
        this.f4981d = ccVar.f4981d;
        this.f4980c = ccVar.f4980c;
        this.f4982e = ccVar.f4982e;
        this.f4983f = ccVar.f4983f;
        this.f4984g = ccVar.f4984g;
        this.f4985h = ccVar.f4985h;
        this.f4986i = ccVar.f4986i;
        this.f4987j = ccVar.f4987j;
        this.f4988k = ccVar.f4988k;
        this.f4989l = ccVar.f4989l;
    }

    public void m7175a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
        TypedArray a = bz.m6570a(resources, theme, attributeSet, bs.f4302c);
        this.f4990p = null;
        if (gwb.m1946a(xmlPullParser, "pathData")) {
            String string = a.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = a.getString(2);
            if (string != null) {
                this.m = gwb.m1954a(string);
            }
            this.f4980c = gwb.m1969b(a, xmlPullParser, "fillColor", 1, this.f4980c);
            this.f4983f = gwb.m1476a(a, xmlPullParser, "fillAlpha", 12, this.f4983f);
            int a2 = gwb.m1496a(a, xmlPullParser, "strokeLineCap", 8, -1);
            Cap cap = this.f4987j;
            switch (a2) {
                case 0:
                    cap = Cap.BUTT;
                    break;
                case 1:
                    cap = Cap.ROUND;
                    break;
                case 2:
                    cap = Cap.SQUARE;
                    break;
            }
            this.f4987j = cap;
            a2 = gwb.m1496a(a, xmlPullParser, "strokeLineJoin", 9, -1);
            Join join = this.f4988k;
            switch (a2) {
                case 0:
                    join = Join.MITER;
                    break;
                case 1:
                    join = Join.ROUND;
                    break;
                case 2:
                    join = Join.BEVEL;
                    break;
            }
            this.f4988k = join;
            this.f4989l = gwb.m1476a(a, xmlPullParser, "strokeMiterLimit", 10, this.f4989l);
            this.f4978a = gwb.m1969b(a, xmlPullParser, "strokeColor", 3, this.f4978a);
            this.f4981d = gwb.m1476a(a, xmlPullParser, "strokeAlpha", 11, this.f4981d);
            this.f4979b = gwb.m1476a(a, xmlPullParser, "strokeWidth", 4, this.f4979b);
            this.f4985h = gwb.m1476a(a, xmlPullParser, "trimPathEnd", 6, this.f4985h);
            this.f4986i = gwb.m1476a(a, xmlPullParser, "trimPathOffset", 7, this.f4986i);
            this.f4984g = gwb.m1476a(a, xmlPullParser, "trimPathStart", 5, this.f4984g);
        }
        a.recycle();
    }
}
