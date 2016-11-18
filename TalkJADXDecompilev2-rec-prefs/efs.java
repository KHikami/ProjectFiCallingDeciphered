package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.List;

public class efs {
    final /* synthetic */ EditParticipantsView f11382a;

    public void m13814a() {
        if (this.f11382a.f6517d.getChildCount() > 1) {
            View childAt = this.f11382a.f6517d.getChildAt(this.f11382a.f6517d.getChildCount() - 2);
            bcn bcn = (bcn) childAt.getTag();
            if (bcn != null) {
                boolean z;
                childAt.setTag(null);
                this.f11382a.f6515b.m4868b(bcn);
                ViewGroup viewGroup = this.f11382a;
                if (viewGroup.f6520g == null || gwb.m1923a(viewGroup.f6520g, bnc.GROUP_CONVERSATIONS)) {
                    z = true;
                } else {
                    z = false;
                }
                List c = viewGroup.f6515b.m4871c();
                List d;
                if (viewGroup.f6515b.m4877f() == bcj.UPGRADE_TO_GROUPCHAT) {
                    d = viewGroup.f6515b.m4874d();
                } else {
                    d = c;
                }
                int i = 0;
                while (i < viewGroup.f6517d.getChildCount() - 1) {
                    View childAt2 = viewGroup.f6517d.getChildAt(i);
                    Object tag = childAt2.getTag();
                    if (r5.contains(tag)) {
                        viewGroup.m8767a(childAt2, (bcn) tag);
                        r5.remove(tag);
                    } else if (z) {
                        childAt2.setOnClickListener(null);
                        TextView textView = (TextView) childAt2.findViewById(bm.af);
                        ((AvatarView) childAt2.findViewById(bm.ac)).setVisibility(4);
                        textView.setVisibility(4);
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(EditParticipantsView.SCALE_X, new float[]{1.0f, 0.0f});
                        ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(childAt2, new PropertyValuesHolder[]{ofFloat});
                        ofPropertyValuesHolder.setInterpolator(new bbx(bcb.f2972a));
                        ofPropertyValuesHolder.setDuration(200);
                        ofPropertyValuesHolder.addListener(viewGroup.f6522i);
                        ofPropertyValuesHolder.start();
                    } else {
                        viewGroup.f6517d.removeView(childAt2);
                        i--;
                    }
                    i++;
                }
                if (!r5.isEmpty()) {
                    viewGroup.f6518e.setText("");
                }
                for (bcn bcn2 : r5) {
                    OnClickListener egb = new egb(viewGroup, bcn2);
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(gwb.sD, viewGroup, false);
                    inflate.setOnClickListener(new egc(viewGroup, egb));
                    inflate.setScaleX(0.0f);
                    viewGroup.f6517d.addView(inflate, viewGroup.f6517d.getChildCount() - 1);
                    viewGroup.m8767a(inflate, bcn2);
                    EditParticipantsView.m8765a(inflate);
                }
                if (gld.m17937a(viewGroup.getContext()) || viewGroup.f6517d.getChildCount() <= 1) {
                    viewGroup.f6518e.setHint(gwb.tj);
                } else {
                    viewGroup.f6518e.setHint("");
                }
                viewGroup.requestLayout();
            }
        }
    }

    public efs(EditParticipantsView editParticipantsView) {
        this.f11382a = editParticipantsView;
    }
}
