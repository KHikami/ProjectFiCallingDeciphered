package defpackage;

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
    final /* synthetic */ CameraPickerFragment a;

    cle(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((bxy) obj);
    }

    private bxy a() {
        bxy bxy;
        if (this.a.ao != null) {
            bxy = new bxy();
            bxy.b = this.a.ao.getName();
            bxy.j = this.a.ao.length();
            bxy.a = Uri.fromFile(this.a.ao).toString();
            bxy.d = "video/mp4";
            bxy.c = bxo.VIDEO;
            bxy.h = 0;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.a.ao.toString());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            try {
                bxy.f = Integer.parseInt(extractMetadata2);
                bxy.g = Integer.parseInt(extractMetadata);
                bxy.i = Integer.parseInt(extractMetadata3);
            } catch (NumberFormatException e) {
                bxy.f = 0;
                bxy.g = 0;
                bxy.i = 0;
                glk.d("Babel", "Failed to parse video column strings", new Object[0]);
            }
            ccy.a(this.a.context.getContentResolver(), this.a.ao.getPath(), bxo.VIDEO);
            this.a.ao = null;
            return bxy;
        }
        try {
            File a = ccy.a(bxo.PHOTO);
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            fileOutputStream.write(this.a.al);
            fileOutputStream.close();
            bxy = new bxy();
            bxy.b = a.getName();
            bxy.j = (long) this.a.al.length;
            bxy.a = Uri.fromFile(a).toString();
            bxy.d = "image/jpeg";
            bxy.c = bxo.PHOTO;
            bxy.h = 0;
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(this.a.al, 0, this.a.al.length, options);
            bxy.f = options.outHeight;
            bxy.g = options.outWidth;
            ccy.a(this.a.context.getContentResolver(), a.getPath(), bxo.PHOTO);
            return bxy;
        } catch (Throwable e2) {
            glk.d("Babel", "Error writing photo to file", e2);
            cancel(false);
            return null;
        }
    }

    protected void onCancelled() {
        this.a.getActivity().setResult(0, this.a.getActivity().getIntent());
        this.a.getActivity().finish();
    }

    private void a(bxy bxy) {
        Intent intent = this.a.getActivity().getIntent();
        intent.putExtra("new_attachment", bxy);
        this.a.getActivity().setResult(-1, intent);
        this.a.getActivity().finish();
    }
}
