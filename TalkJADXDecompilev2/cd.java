package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

final class cd {
    final Matrix a = new Matrix();
    final ArrayList<Object> b = new ArrayList();
    final Matrix c = new Matrix();
    int d;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 1.0f;
    private float i = 1.0f;
    private float j = 0.0f;
    private float k = 0.0f;
    private int[] l;
    private String m = null;

    public cd(cd cdVar, ky<String, Object> kyVar) {
        this.e = cdVar.e;
        this.f = cdVar.f;
        this.g = cdVar.g;
        this.h = cdVar.h;
        this.i = cdVar.i;
        this.j = cdVar.j;
        this.k = cdVar.k;
        this.l = cdVar.l;
        this.m = cdVar.m;
        this.d = cdVar.d;
        if (this.m != null) {
            kyVar.put(this.m, this);
        }
        this.c.set(cdVar.c);
        ArrayList arrayList = cdVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof cd) {
                this.b.add(new cd((cd) obj, kyVar));
            } else {
                ce ccVar;
                if (obj instanceof cc) {
                    ccVar = new cc((cc) obj);
                } else if (obj instanceof cb) {
                    ccVar = new cb((cb) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(ccVar);
                if (ccVar.n != null) {
                    kyVar.put(ccVar.n, ccVar);
                }
            }
        }
    }

    public String a() {
        return this.m;
    }

    public void a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
        TypedArray a = bz.a(resources, theme, attributeSet, bs.b);
        this.l = null;
        this.e = gwb.a(a, xmlPullParser, "rotation", 5, this.e);
        this.f = a.getFloat(1, this.f);
        this.g = a.getFloat(2, this.g);
        this.h = gwb.a(a, xmlPullParser, "scaleX", 3, this.h);
        this.i = gwb.a(a, xmlPullParser, "scaleY", 4, this.i);
        this.j = gwb.a(a, xmlPullParser, "translateX", 6, this.j);
        this.k = gwb.a(a, xmlPullParser, "translateY", 7, this.k);
        String string = a.getString(0);
        if (string != null) {
            this.m = string;
        }
        this.c.reset();
        this.c.postTranslate(-this.f, -this.g);
        this.c.postScale(this.h, this.i);
        this.c.postRotate(this.e, 0.0f, 0.0f);
        this.c.postTranslate(this.j + this.f, this.k + this.g);
        a.recycle();
    }
}