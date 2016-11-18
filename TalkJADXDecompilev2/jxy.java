package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class jxy extends jzl implements OnClickListener, OnMultiChoiceClickListener {
    private jxz aj;

    public static jxy a(String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3) {
        return new jxy().b(str, charSequence, str2, str3, i, i2, i3);
    }

    protected jxy b(String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("title", str);
        }
        if (charSequence != null) {
            bundle.putCharSequence("message", charSequence);
        }
        if (str2 != null) {
            bundle.putString("positive", str2);
        }
        if (str3 != null) {
            bundle.putString("negative", str3);
        }
        if (i != 0) {
            bundle.putInt("icon", i);
        }
        if (i2 != 0) {
            bundle.putInt("icon_attribute", i2);
        }
        if (i3 != 0) {
            bundle.putInt("theme", i3);
        }
        setArguments(bundle);
        return this;
    }

    @Deprecated
    public void a(jxz jxz) {
        this.aj = jxz;
    }

    public Context q() {
        return getActivity();
    }

    public Dialog a(Bundle bundle) {
        up upVar;
        Bundle arguments = getArguments();
        Context q = q();
        if (arguments.containsKey("theme")) {
            upVar = new up(q, arguments.getInt("theme"));
        } else {
            upVar = new up(q);
        }
        if (arguments.containsKey("title")) {
            upVar.a(arguments.getString("title"));
        }
        if (arguments.containsKey("message")) {
            CharSequence charSequence = arguments.getCharSequence("message");
            try {
                View inflate = LayoutInflater.from(q).inflate(gwb.zT, null);
                TextView textView = (TextView) inflate.findViewById(bc.vw);
                if (textView != null) {
                    if (charSequence instanceof String) {
                        gwb.a(textView, (String) charSequence);
                    } else if (charSequence instanceof Spannable) {
                        gwb.a(textView, (Spannable) charSequence);
                    }
                }
                upVar.b(inflate);
            } catch (Throwable e) {
                Log.e("AlertFragmentDialog", "Cannot inflated view", e);
                upVar.b(charSequence);
            }
        }
        if (arguments.containsKey("positive")) {
            upVar.a(arguments.getString("positive"), this);
        }
        if (arguments.containsKey("negative")) {
            upVar.b(arguments.getString("negative"), this);
        }
        if (arguments.containsKey("icon_attribute") && VERSION.SDK_INT >= 11) {
            upVar.b(arguments.getInt("icon_attribute"));
        } else if (arguments.containsKey("icon")) {
            upVar.a(arguments.getInt("icon"));
        }
        if (arguments.containsKey("list")) {
            upVar.a(arguments.getStringArray("list"), this);
        }
        if (arguments.containsKey("multi_choice_list")) {
            boolean[] booleanArray;
            CharSequence[] stringArray = arguments.getStringArray("multi_choice_list");
            if (arguments.containsKey("multi_choice_list_states")) {
                booleanArray = arguments.getBooleanArray("multi_choice_list_states");
            } else {
                booleanArray = new boolean[stringArray.length];
            }
            upVar.a(stringArray, booleanArray, this);
        }
        return upVar.b();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        jxz r = r();
        if (r != null) {
            switch (i) {
                case -2:
                    getArguments();
                    getTag();
                    r.a();
                    return;
                case -1:
                    getArguments();
                    r.c_(getTag());
                    return;
                default:
                    if (getArguments().containsKey("list") && i >= 0) {
                        getTag();
                        r.c();
                        return;
                    }
                    return;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        jxz r = r();
        if (r != null && getArguments().containsKey("multi_choice_list") && i >= 0) {
            getTag();
            r.d();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        jxz r = r();
        if (r != null) {
            getArguments();
            getTag();
            r.b();
        }
    }

    private jxz r() {
        if (this.aj != null) {
            return this.aj;
        }
        if (getTargetFragment() instanceof jxz) {
            return (jxz) getTargetFragment();
        }
        if (getActivity() instanceof jxz) {
            return (jxz) getActivity();
        }
        return null;
    }

    public static jxy a(String str, CharSequence charSequence, String str2, String str3) {
        return jxy.a(str, charSequence, null, null, 0, 0, 0);
    }
}
