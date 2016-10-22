package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import bc;
import dyg;
import fwx;
import gqh;
import wi;

public class OtrModificationMessageListItemView extends LinearLayout implements dyg {
    private static int[][] c;
    private TextView a;
    private long b;

    public OtrModificationMessageListItemView(Context context) {
        this(context, null);
    }

    public OtrModificationMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        this.a = (TextView) findViewById(ba.fC);
    }

    static {
        r0 = new int[2][];
        r0[0] = new int[]{bc.sd, bc.sa, bc.sc, bc.sb};
        r0[1] = new int[]{bc.sh, bc.se, bc.sg, bc.sf};
        c = r0;
    }

    public void a(int i, fwx fwx, String str, boolean z) {
        int i2 = 0;
        int i3 = i == 1 ? 0 : 1;
        if (z) {
            switch (gqh.a[fwx.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    i2 = c[i3][0];
                    break;
                case wi.z /*3*/:
                    i2 = c[i3][1];
                    break;
                case wi.h /*4*/:
                    i2 = c[i3][2];
                    break;
            }
            if (i2 > 0) {
                this.a.setText(i2);
                return;
            }
            return;
        }
        this.a.setText(getResources().getString(c[i3][3], new Object[]{str}));
    }

    public void a(long j) {
        this.b = j;
    }

    public void c() {
        setContentDescription(this.a.getText());
    }

    public long a() {
        return this.b;
    }

    public View b() {
        return this;
    }
}
