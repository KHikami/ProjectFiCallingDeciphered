package p000;

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

public final class elj implements ListAdapter {
    final /* synthetic */ DebugBitmapsActivity f11809a;

    elj(DebugBitmapsActivity debugBitmapsActivity) {
        this.f11809a = debugBitmapsActivity;
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public boolean isEnabled(int i) {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public int getCount() {
        return 13;
    }

    public Object getItem(int i) {
        boz boz = (boz) jyn.m25426a(this.f11809a, boz.class);
        switch (i) {
            case 0:
                return blc.m5750h();
            case 1:
                return blc.m5740a(bjy.CARRIER);
            case 2:
                return blc.m5751i();
            case 3:
                return blc.m5747e();
            case 4:
                return blc.m5749g();
            case 5:
                return blc.m5745c();
            case 6:
                return blc.m5745c();
            case 7:
                return boz.mo639c();
            case 8:
                return blc.m5746d();
            case 9:
                return blc.m5748f();
            case 10:
                return blc.m5744b();
            case 11:
                return blc.m5744b();
            case 12:
                return boz.mo638b();
            default:
                return null;
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public boolean hasStableIds() {
        return false;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f11809a.getLayoutInflater().inflate(gwb.gh, viewGroup, false);
        }
        Bitmap bitmap = (Bitmap) getItem(i);
        if (bitmap != null) {
            TextView textView = (TextView) view.findViewById(ba.fD);
            TextView textView2 = (TextView) view.findViewById(ba.fE);
            TextView textView3 = (TextView) view.findViewById(ba.fF);
            TextView textView4 = (TextView) view.findViewById(ba.fG);
            ImageView imageView = (ImageView) view.findViewById(ba.f2674M);
            switch (i) {
                case 0:
                    textView.setText("DefaultCircleAvatar");
                    break;
                case 1:
                    textView.setText("MediumDefaultAvatarWithSmsBadge");
                    break;
                case 2:
                    textView.setText("MissedCallPstnAvatar");
                    break;
                case 3:
                    textView.setText("RectBusinessAvatar");
                    break;
                case 4:
                    textView.setText("RectLargeBusinessAvatar");
                    break;
                case 5:
                    textView.setText("RectLargeDefaultAvatar");
                    break;
                case 6:
                    textView.setText("RectLargePstnAvatar");
                    break;
                case 7:
                    textView.setText("RectMediumDefaultAvatar");
                    break;
                case 8:
                    textView.setText("RoundBusinessAvatar");
                    break;
                case 9:
                    textView.setText("RoundLargeBusinessAvatar");
                    break;
                case 10:
                    textView.setText("RoundLargeDefaultAvatar");
                    break;
                case 11:
                    textView.setText("RoundLargePstnAvatar");
                    break;
                case 12:
                    textView.setText("RoundMediumDefaultAvatar");
                    break;
            }
            textView2.setText("");
            int width = bitmap.getWidth();
            textView3.setText(width + "x" + bitmap.getHeight());
            textView4.setText(bitmap.toString());
            imageView.setImageDrawable(new BitmapDrawable(bitmap));
        }
        return view;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean isEmpty() {
        return getCount() != 0;
    }
}
