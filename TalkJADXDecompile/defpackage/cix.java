package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

/* renamed from: cix */
public final class cix extends ArrayAdapter<Object> {
    public boolean a;
    final /* synthetic */ TransportSpinner b;
    private final LayoutInflater c;

    public cix(TransportSpinner transportSpinner, Context context, int i) {
        this.b = transportSpinner;
        super(context, i);
        this.c = LayoutInflater.from(context);
    }

    private static int a(int i) {
        if (i == 2) {
            return R$drawable.bw;
        }
        return R$drawable.bv;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        bpd bpd;
        Object item = getItem(i);
        if (item instanceof bpd) {
            bpd = (bpd) item;
        } else {
            bpd = null;
        }
        if (this.b.e == null) {
            this.b.e = this.c.inflate(gwb.hC, viewGroup, false);
        }
        ImageView imageView = (ImageView) this.b.e.findViewById(ba.fW);
        TextView textView = (TextView) this.b.e.findViewById(ba.fn);
        int i2 = bpd != null ? bpd.b : 0;
        if (i2 == 0) {
            imageView.setImageResource(R$drawable.bu);
            textView.setVisibility(8);
        } else if (gwb.i(i2)) {
            imageView.setImageResource(0);
            textView.setBackgroundResource(cix.a(i2));
            textView.setText(this.b.d ? bc.gH : bc.kl);
            textView.setVisibility(0);
        } else if (gwb.j(i2)) {
            imageView.setImageResource(this.b.c ? gwb.hQ : R$drawable.bu);
            textView.setText("");
            textView.setVisibility(8);
        } else {
            glk.e("Babel", "Unexpected variant", new Object[0]);
        }
        return this.b.e;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View view2;
        Object item = getItem(i);
        if (item instanceof bpd) {
            View inflate = this.c.inflate(gwb.fT, viewGroup, false);
            bpd bpd = (bpd) item;
            int i2 = bpd.b;
            ImageView imageView = (ImageView) inflate.findViewById(ba.cr);
            TextView textView = (TextView) inflate.findViewById(ba.fn);
            TextView textView2 = (TextView) inflate.findViewById(ba.fC);
            TextView textView3 = (TextView) inflate.findViewById(ba.fy);
            if (gwb.i(i2)) {
                imageView.setImageResource(0);
                textView.setBackgroundResource(cix.a(i2));
                textView.setText(this.b.d ? bc.gH : bc.kl);
                textView.setVisibility(0);
                textView2.setText(glq.i(gwb.H(), bpd.c));
                textView2.setTextColor(this.b.getResources().getColor(gwb.dG));
                textView3.setVisibility(8);
                if (!TextUtils.isEmpty(bpd.f) || this.a) {
                    item = bpd.f;
                    textView3.setVisibility(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    if (!TextUtils.isEmpty(item)) {
                        stringBuilder.append(item);
                        if (this.a) {
                            stringBuilder.append(" ");
                        }
                    }
                    if (this.a) {
                        int i3;
                        StringBuilder append = stringBuilder.append("(");
                        TransportSpinner transportSpinner = this.b;
                        if (gwb.h(i2)) {
                            i3 = transportSpinner.d ? bc.tP : bc.tQ;
                        } else {
                            bko e = fde.e(transportSpinner.a);
                            i3 = (e == null || !e.M()) ? bc.tO : bc.tR;
                        }
                        append.append(transportSpinner.getContext().getResources().getString(i3)).append(")");
                    }
                    textView3.setText(stringBuilder.toString());
                    view2 = inflate;
                }
            } else if (gwb.j(i2)) {
                imageView.setImageResource(this.b.c ? gwb.hQ : R$drawable.bu);
                textView.setVisibility(8);
                if (TextUtils.isEmpty(bpd.c)) {
                    textView3.setText(bpd.d);
                } else {
                    textView3.setText(bpd.c);
                }
                textView2.setText(this.b.getResources().getString(bc.fm));
            }
            view2 = inflate;
        } else if (item instanceof ciy) {
            ciy ciy = (ciy) item;
            View inflate2 = this.c.inflate(gwb.fW, viewGroup, false);
            ImageView imageView2 = (ImageView) inflate2.findViewById(ba.cr);
            ((TextView) inflate2.findViewById(ba.fC)).setText(ciy.a());
            int b = ciy.b();
            if (b == 0) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                imageView2.setImageResource(b);
            }
            if (ciy instanceof OnClickListener) {
                inflate2.setOnClickListener((OnClickListener) ciy);
            }
            view2 = inflate2;
        } else {
            view2 = null;
        }
        if (view2 == null) {
            view2 = new View(this.c.getContext());
            view2.setVisibility(8);
            return view2;
        } else if (i == 0) {
            view2.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(gwb.fu);
            view2.setLayoutParams(view2.getLayoutParams());
            view2.setPadding(view2.getPaddingLeft(), this.b.getResources().getDimensionPixelSize(gwb.fs), view2.getPaddingRight(), 0);
            return view2;
        } else if (i == getCount() - 1) {
            view2.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(gwb.fu);
            view2.setLayoutParams(view2.getLayoutParams());
            view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), this.b.getResources().getDimensionPixelSize(gwb.fs));
            return view2;
        } else {
            view2.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(gwb.ft);
            view2.setLayoutParams(view2.getLayoutParams());
            view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), 0);
            return view2;
        }
    }
}
