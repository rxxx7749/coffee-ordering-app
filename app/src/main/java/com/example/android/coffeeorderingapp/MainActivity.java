package com.example.android.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Global variable for quantity
    int quantity = 2;
    final int PRICEFORONE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
            quantity++;
            displayNumber(quantity);

    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity--;
        if(quantity >= 0) {
            displayNumber(quantity);
        }else{
            quantity = 0;
            displayNumber(quantity);
        }
    }

    /**
     * This method is called when the order button is clicked.
     *
     * @param view The View whose onclick attribute has the value "submitOrder"
     */
    public void submitOrder(View view) {
       displayMessage("Total: $" + quantity*PRICEFORONE + "\nThank you!");
    }

    /**
     * Display the given number in quantity_text_view.
     *
     * @param number The number to be displayed in quantity_text_view
     */
    private void displayNumber(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));
    }

    /**
     * Display the given text in price_text_view.
     *
     * @param message The message to be displayed in price_text_view
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}