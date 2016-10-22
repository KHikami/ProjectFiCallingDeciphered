import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import com.google.api.client.http.HttpStatusCodes;

public final class htm implements OnClickListener {
    final /* synthetic */ SelectedAccountNavigationView a;

    public htm(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    public void onClick(View view) {
        if (!(this.a.h == null || this.a.a == null || this.a.a.isEmpty())) {
            a aVar = this.a.h;
            this.a.a.get(0);
            if (aVar.m()) {
                return;
            }
        }
        SelectedAccountNavigationView selectedAccountNavigationView = this.a;
        if (selectedAccountNavigationView.a != null && selectedAccountNavigationView.a.size() != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            View view2 = selectedAccountNavigationView.d.s;
            View view3 = selectedAccountNavigationView.d.w;
            view2.bringToFront();
            hwn hwn = (hwn) selectedAccountNavigationView.a.get(0);
            if (selectedAccountNavigationView.f == 0.0f) {
                selectedAccountNavigationView.f = (float) selectedAccountNavigationView.d.w.getWidth();
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view3.getLayoutParams();
            Animator ofFloat = ObjectAnimator.ofFloat(selectedAccountNavigationView.d.p, "alpha", new float[]{1.0f, 0.0f});
            int marginStart = selectedAccountNavigationView.i ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
            float f = selectedAccountNavigationView.e / selectedAccountNavigationView.f;
            float f2 = (selectedAccountNavigationView.e - (selectedAccountNavigationView.f - ((float) marginLayoutParams.bottomMargin))) * 0.5f;
            float left = ((float) (selectedAccountNavigationView.d.p.getLeft() - (marginStart + view2.getLeft()))) - ((selectedAccountNavigationView.f - selectedAccountNavigationView.e) * 0.5f);
            Builder play = animatorSet.play(ofFloat);
            Animator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{left});
            ofFloat2.setDuration(450);
            Animator ofFloat3 = ObjectAnimator.ofFloat(view2, "translationY", new float[]{f2});
            ofFloat3.setDuration(450);
            Animator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{f});
            ofFloat4.setDuration(300);
            Animator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{f});
            ofFloat5.setDuration(300);
            play.with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
            View view4 = selectedAccountNavigationView.d.D;
            ImageView imageView = selectedAccountNavigationView.d.G;
            if (imageView != null) {
                imageView.setImageDrawable(selectedAccountNavigationView.d.v.getDrawable());
            }
            if (view4 != null) {
                view4.setVisibility(0);
                ofFloat3 = ObjectAnimator.ofFloat(view4, "alpha", new float[]{1.0f});
                ofFloat3.setDuration(450);
                ofFloat5 = ObjectAnimator.ofFloat(view4, "scaleY", new float[]{1.0f});
                ofFloat5.setDuration(450);
                ofFloat2 = ObjectAnimator.ofFloat(view4, "scaleX", new float[]{1.0f});
                ofFloat2.setDuration(450);
                play.with(ofFloat3).with(ofFloat2).with(ofFloat5);
            }
            if (!(selectedAccountNavigationView.d.y == null || selectedAccountNavigationView.d.m == null)) {
                selectedAccountNavigationView.d.y.setAlpha(0.0f);
                selectedAccountNavigationView.d.y.setTranslationX(0.0f);
                selectedAccountNavigationView.a(hwn, play, 150, 0);
            }
            if (selectedAccountNavigationView.d.u != null) {
                ofFloat3 = ObjectAnimator.ofFloat(selectedAccountNavigationView.d.u, "alpha", new float[]{0.0f});
                ofFloat3.setDuration(300);
                play.with(ofFloat3);
            }
            if (selectedAccountNavigationView.d.C != null) {
                selectedAccountNavigationView.a(selectedAccountNavigationView.d, selectedAccountNavigationView.d.C, hwn);
                selectedAccountNavigationView.d.C.setVisibility(0);
                Animator ofFloat6 = ObjectAnimator.ofFloat(selectedAccountNavigationView.d.C, "alpha", new float[]{1.0f});
                ofFloat6.setDuration(300);
                play.with(ofFloat6);
            }
            animatorSet.addListener(new htj(selectedAccountNavigationView));
            hwn hwn2 = selectedAccountNavigationView.b;
            selectedAccountNavigationView.b = (hwn) selectedAccountNavigationView.a.get(0);
            selectedAccountNavigationView.a.add(0, hwn2);
            selectedAccountNavigationView.a.remove(1);
            selectedAccountNavigationView.b(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
            animatorSet.setInterpolator(selectedAccountNavigationView.j);
            selectedAccountNavigationView.k = animatorSet;
            selectedAccountNavigationView.k.start();
        }
    }
}
