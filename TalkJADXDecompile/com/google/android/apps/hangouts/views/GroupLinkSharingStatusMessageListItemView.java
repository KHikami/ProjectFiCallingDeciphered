package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import bc;
import dyg;
import fwx;
import gom;
import wi;

public class GroupLinkSharingStatusMessageListItemView extends LinearLayout implements dyg {
    private TextView a;
    private long b;

    public GroupLinkSharingStatusMessageListItemView(Context context) {
        this(context, null);
    }

    public GroupLinkSharingStatusMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(ba.fC);
    }

    public void a(int i, fwx fwx, String str, boolean z) {
        ImageView imageView = (ImageView) findViewById(ba.ct);
        ImageView imageView2 = (ImageView) findViewById(ba.cr);
        int i2;
        int i3;
        if (z) {
            switch (gom.a[fwx.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    if (i != 1) {
                        if (i != 2) {
                            i2 = bc.rZ;
                            imageView.setVisibility(8);
                            imageView2.setVisibility(0);
                            i3 = i2;
                            break;
                        }
                        i2 = bc.rr;
                        imageView.setVisibility(0);
                        imageView2.setVisibility(8);
                        i3 = i2;
                        break;
                    }
                    i2 = bc.rv;
                    imageView.setVisibility(8);
                    imageView2.setVisibility(0);
                    i3 = i2;
                    break;
                case wi.z /*3*/:
                    if (i != 1) {
                        if (i != 2) {
                            i2 = bc.rW;
                            imageView.setVisibility(8);
                            imageView2.setVisibility(0);
                            i3 = i2;
                            break;
                        }
                        i2 = bc.rs;
                        imageView.setVisibility(0);
                        imageView2.setVisibility(8);
                        i3 = i2;
                        break;
                    }
                    i2 = bc.rw;
                    imageView.setVisibility(8);
                    imageView2.setVisibility(0);
                    i3 = i2;
                    break;
                case wi.h /*4*/:
                    if (i != 1) {
                        if (i != 2) {
                            i2 = bc.rY;
                            imageView.setVisibility(8);
                            imageView2.setVisibility(0);
                            i3 = i2;
                            break;
                        }
                        i2 = bc.rq;
                        imageView.setVisibility(0);
                        imageView2.setVisibility(8);
                        i3 = i2;
                        break;
                    }
                    i2 = bc.ru;
                    imageView.setVisibility(8);
                    imageView2.setVisibility(0);
                    i3 = i2;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 > 0) {
                this.a.setText(i3);
                return;
            }
            return;
        }
        if (i == 1) {
            i2 = bc.rx;
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            i3 = i2;
        } else if (i == 2) {
            i2 = bc.rt;
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            i3 = i2;
        } else {
            i2 = bc.rX;
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            i3 = i2;
        }
        this.a.setText(getResources().getString(i3, new Object[]{str}));
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
