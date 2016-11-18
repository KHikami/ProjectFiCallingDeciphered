package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;

public final class xe extends MenuInflater {
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d = this.c;
    Context e;
    Object f;

    static {
        Class[] clsArr = new Class[]{Context.class};
        a = clsArr;
        b = clsArr;
    }

    public xe(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
    }

    public void inflate(int i, Menu menu) {
        if (menu instanceof jt) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.e.getResources().getLayout(i);
                a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = 0;
        r1 = 1;
        r6 = 0;
        r7 = new xg;
        r7.<init>(r10, r13);
        r0 = r11.getEventType();
    L_0x000c:
        r2 = 2;
        if (r0 != r2) goto L_0x0046;
    L_0x000f:
        r0 = r11.getName();
        r2 = "menu";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x001b:
        r0 = r11.next();
    L_0x001f:
        r2 = r4;
        r5 = r6;
        r3 = r0;
        r0 = r6;
    L_0x0023:
        if (r0 != 0) goto L_0x00d7;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x00cf;
            case 2: goto L_0x004d;
            case 3: goto L_0x0081;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5;
    L_0x0029:
        r5 = r11.next();
        r9 = r3;
        r3 = r5;
        r5 = r9;
        goto L_0x0023;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "Expecting menu, got ";
        r2.<init>(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0046:
        r0 = r11.next();
        if (r0 != r1) goto L_0x000c;
    L_0x004c:
        goto L_0x001f;
    L_0x004d:
        if (r5 != 0) goto L_0x0028;
    L_0x004f:
        r3 = r11.getName();
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0060;
    L_0x005b:
        r7.a(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0060:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x006d;
    L_0x0068:
        r7.b(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x006d:
        r8 = "menu";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x007e;
    L_0x0075:
        r3 = r7.c();
        r10.a(r11, r12, r3);
        r3 = r5;
        goto L_0x0029;
    L_0x007e:
        r2 = r3;
        r3 = r1;
        goto L_0x0029;
    L_0x0081:
        r3 = r11.getName();
        if (r5 == 0) goto L_0x0090;
    L_0x0087:
        r8 = r3.equals(r2);
        if (r8 == 0) goto L_0x0090;
    L_0x008d:
        r2 = r4;
        r3 = r6;
        goto L_0x0029;
    L_0x0090:
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x009d;
    L_0x0098:
        r7.a();
        r3 = r5;
        goto L_0x0029;
    L_0x009d:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00c3;
    L_0x00a5:
        r3 = r7.d();
        if (r3 != 0) goto L_0x0028;
    L_0x00ab:
        r3 = r7.a;
        if (r3 == 0) goto L_0x00bd;
    L_0x00af:
        r3 = r7.a;
        r3 = r3.e();
        if (r3 == 0) goto L_0x00bd;
    L_0x00b7:
        r7.c();
        r3 = r5;
        goto L_0x0029;
    L_0x00bd:
        r7.b();
        r3 = r5;
        goto L_0x0029;
    L_0x00c3:
        r8 = "menu";
        r3 = r3.equals(r8);
        if (r3 == 0) goto L_0x0028;
    L_0x00cb:
        r0 = r1;
        r3 = r5;
        goto L_0x0029;
    L_0x00cf:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x00d7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object a(Object obj) {
        Object obj2 = obj;
        while (!(obj2 instanceof Activity) && (obj2 instanceof ContextWrapper)) {
            obj2 = ((ContextWrapper) obj2).getBaseContext();
        }
        return obj2;
    }
}
