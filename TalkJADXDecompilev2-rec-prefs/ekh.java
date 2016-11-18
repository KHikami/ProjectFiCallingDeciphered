package p000;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekh extends iiq<Void, Void, Void> {
    final /* synthetic */ DebugActivity f11750a;

    public ekh(DebugActivity debugActivity) {
        this.f11750a = debugActivity;
    }

    protected /* synthetic */ Object mo470a(Object[] objArr) {
        return m14095b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m14094a();
    }

    private void m14094a() {
        CharSequence charSequence;
        boolean z;
        Context context = this.f11750a;
        context.mo1171a();
        context.registerForContextMenu(context.f6665b);
        context.getContentResolver();
        String[] strArr = new String[]{gwb.m1998b(context, DebugActivity.f6663i[0], null), gwb.m1998b(context, DebugActivity.f6663i[1], null), gwb.m1998b(context, DebugActivity.f6663i[2], null)};
        TextView textView = context.f6664a;
        String str = strArr[0];
        if (str != null) {
            while (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.endsWith("daily")) {
                charSequence = "DAILY";
            } else if (str.endsWith("staging")) {
                charSequence = "STAGING";
            } else {
                charSequence = "PROD";
            }
        } else {
            charSequence = "UNKNOWN";
        }
        textView.setText(charSequence);
        context.f6664a.setOnClickListener(new eku(context, strArr));
        context.f6664a.setOnLongClickListener(new eky(context, strArr));
        TextView textView2 = (TextView) context.findViewById(ba.cY);
        TextView textView3 = (TextView) context.findViewById(ba.fe);
        OnClickListener ekz = new ekz(context, textView2, textView3);
        textView3.setText("REALTIMECHATSERVICE");
        textView3.setOnClickListener(ekz);
        String str2 = "CONVERSATIONS - DB: ";
        String valueOf = String.valueOf(context.f6666c.m6044e().m6210e().getPath());
        textView2.setText(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        textView2.setOnClickListener(ekz);
        CheckBox checkBox = (CheckBox) context.findViewById(ba.aj);
        checkBox.setText("RECORD AFTER EXIT");
        if (bkq.m5659a(context.getApplicationContext(), context.f6670g.m5638g(), "DEBUG_RTCS", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new ela(context));
        context.startService(DebugActivity.m8910a(context));
    }

    private Void m14095b() {
        this.f11750a.f6666c = new blo(this.f11750a, this.f11750a.f6670g.m5638g());
        return null;
    }
}
