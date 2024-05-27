package ir.alaroze.applicationprofile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnEditProfile = findViewById(R.id.btn_main_editProfile);
        Button ViewWebsite = findViewById(R.id.btn_main_viewWebsite);
        TextView tvFullname = findViewById(R.id.tv_main_fullname);

        CheckBox cbAndroidDevelopment = findViewById(R.id.cb_main_androidDevelopment);
        CheckBox cbUiDesign = findViewById(R.id.cb_main_uiDesign);
        CheckBox cbDeepLearning = findViewById(R.id.cb_main_deepLearning);

        RadioGroup radioGroup = findViewById(R.id.radioGroup_main_city);

        Button btnSaveInformation = findViewById(R.id.btn_main_saveInformation);

        cbAndroidDevelopment.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                Toast.makeText(this, "android Development is checked", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "android Development isn't checked", Toast.LENGTH_SHORT).show();

            }
        });
        cbUiDesign.setOnCheckedChangeListener(((buttonView, isChecked) ->{
            if (isChecked){
                Toast.makeText(this, "ui design is checked", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "ui design isn't checked", Toast.LENGTH_SHORT).show();

            }
        }));

        cbDeepLearning.setOnCheckedChangeListener(((buttonView, isChecked) ->{
            if (isChecked){
                Toast.makeText(this, "deep learning is checked", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "deep learning isn't checked", Toast.LENGTH_SHORT).show();

            }
        }));


        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioBtn_main_tehran)
                Toast.makeText(this, "tehran is checked.", Toast.LENGTH_SHORT).show();
            else if (checkedId == R.id.radioBtn_main_gilan)
                Toast.makeText(this, "gilan is checked.", Toast.LENGTH_SHORT).show();
            else if (checkedId == R.id.radioBtn_main_alborz)
                Toast.makeText(this, "alborz is checked.", Toast.LENGTH_SHORT).show();
        });

        btnSaveInformation.setOnClickListener(v -> {
            Toast.makeText(this, "user information are saved.", Toast.LENGTH_SHORT).show();

        });
    }
}