package io.github.gageallencarpenter.view.label;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class NumericServiceCountLabel extends JLabel {

    private AtomicInteger count = new AtomicInteger(0);

    /**
     * Create a new NumericServiceCountLabel.
     */
    public NumericServiceCountLabel() {
        setText(String.valueOf(count));
    }

    /**
     * Increment the count by one.
     */
    public void increment(){
        count.incrementAndGet();
        setText(count.toString());
    }

    /**
     * Decrement the count by one.
     */
    public void decrement(){
        count.decrementAndGet();
        setText(count.toString());
    }

    /**
     * Resets the count to 0 and sets the text of the button to the new count
     */
    public void reset(){
        count.set(0);
        setText(count.toString());
    }

    /**
     * Get the current count.
     * @return The current count.
     */
    public AtomicInteger getCount(){
        return count;
    }

    /**
     * Set the current count.
     * @param count The new count.
     */
    public void setCount(AtomicInteger count){
        this.count = count;
        setText(count.toString());
    }
}
