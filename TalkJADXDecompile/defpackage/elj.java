package defpackage;

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

/* renamed from: elj */
public final class elj implements ListAdapter {
    final /* synthetic */ DebugBitmapsActivity a;

    elj(DebugBitmapsActivity debugBitmapsActivity) {
        this.a = debugBitmapsActivity;
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
        boz boz = (boz) jyn.a(this.a, boz.class);
        switch (i) {
            case wi.w /*0*/:
                return blc.h();
            case wi.j /*1*/:
                return blc.a(bjy.CARRIER);
            case wi.l /*2*/:
                return blc.i();
            case wi.z /*3*/:
                return blc.e();
            case wi.h /*4*/:
                return blc.g();
            case wi.p /*5*/:
                return blc.c();
            case wi.s /*6*/:
                return blc.c();
            case wi.q /*7*/:
                return boz.c();
            case wi.m /*8*/:
                return blc.d();
            case wi.n /*9*/:
                return blc.f();
            case wi.dr /*10*/:
                return blc.b();
            case wi.dB /*11*/:
                return blc.b();
            case wi.dM /*12*/:
                return boz.b();
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
            view = this.a.getLayoutInflater().inflate(gwb.gh, viewGroup, false);
        }
        Bitmap bitmap = (Bitmap) getItem(i);
        if (bitmap != null) {
            TextView textView = (TextView) view.findViewById(ba.fD);
            TextView textView2 = (TextView) view.findViewById(ba.fE);
            TextView textView3 = (TextView) view.findViewById(ba.fF);
            TextView textView4 = (TextView) view.findViewById(ba.fG);
            ImageView imageView = (ImageView) view.findViewById(ba.M);
            switch (i) {
                case wi.w /*0*/:
                    textView.setText("DefaultCircleAvatar");
                    break;
                case wi.j /*1*/:
                    textView.setText("MediumDefaultAvatarWithSmsBadge");
                    break;
                case wi.l /*2*/:
                    textView.setText("MissedCallPstnAvatar");
                    break;
                case wi.z /*3*/:
                    textView.setText("RectBusinessAvatar");
                    break;
                case wi.h /*4*/:
                    textView.setText("RectLargeBusinessAvatar");
                    break;
                case wi.p /*5*/:
                    textView.setText("RectLargeDefaultAvatar");
                    break;
                case wi.s /*6*/:
                    textView.setText("RectLargePstnAvatar");
                    break;
                case wi.q /*7*/:
                    textView.setText("RectMediumDefaultAvatar");
                    break;
                case wi.m /*8*/:
                    textView.setText("RoundBusinessAvatar");
                    break;
                case wi.n /*9*/:
                    textView.setText("RoundLargeBusinessAvatar");
                    break;
                case wi.dr /*10*/:
                    textView.setText("RoundLargeDefaultAvatar");
                    break;
                case wi.dB /*11*/:
                    textView.setText("RoundLargePstnAvatar");
                    break;
                case wi.dM /*12*/:
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
