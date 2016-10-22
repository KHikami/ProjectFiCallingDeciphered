package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ba;

public class MessageStatusView extends FrameLayout {
    View a;
    TextView b;
    TextView c;
    public ScalingTextView d;
    ImageView e;
    public View f;
    ScalingTextView g;
    View h;
    private float i;

    public MessageStatusView(Context context) {
        super(context);
        this.i = 1.0f;
    }

    public MessageStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 1.0f;
    }

    public MessageStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 1.0f;
    }

    public void onFinishInflate() {
        this.a = findViewById(ba.R);
        this.d = (ScalingTextView) this.a.findViewById(ba.fJ);
        this.b = (TextView) this.a.findViewById(ba.dy);
        this.c = (TextView) this.a.findViewById(ba.fc);
        this.e = (ImageView) this.a.findViewById(ba.fl);
        this.f = findViewById(ba.fa);
        this.g = (ScalingTextView) this.f.findViewById(ba.fb);
        this.h = findViewById(ba.fm);
    }

    public void a(float f) {
        this.i = f;
        setAlpha(f);
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), (int) (((float) getMeasuredHeight()) * this.i));
    }
}
