package com.example.hrishikesh.vendingmachineapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText Name,Phone,Password,Password_A,Email;
    String name,phone,password,password_a,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public boolean ValidatePassword(){


        if(password_a.equals(password) && password.length()>=8) {


               return true;


        }


        return false;


    }

    public boolean ValidateEmail(){


        if(Email.length()>5){


            return true;

        }

        return false;


    }

    public boolean ValidateName(){


        if(Name.length()>2){


            return true;


        }

        return false;



    }

    public boolean ValidatePhone(){


        if(Phone.length()>4){


            return true;


        }

        return false;


    }

    public void Register(View view){


        Name=(EditText)findViewById(R.id.Reg_Name);
        name= Name.getText().toString();

        Phone=(EditText)findViewById(R.id.Reg_Phone);
        phone=Phone.getText().toString();

        Email=(EditText)findViewById(R.id.reg_email);
        email=Email.getText().toString();

        Password=(findViewById(R.id.Reg_Pass));
        password=Password.getText().toString();

        Password_A=(findViewById(R.id.Reg_PassA));
        password_a=Password_A.getText().toString();

        Intent intent = new Intent(this, CreditCardReg.class);

        if(ValidatePassword()&&ValidateName()&&ValidatePhone()&&ValidateEmail())

            startActivity(intent);


        }


    }


