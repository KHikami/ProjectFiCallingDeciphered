package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class ghf extends dr {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.vW, viewGroup, false);
        ((TextView) inflate.findViewById(16908310)).setText(getArguments().getString("android.intent.extra.TITLE"));
        ((TextView) inflate.findViewById(16908299)).setText(getArguments().getString("android.intent.extra.TEXT"));
        ((Button) inflate.findViewById(gwb.vS)).setOnClickListener(new ghg(this));
        ((Button) inflate.findViewById(gwb.vR)).setVisibility(8);
        return inflate;
    }

    public void m17698b(String str) {
        getArguments().putString("android.intent.extra.TITLE", str);
        if (getView() != null) {
            ((TextView) getView().findViewById(16908310)).setText(str);
        }
    }

    public void m17699c(String str) {
        getArguments().putString("android.intent.extra.TEXT", str);
        if (getView() != null) {
            ((TextView) getView().findViewById(16908299)).setText(str);
        }
    }
}
