package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ba;
import gwb;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import ke;
import lk;

public class ConversationNameView extends View {
    private final Paint a;
    private String b;
    private String[] c;
    private List<String> d;
    private final int e;
    private final int f;
    private boolean g;
    private boolean h;

    public ConversationNameView(Context context) {
        this(context, null);
    }

    public ConversationNameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = "";
        this.c = new String[0];
        this.d = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{gwb.dB, gwb.dA, gwb.dC, gwb.dy});
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 36);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 28);
        this.a.setTextSize((float) this.e);
        this.a.setColor(obtainStyledAttributes.getColor(2, -16777216));
        this.a.setFlags(this.a.getFlags() | 1);
        this.g = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
    }

    public void a(List<String> list) {
        this.d = list;
        invalidate();
    }

    public void a(String str) {
        if (!str.startsWith("L") && !str.startsWith("T")) {
            throw new IllegalArgumentException("the parameter to setText must be the output of ConversationNameView.title() or ConversationNameView.nameList()");
        } else if (!TextUtils.equals(this.b, str)) {
            this.b = str;
            Object substring = str.substring(1);
            setContentDescription(substring);
            if (str.startsWith("T")) {
                this.c = new String[]{substring};
            } else {
                this.c = substring.split(", ");
            }
            requestLayout();
        }
    }

    private static int a(Paint paint, String[] strArr, int i) {
        float measureText = paint.measureText(", ");
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            i2 = (int) (((float) i2) + paint.measureText(strArr[i3]));
            if (i3 < strArr.length - 1) {
                i2 = (int) (((float) i2) + measureText);
            }
            if (i2 > i) {
                return 0;
            }
        }
        return i2;
    }

    List<lk<Integer, Integer>> b(String str) {
        if (this.d == null || this.d.size() == 0) {
            return null;
        }
        BitSet bitSet = new BitSet(str.length());
        for (String str2 : this.d) {
            int i;
            if (!TextUtils.isEmpty(str2)) {
                i = 0;
                while (true) {
                    int indexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2.toUpperCase(Locale.getDefault()), i);
                    if (indexOf == -1) {
                        break;
                    }
                    i = str2.length() + indexOf;
                    bitSet.set(indexOf, i);
                }
            }
        }
        if (bitSet.isEmpty()) {
            return null;
        }
        List<lk<Integer, Integer>> arrayList = new ArrayList();
        i = bitSet.nextSetBit(0);
        while (i != -1) {
            int nextClearBit = bitSet.nextClearBit(i);
            arrayList.add(new lk(Integer.valueOf(i), Integer.valueOf(nextClearBit)));
            i = bitSet.nextSetBit(nextClearBit);
        }
        return arrayList;
    }

    float a(String str, Canvas canvas, int i, float f, float f2, boolean z, List<lk<Integer, Integer>> list) {
        float f3;
        boolean z2 = list != null && list.size() > 0;
        ba.b(z2, (Object) " hightlight positions can't be empty");
        int i2 = 0;
        for (lk lkVar : list) {
            int a = gwb.a((Integer) lkVar.a);
            int a2 = gwb.a((Integer) lkVar.b);
            String substring = str.substring(i2, a);
            String substring2 = str.substring(a, a2);
            float measureText = this.a.measureText(substring);
            canvas.drawText(substring, z ? ((float) i) - (f + measureText) : f, f2, this.a);
            measureText += f;
            i2 += substring.length();
            this.a.setFakeBoldText(true);
            float measureText2 = this.a.measureText(substring2);
            if (z) {
                f3 = ((float) i) - (measureText + measureText2);
            } else {
                f3 = measureText;
            }
            canvas.drawText(substring2, f3, f2, this.a);
            f = measureText + measureText2;
            a2 = substring2.length() + i2;
            this.a.setFakeBoldText(false);
            i2 = a2;
        }
        if (i2 >= str.length()) {
            return f;
        }
        String substring3 = str.substring(i2, str.length());
        float measureText3 = this.a.measureText(substring3);
        if (z) {
            f3 = ((float) i) - (f + measureText3);
        } else {
            f3 = f;
        }
        canvas.drawText(substring3, f3, f2, this.a);
        return f + measureText3;
    }

    protected void onDraw(Canvas canvas) {
        Object obj;
        String str;
        float textSize;
        float measureText;
        float measureText2;
        float fontSpacing;
        float f;
        int i;
        Object obj2;
        float f2;
        Object obj3;
        String str2;
        float measureText3;
        List b;
        float a;
        Paint paint;
        float measureText4;
        int length;
        String quantityString;
        Object obj4;
        boolean a2 = ke.a().a(!this.b.isEmpty() ? this.b.substring(1, this.b.length()) : this.b);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        this.a.setTextSize(this.h ? (float) this.f : (float) this.e);
        Object obj5 = null;
        if (this.g && this.c.length > 1) {
            obj5 = a(this.a, this.c, measuredWidth) == 0 ? 1 : null;
            if (obj5 != null) {
                this.a.setTextSize((float) this.f);
                if (a(this.a, this.c, measuredWidth) != 0) {
                    obj = null;
                    str = a2 ? " ," : ", ";
                    textSize = this.a.getTextSize() - this.a.descent();
                    measureText = this.a.measureText(" and 99 others");
                    measureText2 = this.a.measureText(str);
                    fontSpacing = this.a.getFontSpacing();
                    f = 0.0f;
                    if (obj == null) {
                        textSize += ((((float) measuredHeight) - textSize) - fontSpacing) / 2.0f;
                    } else {
                        textSize = (textSize / 2.0f) + ((float) (measuredHeight / 2));
                    }
                    i = 0;
                    obj2 = 1;
                    f2 = textSize;
                    while (i < this.c.length) {
                        float f3;
                        obj3 = i != this.c.length + -1 ? 1 : null;
                        str2 = this.c[i];
                        measureText3 = this.a.measureText(str2, 0, str2.length());
                        f3 = f + measureText3;
                        if (obj3 == null) {
                            textSize = 0.0f;
                        } else {
                            textSize = measureText2;
                        }
                        f3 += textSize;
                        textSize = (float) measuredWidth;
                        if (obj3 == null && (obj == null || obj2 == null)) {
                            textSize -= measureText;
                        }
                        if (f3 > textSize) {
                            new Object[1][0] = Integer.valueOf(this.a.getColor());
                            b = b(str2);
                            if (b == null) {
                                a = a(str2, canvas, measuredWidth, f, f2, a2, b);
                            } else {
                                if (a2) {
                                    textSize = f;
                                } else {
                                    textSize = ((float) measuredWidth) - (f + measureText3);
                                }
                                canvas.drawText(str2, textSize, f2, this.a);
                                a = f + measureText3;
                            }
                        } else if (f != 0.0f) {
                            if (i < this.c.length) {
                                textSize -= measureText2;
                            }
                            paint = this.a;
                            if (paint.measureText(str2) > textSize) {
                                measureText4 = textSize - ((float) ((int) paint.measureText("\u2026")));
                                length = str2.length();
                                while (length > 0) {
                                    length -= Character.charCount(Character.codePointBefore(str2, length));
                                    if (paint.measureText(str2, 0, length) <= measureText4) {
                                        break;
                                    }
                                }
                                str2 = String.format(Locale.getDefault(), "%s%s", new Object[]{str2.substring(0, length), "\u2026"});
                            }
                            b = b(str2);
                            if (b == null) {
                                a = a(str2, canvas, measuredWidth, f, f2, a2, b);
                            } else {
                                if (a2) {
                                    textSize = f;
                                } else {
                                    textSize = ((float) measuredWidth) - (measureText3 + f);
                                }
                                canvas.drawText(str2, textSize, f2, this.a);
                                a = f + this.a.measureText(str2);
                            }
                        } else if (obj2 != null || obj == null) {
                            quantityString = getResources().getQuantityString(gwb.hW, this.c.length - i, new Object[]{Integer.valueOf(this.c.length - i)});
                            if (a2) {
                                canvas.drawText(quantityString, f, f2, this.a);
                                return;
                            } else {
                                canvas.drawText(quantityString, ((float) measuredWidth) - (this.a.measureText(quantityString) + f), f2, this.a);
                                return;
                            }
                        } else {
                            f = 0.0f;
                            f2 += fontSpacing;
                            i--;
                            obj4 = null;
                            i++;
                            obj2 = obj4;
                        }
                        if (obj3 != null) {
                            if (a2) {
                                textSize = a;
                            } else {
                                textSize = ((float) measuredWidth) - (a + measureText2);
                            }
                            canvas.drawText(str, textSize, f2, this.a);
                            f = a + measureText2;
                            obj4 = obj2;
                        } else {
                            f = a;
                            obj4 = obj2;
                        }
                        i++;
                        obj2 = obj4;
                    }
                }
            }
        }
        obj = obj5;
        if (a2) {
        }
        textSize = this.a.getTextSize() - this.a.descent();
        measureText = this.a.measureText(" and 99 others");
        measureText2 = this.a.measureText(str);
        fontSpacing = this.a.getFontSpacing();
        f = 0.0f;
        if (obj == null) {
            textSize = (textSize / 2.0f) + ((float) (measuredHeight / 2));
        } else {
            textSize += ((((float) measuredHeight) - textSize) - fontSpacing) / 2.0f;
        }
        i = 0;
        obj2 = 1;
        f2 = textSize;
        while (i < this.c.length) {
            if (i != this.c.length + -1) {
            }
            str2 = this.c[i];
            measureText3 = this.a.measureText(str2, 0, str2.length());
            f3 = f + measureText3;
            if (obj3 == null) {
                textSize = measureText2;
            } else {
                textSize = 0.0f;
            }
            f3 += textSize;
            textSize = (float) measuredWidth;
            textSize -= measureText;
            if (f3 > textSize) {
                new Object[1][0] = Integer.valueOf(this.a.getColor());
                b = b(str2);
                if (b == null) {
                    if (a2) {
                        textSize = f;
                    } else {
                        textSize = ((float) measuredWidth) - (f + measureText3);
                    }
                    canvas.drawText(str2, textSize, f2, this.a);
                    a = f + measureText3;
                } else {
                    a = a(str2, canvas, measuredWidth, f, f2, a2, b);
                }
            } else if (f != 0.0f) {
                if (obj2 != null) {
                }
                quantityString = getResources().getQuantityString(gwb.hW, this.c.length - i, new Object[]{Integer.valueOf(this.c.length - i)});
                if (a2) {
                    canvas.drawText(quantityString, f, f2, this.a);
                    return;
                } else {
                    canvas.drawText(quantityString, ((float) measuredWidth) - (this.a.measureText(quantityString) + f), f2, this.a);
                    return;
                }
            } else {
                if (i < this.c.length) {
                    textSize -= measureText2;
                }
                paint = this.a;
                if (paint.measureText(str2) > textSize) {
                    measureText4 = textSize - ((float) ((int) paint.measureText("\u2026")));
                    length = str2.length();
                    while (length > 0) {
                        length -= Character.charCount(Character.codePointBefore(str2, length));
                        if (paint.measureText(str2, 0, length) <= measureText4) {
                            break;
                            str2 = String.format(Locale.getDefault(), "%s%s", new Object[]{str2.substring(0, length), "\u2026"});
                        }
                    }
                    str2 = String.format(Locale.getDefault(), "%s%s", new Object[]{str2.substring(0, length), "\u2026"});
                }
                b = b(str2);
                if (b == null) {
                    if (a2) {
                        textSize = f;
                    } else {
                        textSize = ((float) measuredWidth) - (measureText3 + f);
                    }
                    canvas.drawText(str2, textSize, f2, this.a);
                    a = f + this.a.measureText(str2);
                } else {
                    a = a(str2, canvas, measuredWidth, f, f2, a2, b);
                }
            }
            if (obj3 != null) {
                f = a;
                obj4 = obj2;
            } else {
                if (a2) {
                    textSize = a;
                } else {
                    textSize = ((float) measuredWidth) - (a + measureText2);
                }
                canvas.drawText(str, textSize, f2, this.a);
                f = a + measureText2;
                obj4 = obj2;
            }
            i++;
            obj2 = obj4;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r5, int r6) {
        /*
        r4 = this;
        super.onMeasure(r5, r6);
        r1 = r4.getMeasuredWidth();
        r0 = android.view.View.MeasureSpec.getMode(r5);
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r2) goto L_0x0031;
    L_0x000f:
        r0 = r4.a;
        r2 = r4.c;
        r3 = android.view.View.MeasureSpec.getSize(r5);
        r0 = a(r0, r2, r3);
        if (r0 <= 0) goto L_0x0031;
    L_0x001d:
        r1 = r4.g;
        if (r1 != 0) goto L_0x0030;
    L_0x0021:
        r1 = r4.a;
        r1 = r1.getFontSpacing();
        r2 = (double) r1;
        r2 = java.lang.Math.ceil(r2);
        r1 = (int) r2;
        r4.setMeasuredDimension(r0, r1);
    L_0x0030:
        return;
    L_0x0031:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.views.ConversationNameView.onMeasure(int, int):void");
    }

    public void a(Typeface typeface, int i) {
        boolean z = false;
        if (i > 0) {
            float f;
            Typeface defaultFromStyle = Typeface.defaultFromStyle(i);
            a(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            Paint paint = this.a;
            if ((style & 1) != 0) {
                z = true;
            }
            paint.setFakeBoldText(z);
            Paint paint2 = this.a;
            if ((style & 2) != 0) {
                f = -0.25f;
            } else {
                f = 0.0f;
            }
            paint2.setTextSkewX(f);
            return;
        }
        this.a.setFakeBoldText(false);
        this.a.setTextSkewX(0.0f);
        a(null);
    }

    private void a(Typeface typeface) {
        if (this.a.getTypeface() != typeface) {
            this.a.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void a(int i) {
        new Object[1][0] = Integer.valueOf(i);
        if (this.a.getColor() != i) {
            this.a.setColor(i);
            invalidate();
        }
    }

    public CharSequence getContentDescription() {
        return gwb.a(this.c, 3);
    }

    public int getBaseline() {
        return (int) ((((float) getMeasuredHeight()) / 2.0f) + ((this.a.getTextSize() - this.a.descent()) / 2.0f));
    }

    public static String c(String str) {
        String valueOf = String.valueOf("T");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
