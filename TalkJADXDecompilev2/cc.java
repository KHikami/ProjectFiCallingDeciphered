package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

final class cc extends ce {
    int a = 0;
    float b = 0.0f;
    int c = 0;
    float d = 1.0f;
    int e;
    float f = 1.0f;
    float g = 0.0f;
    float h = 1.0f;
    float i = 0.0f;
    Cap j = Cap.BUTT;
    Join k = Join.MITER;
    float l = 4.0f;
    private int[] p;

    public cc(cc ccVar) {
        super(ccVar);
        this.p = ccVar.p;
        this.a = ccVar.a;
        this.b = ccVar.b;
        this.d = ccVar.d;
        this.c = ccVar.c;
        this.e = ccVar.e;
        this.f = ccVar.f;
        this.g = ccVar.g;
        this.h = ccVar.h;
        this.i = ccVar.i;
        this.j = ccVar.j;
        this.k = ccVar.k;
        this.l = ccVar.l;
    }

    public void a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
        TypedArray a = bz.a(resources, theme, attributeSet, bs.c);
        this.p = null;
        if (gwb.a(xmlPullParser, "pathData")) {
            String string = a.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = a.getString(2);
            if (string != null) {
                this.m = gwb.a(string);
            }
            this.c = gwb.b(a, xmlPullParser, "fillColor", 1, this.c);
            this.f = gwb.a(a, xmlPullParser, "fillAlpha", 12, this.f);
            int a2 = gwb.a(a, xmlPullParser, "strokeLineCap", 8, -1);
            Cap cap = this.j;
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
            this.j = cap;
            a2 = gwb.a(a, xmlPullParser, "strokeLineJoin", 9, -1);
            Join join = this.k;
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
            this.k = join;
            this.l = gwb.a(a, xmlPullParser, "strokeMiterLimit", 10, this.l);
            this.a = gwb.b(a, xmlPullParser, "strokeColor", 3, this.a);
            this.d = gwb.a(a, xmlPullParser, "strokeAlpha", 11, this.d);
            this.b = gwb.a(a, xmlPullParser, "strokeWidth", 4, this.b);
            this.h = gwb.a(a, xmlPullParser, "trimPathEnd", 6, this.h);
            this.i = gwb.a(a, xmlPullParser, "trimPathOffset", 7, this.i);
            this.g = gwb.a(a, xmlPullParser, "trimPathStart", 5, this.g);
        }
        a.recycle();
    }
}
