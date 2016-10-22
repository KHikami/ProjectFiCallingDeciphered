import android.animation.Animator;
import android.animation.AnimatorSet;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fce implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ QuickReplyActivity b;

    public fce(QuickReplyActivity quickReplyActivity, EditText editText) {
        this.b = quickReplyActivity;
        this.a = editText;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = this.a.getText().toString().trim().length() > 0;
        QuickReplyActivity quickReplyActivity = this.b;
        if (quickReplyActivity.o != z) {
            quickReplyActivity.o = z;
            quickReplyActivity.p.setClickable(z);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator a = gwb.a(1.0f, 0.0f, 1.0f, 0.0f);
            a.setStartDelay(0);
            a.setDuration(150);
            a.setInterpolator(gwb.p());
            a.addListener(new fch(quickReplyActivity, z));
            Animator a2 = gwb.a(0.0f, 1.0f, 0.0f, 1.0f);
            a2.setStartDelay(0);
            a2.setDuration(150);
            a2.setInterpolator(gwb.p());
            animatorSet.playSequentially(new Animator[]{a, a2});
            animatorSet.setTarget(quickReplyActivity.q);
            animatorSet.start();
        }
        if (z && !this.b.t) {
            this.b.t = true;
            QuickReplyActivity quickReplyActivity2 = this.b;
            if (quickReplyActivity2.u == 1) {
                quickReplyActivity2.n.a(new fko(quickReplyActivity2.r, quickReplyActivity2.s, 1));
            }
        }
    }

    public void afterTextChanged(Editable editable) {
    }
}
