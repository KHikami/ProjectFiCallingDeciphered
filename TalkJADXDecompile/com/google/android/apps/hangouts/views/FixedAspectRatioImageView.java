package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import glk;
import gwb;

public class FixedAspectRatioImageView extends ImageView {
    int a;
    int b;
    int c;
    int d;

    public FixedAspectRatioImageView(Context context) {
        super(context);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, 16843040});
            this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(int i, int i2) {
        if (gwb.a(getContext(), "babel_crash_on_conversation_scroll_error", false)) {
            glk.c("Babel_Scroll", "FixedAspectRationImageView.setBitmapDimensions(" + i + ", " + i2 + ")", new Object[0]);
        }
        this.c = i;
        this.d = i2;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        super.setMaxHeight(i);
        this.b = i;
    }

    public void setMaxWidth(int i) {
        super.setMaxHeight(i);
        this.a = i;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null) {
            return;
        }
        if (this.c != bitmap.getWidth() || this.d != bitmap.getHeight()) {
            a(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            return;
        }
        if (this.c != drawable.getIntrinsicWidth() || this.d != drawable.getIntrinsicHeight()) {
            a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r9, int r10) {
        /*
        r8 = this;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = 0;
        r0 = r8.c;
        if (r0 == 0) goto L_0x00c3;
    L_0x0009:
        r0 = r8.d;
        if (r0 == 0) goto L_0x00c3;
    L_0x000d:
        r4 = android.view.View.MeasureSpec.getMode(r9);
        r1 = android.view.View.MeasureSpec.getSize(r9);
        r5 = android.view.View.MeasureSpec.getMode(r10);
        r2 = android.view.View.MeasureSpec.getSize(r10);
        if (r4 != r6) goto L_0x005d;
    L_0x001f:
        if (r5 != r6) goto L_0x005d;
    L_0x0021:
        r0 = r8.getContext();
        r4 = "babel_crash_on_conversation_scroll_error";
        r0 = gwb.a(r0, r4, r3);
        if (r0 == 0) goto L_0x0059;
    L_0x002d:
        r0 = "Babel_Scroll";
        r4 = new java.lang.StringBuilder;
        r5 = 73;
        r4.<init>(r5);
        r5 = "FixedAspectRationImageView.setMeasuredDimension(";
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r5 = ", ";
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r5 = ")";
        r4 = r4.append(r5);
        r4 = r4.toString();
        r3 = new java.lang.Object[r3];
        glk.c(r0, r4, r3);
    L_0x0059:
        r8.setMeasuredDimension(r1, r2);
        return;
    L_0x005d:
        if (r4 != r6) goto L_0x006b;
    L_0x005f:
        r0 = r8.d;
        r0 = r0 * r1;
        r4 = r8.c;
        r0 = r0 / r4;
        if (r5 != r7) goto L_0x0069;
    L_0x0067:
        if (r0 > r2) goto L_0x0021;
    L_0x0069:
        r2 = r0;
        goto L_0x0021;
    L_0x006b:
        if (r5 != r6) goto L_0x0093;
    L_0x006d:
        r0 = android.os.Build.VERSION.SDK_INT;
        r5 = 18;
        if (r0 >= r5) goto L_0x00c1;
    L_0x0073:
        r0 = r8.a;
        if (r0 <= 0) goto L_0x00bf;
    L_0x0077:
        r0 = r8.a;
        r0 = java.lang.Math.min(r0, r1);
    L_0x007d:
        r0 = java.lang.Math.min(r2, r0);
    L_0x0081:
        r2 = r8.c;
        r2 = r2 * r0;
        r5 = r8.d;
        r2 = r2 / r5;
        if (r4 != r7) goto L_0x00bd;
    L_0x0089:
        if (r2 <= r1) goto L_0x00bd;
    L_0x008b:
        r2 = r8.a;
        if (r1 <= r2) goto L_0x0069;
    L_0x008f:
        r1 = r8.a;
        r2 = r0;
        goto L_0x0021;
    L_0x0093:
        r0 = r8.a;
        if (r0 == 0) goto L_0x00bb;
    L_0x0097:
        r0 = r8.a;
        if (r1 <= r0) goto L_0x00bb;
    L_0x009b:
        r1 = r8.a;
        r0 = r1;
    L_0x009e:
        if (r5 == 0) goto L_0x00b9;
    L_0x00a0:
        r1 = r8.c;
        r4 = r8.d;
        if (r1 <= r4) goto L_0x00b0;
    L_0x00a6:
        r1 = r8.d;
        r1 = r1 * r0;
        r2 = r8.c;
        r2 = r1 / r2;
        r1 = r0;
        goto L_0x0021;
    L_0x00b0:
        r0 = r8.c;
        r0 = r0 * r2;
        r1 = r8.d;
        r1 = r0 / r1;
        goto L_0x0021;
    L_0x00b9:
        r2 = r0;
        goto L_0x00a0;
    L_0x00bb:
        r0 = r1;
        goto L_0x009e;
    L_0x00bd:
        r1 = r2;
        goto L_0x008b;
    L_0x00bf:
        r0 = r1;
        goto L_0x007d;
    L_0x00c1:
        r0 = r2;
        goto L_0x0081;
    L_0x00c3:
        r2 = r3;
        r1 = r3;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.views.FixedAspectRatioImageView.onMeasure(int, int):void");
    }
}
