package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

public class gnh extends FrameLayout implements OnClickListener {
    gni f15700a;
    private TextView f15701b;
    private AvatarView f15702c;
    private Button f15703d;
    private String f15704e;
    private edo f15705f;

    public gnh(Context context) {
        this(context, null);
    }

    private gnh(Context context, AttributeSet attributeSet) {
        super(context, null);
        View inflate = LayoutInflater.from(context).inflate(gwb.fO, this);
        this.f15703d = (Button) inflate.findViewById(ba.gb);
        this.f15703d.setOnClickListener(this);
        this.f15701b = (TextView) inflate.findViewById(ba.dy);
        this.f15702c = (AvatarView) inflate.findViewById(ba.f2662A);
    }

    public void m18158a(gni gni) {
        this.f15700a = gni;
    }

    public void m18157a(edo edo) {
        this.f15705f = edo;
    }

    public edo m18156a() {
        return this.f15705f;
    }

    public void m18159a(String str) {
        this.f15704e = str;
        this.f15701b.setText(str);
    }

    public String m18161b() {
        return this.f15704e;
    }

    public void m18160a(String str, String str2, bko bko) {
        this.f15702c.m9238a(str, str2, bko);
    }

    public void onClick(View view) {
        if (this.f15700a != null && view == this.f15703d) {
            this.f15700a.m18162a(this);
        }
    }
}
