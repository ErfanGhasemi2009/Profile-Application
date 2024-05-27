package ir.alaroze.applicationprofile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String fullnameText = getIntent().getStringExtra(MainActivity.EXTRA_KEY_FULLNAME);
        EditText etFullname = findViewById(R.id.et_edit_fullname);
        etFullname.setText(fullnameText);
        Button btnDoneBlue = findViewById(R.id.btn_edit_done);

        btnDoneBlue.setOnClickListener(v -> {
            Intent intent = new Intent();
            if (etFullname != null){
                intent.putExtra(MainActivity.EXTRA_KEY_FULLNAME, etFullname.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }else {
                Toast.makeText(this, "edit text is empty", Toast.LENGTH_SHORT).show();
            }
        });
    }
}