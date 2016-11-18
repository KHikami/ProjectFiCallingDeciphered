package p000;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;

public final class cib implements OnClickListener {
    final /* synthetic */ PreviewImageActivity f5358a;

    public cib(PreviewImageActivity previewImageActivity) {
        this.f5358a = previewImageActivity;
    }

    public void onClick(View view) {
        Intent intent = this.f5358a.getIntent();
        intent.putExtra("result_media_attachment", this.f5358a.f6079t);
        this.f5358a.setResult(-1, intent);
        this.f5358a.finish();
    }
}
