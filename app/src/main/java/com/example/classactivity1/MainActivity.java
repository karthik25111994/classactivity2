
}
    package com.example.a1893404.activity1;

        import android.content.DialogInterface;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etLast, etEmail, etPass;
    Button btnSubmit, btnExit;
    ImageView ivImage;
    private android.app.AlertDialog.Builder builder;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle", "OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle", "OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle", "OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle", "OnDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle", "OnStop");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Life Cycle", "OnPostResume");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        etName = findViewById(R.id.etName);
        etLast = findViewById(R.id.etLast);
        etPass = findViewById(R.id.etPass);
        etEmail = findViewById(R.id.etEmail);
        ivImage = findViewById(R.id.ivImage);
        btnExit = findViewById(R.id.btnExit);
        btnSubmit = findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Name", Toast.LENGTH_LONG).show();
                } else if (etLast.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Last Name", Toast.LENGTH_LONG).show();

                } else if (etPass.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Password", Toast.LENGTH_LONG).show();

                } else if (etEmail.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Email", Toast.LENGTH_LONG).show();

                } else {

                    String name = "Data save";


                    Snackbar snack = Snackbar.make(findViewById(R.id.conLayout), "Thank You",
                            Snackbar.LENGTH_LONG).setAction("Clear", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(), "Reset ", Toast.LENGTH_LONG).show();
                            etName.setText(" ");
                            etLast.setText(" ");
                            etEmail.setText(" ");
                            etPass.setText(" ");
                        }
                    });
                    snack.show();
                }
            }
        });
        Button btnlogout = (Button) findViewById(R.id.btnExit);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                moveTaskToBack(true);

            }
        });
    }
}
