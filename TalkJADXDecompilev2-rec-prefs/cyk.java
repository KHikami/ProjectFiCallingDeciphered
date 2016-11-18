package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.EditText;
import android.widget.TextView;

@Deprecated
public class cyk extends jzl implements OnClickListener {
    public EditText aj;
    private cyl ak;

    public static cyk m11264a(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("title", str);
        }
        bundle.putString("message", str2);
        if (str3 != null) {
            bundle.putString("positive", str3);
        }
        if (str4 != null) {
            bundle.putString("negative", str4);
        }
        cyk cyk = new cyk();
        cyk.setArguments(bundle);
        return cyk;
    }

    public Dialog mo792a(Bundle bundle) {
        Bundle arguments = getArguments();
        Builder builder = new Builder(getActivity());
        if (arguments.containsKey("title")) {
            builder.setTitle(arguments.getString("title"));
        }
        builder.setMessage(Html.fromHtml(arguments.getString("message")));
        if (arguments.containsKey("positive")) {
            builder.setPositiveButton(arguments.getString("positive"), this);
        }
        if (arguments.containsKey("negative")) {
            builder.setNegativeButton(arguments.getString("negative"), this);
        }
        if (arguments.containsKey("neutral")) {
            builder.setNeutralButton(arguments.getString("neutral"), this);
        }
        if (arguments.containsKey("edit_text")) {
            this.aj = new EditText(getActivity());
            this.aj.setText(arguments.getString("edit_text"));
            builder.setView(this.aj);
        }
        return builder.create();
    }

    public void onStart() {
        super.onStart();
        ((TextView) m7009c().findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        cyl q = m11265q();
        if (q != null) {
            Bundle arguments = getArguments();
            if (arguments.containsKey("edit_text") && this.aj != null) {
                arguments.putString("edit_text", this.aj.getText().toString());
            }
            switch (i) {
                case -3:
                    getArguments();
                    getTag();
                    return;
                case -2:
                    getArguments();
                    q.b_(getTag());
                    return;
                case -1:
                    q.mo678a(getArguments(), getTag());
                    return;
                default:
                    return;
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        cyl q = m11265q();
        if (q != null) {
            getArguments();
            q.mo679b(getTag());
        }
    }

    public void m11267a(cyl cyl) {
        this.ak = cyl;
    }

    private cyl m11265q() {
        if (this.ak != null) {
            return this.ak;
        }
        dr targetFragment = getTargetFragment();
        if (targetFragment != null && (targetFragment instanceof cyl)) {
            return (cyl) targetFragment;
        }
        dw activity = getActivity();
        if (activity == null || !(activity instanceof cyl)) {
            return null;
        }
        return (cyl) activity;
    }
}
