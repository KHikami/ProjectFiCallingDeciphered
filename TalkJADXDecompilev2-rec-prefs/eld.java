package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eld extends ArrayAdapter<Intent> {
    final /* synthetic */ DebugActivity f11797a;

    public eld(DebugActivity debugActivity, Context context, int i, int i2) {
        this.f11797a = debugActivity;
        super(context, i, i2);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(ba.cS);
        TextView textView2 = (TextView) view2.findViewById(ba.gf);
        Intent intent = (Intent) getItem(i);
        String valueOf = String.valueOf(intent.getStringExtra("___time"));
        String valueOf2 = String.valueOf(this.f11797a.f6670g.m5629a());
        textView.setText(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(" ").append(valueOf2).toString());
        bko bko = this.f11797a.f6670g;
        textView2.setText(RealTimeChatService.m9105e(intent));
        return view2;
    }
}
