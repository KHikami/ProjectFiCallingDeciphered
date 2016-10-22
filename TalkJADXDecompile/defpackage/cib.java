package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;

/* renamed from: cib */
public final class cib implements OnClickListener {
    final /* synthetic */ PreviewImageActivity a;

    public cib(PreviewImageActivity previewImageActivity) {
        this.a = previewImageActivity;
    }

    public void onClick(View view) {
        Intent intent = this.a.getIntent();
        intent.putExtra("result_media_attachment", this.a.t);
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
