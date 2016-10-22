import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

public final class jma implements OnItemClickListener {
    final /* synthetic */ LicenseMenuActivity a;

    public jma(LicenseMenuActivity licenseMenuActivity) {
        this.a = licenseMenuActivity;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jlx jlx = (jlx) adapterView.getItemAtPosition(i);
        Intent intent = new Intent(this.a, LicenseActivity.class);
        intent.putExtra("license", jlx);
        this.a.startActivity(intent);
    }
}
