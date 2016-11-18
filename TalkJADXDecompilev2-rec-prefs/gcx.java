package p000;

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

public final class gcx extends dq implements OnClickListener {
    private List<CharSequence> aj;

    public Dialog mo792a(Bundle bundle) {
        this.aj = new LinkedList(Arrays.asList(getResources().getTextArray(m16997r() ? gwb.uP : gwb.uQ)));
        if (m16996q() == 1) {
            this.aj.remove(getResources().getText(gwb.vi));
        }
        if (getArguments().getBoolean("is_incoming")) {
            this.aj.remove(getResources().getText(gwb.vh));
        }
        CharSequence[] charSequenceArr = (CharSequence[]) this.aj.toArray(new CharSequence[this.aj.size()]);
        Builder builder = new Builder(getActivity());
        int i = m16997r() ? gwb.vg : m16996q() == 0 ? gwb.vl : gwb.vk;
        return builder.setTitle(i).setItems(charSequenceArr, this).setCancelable(false).setIcon(gwb.va).create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        if (getActivity() != null) {
            TeleFeedback$FeedbackActivity teleFeedback$FeedbackActivity = (TeleFeedback$FeedbackActivity) getActivity();
            String charSequence = ((CharSequence) this.aj.get(i)).toString();
            Resources resources = getResources();
            if (m16997r()) {
                if (resources.getString(gwb.vf).equals(charSequence)) {
                    charSequence = null;
                }
                teleFeedback$FeedbackActivity.m9203a(charSequence);
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
            teleFeedback$FeedbackActivity.m9204a(str, z);
        }
    }

    private int m16996q() {
        return getArguments().getInt("rating");
    }

    private boolean m16997r() {
        return getArguments().getBoolean("should_show_audio_issues");
    }
}
