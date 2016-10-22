import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

/* compiled from: PG */
public final class atq extends DialogFragment {
    String a;
    String b;
    aup c;
    View d;
    aty e;
    private String f;
    private axn g;

    public final Context getContext() {
        return getActivity();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence string;
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onCreateDialog(bundle);
        boolean containsKey = getArguments().containsKey("argBlockId");
        this.a = getArguments().getString("argNumber");
        this.f = getArguments().getString("argDisplayNumber");
        this.b = getArguments().getString("argCountryIso");
        if (TextUtils.isEmpty(this.f)) {
            this.f = this.a;
        }
        this.c = new aup(getContext());
        this.g = new axn(getActivity(), null);
        this.d = getActivity().findViewById(getArguments().getInt("parentViewId"));
        if (containsKey) {
            string = getString(buf.iB);
            charSequence = aim.a(getResources(), buf.iA, this.f).toString();
            charSequence2 = null;
        } else {
            charSequence2 = aim.a(getResources(), buf.ih, this.f);
            string = getString(buf.ii);
            if (buf.w(getContext())) {
                charSequence = getString(buf.ie);
            } else if (this.g.a) {
                charSequence = getString(buf.ig);
            } else {
                charSequence = getString(buf.if);
            }
        }
        return new Builder(getActivity()).setTitle(charSequence2).setMessage(charSequence).setPositiveButton(string, new atr(this, containsKey)).setNegativeButton(17039360, null).create();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!buf.b(getContext(), PhoneNumberUtils.formatNumberToE164(this.a, this.b), this.a)) {
            dismiss();
            Toast.makeText(getContext(), aim.a(getResources(), buf.io, this.f), 0).show();
        }
    }

    public final void onPause() {
        dismiss();
        this.e = null;
        super.onPause();
    }

    final CharSequence a() {
        return aim.a(getResources(), buf.ix, this.f);
    }

    final CharSequence b() {
        return aim.a(getResources(), buf.iy, this.f);
    }

    final int c() {
        return getContext().getResources().getColor(buf.hY);
    }

    public static atq a(Integer num, String str, String str2, String str3, Integer num2, FragmentManager fragmentManager, aty aty) {
        atq atq = new atq();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("argBlockId", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("parentViewId", num2.intValue());
        }
        bundle.putString("argNumber", str);
        bundle.putString("argCountryIso", str2);
        bundle.putString("argDisplayNumber", str3);
        atq.setArguments(bundle);
        atq.e = aty;
        atq.show(fragmentManager, "BlockNumberDialog");
        return atq;
    }
}
