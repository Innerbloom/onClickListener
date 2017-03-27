package house.naturalaquarium;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardViewActivity extends Activity {

    TextView fishName;
    TextView fishAbout;
    ImageView fishPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cardview_activity);
        fishName = (TextView)findViewById(R.id.fish_name);
        fishAbout = (TextView)findViewById(R.id.fish_about);
        fishPhoto = (ImageView)findViewById(R.id.fish_photo);

/*        personName.setText("Апистограмма Рамирези");
        personAge.setText("Цихлиды");
        personPhoto.setImageResource(R.drawable.f000_1);*/
    }
}
