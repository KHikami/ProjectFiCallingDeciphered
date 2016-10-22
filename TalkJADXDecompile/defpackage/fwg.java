package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* renamed from: fwg */
final class fwg extends ArrayAdapter<CharSequence> {
    final /* synthetic */ fwf a;
    private CharSequence[] b;

    public fwg(fwf fwf, Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.a = fwf;
        super(context, i, charSequenceArr);
        this.b = null;
        this.b = charSequenceArr2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(gwb.hD, viewGroup, false);
        ((TextView) inflate.findViewById(ba.bf)).setText(this.a.f()[i]);
        ((TextView) inflate.findViewById(ba.be)).setText(this.b[i]);
        return inflate;
    }
}
