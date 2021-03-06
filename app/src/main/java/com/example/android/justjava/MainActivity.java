package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**

 * This app displays an order form to order coffee.

 */

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    /**

     * This method is called when the plus button is clicked.

     */

    int quantity = 0;

    public void increment(View view) {
        quantity = quantity +1;
        display(quantity);

    }

    /**

     * This method is called when the minus button is clicked.

     */

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);

    }


    /**

     * This method is called when the order button is clicked.

     */

    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));
    }

    /**

     * Calculates the price of the order.
     * @return total price

     */

    private int calculatePrice() {
        return quantity * 5;
    }

    /**

     * Create summary of the order
     * @param price of the order
     * @return text summary

     */


    private String createOrderSummary(int price) {
        String priceMessage = "Name: Sylwia Stopyra"+ "\nQuantity: " + quantity + "\nTotal: $" + price + "\nThank you!";
        return priceMessage;
    }


    /**

     * This method displays the given quantity value on the screen.

     */

    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

        quantityTextView.setText("" + number);

    }


    /**

     * This method displays the given text on the screen.

     */

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}