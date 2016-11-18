package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class ghs extends dr {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.vW, viewGroup, false);
        ((TextView) inflate.findViewById(16908310)).setText(getActivity().getString(gwb.wd));
        ((TextView) inflate.findViewById(16908299)).setText(getActivity().getString(gwb.wc));
        Button button = (Button) inflate.findViewById(gwb.vS);
        button.setText(getActivity().getString(gwb.wb));
        button.setOnClickListener(new ght(this));
        ((Button) inflate.findViewById(gwb.vR)).setOnClickListener(new ghu(this));
        return inflate;
    }
}
