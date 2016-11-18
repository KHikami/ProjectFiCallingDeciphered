package p000;

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
    private static final mjx<Integer, Integer> aj = new mjz().mo3837a(Integer.valueOf(0), Integer.valueOf(R$drawable.aX)).mo3837a(Integer.valueOf(1), Integer.valueOf(R$drawable.aT)).mo3837a(Integer.valueOf(2), Integer.valueOf(R$drawable.aR)).mo3837a(Integer.valueOf(3), Integer.valueOf(R$drawable.aP)).mo3837a(Integer.valueOf(4), Integer.valueOf(R$drawable.aV)).mo3837a(Integer.valueOf(5), Integer.valueOf(R$drawable.aZ)).mo3836a();
    cgq f5437a;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5437a = (cgq) this.binder.m25443a(cgq.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7782a(new cjm(this));
    }

    public boolean mo495a() {
        this.f5437a.mo828L();
        return true;
    }

    public boolean mo988b() {
        this.f5437a.mo831Q();
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = m7777a(layoutInflater, viewGroup);
        m7792u().setStripEnabled(false);
        m7792u().setDividerDrawable(ba.je);
        m7792u().setLeftStripDrawable(ba.je);
        m7792u().setRightStripDrawable(ba.je);
        ((TextView) a.findViewById(gwb.mq)).setOnClickListener(this.g);
        ((ImageView) a.findViewById(gwb.mr)).setColorFilter(getResources().getColor(gwb.mp), Mode.SRC_IN);
        return a;
    }

    protected int mo990c() {
        return 10000;
    }

    protected int mo992d() {
        return gwb.mt;
    }

    protected Integer mo993e() {
        return Integer.valueOf(getResources().getColor(gwb.mp));
    }

    protected ImageView mo989a(Context context, int i) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(gwb.ms, null);
        imageView.setImageDrawable(getResources().getDrawable(gwb.m1507a((Integer) aj.get(Integer.valueOf(i)))));
        return imageView;
    }

    protected int mo994q() {
        return getResources().getColor(gwb.mo);
    }

    protected boolean mo995r() {
        return false;
    }

    protected void mo991c(int i) {
        TabWidget u = m7792u();
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
