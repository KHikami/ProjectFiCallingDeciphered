package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

final class cd {
    final Matrix f5038a = new Matrix();
    final ArrayList<Object> f5039b = new ArrayList();
    final Matrix f5040c = new Matrix();
    int f5041d;
    private float f5042e = 0.0f;
    private float f5043f = 0.0f;
    private float f5044g = 0.0f;
    private float f5045h = 1.0f;
    private float f5046i = 1.0f;
    private float f5047j = 0.0f;
    private float f5048k = 0.0f;
    private int[] f5049l;
    private String f5050m = null;

    public cd(cd cdVar, ky<String, Object> kyVar) {
        this.f5042e = cdVar.f5042e;
        this.f5043f = cdVar.f5043f;
        this.f5044g = cdVar.f5044g;
        this.f5045h = cdVar.f5045h;
        this.f5046i = cdVar.f5046i;
        this.f5047j = cdVar.f5047j;
        this.f5048k = cdVar.f5048k;
        this.f5049l = cdVar.f5049l;
        this.f5050m = cdVar.f5050m;
        this.f5041d = cdVar.f5041d;
        if (this.f5050m != null) {
            kyVar.put(this.f5050m, this);
        }
        this.f5040c.set(cdVar.f5040c);
        ArrayList arrayList = cdVar.f5039b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof cd) {
                this.f5039b.add(new cd((cd) obj, kyVar));
            } else {
                ce ccVar;
                if (obj instanceof cc) {
                    ccVar = new cc((cc) obj);
                } else if (obj instanceof cb) {
                    ccVar = new cb((cb) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f5039b.add(ccVar);
                if (ccVar.f4946n != null) {
                    kyVar.put(ccVar.f4946n, ccVar);
                }
            }
        }
    }

    public String m7248a() {
        return this.f5050m;
    }

    public void m7249a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
        TypedArray a = bz.m6570a(resources, theme, attributeSet, bs.f4301b);
        this.f5049l = null;
        this.f5042e = gwb.m1476a(a, xmlPullParser, "rotation", 5, this.f5042e);
        this.f5043f = a.getFloat(1, this.f5043f);
        this.f5044g = a.getFloat(2, this.f5044g);
        this.f5045h = gwb.m1476a(a, xmlPullParser, "scaleX", 3, this.f5045h);
        this.f5046i = gwb.m1476a(a, xmlPullParser, "scaleY", 4, this.f5046i);
        this.f5047j = gwb.m1476a(a, xmlPullParser, "translateX", 6, this.f5047j);
        this.f5048k = gwb.m1476a(a, xmlPullParser, "translateY", 7, this.f5048k);
        String string = a.getString(0);
        if (string != null) {
            this.f5050m = string;
        }
        this.f5040c.reset();
        this.f5040c.postTranslate(-this.f5043f, -this.f5044g);
        this.f5040c.postScale(this.f5045h, this.f5046i);
        this.f5040c.postRotate(this.f5042e, 0.0f, 0.0f);
        this.f5040c.postTranslate(this.f5047j + this.f5043f, this.f5048k + this.f5044g);
        a.recycle();
    }
}
