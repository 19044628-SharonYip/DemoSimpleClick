package sg.edu.rp.c346.id19044628.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView output;
    EditText input;
    ToggleButton btnToggle;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        input=findViewById(R.id.input);
        output=findViewById(R.id.output);
        btnToggle=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.radioGrpGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc=input.getText().toString();
                //String stringResponse = input.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                /*if(abc.isEmpty())
                {
                    output.setText("Nothing has been entered!");
                    Toast.makeText(MainActivity.this, "Please input something!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    output.setText(abc);
                }*/
                //output.setText(input.getText().toString());

                if (checkedRadioId == R.id.radioButtonMale)
                {
                    abc="He say "+abc;

                }
                else
                {
                    abc="She say "+abc;

                }
                output.setText(abc);
            }
        });

        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnToggle.isChecked()==true)
                {
                    input.setEnabled(true);
                   input.setBackgroundColor(Color.TRANSPARENT);
                }
                else
                {
                    input.setEnabled(false);
                    input.setBackgroundColor(Color.GRAY);
                }
            }
        });




    }
}