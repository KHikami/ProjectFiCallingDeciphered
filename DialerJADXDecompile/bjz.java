import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.dialer.settings.GoogleDialerSettingsActivity;

/* compiled from: PG */
public class bjz extends bke {
    public bjz() {
        super("google_caller_id", true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.lt, viewGroup, false);
        this.a = (Switch) inflate.findViewById(buf.lm);
        this.a.setOnCheckedChangeListener(this);
        TextView textView = (TextView) inflate.findViewById(buf.lo);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(getResources().getString(buf.lB, new Object[]{buf.i(getActivity(), "dialer_google_caller_id"), buf.i(getActivity(), "dialer_data_attribution")})));
        textView.setTextDirection(5);
        ((GoogleDialerSettingsActivity) getActivity()).a().a().b(buf.lA);
        return inflate;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.onCheckedChanged(compoundButton, z);
        if (!z) {
            bjf.b(getActivity());
        }
    }
}
