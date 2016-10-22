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
    gni a;
    private TextView b;
    private AvatarView c;
    private Button d;
    private String e;
    private edo f;

    public gnh(Context context) {
        this(context, null);
    }

    private gnh(Context context, AttributeSet attributeSet) {
        super(context, null);
        View inflate = LayoutInflater.from(context).inflate(gwb.fO, this);
        this.d = (Button) inflate.findViewById(ba.gb);
        this.d.setOnClickListener(this);
        this.b = (TextView) inflate.findViewById(ba.dy);
        this.c = (AvatarView) inflate.findViewById(ba.A);
    }

    public void a(gni gni) {
        this.a = gni;
    }

    public void a(edo edo) {
        this.f = edo;
    }

    public edo a() {
        return this.f;
    }

    public void a(String str) {
        this.e = str;
        this.b.setText(str);
    }

    public String b() {
        return this.e;
    }

    public void a(String str, String str2, bko bko) {
        this.c.a(str, str2, bko);
    }

    public void onClick(View view) {
        if (this.a != null && view == this.d) {
            this.a.a(this);
        }
    }
}
