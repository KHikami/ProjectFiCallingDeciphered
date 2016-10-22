package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: aen */
public abstract class aen extends aaw implements aep {
    boolean B;
    private boolean[] d;

    public aen(Context context) {
        super(context);
    }

    public int c() {
        return this.B ? this.b.size() : 0;
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        if (!c(i)) {
            return null;
        }
        View view2;
        if (view != null) {
            Integer num = (Integer) view.getTag();
            if (num != null && num.intValue() == 0) {
                view2 = view;
                if (view2 == null) {
                    view2 = a(this.a, viewGroup);
                    view2.setTag(Integer.valueOf(0));
                    view2.setFocusable(false);
                    view2.setEnabled(false);
                }
                d(i);
                a(view2, i);
                view2.setLayoutDirection(viewGroup.getLayoutDirection());
                return view2;
            }
        }
        view2 = null;
        if (view2 == null) {
            view2 = a(this.a, viewGroup);
            view2.setTag(Integer.valueOf(0));
            view2.setFocusable(false);
            view2.setEnabled(false);
        }
        d(i);
        a(view2, i);
        view2.setLayoutDirection(viewGroup.getLayoutDirection());
        return view2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.android.contacts.common.list.PinnedHeaderListView r13) {
        /*
        r12 = this;
        r6 = -1;
        r1 = 1;
        r2 = 0;
        r0 = r12.B;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r0 = r12.b;
        r5 = r0.size();
        r0 = r12.d;
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r0 = r12.d;
        r0 = r0.length;
        if (r0 == r5) goto L_0x001b;
    L_0x0017:
        r0 = new boolean[r5];
        r12.d = r0;
    L_0x001b:
        r3 = r2;
    L_0x001c:
        if (r3 >= r5) goto L_0x003e;
    L_0x001e:
        r0 = r12.B;
        if (r0 == 0) goto L_0x003c;
    L_0x0022:
        r0 = r12.c(r3);
        if (r0 == 0) goto L_0x003c;
    L_0x0028:
        r0 = r12.e(r3);
        if (r0 != 0) goto L_0x003c;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        r4 = r12.d;
        r4[r3] = r0;
        if (r0 != 0) goto L_0x0038;
    L_0x0035:
        r13.a(r3, r1);
    L_0x0038:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x001c;
    L_0x003c:
        r0 = r2;
        goto L_0x002f;
    L_0x003e:
        r7 = r13.getHeaderViewsCount();
        r4 = r2;
        r0 = r2;
        r3 = r6;
    L_0x0045:
        if (r4 >= r5) goto L_0x0070;
    L_0x0047:
        r8 = r12.d;
        r8 = r8[r4];
        if (r8 == 0) goto L_0x006d;
    L_0x004d:
        r8 = r13.c(r0);
        r8 = r8 - r7;
        r8 = r12.f(r8);
        if (r4 > r8) goto L_0x0070;
    L_0x0058:
        r13.b(r4);
        r3 = r13.a;
        r3 = r3[r4];
        r3.b = r1;
        r3.c = r0;
        r3.f = r2;
        r3.g = r2;
        r3 = r13.a(r4);
        r0 = r0 + r3;
        r3 = r4;
    L_0x006d:
        r4 = r4 + 1;
        goto L_0x0045;
    L_0x0070:
        r4 = r13.getHeight();
        r0 = r5;
    L_0x0075:
        r0 = r0 + -1;
        if (r0 <= r3) goto L_0x00b7;
    L_0x0079:
        r8 = r12.d;
        r8 = r8[r0];
        if (r8 == 0) goto L_0x0075;
    L_0x007f:
        r8 = r4 - r2;
        r8 = r13.c(r8);
        r8 = r8 - r7;
        if (r8 < 0) goto L_0x00b7;
    L_0x0088:
        r8 = r8 + -1;
        r8 = r12.f(r8);
        if (r8 == r6) goto L_0x00b7;
    L_0x0090:
        if (r0 <= r8) goto L_0x00b7;
    L_0x0092:
        r5 = r13.a(r0);
        r2 = r2 + r5;
        r5 = r4 - r2;
        r13.b(r0);
        r8 = r13.a;
        r8 = r8[r0];
        r8.f = r1;
        r9 = r8.g;
        if (r9 == 0) goto L_0x00b2;
    L_0x00a6:
        r10 = r13.c;
        r8.k = r10;
        r9 = r8.c;
        r8.i = r9;
        r8.j = r5;
    L_0x00b0:
        r5 = r0;
        goto L_0x0075;
    L_0x00b2:
        r8.b = r1;
        r8.c = r5;
        goto L_0x00b0;
    L_0x00b7:
        r0 = r3 + 1;
    L_0x00b9:
        if (r0 >= r5) goto L_0x0007;
    L_0x00bb:
        r1 = r12.d;
        r1 = r1[r0];
        if (r1 == 0) goto L_0x00c8;
    L_0x00c1:
        r1 = r12.e(r0);
        r13.a(r0, r1);
    L_0x00c8:
        r0 = r0 + 1;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: aen.a(com.android.contacts.common.list.PinnedHeaderListView):void");
    }

    public final int m(int i) {
        return g(i);
    }
}
