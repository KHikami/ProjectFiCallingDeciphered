package p000;

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
    private static String f11624a = null;
    private static CompoundButton f11625b = null;
    private boolean f11626c;
    private boolean f11627d;

    private eiw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11626c = false;
        this.f11627d = true;
    }

    private eiw(Context context, AttributeSet attributeSet) {
        this(context, null, gwb.dz);
    }

    public eiw(Context context) {
        this(context, null);
    }

    public View getView(View view, ViewGroup viewGroup) {
        View view2 = super.getView(view, viewGroup);
        View findViewById = view2.findViewById(ba.f2707r);
        if (findViewById != null && (findViewById instanceof RadioButton)) {
            RadioButton radioButton = (RadioButton) findViewById;
            if (this.f11627d) {
                radioButton.setOnCheckedChangeListener(this);
                boolean equals = getKey().equals(f11624a);
                if (equals) {
                    f11625b = radioButton;
                    f11624a = getKey();
                }
                this.f11626c = true;
                radioButton.setChecked(equals);
                this.f11626c = false;
            } else {
                radioButton.setVisibility(8);
            }
            eiw.m13994a(radioButton);
        }
        findViewById = view2.findViewById(ba.fH);
        if (findViewById != null && (findViewById instanceof RelativeLayout)) {
            findViewById.setOnClickListener(this);
        }
        return view2;
    }

    private static void m13994a(CompoundButton compoundButton) {
        compoundButton.setContentDescription(((TextView) ((View) compoundButton.getParent()).findViewById(16908310)).getText().toString());
    }

    public void m13995a() {
        f11624a = getKey();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String valueOf = String.valueOf(getKey());
        new StringBuilder(String.valueOf(valueOf).length() + 11).append("ID: ").append(valueOf).append(" :").append(z);
        if (!this.f11626c) {
            if (z) {
                if (f11625b != null) {
                    f11625b.setChecked(false);
                }
                f11625b = compoundButton;
                f11624a = getKey();
                callChangeListener(f11624a);
            } else {
                f11625b = null;
                f11624a = null;
            }
            eiw.m13994a(compoundButton);
        }
    }

    public void onClick(View view) {
        if (view != null && ba.fH == view.getId()) {
            Context context = getContext();
            if (context != null) {
                context.startActivity(gwb.m2391y(getKey()));
            }
        }
    }

    public void setSelectable(boolean z) {
        this.f11627d = z;
    }
}
