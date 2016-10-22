package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.telephony.TeleFeedback$FeedbackActivity;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* renamed from: gcx */
public final class gcx extends dq implements OnClickListener {
    private List<CharSequence> aj;

    public Dialog a(Bundle bundle) {
        this.aj = new LinkedList(Arrays.asList(getResources().getTextArray(r() ? gwb.uP : gwb.uQ)));
        if (q() == 1) {
            this.aj.remove(getResources().getText(gwb.vi));
        }
        if (getArguments().getBoolean("is_incoming")) {
            this.aj.remove(getResources().getText(gwb.vh));
        }
        CharSequence[] charSequenceArr = (CharSequence[]) this.aj.toArray(new CharSequence[this.aj.size()]);
        Builder builder = new Builder(getActivity());
        int i = r() ? gwb.vg : q() == 0 ? gwb.vl : gwb.vk;
        return builder.setTitle(i).setItems(charSequenceArr, this).setCancelable(false).setIcon(gwb.va).create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        if (getActivity() != null) {
            TeleFeedback$FeedbackActivity teleFeedback$FeedbackActivity = (TeleFeedback$FeedbackActivity) getActivity();
            String charSequence = ((CharSequence) this.aj.get(i)).toString();
            Resources resources = getResources();
            if (r()) {
                if (resources.getString(gwb.vf).equals(charSequence)) {
                    charSequence = null;
                }
                teleFeedback$FeedbackActivity.a(charSequence);
                return;
            }
            boolean z;
            if (resources.getString(gwb.vj).equals(charSequence)) {
                z = false;
            } else if (resources.getString(gwb.vi).equals(charSequence)) {
                str = charSequence;
                z = true;
            } else {
                str = charSequence;
                z = false;
            }
            teleFeedback$FeedbackActivity.a(str, z);
        }
    }

    private int q() {
        return getArguments().getInt("rating");
    }

    private boolean r() {
        return getArguments().getBoolean("should_show_audio_issues");
    }
}
