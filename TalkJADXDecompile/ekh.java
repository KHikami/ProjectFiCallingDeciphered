import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekh extends iiq<Void, Void, Void> {
    final /* synthetic */ DebugActivity a;

    public ekh(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    protected /* synthetic */ Object a(Object[] objArr) {
        return b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a();
    }

    private void a() {
        CharSequence charSequence;
        boolean z;
        Context context = this.a;
        context.a();
        context.registerForContextMenu(context.b);
        context.getContentResolver();
        String[] strArr = new String[]{gwb.b(context, DebugActivity.i[0], null), gwb.b(context, DebugActivity.i[1], null), gwb.b(context, DebugActivity.i[2], null)};
        TextView textView = context.a;
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
        context.a.setOnClickListener(new eku(context, strArr));
        context.a.setOnLongClickListener(new eky(context, strArr));
        TextView textView2 = (TextView) context.findViewById(ba.cY);
        TextView textView3 = (TextView) context.findViewById(ba.fe);
        OnClickListener ekz = new ekz(context, textView2, textView3);
        textView3.setText("REALTIMECHATSERVICE");
        textView3.setOnClickListener(ekz);
        String str2 = "CONVERSATIONS - DB: ";
        String valueOf = String.valueOf(context.c.e().e().getPath());
        textView2.setText(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        textView2.setOnClickListener(ekz);
        CheckBox checkBox = (CheckBox) context.findViewById(ba.aj);
        checkBox.setText("RECORD AFTER EXIT");
        if (bkq.a(context.getApplicationContext(), context.g.g(), "DEBUG_RTCS", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new ela(context));
        context.startService(DebugActivity.a(context));
    }

    private Void b() {
        this.a.c = new blo(this.a, this.a.g.g());
        return null;
    }
}
