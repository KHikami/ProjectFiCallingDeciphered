package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dbm implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ dbl b;

    dbm(dbl dbl, String str) {
        this.b = dbl;
        this.a = str;
    }

    public void onClick(View view) {
        Context context = view.getContext();
        if (((ehz) jyn.a(context, ehz.class)).a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.b.a.a();
            if ("load".equals(this.b.a.aj)) {
                RealTimeChatService.c(this.a);
                return;
            } else if ("email".equals(this.b.a.aj)) {
                dbk dbk = this.b.a;
                String str = this.a;
                Resources resources = dbk.getResources();
                String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
                str = new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(str).length()).append("file://").append(valueOf).append("/").append(str).toString();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/octet-stream");
                intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
                intent.putExtra("android.intent.extra.SUBJECT", resources.getString(bc.cr));
                dbk.getActivity().startActivity(Intent.createChooser(intent, resources.getString(bc.cq)));
                return;
            } else {
                return;
            }
        }
        Toast.makeText(context, "Can't access file, please go to Settings to turn on the Storage permission.", 0).show();
    }
}
