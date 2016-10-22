import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class eiw extends Preference implements OnClickListener, OnCheckedChangeListener {
    private static String a;
    private static CompoundButton b;
    private boolean c;
    private boolean d;

    private eiw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.d = true;
    }

    private eiw(Context context, AttributeSet attributeSet) {
        this(context, null, gwb.dz);
    }

    public eiw(Context context) {
        this(context, null);
    }

    static {
        a = null;
        b = null;
    }

    public View getView(View view, ViewGroup viewGroup) {
        View view2 = super.getView(view, viewGroup);
        View findViewById = view2.findViewById(ba.r);
        if (findViewById != null && (findViewById instanceof RadioButton)) {
            RadioButton radioButton = (RadioButton) findViewById;
            if (this.d) {
                radioButton.setOnCheckedChangeListener(this);
                boolean equals = getKey().equals(a);
                if (equals) {
                    b = radioButton;
                    a = getKey();
                }
                this.c = true;
                radioButton.setChecked(equals);
                this.c = false;
            } else {
                radioButton.setVisibility(8);
            }
            a(radioButton);
        }
        findViewById = view2.findViewById(ba.fH);
        if (findViewById != null && (findViewById instanceof RelativeLayout)) {
            findViewById.setOnClickListener(this);
        }
        return view2;
    }

    private static void a(CompoundButton compoundButton) {
        compoundButton.setContentDescription(((TextView) ((View) compoundButton.getParent()).findViewById(16908310)).getText().toString());
    }

    public void a() {
        a = getKey();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String valueOf = String.valueOf(getKey());
        new StringBuilder(String.valueOf(valueOf).length() + 11).append("ID: ").append(valueOf).append(" :").append(z);
        if (!this.c) {
            if (z) {
                if (b != null) {
                    b.setChecked(false);
                }
                b = compoundButton;
                a = getKey();
                callChangeListener(a);
            } else {
                b = null;
                a = null;
            }
            a(compoundButton);
        }
    }

    public void onClick(View view) {
        if (view != null && ba.fH == view.getId()) {
            Context context = getContext();
            if (context != null) {
                context.startActivity(gwb.y(getKey()));
            }
        }
    }

    public void setSelectable(boolean z) {
        this.d = z;
    }
}
