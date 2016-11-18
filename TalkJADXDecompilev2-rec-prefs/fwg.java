package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class fwg extends ArrayAdapter<CharSequence> {
    final /* synthetic */ fwf f14157a;
    private CharSequence[] f14158b = null;

    public fwg(fwf fwf, Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f14157a = fwf;
        super(context, i, charSequenceArr);
        this.f14158b = charSequenceArr2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(gwb.hD, viewGroup, false);
        ((TextView) inflate.findViewById(ba.bf)).setText(this.f14157a.m16384f()[i]);
        ((TextView) inflate.findViewById(ba.be)).setText(this.f14158b[i]);
        return inflate;
    }
}
