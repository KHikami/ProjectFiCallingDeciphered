package p000;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;
import java.io.File;
import java.io.FileOutputStream;

public final class cle extends AsyncTask<Void, Void, bxy> {
    final /* synthetic */ CameraPickerFragment f5543a;

    cle(CameraPickerFragment cameraPickerFragment) {
        this.f5543a = cameraPickerFragment;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7864a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7865a((bxy) obj);
    }

    private bxy m7864a() {
        bxy bxy;
        if (this.f5543a.ao != null) {
            bxy = new bxy();
            bxy.b = this.f5543a.ao.getName();
            bxy.f4761j = this.f5543a.ao.length();
            bxy.a = Uri.fromFile(this.f5543a.ao).toString();
            bxy.d = "video/mp4";
            bxy.c = bxo.VIDEO;
            bxy.f4759h = 0;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.f5543a.ao.toString());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            try {
                bxy.f4757f = Integer.parseInt(extractMetadata2);
                bxy.f4758g = Integer.parseInt(extractMetadata);
                bxy.f4760i = Integer.parseInt(extractMetadata3);
            } catch (NumberFormatException e) {
                bxy.f4757f = 0;
                bxy.f4758g = 0;
                bxy.f4760i = 0;
                glk.m17981d("Babel", "Failed to parse video column strings", new Object[0]);
            }
            ccy.m7220a(this.f5543a.context.getContentResolver(), this.f5543a.ao.getPath(), bxo.VIDEO);
            this.f5543a.ao = null;
            return bxy;
        }
        try {
            File a = ccy.m7224a(bxo.PHOTO);
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            fileOutputStream.write(this.f5543a.al);
            fileOutputStream.close();
            bxy = new bxy();
            bxy.b = a.getName();
            bxy.f4761j = (long) this.f5543a.al.length;
            bxy.a = Uri.fromFile(a).toString();
            bxy.d = "image/jpeg";
            bxy.c = bxo.PHOTO;
            bxy.f4759h = 0;
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(this.f5543a.al, 0, this.f5543a.al.length, options);
            bxy.f4757f = options.outHeight;
            bxy.f4758g = options.outWidth;
            ccy.m7220a(this.f5543a.context.getContentResolver(), a.getPath(), bxo.PHOTO);
            return bxy;
        } catch (Throwable e2) {
            glk.m17980d("Babel", "Error writing photo to file", e2);
            cancel(false);
            return null;
        }
    }

    protected void onCancelled() {
        this.f5543a.getActivity().setResult(0, this.f5543a.getActivity().getIntent());
        this.f5543a.getActivity().finish();
    }

    private void m7865a(bxy bxy) {
        Intent intent = this.f5543a.getActivity().getIntent();
        intent.putExtra("new_attachment", bxy);
        this.f5543a.getActivity().setResult(-1, intent);
        this.f5543a.getActivity().finish();
    }
}
