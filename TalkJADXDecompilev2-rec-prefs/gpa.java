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

public final class gpa extends FrameLayout implements OnClickListener {
    gpb f15845a;
    private TextView f15846b;
    private AvatarView f15847c;
    private Button f15848d;
    private String f15849e;
    private edo f15850f;

    public gpa(Context context) {
        this(context, null);
    }

    private gpa(Context context, AttributeSet attributeSet) {
        super(context, null);
        View inflate = LayoutInflater.from(context).inflate(gwb.gP, this);
        this.f15848d = (Button) inflate.findViewById(ba.gc);
        this.f15848d.setOnClickListener(this);
        this.f15846b = (TextView) inflate.findViewById(ba.dy);
        this.f15847c = (AvatarView) inflate.findViewById(ba.f2662A);
    }

    public void m18253a(gpb gpb) {
        this.f15845a = gpb;
    }

    public void m18252a(edo edo) {
        this.f15850f = edo;
    }

    public edo m18251a() {
        return this.f15850f;
    }

    public void m18254a(String str) {
        this.f15849e = str;
        this.f15846b.setText(str);
    }

    public String m18256b() {
        return this.f15849e;
    }

    public void m18255a(String str, String str2, bko bko) {
        this.f15847c.m9238a(str, str2, bko);
    }

    public void onClick(View view) {
        if (this.f15845a != null && view == this.f15848d) {
            this.f15845a.m18257a(this);
        }
    }
}
