package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;

public class cjl extends dbp implements cdf {
    private static final mjx<Integer, Integer> aj = new mjz().a(Integer.valueOf(0), Integer.valueOf(R$drawable.aX)).a(Integer.valueOf(1), Integer.valueOf(R$drawable.aT)).a(Integer.valueOf(2), Integer.valueOf(R$drawable.aR)).a(Integer.valueOf(3), Integer.valueOf(R$drawable.aP)).a(Integer.valueOf(4), Integer.valueOf(R$drawable.aV)).a(Integer.valueOf(5), Integer.valueOf(R$drawable.aZ)).a();
    cgq a;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (cgq) this.binder.a(cgq.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(new cjm(this));
    }

    public boolean a() {
        this.a.L();
        return true;
    }

    public boolean b() {
        this.a.Q();
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = a(layoutInflater, viewGroup);
        u().setStripEnabled(false);
        u().setDividerDrawable(ba.je);
        u().setLeftStripDrawable(ba.je);
        u().setRightStripDrawable(ba.je);
        ((TextView) a.findViewById(gwb.mq)).setOnClickListener(this.g);
        ((ImageView) a.findViewById(gwb.mr)).setColorFilter(getResources().getColor(gwb.mp), Mode.SRC_IN);
        return a;
    }

    protected int c() {
        return 10000;
    }

    protected int d() {
        return gwb.mt;
    }

    protected Integer e() {
        return Integer.valueOf(getResources().getColor(gwb.mp));
    }

    protected ImageView a(Context context, int i) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(gwb.ms, null);
        imageView.setImageDrawable(getResources().getDrawable(gwb.a((Integer) aj.get(Integer.valueOf(i)))));
        return imageView;
    }

    protected int q() {
        return getResources().getColor(gwb.mo);
    }

    protected boolean r() {
        return false;
    }

    protected void c(int i) {
        TabWidget u = u();
        for (int i2 = 0; i2 < u.getTabCount(); i2++) {
            View childTabViewAt = u.getChildTabViewAt(i2);
            if (childTabViewAt != null) {
                ImageView imageView = (ImageView) childTabViewAt.findViewWithTag("icon");
                int paddingLeft = imageView.getPaddingLeft();
                int paddingTop = imageView.getPaddingTop();
                int paddingRight = imageView.getPaddingRight();
                int paddingBottom = imageView.getPaddingBottom();
                if (i == i2) {
                    imageView.setColorFilter(getResources().getColor(gwb.mn), Mode.SRC_IN);
                    imageView.setBackgroundResource(ba.jf);
                } else {
                    imageView.setColorFilter(getResources().getColor(gwb.mp), Mode.SRC_IN);
                    imageView.setBackground(null);
                }
                imageView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
        }
    }
}
