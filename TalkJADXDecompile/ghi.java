import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class ghi extends dr {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.vU, viewGroup, false);
        ((TextView) inflate.findViewById(16908310)).setText(getArguments().getString("android.intent.extra.TITLE"));
        ((TextView) inflate.findViewById(16908299)).setText(getArguments().getString("android.intent.extra.TEXT"));
        return inflate;
    }

    public void b(String str) {
        getArguments().putString("android.intent.extra.TITLE", str);
        if (getView() != null) {
            ((TextView) getView().findViewById(16908310)).setText(str);
        }
    }

    public void c(String str) {
        getArguments().putString("android.intent.extra.TEXT", str);
        if (getView() != null) {
            ((TextView) getView().findViewById(16908299)).setText(str);
        }
    }
}
