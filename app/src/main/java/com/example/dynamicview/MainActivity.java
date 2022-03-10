package com.example.dynamicview;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    EditText edt1, edt2, edt3;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    ProgressBar progressBar;
    Button button;
    TextView textView, textView2;
    private static final int btn = 700;
    private static final int edit1 = 1;
    private static final int edit2 = 2;
    private static final int edit3 = 3;
    private static final int text1 = 10;
    private static final int radio = 20;
    private static final int check = 30;
    private static final int check2 = 40;
    private static final int check3 = 50;
    private static final int text2 = 60;
    private static final int progress = 70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.rLayout);
//        scrollView = new ScrollView(this);
//        scrollView.addView(relativeLayout);

        // Adding TextView

        RelativeLayout.LayoutParams textParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(this);
        textView.setId(text1);
        textView.setLayoutParams(textParam);
        relativeLayout.addView(textView);
        textParam.topMargin = 50;
        textView.setText("Dynamic XML Generation");
        textView.setTextColor(Color.parseColor("#89253e"));
        textView.setTextSize(30);
        textParam.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);


        // Adding Username Edittext
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText edt1 = new EditText(this);
        edt1.setId(edit1);
        edt1.setLayoutParams(params);
        relativeLayout.addView(edt1);
        params.topMargin = 60;
        params.width = 520;
        params.height = 100;
        edt1.setHint("Username");
        params.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        params.addRule(RelativeLayout.BELOW, text1);
        Drawable inputDrawable = getDrawable(R.drawable.input_design);
        Drawable personIcon = getDrawable(R.drawable.ic_baseline_person_24);
        edt1.setBackground(inputDrawable);
        edt1.setPadding(20 ,0, 0 , 0);
        edt1.setCompoundDrawablesWithIntrinsicBounds(personIcon, null, null, null);
        edt1.setCompoundDrawablePadding(20);
        edt1.setInputType(InputType.TYPE_CLASS_TEXT);

        // Adding Email Edittext
        RelativeLayout.LayoutParams emailParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText edt2 = new EditText(this);
        edt2.setId(edit2);
        edt2.setLayoutParams(emailParam);
        relativeLayout.addView(edt2);
        emailParam.topMargin = 40;
        emailParam.width = 520;
        emailParam.height = 100;
        edt2.setHint("Email");
        emailParam.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        Drawable emailIcon = getDrawable(R.drawable.mail);
        edt2.setBackground(inputDrawable);
        edt2.setPadding(20 ,0, 0 , 0);
        edt2.setCompoundDrawablesWithIntrinsicBounds(emailIcon, null, null, null);
        edt2.setCompoundDrawablePadding(20);
        emailParam.addRule(RelativeLayout.BELOW, edit1);
        edt2.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);

        // Adding Password Edittext
        RelativeLayout.LayoutParams passwordParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText edt3 = new EditText(this);
        edt3.setId(edit3);
        edt3.setLayoutParams(passwordParam);
        relativeLayout.addView(edt3);
        passwordParam.topMargin = 40;
        passwordParam.width = 520;
        passwordParam.height = 100;
        edt3.setHint("Password");
        passwordParam.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        passwordParam.addRule(RelativeLayout.BELOW, edit2);
        Drawable passwordIcon = getDrawable(R.drawable.key);
        edt3.setBackground(inputDrawable);
        edt3.setPadding(20 ,0, 0 , 0);
        edt3.setCompoundDrawablesWithIntrinsicBounds(passwordIcon, null, null, null);
        edt3.setCompoundDrawablePadding(20);
        edt3.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        edt3.setTransformationMethod(PasswordTransformationMethod.getInstance());


        //Adding Radio Button

        RelativeLayout.LayoutParams radioParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        RadioGroup radioGroup =  new RadioGroup(this);
        radioGroup.setId(radio);
        RadioButton radioButton1 = new RadioButton(this);
        RadioButton radioButton2 = new RadioButton(this);

        radioButton1.setText("Male");
        radioButton2.setText("Female");

        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);
        radioGroup.setOrientation(RadioGroup.HORIZONTAL);
       radioGroup.setLayoutParams(radioParam);
        relativeLayout.addView(radioGroup);
        radioParam.topMargin = 50;
        radioParam.leftMargin = 100;
        radioParam.addRule(RelativeLayout.BELOW, edit3);
        radioParam.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        radioButton1.setTextColor(Color.parseColor("#89253e"));
        radioButton2.setTextColor(Color.parseColor("#89253e"));
        radioButton1.setTextSize(16);
        radioButton2.setTextSize(16);
        radioButton1.setPadding(10, 0, 10, 0);
        radioButton2.setPadding(10, 0, 0, 0);



        // Adding Textview
        RelativeLayout.LayoutParams textParam2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView textView2 = new TextView(this);
        textView2.setId(text2);
        textView2.setLayoutParams(textParam2);
        relativeLayout.addView(textView2);
        textParam2.topMargin = 40;
        textParam2.leftMargin = 105;
        textView2.setText("Select your preferred technology");
        textView2.setTextColor(Color.parseColor("#89253e"));
        textView2.setTextSize(17);
        textParam2.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        textParam2.addRule(RelativeLayout.BELOW, radio);


        // Adding Checkbox 1
        RelativeLayout.LayoutParams checkParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        CheckBox checkBox1 = new CheckBox(this);
        checkBox1.setText("Android Development");
        checkBox1.setId(check);
        checkBox1.setLayoutParams(checkParam);
        relativeLayout.addView(checkBox1);
        checkParam.topMargin = 15;
        checkParam.leftMargin = 100;
        checkBox1.setTextSize(16);
        checkBox1.setTextColor(Color.parseColor("#89253e"));
        checkParam.addRule(RelativeLayout.BELOW, text2);
        checkParam.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);

        //Adding CheckBox 2

        RelativeLayout.LayoutParams checkParam2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        CheckBox checkBox2 = new CheckBox(this);
        checkBox2.setText("Web Development");
        checkBox2.setId(check2);
        checkBox2.setLayoutParams(checkParam2);
        relativeLayout.addView(checkBox2);
        checkParam2.topMargin = 12;
        checkParam2.leftMargin = 100;
        checkBox2.setTextSize(16);
        checkBox2.setTextColor(Color.parseColor("#89253e"));
        checkParam2.addRule(RelativeLayout.BELOW, check);
        checkParam2.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);

        //Adding CheckBox 3

        RelativeLayout.LayoutParams checkParam3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        CheckBox checkBox3 = new CheckBox(this);
        checkBox3.setText("Data Science");
        checkBox3.setId(check3);
        checkBox3.setLayoutParams(checkParam3);
        relativeLayout.addView(checkBox3);
        checkParam3.topMargin = 12;
        checkParam3.leftMargin = 100;
        checkBox3.setTextSize(16);
        checkBox3.setTextColor(Color.parseColor("#89253e"));
        checkParam3.addRule(RelativeLayout.BELOW, check2);
        checkParam3.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);


        // Adding ProgressBar

        RelativeLayout.LayoutParams progressParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        ProgressBar progressBar = new ProgressBar(this);
        progressBar.setId(progress);
        progressBar.setLayoutParams(progressParam);
        relativeLayout.addView(progressBar);
        progressParam.topMargin = 40;
        progressParam.addRule(RelativeLayout.BELOW, check3);
        progressParam.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        progressBar.setVisibility(View.GONE);


        // Adding Button
        RelativeLayout.LayoutParams btnParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button button = new Button(this);
        button.setText("Click Me");
        button.setId(btn);
        button.setLayoutParams(btnParam);
        relativeLayout.addView(button);
        btnParam.width = 520;
        btnParam.height = 100;
        btnParam.topMargin = 40;
        btnParam.addRule(RelativeLayout.BELOW, progress);
        btnParam.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        Drawable btnDesign = getDrawable(R.drawable.btn_design);
        button.setBackground(btnDesign);
        button.setTextColor(Color.WHITE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.VISIBLE);
            }
        });
    }
}